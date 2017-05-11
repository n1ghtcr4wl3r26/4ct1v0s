  /*@lineinfo:filename=/layout/ventana01.jsp*/
  /*@lineinfo:generated-code*/
package _layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _ventana01 extends oracle.jsp.runtime.HttpJsp {

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
    _ventana01 page = this;
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
            /*@lineinfo:translated-code*//*@lineinfo:6^12*/            {
              org.apache.struts.taglib.tiles.GetAttributeTag __jsp_taghandler_2=(org.apache.struts.taglib.tiles.GetAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.GetAttributeTag.class,"org.apache.struts.taglib.tiles.GetAttributeTag name");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setName("title");
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
            out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:23^11*/            {
              org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_3=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setAttribute("header");
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
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:29^11*/            {
              org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_4=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setAttribute("menu");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:33^11*/            {
              org.apache.struts.taglib.html.ErrorsTag __jsp_taghandler_5=(org.apache.struts.taglib.html.ErrorsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.ErrorsTag.class,"org.apache.struts.taglib.html.ErrorsTag");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:34^11*/            {
              org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_6=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setAttribute("body");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:40^11*/            {
              org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_7=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setAttribute("footer");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[8]);
          /*@lineinfo:translated-code*//*@lineinfo:40^46*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/


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
    private static final char text[][]=new char[9][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n\n".toCharArray();
      text[2] = 
      "\n  <head>\n    <title>".toCharArray();
      text[3] = 
      "</title>\n    <meta http-equiv=\"Pragma\" content=\"no-cache\">\n    <meta http-equiv=\"cache-control\" value=\"no-cache, no-store, must-revalidate\">\n    <meta http-equiv=\"Expires\" content=\"-1\">\n    <meta name=\"Author\" content=\"Donald Gemio\" lang=\"es\"> \n    <meta name=\"copyright\" content=\"&copy; 2006, PMA CONSULT\" lang=\"es\">     \n    <link rel=\"stylesheet\" href=\"Estilos.css\" type=\"text/css\"/>\n  </head>\n  <script language=\"JavaScript\" type=\"text/JavaScript\">\n\n  </script>\n  <body bgcolor=\"#ffffff\" text=\"#000000\" link=\"#023264\" alink=\"#023264\" vlink=\"#023264\" oncontextmenu=\"return false\">\n  \n  <center>\n    <table width=100% border=\"0\" cellspacing=\"1\">\n      <tr>\n        <td colspan=\"2\" width=100%>\n          ".toCharArray();
      text[4] = 
      "\n        </td>\n      </tr>\n\n      <tr>\n        <td valign=\"top\" width=18%>\n          ".toCharArray();
      text[5] = 
      "\n        </td>\n\n        <td valign=\"top\" width=82%>\n          ".toCharArray();
      text[6] = 
      "\n          ".toCharArray();
      text[7] = 
      "\n        </td>\n      </tr>\n      \n      <tr>\n        <td colspan=\"2\" width=100%>\n          ".toCharArray();
      text[8] = 
      "\n        </td>\n      </tr>\n    </table>\n  </center>\n\n  </body>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
