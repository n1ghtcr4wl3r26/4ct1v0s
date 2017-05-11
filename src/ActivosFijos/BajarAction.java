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
 
public class BajarAction extends Action 
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
    InicioForm fInicio = (InicioForm) request.getSession().getAttribute("InicioForm"); 
    BDConection BD = new BDConection();
    Connection l_connection = null;
    Statement l_stmt = null;
    ResultSet l_rset = null; 
    CallableStatement call = null;
    String vcodreg;
    String vcodfin;
    vcodreg=fInicio.getCod_reg();
    vcodfin=fInicio.getCod_fin();
    try
    {  l_connection = BD.getConexion();
       l_connection.setAutoCommit(true);
       l_stmt = l_connection.createStatement();
       String StrSql;
       int can=0;
       String msg=null;
       int res = 0;
       boolean sw = true;
       
       call = l_connection.prepareCall("{?=call pg_activos.bajar_tablas (?,?) }");
       call.registerOutParameter(1, Types.NUMERIC);     
       call.setString(2,vcodreg);
       call.setString(3,vcodfin);
       call.execute();
       error.add("error", new ActionMessage("error", "La bajada fue realizada correctamente"));       
       this.saveErrors( request, error );
       return mapping.findForward("volver");
                
    }
    catch( Exception ioe )
    {
       error.add("error", new ActionMessage("error", "Error al leer el archivo del Cliente " + ioe.toString() ));
       this.saveErrors( request, error );
       return mapping.findForward("volver");
    }
    finally
         {BD.Cierra(l_connection, l_rset);      
         }
  }
}
