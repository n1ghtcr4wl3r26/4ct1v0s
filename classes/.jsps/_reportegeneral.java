  /*@lineinfo:filename=/reportegeneral.jsp*/
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


public class _reportegeneral extends oracle.jsp.runtime.HttpJsp {

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
    _reportegeneral page = this;
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
          NumberFormat formatter = new DecimalFormat("###,###,##0.0000");
          cn = dc.getConexion();
          call = cn.prepareCall("{? = call pg_activos.reportedepreciacion_d() }");
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
      /*@lineinfo:user-code*//*@lineinfo:51^1*/      
         String pcodigo="99999999";
         int pnum=0;
         double valor1=0;
         double valor2=0;
         double valor3=0;
         double valor4=0;
         double valor5=0;
         double valor6=0;
         double valor7=0;
         double valor8=0;
         double valor9=0;
         while (rs.next()){ 
         if ((!pcodigo.equals(rs.getString("unidad")))&&(!pcodigo.equals("99999999"))) {
         
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[8]);
      /*@lineinfo:user-code*//*@lineinfo:73^22*/      out.print( formatter.format(valor1) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[9]);
      /*@lineinfo:user-code*//*@lineinfo:74^22*/      out.print( formatter.format(valor2) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[10]);
      /*@lineinfo:user-code*//*@lineinfo:75^22*/      out.print( formatter.format(valor3) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[11]);
      /*@lineinfo:user-code*//*@lineinfo:76^22*/      out.print( formatter.format(valor4) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[12]);
      /*@lineinfo:user-code*//*@lineinfo:77^22*/      out.print( formatter.format(valor5) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[13]);
      /*@lineinfo:user-code*//*@lineinfo:78^22*/      out.print( formatter.format(valor6) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[14]);
      /*@lineinfo:user-code*//*@lineinfo:79^22*/      out.print( formatter.format(valor7) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[15]);
      /*@lineinfo:user-code*//*@lineinfo:80^22*/      out.print( formatter.format(valor8) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[16]);
      /*@lineinfo:user-code*//*@lineinfo:81^22*/      out.print( formatter.format(valor9) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[17]);
      /*@lineinfo:user-code*//*@lineinfo:83^4*/       
            valor1=0;
            valor2=0;
            valor3=0;
            valor4=0;
            valor5=0;
            valor6=0;
            valor7=0;
            valor8=0;
            valor9=0;
         } 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[18]);
      /*@lineinfo:user-code*//*@lineinfo:94^3*/       if (pnum==1) {
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[19]);
      /*@lineinfo:user-code*//*@lineinfo:96^3*/       } else { 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[20]);
      /*@lineinfo:user-code*//*@lineinfo:98^3*/       } 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[21]);
      /*@lineinfo:user-code*//*@lineinfo:99^22*/      out.print( rs.getString("unidad") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[22]);
      /*@lineinfo:user-code*//*@lineinfo:100^21*/      out.print( rs.getString("codigo") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[23]);
      /*@lineinfo:user-code*//*@lineinfo:101^21*/      out.print( rs.getString("detalle") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[24]);
      /*@lineinfo:user-code*//*@lineinfo:102^21*/      out.print( rs.getInt("vida_util") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[25]);
      /*@lineinfo:user-code*//*@lineinfo:103^22*/      out.print( rs.getString("fecha_activacion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[26]);
      /*@lineinfo:user-code*//*@lineinfo:104^21*/      out.print( formatter.format(rs.getDouble("valor_adquisicion")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[27]);
      /*@lineinfo:user-code*//*@lineinfo:105^21*/      out.print( formatter.format(rs.getDouble("valor_original_2004")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[28]);
      /*@lineinfo:user-code*//*@lineinfo:106^21*/      out.print( formatter.format(rs.getDouble("actualizacion_valores_2004")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[29]);
      /*@lineinfo:user-code*//*@lineinfo:107^21*/      out.print( formatter.format(rs.getDouble("valor_original_2004")+rs.getDouble("actualizacion_valores_2004")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[30]);
      /*@lineinfo:user-code*//*@lineinfo:108^21*/      out.print( formatter.format(rs.getDouble("depreciacion_acumulada_2004")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[31]);
      /*@lineinfo:user-code*//*@lineinfo:109^21*/      out.print( formatter.format(rs.getDouble("depreciacion_2005")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[32]);
      /*@lineinfo:user-code*//*@lineinfo:110^21*/      out.print( formatter.format(rs.getDouble("actualizacion_valores_2005")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[33]);
      /*@lineinfo:user-code*//*@lineinfo:111^21*/      out.print( formatter.format(rs.getDouble("depreciacion_acumulada_2004")+rs.getDouble("depreciacion_2005")+rs.getDouble("actualizacion_valores_2005")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[34]);
      /*@lineinfo:user-code*//*@lineinfo:112^21*/      out.print( formatter.format(rs.getDouble("valor_original_2004")+rs.getDouble("actualizacion_valores_2004")-rs.getDouble("depreciacion_acumulada_2004")+rs.getDouble("depreciacion_2005")+rs.getDouble("actualizacion_valores_2005")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[35]);
      /*@lineinfo:user-code*//*@lineinfo:114^3*/       pcodigo=rs.getString("unidad");
          if (pnum==0) pnum=1; else pnum=0;
          valor1=valor1 + rs.getDouble("valor_adquisicion");
          valor2=valor2 + rs.getDouble("valor_original_2004");
          valor3=valor3 + rs.getDouble("actualizacion_valores_2004");  
          valor4=valor4 + rs.getDouble("valor_original_2004")+rs.getDouble("actualizacion_valores_2004");
          valor5=valor5 + rs.getDouble("depreciacion_acumulada_2004");
          valor6=valor6 + rs.getDouble("depreciacion_2005");
          valor7=valor7 + rs.getDouble("actualizacion_valores_2005");
          valor8=valor8 + rs.getDouble("depreciacion_acumulada_2004")+rs.getDouble("depreciacion_2005")+rs.getDouble("actualizacion_valores_2005");
          valor9=valor9 + rs.getDouble("valor_original_2004")+rs.getDouble("actualizacion_valores_2004")-rs.getDouble("depreciacion_acumulada_2004")+rs.getDouble("depreciacion_2005")+rs.getDouble("actualizacion_valores_2005");
         }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[36]);
      /*@lineinfo:user-code*//*@lineinfo:133^22*/      out.print( formatter.format(valor1) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[37]);
      /*@lineinfo:user-code*//*@lineinfo:134^22*/      out.print( formatter.format(valor2) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[38]);
      /*@lineinfo:user-code*//*@lineinfo:135^22*/      out.print( formatter.format(valor3) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[39]);
      /*@lineinfo:user-code*//*@lineinfo:136^22*/      out.print( formatter.format(valor4) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[40]);
      /*@lineinfo:user-code*//*@lineinfo:137^22*/      out.print( formatter.format(valor5) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[41]);
      /*@lineinfo:user-code*//*@lineinfo:138^22*/      out.print( formatter.format(valor6) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[42]);
      /*@lineinfo:user-code*//*@lineinfo:139^22*/      out.print( formatter.format(valor7) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[43]);
      /*@lineinfo:user-code*//*@lineinfo:140^22*/      out.print( formatter.format(valor8) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[44]);
      /*@lineinfo:user-code*//*@lineinfo:141^22*/      out.print( formatter.format(valor9) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[45]);
      /*@lineinfo:user-code*//*@lineinfo:146^3*/      
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
      out.write(__jsp_StaticText.text[46]);


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
    private static final char text[][]=new char[47][];
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
      "\n<center><h2>Inventario General de Activos Fijos</h2></center>\n<center><h2>(Expresado en Bolivianos)</h2></center>\n<table width=\"90%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-size:10px\">\n  <tr class=\"FondoAzul10\">\n  <td align=\"center\">Unidad</td>\n  <td align=\"center\">Código</td>\n  <td align=\"center\">Detalle</td>\n  <td align=\"center\">Vida Util</td>\n  <td align=\"center\">Resto Util</td>\n  <td align=\"center\">Fecha Activación</td>\n  <td align=\"center\">Valor Adquisición</td>\n  <td align=\"center\">Valor Original<br>Gestion Anterior</td>\n  <td align=\"center\">Actualizaciones<br>Valores<br>Gestión Actual</td>\n  <td align=\"center\">Valor Original<br>Gestion Actual</td>\n  <td align=\"center\">Actualización</td>\n  <td align=\"center\">Depreciación<br>Acumulada Gestión Anterior</td>  \n  <td align=\"center\">Depreciación Gestión Actual</td>  \n  <td align=\"center\">Actualizaciones<br>Valores<br>Gestión Actual</td>\n  <td align=\"center\">Depreciación<br>Acumulada<br>Gestión Actual</td>  \n  <td align=\"center\">Valor Residual</td>\n  </tr>\n".toCharArray();
      text[8] = 
      "\n   <tr>\n   <td colspan=\"5\">Sub Total : </td>\n   <td></td>\n   <td></td>\n   <td></td>\n   <td></td>\n   <td></td>\n   <td align=\"right\">".toCharArray();
      text[9] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[10] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[11] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[12] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[13] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[14] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[15] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[16] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[17] = 
      "</td>   \n   </tr>\n   ".toCharArray();
      text[18] = 
      "\n  ".toCharArray();
      text[19] = 
      "\n     <tr class=\"suave\">\n  ".toCharArray();
      text[20] = 
      "\n     <tr>\n  ".toCharArray();
      text[21] = 
      "\n  <td align=\"cwnter\">".toCharArray();
      text[22] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[23] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[24] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[25] = 
      "</td>\n  <td align=\"center\">".toCharArray();
      text[26] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[27] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[28] = 
      "</td>  \n  <td align=\"right\">".toCharArray();
      text[29] = 
      "</td>  \n  <td align=\"right\">".toCharArray();
      text[30] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[31] = 
      "</td>  \n  <td align=\"right\">".toCharArray();
      text[32] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[33] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[34] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[35] = 
      "</td>\n  </tr>\n  ".toCharArray();
      text[36] = 
      "\n   <tr>\n   <td colspan=\"5\">Sub Total : </td>\n   <td></td>\n   <td></td>\n   <td></td>\n   <td></td>\n   <td></td>\n   <td align=\"right\">".toCharArray();
      text[37] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[38] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[39] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[40] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[41] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[42] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[43] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[44] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[45] = 
      "</td>   \n   </tr>\n</table>\n</body>\n</html>\n  ".toCharArray();
      text[46] = 
      "\n\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
