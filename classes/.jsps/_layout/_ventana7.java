  /*@lineinfo:filename=/layout/ventana7.jsp*/
  /*@lineinfo:generated-code*/
package _layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _ventana7 extends oracle.jsp.runtime.HttpJsp {

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
    _ventana7 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:translated-code*//*@lineinfo:4^1*/      {
        org.apache.struts.taglib.html.HtmlTag __jsp_taghandler_1=(org.apache.struts.taglib.html.HtmlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HtmlTag.class,"org.apache.struts.taglib.html.HtmlTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[2]);
          /*@lineinfo:translated-code*//*@lineinfo:4^12*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[3]);


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
    private static final char text[][]=new char[4][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n\n".toCharArray();
      text[2] = 
      "\n<head>\n  <title></title>\n  <meta http-equiv=\"Pragma\" content=\"no-cache\">\n  <meta http-equiv=\"cache-control\" value=\"no-cache, no-store, must-revalidate\">\n  <meta http-equiv=\"Expires\" content=\"-1\">\n  <meta name=\"Author\" content=\"Donald Gemio\" lang=\"es\"> \n  <meta name=\"copyright\" content=\"&copy; 2005, PMA CONSULT\" lang=\"es\">     \n  <link rel=\"stylesheet\" href=\"Estilos.css\" type=\"text/css\"/>\n</head>\n  <script language=\"JavaScript\" type=\"text/JavaScript\">\n\n  </script>\n\n<body text=\"#000000\" link=\"#023264\" vlink=\"#023264\" alink=\"#023264\"  oncontextmenu=\"return false\">\n\n<center>\n  <table width=100% border=\"0\" cellspacing=\"1\">\n    <tr>\n      <td align=\"center\" valign=\"top\" width=100%>       \n     </td>\n    </tr>\n  </table>\n</center>\n</body>\n".toCharArray();
      text[3] = 
      "\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
