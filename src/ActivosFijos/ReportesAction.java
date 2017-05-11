package ActivosFijos;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JExcelApiExporterParameter;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.j2ee.servlets.ImageServlet;

import net.sf.jasperreports.engine.JasperExportManager;
import oracle.jdbc.pool.OracleConnectionPoolDataSource;
import javax.sql.PooledConnection;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class ReportesAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  private void toXLS(HttpServletResponse response, JasperPrint jasperPrint)
    throws Exception
  {
    JExcelApiExporter xlsExporter = new JExcelApiExporter();
    ByteArrayOutputStream xlsOutStream = new ByteArrayOutputStream();
    xlsExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
    xlsExporter.setParameter(JRExporterParameter.OUTPUT_STREAM, xlsOutStream);

    xlsExporter.setParameter( JExcelApiExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.FALSE);
    //xlsExporter.setParameter( JExcelApiExporterParameter.IS_DETECT_CELL_TYPE, Boolean.TRUE);
    xlsExporter.setParameter( JExcelApiExporterParameter.IS_WHITE_PAGE_BACKGROUND, Boolean.FALSE);
    xlsExporter.setParameter( JExcelApiExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);

    xlsExporter.exportReport();

    byte[] bytes = xlsOutStream.toByteArray();
    xlsOutStream.close();

    response.reset();
    response.setContentType("application/vnd.ms-excel");

    ServletOutputStream ouputStream = response.getOutputStream();
    ouputStream.write(bytes, 0, bytes.length);
    ouputStream.flush();
    ouputStream.close();
  }

  private void toPDF(HttpServletResponse response, File reportFile, Map parameters, Connection cn)
    throws Exception
  {
    byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), parameters, cn);

    response.setContentType("application/pdf");
    response.setContentLength(bytes.length);

    ServletOutputStream ouputStream = response.getOutputStream();
    ouputStream.write(bytes, 0, bytes.length);
    ouputStream.flush();
    ouputStream.close();
  }

  private void toHTML(HttpServletRequest request, HttpServletResponse response, JasperPrint jasperPrint)
    throws Exception
  {
    PrintWriter printWriter = null;
    printWriter = response.getWriter();

    JRHtmlExporter htmlExporter = new JRHtmlExporter();

    response.setContentType("text/html");

    Map imagesMap = new HashMap();
    request.getSession().setAttribute(ImageServlet.DEFAULT_JASPER_PRINT_SESSION_ATTRIBUTE, jasperPrint);
    request.getSession().setAttribute("IMAGES_MAP", imagesMap);

    htmlExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
    htmlExporter.setParameter(JRExporterParameter.OUTPUT_WRITER, printWriter);

    htmlExporter.setParameter( JRHtmlExporterParameter.IMAGES_MAP, imagesMap);
    htmlExporter.setParameter( JRHtmlExporterParameter.IMAGES_URI, "image?image=");
    htmlExporter.setParameter( JRHtmlExporterParameter.IS_USING_IMAGES_TO_ALIGN, Boolean.FALSE);
    htmlExporter.setParameter( JRHtmlExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.FALSE);
    htmlExporter.setParameter( JRHtmlExporterParameter.IS_WRAP_BREAK_WORD, Boolean.TRUE);
    htmlExporter.setParameter( JRHtmlExporterParameter.SIZE_UNIT, "px");
    htmlExporter.setParameter( JRHtmlExporterParameter.IS_WHITE_PAGE_BACKGROUND, Boolean.FALSE);

    htmlExporter.exportReport();
  }
  
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    ActionMessages error = new ActionMessages();
    ReportesForm opform = (ReportesForm) form;
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    
    PooledConnection pc = null;
    Connection l_connection = null;    
    
    String pathjasper;
    String subreportjasper;
    String vcodpar;
    File reportfile;
    try {
      InitialContext ic = new InitialContext();
      OracleConnectionPoolDataSource pd = (OracleConnectionPoolDataSource) ic.lookup("jdbc/prueba");

      pc = pd.getPooledConnection();
      l_connection = pc.getConnection();
      BDConection bdc = new BDConection();
       
       opform.setFlag(opform.getOpcion());
       opform.setCod_reg(fInicio.getCod_reg());
       opform.setCod_fin(fInicio.getCod_fin());
       request.getSession().setAttribute("ReportesSession", opform);
       switch (opform.getFlag()) {
          case 1 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta01.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("act_descripcion", opform.getCondicion1());

                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
                 
                 /*byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameters, l_connection); 
                 response.setContentType("application/pdf"); 
                 response.setContentLength(bytes.length); 
                 ServletOutputStream ouputStream = response.getOutputStream(); 
                 ouputStream.write(bytes, 0, bytes.length); 
                 ouputStream.flush(); 
                 ouputStream.close();*/
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 2 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta02.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfinan", opform.getCod_fin());
                 parameters.put("act_codrub", opform.getCondicion1());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codini", opform.getCondicion3());
                 parameters.put("par_codfin", opform.getCondicion4());
                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 3 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta03.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("act_codrub", opform.getCondicion1());
                 parameters.put("act_codgrp", opform.getCondicion2());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 4 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta04.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("act_codubi", opform.getCondicion1());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 5 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta05.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("act_codfun", opform.getCondicion3());
                 parameters.put("act_codrub", opform.getCondicion1());
                 parameters.put("act_codgrp", opform.getCondicion2());
                 if (opform.getCondicion1().equals("0")) {
                    parameters.put("act_codrub", "");
                 }
                 if (opform.getCondicion2().equals("0")) {
                    parameters.put("act_codgrp", "");
                 }   
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 6 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta06.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());                 
                 parameters.put("act_codpry", opform.getCondicion1());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 7 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta07.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());                 
                 parameters.put("act_gobmunicipal", opform.getCondicion1());
                 parameters.put("act_docreferencia", opform.getCondicion2());
                 parameters.put("act_serie1", opform.getCondicion3());
                 parameters.put("act_serie2", opform.getCondicion4());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 8 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta08.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());                 
                 parameters.put("act_marca", opform.getCondicion1());
                 parameters.put("act_color", opform.getCondicion2());
                 parameters.put("act_procedencia", opform.getCondicion3());
                 parameters.put("act_proveedor", opform.getCondicion4());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 9 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta09.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("act_marca", opform.getCondicion1());
                 parameters.put("act_modelo", opform.getCondicion2());
                 parameters.put("act_serie1", opform.getCondicion3());
                 parameters.put("act_proveedor", opform.getCondicion4());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 10 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta10.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("act_marca", opform.getCondicion1());
                 parameters.put("act_modelo", opform.getCondicion2());
                 parameters.put("act_serie1", opform.getCondicion3());
                 parameters.put("act_serie2", opform.getCondicion4());
                 parameters.put("act_placa", opform.getCondicion5());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 11 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta11.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("act_codofi", opform.getCondicion1());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 12 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/cuadre01.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("act_codrub", opform.getCondicion1());
                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
             
          case 13 :
             if ( opform.getCondirep().equals("R") ) 
                { pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre01r.jasper"); } 
             else
                { pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre01.jasper"); }
                
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 vcodpar=bdc.PartidaRubro(opform.getCondicion1());
                 parameters.put("act_codpar", vcodpar);
                 parameters.put("act_codrub", opform.getCondicion1());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechai", opform.getCondicion4());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;       
          case 14 :
             if ( opform.getCondirep().equals("A") )
                { pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre02r.jasper"); }             
             else
                { pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre02.jasper"); }
                
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("act_codrub", opform.getCondicion1());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechai", opform.getCondicion4());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 15 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre03.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("act_codrub", opform.getCondicion1());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;             
          case 16 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre04.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("act_codrub", opform.getCondicion1());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 17 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre05.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 18 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre06.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;             
          case 19 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre07.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());                  
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;   
          case 20 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/inven01.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 vcodpar=bdc.PartidaRubro(opform.getCondicion1());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;             
          case 21 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/inven02.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 vcodpar=bdc.PartidaRubro(opform.getCondicion1());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_fechai", opform.getCondicion4());
                 parameters.put("par_fechaf", opform.getCondicion5());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;             
          case 22 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/inven03.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 vcodpar=bdc.PartidaRubro(opform.getCondicion1());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_fechai", opform.getCondicion4());
                 parameters.put("par_fechaf", opform.getCondicion5());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;             
          case 23 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/inven04.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 vcodpar=bdc.PartidaRubro(opform.getCondicion1());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_fechai", opform.getCondicion4());
                 parameters.put("par_fechaf", opform.getCondicion5());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;             
          case 24 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/inven05.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 vcodpar=bdc.PartidaRubro(opform.getCondicion1());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_fechai", opform.getCondicion4());
                 parameters.put("par_fechaf", opform.getCondicion5());
                 parameters.put("par_codfun", opform.getCondicion6());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break; 
          case 25 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre08.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;             
         case 26 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/cuadre03.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 vcodpar=bdc.PartidaRubro(opform.getCondicion1());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
         case 27:
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta12.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfinan", opform.getCod_fin());
                 parameters.put("act_codrub", opform.getCondicion1());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codini", opform.getCondicion3());
                 parameters.put("par_codfin", opform.getCondicion4());
                 parameters.put("par_fechai", opform.getCondicion5());
                 parameters.put("par_fechaf", opform.getCondicion6());                 
                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 28 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre09.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
         case 29:
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta13.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 parameters.put("par_codreg", opform.getCod_reg());
                 parameters.put("par_codfinan", opform.getCod_fin());
                 parameters.put("par_codfun", opform.getCondicion1());
                 parameters.put("par_respon", opform.getCondicion2());
                 parameters.put("par_fechai", opform.getCondicion5());
                 parameters.put("par_fechaf", opform.getCondicion6());                 
                 
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;
          case 30 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre10.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("act_codubi", opform.getCondicion1());
                 parameters.put("act_codofi", opform.getCondicion3());
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;             
          case 31 :
             pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/depre11.jasper");              
             subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
             reportfile = new File(pathjasper);
             if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 parameters.put("act_codreg", opform.getCod_reg());
                 parameters.put("par_codfin", opform.getCod_fin());
                 parameters.put("par_codpry", opform.getCondicion6());
                 parameters.put("par_codpryf", opform.getCondicion7());
                 parameters.put("rev_fechaf", opform.getCondicion5());
                 parameters.put("dep_gesac", opform.getCondicion10());
                 parameters.put("dep_gesan", opform.getCondicion11());
                 parameters.put("par_usuario", fInicio.getTxt_usu());                  
                 if ( opform.getTiporep().equals( "PDF" ) )
                    this.toPDF( response, reportfile, parameters, l_connection);
                 else
                 {
                   JasperReport jasperReport = (JasperReport) JRLoader.loadObject( reportfile.getPath() );
                   JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport, parameters, l_connection);
                   if (opform.getTiporep().equals("XLS"))
                     this.toXLS(response, jasperPrint);
                   else
                     if (opform.getTiporep().equals("HTML"))
                       this.toHTML(request, response, jasperPrint);
                 }
             }                            
             else {   
                error.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
             }
             break;                
        }
    }
    catch (JRException e)
    {
      e.getMessage();
    }
    catch (NamingException e)
    {
      e.getMessage();
    }
    catch (Exception e) {
       error.add("error", new ActionMessage("errordb", "No se pudo iniciar Reportes"));
       error.add("error", new ActionMessage("errordb", e.toString() ));
       e.printStackTrace();
       saveErrors( request, error );
    }  
    finally
    {
      try
      {
        if( l_connection != null )
          l_connection.close();
        if (pc != null)
          pc.close();          
      }
      catch (Exception e)
      {
        error.add("error", new ActionMessage("errordb", "Error al cerrar la conexión a la Base de Datos"));
      }
    }         
    return mapping.findForward("volverpdf");
  }
}
