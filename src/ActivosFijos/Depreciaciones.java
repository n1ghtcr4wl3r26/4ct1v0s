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
public class Depreciaciones extends Action 
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
    DepreciacionesForm opform = (DepreciacionesForm) form;
    ArrayList aCalm6;
    ArrayList aCalm7;    
    String gestion;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    try {
       BDConection bdc = new BDConection();
       MesAnioDetalleForm mesanio = bdc.listarMesAnio();
       opform.setMes(mesanio.getMes());
       opform.setAnio(mesanio.getAnio());     
       opform.setOperacion(0);      
       if (mapping.getParameter().equals("gen")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);  
          aCalm7 = bdc.listarRegionales(0);
          request.setAttribute("RegionalesLista", aCalm7);
          gestion = "31/12/";
          gestion = gestion.concat(bdc.Gestiond());
          opform.setDpr_fecha(gestion);
          opform.setAnio(bdc.Gestiond());
          opform.setOpcion(1);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rep")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);  
          aCalm7 = bdc.listarRegionales(0);
          request.setAttribute("RegionalesLista", aCalm7);
          opform.setOpcion(2);
          opform.setOperacion(1);
       }
    }
    catch (Exception e) {
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar Depreciaciones"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }  
    }
    return mapping.findForward("depreciaciones");    
  }
}