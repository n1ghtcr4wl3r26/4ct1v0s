  /*@lineinfo:filename=/reporteporreferencia.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import oracle.jdbc.driver.*;
import java.util.*;
import ActivosFijos.*;
import java.text.*;


public class _reporteporreferencia extends oracle.jsp.runtime.HttpJsp {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) {
      pageContext.setAttribute(OracleJspRuntime.JSP_PAGE_DONTNOTIFY, "true", PageContext.PAGE_SCOPE);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
      return;
}
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _reporteporreferencia page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:user-code*//*@lineinfo:7^1*/      
        BDConection dc = new BDConection();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement call = null;
        try {
          NumberFormat formatter = new DecimalFormat("###,###,##0.00");
          cn = dc.getConexion();
          call = cn.prepareCall("{? = call pg_activos.reporteactivos(1) }");
          call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
          call.execute();
          rs = (ResultSet) call.getObject(1);
      
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[5]);
      /*@lineinfo:translated-code*//*@lineinfo:27^1*/      {
        org.apache.struts.taglib.html.LinkTag __jsp_taghandler_1=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setHref("paginamenu.do");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
          /*@lineinfo:translated-code*//*@lineinfo:27^33*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[7]);
      /*@lineinfo:user-code*//*@lineinfo:40^1*/      
         int pnum=0;
         while (rs.next()){ 
        if (pnum==1) {
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[8]);
      /*@lineinfo:user-code*//*@lineinfo:45^3*/       } else { 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[9]);
      /*@lineinfo:user-code*//*@lineinfo:47^3*/       } 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[10]);
      /*@lineinfo:user-code*//*@lineinfo:48^20*/      out.print( rs.getString("act_codigo") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[11]);
      /*@lineinfo:user-code*//*@lineinfo:49^20*/      out.print( rs.getString("act_codanterior") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[12]);
      /*@lineinfo:user-code*//*@lineinfo:50^20*/      out.print( rs.getString("grp_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[13]);
      /*@lineinfo:user-code*//*@lineinfo:51^20*/      out.print( rs.getString("act_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[14]);
      /*@lineinfo:user-code*//*@lineinfo:52^22*/      out.print( rs.getString("act_estado") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[15]);
      /*@lineinfo:user-code*//*@lineinfo:53^22*/      out.print( rs.getString("ubi_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[16]);
      /*@lineinfo:user-code*//*@lineinfo:54^20*/      out.print( rs.getString("fun_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[17]);
      /*@lineinfo:user-code*//*@lineinfo:56^3*/      if (pnum==0) pnum=1; else pnum=0;  
        }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[18]);
      /*@lineinfo:user-code*//*@lineinfo:61^3*/      }
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
      
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[19]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final char text[][]=new char[20][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n".toCharArray();
      text[3] = 
      "\n\n".toCharArray();
      text[4] = 
      "\n".toCharArray();
      text[5] = 
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<body>\n".toCharArray();
      text[6] = 
      "\nVolver\n".toCharArray();
      text[7] = 
      "\n<center><h2>Listado de Activos Fijos por Referencia</h2></center>\n<table width=\"90%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-size:10px\">\n  <tr class=\"FondoAzul10\">\n  <td align=\"center\">Código</td>\n  <td align=\"center\">Código Anterior</td>\n  <td colspan=\"2\" align=\"center\">Descripción</td>\n  <td align=\"center\">Estado</td>\n  <td align=\"center\">Ubi. Fisica</td>\n  <td align=\"center\">Responsable</td>\n  </tr>\n".toCharArray();
      text[8] = 
      "\n     <tr class=\"suave\">\n  ".toCharArray();
      text[9] = 
      "\n     <tr>\n  ".toCharArray();
      text[10] = 
      "\n  <td align=\"left\">".toCharArray();
      text[11] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[12] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[13] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[14] = 
      "</td>\n  <td align=\"center\">".toCharArray();
      text[15] = 
      "</td>\n  <td align=\"center\">".toCharArray();
      text[16] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[17] = 
      "</td>\n  </tr>\n  ".toCharArray();
      text[18] = 
      "\n</table>\n</body>\n</html>\n  ".toCharArray();
      text[19] = 
      "\n\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
