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

public class Inventarios extends Action 
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
    ArrayList aCalm2;
    ArrayList aCalm5;
    ArrayList aCalm6;
    ArrayList aCalm8;
    ArrayList aCalm9;  
    ArrayList aCalm12;  
    ActionMessages error = new ActionMessages();
    InventariosForm opform = (InventariosForm) form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    opform.setInv_codreg(fInicio.getCod_reg());
    opform.setInv_regdescripcion(fInicio.getRegional());    
    opform.setInv_codfin(fInicio.getCod_fin());
    opform.setInv_findescripcion(fInicio.getFinanciador());    
    
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    try {
       BDConection bdc = new BDConection();
       aCalm5 = bdc.listarOficinas(0,fInicio.getCod_reg());
       request.setAttribute("OficinasLista", aCalm5);
       aCalm6 = bdc.listarFuncionarios(0,fInicio.getCod_reg());
       request.setAttribute("FuncionariosLista", aCalm6);
       aCalm8 = bdc.listarFinanciadores(0);
       request.setAttribute("FinanciadoresLista", aCalm8);
       aCalm9 = bdc.listarProyectos(0);
       request.setAttribute("ProyectosLista", aCalm9);
       aCalm2 = bdc.listarRegionales(0);
       request.setAttribute("RegionalesLista", aCalm2);    
       aCalm12 = bdc.listarEstados();
       request.setAttribute("EstadosLista", aCalm12);
       
       ArrayList aCalm = bdc.listarInventarios(fInicio.getCod_reg(),1);
       request.setAttribute("InventariosLista", aCalm);
       opform.setOperacion(0);
       if (mapping.getParameter().equals("gen")) 
       {
          opform.setOpcion(6);
          opform.setOperacion(1);
       } 
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
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar Inventarios"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }
    }
    return mapping.findForward("inventarios");
  }
}