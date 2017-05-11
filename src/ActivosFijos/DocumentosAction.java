package ActivosFijos;
import java.io.File;
import java.io.IOException;

import java.sql.*;
import oracle.jdbc.driver.*;
import java.util.*; 
import java.text.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JasperRunManager;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 
import javax.mail.BodyPart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

public class DocumentosAction extends Action 
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
    DocumentosForm finform = (DocumentosForm)form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    finform.setDoc_codreg(fInicio.getCod_reg());
    finform.setDoc_codfin(fInicio.getCod_fin());
    finform.setDoc_regdescripcion(fInicio.getRegional());    
    finform.setDoc_findescripcion(fInicio.getFinanciador());
    String usuario = fInicio.getNombreUsuario();
    BDConection bdc = new BDConection();
    ArrayList aCalm;
    ArrayList aCalm2;
    ArrayList aCalm3;
    ArrayList aCalm7;
    ArrayList aCalm8;
    ArrayList aCalm9;
    ArrayList aCalm10;
    ArrayList aCalm11;
    //ArrayList aCalm12;    
    int       num;
    String    codfun;
    String    feccierre;
    String    mensaje=null;
    String    msgsql;
    String    pathjasper;
    String    subreportjasper;
    File      reportfile;    
    String    numero;
    String    gestion;
    String    correo="";
    String    de_quien="";
    String    a_quien="";
    String    desac;
    Connection l_connection = null;
    aCalm=null;
    aCalm2=null;
    aCalm3=null;
    aCalm7=null;
    aCalm8=null;
    aCalm9=null;
    aCalm10=null;
    aCalm11=null;
    //aCalm12=null;    
    if (!(fInicio.getNombreUsuario().equals("SALIO"))) {
       int it = 0;
    try {   
        l_connection = bdc.getConexion();
        MesAnioDetalleForm mesanio = bdc.listarMesAnio();
        finform.setMes(mesanio.getMes());
        finform.setAnio(mesanio.getAnio());
        ParametrosForm aCalm18 = bdc.listarParametros();
        /*finform.setGestionant(aCalm18.getCte_gestion());*/
        finform.setCte_tipdocbaja(aCalm18.getCte_tipdocbaja());
        finform.setCte_tipdocdevolucion(aCalm18.getCte_tipdocdevolucion());
        finform.setCte_tipdocentrega(aCalm18.getCte_tipdocentrega());
        finform.setCte_tipdoctransferencia(aCalm18.getCte_tipdoctransferencia()); 
        if (finform.getOperacion()==3){
              if ((finform.getOpcion()==1)||(finform.getOpcion()==10)||(finform.getOpcion()==11)){/*Insertar*/
                    msgsql=null;
                    msgsql = bdc.insertardocumentos(finform.getDoc_codreg(),finform.getDoc_tipdoc(),
                    finform.getDoc_numero(),finform.getDoc_fecha(),finform.getDoc_codofiorigen(),
                    finform.getDoc_codfunorigen(),finform.getDoc_codubiorigen(),
                    finform.getDoc_codfin(),finform.getDoc_codfinorigen(),
                    finform.getDoc_codpryorigen(),finform.getDoc_codregdestino(),
                    finform.getDoc_codofidestino(),finform.getDoc_codfundestino(),
                    finform.getDoc_codubidestino(),finform.getDoc_codfindestino(),
                    finform.getDoc_codprydestino(),finform.getDoc_observacion(),
                    finform.getDoc_inconfirma(),fInicio.getTxt_usu(),finform.getOpcion(),finform.getDoc_devolucion());           
                    if (!msgsql.equals("0")) {
                       aCalm7 = bdc.listarTiposdoc(0,1,fInicio.getCod_fin(),fInicio.getCod_reg());
                       request.setAttribute("TiposDocumentosLista", aCalm7);
                       error.add("error", new ActionMessage("error", msgsql));
                       saveErrors( request, error );
                       finform.setOperacion(5);
                       finform.setOpcion(1);
                     }
                    else { 
                       finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
                       finform.setDoc_fundesnombre(bdc.nombrefuncionario(finform.getDoc_codfundestino()));
                       aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
                       request.setAttribute("DetDocumentosLista", aCalm8);  
                       aCalm9 = bdc.listarTiposbaja(0);
                       request.setAttribute("TiposBajaLista", aCalm9);    
                       //Modificado Edgar Arteaga 15/09/2016
                       aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
                       //aCalm11 = bdc.listarOficinas2(0,fInicio.getCod_reg());
                       request.setAttribute("OficinasLista", aCalm11);
                       //aCalm12 = bdc.listarRubros(0);
                       //request.setAttribute("RubrosLista", aCalm12);               
                       //aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
                       //request.setAttribute("Activos2Lista", aCalm10);
                       finform.setDesactivo(bdc.DescripcionActivo(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo()));
                       finform.setDesbaja(bdc.nombretipobaja(finform.getDdo_codmot()));
                       finform.setDesofi(bdc.nombreoficina(finform.getDdo_codofiactual(),finform.getDoc_codreg()));
                       num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
                       finform.setDdo_item(num);             
                 }         
              }
              if (finform.getOpcion()==2){/*Modificar*/
                 msgsql=null;
                 msgsql = bdc.insertardocumentos(finform.getDoc_codreg(),finform.getDoc_tipdoc(),
                 finform.getDoc_numero(),finform.getDoc_fecha(),finform.getDoc_codofiorigen(),
                 finform.getDoc_codfunorigen(),finform.getDoc_codubiorigen(),
                 finform.getDoc_codfin(),finform.getDoc_codfinorigen(),
                 finform.getDoc_codpryorigen(),finform.getDoc_codregdestino(),
                 finform.getDoc_codofidestino(),finform.getDoc_codfundestino(),
                 finform.getDoc_codubidestino(),finform.getDoc_codfindestino(),
                 finform.getDoc_codprydestino(),finform.getDoc_observacion(),
                 finform.getDoc_inconfirma(),fInicio.getTxt_usu(),finform.getOpcion(),0);
                 if (!msgsql.equals("0")) {
                    aCalm7 = bdc.listarTiposdoc(0,1,fInicio.getCod_fin(),fInicio.getCod_reg());
                    request.setAttribute("TiposDocumentosLista", aCalm7);
                    error.add("error", new ActionMessage("error", msgsql));
                    saveErrors( request, error );
                 }
                 else {
                    finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
                    finform.setDoc_fundesnombre(bdc.nombrefuncionario(finform.getDoc_codfundestino()));
                    aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
                    request.setAttribute("DetDocumentosLista", aCalm8);  
                    aCalm9 = bdc.listarTiposbaja(0);
                    request.setAttribute("TiposBajaLista", aCalm9);                
                    aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
                    request.setAttribute("OficinasLista", aCalm11);               
                    //aCalm12 = bdc.listarRubros(0);
                    //request.setAttribute("RubrosLista", aCalm12);                 
                    //aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
                    //request.setAttribute("Activos2Lista", aCalm10);
                    finform.setDesactivo(bdc.DescripcionActivo(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo()));
                    finform.setDesbaja(bdc.nombretipobaja(finform.getDdo_codmot()));
                    finform.setDesofi(bdc.nombreoficina(finform.getDdo_codofiactual(),finform.getDoc_codreg()));
                    num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
                    finform.setDdo_item(num);             
                }                  
                 
              }
              if (finform.getOpcion()==3){/*Eliminar*/
                 aCalm = bdc.listarActas(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
                 it = finform.getFila();
                 request.setAttribute("DocumentosLista", aCalm);
                 ArrayList datos = (ArrayList) request.getAttribute("DocumentosLista");
                 DocumentosDetalleForm d = new DocumentosDetalleForm();        
                 d = (DocumentosDetalleForm) datos.get(it);  
                 finform.setDoc_codreg(d.getcodreg());
                 finform.setDoc_tipdoc(d.gettipdoc());
                 finform.setDoc_numero(d.getnumero());
                 finform.setDoc_fecha(d.getfecha());
                 finform.setDoc_codfunorigen(d.getcodfunorigen());
                 finform.setDoc_codfundestino(d.getcodfundestino());
                 finform.setDoc_observacion(d.getobservacion());
                 finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
                 finform.setDoc_fundesnombre(bdc.nombrefuncionario(finform.getDoc_codfundestino()));
                 finform.setDoc_ofiorinombre(bdc.nombreoficina(finform.getDoc_codofiorigen(),finform.getDoc_codreg()));
                 finform.setDoc_ofidesnombre(bdc.nombreoficina(finform.getDoc_codofidestino(),finform.getDoc_codreg()));
                 finform.setDoc_carorinombre(bdc.nombrecargo(finform.getDoc_codfunorigen()));
                 finform.setDoc_cardesnombre(bdc.nombrecargo(finform.getDoc_codfundestino()));            
                 aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
                 request.setAttribute("DetDocumentosLista", aCalm8);  
                 aCalm9 = bdc.listarTiposbaja(0);
                 request.setAttribute("TiposBajaLista", aCalm9);
                 aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
                 request.setAttribute("OficinasLista", aCalm11);            
                 //aCalm12 = bdc.listarRubros(0);
                 //request.setAttribute("RubrosLista", aCalm12);              
                 //aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
                 //request.setAttribute("Activos2Lista", aCalm10);
                 finform.setDesactivo(bdc.DescripcionActivo(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo()));
                 finform.setDesbaja(bdc.nombretipobaja(finform.getDdo_codmot()));
                 finform.setDesofi(bdc.nombreoficina(finform.getDdo_codofiactual(),finform.getDoc_codreg()));
                 num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
                 finform.setDdo_item(num);
              }
              if (finform.getOpcion()==4){/*Confirmar*/
                 aCalm = bdc.listarActas(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
                 it = finform.getFila();
                 request.setAttribute("DocumentosLista", aCalm);
                 ArrayList datos = (ArrayList) request.getAttribute("DocumentosLista");
                 DocumentosDetalleForm d = new DocumentosDetalleForm();        
                 d = (DocumentosDetalleForm) datos.get(it);  
                 finform.setDoc_codreg(d.getcodreg());
                 finform.setDoc_tipdoc(d.gettipdoc());
                 finform.setDoc_numero(d.getnumero());
                 finform.setDoc_fecha(d.getfecha());
                 finform.setDoc_codfunorigen(d.getcodfunorigen());
                 finform.setDoc_codfundestino(d.getcodfundestino());
                 finform.setDoc_observacion(d.getobservacion());
                 finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
                 finform.setDoc_fundesnombre(bdc.nombrefuncionario(finform.getDoc_codfundestino()));
                 finform.setDoc_ofiorinombre(bdc.nombreoficina(finform.getDoc_codofiorigen(),finform.getDoc_codreg()));
                 finform.setDoc_ofidesnombre(bdc.nombreoficina(finform.getDoc_codofidestino(),finform.getDoc_codreg()));
                 finform.setDoc_carorinombre(bdc.nombrecargo(finform.getDoc_codfunorigen()));
                 finform.setDoc_cardesnombre(bdc.nombrecargo(finform.getDoc_codfundestino()));            
                 aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
                 request.setAttribute("DetDocumentosLista", aCalm8);  
                 aCalm9 = bdc.listarTiposbaja(0);
                 request.setAttribute("TiposBajaLista", aCalm9);
                 aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
                 request.setAttribute("OficinasLista", aCalm11);      
                 //aCalm12 = bdc.listarRubros(0);
                 //request.setAttribute("RubrosLista", aCalm12);              
                 //aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
                 //request.setAttribute("Activos2Lista", aCalm10);
                 finform.setDesactivo(bdc.DescripcionActivo(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo()));
                 finform.setDesbaja(bdc.nombretipobaja(finform.getDdo_codmot()));
                 finform.setDesofi(bdc.nombreoficina(finform.getDdo_codofiactual(),finform.getDoc_codreg()));
                 num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
                 finform.setDdo_item(num);
              }
              if (finform.getOpcion()==5){/*Reportar*/
                 aCalm = bdc.listarActas(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
                 it = finform.getFila();
                 request.setAttribute("DocumentosLista", aCalm);
                 ArrayList datos = (ArrayList) request.getAttribute("DocumentosLista");
                 DocumentosDetalleForm d = new DocumentosDetalleForm();        
                 d = (DocumentosDetalleForm) datos.get(it);  
                 finform.setDoc_codreg(d.getcodreg());
                 finform.setDoc_tipdoc(d.gettipdoc());
                 finform.setDoc_numero(d.getnumero());         
                 gestion=bdc.Gestion();
                 numero=String.valueOf(finform.getDoc_numero());
                 if (finform.getDoc_tipdoc().equals("E")) {
                    try {
                       pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/acta01.jasper");              
                       subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
                       reportfile = new File(pathjasper);
                       if (reportfile.exists()) { 
                          Map parameters = new HashMap();
                          parameters.put("par_usuario", fInicio.getTxt_usu());
                          parameters.put("ddo_codreg", finform.getDoc_codreg());
                          parameters.put("ddo_codfin", fInicio.getCod_fin());
                          parameters.put("ddo_tipdoc", finform.getDoc_tipdoc());
                          parameters.put("ddo_gestion", finform.getGestionant());
                          parameters.put("ddo_numero", numero);                     
                          byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameters, l_connection); 
                          response.setContentType("application/pdf"); 
                          response.setContentLength(bytes.length); 
                          ServletOutputStream ouputStream = response.getOutputStream(); 
                          ouputStream.write(bytes, 0, bytes.length); 
                          ouputStream.flush(); 
                          ouputStream.close();
                       }
                       else {   
                          error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
                          saveErrors( request, error );
                       }
                      }
                      catch (Exception e){
                         error.add("error", new ActionMessage("error", e.getMessage()));
                         saveErrors( request, error );
                      }
                 }
                 else if (finform.getDoc_tipdoc().equals("U")) {
                         pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/acta05.jasper");              
                         subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
                         reportfile = new File(pathjasper);
                         if (reportfile.exists()) { 
                            Map parameters = new HashMap();
                            parameters.put("par_usuario", fInicio.getTxt_usu());
                            parameters.put("ddo_codreg", finform.getDoc_codreg());
                            parameters.put("ddo_codfin", fInicio.getCod_fin());
                            parameters.put("ddo_tipdoc", "U");
                            parameters.put("ddo_gestion", finform.getGestionant());
                            parameters.put("ddo_numero", numero); 
                            byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameters, l_connection); 
                            response.setContentType("application/pdf"); 
                            response.setContentLength(bytes.length); 
                            ServletOutputStream ouputStream = response.getOutputStream(); 
                            ouputStream.write(bytes, 0, bytes.length); 
                            ouputStream.flush(); 
                            ouputStream.close();
                      }
                      else {   
                         error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
                         saveErrors( request, error );                     
                      }
                }
                else if (finform.getDoc_tipdoc().equals("V")) {
                        pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/acta06.jasper");              
                        subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
                        reportfile = new File(pathjasper);
                        if (reportfile.exists()) { 
                           Map parameters = new HashMap();
                           parameters.put("par_usuario", fInicio.getTxt_usu());
                           parameters.put("ddo_codreg", finform.getDoc_codreg());
                           parameters.put("ddo_codfin", fInicio.getCod_fin());
                           parameters.put("ddo_tipdoc", "V");
                           parameters.put("ddo_gestion", finform.getGestionant());
                           parameters.put("ddo_numero", numero); 
                           byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameters, l_connection); 
                           response.setContentType("application/pdf"); 
                           response.setContentLength(bytes.length); 
                           ServletOutputStream ouputStream = response.getOutputStream(); 
                           ouputStream.write(bytes, 0, bytes.length); 
                           ouputStream.flush(); 
                           ouputStream.close();
                        }
                        else {   
                           error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
                           saveErrors( request, error );                     
                        }
                  }
                  else if (finform.getDoc_tipdoc().equals("T")) {
                          pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/acta02.jasper");              
                          subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
                          reportfile = new File(pathjasper);
                          if (reportfile.exists()) { 
                             Map parameters = new HashMap();
                             parameters.put("par_usuario", fInicio.getTxt_usu());
                             parameters.put("ddo_codreg", finform.getDoc_codreg());
                             parameters.put("ddo_codfin", fInicio.getCod_fin());
                             parameters.put("ddo_tipdoc", finform.getDoc_tipdoc());
                             parameters.put("ddo_gestion", finform.getGestionant());
                             parameters.put("ddo_numero", numero); 
                             byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameters, l_connection); 
                             response.setContentType("application/pdf"); 
                             response.setContentLength(bytes.length); 
                             ServletOutputStream ouputStream = response.getOutputStream(); 
                             ouputStream.write(bytes, 0, bytes.length); 
                             ouputStream.flush(); 
                             ouputStream.close();
                        }
                        else {   
                             error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
                             saveErrors( request, error );                     
                       }
                    }
                    else if (finform.getDoc_tipdoc().equals("B")) {
                            pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/acta03.jasper");              
                            subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
                            reportfile = new File(pathjasper);
                            if (reportfile.exists()) { 
                               Map parameters = new HashMap();
                               parameters.put("par_usuario", fInicio.getTxt_usu());
                               parameters.put("ddo_codreg", finform.getDoc_codreg());
                               parameters.put("ddo_codfin", fInicio.getCod_fin());
                               parameters.put("ddo_tipdoc", finform.getDoc_tipdoc());
                               parameters.put("ddo_gestion", finform.getGestionant());
                               parameters.put("ddo_numero", numero);  
                               byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameters, l_connection); 
                               response.setContentType("application/pdf"); 
                               response.setContentLength(bytes.length); 
                               ServletOutputStream ouputStream = response.getOutputStream(); 
                               ouputStream.write(bytes, 0, bytes.length); 
                               ouputStream.flush(); 
                               ouputStream.close();
                         }
                    else {   
                       error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
                       saveErrors( request, error );                     
                    }
              }         
              else if (finform.getDoc_tipdoc().equals("D")) {
                      pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/acta04.jasper");              
                      subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
                      reportfile = new File(pathjasper);
                      if (reportfile.exists()) { 
                         Map parameters = new HashMap();
                         parameters.put("par_usuario", fInicio.getTxt_usu());
                         parameters.put("ddo_codreg", finform.getDoc_codreg());
                         parameters.put("ddo_codfin", fInicio.getCod_fin());
                         parameters.put("ddo_tipdoc", finform.getDoc_tipdoc());
                         parameters.put("ddo_gestion", finform.getGestionant());
                         parameters.put("ddo_numero", numero);  
                         byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameters, l_connection); 
                         response.setContentType("application/pdf"); 
                         response.setContentLength(bytes.length); 
                         ServletOutputStream ouputStream = response.getOutputStream(); 
                         ouputStream.write(bytes, 0, bytes.length); 
                         ouputStream.flush(); 
                         ouputStream.close();
                    }
                    else {   
                       error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
                       saveErrors( request, error );                     
                    }
              }              /*aCalm = bdc.listarActas(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
              it = finform.getFila();
              request.setAttribute("DocumentosLista", aCalm);
              ArrayList datos = (ArrayList) request.getAttribute("DocumentosLista");
              DocumentosDetalleForm d = new DocumentosDetalleForm();        
              d = (DocumentosDetalleForm) datos.get(it);  
              finform.setDoc_glosa(d.getGlosa());
              finform.setDoc_codreg(d.getcodreg());
              finform.setDoc_tipdoc(d.gettipdoc());
              finform.setDoc_numero(d.getnumero());
              finform.setDoc_fecha(d.getfecha());
              finform.setDoc_codfunorigen(d.getcodfunorigen());
              finform.setDoc_codfundestino(d.getcodfundestino());
              finform.setDoc_observacion(d.getobservacion());
              finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
              finform.setDoc_fundesnombre(bdc.nombrefuncionario(finform.getDoc_codfundestino()));
              finform.setDoc_ofiorinombre(bdc.nombreoficina(d.getcodofiorigen(),finform.getDoc_codreg()));
              finform.setDoc_ofidesnombre(bdc.nombreoficina(d.getcodofidestino(),finform.getDoc_codreg()));
              finform.setDoc_carorinombre(bdc.nombrecargo(finform.getDoc_codfunorigen()));
              finform.setDoc_cardesnombre(bdc.nombrecargo(finform.getDoc_codfundestino()));            
              aCalm8 = bdc.listarDetDocumentos2(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
              request.setAttribute("DetDocumentosLista", aCalm8);  
              aCalm9 = bdc.listarTiposbaja(0);
              request.setAttribute("TiposBajaLista", aCalm9);
              aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
              request.setAttribute("OficinasLista", aCalm11);            
              aCalm12 = bdc.listarRubros(0);
              request.setAttribute("RubrosLista", aCalm12);              
              aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
              request.setAttribute("Activos2Lista", aCalm10);            
              num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
              finform.setDdo_item(num);*/        
         }
      }
      
      if (finform.getOperacion()==7){
         if ((finform.getOpcion()==1)||(finform.getOpcion()==10)||(finform.getOpcion()==11)||(finform.getOpcion()==2)){/*Eliminar*/
            aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            it = finform.getFila();
            request.setAttribute("DetDocumentosLista", aCalm8);
            ArrayList datos = (ArrayList) request.getAttribute("DetDocumentosLista");
            DetDocumentosDetalleForm d = new DetDocumentosDetalleForm();        
            d = (DetDocumentosDetalleForm) datos.get(it);  
            finform.setDdo_item(d.getitem());           
            msgsql = bdc.insertardetdocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),
            finform.getDoc_numero(),finform.getDoc_fecha(),finform.getDoc_codfunorigen(),finform.getDdo_item(),finform.getDdo_codrubactual(),finform.getDdo_codregactual(),finform.getDdo_codigo(),finform.getDdo_codmot(),
            fInicio.getTxt_usu(),finform.getDdo_codofiactual(),finform.getDdo_codubiactual(),3);
            finform.setDdo_item(0);
            finform.setDdo_codrubactual("");
            finform.setDdo_codregactual("");
            finform.setDdo_codigo(0);
            finform.setDdo_codmot("");
            finform.setDdo_codofiactual("");
            finform.setDdo_codubiactual("");
            aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            request.setAttribute("DetDocumentosLista", aCalm8);  
            aCalm9 = bdc.listarTiposbaja(0);
            request.setAttribute("TiposBajaLista", aCalm9);
            aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
            request.setAttribute("OficinasLista", aCalm11);            
            //aCalm12 = bdc.listarRubros(0);
            //request.setAttribute("RubrosLista", aCalm12);              
            //aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
            //request.setAttribute("Activos2Lista", aCalm10);
            finform.setDesactivo(bdc.DescripcionActivo(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo()));
            finform.setDesbaja(bdc.nombretipobaja(finform.getDdo_codmot()));
            finform.setDesofi(bdc.nombreoficina(finform.getDdo_codofiactual(),finform.getDoc_codreg()));
            num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            finform.setDdo_item(num);
            finform.setOperacion(3);
            if (!msgsql.equals("0")) {
                error.add("error", new ActionMessage("error", msgsql));
                saveErrors( request, error );
            }                  
         }
      }
      if (finform.getOperacion()==2){
         aCalm7 = bdc.listarTiposdoc(0,1,fInicio.getCod_fin(),fInicio.getCod_reg());
         request.setAttribute("TiposDocumentosLista", aCalm7);
         if (finform.getOpcion()==1){/*Insertar*/
         }
         if (finform.getOpcion()==2){/*Modificar*/
         }
         if (finform.getOpcion()==4){/*Confirmar*/
         }
         if (finform.getOpcion()==5){/*Reportar*/
         }      
      }
           
      if (finform.getOperacion()==1){
         if (finform.getOpcion()==6){/*Validar*/
            finform.setOperacion(3);
            desac=null;
            desac = bdc.DescripcionActivo(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo());
            aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            request.setAttribute("DetDocumentosLista", aCalm8);  
            aCalm9 = bdc.listarTiposbaja(0);
            request.setAttribute("TiposBajaLista", aCalm9);
            aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
            request.setAttribute("OficinasLista", aCalm11); 
            finform.setDesactivo(desac);
            finform.setDesbaja(bdc.nombretipobaja(finform.getDdo_codmot()));
            finform.setDesofi(bdc.nombreoficina(finform.getDdo_codofiactual(),finform.getDoc_codreg()));
            if (desac.equals("NO Existe Activo")) {
                error.add("error", new ActionMessage("error", "No Existe el Activo o está Registrado en un Acta sin Confirmar"));
                saveErrors( request, error );
                finform.setOpcion(1);
            }         
            else 
            {
               error.add("error", new ActionMessage("error", "La Validación fue realizada correctamente"));
               saveErrors( request, error );             
            }   
            }
         else {  
         if (finform.getOpcion()==1){/*Insertar*/
            finform.setOperacion(3);
            msgsql = bdc.insertardetdocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),
            finform.getDoc_numero(),finform.getDoc_fecha(),finform.getDoc_codfunorigen(),finform.getDdo_item(),finform.getDdo_codrubactual(),finform.getDdo_codregactual(),finform.getDdo_codigo(),finform.getDdo_codmot(),
            fInicio.getTxt_usu(),finform.getDdo_codofiactual(),finform.getDdo_codubiactual(),finform.getOpcion());           
            finform.setDdo_item(0);
            finform.setDesactivo("");
            finform.setDesbaja("");
            finform.setDdo_codrubactual("");
            finform.setDdo_codregactual("");
            finform.setDdo_codigo(0);
            finform.setDdo_codmot("");
            if(finform.getDdo_codofiactual() == null){
              finform.setDdo_codofiactual("");
            }
            finform.setDdo_codubiactual("");
            aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            request.setAttribute("DetDocumentosLista", aCalm8);  
            aCalm9 = bdc.listarTiposbaja(0);
            request.setAttribute("TiposBajaLista", aCalm9);
            
            aCalm11 = bdc.listarOficinas2(0,fInicio.getCod_reg(),finform.getDdo_codofiactual());
            request.setAttribute("OficinasLista", aCalm11);            
            //aCalm12 = bdc.listarRubros(0);
            //request.setAttribute("RubrosLista", aCalm12);              
            //aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
            //request.setAttribute("Activos2Lista", aCalm10);
            finform.setDesactivo(bdc.DescripcionActivo(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo()));
            finform.setDesbaja(bdc.nombretipobaja(finform.getDdo_codmot()));
            finform.setDesofi(bdc.nombreoficina(finform.getDdo_codofiactual(),finform.getDoc_codreg()));
            num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            finform.setDdo_item(num);
            if (!msgsql.equals("0")) {
                error.add("error", new ActionMessage("error", msgsql));
                saveErrors( request, error );
            }         
            else 
            {
                error.add("error", new ActionMessage("error", "La inserción fue realizada correctamente"));
                saveErrors( request, error );             
            }       
            }
         }
         if (finform.getOpcion()==2){/*Modificar*/
            finform.setOperacion(3);
            msgsql = bdc.insertardetdocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),
            finform.getDoc_numero(),finform.getDoc_fecha(),finform.getDoc_codfunorigen(),finform.getDdo_item(),finform.getDdo_codrubactual(),finform.getDdo_codregactual(),finform.getDdo_codigo(),finform.getDdo_codmot(),
            fInicio.getTxt_usu(),finform.getDdo_codofiactual(),finform.getDdo_codubiactual(),finform.getOpcion());           
            finform.setDdo_item(0);
            finform.setDesactivo("");
            finform.setDesbaja("");
            finform.setDdo_codrubactual("");
            finform.setDdo_codregactual("");
            finform.setDdo_codigo(0);
            finform.setDdo_codmot("");
            finform.setDdo_codofiactual("");
            finform.setDdo_codubiactual("");
            aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            request.setAttribute("DetDocumentosLista", aCalm8);  
            aCalm9 = bdc.listarTiposbaja(0);
            request.setAttribute("TiposBajaLista", aCalm9);
            aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
            request.setAttribute("OficinasLista", aCalm11);            
            //aCalm12 = bdc.listarRubros(0);
            //request.setAttribute("RubrosLista", aCalm12);              
            //aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
            //request.setAttribute("Activos2Lista", aCalm10); 
            finform.setDesactivo(bdc.DescripcionActivo(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo()));
            finform.setDesbaja(bdc.nombretipobaja(finform.getDdo_codmot()));
            finform.setDesofi(bdc.nombreoficina(finform.getDdo_codofiactual(),finform.getDoc_codreg()));
            num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            finform.setDdo_item(num);
            if (!msgsql.equals("0")) {
                error.add("error", new ActionMessage("error", msgsql));
                saveErrors( request, error );
            } 
            else 
            {
                error.add("error", new ActionMessage("error", "La modificación fue realizada correctamente"));
                saveErrors( request, error );             
            }
         }
         if (finform.getOpcion()==3){/*Eliminar*/
            finform.setOperacion(2);
            msgsql=null;
            msgsql = bdc.insertardocumentos(finform.getDoc_codreg(),finform.getDoc_tipdoc(),
            finform.getDoc_numero(),finform.getDoc_fecha(),finform.getDoc_codofiorigen(),
            finform.getDoc_codfunorigen(),finform.getDoc_codubiorigen(),
            finform.getDoc_codfin(),finform.getDoc_codfinorigen(),
            finform.getDoc_codpryorigen(),finform.getDoc_codregdestino(),
            finform.getDoc_codofidestino(),finform.getDoc_codfundestino(),
            finform.getDoc_codubidestino(),finform.getDoc_codfindestino(),
            finform.getDoc_codprydestino(),finform.getDoc_observacion(),
            finform.getDoc_inconfirma(),fInicio.getTxt_usu(),finform.getOpcion(),0);
            finform.setDoc_codreg("");
            finform.setDoc_tipdoc("");
            finform.setDoc_numero(0);
            aCalm7 = bdc.listarTiposdoc(0,1,fInicio.getCod_fin(),fInicio.getCod_reg());
            request.setAttribute("TiposDocumentosLista", aCalm7);
            if (!msgsql.equals("0")) {
               error.add("error", new ActionMessage("error", msgsql));
               saveErrors( request, error );
            }
            else
            {
               error.add("error", new ActionMessage("error", "La eliminación fue realizada correctamente"));
               saveErrors( request, error );             
               aCalm = bdc.listarActas2(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
               request.setAttribute("DocumentosLista", aCalm);
            }
         }
         if (finform.getOpcion()==4){/*Confirmar*/
             if (finform.getDoc_tipdoc().equals("U")) {
                String StrSql="";
                String status;
                Connection cn = null;
                ResultSet rs = null;
                CallableStatement call = null;
                try {
                   Properties props = new Properties();
                   props.setProperty("mail.transport.protocol", "smtp");
                   props.setProperty("mail.host", "anbdm");
                   props.setProperty("mail.user", "activos@aduana.gob.bo");
                   Session mailSession = Session.getDefaultInstance(props, null);
                   Transport transport = mailSession.getTransport();
                   MimeMessage message = new MimeMessage(mailSession);
                   message.setSubject("Transferencia de Bienes de Activo Fijo");
                   message.setFrom(new InternetAddress("activos@aduana.gob.bo"));
                   correo=bdc.Obtener_correo(finform.getDoc_codfundestino());
                   de_quien=bdc.nombrefuncionario(finform.getDoc_codfunorigen());
                   a_quien=bdc.nombrefuncionario(finform.getDoc_codfundestino());
                   String tel_mov = null;
                   message.addRecipient(Message.RecipientType.BCC,new InternetAddress(correo));
                   MimeMultipart multipart = new MimeMultipart("related");
                   String htmlText = null;
                   // Contenido (the html)
                   BodyPart messageBodyPart = new MimeBodyPart();

                   cn = bdc.getConexion();
                   call = cn.prepareCall("{? = call pg_activos.listardetdocumentos2(?,?,?,?) }");
                   call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                   call.setString(2,finform.getDoc_codfin());
                   call.setString(3,finform.getDoc_codreg());
                   call.setString(4,finform.getDoc_tipdoc());
                   call.setInt(5,finform.getDoc_numero());
                   call.execute();
                   rs = (ResultSet) call.getObject(1);
                   htmlText = "<b>Funcionario: " + a_quien + " se le ha transferido los siguientes bienes de Activo Fijo del Funcionario: "+de_quien+"</b><br><br>";
                   while (rs.next()){    
                      htmlText = htmlText + rs.getString(6) + "  " + rs.getString(8) + "<BR>";
                   }
                   
                   messageBodyPart.setContent(htmlText, "text/html");
                   // adiciona aqui  
                   multipart.addBodyPart(messageBodyPart);
                   message.setContent(multipart);
                   transport.connect();
                   transport.sendMessage(message, message.getRecipients(Message.RecipientType.BCC));
                   transport.close();
               }
               catch(AddressException e)
               {
                  status="Existe error en la dirección";
               }
               catch(SendFailedException e)
               {
                  status="Existe error al enviar la información";
               }
               catch(MessagingException e)
               {
                  status="Error inesperado.";
               }
               catch (SQLException e) 
               {
                  e.printStackTrace();
               }
               finally 
               {
                  try
                  {
                     if (rs != null)
                     {
                        rs.close();
                        rs = null;
                     }
                     if (call != null) 
                     {
                        call.close();
                        call = null;
                     }
                     if (cn != null) 
                     {
                        cn.close();
                        cn = null;
                     }
                  }  
                  catch (Exception ex) 
                  {
                     ;
                  }
               }

             
                /*correo=bdc.Obtener_correo(finform.getDoc_codfundestino());
                String Msg = "";
                String smtpHost = "anbdm";
                String status;
                String StrSql="";
                Connection cn = null;
                ResultSet rs = null;
                CallableStatement call = null;
                
                try {
                   Properties properties = System.getProperties();
                   Session session = Session.getInstance(properties,null);
                   MimeMessage message = new MimeMessage(session);
                   message.setContent( StrSql, "text/plain");
                   message.setFrom(new InternetAddress( "activos@aduana.gob.bo" ));
                   message.addRecipient( Message.RecipientType.TO, new InternetAddress(correo) );
                   message.setSubject( "Se le han transferido bienes de activos fijos" );
                   cn = bdc.getConexion();
                   call = cn.prepareCall("{? = call pg_activos.listardetdocumentos2(?,?,?,?) }");
                   call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                   call.setString(2,finform.getDoc_codfin());
                   call.setString(3,finform.getDoc_codreg());
                   call.setString(4,finform.getDoc_tipdoc());
                   call.setInt(5,finform.getDoc_numero());
                   call.execute();
                   rs = (ResultSet) call.getObject(1);
                   Msg = "<b>Se le ha transferido los siguientes bienes de activos fijos</b>";
                   while (rs.next()){    
                      Msg = Msg + rs.getString(6) + "  " + rs.getString(8) + "<BR>";
                   }
                   message.setText( Msg );
                   message.saveChanges();
                   Transport transport = session.getTransport("smtp");
                   transport.connect( smtpHost, "", "" );
                   transport.sendMessage( message, message.getAllRecipients());
                   transport.close();
                 }
               catch(AddressException e)
               {
                  status="Existe error en la dirección";
               }
               catch(SendFailedException e)
               {
                  status="Existe error al enviar la información";
               }
               catch(MessagingException e)
               {
                  status="Error inesperado.";
               }
               catch (SQLException e) 
               {
                  e.printStackTrace();
               }
               finally 
               {
                 try
                 {
                   if (rs != null)
                   {
                      rs.close();
                      rs = null;
                   }
                   if (call != null) 
                   {
                      call.close();
                      call = null;
                   }
                   if (cn != null) 
                   {
                      cn.close();
                      cn = null;
                   }
                 } 
               catch (Exception ex) 
               {
                  ;
               }
              }*/               
             }
             finform.setOperacion(2);
             msgsql=null;
             msgsql = bdc.confirmardocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),
             finform.getDoc_numero(),fInicio.getTxt_usu(),finform.getOpcion());           
             //finform.setDoc_codreg("");
             //finform.setDoc_tipdoc("");
             //finform.setDoc_numero(0);
             aCalm7 = bdc.listarTiposdoc(0,1,fInicio.getCod_fin(),fInicio.getCod_reg());
             request.setAttribute("TiposDocumentosLista", aCalm7);
             if (!msgsql.equals("0")) {
                error.add("error", new ActionMessage("error", msgsql));
                saveErrors( request, error );
             }
             else
             {
                error.add("error", new ActionMessage("error", "La confirmación fue realizada correctamente"));
                saveErrors( request, error );                  
                aCalm = bdc.listarActas2(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
                request.setAttribute("DocumentosLista", aCalm);
                finform.setOperacion(40);
                finform.setOpcion(40);
             }         
         }
         if (finform.getOpcion()==5){/*Reportar*/
         }
      }
           
      if (finform.getOperacion()==4){
         if (finform.getOpcion()==1){/*Insertar*/
         }
         if (finform.getOpcion()==2){/*Modificar*/
            aCalm = bdc.listarActas2(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
            if (aCalm.size()!=0) {
               request.setAttribute("DocumentosLista", aCalm);
            }
            else 
            {
               mensaje="No existe Acta con esta caracteristica(1)";
               finform.setOperacion(9);
            }         
         }
         if (finform.getOpcion()==3){/*Eliminar*/
            aCalm = bdc.listarActas2(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
            if (aCalm.size()!=0) {
               request.setAttribute("DocumentosLista", aCalm);
            }
            else 
            {
               mensaje="No existe Acta con esta caracteristica(2)";
               finform.setOperacion(9);               
            }         
         }
         if (finform.getOpcion()==4){/*Confirmar*/
            aCalm = bdc.listarActas2(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
            if (aCalm.size()!=0) {
               request.setAttribute("DocumentosLista", aCalm);
            }
            else 
            {
               mensaje="No existe Acta con esta caracteristica(3)";
               finform.setOperacion(9);               
            }         
         }
         if (finform.getOpcion()==5){/*Reportar*/
            aCalm = bdc.listarActas2(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
            if (aCalm.size()!=0) {
               request.setAttribute("DocumentosLista", aCalm);
            }
            else 
            {
               mensaje="No existe Acta con esta caracteristica(4)";
               finform.setOperacion(9);               
            }         
         }
      }
      
      if (finform.getOperacion()==5){
         if (finform.getOpcion()==1){/*Insertar*/
            num = bdc.maximoTiposdoc(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc());
            finform.setDoc_numero(num);
            feccierre = bdc.FeccierreTiposdoc(finform.getDoc_tipdoc());
            finform.setDoc_feccierre(feccierre);
            if (finform.getDoc_tipdoc().equals("B")) {
               codfun = bdc.FuncionarioActivos(finform.getDoc_codreg(),"01");
            }
            else {            
               codfun = bdc.FuncionarioActivos(finform.getDoc_codreg(),fInicio.getCod_fin());
            }
            if ((finform.getDoc_tipdoc().equals("E"))||(finform.getDoc_tipdoc().equals("B"))){
                finform.setDoc_codfunorigen(codfun);
                finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
                if (finform.getDoc_tipdoc().equals("E")){
                   aCalm2 = bdc.listarFuncionariosa(0,fInicio.getCod_reg(),fInicio.getCod_fin());
                }
            }
            if (finform.getDoc_tipdoc().equals("D")){
                aCalm3 = bdc.listarFuncionarios3(0,fInicio.getCod_reg(),fInicio.getCod_fin(),fInicio.getAux1());
                finform.setDoc_codfundestino(codfun);
                finform.setDoc_fundesnombre(bdc.nombrefuncionario(finform.getDoc_codfundestino()));
            }
            if (finform.getDoc_tipdoc().equals("T")){
               aCalm3 = bdc.listarFuncionarios3(0,fInicio.getCod_reg(),fInicio.getCod_fin(),fInicio.getAux1());
               /*aCalm2 = bdc.listarFuncionarios2(0,fInicio.getCod_reg(),fInicio.getAux1());*/
               aCalm2 = bdc.listarFuncionariosa(0,fInicio.getCod_reg(),fInicio.getCod_fin());               
            }
            if (finform.getDoc_tipdoc().equals("U")){
               aCalm3 = bdc.listarFuncionariosR(0,fInicio.getCod_reg(),fInicio.getCod_fin());   
               finform.setDoc_codfunorigen(codfun);
               finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen())); 
               aCalm2 = bdc.listarFuncionariosR1(0,fInicio.getCod_reg(),fInicio.getCod_fin());
            }
            if (finform.getDoc_tipdoc().equals("V")){
               aCalm3 = bdc.listarFuncionariosR(0,fInicio.getCod_reg(),fInicio.getCod_fin());   
               finform.setDoc_codfunorigen(codfun);
               finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
               aCalm2 = bdc.listarFuncionariosR2(0,fInicio.getCod_reg(),fInicio.getCod_fin());
            }
            request.setAttribute("FuncionariosLista2", aCalm3);
            request.setAttribute("FuncionariosLista", aCalm2);
            if (num==0){
               mensaje="No está definido correlativo (Correlativo de Actas)";
               finform.setOperacion(9);
            }         
         }
         if (finform.getOpcion()==2){/*Modificar*/
            if (finform.getDoc_tipdoc().equals("B")) {
               codfun = bdc.FuncionarioActivos(finform.getDoc_codreg(),"01");
            }
            else {            
               codfun = bdc.FuncionarioActivos(finform.getDoc_codreg(),fInicio.getCod_fin());
            }
            if ((finform.getDoc_tipdoc().equals("E"))||(finform.getDoc_tipdoc().equals("B"))){
                finform.setDoc_codfunorigen(codfun);
                finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
                if (finform.getDoc_tipdoc().equals("E")){
                   aCalm2 = bdc.listarFuncionariosa(0,fInicio.getCod_reg(),fInicio.getCod_fin());
                }
            }
            if (finform.getDoc_tipdoc().equals("D")){
                aCalm3 = bdc.listarFuncionarios3(0,fInicio.getCod_reg(),fInicio.getCod_fin(),fInicio.getAux1());
                finform.setDoc_codfundestino(codfun);
                finform.setDoc_fundesnombre(bdc.nombrefuncionario(finform.getDoc_codfundestino()));
            }
            if (finform.getDoc_tipdoc().equals("T")){
               aCalm3 = bdc.listarFuncionarios3(0,fInicio.getCod_reg(),fInicio.getCod_fin(),fInicio.getAux1());
               /*aCalm2 = bdc.listarFuncionarios2(0,fInicio.getCod_reg(),fInicio.getAux1());*/
               aCalm2 = bdc.listarFuncionariosa(0,fInicio.getCod_reg(),fInicio.getCod_fin());               
            }
            if (finform.getDoc_tipdoc().equals("U")){
               aCalm3 = bdc.listarFuncionariosR(0,fInicio.getCod_reg(),fInicio.getCod_fin());   
               finform.setDoc_codfunorigen(codfun);
               finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen())); 
               aCalm2 = bdc.listarFuncionariosR1(0,fInicio.getCod_reg(),fInicio.getCod_fin());
            }
            if (finform.getDoc_tipdoc().equals("V")){
               aCalm3 = bdc.listarFuncionariosR(0,fInicio.getCod_reg(),fInicio.getCod_fin());   
               finform.setDoc_codfunorigen(codfun);
               finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
               aCalm2 = bdc.listarFuncionariosR2(0,fInicio.getCod_reg(),fInicio.getCod_fin());
            }
            request.setAttribute("FuncionariosLista", aCalm2);
            request.setAttribute("FuncionariosLista2", aCalm3);
            aCalm = bdc.listarActas(1,0,fInicio.getCod_fin(),fInicio.getCod_reg(),finform.getDoc_tipdoc(),finform.getInicio(),finform.getFin(),finform.getOpcion(),finform.getConfirmados(),finform.getGestionant());
            it = finform.getFila();
            request.setAttribute("DocumentosLista", aCalm);
            ArrayList datos = (ArrayList) request.getAttribute("DocumentosLista");
            DocumentosDetalleForm d = new DocumentosDetalleForm();        
            d = (DocumentosDetalleForm) datos.get(it);  
            finform.setDoc_codreg(d.getcodreg());
            finform.setDoc_tipdoc(d.gettipdoc());
            finform.setDoc_numero(d.getnumero());
            finform.setDoc_fecha(d.getfecha());
            finform.setDoc_codfunorigen(d.getcodfunorigen());
            finform.setDoc_codfundestino(d.getcodfundestino());
            finform.setDoc_observacion(d.getobservacion());
            finform.setDoc_funorinombre(bdc.nombrefuncionario(finform.getDoc_codfunorigen()));
            finform.setDoc_fundesnombre(bdc.nombrefuncionario(finform.getDoc_codfundestino()));
            finform.setDoc_ofiorinombre(bdc.nombreoficina(finform.getDoc_codofiorigen(),finform.getDoc_codreg()));
            finform.setDoc_ofidesnombre(bdc.nombreoficina(finform.getDoc_codofidestino(),finform.getDoc_codreg()));
            finform.setDoc_carorinombre(bdc.nombrecargo(finform.getDoc_codfunorigen()));
            finform.setDoc_cardesnombre(bdc.nombrecargo(finform.getDoc_codfundestino()));            
            /*aCalm8 = bdc.listarDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            request.setAttribute("DetDocumentosLista", aCalm8);  
            aCalm9 = bdc.listarTiposbaja(0);
            request.setAttribute("TiposBajaLista", aCalm9);
            aCalm11 = bdc.listarOficinas(0,fInicio.getCod_reg());
            request.setAttribute("OficinasLista", aCalm11);            
            aCalm12 = bdc.listarRubros(0);
            request.setAttribute("RubrosLista", aCalm12);              
            aCalm10 = bdc.listarActivos2(0,finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero(),finform.getDoc_codfunorigen(),finform.getDoc_fecha(),finform.getDdo_codrubactual(),finform.getDdo_codigo(),finform.getDdo_codigo());
            request.setAttribute("Activos2Lista", aCalm10);            
            num = bdc.maximoDetDocumentos(finform.getDoc_codfin(),finform.getDoc_codreg(),finform.getDoc_tipdoc(),finform.getDoc_numero());
            finform.setDdo_item(num);*/
         }
         if (finform.getOpcion()==3){/*Eliminar*/
         }
         if (finform.getOpcion()==4){
         }
         if (finform.getOpcion()==5){
         }
      }
       if (finform.getOperacion()!=9) {
          if ((finform.getOperacion()==3)&&(finform.getOpcion()==5))
             return mapping.findForward("reportar");     
          else
             if ((finform.getOperacion()==40)&&(finform.getOpcion()==40))
             {
                finform.setOperacion(4);
                finform.setOpcion(4);               
             }
             return mapping.findForward("volver");     
       }
       else
       {
          finform.setOperacion(1);
          finform.setOpcion(1);
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
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
      }
      catch (Exception e)
      {
        String StrSql = "Error al cerrar la conexión a la Base de Datos " + e.getMessage();
        return mapping.findForward("volver");;
      }
      
    }  
    
    }
    return mapping.findForward("volver"); 
  }
}     

