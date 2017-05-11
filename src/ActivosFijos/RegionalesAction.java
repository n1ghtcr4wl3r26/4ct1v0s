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

public class RegionalesAction extends Action 
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
    RegionalesForm finform = (RegionalesForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm1;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarRegionales(1);              
      request.setAttribute("RegionalesLista", aCalm);
      ArrayList datos = (ArrayList) request.getAttribute("RegionalesLista"); 
      if (aCalm.size()>0) {
         RegionalesDetalleForm d1 = new RegionalesDetalleForm();
         d1 = (RegionalesDetalleForm) datos.get(it);  
         aCalm1 = bdc.listarFuncionarios4(0,d1.getCodigo());
         request.setAttribute("FuncionariosLista", aCalm1);
      }
      if (finform.getOperacion()==1)
      {   
          RegionalesDetalleForm d = new RegionalesDetalleForm();
          d = (RegionalesDetalleForm) datos.get(it);  
          finform.setReg_codigo(d.getCodigo());       
          finform.setReg_descripcion(d.getDescripcion());
          finform.setReg_codfun(d.getCodfun());
          finform.setDescripcion_codfun(d.getCodfun_descripcion());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertarregionales(finform.getReg_codigo(),finform.getReg_descripcion(),finform.getReg_codfun(),fInicio.getTxt_usu(),finform.getOpcion());
                finform.setReg_codigo("");
                finform.setReg_descripcion("");
                finform.setReg_codfun("");
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
                finform.setReg_codigo("");
                finform.setReg_descripcion("");
                finform.setReg_codfun("");               
             }
             try {
                aCalm = bdc.listarRegionales(1);              
                request.setAttribute("RegionalesLista", aCalm);
                aCalm1 = bdc.listarFuncionarios4(0,finform.getReg_codigo());              
                request.setAttribute("FuncionariosLista", aCalm1);                
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Regionales"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Regionales"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}