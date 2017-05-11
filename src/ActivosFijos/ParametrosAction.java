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

public class ParametrosAction extends Action 
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
    ParametrosForm finform = (ParametrosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarParametros(1);              
      request.setAttribute("ParametrosLista", aCalm);
      ArrayList datos = (ArrayList) request.getAttribute("ParametrosLista"); 
      if (finform.getOperacion()==1)
      {   
          ParametrosDetalleForm d = new ParametrosDetalleForm();
          d = (ParametrosDetalleForm) datos.get(it);  
          finform.setCte_codinstitucion(d.getcodinstitucion());       
          finform.setCte_codrubaccesorios(d.getcodrubaccesorios());
          finform.setCte_codrubmejoras(d.getcodrubmejoras());
          finform.setCte_codrubrebajas(d.getcodrubrebajas());
          finform.setCte_codrub1(d.getcodrub1());
          finform.setCte_codrub2(d.getcodrub2());
          finform.setCte_codrub3(d.getcodrub3());
          finform.setCte_codrub4(d.getcodrub4());
          finform.setCte_codrub5(d.getcodrub5());
          finform.setCte_codrub6(d.getcodrub6());
          finform.setCte_tipdocentrega(d.getTipdocentrega());
          finform.setCte_tipdocdevolucion(d.getTipdocdevolucion());
          finform.setCte_tipdoctransferencia(d.getTipdoctransferencia());
          finform.setCte_tipdocbaja(d.getTipdocbaja());
          finform.setCte_tipdoctraregionales(d.getTipdoctraregionales());
          finform.setCte_gestion(d.getGestion());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertarParametros(
                finform.getCte_codinstitucion(),
                finform.getCte_codrubaccesorios(),
                finform.getCte_codrubmejoras(),
                finform.getCte_codrubrebajas(),
                finform.getCte_codrub1(),
                finform.getCte_codrub2(),
                finform.getCte_codrub3(),
                finform.getCte_codrub4(),
                finform.getCte_codrub5(),
                finform.getCte_codrub6(),
                finform.getCte_tipdocentrega(),
                finform.getCte_tipdocdevolucion(),
                finform.getCte_tipdoctransferencia(),
                finform.getCte_tipdocbaja(),
                finform.getCte_tipdoctraregionales(),
                finform.getCte_gestion(),
                finform.getOpcion());
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
                finform.setCte_codinstitucion("");
                finform.setCte_codrubaccesorios("");
                finform.setCte_codrubmejoras("");
                finform.setCte_codrubrebajas("");
                finform.setCte_codrub1("");
                finform.setCte_codrub2("");
                finform.setCte_codrub3("");
                finform.setCte_codrub4("");
                finform.setCte_codrub5("");
                finform.setCte_codrub6("");
                finform.setCte_tipdocentrega("");
                finform.setCte_tipdocdevolucion("");
                finform.setCte_tipdoctransferencia("");
                finform.setCte_tipdocbaja("");
                finform.setCte_tipdoctraregionales("");
                finform.setCte_gestion("");
             }
             try {
                aCalm = bdc.listarParametros(1);              
                request.setAttribute("ParametrosLista", aCalm);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Parametros"));
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