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

public class AccesoriosAction extends Action 
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
    AccesoriosForm finform = (AccesoriosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;
    ArrayList aCalm3;
    ArrayList aCalm4;    
    System.out.println("Paso conexion");
    int it = 0;
    try { 
      aCalm2 = bdc.listarRubros(0);
      request.setAttribute("RubrosLista", aCalm2);
      aCalm3 = bdc.listarRegionales(0);
      request.setAttribute("RegionalesLista", aCalm3);
      aCalm4 = bdc.listarGrupos(0);
      request.setAttribute("GruposLista", aCalm4);
      System.out.println(finform.getOpcion());
      System.out.println(finform.getOperacion());
      if (finform.getOperacion()==1)
      {  
          aCalm = bdc.listarAccesorios(finform.getAcc_codrub(),finform.getAcc_codreg(),finform.getAcc_codigo());            
          request.setAttribute("AccesoriosLista", aCalm);
          ArrayList datos = (ArrayList) request.getAttribute("AccesoriosLista");      
          if (finform.getOpcion()==2)
          {
             System.out.println("Entro por modificar");
          }
          if (finform.getOpcion()==3) 
          {
             System.out.println("Entro por elimonar");
          }
          AccesoriosDetalleForm d = new AccesoriosDetalleForm();
          d = (AccesoriosDetalleForm) datos.get(it);  
          finform.setAcc_codrub(d.getCodrub());       
          finform.setAcc_codreg(d.getCodreg());
          finform.setAcc_codigo(d.getCodigo());
          finform.setAcc_codrubact(d.getCodrubact());
          finform.setAcc_codregact(d.getCodregact());
          finform.setAcc_codigoact(d.getCodigoact());
          finform.setAcc_codgrp(d.getCodgrp());
          finform.setAcc_codmot(d.getCodmot());
          finform.setAcc_feccompra(d.getFeccompra());
          finform.setAcc_tipcam(d.getTipcam());
          finform.setAcc_tipufv(d.getTipufv());
          finform.setAcc_umanejo(d.getUmanejo());
          finform.setAcc_descripcion(d.getDescripcion());
          finform.setAcc_desadicional(d.getDesadicional());
          finform.setAcc_proveedor(d.getProveedor());
          finform.setAcc_marca(d.getMarca());
          finform.setAcc_modelo(d.getModelo());
          finform.setAcc_serie1(d.getSerie1());
          finform.setAcc_serie2(d.getSerie2());
          finform.setAcc_docreferencia(d.getDocreferencia());
          finform.setAcc_fecreferencia(d.getFecreferencia());
          finform.setAcc_valcobol(d.getValcobol());
          finform.setAcc_valcodol(d.getValcodol());
          finform.setAcc_valcoufv(d.getValcoufv());
          finform.setAcc_fecbaja(d.getFecbaja());
          finform.setAcc_docbaja(d.getDocbaja());
          finform.setAcc_ordencompra(d.getOrdencompra());
          finform.setAcc_numfactura(d.getNumfactura());
          finform.setAcc_numcomprobante(d.getNumcomprobante());
          finform.setAcc_codanterior(d.getCodanterior());
          finform.setAcc_indetiqueta(d.getIndetiqueta());
      }
      if (finform.getOperacion()==2)
      {
          try {
             String msgsql=null;
             msgsql = bdc.insertaraccesorios(finform.getAcc_codrub(), finform.getAcc_codreg(), finform.getAcc_codigo(),finform.getAcc_codrubact(),finform.getAcc_codregact(),finform.getAcc_codigoact(),finform.getAcc_codgrp(),finform.getAcc_codmot(),finform.getAcc_feccompra(),finform.getAcc_tipcam(),finform.getAcc_tipufv(),finform.getAcc_umanejo(),finform.getAcc_descripcion(),finform.getAcc_desadicional(),finform.getAcc_proveedor(),finform.getAcc_marca(),finform.getAcc_modelo(),finform.getAcc_serie1(),finform.getAcc_serie2(),finform.getAcc_docreferencia(),finform.getAcc_fecreferencia(),finform.getAcc_valcobol(),finform.getAcc_valcodol(),finform.getAcc_valcoufv(),finform.getAcc_fecbaja(),finform.getAcc_docbaja(),finform.getAcc_ordencompra(),finform.getAcc_numfactura(),finform.getAcc_numcomprobante(),finform.getAcc_codanterior(),finform.getAcc_indetiqueta(),fInicio.getTxt_usu(),finform.getOpcion());
             System.out.println("Paso insertar");
             finform.setAcc_codrub("");       
             finform.setAcc_codreg("");
             finform.setAcc_codigo(0);
             finform.setAcc_codrubact("");
             finform.setAcc_codregact("");
             finform.setAcc_codigoact(0);
             finform.setAcc_codgrp("");
             finform.setAcc_codmot("");
             finform.setAcc_feccompra("");
             finform.setAcc_tipcam(0);
             finform.setAcc_tipufv(0);
             finform.setAcc_umanejo("");
             finform.setAcc_descripcion("");
             finform.setAcc_desadicional("");
             finform.setAcc_proveedor("");
             finform.setAcc_marca("");
             finform.setAcc_modelo("");
             finform.setAcc_serie1("");
             finform.setAcc_serie2("");
             finform.setAcc_docreferencia("");
             finform.setAcc_fecreferencia("");
             finform.setAcc_valcobol(0);
             finform.setAcc_valcodol(0);
             finform.setAcc_valcoufv(0);
             finform.setAcc_fecbaja("");
             finform.setAcc_docbaja("");
             finform.setAcc_ordencompra("");
             finform.setAcc_numfactura(0);
             finform.setAcc_numcomprobante(0);
             finform.setAcc_codanterior("");
             finform.setAcc_indetiqueta("");
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
    }
    catch (Exception e) {
      error.add("error", new ActionMessage("errordb", "No se pudo iniciar Accesorios"));
      error.add("error", new ActionMessage("errordb", e.toString() ));
      e.printStackTrace();
      saveErrors( request, error );
    }
    return mapping.findForward("volver");
  }
}