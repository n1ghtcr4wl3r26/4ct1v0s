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

public class GruposAction extends Action 
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
    GruposForm finform = (GruposForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm1;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarGrupos(1,finform.getGrp_codigo());
      request.setAttribute("GruposLista", aCalm);
      aCalm1 = bdc.listarRubros(0);
      request.setAttribute("RubrosLista", aCalm1);
      ArrayList datos = (ArrayList) request.getAttribute("GruposLista"); 
      if (finform.getOperacion()==1)
      {   
          GruposDetalleForm d = new GruposDetalleForm();
          d = (GruposDetalleForm) datos.get(it);  
          finform.setGrp_codigo(d.getCodigo());       
          finform.setGrp_descripcion(d.getDescripcion());
          finform.setGrp_codrub(d.getCodrub());
          finform.setDescripcion_codrub(d.getCodrub_descripcion());
          finform.setGrp_estado(d.getEstado());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertargrupos(finform.getGrp_codigo(),finform.getGrp_descripcion(),finform.getGrp_codrub(),fInicio.getTxt_usu(),finform.getGrp_estado(),finform.getOpcion());
                finform.setGrp_codigo("");
                finform.setGrp_descripcion("");
                finform.setGrp_codrub("");
                finform.setGrp_estado("");
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
                finform.setGrp_codigo("");
                finform.setGrp_descripcion("");
                finform.setGrp_codrub("");               
                finform.setGrp_estado("");
             }
             try {
                aCalm = bdc.listarGrupos(1,finform.getGrp_codigo());              
                request.setAttribute("GruposLista", aCalm);
                aCalm1 = bdc.listarRubros(1);              
                request.setAttribute("RubrosLista", aCalm1);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Grupos"));
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