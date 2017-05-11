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

public class Activos extends Action 
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
    ActivosForm opform = (ActivosForm) form;    
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    opform.setCodregor(opform.getAct_codreg());
    opform.setAct_codreg(fInicio.getCod_reg());
    opform.setAct_regdescripcion(fInicio.getRegional());    
    opform.setAct_codfin(fInicio.getCod_fin());
    opform.setAct_findescripcion(fInicio.getFinanciador());    
    BDConection bdc = new BDConection();
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) { 
    try {
       MesAnioDetalleForm mesanio = bdc.listarMesAnio();
       opform.setMes(mesanio.getMes());
       opform.setAnio(mesanio.getAnio());    
       opform.setOperacion(0);
       ArrayList aCalm = bdc.listarRubros(0);
       request.setAttribute("RubrosLista", aCalm);
       ArrayList aCalm2 = bdc.listarRegionales(0);
       request.setAttribute("RegionalesLista", aCalm2);
       ArrayList aCalm3 = bdc.listarGrupos(0,opform.getAct_codrub());
       request.setAttribute("GruposLista", aCalm3);
       ArrayList aCalm4 = bdc.listarPartidas(0);
       request.setAttribute("PartidasLista", aCalm4);
       ArrayList aCalm5 = bdc.listarOficinas(0,fInicio.getCod_reg());
       request.setAttribute("OficinasLista", aCalm5);
       ArrayList aCalm6 = bdc.listarFuncionarios(0,fInicio.getCod_reg());
       request.setAttribute("FuncionariosLista", aCalm6);
       ArrayList aCalm7 = bdc.listarUbicaciones(0,fInicio.getCod_reg());
       request.setAttribute("UbicacionesLista", aCalm7);
       ArrayList aCalm8 = bdc.listarFinanciadores(0);
       request.setAttribute("FinanciadoresLista", aCalm8);
       ArrayList aCalm9 = bdc.listarProyectos(0);
       request.setAttribute("ProyectosLista", aCalm9);
       ArrayList aCalm10 = bdc.listarTiposbaja(0);
       request.setAttribute("TiposBajaLista", aCalm10);
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
       if (mapping.getParameter().equals("con"))
       {
          opform.setOpcion(5);   
          opform.setOperacion(2);
       }
    }
    catch (Exception e) {
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar Activos"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }  
    }
    if (opform.getOpcion()==1) {
       return mapping.findForward("activos");
    }
    else {
       return mapping.findForward("activos10");    
    }
  }
}