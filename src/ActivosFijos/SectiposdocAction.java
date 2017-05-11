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

public class SectiposdocAction extends Action 
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
    SectiposdocForm finform = (SectiposdocForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    finform.setStd_codreg(fInicio.getCod_reg());
    finform.setDescripcion_codreg(fInicio.getRegional());
    finform.setStd_codfin(fInicio.getCod_fin());
    finform.setDescripcion_codfin(fInicio.getFinanciador());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;
    ArrayList aCalm3;
    ArrayList aCalm4;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarSectiposdoc(1,fInicio.getCod_fin(),fInicio.getCod_reg());
      request.setAttribute("SectiposdocLista", aCalm);
      aCalm2 = bdc.listarRegionales(0);              
      request.setAttribute("RegionalescLista", aCalm2);
      aCalm3 = bdc.listarTiposdoc(0,0,fInicio.getCod_fin(),fInicio.getCod_reg());
      request.setAttribute("TiposdocLista", aCalm3);
      aCalm4 = bdc.listarFinanciadores(0);              
      request.setAttribute("FinanciadorescLista", aCalm4);
      ArrayList datos = (ArrayList) request.getAttribute("SectiposdocLista"); 
      if (finform.getOperacion()==1)
      {   
          SecTiposDocDetalleForm d = new SecTiposDocDetalleForm();
          d = (SecTiposDocDetalleForm) datos.get(it);  
          finform.setStd_codreg(d.getCodreg());       
          finform.setStd_codfin(d.getCodfin());       
          finform.setStd_tipdoc(d.getTipdoc());
          finform.setStd_numero(d.getNumero());
          finform.setStd_gestion(d.getGestion());
          finform.setDescripcion_codreg(d.getCodreg_descripcion());
          finform.setDescripcion_codfin(d.getCodfin_descripcion());
          finform.setDescripcion_tipdoc(d.getTipdoc_descripcion());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertarsectiposdoc(finform.getStd_codfin(),finform.getStd_codreg(),finform.getStd_tipdoc(),finform.getStd_numero(),fInicio.getTxt_usu(),finform.getOpcion());
                finform.setStd_codfin("");
                finform.setStd_codreg("");
                finform.setStd_tipdoc("");
                finform.setStd_numero(0);
                finform.setDescripcion_codfin("");
                finform.setDescripcion_codreg("");
                finform.setDescripcion_tipdoc("");
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
                finform.setStd_codfin("");
                finform.setStd_codreg("");
                finform.setStd_tipdoc("");
                finform.setStd_numero(0);
                finform.setDescripcion_codfin("");
                finform.setDescripcion_codreg("");
                finform.setDescripcion_tipdoc("");
             }
             try {
                aCalm = bdc.listarSectiposdoc(1,fInicio.getCod_fin(),fInicio.getCod_reg());              
                request.setAttribute("SectiposdocLista", aCalm);
                aCalm2 = bdc.listarRegionales(0);              
                request.setAttribute("RegionalescLista", aCalm2);                
                aCalm3 = bdc.listarTiposdoc(0,0,fInicio.getCod_fin(),fInicio.getCod_reg());
                request.setAttribute("TiposdocLista", aCalm3);
                aCalm4 = bdc.listarFinanciadores(0);              
                request.setAttribute("FinanciadorescLista", aCalm4);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Sectiposdoc"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar sectiposdoc"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}