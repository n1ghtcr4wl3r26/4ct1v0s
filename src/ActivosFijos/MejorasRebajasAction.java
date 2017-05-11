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

public class MejorasRebajasAction extends Action 
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
    MejorasRebajasForm finform = (MejorasRebajasForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    finform.setMre_codreg(fInicio.getCod_reg());
    finform.setMre_regdescripcion(fInicio.getRegional());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    String mensaje=null;
    ArrayList aCalm;
    ArrayList aCalm1;    
    ArrayList aCalm2;
    ArrayList aCalm3;
    ArrayList aCalm11;
    ArrayList aCalm12;    
    String desrub;
    int    num;
    int it = finform.getFila();
    try {
      MesAnioDetalleForm mesanio = bdc.listarMesAnio();
      finform.setMes(mesanio.getMes());
      finform.setAnio(mesanio.getAnio());
      aCalm1 = bdc.listarRubros(0);
      request.setAttribute("RubrosLista", aCalm1);
      aCalm2 = bdc.listarRegionales(0);
      request.setAttribute("RegionalesLista", aCalm2);
      aCalm3 = bdc.listarGrupos(0,finform.getMre_codrub());
      request.setAttribute("GruposLista", aCalm3);
      aCalm12 = bdc.listarEstados();
      request.setAttribute("EstadosLista", aCalm12);
      if (finform.getOperacion()==1)
      {
         aCalm = bdc.listarMejorasRebajas4(finform.getMre_codrub(),finform.getMre_codreg(),finform.getAct_descripcion(),finform.getOpcion());              
         if (aCalm.size()!=0) {
            it = finform.getFila();
            request.setAttribute("MejorasRebajasLista", aCalm);
            ArrayList datos = (ArrayList) request.getAttribute("MejorasRebajasLista");
            MejorasRebajasDetalleForm d = new MejorasRebajasDetalleForm();
            d = (MejorasRebajasDetalleForm) datos.get(it);  
            finform.setMre_codrub(d.getcodrub());       
            finform.setMre_codreg(d.getcodreg());
            finform.setMre_codigo(d.getcodigo());
            finform.setAct_descripcion(d.getDesactivo());
            if (finform.getOpcion()!=1){
               finform.setMre_inmejreb(d.getinmejreb());
               finform.setMre_corel(d.getcorel());
               finform.setMre_fecha(d.getfecha());
               finform.setMre_tipcam(d.gettipcam());
               finform.setMre_tipufv(d.gettipufv());
               finform.setMre_descripcion(d.getdescripcion());
               finform.setMre_desadicional(d.getdesadicional());
               finform.setMre_proveedor(d.getproveedor());
               finform.setMre_marca(d.getmarca());
               finform.setMre_modelo(d.getmodelo());
               finform.setMre_serie(d.getserie());
               finform.setMre_docreferencia(d.getdocreferencia());
               finform.setMre_fecreferencia(d.getfecreferencia());
               finform.setMre_valbol(d.getvalbol());
               finform.setMre_valdol(d.getvaldol());
               finform.setMre_valufv(d.getvalufv());
               finform.setMre_ordencompra(d.getordencompra());
               finform.setMre_numfactura(d.getnumfactura());
               finform.setMre_numcomprobante(d.getnumcomprobante());
               finform.setRev_fecha(d.getRfecha());
               finform.setRev_vidaut(d.getVidaut());
               finform.setRev_estadoactivo(d.getEstadoactivo());
               finform.setRev_desestado(d.getDesestado());
               finform.setRev_numdocumento(d.getNumdocumento());
            }
         }
         else 
         {
            mensaje="No existe Mejora con esta caracteristica";
            finform.setOperacion(5);
         }
          desrub = bdc.DescripcionRubro(finform.getMre_codrub());
          finform.setMre_rubdescripcion(desrub);      
          if (finform.getOpcion()==1)
          { 
             num = bdc.maximoMejoras(finform.getMre_codrub(),finform.getMre_codreg(),finform.getMre_codigo());
             finform.setMre_corel(num);
             if (num==0){
               mensaje="No existe Activo con estas caracteristicas";
               finform.setOperacion(5);
             }
          }
          finform.setMre_codbarra(finform.getMre_codrub()+finform.getMre_codreg()+finform.getMre_codigo()); 
      }
      if (finform.getOperacion()==2)
      {
          try {
             String msgsql=null;
             msgsql = bdc.insertarmejorasrebajas(
             finform.getMre_codrub(),
             finform.getMre_codreg(),
             finform.getMre_codigo(),
             finform.getMre_inmejreb(),
             finform.getMre_corel(),
             finform.getMre_fecha(),
             finform.getMre_tipcam(),
             finform.getMre_tipufv(),
             finform.getMre_descripcion(),
             finform.getMre_desadicional(),
             finform.getMre_proveedor(),
             finform.getMre_marca(),
             finform.getMre_modelo(),
             finform.getMre_serie(),
             finform.getMre_docreferencia(),
             finform.getMre_fecreferencia(),
             finform.getMre_valbol(),
             finform.getMre_valdol(),
             finform.getMre_valufv(),
             finform.getMre_ordencompra(),
             finform.getMre_numfactura(),
             finform.getMre_numcomprobante(),
             finform.getRev_fecha(),
             finform.getRev_vidaut(),
             finform.getRev_estadoactivo(),
             finform.getRev_desestado(),
             finform.getRev_numdocumento(),
             fInicio.getTxt_usu(),
             finform.getOpcion()
             );
             finform.setMre_codrub("");       
             finform.setMre_codreg("");
             finform.setMre_codigo(0);
             finform.setMre_inmejreb("");
             finform.setMre_corel(0);
             finform.setMre_fecha("");
             finform.setMre_tipcam(0);
             finform.setMre_tipufv(0);
             finform.setMre_descripcion("");
             finform.setMre_desadicional("");
             finform.setMre_proveedor("");
             finform.setMre_marca("");
             finform.setMre_modelo("");
             finform.setMre_serie("");
             finform.setMre_docreferencia("");
             finform.setMre_fecreferencia("");
             finform.setMre_valbol(0);
             finform.setMre_valdol(0);
             finform.setMre_valufv(0);
             finform.setMre_ordencompra("");
             finform.setMre_numfactura(0);
             finform.setMre_numcomprobante("");
             finform.setRev_fecha("");
             finform.setRev_vidaut(0);
             finform.setRev_estadoactivo("");
             finform.setRev_desestado("");
             finform.setRev_numdocumento("");
             if (!msgsql.equals("0")) {
                error.add("error", new ActionMessage("error", msgsql));
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
     if (finform.getOperacion()==3) 
     {
          aCalm11 = bdc.listarMejorasRebajas3(finform.getMre_codrub(),finform.getMre_codreg(),finform.getAct_descripcion(),finform.getOpcion());
          if (aCalm11.size()!=0) {
             request.setAttribute("Activos3Lista", aCalm11);
          }
          else 
          {
             mensaje="No existe Activos con esta caracteristica";
             finform.setOperacion(5);               
          }       
     }     
     if (finform.getOperacion()!=5) {
          return mapping.findForward("volver");
     }
     else {
        error.add("error", new ActionMessage("error", mensaje));
        saveErrors( request, error );
        return mapping.findForward("volver");
     }
    }
    catch (Exception e) {
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar MejorasRabjasLista"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
      return mapping.findForward("volver");     
    }

  }
}