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

public class DepreciacionesAction extends Action 
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
    DepreciacionesForm finform = (DepreciacionesForm)form;
    String vcondicion1;
    String vcondicion2;
    String vcod_inicial;
    String vcod_final;
    ArrayList aCalm6;
    ArrayList aCalm7;   
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = 0;
    try {
      MesAnioDetalleForm mesanio = bdc.listarMesAnio();
      finform.setMes(mesanio.getMes());
      finform.setAnio(mesanio.getAnio());    
      if (finform.getOperacion()==2)
      { 
          try {
             if (finform.getOpcion()==1) {
                String msgsql=null;
                msgsql = bdc.depreciaciontotal(finform.getDpr_fecha(),fInicio.getTxt_usu(),finform.getOpcion(),finform.getDep_codrub(),finform.getDep_codreg(),finform.getCod_inicial(),finform.getCod_final());
                aCalm6 = bdc.listarRubros(0);
                request.setAttribute("RubrosLista", aCalm6);  
                aCalm7 = bdc.listarRegionales(0);
                request.setAttribute("RegionalesLista", aCalm7);
                finform.setDpr_fecha("");       
                finform.setOperacion(1);
                finform.setOpcion(2);
                if (!msgsql.equals("0")) {
                   error.add("error", new ActionMessage("error","No se pudo realizar la depreciación : Revise la existencia de tipos de cambio inicial y final para todos los periodos anteriores incluido el mes actual"));
                   saveErrors( request, error );
                   finform.setOperacion(1);
                   finform.setOpcion(1);
                }
             }
             else 
             {
                vcondicion1=finform.getDep_codreg();
                vcondicion2=finform.getDep_codrub();
                vcod_inicial=finform.getCod_inicial();
                vcod_final=finform.getCod_final();
                request.getSession().setAttribute("condicion1", vcondicion1);
                request.getSession().setAttribute("condicion2", vcondicion2);
                request.getSession().setAttribute("cod_inicial", vcod_inicial);
                request.getSession().setAttribute("cod_final", vcod_final);
                return mapping.findForward("reportar");  
             }
          }
          catch (Exception e) {
             error.add("error", new ActionMessage("errordb", "No se pudo realizar la transacción."));
             error.add("error", new ActionMessage("errordb", e.toString() ));
             e.printStackTrace();
             saveErrors( request, error );
          }
       } 
    }
    catch (Exception e) {
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Depreciaciones"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}