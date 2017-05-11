  /*@lineinfo:filename=/layout/ventana04.jsp*/
  /*@lineinfo:generated-code*/
package _layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;
import ActivosFijos.*;;


public class _ventana04 extends oracle.jsp.runtime.HttpJsp {

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
    _ventana04 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      out.write(__jsp_StaticText.text[5]);
      /*@lineinfo:translated-code*//*@lineinfo:9^1*/      {
        org.apache.struts.taglib.tiles.ImportAttributeTag __jsp_taghandler_1=(org.apache.struts.taglib.tiles.ImportAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.ImportAttributeTag.class,"org.apache.struts.taglib.tiles.ImportAttributeTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[6]);
      /*@lineinfo:translated-code*//*@lineinfo:13^3*/      {
        org.apache.struts.taglib.logic.PresentTag __jsp_taghandler_2=(org.apache.struts.taglib.logic.PresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.PresentTag.class,"org.apache.struts.taglib.logic.PresentTag name");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setName("title");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[7]);
            out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:17^18*/            {
              org.apache.struts.taglib.tiles.GetAttributeTag __jsp_taghandler_3=(org.apache.struts.taglib.tiles.GetAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.GetAttributeTag.class,"org.apache.struts.taglib.tiles.GetAttributeTag name");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setName("title");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[9]);
          /*@lineinfo:translated-code*//*@lineinfo:17^51*/          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[10]);
      out.write(__jsp_StaticText.text[11]);
      /*@lineinfo:translated-code*//*@lineinfo:23^3*/      {
        org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name type");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setId("item");
        __jsp_taghandler_4.setName("items");
        __jsp_taghandler_4.setType("org.apache.struts.tiles.beans.MenuItem");
        org.apache.struts.tiles.beans.MenuItem item = null;
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
          do {
            item = (org.apache.struts.tiles.beans.MenuItem) pageContext.findAttribute("item");
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:user-code*//*@lineinfo:24^5*/            
                  String link = item.getLink();
                  if(link.startsWith("/") ) link = request.getContextPath() + link;
            
                   String valor = item.getValue();
                   InicioForm iform = (InicioForm) request.getSession().getAttribute("InicioForm");               
                   ArrayList op = (ArrayList) iform.getOpciones();
                   Iterator i = op.iterator();
                   while (i.hasNext()) {	
                          ClaseOpcion reg =	(ClaseOpcion) i.next();	
                          String cod = reg.getNombre();       
                          if ( valor.equals(cod))
                          { 
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[13]);
            /*@lineinfo:user-code*//*@lineinfo:39^53*/            out.print(link);
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[14]);
            /*@lineinfo:user-code*//*@lineinfo:40^23*/            
                                    String res = reg.getDescripcion();
                                    out.println(".: " + res); 
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[15]);
            /*@lineinfo:user-code*//*@lineinfo:46^20*/               
                          }
                           }
                          
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[16]);
          /*@lineinfo:translated-code*//*@lineinfo:49^17*/          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[17]);


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
    private static final char text[][]=new char[18][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n\n".toCharArray();
      text[3] = 
      "\n".toCharArray();
      text[4] = 
      "\n".toCharArray();
      text[5] = 
      "\n\n".toCharArray();
      text[6] = 
      "\n\n<table border=\"0\" cellPadding=\"0\" cellSpacing=\"2\" class=\"menu\" width=\"160\">\n\n  ".toCharArray();
      text[7] = 
      "\n    <tr>\n      ".toCharArray();
      text[8] = 
      "\n      <td class=\"cabecera_menu\" height=\"25\" width=\"100%\">\n        <strong> ".toCharArray();
      text[9] = 
      " </strong>\n      </td>\n    </tr>\n  ".toCharArray();
      text[10] = 
      "\n\n  ".toCharArray();
      text[11] = 
      "\n  ".toCharArray();
      text[12] = 
      "\n    ".toCharArray();
      text[13] = 
      "\n                <tr>\n                   <td class=\"entrada_menu\">\n                      <a class=\"entrada_menu\" href=\"".toCharArray();
      text[14] = 
      "\">                  \n                      ".toCharArray();
      text[15] = 
      "                                       \n                      </a>\n                   </td>\n                </tr>\n                   ".toCharArray();
      text[16] = 
      "            \n\n  ".toCharArray();
      text[17] = 
      "\n</table>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
