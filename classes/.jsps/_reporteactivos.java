  /*@lineinfo:filename=/reporteactivos.jsp*/
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


public class _reporteactivos extends oracle.jsp.runtime.HttpJsp {

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
    _reporteactivos page = this;
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
        ReportesForm repfom = (ReportesForm) session.getAttribute("ReportesSession");
        String vcondicion1 = repfom.getCondicion1();
        String vcondicion2 = repfom.getCondicion2();
        String vcod_reg    = repfom.getCod_reg();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement call = null;
        try {
          NumberFormat formatter = new DecimalFormat("###,###,##0.0000");
          cn = dc.getConexion();
          call = cn.prepareCall("{? = call pg_activos.reporteactivos(?,?,?,?) }");
          call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[5]);
      /*@lineinfo:translated-code*//*@lineinfo:21^5*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_1=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("ReportesForm");
        __jsp_taghandler_1.setProperty("opcion");
        __jsp_taghandler_1.setValue("1");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:user-code*//*@lineinfo:22^5*/            call.setString(2,vcondicion1);
                call.setString(3,"");
                call.setInt(4,1);
                call.setString(5,vcod_reg);
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[7]);
          /*@lineinfo:translated-code*//*@lineinfo:25^34*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[8]);
      /*@lineinfo:translated-code*//*@lineinfo:27^5*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_2=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setName("ReportesForm");
        __jsp_taghandler_2.setProperty("opcion");
        __jsp_taghandler_2.setValue("2");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:user-code*//*@lineinfo:28^5*/            call.setString(2,vcondicion1);
                call.setString(3,"");
                call.setInt(4,2);
                call.setString(5,vcod_reg);
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[10]);
          /*@lineinfo:translated-code*//*@lineinfo:31^34*/          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[11]);
      /*@lineinfo:translated-code*//*@lineinfo:33^5*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_3=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setName("ReportesForm");
        __jsp_taghandler_3.setProperty("opcion");
        __jsp_taghandler_3.setValue("3");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:user-code*//*@lineinfo:34^5*/            call.setString(2,vcondicion1);
                call.setString(3,"");
                call.setInt(4,3);
                call.setString(5,vcod_reg);
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[13]);
          /*@lineinfo:translated-code*//*@lineinfo:37^34*/          } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[14]);
      /*@lineinfo:translated-code*//*@lineinfo:39^5*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setName("ReportesForm");
        __jsp_taghandler_4.setProperty("opcion");
        __jsp_taghandler_4.setValue("4");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[15]);
            /*@lineinfo:user-code*//*@lineinfo:40^5*/            call.setString(2,vcondicion1);
                call.setString(3,vcondicion2);
                call.setInt(4,4);
                call.setString(5,vcod_reg);
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[16]);
          /*@lineinfo:translated-code*//*@lineinfo:43^34*/          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[17]);
      /*@lineinfo:user-code*//*@lineinfo:45^5*/       call.execute();
          rs = (ResultSet) call.getObject(1);
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[18]);
      /*@lineinfo:translated-code*//*@lineinfo:54^1*/      {
        org.apache.struts.taglib.html.LinkTag __jsp_taghandler_5=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setHref("reportes.do");
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[19]);
          /*@lineinfo:translated-code*//*@lineinfo:54^31*/          } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[20]);
      /*@lineinfo:translated-code*//*@lineinfo:57^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_6=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setName("ReportesForm");
        __jsp_taghandler_6.setProperty("opcion");
        __jsp_taghandler_6.setValue("1");
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[21]);
            /*@lineinfo:user-code*//*@lineinfo:59^20*/            out.print( vcondicion1 );
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[22]);
          /*@lineinfo:translated-code*//*@lineinfo:59^38*/          } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[23]);
      /*@lineinfo:translated-code*//*@lineinfo:61^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_7=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setName("ReportesForm");
        __jsp_taghandler_7.setProperty("opcion");
        __jsp_taghandler_7.setValue("2");
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[24]);
            /*@lineinfo:user-code*//*@lineinfo:63^21*/            out.print( vcondicion1 );
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[25]);
            /*@lineinfo:user-code*//*@lineinfo:64^15*/            out.print( vcondicion2 );
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[26]);
          /*@lineinfo:translated-code*//*@lineinfo:64^33*/          } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[27]);
      /*@lineinfo:translated-code*//*@lineinfo:66^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_8=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setName("ReportesForm");
        __jsp_taghandler_8.setProperty("opcion");
        __jsp_taghandler_8.setValue("3");
        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[28]);
            /*@lineinfo:user-code*//*@lineinfo:68^19*/            out.print( vcondicion1 );
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[29]);
          /*@lineinfo:translated-code*//*@lineinfo:68^37*/          } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[30]);
      /*@lineinfo:translated-code*//*@lineinfo:70^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_9=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setName("ReportesForm");
        __jsp_taghandler_9.setProperty("opcion");
        __jsp_taghandler_9.setValue("4");
        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[31]);
            /*@lineinfo:user-code*//*@lineinfo:72^12*/            out.print( vcondicion1 );
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[32]);
            /*@lineinfo:user-code*//*@lineinfo:73^12*/            out.print( vcondicion2 );
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[33]);
          /*@lineinfo:translated-code*//*@lineinfo:73^30*/          } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[34]);
      /*@lineinfo:user-code*//*@lineinfo:86^1*/      
         int pnum=0;
         String vdescripcion="9999999999";
         while (rs.next()){ 
         if (!(rs.getString("fun_descripcion").equals(vdescripcion))) {
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[35]);
      /*@lineinfo:user-code*//*@lineinfo:94^4*/       vdescripcion=rs.getString("fun_descripcion");
         } 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[36]);
      /*@lineinfo:user-code*//*@lineinfo:97^3*/       if (pnum==1) {
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[37]);
      /*@lineinfo:user-code*//*@lineinfo:99^3*/       } else { 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[38]);
      /*@lineinfo:user-code*//*@lineinfo:101^3*/       } 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[39]);
      /*@lineinfo:user-code*//*@lineinfo:102^22*/      out.print( rs.getString("act_codigo") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[40]);
      /*@lineinfo:user-code*//*@lineinfo:103^20*/      out.print( rs.getString("act_codanterior") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[41]);
      /*@lineinfo:user-code*//*@lineinfo:104^20*/      out.print( rs.getString("grp_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[42]);
      /*@lineinfo:user-code*//*@lineinfo:105^20*/      out.print( rs.getString("act_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[43]);
      /*@lineinfo:user-code*//*@lineinfo:106^22*/      out.print( rs.getString("act_estado") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[44]);
      /*@lineinfo:user-code*//*@lineinfo:107^20*/      out.print( rs.getString("ubi_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[45]);
      /*@lineinfo:user-code*//*@lineinfo:108^20*/      out.print( rs.getString("fun_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[46]);
      /*@lineinfo:user-code*//*@lineinfo:109^20*/      out.print( rs.getString("act_ultimo_doc") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[47]);
      /*@lineinfo:user-code*//*@lineinfo:111^3*/       
          if (pnum==0) pnum=1; else pnum=0;
         }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[48]);
      /*@lineinfo:user-code*//*@lineinfo:117^3*/      
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
      
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[49]);


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
    private static final char text[][]=new char[50][];
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
      "\n    ".toCharArray();
      text[6] = 
      "\n    ".toCharArray();
      text[7] = 
      "\n    ".toCharArray();
      text[8] = 
      "    \n    ".toCharArray();
      text[9] = 
      "\n    ".toCharArray();
      text[10] = 
      "\n    ".toCharArray();
      text[11] = 
      "    \n    ".toCharArray();
      text[12] = 
      "\n    ".toCharArray();
      text[13] = 
      "\n    ".toCharArray();
      text[14] = 
      "    \n    ".toCharArray();
      text[15] = 
      "\n    ".toCharArray();
      text[16] = 
      "\n    ".toCharArray();
      text[17] = 
      "    \n    ".toCharArray();
      text[18] = 
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<body>\n".toCharArray();
      text[19] = 
      "\nVolver\n".toCharArray();
      text[20] = 
      "\n".toCharArray();
      text[21] = 
      "\n  <center><h2>Listado de Activos Fijos por Referencia</h2></center>\n  <h3>Referencia : ".toCharArray();
      text[22] = 
      "</h3>\n".toCharArray();
      text[23] = 
      "    \n".toCharArray();
      text[24] = 
      "\n  <center><h2>Listado de Activos Fijos por Responsable</h2></center>\n  <h3>Responsable : ".toCharArray();
      text[25] = 
      "</h3>\n  <h4>Rubro : ".toCharArray();
      text[26] = 
      "</h4>\n".toCharArray();
      text[27] = 
      "    \n".toCharArray();
      text[28] = 
      "\n  <center><h2>Listado de Activos Fijos por Ubicación</h2></center>\n  <h3>Ubicación : ".toCharArray();
      text[29] = 
      "</h3>\n".toCharArray();
      text[30] = 
      "    \n".toCharArray();
      text[31] = 
      "\n  <center><h2>Listado de Activos Fijos por Rango de Codigo</h2></center>\n  <h3>De : ".toCharArray();
      text[32] = 
      "</h3>\n  <h3>A  : ".toCharArray();
      text[33] = 
      "</h3>\n".toCharArray();
      text[34] = 
      "    \n\n<table width=\"90%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-size:10px\">\n  <tr class=\"FondoAzul10\">\n  <td align=\"center\">Codigo</td>\n  <td align=\"center\">Código Anterior</td>\n  <td align=\"center\" colspan=\"2\">Descripcion</td>\n  <td align=\"center\">Estado</td>\n  <td align=\"center\">Ubicacion</td>\n  <td align=\"center\">Responsable</td>\n  <td align=\"center\">Documento</td>\n  </tr>\n".toCharArray();
      text[35] = 
      "\n      <tr>\n        <td colspan=\"8\"></td>\n      </tr>\n   ".toCharArray();
      text[36] = 
      "\n\n  ".toCharArray();
      text[37] = 
      "\n     <tr class=\"suave\">\n  ".toCharArray();
      text[38] = 
      "\n     <tr>\n  ".toCharArray();
      text[39] = 
      "\n  <td align=\"center\">".toCharArray();
      text[40] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[41] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[42] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[43] = 
      "</td>\n  <td align=\"center\">".toCharArray();
      text[44] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[45] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[46] = 
      "</td>\n  <td align=\"left\">".toCharArray();
      text[47] = 
      "</td>\n  </tr>\n  ".toCharArray();
      text[48] = 
      "\n</table>\n</body>\n</html>\n  ".toCharArray();
      text[49] = 
      "\n\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
