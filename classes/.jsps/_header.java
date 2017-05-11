  /*@lineinfo:filename=/header.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _header extends oracle.jsp.runtime.HttpJsp {

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
    _header page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:18^11*/      {
        org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_1=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("InicioForm");
        __jsp_taghandler_1.setProperty("regional");
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
      out.write(__jsp_StaticText.text[3]);
      /*@lineinfo:translated-code*//*@lineinfo:23^11*/      {
        org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_2=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setName("InicioForm");
        __jsp_taghandler_2.setProperty("financiador");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:28^11*/      {
        org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_3=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setName("InicioForm");
        __jsp_taghandler_3.setProperty("nombreUsuario");
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
      out.write(__jsp_StaticText.text[5]);
      /*@lineinfo:translated-code*//*@lineinfo:34^11*/      {
        org.apache.struts.taglib.html.LinkTag __jsp_taghandler_4=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setHref("paginamenu.do");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
          /*@lineinfo:translated-code*//*@lineinfo:34^43*/          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[7]);


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
    private static final char text[][]=new char[8][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n\n<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" bgcolor=\"#30509A\">\n  <tr> \n    <td align=\"center\">\n        <FONT color=\"#FFFFF\" face=\"Arial, Helvetica, san-serif\" size=4  > \n             Sistema de Activos Fijos  \n        </FONT> \n    </td>\n  </tr>\n</table>  \n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" >\n  <tr valign=\"middle\"> \n    <td align=\"left\">\n      <FONT color=\"#000066\" face=\"Arial, Helvetica, san-serif\" size=2 > \n          ".toCharArray();
      text[3] = 
      " \n      </FONT>    \n    </td>\n    <td align=\"left\">\n      <FONT color=\"#000066\" face=\"Arial, Helvetica, san-serif\" size=2 > \n          ".toCharArray();
      text[4] = 
      " \n      </FONT>    \n    </td>\n    <td align=\"right\">\n      <FONT color=\"#000066\" face=\"Arial, Helvetica, san-serif\" size=2 > \n          ".toCharArray();
      text[5] = 
      " \n      </FONT>    \n    </td>\n    <td align=\"center\"> \n      <FONT color=\"#000066\" face=\"Arial, Helvetica, san-serif\" size=2> \n        <em> \n          ".toCharArray();
      text[6] = 
      "Menu Principal\n          ".toCharArray();
      text[7] = 
      " \n        </em>\n      </FONT>\n    </td>\n  </tr>\n</table>\n<hr>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
