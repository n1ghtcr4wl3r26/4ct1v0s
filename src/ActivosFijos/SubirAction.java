package ActivosFijos;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import jxl.*;
 
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.upload.FormFile;
 
public class SubirAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { SubirForm sform = (SubirForm) form;
    request.getSession().getAttribute("SubirForm");
    //LoginForm lform = (LoginForm) request.getSession().getAttribute("LoginForm");
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm");     
    ActionMessages error = new ActionMessages();  
    String nomArch = sform.getTxt_medio().getFileName();
    String siguiente = "volver";
    BDConection BD = new BDConection();
    Connection l_connection = null;
    Statement l_stmt = null;
    ResultSet l_rset = null; 
    CallableStatement call = null;
    CallableStatement call2 = null;    
    FormFile file = sform.getTxt_medio();
    String ruta = this.getServlet().getServletContext().getRealPath("") + "/" + file.getFileName();
    File arch = new File(ruta);           
    if( isCancelled( request ) )
    {  return (mapping.findForward("menu"));  
    }
    if ( nomArch.toUpperCase().endsWith(".XLS") )
    {
    try
    {  l_connection = BD.getConexion();
       l_connection.setAutoCommit(true);
       l_stmt = l_connection.createStatement();
       
       if( file.getFileSize() <= 0 )
       {
          error.add("error", new ActionMessage("error", "El Archivo no existe o está vacío. " ));
          this.saveErrors( request, error );
          return mapping.findForward("volver");
       }
       else
       {
         //lee el archivo excel
         InputStream stream = file.getInputStream();
         // donde se grabará el archivo excel
         OutputStream bos = new FileOutputStream( ruta );
         int bytesRead = 0;
         byte[] buffer = new byte[8192];
         // graba el archivo excel
         while ((bytesRead = stream.read(buffer, 0, 8192)) != -1)
         {
             bos.write(buffer, 0, bytesRead);
         }
         bos.close();
         //recupera el archivo excel
               
            Workbook workbook = Workbook.getWorkbook(arch);
            Sheet pag = workbook.getSheet(0);
            Sheet pag1 = workbook.getSheet(1);
            int fils = pag.getRows();
            int cols = pag.getColumns();
            int fils1 = pag1.getRows();
            int cols1 = pag1.getColumns();
            String StrSql;

            if (cols != 12 )
            {  error.add("error", new ActionMessage("error", "La estructura del archivo no es la correcta. " ));
                 this.saveErrors( request, error );
                 arch.delete();
                 return mapping.findForward("volver");
            }
            if (fils == 0)
            {  error.add("error", new ActionMessage("error", "El archivo no tiene la primera fila con cabeceras" ));
                 this.saveErrors( request, error );
                 arch.delete();
                 return mapping.findForward("volver");
            }
            if (cols1 != 13 )
            {  error.add("error", new ActionMessage("error", "La estructura del archivo no es la correcta. " ));
                 this.saveErrors( request, error );
                 arch.delete();
                 return mapping.findForward("volver");
            }
            if (fils1 == 0)
            {  error.add("error", new ActionMessage("error", "El archivo no tiene la primera fila con cabeceras" ));
                 this.saveErrors( request, error );
                 arch.delete();
                 return mapping.findForward("volver");
            }

              ClaseEstructura est = new ClaseEstructura();
              int can=0;
              String msg=null;
              
              call = l_connection.prepareCall("{call pg_activos.subir_tablas (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }");
              call2 = l_connection.prepareCall("{call pg_activos.validar (?,?,?,?,?,?) }");
              String vcontrol1 = null;
              String vcontrol2 = null;
              for (int i=1; i<fils; i++)
              {     est.setInv_codbarra(pag.getCell(0,i).getContents().toString());
                    est.setInv_fecha(pag.getCell(1,i).getContents().toString());
                    est.setInv_codofi(pag.getCell(2,i).getContents().toString());                                    
                    est.setInv_codfun(pag.getCell(3,i).getContents().toString());
                    est.setInv_estado(pag.getCell(4,i).getContents().toString());
                    est.setInv_codfin(pag.getCell(5,i).getContents().toString());
                    est.setInv_codpry(pag.getCell(6,i).getContents().toString());
                    est.setInv_codreg(pag.getCell(7,i).getContents().toString());
                    est.setInv_hora(pag.getCell(8,i).getContents().toString());
                    est.setInv_fun(pag.getCell(9,i).getContents().toString());
                    est.setInv_mod(pag.getCell(10,i).getContents().toString());
                    est.setInv_control(pag.getCell(11,i).getContents().toString());
                    call.setString(1,est.getInv_codbarra());
                    call.setString(2,est.getInv_fecha());
                    call.setString(3,est.getInv_codofi());
                    call.setString(4,est.getInv_codfun());
                    call.setString(5,est.getInv_estado());
                    call.setString(6,est.getInv_codfin());
                    call.setString(7,est.getInv_codpry());
                    call.setString(8,est.getInv_codreg());
                    call.setString(9,est.getInv_hora());
                    call.setString(10,est.getInv_fun());
                    call.setString(11,fInicio.getTxt_usu());
                    call.setString(12,est.getInv_mod());      
                    call.setString(13,est.getInv_control());      
                    call.registerOutParameter(14,Types.INTEGER);  // devuelve un entero
                    call.registerOutParameter(15,Types.VARCHAR);  // devuelve una cadena
                    if (i==1)
                      vcontrol1 = est.getInv_control();
                    call.execute();
                    can=call.getInt(14);
                    msg = call.getString(15);
                    if ( can < 0 )
                       i=fils;
              }                  
              if(can < 0)
              {
                 error.add("error", new ActionMessage("error", msg));
                 saveErrors(request, error);
                 arch.delete();
                 ActionForward actionforward5 = mapping.findForward("volver");
                 call2.setString(1,"K");
                 call2.setString(2,fInicio.getTxt_usu()); 
                 call2.setString(3,vcontrol1);
                 call2.setString(4,vcontrol2);
                 call2.registerOutParameter(5,Types.INTEGER);  // devuelve un entero
                 call2.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena                 
                 call2.execute();
                 can = call2.getInt(5);
                 msg = call2.getString(6);
                 return actionforward5;
              } 
              else {
                 ClaseEstructura2 est2 = new ClaseEstructura2();
                 int can1=0;
                 String msg1=null;
                 call = l_connection.prepareCall("{call pg_activos.subir_tablas2 (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }");
                 for ( int i=1; i<fils1; i++)
                 {  est2.setAct_codrub(pag1.getCell(0,i).getContents().toString());
                    est2.setAct_codreg(pag1.getCell(1,i).getContents().toString());
                    est2.setAct_codigo(pag1.getCell(2,i).getContents().toString());                                    
                    est2.setAct_codgrp(pag1.getCell(3,i).getContents().toString());
                    est2.setAct_codofi(pag1.getCell(4,i).getContents().toString());
                    est2.setAct_codfun(pag1.getCell(5,i).getContents().toString());
                    est2.setAct_codfin(pag1.getCell(6,i).getContents().toString());
                    est2.setAct_codpry(pag1.getCell(7,i).getContents().toString());
                    est2.setAct_descripcion(pag1.getCell(8,i).getContents().toString());
                    est2.setAct_estado(pag1.getCell(9,i).getContents().toString());
                    est2.setAct_hora(pag1.getCell(10,i).getContents().toString());
                    est2.setAct_fun(pag1.getCell(11,i).getContents().toString());
                    est2.setAct_control(pag1.getCell(12,i).getContents().toString());
                    call.setString(1,est2.getAct_codrub());
                    call.setString(2,est2.getAct_codreg());
                    call.setString(3,est2.getAct_codigo());
                    call.setString(4,est2.getAct_codgrp());
                    call.setString(5,est2.getAct_codofi());
                    call.setString(6,est2.getAct_codfun());
                    call.setString(7,est2.getAct_codfin());
                    call.setString(8,est2.getAct_codpry());
                    call.setString(9,est2.getAct_descripcion());
                    call.setString(10,est2.getAct_estado());
                    call.setString(11,est2.getAct_hora());
                    call.setString(12,est2.getAct_fun());      
                    call.setString(13,est2.getAct_control());   
                    call.setString(14,fInicio.getTxt_usu());
                    call.registerOutParameter(15,Types.INTEGER);  // devuelve un entero
                    call.registerOutParameter(16,Types.VARCHAR);  // devuelve una cadena
                    if (i==1)
                       vcontrol2 = est2.getAct_control(); 
                    call.execute();
                    can1=call.getInt(15);
                    msg1 = call.getString(16);
                    if ( can1 < 0 )
                       i=fils1;
                 }
                 if(can1 < 0)
                 {
                    error.add("error", new ActionMessage("error", msg1));
                    saveErrors(request, error);
                    arch.delete();
                    call2.setString(1,"K");
                    call2.setString(2,fInicio.getTxt_usu()); 
                    call2.setString(3,vcontrol1);
                    call2.setString(4,vcontrol2);                    
                    call2.registerOutParameter(5,Types.INTEGER);  // devuelve un entero
                    call2.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena                 
                    call2.execute();
                    can = call2.getInt(5);
                    msg = call2.getString(6);                    
                    ActionForward actionforward5 = mapping.findForward("volver");
                    return actionforward5;                   
                 }
                 else 
                 {
                    error.add("error", new ActionMessage("error", "La transacci\363n fue realizada correctamente "));
                    saveErrors(request, error);
                    arch.delete();
                    ActionForward actionforward4 = mapping.findForward("volver");
                    call2.setString(1,"C");
                    call2.setString(2,fInicio.getTxt_usu()); 
                    call2.setString(3,vcontrol1);
                    call2.setString(4,vcontrol2);
                    call2.registerOutParameter(5,Types.INTEGER);  // devuelve un entero
                    call2.registerOutParameter(6,Types.VARCHAR);  // devuelve una cadena                 
                    call2.execute();
                    can = call2.getInt(5);
                    msg = call2.getString(6);
                    return actionforward4;
                 }
             }      

         }
    }
    catch( Exception ioe )
    {
       error.add("error", new ActionMessage("error", "Error al leer el archivo del Cliente " + ioe.toString() ));
       this.saveErrors( request, error );
       arch.delete();
       return mapping.findForward("volver");
    }
    finally
         {BD.Cierra(l_connection, l_rset);      
         }
    }
    else
    {  error.add("error", new ActionMessage("error","El archivo no es correcto."));
       saveErrors( request, error );
       arch.delete();
       return mapping.findForward("volver");
    }
//    return mapping.findForward("volver");
  }
}
