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

public class FuncionariosAction extends Action 
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
    FuncionariosForm finform = (FuncionariosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    //finform.setFun_codreg(fInicio.getCod_reg());
    //finform.setDescripcion_codreg(fInicio.getRegional());
    //finform.setFun_codfin(fInicio.getCod_fin());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;    
    ArrayList aCalm3;    
    ArrayList aCalm4;    
    ArrayList aCalm5;     
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarFuncionariosf(1,fInicio.getCod_reg(),fInicio.getCod_fin());
      request.setAttribute("FuncionariosLista", aCalm);
      //aCalm2 = bdc.listarOficinas(0,fInicio.getCod_reg());
      aCalm2 = bdc.listarOficinas(0,fInicio.getCod_reg());      
      request.setAttribute("OficinasLista", aCalm2);
      aCalm5 = bdc.listarOficinas1(fInicio.getCod_reg());      
      request.setAttribute("OficinasLista1", aCalm5);      
      aCalm3 = bdc.listarRegionales(0);              
      request.setAttribute("RegionalesLista", aCalm3);
      aCalm4 = bdc.listarFinanciadores(0);              
      request.setAttribute("FinanciadoresLista", aCalm4);
      ArrayList datos = (ArrayList) request.getAttribute("FuncionariosLista"); 
      if (finform.getOperacion()==1)
      {   
          FuncionariosDetalleForm d = new FuncionariosDetalleForm();
          d = (FuncionariosDetalleForm) datos.get(it);  
          finform.setFun_codigo(d.getCodigo());       
          finform.setFun_descripcion(d.getDescripcion());
          finform.setFun_cargo(d.getCargo());
          finform.setFun_codofi(d.getCodofi());
          finform.setFun_codreg(d.getCodreg());
          finform.setFun_codfin(d.getCodfin());
          finform.setFun_correo(d.getCorreo());
          finform.setFun_estado(d.getEstado());
          finform.setDescripcion_codreg(d.getDescripcion_codreg());          
          finform.setDescripcion_codofi(d.getDescripcion_codofi());
          finform.setDescripcion_codfin(d.getDescripcion_codfin());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertarfuncionarios(finform.getFun_codigo(),finform.getFun_descripcion(),finform.getFun_cargo(),finform.getFun_codofi(),finform.getFun_codreg(),fInicio.getTxt_usu(),finform.getOpcion(),finform.getFun_codfin(),finform.getFun_correo(),finform.getFun_estado());
                finform.setFun_codigo("");
                finform.setFun_descripcion("");
                finform.setFun_cargo("");
                finform.setFun_codofi("");
                finform.setFun_codreg("");
                finform.setFun_codfin("");
                finform.setFun_correo("");
                finform.setFun_estado("");
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
                finform.setFun_codigo("");
                finform.setFun_descripcion("");
                finform.setFun_cargo("");
                finform.setFun_codofi("");             
                finform.setFun_codreg("");             
                finform.setFun_codfin("");
                finform.setFun_correo("");
                finform.setFun_estado("");
             }
             try {
                aCalm = bdc.listarFuncionariosf(1,fInicio.getCod_reg(),fInicio.getCod_fin());
                request.setAttribute("FuncionariosLista", aCalm);
                aCalm2 = bdc.listarOficinas(0,finform.getFun_codreg());
                request.setAttribute("OficinasLista", aCalm2);
                aCalm5 = bdc.listarOficinas1(finform.getFun_codreg());
                request.setAttribute("OficinasLista1", aCalm5);
                aCalm3 = bdc.listarRegionales(0);              
                request.setAttribute("RegionalesLista", aCalm3);
                aCalm4 = bdc.listarFinanciadores(0);              
                request.setAttribute("FinanciadoresLista", aCalm4);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Funcionarios"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Funcionarios"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}