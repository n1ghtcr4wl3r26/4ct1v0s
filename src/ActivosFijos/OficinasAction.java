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

public class OficinasAction extends Action 
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
    OficinasForm finform = (OficinasForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    finform.setOfi_codreg(fInicio.getCod_reg());
    finform.setDescripcion_codreg(fInicio.getRegional());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;
    ArrayList aCalm3;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarOficinas(1,fInicio.getCod_reg());              
      request.setAttribute("OficinasLista", aCalm);
      aCalm2 = bdc.listarRegionales(0);              
      request.setAttribute("RegionalesLista", aCalm2);
      aCalm3 = bdc.listarUbicaciones(0,fInicio.getCod_reg());
      request.setAttribute("UbicacionesLista", aCalm3);
      ArrayList datos = (ArrayList) request.getAttribute("OficinasLista"); 
      if (finform.getOperacion()==1)
      {   
          OficinasDetalleForm d = new OficinasDetalleForm();
          d = (OficinasDetalleForm) datos.get(it);  
          finform.setOfi_codigo(d.getCodigo());       
          finform.setOfi_descripcion(d.getDescripcion());
          finform.setOfi_codreg(d.getCodreg());
          finform.setOfi_codubi(d.getCodubi());
          finform.setDescripcion_codubi(d.getDescripcion_codubi());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertaroficinas(finform.getOfi_codigo(),finform.getOfi_descripcion(),finform.getOfi_codreg(),finform.getOfi_codubi(),fInicio.getTxt_usu(),finform.getOpcion());
                finform.setOfi_codigo("");
                finform.setOfi_descripcion("");
                finform.setOfi_codreg("");
                finform.setOfi_codubi("");
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
                finform.setOfi_codigo("");
                finform.setOfi_descripcion("");
                finform.setOfi_codreg("");               
                finform.setOfi_codubi("");
             }
             try {
                aCalm = bdc.listarOficinas(1,fInicio.getCod_reg());              
                request.setAttribute("OficinasLista", aCalm);
                aCalm2 = bdc.listarRegionales(0);
                request.setAttribute("RegionalesLista", aCalm2);
                aCalm3 = bdc.listarUbicaciones(0,fInicio.getCod_reg());
                request.setAttribute("UbicacionesLista", aCalm3);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Oficinas"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Oficinass"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}