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

public class Funcionarios extends Action 
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
    FuncionariosForm opform = (FuncionariosForm) form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    opform.setFun_codreg(fInicio.getCod_reg());
    opform.setDescripcion_codreg(fInicio.getRegional());
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    try {
       BDConection bdc = new BDConection();
       ArrayList aCalm = bdc.listarFuncionariosf(1,fInicio.getCod_reg(),fInicio.getCod_fin());
       request.setAttribute("FuncionariosLista", aCalm);
       ArrayList aCalm2 = bdc.listarOficinas(0,fInicio.getCod_reg());
       request.setAttribute("OficinasLista", aCalm2);
       ArrayList aCalm5 = bdc.listarOficinas1(fInicio.getCod_reg());
       request.setAttribute("OficinasLista1", aCalm5);       
       ArrayList aCalm3 = bdc.listarRegionales(0);              
       request.setAttribute("RegionalesLista", aCalm3);
       ArrayList aCalm4 = bdc.listarFinanciadores(0);              
       request.setAttribute("FinanciadoresLista", aCalm4);
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
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar Funcionarios"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }  
    }
    return mapping.findForward("funcionarios");
  }
}