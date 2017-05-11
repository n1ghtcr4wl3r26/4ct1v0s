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

public class RevaluosAction extends Action 
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
    RevaluosForm finform = (RevaluosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    //finform.setRev_codreg(fInicio.getCod_reg());
    finform.setRev_regdescripcion(fInicio.getRegional());    
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    String mensaje=null;
    ArrayList aCalm;
    ArrayList aCalm2;
    ArrayList aCalm3;
    ArrayList aCalm4;
    ArrayList aCalm5;
    ArrayList aCalm11;    
    int    num;
    String fecha=null;
    String ceros=null;
    int    vidautrub;
    String desrub;
    String desgrp;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    String codrub = finform.getRev_codrub();
    int it = finform.getFila();;
    try { 
      MesAnioDetalleForm mesanio = bdc.listarMesAnio();
      finform.setMes(mesanio.getMes());
      finform.setAnio(mesanio.getAnio());
      aCalm2 = bdc.listarRubros(0);
      request.setAttribute("RubrosLista", aCalm2);
      aCalm3 = bdc.listarRegionales(0);
      request.setAttribute("RegionalesLista", aCalm3);
//      aCalm5 = bdc.listarGrupos(2,finform.getRev_codrub());
      aCalm5 = bdc.listarGrupos(2,"");
      request.setAttribute("GruposLista", aCalm5);
      aCalm4 = bdc.listarEstados();
      request.setAttribute("EstadosLista", aCalm4);           
      if (finform.getOperacion()==1)
      { 
          aCalm = bdc.listarRevaluos4(finform.getRev_codrub(),fInicio.getCod_reg(),finform.getAct_descripcion(),finform.getAct_codgrp(),finform.getOpcion());            
          if (aCalm.size()!=0) {
             request.setAttribute("RevaluosLista", aCalm);
             ArrayList datos = (ArrayList) request.getAttribute("RevaluosLista");      
             RevaluosDetalleForm d = new RevaluosDetalleForm();
             d = (RevaluosDetalleForm) datos.get(it);  
             finform.setRev_codrub(d.getcodrub());       
             finform.setRev_codreg(d.getcodreg());
             finform.setRev_codigo(d.getcodigo());
             finform.setAct_descripcion(d.getDesactivo());
             finform.setAct_codgrp(d.getcodgrp());
             vidautrub = bdc.VidaUtilRubro(finform.getRev_codrub()); 
             finform.setRub_vidaut(vidautrub);
             if (finform.getOpcion()!=1){
                finform.setRev_numrevaluo(d.getNumrevaluo());
                finform.setRev_fecha(d.getfecha());
                finform.setRev_tipcam(d.gettipcam());
                finform.setRev_tipufv(d.gettipufv());
                finform.setRev_valbol(d.getvalbol());
                finform.setRev_valdol(d.getvaldol());
                finform.setRev_valufv(d.getvalufv());
                finform.setRev_depacubol(d.getdepacubol());
                finform.setRev_depacudol(d.getdepacudol());
                finform.setRev_depacuufv(d.getdepacuufv());
                finform.setRev_vidaut(d.getvidaut());
                finform.setRev_estadoactivo(d.getestadoactivo());
                finform.setRev_desestado(d.getdesestado());
                finform.setRev_indepreciacion(d.getindepreciacion());
                finform.setRev_numdocumento(d.getnumdocumento());
             }
          }
          else 
          {
             mensaje="No existe Activo con esta caracteristica";
             finform.setOperacion(5);
          }      
          desrub = bdc.DescripcionRubro(finform.getRev_codrub());
          finform.setRev_rubdescripcion(desrub); 
          desgrp = bdc.nombregrupo(finform.getRev_codrub(),finform.getAct_codgrp());
          finform.setRev_grpdescripcion(desgrp);           
          if (finform.getRev_codigo()<10000)
             ceros="0";
          if (finform.getRev_codigo()<1000)
             ceros="00";
          if (finform.getRev_codigo()<100)
             ceros="000";
          if (finform.getRev_codigo()<10)
             ceros="0000";                       
          if (finform.getOpcion()==1)
          { 
             num = bdc.maximoRevaluos(finform.getRev_codrub(),finform.getRev_codreg(),finform.getRev_codigo(),finform.getRev_correlmre());
             fecha = bdc.maximaFechaRevaluos(finform.getRev_codrub(),finform.getRev_codreg(),finform.getRev_codigo(),finform.getRev_correlmre(),finform.getRev_numrevaluo());
             finform.setRev_numrevaluo(num);
             finform.setRev_fecha(fecha);
             finform.setFecha_rev(fecha);
             if (num==0){
               mensaje="No está definido Código de Activo (Número de Revaluo)";
               finform.setOperacion(5);
             }
             else {
               finform.setRev_codbarra(finform.getRev_codrub()+finform.getRev_codreg()+ceros+finform.getRev_codigo());
             }
          }
          if (finform.getOpcion()==2)
          {
             finform.setRev_codbarra(finform.getRev_codrub()+finform.getRev_codreg()+ceros+finform.getRev_codigo());
             fecha = bdc.maximaFechaRevaluos(finform.getRev_codrub(),finform.getRev_codreg(),finform.getRev_codigo(),finform.getRev_correlmre(),finform.getRev_numrevaluo());
             finform.setFecha_rev(fecha);
          }
          if ((finform.getOpcion()==3)||(finform.getOpcion()==5))
          {
             finform.setRev_codbarra(finform.getRev_codrub()+finform.getRev_codreg()+ceros+finform.getRev_codigo());
          }
      }
      if (finform.getOperacion()==2)
      {
          try {
             String msgsql=null;
             msgsql = bdc.insertarrevaluos(
             finform.getRev_codrub(),
             finform.getRev_codreg(),
             finform.getRev_codigo(),
             finform.getRev_numrevaluo(),
             finform.getRev_fecha(),
             finform.getRev_tipcam(),
             finform.getRev_tipufv(),
             finform.getRev_valbol(),
             finform.getRev_valdol(),
             finform.getRev_valufv(),
             finform.getRev_depacubol(),
             finform.getRev_depacudol(),
             finform.getRev_depacuufv(),
             finform.getRev_vidaut(),
             finform.getRev_estadoactivo(),
             finform.getRev_desestado(),
             finform.getRev_indepreciacion(),
             finform.getRev_numdocumento(),
             fInicio.getTxt_usu(),
             finform.getOpcion()
             );
             finform.setRev_codrub("");       
             finform.setRev_codreg(""); 
             finform.setRev_codigo(0);
             finform.setRev_numrevaluo(0);
             finform.setRev_fecha("");
             finform.setRev_tipcam(0);
             finform.setRev_tipufv(0);
             finform.setRev_valbol(0);
             finform.setRev_valdol(0);
             finform.setRev_valufv(0);
             finform.setRev_depacubol(0);
             finform.setRev_depacudol(0);
             finform.setRev_depacuufv(0);
             finform.setRev_vidaut(0);
             finform.setRev_estadoactivo("");
             finform.setRev_desestado("");
             finform.setRev_indepreciacion("");
             finform.setRev_numdocumento("");
             if (!msgsql.equals("0")) {
                error.add("error", new ActionMessage("error", msgsql));
                saveErrors( request, error );
             }
             else  {
                error.add("error", new ActionMessage("error", "La transacción fue realizada correctamente"));
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
          aCalm11 = bdc.listarRevaluos3(finform.getRev_codrub(),fInicio.getCod_reg(),finform.getAct_descripcion(),finform.getAct_codgrp(),finform.getOpcion());
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
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Revaluos"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
      return mapping.findForward("volver");     
    }
    }
    return mapping.findForward("volver");     
  }
}