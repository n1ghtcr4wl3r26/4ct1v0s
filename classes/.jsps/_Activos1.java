  /*@lineinfo:filename=/Activos1.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Activos1 extends oracle.jsp.runtime.HttpJsp {

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
    _Activos1 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:25^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/activosAction");
        __jsp_taghandler_1.setOnsubmit("return validar1(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:27^1*/            {
              org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_2=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag property");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setProperty("operacion");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:28^1*/            {
              org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_3=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag property");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("opcion");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:29^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("ActivosForm");
              __jsp_taghandler_4.setProperty("operacion");
              __jsp_taghandler_4.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:30^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_5=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("ActivosForm");
                    __jsp_taghandler_5.setProperty("act_codpar");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[9]);
                  /*@lineinfo:translated-code*//*@lineinfo:31^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_6=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_6.setName("ActivosForm");
                    __jsp_taghandler_6.setProperty("act_codofi");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[10]);
                  /*@lineinfo:translated-code*//*@lineinfo:32^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_7=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_7.setName("ActivosForm");
                    __jsp_taghandler_7.setProperty("act_codfun");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[11]);
                  /*@lineinfo:translated-code*//*@lineinfo:33^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_8=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_8.setName("ActivosForm");
                    __jsp_taghandler_8.setProperty("act_codfin");
                    __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[12]);
                  /*@lineinfo:translated-code*//*@lineinfo:34^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_9=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_9.setName("ActivosForm");
                    __jsp_taghandler_9.setProperty("act_codmot");
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[13]);
                  /*@lineinfo:translated-code*//*@lineinfo:35^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_10=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_10.setName("ActivosForm");
                    __jsp_taghandler_10.setProperty("act_tipcam");
                    __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[14]);
                  /*@lineinfo:translated-code*//*@lineinfo:36^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_11=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_11.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_11.setName("ActivosForm");
                    __jsp_taghandler_11.setProperty("act_tipufv");
                    __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[15]);
                  /*@lineinfo:translated-code*//*@lineinfo:37^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_12=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_12.setName("ActivosForm");
                    __jsp_taghandler_12.setProperty("act_marca");
                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[16]);
                  /*@lineinfo:translated-code*//*@lineinfo:38^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_13=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_13.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_13.setName("ActivosForm");
                    __jsp_taghandler_13.setProperty("act_modelo");
                    __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[17]);
                  /*@lineinfo:translated-code*//*@lineinfo:39^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_14=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_14.setName("ActivosForm");
                    __jsp_taghandler_14.setProperty("act_docrefotro");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[18]);
                  /*@lineinfo:translated-code*//*@lineinfo:40^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_15=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_15.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_15.setName("ActivosForm");
                    __jsp_taghandler_15.setProperty("act_placa");
                    __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[19]);
                  /*@lineinfo:translated-code*//*@lineinfo:41^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_16=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_16.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_16.setName("ActivosForm");
                    __jsp_taghandler_16.setProperty("act_aniofabricacion");
                    __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[20]);
                  /*@lineinfo:translated-code*//*@lineinfo:42^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_17=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_17.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_17.setName("ActivosForm");
                    __jsp_taghandler_17.setProperty("act_color");
                    __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[21]);
                  /*@lineinfo:translated-code*//*@lineinfo:43^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_18=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_18.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_18.setName("ActivosForm");
                    __jsp_taghandler_18.setProperty("act_valcodol");
                    __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[22]);
                  /*@lineinfo:translated-code*//*@lineinfo:44^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_19=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_19.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_19.setName("ActivosForm");
                    __jsp_taghandler_19.setProperty("act_valcoufv");
                    __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[23]);
                  /*@lineinfo:translated-code*//*@lineinfo:45^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_20=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_20.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_20.setName("ActivosForm");
                    __jsp_taghandler_20.setProperty("act_fecbaja");
                    __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_20,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[24]);
                  /*@lineinfo:translated-code*//*@lineinfo:46^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_21=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_21.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_21.setName("ActivosForm");
                    __jsp_taghandler_21.setProperty("act_indetiqueta");
                    __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_21,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[25]);
                  /*@lineinfo:translated-code*//*@lineinfo:47^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_22=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_22.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_22.setName("ActivosForm");
                    __jsp_taghandler_22.setProperty("opcion");
                    __jsp_taghandler_22.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[26]);
                        /*@lineinfo:translated-code*//*@lineinfo:50^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_23=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_23.setKey("activos1.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[27]);
                        /*@lineinfo:translated-code*//*@lineinfo:51^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_24=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_24.setMaxlength("10");
                          __jsp_taghandler_24.setName("ActivosForm");
                          __jsp_taghandler_24.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_24.setProperty("act_codrub");
                          __jsp_taghandler_24.setReadonly(true);
                          __jsp_taghandler_24.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_24,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[28]);
                        /*@lineinfo:translated-code*//*@lineinfo:52^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_25=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_25.setMaxlength("60");
                          __jsp_taghandler_25.setName("ActivosForm");
                          __jsp_taghandler_25.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_25.setProperty("act_rubdescripcion");
                          __jsp_taghandler_25.setReadonly(true);
                          __jsp_taghandler_25.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_25,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[29]);
                        /*@lineinfo:translated-code*//*@lineinfo:55^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_26=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_26.setKey("activos1.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[30]);
                        /*@lineinfo:translated-code*//*@lineinfo:56^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_27=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_27.setMaxlength("10");
                          __jsp_taghandler_27.setName("ActivosForm");
                          __jsp_taghandler_27.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_27.setProperty("act_codreg");
                          __jsp_taghandler_27.setReadonly(true);
                          __jsp_taghandler_27.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[31]);
                        /*@lineinfo:translated-code*//*@lineinfo:57^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_28=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_28.setMaxlength("60");
                          __jsp_taghandler_28.setName("ActivosForm");
                          __jsp_taghandler_28.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_28.setProperty("act_regdescripcion");
                          __jsp_taghandler_28.setReadonly(true);
                          __jsp_taghandler_28.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_28,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[32]);
                        /*@lineinfo:translated-code*//*@lineinfo:60^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_29=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_29.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_29.setKey("activos1.codigo");
                          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[33]);
                        /*@lineinfo:translated-code*//*@lineinfo:61^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_30=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_30.setMaxlength("5");
                          __jsp_taghandler_30.setName("ActivosForm");
                          __jsp_taghandler_30.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_30.setProperty("act_codigo");
                          __jsp_taghandler_30.setReadonly(true);
                          __jsp_taghandler_30.setSize("5");
                          __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[34]);
                        /*@lineinfo:translated-code*//*@lineinfo:62^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_31=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_31.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_31.setMaxlength("10");
                          __jsp_taghandler_31.setName("ActivosForm");
                          __jsp_taghandler_31.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_31.setProperty("act_codbarra");
                          __jsp_taghandler_31.setReadonly(true);
                          __jsp_taghandler_31.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_31,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[35]);
                        /*@lineinfo:translated-code*//*@lineinfo:65^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_32=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_32.setKey("activos1.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:66^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_33=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onkeypress property");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_33.setDisabled(false);
                          __jsp_taghandler_33.setName("ActivosForm");
                          __jsp_taghandler_33.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_33.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_33,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[37]);
                              /*@lineinfo:translated-code*//*@lineinfo:67^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_34=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                                __jsp_taghandler_34.setCollection("GruposLista");
                                __jsp_taghandler_34.setLabelProperty("descripcion");
                                __jsp_taghandler_34.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[38]);
                            /*@lineinfo:translated-code*//*@lineinfo:67^101*/                            } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:69^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_35=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_35.setKey("activos1.codpar");
                          __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[40]);
                        /*@lineinfo:translated-code*//*@lineinfo:71^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_36=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_36.setMaxlength("40");
                          __jsp_taghandler_36.setName("ActivosForm");
                          __jsp_taghandler_36.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_36.setProperty("act_pardescripcion");
                          __jsp_taghandler_36.setReadonly(true);
                          __jsp_taghandler_36.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_36,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[41]);
                        /*@lineinfo:translated-code*//*@lineinfo:75^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_37=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_37.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_37.setKey("activos1.codofi");
                          __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[42]);
                        /*@lineinfo:translated-code*//*@lineinfo:77^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_38=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_38.setMaxlength("40");
                          __jsp_taghandler_38.setName("ActivosForm");
                          __jsp_taghandler_38.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_38.setProperty("act_ofidescripcion");
                          __jsp_taghandler_38.setReadonly(true);
                          __jsp_taghandler_38.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_38,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[43]);
                        /*@lineinfo:translated-code*//*@lineinfo:79^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_39=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_39.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_39.setKey("activos1.codfun");
                          __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[44]);
                        /*@lineinfo:translated-code*//*@lineinfo:81^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_40=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_40.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_40.setMaxlength("40");
                          __jsp_taghandler_40.setName("ActivosForm");
                          __jsp_taghandler_40.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_40.setProperty("act_fundescripcion");
                          __jsp_taghandler_40.setReadonly(true);
                          __jsp_taghandler_40.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_40,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[45]);
                        /*@lineinfo:translated-code*//*@lineinfo:85^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_41=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_41.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_41.setKey("activos1.codubi");
                          __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_41.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[46]);
                        /*@lineinfo:translated-code*//*@lineinfo:86^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_42=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onkeypress property");
                          __jsp_taghandler_42.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_42.setDisabled(false);
                          __jsp_taghandler_42.setName("ActivosForm");
                          __jsp_taghandler_42.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_42.setProperty("act_codubi");
                          __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_42,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[47]);
                              /*@lineinfo:translated-code*//*@lineinfo:87^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_43=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_43.setParent(__jsp_taghandler_42);
                                __jsp_taghandler_43.setCollection("UbicacionesLista");
                                __jsp_taghandler_43.setLabelProperty("descripcion");
                                __jsp_taghandler_43.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[48]);
                            /*@lineinfo:translated-code*//*@lineinfo:87^106*/                            } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[49]);
                        /*@lineinfo:translated-code*//*@lineinfo:89^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_44=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_44.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_44.setKey("activos1.codpry");
                          __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[50]);
                        /*@lineinfo:translated-code*//*@lineinfo:90^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_45=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onkeypress property");
                          __jsp_taghandler_45.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_45.setDisabled(false);
                          __jsp_taghandler_45.setName("ActivosForm");
                          __jsp_taghandler_45.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_45.setProperty("act_codpry");
                          __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_45,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[51]);
                              /*@lineinfo:translated-code*//*@lineinfo:91^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_46=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                                __jsp_taghandler_46.setCollection("ProyectosLista");
                                __jsp_taghandler_46.setLabelProperty("descripcion");
                                __jsp_taghandler_46.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[52]);
                            /*@lineinfo:translated-code*//*@lineinfo:91^104*/                            } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[53]);
                        /*@lineinfo:translated-code*//*@lineinfo:95^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_47=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_47.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_47.setKey("activos1.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[54]);
                        /*@lineinfo:translated-code*//*@lineinfo:96^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_48=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_48.setMaxlength("40");
                          __jsp_taghandler_48.setName("ActivosForm");
                          __jsp_taghandler_48.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_48.setProperty("act_findescripcion");
                          __jsp_taghandler_48.setReadonly(true);
                          __jsp_taghandler_48.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_48,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[55]);
                        /*@lineinfo:translated-code*//*@lineinfo:97^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_49=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_49.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_49.setKey("activos1.feccompra");
                          __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[56]);
                        /*@lineinfo:translated-code*//*@lineinfo:98^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_50=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_50.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_50.setMaxlength("10");
                          __jsp_taghandler_50.setName("ActivosForm");
                          __jsp_taghandler_50.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_50.setProperty("act_feccompra");
                          __jsp_taghandler_50.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_50,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[57]);
                        /*@lineinfo:translated-code*//*@lineinfo:103^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_51=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_51.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_51.setKey("activos1.umanejo");
                          __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[58]);
                        /*@lineinfo:translated-code*//*@lineinfo:104^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_52=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_52.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_52.setMaxlength("20");
                          __jsp_taghandler_52.setName("ActivosForm");
                          __jsp_taghandler_52.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_52.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_52.setProperty("act_umanejo");
                          __jsp_taghandler_52.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_52,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_52.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[59]);
                        /*@lineinfo:translated-code*//*@lineinfo:107^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_53=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_53.setKey("activos1.descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[60]);
                        /*@lineinfo:translated-code*//*@lineinfo:108^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_54=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_54.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_54.setMaxlength("120");
                          __jsp_taghandler_54.setName("ActivosForm");
                          __jsp_taghandler_54.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_54.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_54.setProperty("act_descripcion");
                          __jsp_taghandler_54.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_54,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[61]);
                        /*@lineinfo:translated-code*//*@lineinfo:111^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_55=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_55.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_55.setKey("activos1.desadicional");
                          __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[62]);
                        /*@lineinfo:translated-code*//*@lineinfo:112^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_56=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_56.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_56.setMaxlength("240");
                          __jsp_taghandler_56.setName("ActivosForm");
                          __jsp_taghandler_56.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_56.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_56.setProperty("act_desadicional");
                          __jsp_taghandler_56.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_56,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[63]);
                        /*@lineinfo:translated-code*//*@lineinfo:116^13*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_57=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_57.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_57.setKey("activos1.proveedor");
                          __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[64]);
                        /*@lineinfo:translated-code*//*@lineinfo:119^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_58=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_58.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_58.setMaxlength("50");
                          __jsp_taghandler_58.setName("ActivosForm");
                          __jsp_taghandler_58.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_58.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_58.setProperty("act_proveedor");
                          __jsp_taghandler_58.setSize("50");
                          __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_58,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[65]);
                        /*@lineinfo:translated-code*//*@lineinfo:123^27*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_59=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_59.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_59.setName("ActivosForm");
                          __jsp_taghandler_59.setProperty("act_codrub");
                          __jsp_taghandler_59.setValue("01");
                          __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[66]);
                            /*@lineinfo:translated-code*//*@lineinfo:123^92*/                            } while (__jsp_taghandler_59.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59);
                        }
/*@lineinfo:123^107*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_60=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_60.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_60.setKey("activos1.accesorios");
                          __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[67]);
                        /*@lineinfo:translated-code*//*@lineinfo:124^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_61=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_61.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_61.setMaxlength("60");
                          __jsp_taghandler_61.setName("ActivosForm");
                          __jsp_taghandler_61.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_61.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_61.setProperty("act_accesorios");
                          __jsp_taghandler_61.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_61,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_61.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[68]);
                        /*@lineinfo:translated-code*//*@lineinfo:129^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_62=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_62.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_62.setKey("activos1.serie1");
                          __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_62.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[69]);
                        /*@lineinfo:translated-code*//*@lineinfo:130^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_63=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_63.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_63.setMaxlength("30");
                          __jsp_taghandler_63.setName("ActivosForm");
                          __jsp_taghandler_63.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_63.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_63.setProperty("act_serie1");
                          __jsp_taghandler_63.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_63,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[70]);
                        /*@lineinfo:translated-code*//*@lineinfo:131^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_64=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_64.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_64.setKey("activos1.serie2");
                          __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_64.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[71]);
                        /*@lineinfo:translated-code*//*@lineinfo:132^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_65=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_65.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_65.setMaxlength("30");
                          __jsp_taghandler_65.setName("ActivosForm");
                          __jsp_taghandler_65.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_65.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_65.setProperty("act_serie2");
                          __jsp_taghandler_65.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_65,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_65.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[72]);
                        /*@lineinfo:translated-code*//*@lineinfo:135^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_66=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_66.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_66.setKey("activos1.docreferencia");
                          __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_66.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[73]);
                        /*@lineinfo:translated-code*//*@lineinfo:136^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_67=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_67.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_67.setMaxlength("30");
                          __jsp_taghandler_67.setName("ActivosForm");
                          __jsp_taghandler_67.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_67.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_67.setProperty("act_docreferencia");
                          __jsp_taghandler_67.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_67,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_67.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[74]);
                        /*@lineinfo:translated-code*//*@lineinfo:137^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_68=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_68.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_68.setKey("activos1.fecreferencia");
                          __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_68.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[75]);
                        /*@lineinfo:translated-code*//*@lineinfo:138^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_69=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_69.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_69.setMaxlength("10");
                          __jsp_taghandler_69.setName("ActivosForm");
                          __jsp_taghandler_69.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_69.setProperty("act_fecreferencia");
                          __jsp_taghandler_69.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_69,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_69.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[76]);
                        /*@lineinfo:translated-code*//*@lineinfo:141^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_70=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_70.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_70.setKey("activos1.procedencia");
                          __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_70.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[77]);
                        /*@lineinfo:translated-code*//*@lineinfo:142^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_71=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_71.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_71.setMaxlength("30");
                          __jsp_taghandler_71.setName("ActivosForm");
                          __jsp_taghandler_71.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_71.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_71.setProperty("act_procedencia");
                          __jsp_taghandler_71.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_71,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_71.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[78]);
                        /*@lineinfo:translated-code*//*@lineinfo:143^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_72=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_72.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_72.setKey("activos1.gobmunicipal");
                          __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_72.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[79]);
                        /*@lineinfo:translated-code*//*@lineinfo:144^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_73=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_73.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_73.setMaxlength("30");
                          __jsp_taghandler_73.setName("ActivosForm");
                          __jsp_taghandler_73.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_73.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_73.setProperty("act_gobmunicipal");
                          __jsp_taghandler_73.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_73,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_73.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[80]);
                        /*@lineinfo:translated-code*//*@lineinfo:147^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_74=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_74.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_74.setKey("activos1.valcobol");
                          __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_74.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[81]);
                        /*@lineinfo:translated-code*//*@lineinfo:148^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_75=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_75.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_75.setMaxlength("13");
                          __jsp_taghandler_75.setName("ActivosForm");
                          __jsp_taghandler_75.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_75.setProperty("act_valcobol");
                          __jsp_taghandler_75.setSize("13");
                          __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_75,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_75.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[82]);
                        /*@lineinfo:translated-code*//*@lineinfo:149^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_76=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_76.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_76.setKey("activos1.ordencompra");
                          __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_76.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[83]);
                        /*@lineinfo:translated-code*//*@lineinfo:150^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_77=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_77.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_77.setMaxlength("20");
                          __jsp_taghandler_77.setName("ActivosForm");
                          __jsp_taghandler_77.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_77.setProperty("act_ordencompra");
                          __jsp_taghandler_77.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_77,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_77.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[84]);
                        /*@lineinfo:translated-code*//*@lineinfo:153^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_78=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_78.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_78.setKey("activos1.numfactura");
                          __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_78.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[85]);
                        /*@lineinfo:translated-code*//*@lineinfo:154^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_79=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_79.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_79.setMaxlength("12");
                          __jsp_taghandler_79.setName("ActivosForm");
                          __jsp_taghandler_79.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_79.setProperty("act_numfactura");
                          __jsp_taghandler_79.setSize("12");
                          __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_79,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_79.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[86]);
                        /*@lineinfo:translated-code*//*@lineinfo:155^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_80=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_80.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_80.setKey("activos1.numcomprobante");
                          __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_80.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[87]);
                        /*@lineinfo:translated-code*//*@lineinfo:156^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_81=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_81.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_81.setMaxlength("20");
                          __jsp_taghandler_81.setName("ActivosForm");
                          __jsp_taghandler_81.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_81.setProperty("act_numcomprobante");
                          __jsp_taghandler_81.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_81,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_81.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[88]);
                        /*@lineinfo:translated-code*//*@lineinfo:159^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_82=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_82.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_82.setKey("activos1.codanterior");
                          __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_82.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[89]);
                        /*@lineinfo:translated-code*//*@lineinfo:160^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_83=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_83.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_83.setMaxlength("20");
                          __jsp_taghandler_83.setName("ActivosForm");
                          __jsp_taghandler_83.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_83.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_83.setProperty("act_codanterior");
                          __jsp_taghandler_83.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_83,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_83.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[90]);
                        /*@lineinfo:translated-code*//*@lineinfo:161^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_84=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_84.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_84.setKey("activos1.fecha");
                          __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_84.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[91]);
                        /*@lineinfo:translated-code*//*@lineinfo:162^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_85=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_85.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_85.setMaxlength("10");
                          __jsp_taghandler_85.setName("ActivosForm");
                          __jsp_taghandler_85.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_85.setProperty("rev_fecha");
                          __jsp_taghandler_85.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_85,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_85.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[92]);
                        /*@lineinfo:translated-code*//*@lineinfo:165^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_86=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_86.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_86.setKey("activos1.vidaut");
                          __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_86.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[93]);
                        /*@lineinfo:translated-code*//*@lineinfo:166^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_87=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_87.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_87.setMaxlength("4");
                          __jsp_taghandler_87.setName("ActivosForm");
                          __jsp_taghandler_87.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_87.setProperty("rev_vidaut");
                          __jsp_taghandler_87.setReadonly(true);
                          __jsp_taghandler_87.setSize("4");
                          __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_87,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_87.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[94]);
                        /*@lineinfo:translated-code*//*@lineinfo:167^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_88=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_88.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_88.setKey("activos1.estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_88.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[95]);
                        /*@lineinfo:translated-code*//*@lineinfo:168^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_89=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onkeypress property");
                          __jsp_taghandler_89.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_89.setDisabled(false);
                          __jsp_taghandler_89.setName("ActivosForm");
                          __jsp_taghandler_89.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_89.setProperty("rev_estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_89,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[96]);
                              /*@lineinfo:translated-code*//*@lineinfo:169^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_90=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_90.setParent(__jsp_taghandler_89);
                                __jsp_taghandler_90.setCollection("EstadosLista");
                                __jsp_taghandler_90.setLabelProperty("desestado");
                                __jsp_taghandler_90.setProperty("estado");
                                __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_90.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[97]);
                            /*@lineinfo:translated-code*//*@lineinfo:169^99*/                            } while (__jsp_taghandler_89.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[98]);
                        /*@lineinfo:translated-code*//*@lineinfo:174^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_91=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_91.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_91.setKey("activos1.desestado");
                          __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_91.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[99]);
                        /*@lineinfo:translated-code*//*@lineinfo:175^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_92=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_92.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_92.setMaxlength("60");
                          __jsp_taghandler_92.setName("ActivosForm");
                          __jsp_taghandler_92.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_92.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_92.setProperty("rev_desestado");
                          __jsp_taghandler_92.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_92,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_92.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[100]);
                        /*@lineinfo:translated-code*//*@lineinfo:178^24*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_93=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_93.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_93.setOnclick("operacion.value=2;opcion.value=1");
                          __jsp_taghandler_93.setProperty("boton");
                          __jsp_taghandler_93.setStyleClass("boton1");
                          __jsp_taghandler_93.setValue("Insertar");
                          __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_93,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_93.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[101]);
                        /*@lineinfo:translated-code*//*@lineinfo:183^12*/                        {
                          org.apache.struts.taglib.html.LinkTag __jsp_taghandler_94=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href");
                          __jsp_taghandler_94.setParent(__jsp_taghandler_22);
                          __jsp_taghandler_94.setHref("javascript:pantallaCompleta('tipocambio.do');");
                          __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_94,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[102]);
                            /*@lineinfo:translated-code*//*@lineinfo:183^76*/                            } while (__jsp_taghandler_94.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[103]);
                      /*@lineinfo:translated-code*//*@lineinfo:185^24*/                      } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[104]);
                  /*@lineinfo:translated-code*//*@lineinfo:191^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_95=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_95.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_95.setName("ActivosForm");
                    __jsp_taghandler_95.setProperty("opcion");
                    __jsp_taghandler_95.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[105]);
                        /*@lineinfo:translated-code*//*@lineinfo:194^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_96=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_96.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_96.setKey("activos1.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_96.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_96.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_96.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_96);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[106]);
                        /*@lineinfo:translated-code*//*@lineinfo:195^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_97=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_97.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_97.setMaxlength("10");
                          __jsp_taghandler_97.setName("ActivosForm");
                          __jsp_taghandler_97.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_97.setProperty("act_codrub");
                          __jsp_taghandler_97.setReadonly(true);
                          __jsp_taghandler_97.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_97.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_97,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_97.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_97.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_97);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[107]);
                        /*@lineinfo:translated-code*//*@lineinfo:196^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_98=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_98.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_98.setMaxlength("60");
                          __jsp_taghandler_98.setName("ActivosForm");
                          __jsp_taghandler_98.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_98.setProperty("act_rubdescripcion");
                          __jsp_taghandler_98.setReadonly(true);
                          __jsp_taghandler_98.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_98.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_98,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_98.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_98.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_98);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[108]);
                        /*@lineinfo:translated-code*//*@lineinfo:199^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_99=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_99.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_99.setKey("activos1.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_99.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_99.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_99.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_99);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[109]);
                        /*@lineinfo:translated-code*//*@lineinfo:200^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_100=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_100.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_100.setMaxlength("10");
                          __jsp_taghandler_100.setName("ActivosForm");
                          __jsp_taghandler_100.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_100.setProperty("act_codreg");
                          __jsp_taghandler_100.setReadonly(true);
                          __jsp_taghandler_100.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_100.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_100,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_100.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_100.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_100);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[110]);
                        /*@lineinfo:translated-code*//*@lineinfo:201^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_101=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_101.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_101.setMaxlength("60");
                          __jsp_taghandler_101.setName("ActivosForm");
                          __jsp_taghandler_101.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_101.setProperty("act_regdescripcion");
                          __jsp_taghandler_101.setReadonly(true);
                          __jsp_taghandler_101.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_101.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_101,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_101.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_101.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_101);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[111]);
                        /*@lineinfo:translated-code*//*@lineinfo:204^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_102=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_102.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_102.setKey("activos1.codigo");
                          __jsp_tag_starteval=__jsp_taghandler_102.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_102.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_102.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_102);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[112]);
                        /*@lineinfo:translated-code*//*@lineinfo:205^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_103=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_103.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_103.setMaxlength("5");
                          __jsp_taghandler_103.setName("ActivosForm");
                          __jsp_taghandler_103.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_103.setProperty("act_codigo");
                          __jsp_taghandler_103.setReadonly(true);
                          __jsp_taghandler_103.setSize("5");
                          __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_103,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_103.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[113]);
                        /*@lineinfo:translated-code*//*@lineinfo:206^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_104=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_104.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_104.setMaxlength("10");
                          __jsp_taghandler_104.setName("ActivosForm");
                          __jsp_taghandler_104.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_104.setProperty("act_codbarra");
                          __jsp_taghandler_104.setReadonly(true);
                          __jsp_taghandler_104.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_104.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_104,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_104.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_104.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_104);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[114]);
                        /*@lineinfo:translated-code*//*@lineinfo:209^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_105=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_105.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_105.setKey("activos1.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_105.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_105.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_105.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_105);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[115]);
                        /*@lineinfo:translated-code*//*@lineinfo:211^13*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_106=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onkeypress property");
                          __jsp_taghandler_106.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_106.setDisabled(false);
                          __jsp_taghandler_106.setName("ActivosForm");
                          __jsp_taghandler_106.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_106.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_106.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_106,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[116]);
                              /*@lineinfo:translated-code*//*@lineinfo:212^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_107=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_107.setParent(__jsp_taghandler_106);
                                __jsp_taghandler_107.setCollection("GruposLista");
                                __jsp_taghandler_107.setLabelProperty("descripcion");
                                __jsp_taghandler_107.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_107.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_107.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_107.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_107);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[117]);
                            /*@lineinfo:translated-code*//*@lineinfo:212^102*/                            } while (__jsp_taghandler_106.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_106.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_106);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[118]);
                        /*@lineinfo:translated-code*//*@lineinfo:215^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_108=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_108.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_108.setKey("activos1.codpar");
                          __jsp_tag_starteval=__jsp_taghandler_108.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_108.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_108.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_108);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[119]);
                        /*@lineinfo:translated-code*//*@lineinfo:217^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_109=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_109.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_109.setMaxlength("40");
                          __jsp_taghandler_109.setName("ActivosForm");
                          __jsp_taghandler_109.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_109.setProperty("act_pardescripcion");
                          __jsp_taghandler_109.setReadonly(true);
                          __jsp_taghandler_109.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_109.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_109,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_109.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_109.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_109);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[120]);
                        /*@lineinfo:translated-code*//*@lineinfo:221^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_110=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_110.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_110.setKey("activos1.codofi");
                          __jsp_tag_starteval=__jsp_taghandler_110.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_110.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_110.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_110);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[121]);
                        /*@lineinfo:translated-code*//*@lineinfo:223^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_111=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_111.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_111.setMaxlength("40");
                          __jsp_taghandler_111.setName("ActivosForm");
                          __jsp_taghandler_111.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_111.setProperty("act_ofidescripcion");
                          __jsp_taghandler_111.setReadonly(true);
                          __jsp_taghandler_111.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_111.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_111,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_111.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_111.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_111);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[122]);
                        /*@lineinfo:translated-code*//*@lineinfo:225^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_112=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_112.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_112.setKey("activos1.codfun");
                          __jsp_tag_starteval=__jsp_taghandler_112.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_112.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_112.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_112);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[123]);
                        /*@lineinfo:translated-code*//*@lineinfo:227^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_113=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_113.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_113.setMaxlength("40");
                          __jsp_taghandler_113.setName("ActivosForm");
                          __jsp_taghandler_113.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_113.setProperty("act_fundescripcion");
                          __jsp_taghandler_113.setReadonly(true);
                          __jsp_taghandler_113.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_113.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_113,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_113.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_113.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_113);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[124]);
                        /*@lineinfo:translated-code*//*@lineinfo:231^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_114=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_114.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_114.setKey("activos1.codubi");
                          __jsp_tag_starteval=__jsp_taghandler_114.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_114.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_114.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_114);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[125]);
                        /*@lineinfo:translated-code*//*@lineinfo:233^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_115=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_115.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_115.setMaxlength("40");
                          __jsp_taghandler_115.setName("ActivosForm");
                          __jsp_taghandler_115.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_115.setProperty("act_ubidescripcion");
                          __jsp_taghandler_115.setReadonly(true);
                          __jsp_taghandler_115.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_115.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_115,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_115.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_115.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_115);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[126]);
                        /*@lineinfo:translated-code*//*@lineinfo:235^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_116=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_116.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_116.setKey("activos1.codpry");
                          __jsp_tag_starteval=__jsp_taghandler_116.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_116.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_116.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_116);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[127]);
                        /*@lineinfo:translated-code*//*@lineinfo:236^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_117=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_117.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_117.setDisabled(false);
                          __jsp_taghandler_117.setName("ActivosForm");
                          __jsp_taghandler_117.setProperty("act_codpry");
                          __jsp_tag_starteval=__jsp_taghandler_117.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_117,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[128]);
                              /*@lineinfo:translated-code*//*@lineinfo:237^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_118=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_118.setParent(__jsp_taghandler_117);
                                __jsp_taghandler_118.setCollection("ProyectosLista");
                                __jsp_taghandler_118.setLabelProperty("descripcion");
                                __jsp_taghandler_118.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_118.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_118.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_118.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_118);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[129]);
                            /*@lineinfo:translated-code*//*@lineinfo:237^104*/                            } while (__jsp_taghandler_117.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_117.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_117);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[130]);
                        /*@lineinfo:translated-code*//*@lineinfo:242^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_119=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_119.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_119.setKey("activos1.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_119.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_119.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_119.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_119);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[131]);
                        /*@lineinfo:translated-code*//*@lineinfo:244^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_120=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_120.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_120.setMaxlength("40");
                          __jsp_taghandler_120.setName("ActivosForm");
                          __jsp_taghandler_120.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_120.setProperty("act_findescripcion");
                          __jsp_taghandler_120.setReadonly(true);
                          __jsp_taghandler_120.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_120.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_120,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_120.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_120.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_120);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[132]);
                        /*@lineinfo:translated-code*//*@lineinfo:246^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_121=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_121.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_121.setKey("activos1.feccompra");
                          __jsp_tag_starteval=__jsp_taghandler_121.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_121.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_121.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_121);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[133]);
                        /*@lineinfo:translated-code*//*@lineinfo:247^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_122=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_122.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_122.setMaxlength("10");
                          __jsp_taghandler_122.setName("ActivosForm");
                          __jsp_taghandler_122.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_122.setProperty("act_feccompra");
                          __jsp_taghandler_122.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_122.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_122,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_122.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_122.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_122);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[134]);
                        /*@lineinfo:translated-code*//*@lineinfo:252^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_123=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_123.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_123.setKey("activos1.umanejo");
                          __jsp_tag_starteval=__jsp_taghandler_123.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_123.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_123.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_123);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[135]);
                        /*@lineinfo:translated-code*//*@lineinfo:253^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_124=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_124.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_124.setMaxlength("20");
                          __jsp_taghandler_124.setName("ActivosForm");
                          __jsp_taghandler_124.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_124.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_124.setProperty("act_umanejo");
                          __jsp_taghandler_124.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_124.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_124,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_124.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_124.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_124);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[136]);
                        /*@lineinfo:translated-code*//*@lineinfo:256^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_125=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_125.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_125.setKey("activos1.descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_125.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_125.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_125.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_125);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[137]);
                        /*@lineinfo:translated-code*//*@lineinfo:257^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_126=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_126.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_126.setMaxlength("120");
                          __jsp_taghandler_126.setName("ActivosForm");
                          __jsp_taghandler_126.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_126.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_126.setProperty("act_descripcion");
                          __jsp_taghandler_126.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_126.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_126,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_126.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_126.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_126);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[138]);
                        /*@lineinfo:translated-code*//*@lineinfo:260^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_127=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_127.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_127.setKey("activos1.desadicional");
                          __jsp_tag_starteval=__jsp_taghandler_127.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_127.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_127.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_127);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[139]);
                        /*@lineinfo:translated-code*//*@lineinfo:261^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_128=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_128.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_128.setMaxlength("240");
                          __jsp_taghandler_128.setName("ActivosForm");
                          __jsp_taghandler_128.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_128.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_128.setProperty("act_desadicional");
                          __jsp_taghandler_128.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_128,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_128.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[140]);
                        /*@lineinfo:translated-code*//*@lineinfo:265^13*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_129=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_129.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_129.setKey("activos1.proveedor");
                          __jsp_tag_starteval=__jsp_taghandler_129.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_129.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_129.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_129);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[141]);
                        /*@lineinfo:translated-code*//*@lineinfo:268^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_130=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_130.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_130.setMaxlength("50");
                          __jsp_taghandler_130.setName("ActivosForm");
                          __jsp_taghandler_130.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_130.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_130.setProperty("act_proveedor");
                          __jsp_taghandler_130.setSize("50");
                          __jsp_tag_starteval=__jsp_taghandler_130.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_130,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_130.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_130.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_130);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[142]);
                        /*@lineinfo:translated-code*//*@lineinfo:272^27*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_131=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_131.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_131.setName("ActivosForm");
                          __jsp_taghandler_131.setProperty("act_codrub");
                          __jsp_taghandler_131.setValue("01");
                          __jsp_tag_starteval=__jsp_taghandler_131.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[143]);
                            /*@lineinfo:translated-code*//*@lineinfo:272^92*/                            } while (__jsp_taghandler_131.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_131.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_131);
                        }
/*@lineinfo:272^107*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_132=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_132.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_132.setKey("activos1.accesorios");
                          __jsp_tag_starteval=__jsp_taghandler_132.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_132.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_132.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_132);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[144]);
                        /*@lineinfo:translated-code*//*@lineinfo:273^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_133=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_133.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_133.setMaxlength("60");
                          __jsp_taghandler_133.setName("ActivosForm");
                          __jsp_taghandler_133.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_133.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_133.setProperty("act_accesorios");
                          __jsp_taghandler_133.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_133.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_133,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_133.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_133.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_133);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[145]);
                        /*@lineinfo:translated-code*//*@lineinfo:278^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_134=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_134.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_134.setKey("activos1.serie1");
                          __jsp_tag_starteval=__jsp_taghandler_134.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_134.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_134.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_134);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[146]);
                        /*@lineinfo:translated-code*//*@lineinfo:279^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_135=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_135.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_135.setMaxlength("30");
                          __jsp_taghandler_135.setName("ActivosForm");
                          __jsp_taghandler_135.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_135.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_135.setProperty("act_serie1");
                          __jsp_taghandler_135.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_135.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_135,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_135.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_135.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_135);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[147]);
                        /*@lineinfo:translated-code*//*@lineinfo:280^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_136=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_136.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_136.setKey("activos1.serie2");
                          __jsp_tag_starteval=__jsp_taghandler_136.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_136.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_136.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_136);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[148]);
                        /*@lineinfo:translated-code*//*@lineinfo:281^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_137=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_137.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_137.setMaxlength("30");
                          __jsp_taghandler_137.setName("ActivosForm");
                          __jsp_taghandler_137.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_137.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_137.setProperty("act_serie2");
                          __jsp_taghandler_137.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_137.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_137,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_137.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_137.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_137);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[149]);
                        /*@lineinfo:translated-code*//*@lineinfo:284^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_138=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_138.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_138.setKey("activos1.docreferencia");
                          __jsp_tag_starteval=__jsp_taghandler_138.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_138.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_138.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_138);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[150]);
                        /*@lineinfo:translated-code*//*@lineinfo:285^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_139=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_139.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_139.setMaxlength("30");
                          __jsp_taghandler_139.setName("ActivosForm");
                          __jsp_taghandler_139.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_139.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_139.setProperty("act_docreferencia");
                          __jsp_taghandler_139.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_139.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_139,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_139.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_139.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_139);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[151]);
                        /*@lineinfo:translated-code*//*@lineinfo:286^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_140=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_140.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_140.setKey("activos1.fecreferencia");
                          __jsp_tag_starteval=__jsp_taghandler_140.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_140.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_140.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_140);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[152]);
                        /*@lineinfo:translated-code*//*@lineinfo:287^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_141=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_141.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_141.setMaxlength("10");
                          __jsp_taghandler_141.setName("ActivosForm");
                          __jsp_taghandler_141.setProperty("act_fecreferencia");
                          __jsp_taghandler_141.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_141.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_141,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_141.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_141.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_141);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[153]);
                        /*@lineinfo:translated-code*//*@lineinfo:290^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_142=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_142.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_142.setKey("activos1.procedencia");
                          __jsp_tag_starteval=__jsp_taghandler_142.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_142.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_142.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_142);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[154]);
                        /*@lineinfo:translated-code*//*@lineinfo:291^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_143=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_143.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_143.setMaxlength("30");
                          __jsp_taghandler_143.setName("ActivosForm");
                          __jsp_taghandler_143.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_143.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_143.setProperty("act_procedencia");
                          __jsp_taghandler_143.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_143.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_143,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_143.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_143.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_143);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[155]);
                        /*@lineinfo:translated-code*//*@lineinfo:292^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_144=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_144.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_144.setKey("activos1.gobmunicipal");
                          __jsp_tag_starteval=__jsp_taghandler_144.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_144.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_144.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_144);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[156]);
                        /*@lineinfo:translated-code*//*@lineinfo:293^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_145=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_145.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_145.setMaxlength("30");
                          __jsp_taghandler_145.setName("ActivosForm");
                          __jsp_taghandler_145.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_145.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_145.setProperty("act_gobmunicipal");
                          __jsp_taghandler_145.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_145.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_145,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_145.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_145.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_145);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[157]);
                        /*@lineinfo:translated-code*//*@lineinfo:296^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_146=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_146.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_146.setKey("activos1.valcobol");
                          __jsp_tag_starteval=__jsp_taghandler_146.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_146.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_146.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_146);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[158]);
                        /*@lineinfo:translated-code*//*@lineinfo:297^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_147=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_147.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_147.setMaxlength("13");
                          __jsp_taghandler_147.setName("ActivosForm");
                          __jsp_taghandler_147.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_147.setProperty("act_valcobol");
                          __jsp_taghandler_147.setSize("13");
                          __jsp_tag_starteval=__jsp_taghandler_147.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_147,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_147.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_147.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_147);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[159]);
                        /*@lineinfo:translated-code*//*@lineinfo:298^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_148=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_148.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_148.setKey("activos1.ordencompra");
                          __jsp_tag_starteval=__jsp_taghandler_148.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_148.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_148.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_148);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[160]);
                        /*@lineinfo:translated-code*//*@lineinfo:299^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_149=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_149.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_149.setMaxlength("20");
                          __jsp_taghandler_149.setName("ActivosForm");
                          __jsp_taghandler_149.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_149.setProperty("act_ordencompra");
                          __jsp_taghandler_149.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_149.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_149,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_149.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_149.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_149);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[161]);
                        /*@lineinfo:translated-code*//*@lineinfo:302^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_150=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_150.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_150.setKey("activos1.numfactura");
                          __jsp_tag_starteval=__jsp_taghandler_150.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_150.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_150.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_150);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[162]);
                        /*@lineinfo:translated-code*//*@lineinfo:303^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_151=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_151.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_151.setMaxlength("12");
                          __jsp_taghandler_151.setName("ActivosForm");
                          __jsp_taghandler_151.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_151.setProperty("act_numfactura");
                          __jsp_taghandler_151.setSize("12");
                          __jsp_tag_starteval=__jsp_taghandler_151.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_151,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_151.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_151.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_151);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[163]);
                        /*@lineinfo:translated-code*//*@lineinfo:304^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_152=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_152.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_152.setKey("activos1.numcomprobante");
                          __jsp_tag_starteval=__jsp_taghandler_152.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_152.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_152.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_152);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[164]);
                        /*@lineinfo:translated-code*//*@lineinfo:305^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_153=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_153.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_153.setMaxlength("20");
                          __jsp_taghandler_153.setName("ActivosForm");
                          __jsp_taghandler_153.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_153.setProperty("act_numcomprobante");
                          __jsp_taghandler_153.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_153.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_153,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_153.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_153.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_153);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[165]);
                        /*@lineinfo:translated-code*//*@lineinfo:308^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_154=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_154.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_154.setKey("activos1.codanterior");
                          __jsp_tag_starteval=__jsp_taghandler_154.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_154.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_154.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_154);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[166]);
                        /*@lineinfo:translated-code*//*@lineinfo:309^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_155=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_155.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_155.setMaxlength("20");
                          __jsp_taghandler_155.setName("ActivosForm");
                          __jsp_taghandler_155.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_155.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_155.setProperty("act_codanterior");
                          __jsp_taghandler_155.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_155.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_155,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_155.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_155.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_155);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[167]);
                        /*@lineinfo:translated-code*//*@lineinfo:310^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_156=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_156.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_156.setKey("activos1.fecha");
                          __jsp_tag_starteval=__jsp_taghandler_156.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_156.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_156.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_156);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[168]);
                        /*@lineinfo:translated-code*//*@lineinfo:311^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_157=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property size");
                          __jsp_taghandler_157.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_157.setMaxlength("10");
                          __jsp_taghandler_157.setName("ActivosForm");
                          __jsp_taghandler_157.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_157.setProperty("rev_fecha");
                          __jsp_taghandler_157.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_157.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_157,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_157.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_157.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_157);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[169]);
                        /*@lineinfo:translated-code*//*@lineinfo:314^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_158=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_158.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_158.setKey("activos1.vidaut");
                          __jsp_tag_starteval=__jsp_taghandler_158.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_158.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_158.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_158);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[170]);
                        /*@lineinfo:translated-code*//*@lineinfo:315^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_159=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onkeypress property readonly size");
                          __jsp_taghandler_159.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_159.setMaxlength("4");
                          __jsp_taghandler_159.setName("ActivosForm");
                          __jsp_taghandler_159.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_159.setProperty("rev_vidaut");
                          __jsp_taghandler_159.setReadonly(true);
                          __jsp_taghandler_159.setSize("4");
                          __jsp_tag_starteval=__jsp_taghandler_159.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_159,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_159.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_159.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_159);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[171]);
                        /*@lineinfo:translated-code*//*@lineinfo:316^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_160=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_160.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_160.setKey("activos1.estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_160.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_160.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_160.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_160);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[172]);
                        /*@lineinfo:translated-code*//*@lineinfo:317^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_161=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onkeypress property");
                          __jsp_taghandler_161.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_161.setDisabled(false);
                          __jsp_taghandler_161.setName("ActivosForm");
                          __jsp_taghandler_161.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_161.setProperty("rev_estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_161.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_161,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[173]);
                              /*@lineinfo:translated-code*//*@lineinfo:318^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_162=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_162.setParent(__jsp_taghandler_161);
                                __jsp_taghandler_162.setCollection("EstadosLista");
                                __jsp_taghandler_162.setLabelProperty("desestado");
                                __jsp_taghandler_162.setProperty("estado");
                                __jsp_tag_starteval=__jsp_taghandler_162.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_162.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_162.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_162);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[174]);
                            /*@lineinfo:translated-code*//*@lineinfo:318^100*/                            } while (__jsp_taghandler_161.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_161.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_161);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[175]);
                        /*@lineinfo:translated-code*//*@lineinfo:323^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_163=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_163.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_163.setKey("activos1.desestado");
                          __jsp_tag_starteval=__jsp_taghandler_163.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_163.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_163.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_163);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[176]);
                        /*@lineinfo:translated-code*//*@lineinfo:324^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_164=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange onkeypress property size");
                          __jsp_taghandler_164.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_164.setMaxlength("60");
                          __jsp_taghandler_164.setName("ActivosForm");
                          __jsp_taghandler_164.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_164.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_164.setProperty("rev_desestado");
                          __jsp_taghandler_164.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_164.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_164,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_164.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_164.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_164);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[177]);
                        /*@lineinfo:translated-code*//*@lineinfo:327^24*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_165=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_165.setParent(__jsp_taghandler_95);
                          __jsp_taghandler_165.setOnclick("operacion.value=2;opcion.value=2");
                          __jsp_taghandler_165.setProperty("boton");
                          __jsp_taghandler_165.setStyleClass("boton1");
                          __jsp_taghandler_165.setValue("Modificar");
                          __jsp_tag_starteval=__jsp_taghandler_165.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_165,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_165.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_165.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_165);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[178]);
                      /*@lineinfo:translated-code*//*@lineinfo:327^137*/                      } while (__jsp_taghandler_95.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[179]);
                  /*@lineinfo:translated-code*//*@lineinfo:331^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_166=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_166.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_166.setName("ActivosForm");
                    __jsp_taghandler_166.setProperty("opcion");
                    __jsp_taghandler_166.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_166.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[180]);
                        /*@lineinfo:translated-code*//*@lineinfo:334^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_167=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_167.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_167.setKey("activos1.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_167.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_167.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_167.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_167);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[181]);
                        /*@lineinfo:translated-code*//*@lineinfo:335^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_168=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_168.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_168.setMaxlength("10");
                          __jsp_taghandler_168.setName("ActivosForm");
                          __jsp_taghandler_168.setProperty("act_codrub");
                          __jsp_taghandler_168.setReadonly(true);
                          __jsp_taghandler_168.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_168.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_168,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_168.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_168.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_168);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[182]);
                        /*@lineinfo:translated-code*//*@lineinfo:336^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_169=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_169.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_169.setMaxlength("60");
                          __jsp_taghandler_169.setName("ActivosForm");
                          __jsp_taghandler_169.setProperty("act_rubdescripcion");
                          __jsp_taghandler_169.setReadonly(true);
                          __jsp_taghandler_169.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_169.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_169,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_169.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_169.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_169);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[183]);
                        /*@lineinfo:translated-code*//*@lineinfo:339^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_170=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_170.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_170.setKey("activos1.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_170.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_170.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_170.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_170);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[184]);
                        /*@lineinfo:translated-code*//*@lineinfo:340^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_171=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_171.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_171.setMaxlength("10");
                          __jsp_taghandler_171.setName("ActivosForm");
                          __jsp_taghandler_171.setProperty("act_codreg");
                          __jsp_taghandler_171.setReadonly(true);
                          __jsp_taghandler_171.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_171.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_171,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_171.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_171.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_171);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[185]);
                        /*@lineinfo:translated-code*//*@lineinfo:341^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_172=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_172.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_172.setMaxlength("60");
                          __jsp_taghandler_172.setName("ActivosForm");
                          __jsp_taghandler_172.setProperty("act_regdescripcion");
                          __jsp_taghandler_172.setReadonly(true);
                          __jsp_taghandler_172.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_172.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_172,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_172.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_172.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_172);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[186]);
                        /*@lineinfo:translated-code*//*@lineinfo:344^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_173=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_173.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_173.setKey("activos1.codigo");
                          __jsp_tag_starteval=__jsp_taghandler_173.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_173.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_173.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_173);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[187]);
                        /*@lineinfo:translated-code*//*@lineinfo:345^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_174=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_174.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_174.setMaxlength("5");
                          __jsp_taghandler_174.setName("ActivosForm");
                          __jsp_taghandler_174.setProperty("act_codigo");
                          __jsp_taghandler_174.setReadonly(true);
                          __jsp_taghandler_174.setSize("5");
                          __jsp_tag_starteval=__jsp_taghandler_174.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_174,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_174.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_174.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_174);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[188]);
                        /*@lineinfo:translated-code*//*@lineinfo:346^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_175=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_175.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_175.setMaxlength("10");
                          __jsp_taghandler_175.setName("ActivosForm");
                          __jsp_taghandler_175.setProperty("act_codbarra");
                          __jsp_taghandler_175.setReadonly(true);
                          __jsp_taghandler_175.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_175.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_175,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_175.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_175.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_175);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[189]);
                        /*@lineinfo:translated-code*//*@lineinfo:349^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_176=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_176.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_176.setKey("activos1.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_176.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_176.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_176.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_176);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[190]);
                        /*@lineinfo:translated-code*//*@lineinfo:351^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_177=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_177.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_177.setMaxlength("40");
                          __jsp_taghandler_177.setName("ActivosForm");
                          __jsp_taghandler_177.setProperty("act_grpdescripcion");
                          __jsp_taghandler_177.setReadonly(true);
                          __jsp_taghandler_177.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_177.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_177,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_177.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_177.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_177);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[191]);
                        /*@lineinfo:translated-code*//*@lineinfo:353^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_178=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_178.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_178.setKey("activos1.codpar");
                          __jsp_tag_starteval=__jsp_taghandler_178.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_178.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_178.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_178);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[192]);
                        /*@lineinfo:translated-code*//*@lineinfo:355^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_179=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_179.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_179.setMaxlength("40");
                          __jsp_taghandler_179.setName("ActivosForm");
                          __jsp_taghandler_179.setProperty("act_pardescripcion");
                          __jsp_taghandler_179.setReadonly(true);
                          __jsp_taghandler_179.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_179.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_179,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_179.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_179.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_179);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[193]);
                        /*@lineinfo:translated-code*//*@lineinfo:359^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_180=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_180.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_180.setKey("activos1.codofi");
                          __jsp_tag_starteval=__jsp_taghandler_180.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_180.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_180.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_180);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[194]);
                        /*@lineinfo:translated-code*//*@lineinfo:361^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_181=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_181.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_181.setMaxlength("40");
                          __jsp_taghandler_181.setName("ActivosForm");
                          __jsp_taghandler_181.setProperty("act_ofidescripcion");
                          __jsp_taghandler_181.setReadonly(true);
                          __jsp_taghandler_181.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_181.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_181,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_181.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_181.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_181);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[195]);
                        /*@lineinfo:translated-code*//*@lineinfo:363^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_182=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_182.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_182.setKey("activos1.codfun");
                          __jsp_tag_starteval=__jsp_taghandler_182.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_182.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_182.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_182);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[196]);
                        /*@lineinfo:translated-code*//*@lineinfo:365^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_183=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_183.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_183.setMaxlength("40");
                          __jsp_taghandler_183.setName("ActivosForm");
                          __jsp_taghandler_183.setProperty("act_fundescripcion");
                          __jsp_taghandler_183.setReadonly(true);
                          __jsp_taghandler_183.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_183.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_183,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_183.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_183.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_183);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[197]);
                        /*@lineinfo:translated-code*//*@lineinfo:369^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_184=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_184.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_184.setKey("activos1.codubi");
                          __jsp_tag_starteval=__jsp_taghandler_184.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_184.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_184.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_184);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[198]);
                        /*@lineinfo:translated-code*//*@lineinfo:371^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_185=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_185.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_185.setMaxlength("40");
                          __jsp_taghandler_185.setName("ActivosForm");
                          __jsp_taghandler_185.setProperty("act_ubidescripcion");
                          __jsp_taghandler_185.setReadonly(true);
                          __jsp_taghandler_185.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_185.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_185,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_185.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_185.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_185);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[199]);
                        /*@lineinfo:translated-code*//*@lineinfo:373^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_186=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_186.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_186.setKey("activos1.codpry");
                          __jsp_tag_starteval=__jsp_taghandler_186.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_186.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_186.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_186);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[200]);
                        /*@lineinfo:translated-code*//*@lineinfo:375^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_187=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_187.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_187.setMaxlength("40");
                          __jsp_taghandler_187.setName("ActivosForm");
                          __jsp_taghandler_187.setProperty("act_prydescripcion");
                          __jsp_taghandler_187.setReadonly(true);
                          __jsp_taghandler_187.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_187.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_187,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_187.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_187.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_187);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[201]);
                        /*@lineinfo:translated-code*//*@lineinfo:379^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_188=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_188.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_188.setKey("activos1.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_188.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_188.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_188.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_188);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[202]);
                        /*@lineinfo:translated-code*//*@lineinfo:381^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_189=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_189.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_189.setMaxlength("40");
                          __jsp_taghandler_189.setName("ActivosForm");
                          __jsp_taghandler_189.setProperty("act_findescripcion");
                          __jsp_taghandler_189.setReadonly(true);
                          __jsp_taghandler_189.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_189.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_189,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_189.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_189.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_189);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[203]);
                        /*@lineinfo:translated-code*//*@lineinfo:383^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_190=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_190.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_190.setKey("activos1.feccompra");
                          __jsp_tag_starteval=__jsp_taghandler_190.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_190.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_190.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_190);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[204]);
                        /*@lineinfo:translated-code*//*@lineinfo:384^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_191=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_191.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_191.setMaxlength("10");
                          __jsp_taghandler_191.setName("ActivosForm");
                          __jsp_taghandler_191.setProperty("act_feccompra");
                          __jsp_taghandler_191.setReadonly(true);
                          __jsp_taghandler_191.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_191.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_191,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_191.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_191.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_191);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[205]);
                        /*@lineinfo:translated-code*//*@lineinfo:387^24*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_192=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_192.setParent(__jsp_taghandler_166);
                          __jsp_taghandler_192.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_192.setProperty("boton");
                          __jsp_taghandler_192.setStyleClass("boton1");
                          __jsp_taghandler_192.setValue("Eliminar");
                          __jsp_tag_starteval=__jsp_taghandler_192.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_192,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_192.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_192.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_192);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[206]);
                      /*@lineinfo:translated-code*//*@lineinfo:387^136*/                      } while (__jsp_taghandler_166.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_166.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_166);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[207]);
                /*@lineinfo:translated-code*//*@lineinfo:390^18*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[208]);
            /*@lineinfo:translated-code*//*@lineinfo:392^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_193=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_193.setParent(__jsp_taghandler_1);
              __jsp_taghandler_193.setName("ActivosForm");
              __jsp_taghandler_193.setProperty("operacion");
              __jsp_taghandler_193.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_193.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[209]);
                  /*@lineinfo:translated-code*//*@lineinfo:396^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_194=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_194.setParent(__jsp_taghandler_193);
                    __jsp_taghandler_194.setName("ActivosForm");
                    __jsp_taghandler_194.setProperty("opcion");
                    __jsp_taghandler_194.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_194.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[210]);
                        /*@lineinfo:translated-code*//*@lineinfo:398^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_195=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_195.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_195.setKey("activos1.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_195.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_195.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_195.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_195);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[211]);
                        /*@lineinfo:translated-code*//*@lineinfo:399^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_196=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_196.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_196.setDisabled(false);
                          __jsp_taghandler_196.setName("ActivosForm");
                          __jsp_taghandler_196.setProperty("act_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_196.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_196,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[212]);
                              /*@lineinfo:translated-code*//*@lineinfo:400^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_197=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_197.setParent(__jsp_taghandler_196);
                                __jsp_taghandler_197.setCollection("RubrosLista");
                                __jsp_taghandler_197.setLabelProperty("descripcion");
                                __jsp_taghandler_197.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_197.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_197.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_197.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_197);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[213]);
                            /*@lineinfo:translated-code*//*@lineinfo:400^102*/                            } while (__jsp_taghandler_196.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_196.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_196);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[214]);
                        /*@lineinfo:translated-code*//*@lineinfo:404^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_198=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_198.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_198.setKey("activos1.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_198.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_198.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_198.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_198);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[215]);
                        /*@lineinfo:translated-code*//*@lineinfo:405^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_199=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_199.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_199.setName("ActivosForm");
                          __jsp_taghandler_199.setProperty("act_codreg");
                          __jsp_tag_starteval=__jsp_taghandler_199.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_199,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_199.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_199.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_199);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[216]);
                        /*@lineinfo:translated-code*//*@lineinfo:406^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_200=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_200.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_200.setMaxlength("30");
                          __jsp_taghandler_200.setName("ActivosForm");
                          __jsp_taghandler_200.setProperty("act_regdescripcion");
                          __jsp_taghandler_200.setReadonly(true);
                          __jsp_taghandler_200.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_200.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_200,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_200.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_200.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_200);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[217]);
                        /*@lineinfo:translated-code*//*@lineinfo:409^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_201=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_201.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_201.setKey("activos1.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_201.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_201.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_201.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_201);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[218]);
                        /*@lineinfo:translated-code*//*@lineinfo:410^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_202=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_202.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_202.setName("ActivosForm");
                          __jsp_taghandler_202.setProperty("act_codfin");
                          __jsp_tag_starteval=__jsp_taghandler_202.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_202,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_202.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_202.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_202);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[219]);
                        /*@lineinfo:translated-code*//*@lineinfo:411^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_203=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_203.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_203.setMaxlength("30");
                          __jsp_taghandler_203.setName("ActivosForm");
                          __jsp_taghandler_203.setProperty("act_findescripcion");
                          __jsp_taghandler_203.setReadonly(true);
                          __jsp_taghandler_203.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_203.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_203,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_203.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_203.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_203);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[220]);
                        /*@lineinfo:translated-code*//*@lineinfo:414^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_204=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_204.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_204.setKey("activos1.descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_204.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_204.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_204.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_204);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[221]);
                        /*@lineinfo:translated-code*//*@lineinfo:415^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_205=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size value");
                          __jsp_taghandler_205.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_205.setMaxlength("120");
                          __jsp_taghandler_205.setName("ActivosForm");
                          __jsp_taghandler_205.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_205.setProperty("act_descripcion");
                          __jsp_taghandler_205.setSize("60");
                          __jsp_taghandler_205.setValue("%");
                          __jsp_tag_starteval=__jsp_taghandler_205.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_205,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_205.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_205.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_205);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[222]);
                        /*@lineinfo:translated-code*//*@lineinfo:420^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_206=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_206.setParent(__jsp_taghandler_194);
                          __jsp_taghandler_206.setOnclick("operacion.value=3;opcion.value=3");
                          __jsp_taghandler_206.setProperty("boton");
                          __jsp_taghandler_206.setStyleClass("boton1");
                          __jsp_taghandler_206.setValue("Eliminar");
                          __jsp_tag_starteval=__jsp_taghandler_206.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_206,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_206.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_206.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_206);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[223]);
                      /*@lineinfo:translated-code*//*@lineinfo:420^123*/                      } while (__jsp_taghandler_194.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_194.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_194);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[224]);
                  /*@lineinfo:translated-code*//*@lineinfo:424^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_207=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_207.setParent(__jsp_taghandler_193);
                    __jsp_taghandler_207.setName("ActivosForm");
                    __jsp_taghandler_207.setProperty("opcion");
                    __jsp_taghandler_207.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_207.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[225]);
                        /*@lineinfo:translated-code*//*@lineinfo:426^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_208=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_208.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_208.setKey("activos1.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_208.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_208.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_208.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_208);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[226]);
                        /*@lineinfo:translated-code*//*@lineinfo:427^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_209=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_209.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_209.setDisabled(false);
                          __jsp_taghandler_209.setName("ActivosForm");
                          __jsp_taghandler_209.setProperty("act_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_209.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_209,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[227]);
                              /*@lineinfo:translated-code*//*@lineinfo:428^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_210=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_210.setParent(__jsp_taghandler_209);
                                __jsp_taghandler_210.setCollection("RubrosLista");
                                __jsp_taghandler_210.setLabelProperty("descripcion");
                                __jsp_taghandler_210.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_210.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_210.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_210.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_210);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[228]);
                            /*@lineinfo:translated-code*//*@lineinfo:428^102*/                            } while (__jsp_taghandler_209.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_209.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_209);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[229]);
                        /*@lineinfo:translated-code*//*@lineinfo:432^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_211=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_211.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_211.setKey("activos1.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_211.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_211.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_211.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_211);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[230]);
                        /*@lineinfo:translated-code*//*@lineinfo:433^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_212=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_212.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_212.setName("ActivosForm");
                          __jsp_taghandler_212.setProperty("act_codreg");
                          __jsp_tag_starteval=__jsp_taghandler_212.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_212,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_212.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_212.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_212);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[231]);
                        /*@lineinfo:translated-code*//*@lineinfo:434^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_213=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_213.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_213.setMaxlength("30");
                          __jsp_taghandler_213.setName("ActivosForm");
                          __jsp_taghandler_213.setProperty("act_regdescripcion");
                          __jsp_taghandler_213.setReadonly(true);
                          __jsp_taghandler_213.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_213.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_213,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_213.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_213.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_213);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[232]);
                        /*@lineinfo:translated-code*//*@lineinfo:437^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_214=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_214.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_214.setKey("activos1.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_214.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_214.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_214.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_214);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[233]);
                        /*@lineinfo:translated-code*//*@lineinfo:438^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_215=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_215.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_215.setName("ActivosForm");
                          __jsp_taghandler_215.setProperty("act_codfin");
                          __jsp_tag_starteval=__jsp_taghandler_215.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_215,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_215.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_215.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_215);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[234]);
                        /*@lineinfo:translated-code*//*@lineinfo:439^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_216=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_216.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_216.setMaxlength("30");
                          __jsp_taghandler_216.setName("ActivosForm");
                          __jsp_taghandler_216.setProperty("act_findescripcion");
                          __jsp_taghandler_216.setReadonly(true);
                          __jsp_taghandler_216.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_216.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_216,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_216.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_216.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_216);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[235]);
                        /*@lineinfo:translated-code*//*@lineinfo:442^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_217=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_217.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_217.setKey("activos1.descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_217.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_217.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_217.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_217);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[236]);
                        /*@lineinfo:translated-code*//*@lineinfo:443^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_218=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_218.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_218.setMaxlength("120");
                          __jsp_taghandler_218.setName("ActivosForm");
                          __jsp_taghandler_218.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_218.setProperty("act_descripcion");
                          __jsp_taghandler_218.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_218.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_218,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_218.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_218.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_218);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[237]);
                        /*@lineinfo:translated-code*//*@lineinfo:448^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_219=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_219.setParent(__jsp_taghandler_207);
                          __jsp_taghandler_219.setOnclick("operacion.value=3;opcion.value=2");
                          __jsp_taghandler_219.setProperty("boton");
                          __jsp_taghandler_219.setStyleClass("boton1");
                          __jsp_taghandler_219.setValue("Modificar");
                          __jsp_tag_starteval=__jsp_taghandler_219.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_219,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_219.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_219.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_219);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[238]);
                      /*@lineinfo:translated-code*//*@lineinfo:448^124*/                      } while (__jsp_taghandler_207.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_207.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_207);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[239]);
                  /*@lineinfo:translated-code*//*@lineinfo:452^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_220=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_220.setParent(__jsp_taghandler_193);
                    __jsp_taghandler_220.setName("ActivosForm");
                    __jsp_taghandler_220.setProperty("opcion");
                    __jsp_taghandler_220.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_220.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[240]);
                        /*@lineinfo:translated-code*//*@lineinfo:454^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_221=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_221.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_221.setKey("activos1.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_221.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_221.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_221.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_221);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[241]);
                        /*@lineinfo:translated-code*//*@lineinfo:455^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_222=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_222.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_222.setDisabled(false);
                          __jsp_taghandler_222.setName("ActivosForm");
                          __jsp_taghandler_222.setProperty("act_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_222.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_222,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[242]);
                              /*@lineinfo:translated-code*//*@lineinfo:456^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_223=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_223.setParent(__jsp_taghandler_222);
                                __jsp_taghandler_223.setCollection("RubrosLista");
                                __jsp_taghandler_223.setLabelProperty("descripcion");
                                __jsp_taghandler_223.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_223.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_223.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_223.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_223);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[243]);
                            /*@lineinfo:translated-code*//*@lineinfo:456^102*/                            } while (__jsp_taghandler_222.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_222.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_222);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[244]);
                        /*@lineinfo:translated-code*//*@lineinfo:460^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_224=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_224.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_224.setKey("activos1.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_224.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_224.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_224.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_224);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[245]);
                        /*@lineinfo:translated-code*//*@lineinfo:461^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_225=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_225.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_225.setName("ActivosForm");
                          __jsp_taghandler_225.setProperty("act_codreg");
                          __jsp_tag_starteval=__jsp_taghandler_225.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_225,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_225.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_225.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_225);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[246]);
                        /*@lineinfo:translated-code*//*@lineinfo:462^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_226=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_226.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_226.setMaxlength("30");
                          __jsp_taghandler_226.setName("ActivosForm");
                          __jsp_taghandler_226.setProperty("act_regdescripcion");
                          __jsp_taghandler_226.setReadonly(true);
                          __jsp_taghandler_226.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_226.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_226,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_226.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_226.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_226);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[247]);
                        /*@lineinfo:translated-code*//*@lineinfo:465^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_227=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_227.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_227.setKey("activos1.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_227.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_227.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_227.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_227);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[248]);
                        /*@lineinfo:translated-code*//*@lineinfo:466^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_228=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_228.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_228.setName("ActivosForm");
                          __jsp_taghandler_228.setProperty("act_codfin");
                          __jsp_tag_starteval=__jsp_taghandler_228.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_228,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_228.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_228.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_228);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[249]);
                        /*@lineinfo:translated-code*//*@lineinfo:467^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_229=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_229.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_229.setMaxlength("30");
                          __jsp_taghandler_229.setName("ActivosForm");
                          __jsp_taghandler_229.setProperty("act_findescripcion");
                          __jsp_taghandler_229.setReadonly(true);
                          __jsp_taghandler_229.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_229.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_229,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_229.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_229.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_229);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[250]);
                        /*@lineinfo:translated-code*//*@lineinfo:472^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_230=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_230.setParent(__jsp_taghandler_220);
                          __jsp_taghandler_230.setOnclick("operacion.value=1;opcion.value=1");
                          __jsp_taghandler_230.setProperty("boton");
                          __jsp_taghandler_230.setStyleClass("boton1");
                          __jsp_taghandler_230.setValue("Insertar");
                          __jsp_tag_starteval=__jsp_taghandler_230.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_230,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_230.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_230.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_230);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[251]);
                      /*@lineinfo:translated-code*//*@lineinfo:472^123*/                      } while (__jsp_taghandler_220.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_220.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_220);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[252]);
                /*@lineinfo:translated-code*//*@lineinfo:475^20*/                } while (__jsp_taghandler_193.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_193.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_193);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[253]);
            /*@lineinfo:translated-code*//*@lineinfo:480^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_231=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_231.setParent(__jsp_taghandler_1);
              __jsp_taghandler_231.setName("ActivosForm");
              __jsp_taghandler_231.setProperty("operacion");
              __jsp_taghandler_231.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_231.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[254]);
                  /*@lineinfo:translated-code*//*@lineinfo:486^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_232=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_232.setParent(__jsp_taghandler_231);
                    __jsp_taghandler_232.setName("ActivosForm");
                    __jsp_taghandler_232.setProperty("act_codrub");
                    __jsp_tag_starteval=__jsp_taghandler_232.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_232,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_232.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_232.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_232);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[255]);
                  /*@lineinfo:translated-code*//*@lineinfo:487^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_233=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_233.setParent(__jsp_taghandler_231);
                    __jsp_taghandler_233.setName("ActivosForm");
                    __jsp_taghandler_233.setProperty("act_codreg");
                    __jsp_tag_starteval=__jsp_taghandler_233.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_233,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_233.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_233.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_233);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[256]);
                  /*@lineinfo:translated-code*//*@lineinfo:488^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_234=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_234.setParent(__jsp_taghandler_231);
                    __jsp_taghandler_234.setName("ActivosForm");
                    __jsp_taghandler_234.setProperty("act_codgrp");
                    __jsp_tag_starteval=__jsp_taghandler_234.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_234,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_234.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_234.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_234);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[257]);
                  /*@lineinfo:translated-code*//*@lineinfo:489^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_235=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_235.setParent(__jsp_taghandler_231);
                    __jsp_taghandler_235.setName("ActivosForm");
                    __jsp_taghandler_235.setProperty("act_codfin");
                    __jsp_tag_starteval=__jsp_taghandler_235.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_235,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_235.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_235.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_235);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[258]);
                  /*@lineinfo:translated-code*//*@lineinfo:490^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_236=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_236.setParent(__jsp_taghandler_231);
                    __jsp_taghandler_236.setName("ActivosForm");
                    __jsp_taghandler_236.setProperty("act_descripcion");
                    __jsp_tag_starteval=__jsp_taghandler_236.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_236,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_236.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_236.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_236);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[259]);
                  /*@lineinfo:user-code*//*@lineinfo:498^7*/                   int pnum=0;
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[260]);
                  /*@lineinfo:translated-code*//*@lineinfo:499^7*/                  {
                    org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_237=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
                    __jsp_taghandler_237.setParent(__jsp_taghandler_231);
                    __jsp_taghandler_237.setId("lista");
                    __jsp_taghandler_237.setName("Activos3Lista");
                    java.lang.Object lista = null;
                    __jsp_tag_starteval=__jsp_taghandler_237.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_237,__jsp_tag_starteval,out);
                      do {
                        lista = (java.lang.Object) pageContext.findAttribute("lista");
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[261]);
                        /*@lineinfo:user-code*//*@lineinfo:500^9*/                         if (pnum==1) {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[262]);
                        /*@lineinfo:user-code*//*@lineinfo:502^9*/                         } else { 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[263]);
                        /*@lineinfo:user-code*//*@lineinfo:504^9*/                         } 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[264]);
                        /*@lineinfo:translated-code*//*@lineinfo:506^12*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_238=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_238.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_238.setName("lista");
                          __jsp_taghandler_238.setProperty("codrub");
                          __jsp_tag_starteval=__jsp_taghandler_238.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_238.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_238.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_238);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[265]);
                        /*@lineinfo:translated-code*//*@lineinfo:506^58*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_239=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_239.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_239.setName("lista");
                          __jsp_taghandler_239.setProperty("codreg");
                          __jsp_tag_starteval=__jsp_taghandler_239.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_239.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_239.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_239);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[266]);
                        /*@lineinfo:translated-code*//*@lineinfo:506^104*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_240=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_240.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_240.setName("lista");
                          __jsp_taghandler_240.setProperty("ceros");
                          __jsp_tag_starteval=__jsp_taghandler_240.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_240.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_240.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_240);
                        }
/*@lineinfo:506^148*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_241=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_241.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_241.setName("lista");
                          __jsp_taghandler_241.setProperty("codigo");
                          __jsp_tag_starteval=__jsp_taghandler_241.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_241.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_241.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_241);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[267]);
                        /*@lineinfo:translated-code*//*@lineinfo:507^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_242=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_242.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_242.setName("lista");
                          __jsp_taghandler_242.setProperty("descodgrp");
                          __jsp_tag_starteval=__jsp_taghandler_242.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_242.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_242.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_242);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[268]);
                        /*@lineinfo:translated-code*//*@lineinfo:508^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_243=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_243.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_243.setName("lista");
                          __jsp_taghandler_243.setProperty("descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_243.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_243.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_243.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_243);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[269]);
                        /*@lineinfo:translated-code*//*@lineinfo:509^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_244=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_244.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_244.setName("ActivosForm");
                          __jsp_taghandler_244.setProperty("opcion");
                          __jsp_taghandler_244.setValue("5");
                          __jsp_tag_starteval=__jsp_taghandler_244.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[270]);
                              /*@lineinfo:translated-code*//*@lineinfo:510^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_245=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_245.setParent(__jsp_taghandler_244);
                                __jsp_taghandler_245.setIndexed(true);
                                __jsp_taghandler_245.setOnclick("operacion.value=1;opcion.value=5");
                                __jsp_taghandler_245.setProperty("boton");
                                __jsp_taghandler_245.setStyleClass("boton1");
                                __jsp_taghandler_245.setValue("Reportar");
                                __jsp_tag_starteval=__jsp_taghandler_245.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_245,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_245.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_245.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_245);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[271]);
                            /*@lineinfo:translated-code*//*@lineinfo:510^159*/                            } while (__jsp_taghandler_244.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_244.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_244);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[272]);
                        /*@lineinfo:translated-code*//*@lineinfo:512^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_246=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_246.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_246.setName("ActivosForm");
                          __jsp_taghandler_246.setProperty("opcion");
                          __jsp_taghandler_246.setValue("3");
                          __jsp_tag_starteval=__jsp_taghandler_246.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[273]);
                              /*@lineinfo:translated-code*//*@lineinfo:513^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_247=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_247.setParent(__jsp_taghandler_246);
                                __jsp_taghandler_247.setIndexed(true);
                                __jsp_taghandler_247.setOnclick("operacion.value=1;opcion.value=3");
                                __jsp_taghandler_247.setProperty("boton");
                                __jsp_taghandler_247.setStyleClass("boton1");
                                __jsp_taghandler_247.setValue("Eliminar");
                                __jsp_tag_starteval=__jsp_taghandler_247.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_247,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_247.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_247.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_247);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[274]);
                            /*@lineinfo:translated-code*//*@lineinfo:513^159*/                            } while (__jsp_taghandler_246.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_246.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_246);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[275]);
                        /*@lineinfo:translated-code*//*@lineinfo:515^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_248=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_248.setParent(__jsp_taghandler_237);
                          __jsp_taghandler_248.setName("ActivosForm");
                          __jsp_taghandler_248.setProperty("opcion");
                          __jsp_taghandler_248.setValue("2");
                          __jsp_tag_starteval=__jsp_taghandler_248.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[276]);
                              /*@lineinfo:translated-code*//*@lineinfo:516^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_249=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_249.setParent(__jsp_taghandler_248);
                                __jsp_taghandler_249.setIndexed(true);
                                __jsp_taghandler_249.setOnclick("operacion.value=1;opcion.value=2");
                                __jsp_taghandler_249.setProperty("boton");
                                __jsp_taghandler_249.setStyleClass("boton1");
                                __jsp_taghandler_249.setValue("Modificar");
                                __jsp_tag_starteval=__jsp_taghandler_249.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_249,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_249.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_249.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_249);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[277]);
                            /*@lineinfo:translated-code*//*@lineinfo:516^160*/                            } while (__jsp_taghandler_248.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_248.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_248);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[278]);
                        /*@lineinfo:user-code*//*@lineinfo:519^10*/                         if (pnum==0) pnum=1; else pnum=0; 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[279]);
                      /*@lineinfo:translated-code*//*@lineinfo:519^49*/                      } while (__jsp_taghandler_237.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_237.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_237);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[280]);
                /*@lineinfo:translated-code*//*@lineinfo:520^23*/                } while (__jsp_taghandler_231.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_231.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_231);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[281]);
          /*@lineinfo:translated-code*//*@lineinfo:527^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[282]);


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
    private static final char text[][]=new char[283][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n".toCharArray();
      text[3] = 
      "\n".toCharArray();
      text[4] = 
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-125\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones2.js?1.3\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  function pantallaCompleta(pagina) {\n    var ancho = window.screen.availWidth - 50;\n    var alto = window.screen.availHeight - 150;\n    var omenu = window.open(pagina, \"_blank\", \"width=\"+ancho+\", height=\"+alto+\",left=20,top=20,status=yes,resizable=yes,titlebar=yes,scrollbars=yes,dependent=yes\");\n    omenu.focus();\n  }\n</script>\n<body onload=\"javascript:document.ActivosForm.act_codgrp.focus()\">\n<table border=\"1\" width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<caption>Activos</caption>\n<tr><td>\n".toCharArray();
      text[5] = 
      "\n\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n".toCharArray();
      text[8] = 
      "\n   ".toCharArray();
      text[9] = 
      "\n   ".toCharArray();
      text[10] = 
      "\n   ".toCharArray();
      text[11] = 
      "\n   ".toCharArray();
      text[12] = 
      "\n   ".toCharArray();
      text[13] = 
      "\n   ".toCharArray();
      text[14] = 
      "\n   ".toCharArray();
      text[15] = 
      "\n   ".toCharArray();
      text[16] = 
      "\n   ".toCharArray();
      text[17] = 
      "\n   ".toCharArray();
      text[18] = 
      "\n   ".toCharArray();
      text[19] = 
      "\n   ".toCharArray();
      text[20] = 
      "\n   ".toCharArray();
      text[21] = 
      "\n   ".toCharArray();
      text[22] = 
      "\n   ".toCharArray();
      text[23] = 
      "\n   ".toCharArray();
      text[24] = 
      "\n   ".toCharArray();
      text[25] = 
      "\n   ".toCharArray();
      text[26] = 
      "\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[27] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[28] = 
      "\n         ".toCharArray();
      text[29] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[30] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[31] = 
      "\n         ".toCharArray();
      text[32] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[33] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[34] = 
      "\n         ".toCharArray();
      text[35] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[36] = 
      "</td>\n         <td>".toCharArray();
      text[37] = 
      "\n              ".toCharArray();
      text[38] = 
      "\n              ".toCharArray();
      text[39] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[40] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[41] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[42] = 
      "</td>\n         <td>\n             ".toCharArray();
      text[43] = 
      "            \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[44] = 
      "</td>\n         <td>\n             ".toCharArray();
      text[45] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[46] = 
      "</td>\n         <td>".toCharArray();
      text[47] = 
      "\n              ".toCharArray();
      text[48] = 
      "\n              ".toCharArray();
      text[49] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[50] = 
      "</td>\n         <td>".toCharArray();
      text[51] = 
      "\n              ".toCharArray();
      text[52] = 
      "\n              ".toCharArray();
      text[53] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[54] = 
      "</td>\n         <td>".toCharArray();
      text[55] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[56] = 
      "</td>\n         <td>".toCharArray();
      text[57] = 
      "</td>\n      </tr>\n      </table>\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[58] = 
      "</td>\n         <td>".toCharArray();
      text[59] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[60] = 
      "</td>\n         <td>".toCharArray();
      text[61] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[62] = 
      "</td>\n         <td>".toCharArray();
      text[63] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">\n            ".toCharArray();
      text[64] = 
      "\n         </td>\n         <td>\n            ".toCharArray();
      text[65] = 
      "\n         </td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[66] = 
      "*".toCharArray();
      text[67] = 
      "</td>\n         <td>".toCharArray();
      text[68] = 
      "</td>\n      </tr>\n      </table>\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[69] = 
      "</td>\n         <td>".toCharArray();
      text[70] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[71] = 
      "</td>\n         <td>".toCharArray();
      text[72] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[73] = 
      "</td>\n         <td>".toCharArray();
      text[74] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[75] = 
      "</td>\n         <td>".toCharArray();
      text[76] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[77] = 
      "</td>\n         <td>".toCharArray();
      text[78] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[79] = 
      "</td>\n         <td>".toCharArray();
      text[80] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[81] = 
      "</td>\n         <td>".toCharArray();
      text[82] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[83] = 
      "</td>\n         <td>".toCharArray();
      text[84] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[85] = 
      "</td>\n         <td>".toCharArray();
      text[86] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[87] = 
      "</td>\n         <td>".toCharArray();
      text[88] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[89] = 
      "</td>\n         <td>".toCharArray();
      text[90] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[91] = 
      "</td>\n         <td>".toCharArray();
      text[92] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[93] = 
      "</td>\n         <td>".toCharArray();
      text[94] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[95] = 
      "</td>\n         <td>".toCharArray();
      text[96] = 
      "\n             ".toCharArray();
      text[97] = 
      "\n             ".toCharArray();
      text[98] = 
      "\n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[99] = 
      "</td>\n         <td>".toCharArray();
      text[100] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=2>".toCharArray();
      text[101] = 
      "</td>\n      </tr>      \n      <tr>\n        <td colspan=4>\n           <FONT color=\"#FF0000\" face=\"Arial, Helvetica, san-serif\" size=2> \n           ".toCharArray();
      text[102] = 
      "\n           No se olvide verificar la existencia del tipo de cambio para la fecha de compra y la fecha de activación\n           ".toCharArray();
      text[103] = 
      "\n           </FONT>\n        </td>\n      </tr>      \n      </table>\n   ".toCharArray();
      text[104] = 
      "\n   ".toCharArray();
      text[105] = 
      "\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[106] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[107] = 
      "\n         ".toCharArray();
      text[108] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[109] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[110] = 
      "\n         ".toCharArray();
      text[111] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[112] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[113] = 
      "\n         ".toCharArray();
      text[114] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[115] = 
      "</td>\n         <td>\n            ".toCharArray();
      text[116] = 
      "\n               ".toCharArray();
      text[117] = 
      "\n            ".toCharArray();
      text[118] = 
      "\n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[119] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[120] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[121] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[122] = 
      "            \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[123] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[124] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[125] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[126] = 
      " \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[127] = 
      "</td>\n         <td>".toCharArray();
      text[128] = 
      "\n              ".toCharArray();
      text[129] = 
      "\n              ".toCharArray();
      text[130] = 
      "\n         </td>         \n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[131] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[132] = 
      " \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[133] = 
      "</td>\n         <td>".toCharArray();
      text[134] = 
      "</td>\n      </tr>\n      </table>\n     <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[135] = 
      "</td>\n         <td>".toCharArray();
      text[136] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[137] = 
      "</td>\n         <td>".toCharArray();
      text[138] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[139] = 
      "</td>\n         <td>".toCharArray();
      text[140] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">\n            ".toCharArray();
      text[141] = 
      "\n         </td>\n         <td>\n            ".toCharArray();
      text[142] = 
      "\n         </td>\n      </tr>            \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[143] = 
      "*".toCharArray();
      text[144] = 
      "</td>\n         <td>".toCharArray();
      text[145] = 
      "</td>\n      </tr>\n      </table>\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[146] = 
      "</td>\n         <td>".toCharArray();
      text[147] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[148] = 
      "</td>\n         <td>".toCharArray();
      text[149] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[150] = 
      "</td>\n         <td>".toCharArray();
      text[151] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[152] = 
      "</td>\n         <td>".toCharArray();
      text[153] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[154] = 
      "</td>\n         <td>".toCharArray();
      text[155] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[156] = 
      "</td>\n         <td>".toCharArray();
      text[157] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[158] = 
      "</td>\n         <td>".toCharArray();
      text[159] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[160] = 
      "</td>\n         <td>".toCharArray();
      text[161] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[162] = 
      "</td>\n         <td>".toCharArray();
      text[163] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[164] = 
      "</td>\n         <td>".toCharArray();
      text[165] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[166] = 
      "</td>\n         <td>".toCharArray();
      text[167] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[168] = 
      "</td>\n         <td>".toCharArray();
      text[169] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[170] = 
      "</td>\n         <td>".toCharArray();
      text[171] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[172] = 
      "</td>\n         <td>".toCharArray();
      text[173] = 
      "\n             ".toCharArray();
      text[174] = 
      "\n             ".toCharArray();
      text[175] = 
      "\n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[176] = 
      "</td>\n         <td>".toCharArray();
      text[177] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=2>".toCharArray();
      text[178] = 
      "</td>\n      </tr>        \n      </table> \n   ".toCharArray();
      text[179] = 
      "   \n   ".toCharArray();
      text[180] = 
      "\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[181] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[182] = 
      "\n         ".toCharArray();
      text[183] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[184] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[185] = 
      "\n         ".toCharArray();
      text[186] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[187] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[188] = 
      "\n         ".toCharArray();
      text[189] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[190] = 
      "</td>\n         <td>\n             ".toCharArray();
      text[191] = 
      " \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[192] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[193] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[194] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[195] = 
      "            \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[196] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[197] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[198] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[199] = 
      " \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[200] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[201] = 
      " \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[202] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[203] = 
      " \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[204] = 
      "</td>\n         <td>".toCharArray();
      text[205] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=2>".toCharArray();
      text[206] = 
      "</td>\n      </tr>            \n      </table>\n   ".toCharArray();
      text[207] = 
      "\n".toCharArray();
      text[208] = 
      "\n".toCharArray();
      text[209] = 
      "\n   <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n   <tr class=\"T8a\">\n     <td>\n     ".toCharArray();
      text[210] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[211] = 
      "</td>\n           <td>".toCharArray();
      text[212] = 
      "\n               ".toCharArray();
      text[213] = 
      "\n              ".toCharArray();
      text[214] = 
      "</td>           \n        </tr>\n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[215] = 
      "</td>\n            <td>".toCharArray();
      text[216] = 
      "\n            ".toCharArray();
      text[217] = 
      "</td>\n        </tr>  \n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[218] = 
      "</td>\n            <td>".toCharArray();
      text[219] = 
      "\n            ".toCharArray();
      text[220] = 
      "</td>\n        </tr>  \n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[221] = 
      " % = Comodin</td>\n           <td>".toCharArray();
      text[222] = 
      "</td>\n        </tr>       \n        <tr>\n           <td></td>\n           <td align=\"left\">\n           ".toCharArray();
      text[223] = 
      "\n        </td>\n        </tr>\n     ".toCharArray();
      text[224] = 
      "\n     ".toCharArray();
      text[225] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[226] = 
      "</td>\n           <td>".toCharArray();
      text[227] = 
      "\n               ".toCharArray();
      text[228] = 
      "\n              ".toCharArray();
      text[229] = 
      "</td>           \n        </tr>\n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[230] = 
      "</td>\n            <td>".toCharArray();
      text[231] = 
      "\n            ".toCharArray();
      text[232] = 
      "</td>\n        </tr>  \n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[233] = 
      "</td>\n            <td>".toCharArray();
      text[234] = 
      "\n            ".toCharArray();
      text[235] = 
      "</td>\n        </tr>  \n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[236] = 
      " % = Comodin</td>\n           <td>".toCharArray();
      text[237] = 
      "</td>\n        </tr>       \n        <tr>\n           <td></td>\n           <td align=\"left\">\n           ".toCharArray();
      text[238] = 
      "\n        </td>\n        </tr>\n     ".toCharArray();
      text[239] = 
      "\n     ".toCharArray();
      text[240] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[241] = 
      "</td>\n           <td>".toCharArray();
      text[242] = 
      "\n               ".toCharArray();
      text[243] = 
      "\n              ".toCharArray();
      text[244] = 
      "</td>           \n        </tr>\n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[245] = 
      "</td>\n            <td>".toCharArray();
      text[246] = 
      "\n            ".toCharArray();
      text[247] = 
      "</td>\n        </tr>  \n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[248] = 
      "</td>\n            <td>".toCharArray();
      text[249] = 
      "\n            ".toCharArray();
      text[250] = 
      "</td>\n        </tr>  \n        <tr>\n           <td></td>\n           <td align=\"left\">\n           ".toCharArray();
      text[251] = 
      "\n           </td>\n        </tr>\n     ".toCharArray();
      text[252] = 
      "\n     </td>\n   </tr>\n   </table>\n".toCharArray();
      text[253] = 
      "\n".toCharArray();
      text[254] = 
      "\n<table width=\"100%\" align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n  <tr class=\"T8a\">\n     <td>\n     <table width=\"100%\" align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n     <tr><td>\n     ".toCharArray();
      text[255] = 
      "\n     ".toCharArray();
      text[256] = 
      "\n     ".toCharArray();
      text[257] = 
      "\n     ".toCharArray();
      text[258] = 
      "\n     ".toCharArray();
      text[259] = 
      "\n      <table width=\"100%\" class=\"soloborde\" bgcolor=\"#C1C1FF\">\n       <tr class=\"FondoAzul\">\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Código</td>\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Grupo</td>\n         <td width=\"160\" scope=\"col\" class=\"S10c\">Descripción</td>\n         <td></td>\n       </tr>\n      ".toCharArray();
      text[260] = 
      "\n      ".toCharArray();
      text[261] = 
      "\n        ".toCharArray();
      text[262] = 
      "\n           <tr class=\"T8b\">\n        ".toCharArray();
      text[263] = 
      "\n           <tr class=\"T8a\">\n        ".toCharArray();
      text[264] = 
      "\n           <td>\n           ".toCharArray();
      text[265] = 
      "-".toCharArray();
      text[266] = 
      "-".toCharArray();
      text[267] = 
      "</td>\n           <td>".toCharArray();
      text[268] = 
      "</td>\n           <td>".toCharArray();
      text[269] = 
      "</td>\n           ".toCharArray();
      text[270] = 
      "\n              <td align=\"right\">".toCharArray();
      text[271] = 
      "</td>\n           ".toCharArray();
      text[272] = 
      "\n           ".toCharArray();
      text[273] = 
      "\n              <td align=\"right\">".toCharArray();
      text[274] = 
      "</td>\n           ".toCharArray();
      text[275] = 
      "     \n           ".toCharArray();
      text[276] = 
      "\n              <td align=\"right\">".toCharArray();
      text[277] = 
      "</td>\n           ".toCharArray();
      text[278] = 
      "     \n         </tr>\n         ".toCharArray();
      text[279] = 
      "\n      ".toCharArray();
      text[280] = 
      "\n      </table>\n     </td></tr>     \n     </table>\n     </td>\n   </tr>\n</table>\n".toCharArray();
      text[281] = 
      "\n".toCharArray();
      text[282] = 
      "\n</td></tr>\n<tr><td align=\"center\" colspan=\"2\" class=\"S10d\">(*) Campos Obligatorios</td></tr>\n</table>\n</body>\n</html>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
