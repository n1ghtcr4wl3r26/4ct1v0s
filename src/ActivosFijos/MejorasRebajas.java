package ActivosFijos;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import java.util.ArrayList;

public class MejorasRebajas extends Action 
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
    MejorasRebajasForm opform = (MejorasRebajasForm) form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    opform.setMre_codreg(fInicio.getCod_reg());
    opform.setMre_regdescripcion(fInicio.getRegional());   
    BDConection bdc = new BDConection();
    try {
       MesAnioDetalleForm mesanio = bdc.listarMesAnio();
       opform.setMes(mesanio.getMes());
       opform.setAnio(mesanio.getAnio());
       opform.setOperacion(0);
       ArrayList aCalm = bdc.listarRubros(0);
       request.setAttribute("RubrosLista", aCalm);
       ArrayList aCalm2 = bdc.listarRegionales(0);
       request.setAttribute("RegionalesLista", aCalm2);
       ArrayList aCalm3 = bdc.listarGrupos(0,opform.getMre_codrub());
       request.setAttribute("GruposLista", aCalm3);
       
       if (mapping.getParameter().equals("ins")) 
       {
          opform.setOpcion(1);
          opform.setOperacion(2);
       }
       if (mapping.getParameter().equals("mod")) 
       {
          opform.setOpcion(2);
          opform.setOperacion(2);
       }
       if (mapping.getParameter().equals("eli")) 
       {
          opform.setOpcion(3);   
          opform.setOperacion(2);
       }
    }
    catch (Exception e) {
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar MejorasRebajas"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }  
    return mapping.findForward("mejorasrebajas");    
  }
}