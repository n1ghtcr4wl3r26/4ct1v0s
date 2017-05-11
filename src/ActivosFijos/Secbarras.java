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

public class Secbarras extends Action 
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
    SecbarrasForm opform = (SecbarrasForm) form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute( "InicioForm" );
    opform.setBar_codreg(fInicio.getCod_reg());
    opform.setDescripcion_codreg(fInicio.getRegional());
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    try {
       BDConection bdc = new BDConection();
       ArrayList aCalm = bdc.listarSecbarras(1,fInicio.getCod_reg());
       request.setAttribute("SecbarrasLista", aCalm);
       ArrayList aCalm2 = bdc.listarRegionales(0);
       request.setAttribute("RegionalesLista", aCalm2);
       ArrayList aCalm3 = bdc.listarRubros(0);
       request.setAttribute("RubrosLista", aCalm3);
       opform.setOperacion(0);
       if (mapping.getParameter().equals("rpt")) 
          opform.setOpcion(5);
       if (mapping.getParameter().equals("rep")) 
          opform.setOpcion(4);
       if (mapping.getParameter().equals("ins")) 
       {
          opform.setOpcion(1);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("mod")) 
          opform.setOpcion(2);
       if (mapping.getParameter().equals("eli")) 
          opform.setOpcion(3);          
    }
    catch (Exception e) {
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar Secbarras"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }
    }
    return mapping.findForward("secbarras");
  }
}