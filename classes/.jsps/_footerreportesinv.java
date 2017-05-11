  /*@lineinfo:filename=/footerreportesinv.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _footerreportesinv extends oracle.jsp.runtime.HttpJsp {

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
    _footerreportesinv page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      /*@lineinfo:translated-code*//*@lineinfo:7^11*/      {
        org.apache.struts.taglib.html.LinkTag __jsp_taghandler_1=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href styleClass");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setHref("inventarios.do");
        __jsp_taghandler_1.setStyleClass("T8b");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[1]);
          /*@lineinfo:translated-code*//*@lineinfo:7^61*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[2]);


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
    private static final char text[][]=new char[3][];
    static {
      try {
      text[0] = 
      "\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n  <tr>\n    <td align=\"center\"> \n      <FONT color=\"#023264\" face=\"Arial, Helvetica, san-serif\" size=1> \n        <em> \n          ".toCharArray();
      text[1] = 
      "\n          © 2006  Aduana Nacional de Bolivia Todos los derechos reservados.\n          ".toCharArray();
      text[2] = 
      " \n        </em>\n      </FONT>\n    </td>\n  </tr>\n</table>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
