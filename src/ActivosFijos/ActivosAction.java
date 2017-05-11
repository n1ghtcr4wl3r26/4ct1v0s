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

public class ActivosAction extends Action 
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
    ActivosForm finform = (ActivosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm");
    finform.setCodregor(finform.getAct_codreg());
    finform.setAct_codreg(fInicio.getCod_reg());
    finform.setAct_regdescripcion(fInicio.getRegional());     
    finform.setAct_codfin(fInicio.getCod_fin());
    finform.setAct_findescripcion(fInicio.getFinanciador());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    String mensaje=null;
    ArrayList aCalm;
    ArrayList aCalm1;    
    ArrayList aCalm2;
    ArrayList aCalm3;
    ArrayList aCalm4;
    ArrayList aCalm5;
    ArrayList aCalm6;
    ArrayList aCalm7;
    ArrayList aCalm8;
    ArrayList aCalm9;
    ArrayList aCalm10;
    ArrayList aCalm11;
    ParametrosForm aCalm111;
    ArrayList aCalm12;
    String    codfun;
    String    codofi;
    int    num;
    int    vidautrub;
    int    it;
    String desrub;
    String desgrp;
    String codpar;
    String despar;
    String desreg;
    String ceros=null;
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
    String codrub = finform.getAct_codrub();
    if (finform.getOpcion()==1)
       it = 0;
    else
       it = finform.getFila();
    try {
      
      MesAnioDetalleForm mesanio = bdc.listarMesAnio();
      finform.setMes(mesanio.getMes());
      finform.setAnio(mesanio.getAnio());
      aCalm1 = bdc.listarRubros(0);
      request.setAttribute("RubrosLista", aCalm1);
      aCalm2 = bdc.listarRegionales(0);
      request.setAttribute("RegionalesLista", aCalm2);
      aCalm3 = bdc.listarGrupos(0,finform.getAct_codrub());
      request.setAttribute("GruposLista", aCalm3);
      aCalm4 = bdc.listarPartidas(0);
      request.setAttribute("PartidasLista", aCalm4);
      aCalm5 = bdc.listarOficinas(0,fInicio.getCod_reg());
      request.setAttribute("OficinasLista", aCalm5);
      aCalm6 = bdc.listarFuncionarios(0,fInicio.getCod_reg());
      request.setAttribute("FuncionariosLista", aCalm6);
      aCalm7 = bdc.listarUbicaciones(0,fInicio.getCod_reg());
      request.setAttribute("UbicacionesLista", aCalm7);
      aCalm8 = bdc.listarFinanciadores(0);
      request.setAttribute("FinanciadoresLista", aCalm8);
      aCalm9 = bdc.listarProyectos(0);
      request.setAttribute("ProyectosLista", aCalm9);
      aCalm10 = bdc.listarTiposbaja(0);
      request.setAttribute("TiposBajaLista", aCalm10);
      if(finform.getAct_codrub() != null && finform.getAct_codrub().equals("01")){
        aCalm12 = new ArrayList();
        EstadosForm d1 = new EstadosForm();
        d1.setEstado("B");
        d1.setDesestado("BUENO");
        aCalm12.add(d1); 
        request.setAttribute("EstadosLista", aCalm12);
      }
      else{
        aCalm12 = bdc.listarEstados();
        request.setAttribute("EstadosLista", aCalm12);
      }
      
      if (finform.getOperacion()==1)
      {  
          if (finform.getOpcion()==1)
          { 
             desrub = bdc.DescripcionRubro(finform.getAct_codrub());
             finform.setAct_rubdescripcion(desrub);
             codpar = bdc.PartidaRubro(finform.getAct_codrub());
             finform.setAct_codpar(codpar);
             despar = bdc.DescripcionPartida(finform.getAct_codrub());
             finform.setAct_pardescripcion(despar);
             codfun = bdc.FuncionarioActivos(fInicio.getCod_reg(),fInicio.getCod_fin());    
             codofi = bdc.OficinaFuncionarioActivos(codfun);
             finform.setAct_codfun(codfun);
             finform.setAct_codofi(codofi);
             finform.setAct_fundescripcion(bdc.nombrefuncionario(codfun));             
             finform.setAct_ofidescripcion(bdc.nombreoficina(codofi,fInicio.getCod_reg()));
             num = bdc.maximoSecbarras(finform.getAct_codrub(),fInicio.getCod_reg());
             finform.setAct_codigo(num);
             if (finform.getAct_codigo()<10000)
                ceros="0";
             if (finform.getAct_codigo()<1000)
                ceros="00";
             if (finform.getAct_codigo()<100)
                ceros="000";
             if (finform.getAct_codigo()<10)
                ceros="0000";
             finform.setAct_codbarra(finform.getAct_codrub()+fInicio.getCod_reg()+ceros+finform.getAct_codigo());
             vidautrub = bdc.VidaUtilRubro(finform.getAct_codrub());
             finform.setRev_vidaut(vidautrub);
             if (!(
             (finform.getAct_codrub().equals("01"))
             ||
             (finform.getAct_codrub().equals("02"))
             ||
             (finform.getAct_codrub().equals("05"))
             ))
                 finform.setAct_umanejo("PZA");
             //desreg = bdc.DescripcionRegional(finform.getAct_codreg());
             //finform.setAct_regdescripcion(desreg);
             if (num==0){
               mensaje="No está definido correlativo (Código Barras)";
               error.add("error", new ActionMessage("error", mensaje));
               saveErrors( request, error );                 
               finform.setOperacion(5);
             }
          }
          if (finform.getOpcion()!=1){
             aCalm = bdc.listarActivos4(finform.getAct_codrub(),fInicio.getCod_reg(),finform.getAct_descripcion(),finform.getAct_codgrp(),finform.getAct_codfin(),finform.getOpcion());
             if (aCalm.size()!=0) {
                request.setAttribute("ActivosLista", aCalm);
                ArrayList datos = (ArrayList) request.getAttribute("ActivosLista");
                ActivosDetalleForm d = new ActivosDetalleForm();        
                d = (ActivosDetalleForm) datos.get(it);  
                finform.setAct_codrub(d.getcodrub());       
                finform.setAct_codreg(d.getcodreg());
                finform.setCodregor(d.getcodreg());
                finform.setAct_codigo(d.getcodigo());
                finform.setAct_codgrp(d.getcodgrp());
                finform.setAct_codpar(d.getcodpar());
                finform.setAct_codofi(d.getcodofi());
                finform.setAct_codfun(d.getcodfun());
                finform.setAct_codubi(d.getcodubi());
                finform.setAct_codfin(d.getcodfin());
                finform.setAct_codpry(d.getcodpry());
                finform.setAct_codmot(d.getcodmot());
                finform.setAct_feccompra(d.getfeccompra());
                finform.setAct_tipcam(d.gettipcam());
                finform.setAct_tipufv(d.gettipufv());
                finform.setAct_umanejo(d.getumanejo());
                finform.setAct_descripcion(d.getdescripcion());
                finform.setAct_desadicional(d.getdesadicional());
                finform.setAct_accesorios(d.getaccesorios());
                finform.setAct_proveedor(d.getproveedor());
                finform.setAct_marca(d.getmarca());
                finform.setAct_modelo(d.getmodelo());
                finform.setAct_serie1(d.getserie1());
                finform.setAct_serie2(d.getserie2());
                finform.setAct_docreferencia(d.getdocreferencia());
                finform.setAct_fecreferencia(d.getfecreferencia());
                finform.setAct_docrefotro(d.getdocrefotro());
                finform.setAct_placa(d.getplaca());
                finform.setAct_aniofabricacion(d.getaniofabricacion());
                finform.setAct_color(d.getcolor());
                finform.setAct_procedencia(d.getprocedencia());
                finform.setAct_gobmunicipal(d.getgobmunicipal());
                finform.setAct_valcobol(d.getvalcobol());
                finform.setAct_valcodol(d.getvalcodol());
                finform.setAct_valcoufv(d.getvalcoufv());
                finform.setAct_fecbaja(d.getfecbaja());
                finform.setAct_ordencompra(d.getordencompra());
                finform.setAct_numfactura(d.getnumfactura());
                finform.setAct_numcomprobante(d.getnumcomprobante());
                finform.setAct_codanterior(d.getcodanterior());
                finform.setAct_indetiqueta(d.getindetiqueta());            
                finform.setRev_fecha(d.getfecha());     
                finform.setRev_vidaut(d.getvidaut());
                finform.setRev_estadoactivo(d.getestadoactivo());            
                finform.setDesestado(d.getDescripcionestado());
                finform.setRev_desestado(d.getdesestado());
                finform.setRev_indepreciacion(d.getindepreciacion());
                finform.setRev_numdocumento(d.getnumdocumento());
                desrub = bdc.DescripcionRubro(finform.getAct_codrub());
                finform.setAct_rubdescripcion(desrub);
                codpar = bdc.PartidaRubro(finform.getAct_codrub());
                finform.setAct_codpar(codpar);
                despar = bdc.DescripcionPartida(finform.getAct_codrub());
                finform.setAct_pardescripcion(despar);
                codfun = bdc.FuncionarioActivos(fInicio.getCod_reg(),fInicio.getCod_fin());    
                if (!(finform.getAct_codfun().equals(codfun)))
                   codfun=finform.getAct_codfun();
                codofi = bdc.OficinaFuncionarioActivos(codfun);
                finform.setAct_codfun(codfun);
                finform.setAct_codofi(codofi);
                finform.setAct_fundescripcion(bdc.nombrefuncionario(codfun));             
                finform.setAct_ofidescripcion(bdc.nombreoficina(codofi,fInicio.getCod_reg()));             
                if (finform.getAct_codigo()<10000)
                   ceros="0";
                if (finform.getAct_codigo()<1000)
                   ceros="00";
                if (finform.getAct_codigo()<100)
                   ceros="000";
                if (finform.getAct_codigo()<10)
                   ceros="0000";
                finform.setAct_codbarra(finform.getAct_codrub()+fInicio.getCod_reg()+ceros+finform.getAct_codigo());             
                finform.setAct_grpdescripcion(bdc.nombregrupo(finform.getAct_codrub(),finform.getAct_codgrp()));
                finform.setAct_ubidescripcion(bdc.nombreubicacion(fInicio.getCod_reg(),finform.getAct_codubi()));
                finform.setAct_prydescripcion(bdc.nombreproyecto(finform.getAct_codpry()));
                finform.setAct_findescripcion(bdc.nombrefinanciador(finform.getAct_codfin()));
             }
             else 
             {
                mensaje="No existe Activo con esta caracteristica";
                error.add("error", new ActionMessage("error", mensaje));
                saveErrors( request, error );                 
                finform.setOperacion(5);
             }
          }
      }
      if (finform.getOperacion()==2)
      {
          try {
             String msgsql = null;
             String serie = null;
             String codigo = null;
             serie =  finform.getAct_serie1();
             codigo =  finform.getAct_codrub()+finform.getCodregor()+finform.getAct_codigo();
             msgsql = bdc.insertaractivos(
             finform.getAct_codrub(),
             finform.getCodregor(),
//             finform.getAct_codreg(),
             finform.getAct_codigo(),
             finform.getAct_codgrp(),
             finform.getAct_codpar(),
             finform.getAct_codofi(),
             finform.getAct_codfun(),
             finform.getAct_codubi(),
             finform.getAct_codfin(),
             finform.getAct_codpry(),
             finform.getAct_codmot(),
             finform.getAct_feccompra(),
             finform.getAct_tipcam(),
             finform.getAct_tipufv(),
             finform.getAct_umanejo(),
             finform.getAct_descripcion(),
             finform.getAct_desadicional(),
             finform.getAct_accesorios(),
             finform.getAct_proveedor(),
             finform.getAct_marca(),
             finform.getAct_modelo(),
             finform.getAct_serie1(),
             finform.getAct_serie2(),
             finform.getAct_docreferencia(),
             finform.getAct_fecreferencia(),
             finform.getAct_docrefotro(),
             finform.getAct_placa(),
             finform.getAct_aniofabricacion(),
             finform.getAct_color(),
             finform.getAct_procedencia(),
             finform.getAct_gobmunicipal(),
             finform.getAct_valcobol(),
             finform.getAct_valcodol(),
             finform.getAct_valcoufv(),
             finform.getAct_fecbaja(),
             finform.getAct_ordencompra(),
             finform.getAct_numfactura(),
             finform.getAct_numcomprobante(),
             finform.getAct_codanterior(),
             finform.getAct_indetiqueta(),
             finform.getRev_fecha(),
             finform.getRev_vidaut(),
             finform.getRev_estadoactivo(),
             finform.getRev_desestado(),
             finform.getRev_indepreciacion(),
             finform.getRev_numdocumento(),
             fInicio.getTxt_usu(),
             finform.getOpcion()
             );           
             if (finform.getOpcion()==1){
                finform.setAct_codrub("");       
                finform.setAct_codreg("");
                finform.setAct_codfin("");
             }
             finform.setAct_codigo(0);
             finform.setAct_codgrp("");
             finform.setAct_codpar("");
             finform.setAct_codofi("");
             finform.setAct_codfun("");
             finform.setAct_codubi("");
             
             finform.setAct_codpry("");
             finform.setAct_codmot("");
             finform.setAct_feccompra("");
             finform.setAct_tipcam(0);
             finform.setAct_tipufv(0);
             finform.setAct_umanejo("");
             finform.setAct_descripcion("");
             finform.setAct_desadicional("");
             finform.setAct_accesorios("");
             finform.setAct_proveedor("");
             finform.setAct_marca("");
             finform.setAct_modelo("");
             finform.setAct_serie1("");
             finform.setAct_serie2("");
             finform.setAct_docreferencia("");
             finform.setAct_fecreferencia("");
             finform.setAct_docrefotro("");
             finform.setAct_placa("");
             finform.setAct_aniofabricacion("");
             finform.setAct_color("");
             finform.setAct_procedencia("");
             finform.setAct_gobmunicipal("");             
             finform.setAct_valcobol("");
             finform.setAct_valcodol("");
             finform.setAct_valcoufv("");
             finform.setAct_fecbaja("");
             finform.setAct_ordencompra("");
             finform.setAct_numfactura("");
             finform.setAct_numcomprobante("");
             finform.setAct_codanterior("");
             finform.setAct_indetiqueta("");      
             finform.setRev_fecha("");     
             finform.setRev_vidaut(0);
             finform.setRev_estadoactivo("");            
             finform.setRev_desestado("");
             finform.setRev_indepreciacion("");
             finform.setRev_numdocumento("");
             if (finform.getOpcion()>=2)
                finform.setOperacion(6);
             if (!msgsql.equals("0")) { 

                if (msgsql.equals("2")) { 
                    error.add("error", new ActionMessage("error", "La transacción fue realizada correctamente, pero el número de serie <strong>'"+ serie +"'</strong> se encuentra repetido." ));
                    saveErrors( request, error );  
                }
                else
                {
                error.add("error", new ActionMessage("error", msgsql));
                saveErrors( request, error );
                }
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
            desgrp=bdc.nombregrupo(finform.getAct_codrub(),finform.getAct_codgrp());
            aCalm11 = bdc.listarActivos3(finform.getAct_codrub(),fInicio.getCod_reg(),finform.getAct_descripcion(),finform.getAct_codgrp(),finform.getAct_codfin(),finform.getOpcion(),desgrp);
            if (aCalm11.size()!=0) {
               request.setAttribute("Activos3Lista", aCalm11);
            }
            else 
            {
               mensaje="No existe Activos con esta caracteristica";
               error.add("error", new ActionMessage("error", mensaje));
               saveErrors( request, error );               
               finform.setOperacion(5);               
            }       
       }
       if (finform.getOperacion()!=4) {
          desrub = bdc.DescripcionRubro(finform.getAct_codrub());
          finform.setAct_rubdescripcion(desrub);       
          aCalm111 = bdc.listarParametros();
          if (finform.getOpcion()<=3) {
             if (finform.getOperacion()!=6) {
                if (codrub.equals(aCalm111.getCte_codrub1()))
                  return mapping.findForward("volver1");
                else if (codrub.equals(aCalm111.getCte_codrub2()))
                  return mapping.findForward("volver1");
                else if (codrub.equals(aCalm111.getCte_codrub3())){
                  if (finform.getOpcion()==3)
                    return mapping.findForward("volver21");
                  else
                    return mapping.findForward("volver2");
                }
                else if (codrub.equals(aCalm111.getCte_codrub4()))
                  return mapping.findForward("volver3");
                else if (codrub.equals(aCalm111.getCte_codrub5()))
                  return mapping.findForward("volver4");
                else if (codrub.equals(aCalm111.getCte_codrub6()))
                  return mapping.findForward("volver4");
                else
                  return mapping.findForward("volver");
             }
             else {
                if (codrub.equals(aCalm111.getCte_codrub1()))
                  return mapping.findForward("volver11B");
                else if (codrub.equals(aCalm111.getCte_codrub2()))
                  return mapping.findForward("volver11B");
                else if (codrub.equals(aCalm111.getCte_codrub3()))
                  return mapping.findForward("volver12B");
                else if (codrub.equals(aCalm111.getCte_codrub4()))
                  return mapping.findForward("volver13B");
                else if (codrub.equals(aCalm111.getCte_codrub5()))
                  return mapping.findForward("volver14B");
                else if (codrub.equals(aCalm111.getCte_codrub6()))
                  return mapping.findForward("volver14B");
                else
                  return mapping.findForward("volver10B");   
             }
          }
          else
          {
             if ((finform.getOpcion()==5)&&(finform.getOperacion()==1)) {
                if (codrub.equals(aCalm111.getCte_codrub1()))
                  return mapping.findForward("volver11A");
                else if (codrub.equals(aCalm111.getCte_codrub2()))
                  return mapping.findForward("volver11A");
                else if (codrub.equals(aCalm111.getCte_codrub3()))
                  return mapping.findForward("volver12A");
                else if (codrub.equals(aCalm111.getCte_codrub4()))
                  return mapping.findForward("volver13A");
                else if (codrub.equals(aCalm111.getCte_codrub5()))
                  return mapping.findForward("volver14A");
                else if (codrub.equals(aCalm111.getCte_codrub6()))
                  return mapping.findForward("volver14A");
                else
                  return mapping.findForward("volver10A");   
             }
             else 
             {
                if (codrub.equals(aCalm111.getCte_codrub1()))
                  return mapping.findForward("volver11");
                else if (codrub.equals(aCalm111.getCte_codrub2()))
                  return mapping.findForward("volver11");
                else if (codrub.equals(aCalm111.getCte_codrub3()))
                  return mapping.findForward("volver12");
                else if (codrub.equals(aCalm111.getCte_codrub4()))
                  return mapping.findForward("volver13");
                else if (codrub.equals(aCalm111.getCte_codrub5()))
                  return mapping.findForward("volver14");
                else if (codrub.equals(aCalm111.getCte_codrub6()))
                  return mapping.findForward("volver14");
                else
                  return mapping.findForward("volver10");   
             }
          }
       }
       else {
          error.add("error", new ActionMessage("error", mensaje));
          saveErrors( request, error );
          return mapping.findForward("volver");
       }
    }
    catch (Exception e) {
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Activos"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
      return mapping.findForward("volver");     
    }
    }
    return mapping.findForward("volver"); 
  }
}