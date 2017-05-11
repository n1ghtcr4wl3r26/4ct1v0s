  /*@lineinfo:filename=/layout/ventana03.jsp*/
  /*@lineinfo:generated-code*/
package _layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;


public class _ventana03 extends oracle.jsp.runtime.HttpJsp {

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
    _ventana03 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:translated-code*//*@lineinfo:5^1*/      {
        org.apache.struts.taglib.tiles.UseAttributeTag __jsp_taghandler_1=(org.apache.struts.taglib.tiles.UseAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.UseAttributeTag.class,"org.apache.struts.taglib.tiles.UseAttributeTag id classname name");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("list");
        __jsp_taghandler_1.setClassname("java.util.List");
        __jsp_taghandler_1.setName("list");
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
      java.util.List list = null;
      list = (java.util.List) pageContext.findAttribute("list");
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:user-code*//*@lineinfo:7^1*/      
        Iterator i=list.iterator();
        while( i.hasNext() ) {
         String name= (String)i.next();
      
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[3]);
      /*@lineinfo:translated-code*//*@lineinfo:12^3*/      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_2=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag name flush");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setName( OracleJspRuntime.toStr( name));
        __jsp_taghandler_2.setFlush(true);
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
      /*@lineinfo:user-code*//*@lineinfo:14^1*/      
        } // end loop
      
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
    private static final char text[][]=new char[5][];
    static {
      try {
      text[0] = 
      "\n\n".toCharArray();
      text[1] = 
      "\n\n".toCharArray();
      text[2] = 
      "\n\n".toCharArray();
      text[3] = 
      "\n  ".toCharArray();
      text[4] = 
      "\n  <br>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
