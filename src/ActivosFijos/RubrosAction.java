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
import java.util.ArrayList;;

public class RubrosAction extends Action 
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
    RubrosForm finform = (RubrosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;    
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    int it = finform.getFila();
    try {
      aCalm = bdc.listarRubros(1);
      request.setAttribute("RubrosLista", aCalm);
      aCalm2 = bdc.listarPartidas(0);              
      request.setAttribute("PartidasLista", aCalm2);
      ArrayList datos = (ArrayList) request.getAttribute("RubrosLista"); 
      if (finform.getOperacion()==1)
      {   
          RubrosDetalleForm d = new RubrosDetalleForm();
          d = (RubrosDetalleForm) datos.get(it);  
          finform.setRub_codigo(d.getCodigo());       
          finform.setRub_descripcion(d.getDescripcion());
          finform.setRub_vidaut(d.getVidaut());
          finform.setRub_porcen(d.getPorcen());
          finform.setRub_codpar(d.getCodpar());
          finform.setDescripcion_codpar(d.getDescripcion_codpar());
          finform.setRub_ctadep(d.getCtadep());
          finform.setRub_ctadac(d.getCtadac());          
      }
      if (finform.getOperacion()==2)
      {
          try {
             if (!finform.getBoton().equals("Cancelar")) {
                String msgsql=null;
                msgsql = bdc.insertarrubros(finform.getRub_codigo(),finform.getRub_descripcion(),finform.getRub_vidaut(),finform.getRub_porcen(),finform.getRub_codpar(),finform.getRub_ctadep(),finform.getRub_ctadac(),fInicio.getTxt_usu(),finform.getOpcion());
                finform.setRub_codigo("");
                finform.setRub_descripcion("");
                finform.setRub_vidaut(0);
                finform.setRub_porcen(0);
                finform.setRub_codpar("");
                finform.setRub_ctadep("");
                finform.setRub_ctadac("");
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
                finform.setRub_codigo("");
                finform.setRub_descripcion("");
                finform.setRub_vidaut(0);
                finform.setRub_porcen(0);
                finform.setRub_codpar("");
                finform.setRub_ctadep("");
                finform.setRub_ctadac("");               
             }
             try {
                aCalm = bdc.listarRubros(1);
                request.setAttribute("RubrosLista", aCalm);
                aCalm2 = bdc.listarPartidas(0);              
                request.setAttribute("PartidasLista", aCalm2);
             }
             catch (Exception e) {
                error.add("error", new ActionMessage("errordb", "No se pudo iniciar Rubros"));
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Rubros"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    }
    return mapping.findForward("volver");
  }
}