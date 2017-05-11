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

public class InventariosAction extends Action 
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
    InventariosForm finform = (InventariosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    finform.setInv_codreg(fInicio.getCod_reg());
    finform.setInv_regdescripcion(fInicio.getRegional());     
    finform.setInv_codfin(fInicio.getCod_fin());
    finform.setInv_findescripcion(fInicio.getFinanciador());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;
    ArrayList aCalm5;
    ArrayList aCalm6;
    ArrayList aCalm8;
    ArrayList aCalm9;    
    ArrayList aCalm12;    
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
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
        aCalm = bdc.listarInventarios(fInicio.getCod_reg(),1);              
      request.setAttribute("InventariosLista", aCalm);
      ArrayList datos = (ArrayList) request.getAttribute("InventariosLista"); 
      if (finform.getOperacion()==1)
      {   
          InventariosDetalleForm d = new InventariosDetalleForm();
          d = (InventariosDetalleForm) datos.get(it);  
          finform.setInv_codbarrad(d.getCodbarrad());
          finform.setInv_codbarra(d.getCodbarra());       
          finform.setInv_fecha(d.getFecha());
          finform.setInv_codofi(d.getCodofi());
          finform.setInv_codfun(d.getCodfun());
          finform.setInv_codubi(d.getCodubi());
          finform.setInv_codfin(d.getCodfin());
          finform.setInv_codpry(d.getCodpry());
          finform.setInv_codreg(d.getCodreg());
          finform.setInv_estado(d.getEstado());
          finform.setInv_mod(d.getMod());
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                if (finform.getOpcion()!=6) {
                   String msgsql=null;
                   msgsql = bdc.insertarinventarios(
                   finform.getInv_codbarra(),
                   finform.getInv_fecha(),
                   finform.getInv_codofi(),
                   finform.getInv_codfun(),
                   finform.getInv_codubi(),
                   finform.getInv_codfin(),
                   finform.getInv_codpry(),
                   finform.getInv_codreg(),
                   finform.getInv_estado(),
                   fInicio.getTxt_usu(),
                   finform.getInv_mod(),
                   finform.getOpcion()
                   );
                   finform.setInv_codbarra("");
                   finform.setInv_fecha("");
                   finform.setInv_codofi("");
                   finform.setInv_codfun("");
                   finform.setInv_codubi("");
                   finform.setInv_codfin("");
                   finform.setInv_codpry("");                
                   finform.setInv_codreg("");
                   finform.setInv_estado("");
                   finform.setInv_mod("");
                   if (!msgsql.equals("0")) {
                      error.add("error", new ActionMessage("error", msgsql));
                      saveErrors( request, error );
                   }
                   else  {
                      error.add("error", new ActionMessage("error", "La transacción fue realizada correctamente"));
                      saveErrors( request, error );                  
                   }
                }
                else {
                   String msgsql=null;
                   msgsql = bdc.generarinventarios(fInicio.getCod_reg(),fInicio.getCod_fin(),fInicio.getTxt_usu(),finform.getActas());
                   error.add("error", new ActionMessage("error", msgsql));
                   saveErrors( request, error );
                }
             }
             else
             {
                finform.setInv_codbarra("");
                finform.setInv_fecha("");
                finform.setInv_codofi("");  
                finform.setInv_codfun("");
                finform.setInv_codubi("");
                finform.setInv_codfin("");
                finform.setInv_codpry("");                
                finform.setInv_codreg("");           
                finform.setInv_estado("");           
                finform.setInv_mod("");
             }
             try {
                aCalm = bdc.listarInventarios(fInicio.getCod_reg(),1);              
                request.setAttribute("InventariosLista", aCalm);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Inventarios"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Inventarios"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}