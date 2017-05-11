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
public class Reportes extends Action 
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
    ArrayList aCalm6;
    ArrayList aCalm7;
    ArrayList aCalm8;
    ArrayList aCalm9;
    ArrayList aCalm10;
    String cod_fin;
    String cod_reg;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    ActionMessages error = new ActionMessages();
    ReportesForm opform = (ReportesForm) form;
    cod_reg=fInicio.getCod_reg();
    opform.setDes_codreg(fInicio.getRegional());     
    cod_fin=fInicio.getCod_fin();
    opform.setDes_codfin(fInicio.getFinanciador());

    BDConection bdc = new BDConection();
        
    try {
       opform.setCod_reg(fInicio.getCod_reg());
       opform.setOperacion(0);      
       if (mapping.getParameter().equals("rp1")) 
       {
          opform.setOpcion(1);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp2")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);
          opform.setOpcion(2);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp3")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);
          aCalm7 = bdc.listarGrupos(2,"");
          request.setAttribute("GruposLista", aCalm7);
          opform.setOpcion(3);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp4")) 
       {
          aCalm7 = bdc.listarUbicaciones(0,cod_reg);
          request.setAttribute("UbicacionesLista", aCalm7);
          opform.setOpcion(4);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp5")) 
       {
          aCalm8 = bdc.listarFuncionariosfa(0,cod_reg,cod_fin);
          request.setAttribute("FuncionariosLista", aCalm8);       
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);
          aCalm7 = bdc.listarGrupos(2,"");
          request.setAttribute("GruposLista", aCalm7);       
          opform.setOpcion(5);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp6")) 
       {
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          opform.setOpcion(6);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp7")) 
       {
          opform.setOpcion(7);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp8")) 
       {
          opform.setOpcion(8);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp9")) 
       {
          opform.setOpcion(9);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp10")) 
       {
          opform.setOpcion(10);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp11")) 
       {
          aCalm10 = bdc.listarOficinas(0,cod_reg);
          request.setAttribute("OficinasLista", aCalm10);
          opform.setOpcion(11);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp12")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);       
          opform.setOpcion(12);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd1")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);       
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(13);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd2")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);       
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(14);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd3")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);       
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(15);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd4")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);       
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(16);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd5")) 
       {
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(17);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd6")) 
       {
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(18);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd7")) 
       {
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(19);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd8")) 
       {
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(25);
          opform.setOperacion(1);
       }       
       if (mapping.getParameter().equals("rd9")) 
       {
          opform.setOpcion(26);
          opform.setOperacion(1);       
       }       
       if (mapping.getParameter().equals("rd10")) 
       {
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(28);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rd11")) 
       {
          aCalm6 = bdc.listarUbicaciones(0,cod_reg);
          request.setAttribute("UbicacionesLista", aCalm6);
          aCalm10 = bdc.listarOficinas(0,cod_reg);
          request.setAttribute("OficinasLista", aCalm10);
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(30);
          opform.setOperacion(1);
       } 
       if (mapping.getParameter().equals("rd12")) 
       {
          aCalm7 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm7);
          aCalm8 = bdc.listarProyectos(0);
          request.setAttribute("ProyectosLista", aCalm8);
          opform.setOpcion(31);
          opform.setOperacion(1);
       }       
       if (mapping.getParameter().equals("rp13")) 
       {
          opform.setOpcion(20);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp14")) 
       {
          opform.setOpcion(21);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp15")) 
       {
          opform.setOpcion(22);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp16")) 
       {
          opform.setOpcion(23);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp17")) 
       {
          aCalm7 = bdc.listarFuncionarios(0,cod_reg);
          request.setAttribute("FuncionariosLista", aCalm7);
          opform.setOpcion(24);
          opform.setOperacion(1);
       }
       if (mapping.getParameter().equals("rp18")) 
       {
          aCalm6 = bdc.listarRubros(0);
          request.setAttribute("RubrosLista", aCalm6);
          opform.setOpcion(27);
          opform.setOperacion(1);
       }       
       if (mapping.getParameter().equals("rp19")) 
       {
          aCalm6 = bdc.listarFuncionarios(0,cod_reg);
          request.setAttribute("FuncionariosLista", aCalm6);
          opform.setOpcion(29);
          opform.setOperacion(1);
       }              
    }
    catch (Exception e) {
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar Depreciaciones"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }  
    return mapping.findForward("reportes");    
  }
}
