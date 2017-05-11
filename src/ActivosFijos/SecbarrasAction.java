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

public class SecbarrasAction extends Action 
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
    SecbarrasForm finform = (SecbarrasForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    finform.setBar_codreg(fInicio.getCod_reg());
    finform.setDescripcion_codreg(fInicio.getRegional());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;
    ArrayList aCalm3;    
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarSecbarras(1,fInicio.getCod_reg());              
      request.setAttribute("SecbarrasLista", aCalm);
      aCalm2 = bdc.listarRegionales(0);
      request.setAttribute("RegionalesLista", aCalm2);
      aCalm3 = bdc.listarRubros(0);
      request.setAttribute("RubrosLista", aCalm3);
      ArrayList datos = (ArrayList) request.getAttribute("SecbarrasLista"); 
      if (finform.getOperacion()==1)
      {   
          SecBarrasDetalleForm d = new SecBarrasDetalleForm();
          d = (SecBarrasDetalleForm) datos.get(it);  
          finform.setBar_rubro(d.getRubro());       
          finform.setBar_codreg(d.getCodreg());
          finform.setBar_numero(d.getNumero());
          finform.setDescripcion_codreg(d.getCodreg_descripcion());
          finform.setDescripcion_codrub(d.getCodrub_descripcion());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertarsecbarras(finform.getBar_rubro(),finform.getBar_codreg(),finform.getBar_numero(),fInicio.getTxt_usu(),finform.getOpcion());
                finform.setBar_rubro("");
                finform.setBar_codreg("");
                finform.setBar_numero(0);
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
                finform.setBar_rubro("");
                finform.setBar_codreg("");
                finform.setBar_numero(0);    
             }
             try {
                aCalm = bdc.listarSecbarras(1,fInicio.getCod_reg());              
                request.setAttribute("SecbarrasLista", aCalm);
                aCalm2 = bdc.listarRegionales(0);
                request.setAttribute("RegionalesLista", aCalm2);
                aCalm3 = bdc.listarRubros(0);
                request.setAttribute("RubrosLista", aCalm3);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Secbarras"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Secbarras"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}