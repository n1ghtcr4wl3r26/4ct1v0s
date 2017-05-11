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

public class UbicacionesAction extends Action 
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
    UbicacionesForm finform = (UbicacionesForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    finform.setUbi_codreg(fInicio.getCod_reg());
    finform.setDescripcion_codreg(fInicio.getRegional());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarUbicaciones(1,fInicio.getCod_reg());
      request.setAttribute("UbicacionesLista", aCalm);
      aCalm2 = bdc.listarRegionales(0);
      request.setAttribute("RegionalesLista", aCalm2);
      ArrayList datos = (ArrayList) request.getAttribute("UbicacionesLista"); 
      if (finform.getOperacion()==1)
      {   
          UbicacionesDetalleForm d = new UbicacionesDetalleForm();
          d = (UbicacionesDetalleForm) datos.get(it);  
          finform.setUbi_codigo(d.getCodigo());       
          finform.setUbi_descripcion(d.getDescripcion());
          finform.setUbi_direccion(d.getDireccion());
          finform.setUbi_codreg(d.getCodreg());
          finform.setDescripcion_codreg(d.getDescripcion_codreg());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertarubicaciones(finform.getUbi_codigo(),finform.getUbi_descripcion(),finform.getUbi_direccion(),finform.getUbi_codreg(),fInicio.getTxt_usu(),finform.getOpcion());
                finform.setUbi_codigo("");
                finform.setUbi_descripcion("");
                finform.setUbi_direccion("");
                finform.setUbi_codreg("");
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
                finform.setUbi_codigo("");
                finform.setUbi_descripcion("");
                finform.setUbi_direccion("");
                finform.setUbi_codreg("");               
             }
             try {
                aCalm = bdc.listarUbicaciones(1,fInicio.getCod_reg());
                request.setAttribute("UbicacionesLista", aCalm);
                aCalm2 = bdc.listarRegionales(0);
                request.setAttribute("RegionalesLista", aCalm2);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Ubicaciones"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Ubicaciones"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}