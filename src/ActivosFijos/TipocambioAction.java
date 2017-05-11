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

public class TipocambioAction extends Action 
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
    TipocambioForm finform = (TipocambioForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarTipocambio(1,finform.getOpcion());
      request.setAttribute("TipocambioLista", aCalm);
      ArrayList datos = (ArrayList) request.getAttribute("TipocambioLista"); 
      if (finform.getOperacion()==1)
      {   
          TipoCambioDetalleForm d = new TipoCambioDetalleForm();
          d = (TipoCambioDetalleForm) datos.get(it);  
          finform.setTca_fecha(d.getFecha());       
          finform.setTca_tipcam(d.getTipcam());
          finform.setTca_tipufv(d.getTipufv());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertartipocambio(finform.getTca_fecha(),finform.getTca_tipcam(),finform.getTca_tipufv(),fInicio.getTxt_usu(),finform.getOpcion());
                finform.setTca_fecha("");       
                finform.setTca_tipcam(0);
                finform.setTca_tipufv(0);
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
                finform.setTca_fecha("");       
                finform.setTca_tipcam(0);
                finform.setTca_tipufv(0);               
             }
             try {
                aCalm = bdc.listarTipocambio(1,finform.getOpcion());              
                request.setAttribute("TipocambioLista", aCalm);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Tipo de CAmbio"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Tipo de Cambio"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}