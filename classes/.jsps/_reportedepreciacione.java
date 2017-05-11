  /*@lineinfo:filename=/reportedepreciacione.jsp*/
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


public class _reportedepreciacione extends oracle.jsp.runtime.HttpJsp {

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
    _reportedepreciacione page = this;
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
        String vcondicion1 = (String) session.getAttribute("condicion1");
        String vcondicion2 = (String) session.getAttribute("condicion2");
        String vcod_inicial = (String) session.getAttribute("cod_inicial");
        String vcod_final = (String) session.getAttribute("cod_final");
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement call = null;
        try {
          NumberFormat formatter4 = new DecimalFormat("###,###,##0.0000");
          NumberFormat formatter5 = new DecimalFormat("###,###,##0.00000");
          cn = dc.getConexion();
          call = cn.prepareCall("{? = call pg_activos.reportedepreciacion(?,?,?,?) }");
          call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
          call.setString(2,vcondicion1);
          call.setString(3,vcondicion2);
          call.setString(4,vcod_inicial);
          call.setString(5,vcod_final);
          call.execute();
          rs = (ResultSet) call.getObject(1);
      
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[5]);
      /*@lineinfo:translated-code*//*@lineinfo:36^1*/      {
        org.apache.struts.taglib.html.LinkTag __jsp_taghandler_1=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setHref("depreciaciones.do");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
          /*@lineinfo:translated-code*//*@lineinfo:36^37*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[7]);
      /*@lineinfo:user-code*//*@lineinfo:60^1*/      
         String pcodigo="99999999";
         int pnum=0;
         double valbol=0;
         double facbol=0;
         double depvalbol=0;
         double depfacbol=0;
         double depfactordol=0;
         while (rs.next()){
         if (rs.getDouble("dep_actuvalbol")-rs.getDouble("dep_actufacdol")==0) {
            depfactordol=rs.getDouble("dep_factordol")-1;
         } 
         else {
            depfactordol=rs.getDouble("dep_factordol");
         }
         if ((!pcodigo.equals(rs.getString("codigo")))&&(!pcodigo.equals("99999999"))) {
         
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[8]);
      /*@lineinfo:user-code*//*@lineinfo:79^22*/      out.print( formatter4.format(valbol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[9]);
      /*@lineinfo:user-code*//*@lineinfo:82^22*/      out.print( formatter4.format(depvalbol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[10]);
      /*@lineinfo:user-code*//*@lineinfo:83^22*/      out.print( formatter4.format(facbol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[11]);
      /*@lineinfo:user-code*//*@lineinfo:84^22*/      out.print( formatter4.format(depfacbol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[12]);
      /*@lineinfo:user-code*//*@lineinfo:87^4*/       
            valbol=0;
            facbol=0;
            depvalbol=0;
            depfacbol=0;  
         } 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[13]);
      /*@lineinfo:user-code*//*@lineinfo:93^3*/       if (pnum==1) {
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[14]);
      /*@lineinfo:user-code*//*@lineinfo:95^3*/       } else { 
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[15]);
      /*@lineinfo:user-code*//*@lineinfo:97^3*/       } 
        String ceros=null;
        if (rs.getInt("dep_codigo")<10000)
           ceros="0";
        if (rs.getInt("dep_codigo")<1000)
           ceros="00";
        if (rs.getInt("dep_codigo")<100)
           ceros="000";
        if (rs.getInt("dep_codigo")<10)
           ceros="0000";  
        
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[16]);
      /*@lineinfo:user-code*//*@lineinfo:108^22*/      out.print( rs.getString("dep_codrub") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[17]);
      /*@lineinfo:user-code*//*@lineinfo:108^56*/      out.print( rs.getString("dep_codreg") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[18]);
      /*@lineinfo:user-code*//*@lineinfo:108^90*/      out.print( ceros );
      /*@lineinfo:user-code*//*@lineinfo:108^102*/      out.print( rs.getString("dep_codigo") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[19]);
      /*@lineinfo:user-code*//*@lineinfo:109^21*/      out.print( rs.getString("act_descripcion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[20]);
      /*@lineinfo:user-code*//*@lineinfo:110^21*/      out.print( rs.getInt("rev_vidaut")-rs.getInt("dep_numdepreciacion") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[21]);
      /*@lineinfo:user-code*//*@lineinfo:111^21*/      out.print( rs.getInt("rev_vidaut") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[22]);
      /*@lineinfo:user-code*//*@lineinfo:112^22*/      out.print( rs.getString("rev_fecha") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[23]);
      /*@lineinfo:user-code*//*@lineinfo:113^22*/      out.print( rs.getString("dep_fecha") );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[24]);
      /*@lineinfo:user-code*//*@lineinfo:114^21*/      out.print( formatter5.format(rs.getDouble("dep_tipufvini")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[25]);
      /*@lineinfo:user-code*//*@lineinfo:115^21*/      out.print( formatter5.format(rs.getDouble("dep_tipufvfin")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[26]);
      /*@lineinfo:user-code*//*@lineinfo:117^21*/      out.print( formatter4.format(rs.getDouble("dep_actuvalbol")-rs.getDouble("dep_factorbol")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[27]);
      /*@lineinfo:user-code*//*@lineinfo:118^21*/      out.print( formatter4.format(rs.getDouble("dep_factorbol")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[28]);
      /*@lineinfo:user-code*//*@lineinfo:119^21*/      out.print( formatter4.format(rs.getDouble("dep_actuvalbol")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[29]);
      /*@lineinfo:user-code*//*@lineinfo:120^21*/      out.print( formatter4.format(rs.getDouble("dep_actufacdol")-rs.getDouble("dep_actufacbol")-depfactordol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[30]);
      /*@lineinfo:user-code*//*@lineinfo:122^21*/      out.print( formatter4.format(rs.getDouble("dep_actufacbol")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[31]);
      /*@lineinfo:user-code*//*@lineinfo:123^21*/      out.print( formatter4.format(depfactordol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[32]);
      /*@lineinfo:user-code*//*@lineinfo:124^21*/      out.print( formatter4.format(rs.getDouble("dep_actufacdol")) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[33]);
      /*@lineinfo:user-code*//*@lineinfo:125^21*/      out.print( formatter4.format(rs.getDouble("dep_actuvalbol")-rs.getDouble("dep_actufacdol")));
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[34]);
      /*@lineinfo:user-code*//*@lineinfo:127^3*/       pcodigo=rs.getString("codigo");
         if (pnum==0) pnum=1; else pnum=0;
         valbol=valbol+rs.getDouble("dep_factorbol");
         depvalbol=depvalbol+rs.getDouble("dep_actufacbol");
         facbol=facbol+depfactordol;
         depfacbol=depfacbol+rs.getDouble("dep_actufacdol");
         }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[35]);
      /*@lineinfo:user-code*//*@lineinfo:136^22*/      out.print( formatter4.format(valbol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[36]);
      /*@lineinfo:user-code*//*@lineinfo:139^22*/      out.print( formatter4.format(depvalbol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[37]);
      /*@lineinfo:user-code*//*@lineinfo:140^22*/      out.print( formatter4.format(facbol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[38]);
      /*@lineinfo:user-code*//*@lineinfo:141^22*/      out.print( formatter4.format(depfacbol) );
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[39]);
      /*@lineinfo:user-code*//*@lineinfo:147^3*/      
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
      out.write(__jsp_StaticText.text[40]);


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
    private static final char text[][]=new char[41][];
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
      "\n<center><h2>Inventario General de Activos Fijos</h2></center>\n<center><h2>(Expresado en bolivianos)</h2></center>\n<table width=\"90%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-size:10px\">\n  <tr class=\"FondoAzul10\">\n  <td align=\"center\">Activo</td>\n  <td align=\"center\">Descripción</td>\n  <td align=\"center\">Resto Util</td>\n  <td align=\"center\">Vida Util</td>\n  <td align=\"center\">Fecha Activación</td>\n  <td align=\"center\">Fecha Depreciación</td>\n  <td align=\"center\">UFV Ini</td>\n  <td align=\"center\">UFV final</td>\n  <td align=\"center\">Valor</td>\n  <td align=\"center\">Actualización</td>\n  <td align=\"center\">Valor Actualización</td>\n  <td align=\"center\">Depreciación Mes Anterior</td>  \n  <td align=\"center\">Depreciación</td>  \n  <td align=\"center\">Actualización</td>\n  <td align=\"center\">Depreciación Actualización</td>\n  <td align=\"center\">Valor Neto</td>\n  </tr>\n".toCharArray();
      text[8] = 
      "\n   <tr>\n   <td colspan=\"9\">Sub Total : </td>\n   <td align=\"right\">".toCharArray();
      text[9] = 
      "</td>\n   <td></td>\n   <td></td>\n   <td align=\"right\">".toCharArray();
      text[10] = 
      "</td>\n   <td align=\"right\">".toCharArray();
      text[11] = 
      "</td>\n   <td align=\"right\">".toCharArray();
      text[12] = 
      "</td>\n   <td></td>\n   </tr>\n   ".toCharArray();
      text[13] = 
      "\n  ".toCharArray();
      text[14] = 
      "\n     <tr class=\"suave\">\n  ".toCharArray();
      text[15] = 
      "\n     <tr>\n  ".toCharArray();
      text[16] = 
      "\n  <td align=\"cwnter\">".toCharArray();
      text[17] = 
      "-".toCharArray();
      text[18] = 
      "-".toCharArray();
      text[19] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[20] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[21] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[22] = 
      "</td>\n  <td align=\"center\">".toCharArray();
      text[23] = 
      "</td>\n  <td align=\"center\">".toCharArray();
      text[24] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[25] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[26] = 
      "</td>\n  \n  <td align=\"right\">".toCharArray();
      text[27] = 
      "</td>  \n  <td align=\"right\">".toCharArray();
      text[28] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[29] = 
      "</td>  \n  <td align=\"right\">".toCharArray();
      text[30] = 
      "</td>\n  \n  <td align=\"right\">".toCharArray();
      text[31] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[32] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[33] = 
      "</td>\n  <td align=\"right\">".toCharArray();
      text[34] = 
      "</td>  \n  </tr>\n  ".toCharArray();
      text[35] = 
      "\n   <tr>\n   <td colspan=\"9\">Sub Total : </td>\n   <td align=\"right\">".toCharArray();
      text[36] = 
      "</td>   \n   <td></td>\n   <td></td>   \n   <td align=\"right\">".toCharArray();
      text[37] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[38] = 
      "</td>   \n   <td align=\"right\">".toCharArray();
      text[39] = 
      "</td>   \n   <td></td>\n   </tr>\n</table>\n</body>\n</html>\n  ".toCharArray();
      text[40] = 
      "\n\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
