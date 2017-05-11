package ActivosFijos;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class UsuariosAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    ActionMessages error = new ActionMessages();
    UsuariosForm finform = (UsuariosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm1;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarUsuarios(1);              
      request.setAttribute("UsuariosLista", aCalm);
      ArrayList datos = (ArrayList) request.getAttribute("UsuariosLista"); 
      if (aCalm.size()>0) {
         UsuariosDetalleForm d1 = new UsuariosDetalleForm();
         d1 = (UsuariosDetalleForm) datos.get(it);  
         aCalm1 = bdc.listarFuncionarios(0,fInicio.getCod_reg());
         request.setAttribute("FuncionariosLista", aCalm1);
      }
      if (finform.getOperacion()==1)
      {   
          UsuariosDetalleForm d = new UsuariosDetalleForm();
          d = (UsuariosDetalleForm) datos.get(it);  
          finform.setUsu_codigo(d.getCodigo());       
          finform.setUsu_carnet(d.getCarnet());
          finform.setUsu_codfun(d.getCodfun());
          finform.setDsc_funcionario(d.getDesfuncionario());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertarusuarios(finform.getUsu_codigo(),finform.getUsu_carnet(),finform.getUsu_codfun(),fInicio.getTxt_usu(),finform.getOpcion());
                finform.setUsu_codigo("");
                finform.setUsu_carnet("");
                finform.setUsu_codfun("");
                if (!msgsql.equals("0")) {
                   error.add("error", new ActionMessage("error", msgsql));
                   saveErrors( request, error );
                }
                else  {
                   error.add("error", new ActionMessage("error", "La transacción fue realizada correctamente"));
                   saveErrors( request, error );                  
                }
             }
             else
             {
                finform.setUsu_codigo("");
                finform.setUsu_carnet("");
                finform.setUsu_codfun("");                
             }
             try {
                aCalm = bdc.listarUsuarios(1);              
                request.setAttribute("UsuariosLista", aCalm);
                aCalm1 = bdc.listarFuncionarios(0,fInicio.getCod_reg());              
                request.setAttribute("FuncionariosLista", aCalm1);                
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Usuarios"));
                error.add("error", new ActionMessage("errordb", e.toString() ));
                e.printStackTrace();
                saveErrors( request, error );
             }
          }
          catch (Exception e) {
             error.add("error", new ActionMessage("errordb", "No se pudo realizar la transaccion."));
             error.add("error", new ActionMessage("errordb", e.toString() ));
             e.printStackTrace();
             saveErrors( request, error );
          }
     } 
    }
    catch (Exception e) {
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Usuarios"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}