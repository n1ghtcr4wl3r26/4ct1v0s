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

public class ProyectosAction extends Action 
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
    ProyectosForm finform = (ProyectosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarProyectos2(1);              
      request.setAttribute("ProyectosLista", aCalm);
      ArrayList datos = (ArrayList) request.getAttribute("ProyectosLista"); 
      if (finform.getOperacion()==1)
      {   
          ProyectosDetalleForm d = new ProyectosDetalleForm();
          d = (ProyectosDetalleForm) datos.get(it);  
          finform.setPry_codigo(d.getCodigo());       
          finform.setPry_descripcion(d.getDescripcion());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
               String msgsql=null;
               msgsql = bdc.insertarproyectos(finform.getPry_codigo(),finform.getPry_descripcion(),finform.getPry_codfin(),fInicio.getTxt_usu(),finform.getOpcion());
               finform.setPry_codigo("");
               finform.setPry_descripcion("");
               finform.setPry_codfin("");
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
               finform.setPry_codigo("");
               finform.setPry_descripcion("");
               finform.setPry_codfin("");               
             }
             try {
                aCalm = bdc.listarProyectos2(1);
                request.setAttribute("ProyectosLista", aCalm);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Proyectos"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Financiadores"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}