package ActivosFijos;
import net.sf.jasperreports.engine.JasperRunManager;

public class ReporteActivosDescripcion 
{
  public ReporteActivosDescripcion()
  {
              String pathjasper = this.getServlet().getServletContext().getRealPath("/reportes/consulta01.jasper");              
              String subreportjasper = this.getServlet().getServletContext().getRealPath("/reportes/");              
              File reportfile = new File(pathjasper);
              if (reportfile.exists()) { 
                 Map parameters = new HashMap();
                 String nro_a = aut_ane.getLista().substring(0,aut_ane.getLista().indexOf(","));
                 String tip_a = aut_ane.getLista().substring(aut_ane.getLista().indexOf(",")+1,aut_ane.getLista().length());
                 parameters.put("ope_tip", aut_ane.getOpe_tip());
                 parameters.put("ope_nit", aut_ane.getOpe_nit());
                 parameters.put("nro_aut", aut_ane.getNro_aut());
                 parameters.put("tip_aut", aut_ane.getTip_aut());
                 parameters.put("nro_ane", nro_a);         
                 parameters.put("tip_ane", tip_a);
                 parameters.put("SUBREPORT_DIR", subreportjasper );
                 byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameters, cn); 
                 response.setContentType("application/pdf"); 
                 response.setContentLength(bytes.length); 
                 ServletOutputStream ouputStream = response.getOutputStream(); 
                 ouputStream.write(bytes, 0, bytes.length); 
                 ouputStream.flush(); 
                 ouputStream.close();
              }                            
              else {   
                 mensaje.add("error", new ActionMessage("error", "No se puede abrir el reporte."));
              }   
  }
}