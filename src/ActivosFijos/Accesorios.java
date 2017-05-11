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

public class Accesorios extends Action 
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
    AccesoriosForm opform = (AccesoriosForm) form;
    try {
       opform.setOperacion(0);
       BDConection bdc = new BDConection();
       ArrayList aCalm = bdc.listarRubros(0);
       request.setAttribute("RubrosLista", aCalm);
       System.out.println("Se cargo RubrosLista");
       ArrayList aCalm2 = bdc.listarRegionales(0);
       request.setAttribute("RegionalesLista", aCalm2);
       System.out.println("Se cargo RegionalesLista");
       ArrayList aCalm3 = bdc.listarGrupos(0);
       request.setAttribute("GruposLista", aCalm3);
       System.out.println("Se cargo GruposLista");
       
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
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar Accesorios"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }  
    return mapping.findForward("accesorios");    
  }
}