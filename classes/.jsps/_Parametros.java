  /*@lineinfo:filename=/Parametros.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Parametros extends oracle.jsp.runtime.HttpJsp {

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
    _Parametros page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:155^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/parametrosAction");
        __jsp_taghandler_1.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:156^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:157^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:160^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("ParametrosForm");
              __jsp_taghandler_4.setProperty("operacion");
              __jsp_taghandler_4.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:161^4*/                  {
                    org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("ParametrosForm");
                    __jsp_taghandler_5.setProperty("opcion");
                    __jsp_taghandler_5.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[9]);
                        /*@lineinfo:translated-code*//*@lineinfo:163^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setKey("parametros.codinstitucion");
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
                        out.write(__jsp_StaticText.text[10]);
                        /*@lineinfo:translated-code*//*@lineinfo:164^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_7.setMaxlength("3");
                          __jsp_taghandler_7.setName("ParametrosForm");
                          __jsp_taghandler_7.setProperty("cte_codinstitucion");
                          __jsp_taghandler_7.setReadonly(true);
                          __jsp_taghandler_7.setSize("3");
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
                        /*@lineinfo:translated-code*//*@lineinfo:167^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_8.setKey("parametros.codrub1");
                          __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[12]);
                        /*@lineinfo:translated-code*//*@lineinfo:168^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_9.setMaxlength("10");
                          __jsp_taghandler_9.setName("ParametrosForm");
                          __jsp_taghandler_9.setProperty("cte_codrub1");
                          __jsp_taghandler_9.setReadonly(true);
                          __jsp_taghandler_9.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:171^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_10=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_10.setKey("parametros.codrub2");
                          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[14]);
                        /*@lineinfo:translated-code*//*@lineinfo:172^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_11=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_11.setMaxlength("10");
                          __jsp_taghandler_11.setName("ParametrosForm");
                          __jsp_taghandler_11.setProperty("cte_codrub2");
                          __jsp_taghandler_11.setReadonly(true);
                          __jsp_taghandler_11.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:175^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_12=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_12.setKey("parametros.codrub3");
                          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[16]);
                        /*@lineinfo:translated-code*//*@lineinfo:176^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_13=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_13.setMaxlength("10");
                          __jsp_taghandler_13.setName("ParametrosForm");
                          __jsp_taghandler_13.setProperty("cte_codrub3");
                          __jsp_taghandler_13.setReadonly(true);
                          __jsp_taghandler_13.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:179^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_14=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_14.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_14.setKey("parametros.codrub4");
                          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[18]);
                        /*@lineinfo:translated-code*//*@lineinfo:180^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_15=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_15.setMaxlength("10");
                          __jsp_taghandler_15.setName("ParametrosForm");
                          __jsp_taghandler_15.setProperty("cte_codrub4");
                          __jsp_taghandler_15.setReadonly(true);
                          __jsp_taghandler_15.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:183^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_16=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_16.setKey("parametros.codrub5");
                          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[20]);
                        /*@lineinfo:translated-code*//*@lineinfo:184^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_17=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_17.setMaxlength("10");
                          __jsp_taghandler_17.setName("ParametrosForm");
                          __jsp_taghandler_17.setProperty("cte_codrub5");
                          __jsp_taghandler_17.setReadonly(true);
                          __jsp_taghandler_17.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:187^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_18.setKey("parametros.codrub6");
                          __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[22]);
                        /*@lineinfo:translated-code*//*@lineinfo:188^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_19=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_19.setMaxlength("10");
                          __jsp_taghandler_19.setName("ParametrosForm");
                          __jsp_taghandler_19.setProperty("cte_codrub6");
                          __jsp_taghandler_19.setReadonly(true);
                          __jsp_taghandler_19.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:191^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_20=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_20.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_20.setKey("parametros.tipdocentrega");
                          __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[24]);
                        /*@lineinfo:translated-code*//*@lineinfo:192^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_21=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_21.setMaxlength("1");
                          __jsp_taghandler_21.setName("ParametrosForm");
                          __jsp_taghandler_21.setProperty("cte_tipdocentrega");
                          __jsp_taghandler_21.setReadonly(true);
                          __jsp_taghandler_21.setSize("1");
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
                        /*@lineinfo:translated-code*//*@lineinfo:195^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_22=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_22.setKey("parametros.tipdocdevolucion");
                          __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[26]);
                        /*@lineinfo:translated-code*//*@lineinfo:196^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_23=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_23.setMaxlength("1");
                          __jsp_taghandler_23.setName("ParametrosForm");
                          __jsp_taghandler_23.setProperty("cte_tipdocdevolucion");
                          __jsp_taghandler_23.setReadonly(true);
                          __jsp_taghandler_23.setSize("1");
                          __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_23,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[27]);
                        /*@lineinfo:translated-code*//*@lineinfo:199^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_24=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_24.setKey("parametros.tipdoctransferencia");
                          __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[28]);
                        /*@lineinfo:translated-code*//*@lineinfo:200^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_25=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_25.setMaxlength("1");
                          __jsp_taghandler_25.setName("ParametrosForm");
                          __jsp_taghandler_25.setProperty("cte_tipdoctransferencia");
                          __jsp_taghandler_25.setReadonly(true);
                          __jsp_taghandler_25.setSize("1");
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
                        /*@lineinfo:translated-code*//*@lineinfo:203^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_26=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_26.setKey("parametros.tipdocbaja");
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
                        /*@lineinfo:translated-code*//*@lineinfo:204^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_27=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_27.setMaxlength("1");
                          __jsp_taghandler_27.setName("ParametrosForm");
                          __jsp_taghandler_27.setProperty("cte_tipdocbaja");
                          __jsp_taghandler_27.setReadonly(true);
                          __jsp_taghandler_27.setSize("1");
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
                        /*@lineinfo:translated-code*//*@lineinfo:207^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_28=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_28.setKey("parametros.tipdoctraregionales");
                          __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[32]);
                        /*@lineinfo:translated-code*//*@lineinfo:208^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_29=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_29.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_29.setMaxlength("1");
                          __jsp_taghandler_29.setName("ParametrosForm");
                          __jsp_taghandler_29.setProperty("cte_tipdoctraregionales");
                          __jsp_taghandler_29.setReadonly(true);
                          __jsp_taghandler_29.setSize("1");
                          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[33]);
                        /*@lineinfo:translated-code*//*@lineinfo:211^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_30=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_30.setKey("parametros.gestion");
                          __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[34]);
                        /*@lineinfo:translated-code*//*@lineinfo:212^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_31=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_31.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_31.setMaxlength("4");
                          __jsp_taghandler_31.setName("ParametrosForm");
                          __jsp_taghandler_31.setProperty("cte_gestion");
                          __jsp_taghandler_31.setSize("4");
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
                        /*@lineinfo:translated-code*//*@lineinfo:215^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_32=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_32.setKey("parametros.codrubaccesorios");
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
                        /*@lineinfo:translated-code*//*@lineinfo:216^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_33=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_33.setMaxlength("4");
                          __jsp_taghandler_33.setName("ParametrosForm");
                          __jsp_taghandler_33.setProperty("cte_codrubaccesorios");
                          __jsp_taghandler_33.setSize("4");
                          __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_33,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[37]);
                      /*@lineinfo:translated-code*//*@lineinfo:216^105*/                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[38]);
                  /*@lineinfo:translated-code*//*@lineinfo:219^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_34=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_34.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_34.setName("ParametrosForm");
                    __jsp_taghandler_34.setProperty("opcion");
                    __jsp_taghandler_34.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:221^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_35=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                          __jsp_taghandler_35.setOnclick("operacion.value=2;opcion.value=1");
                          __jsp_taghandler_35.setProperty("boton");
                          __jsp_taghandler_35.setStyleClass("boton1");
                          __jsp_taghandler_35.setValue("Insertar");
                          __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_35,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[40]);
                        /*@lineinfo:translated-code*//*@lineinfo:222^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_36=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_34);
                          __jsp_taghandler_36.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_36.setProperty("boton");
                          __jsp_taghandler_36.setStyleClass("boton1");
                          __jsp_taghandler_36.setValue("Cancelar");
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
                      /*@lineinfo:translated-code*//*@lineinfo:222^140*/                      } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[42]);
                  /*@lineinfo:translated-code*//*@lineinfo:225^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_37=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_37.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_37.setName("ParametrosForm");
                    __jsp_taghandler_37.setProperty("opcion");
                    __jsp_taghandler_37.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[43]);
                        /*@lineinfo:translated-code*//*@lineinfo:227^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_38=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_38.setOnclick("operacion.value=2;opcion.value=2");
                          __jsp_taghandler_38.setProperty("boton");
                          __jsp_taghandler_38.setStyleClass("boton1");
                          __jsp_taghandler_38.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[44]);
                        /*@lineinfo:translated-code*//*@lineinfo:228^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_39=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_39.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_39.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_39.setProperty("boton");
                          __jsp_taghandler_39.setStyleClass("boton1");
                          __jsp_taghandler_39.setValue("Cancelar");
                          __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_39,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[45]);
                      /*@lineinfo:translated-code*//*@lineinfo:228^140*/                      } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[46]);
                  /*@lineinfo:translated-code*//*@lineinfo:231^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_40=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_40.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_40.setName("ParametrosForm");
                    __jsp_taghandler_40.setProperty("opcion");
                    __jsp_taghandler_40.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[47]);
                        /*@lineinfo:translated-code*//*@lineinfo:233^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_41=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_41.setKey("parametros.codinstitucion");
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
                        out.write(__jsp_StaticText.text[48]);
                        /*@lineinfo:translated-code*//*@lineinfo:234^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_42=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_42.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_42.setMaxlength("3");
                          __jsp_taghandler_42.setName("ParametrosForm");
                          __jsp_taghandler_42.setProperty("cte_codinstitucion");
                          __jsp_taghandler_42.setReadonly(true);
                          __jsp_taghandler_42.setSize("3");
                          __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_42,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[49]);
                        /*@lineinfo:translated-code*//*@lineinfo:237^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_43=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_43.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_43.setKey("parametros.codrub1");
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
                        out.write(__jsp_StaticText.text[50]);
                        /*@lineinfo:translated-code*//*@lineinfo:238^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_44=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_44.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_44.setMaxlength("10");
                          __jsp_taghandler_44.setName("ParametrosForm");
                          __jsp_taghandler_44.setProperty("cte_codrub1");
                          __jsp_taghandler_44.setReadonly(true);
                          __jsp_taghandler_44.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_44,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[51]);
                        /*@lineinfo:translated-code*//*@lineinfo:241^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_45=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_45.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_45.setKey("parametros.codrub2");
                          __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[52]);
                        /*@lineinfo:translated-code*//*@lineinfo:242^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_46=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_46.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_46.setMaxlength("10");
                          __jsp_taghandler_46.setName("ParametrosForm");
                          __jsp_taghandler_46.setProperty("cte_codrub2");
                          __jsp_taghandler_46.setReadonly(true);
                          __jsp_taghandler_46.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_46,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[53]);
                        /*@lineinfo:translated-code*//*@lineinfo:245^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_47=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_47.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_47.setKey("parametros.codrub3");
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
                        /*@lineinfo:translated-code*//*@lineinfo:246^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_48=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_48.setMaxlength("10");
                          __jsp_taghandler_48.setName("ParametrosForm");
                          __jsp_taghandler_48.setProperty("cte_codrub3");
                          __jsp_taghandler_48.setReadonly(true);
                          __jsp_taghandler_48.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:249^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_49=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_49.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_49.setKey("parametros.codrub4");
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
                        /*@lineinfo:translated-code*//*@lineinfo:250^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_50=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_50.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_50.setMaxlength("10");
                          __jsp_taghandler_50.setName("ParametrosForm");
                          __jsp_taghandler_50.setProperty("cte_codrub4");
                          __jsp_taghandler_50.setReadonly(true);
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
                        /*@lineinfo:translated-code*//*@lineinfo:253^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_51=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_51.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_51.setKey("parametros.codrub5");
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
                        /*@lineinfo:translated-code*//*@lineinfo:254^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_52=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_52.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_52.setMaxlength("10");
                          __jsp_taghandler_52.setName("ParametrosForm");
                          __jsp_taghandler_52.setProperty("cte_codrub5");
                          __jsp_taghandler_52.setReadonly(true);
                          __jsp_taghandler_52.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:257^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_53=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_53.setKey("parametros.codrub6");
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
                        /*@lineinfo:translated-code*//*@lineinfo:258^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_54=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_54.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_54.setMaxlength("10");
                          __jsp_taghandler_54.setName("ParametrosForm");
                          __jsp_taghandler_54.setProperty("cte_codrub6");
                          __jsp_taghandler_54.setReadonly(true);
                          __jsp_taghandler_54.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:261^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_55=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_55.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_55.setKey("parametros.tipdocentrega");
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
                        /*@lineinfo:translated-code*//*@lineinfo:262^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_56=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_56.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_56.setMaxlength("1");
                          __jsp_taghandler_56.setName("ParametrosForm");
                          __jsp_taghandler_56.setProperty("cte_tipdocentrega");
                          __jsp_taghandler_56.setReadonly(true);
                          __jsp_taghandler_56.setSize("1");
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
                        /*@lineinfo:translated-code*//*@lineinfo:265^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_57=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_57.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_57.setKey("parametros.tipdocdevolucion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:266^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_58=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_58.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_58.setMaxlength("1");
                          __jsp_taghandler_58.setName("ParametrosForm");
                          __jsp_taghandler_58.setProperty("cte_tipdocdevolucion");
                          __jsp_taghandler_58.setReadonly(true);
                          __jsp_taghandler_58.setSize("1");
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
                        /*@lineinfo:translated-code*//*@lineinfo:269^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_59=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_59.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_59.setKey("parametros.tipdoctransferencia");
                          __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_59.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[66]);
                        /*@lineinfo:translated-code*//*@lineinfo:270^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_60=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_60.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_60.setMaxlength("1");
                          __jsp_taghandler_60.setName("ParametrosForm");
                          __jsp_taghandler_60.setProperty("cte_tipdoctransferencia");
                          __jsp_taghandler_60.setReadonly(true);
                          __jsp_taghandler_60.setSize("1");
                          __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_60,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[67]);
                        /*@lineinfo:translated-code*//*@lineinfo:273^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_61=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_61.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_61.setKey("parametros.tipdocbaja");
                          __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_61.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[68]);
                        /*@lineinfo:translated-code*//*@lineinfo:274^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_62=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_62.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_62.setMaxlength("1");
                          __jsp_taghandler_62.setName("ParametrosForm");
                          __jsp_taghandler_62.setProperty("cte_tipdocbaja");
                          __jsp_taghandler_62.setReadonly(true);
                          __jsp_taghandler_62.setSize("1");
                          __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_62,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_62.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[69]);
                        /*@lineinfo:translated-code*//*@lineinfo:277^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_63=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_63.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_63.setKey("parametros.tipdoctraregionales");
                          __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[70]);
                        /*@lineinfo:translated-code*//*@lineinfo:278^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_64=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_64.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_64.setMaxlength("1");
                          __jsp_taghandler_64.setName("ParametrosForm");
                          __jsp_taghandler_64.setProperty("cte_tipdoctraregionales");
                          __jsp_taghandler_64.setReadonly(true);
                          __jsp_taghandler_64.setSize("1");
                          __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_64,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_64.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[71]);
                        /*@lineinfo:translated-code*//*@lineinfo:281^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_65=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_65.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_65.setKey("parametros.gestion");
                          __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_65.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[72]);
                        /*@lineinfo:translated-code*//*@lineinfo:282^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_66=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_66.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_66.setMaxlength("4");
                          __jsp_taghandler_66.setName("ParametrosForm");
                          __jsp_taghandler_66.setProperty("cte_gestion");
                          __jsp_taghandler_66.setReadonly(true);
                          __jsp_taghandler_66.setSize("4");
                          __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_66,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_66.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[73]);
                        /*@lineinfo:translated-code*//*@lineinfo:285^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_67=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_67.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_67.setKey("parametros.codrubaccesorios");
                          __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_67.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[74]);
                        /*@lineinfo:translated-code*//*@lineinfo:286^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_68=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_68.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_68.setMaxlength("4");
                          __jsp_taghandler_68.setName("ParametrosForm");
                          __jsp_taghandler_68.setProperty("cte_codrubaccesorios");
                          __jsp_taghandler_68.setReadonly(true);
                          __jsp_taghandler_68.setSize("4");
                          __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_68,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_68.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[75]);
                        /*@lineinfo:translated-code*//*@lineinfo:289^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_69=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_69.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_69.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_69.setProperty("boton");
                          __jsp_taghandler_69.setStyleClass("boton1");
                          __jsp_taghandler_69.setValue("Eliminar");
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
                        /*@lineinfo:translated-code*//*@lineinfo:290^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_70=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_70.setParent(__jsp_taghandler_40);
                          __jsp_taghandler_70.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_70.setProperty("boton");
                          __jsp_taghandler_70.setStyleClass("boton1");
                          __jsp_taghandler_70.setValue("Cancelar");
                          __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_70,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_70.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[77]);
                      /*@lineinfo:translated-code*//*@lineinfo:290^140*/                      } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[78]);
                /*@lineinfo:translated-code*//*@lineinfo:292^18*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[79]);
            /*@lineinfo:translated-code*//*@lineinfo:297^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_71=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_71.setParent(__jsp_taghandler_1);
              __jsp_taghandler_71.setKey("parametros.codinstitucion");
              __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_71.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[80]);
            /*@lineinfo:translated-code*//*@lineinfo:298^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_72=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_72.setParent(__jsp_taghandler_1);
              __jsp_taghandler_72.setKey("parametros.codrub1");
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
            out.write(__jsp_StaticText.text[81]);
            /*@lineinfo:translated-code*//*@lineinfo:299^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_73=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_73.setParent(__jsp_taghandler_1);
              __jsp_taghandler_73.setKey("parametros.codrub2");
              __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_73.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[82]);
            /*@lineinfo:translated-code*//*@lineinfo:300^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_74=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_74.setParent(__jsp_taghandler_1);
              __jsp_taghandler_74.setKey("parametros.codrub3");
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
            out.write(__jsp_StaticText.text[83]);
            /*@lineinfo:translated-code*//*@lineinfo:301^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_75=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_75.setParent(__jsp_taghandler_1);
              __jsp_taghandler_75.setKey("parametros.codrub4");
              __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_75.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[84]);
            /*@lineinfo:translated-code*//*@lineinfo:302^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_76=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_76.setParent(__jsp_taghandler_1);
              __jsp_taghandler_76.setKey("parametros.codrub5");
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
            out.write(__jsp_StaticText.text[85]);
            /*@lineinfo:translated-code*//*@lineinfo:303^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_77=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_77.setParent(__jsp_taghandler_1);
              __jsp_taghandler_77.setKey("parametros.codrub6");
              __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_77.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[86]);
            /*@lineinfo:translated-code*//*@lineinfo:304^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_78=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_78.setParent(__jsp_taghandler_1);
              __jsp_taghandler_78.setKey("parametros.tipdocentrega");
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
            out.write(__jsp_StaticText.text[87]);
            /*@lineinfo:translated-code*//*@lineinfo:305^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_79=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_79.setParent(__jsp_taghandler_1);
              __jsp_taghandler_79.setKey("parametros.tipdocdevolucion");
              __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_79.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[88]);
            /*@lineinfo:translated-code*//*@lineinfo:306^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_80=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_80.setParent(__jsp_taghandler_1);
              __jsp_taghandler_80.setKey("parametros.tipdoctransferencia");
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
            out.write(__jsp_StaticText.text[89]);
            /*@lineinfo:translated-code*//*@lineinfo:307^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_81=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_81.setParent(__jsp_taghandler_1);
              __jsp_taghandler_81.setKey("parametros.tipdocbaja");
              __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_81.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[90]);
            /*@lineinfo:translated-code*//*@lineinfo:308^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_82=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_82.setParent(__jsp_taghandler_1);
              __jsp_taghandler_82.setKey("parametros.tipdoctraregionales");
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
            out.write(__jsp_StaticText.text[91]);
            /*@lineinfo:translated-code*//*@lineinfo:309^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_83=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_83.setParent(__jsp_taghandler_1);
              __jsp_taghandler_83.setKey("parametros.gestion");
              __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_83.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[92]);
            /*@lineinfo:translated-code*//*@lineinfo:310^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_84=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_84.setParent(__jsp_taghandler_1);
              __jsp_taghandler_84.setKey("parametros.codrubaccesorios");
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
            out.write(__jsp_StaticText.text[93]);
            /*@lineinfo:translated-code*//*@lineinfo:311^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_85=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_85.setParent(__jsp_taghandler_1);
              __jsp_taghandler_85.setName("ParametrosForm");
              __jsp_taghandler_85.setProperty("opcion");
              __jsp_taghandler_85.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[94]);
                /*@lineinfo:translated-code*//*@lineinfo:311^67*/                } while (__jsp_taghandler_85.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[95]);
            /*@lineinfo:translated-code*//*@lineinfo:314^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_86=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_86.setParent(__jsp_taghandler_1);
              __jsp_taghandler_86.setName("ParametrosForm");
              __jsp_taghandler_86.setProperty("opcion");
              __jsp_taghandler_86.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[96]);
                /*@lineinfo:translated-code*//*@lineinfo:314^67*/                } while (__jsp_taghandler_86.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[97]);
            /*@lineinfo:user-code*//*@lineinfo:318^2*/             int pnum=0;
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[98]);
            /*@lineinfo:translated-code*//*@lineinfo:319^1*/            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_87=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
              __jsp_taghandler_87.setParent(__jsp_taghandler_1);
              __jsp_taghandler_87.setId("lista");
              __jsp_taghandler_87.setName("ParametrosLista");
              java.lang.Object lista = null;
              __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_87,__jsp_tag_starteval,out);
                do {
                  lista = (java.lang.Object) pageContext.findAttribute("lista");
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[99]);
                  /*@lineinfo:user-code*//*@lineinfo:320^3*/                   if (pnum==1) {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[100]);
                  /*@lineinfo:user-code*//*@lineinfo:322^3*/                   } else { 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[101]);
                  /*@lineinfo:user-code*//*@lineinfo:324^3*/                   } 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[102]);
                  /*@lineinfo:translated-code*//*@lineinfo:325^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_88=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_88.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_88.setName("lista");
                    __jsp_taghandler_88.setProperty("codinstitucion");
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
                  out.write(__jsp_StaticText.text[103]);
                  /*@lineinfo:translated-code*//*@lineinfo:326^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_89=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_89.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_89.setName("lista");
                    __jsp_taghandler_89.setProperty("codrub1");
                    __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_89.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[104]);
                  /*@lineinfo:translated-code*//*@lineinfo:327^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_90=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_90.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_90.setName("lista");
                    __jsp_taghandler_90.setProperty("codrub2");
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
                  out.write(__jsp_StaticText.text[105]);
                  /*@lineinfo:translated-code*//*@lineinfo:328^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_91=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_91.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_91.setName("lista");
                    __jsp_taghandler_91.setProperty("codrub3");
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
                  out.write(__jsp_StaticText.text[106]);
                  /*@lineinfo:translated-code*//*@lineinfo:329^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_92=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_92.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_92.setName("lista");
                    __jsp_taghandler_92.setProperty("codrub4");
                    __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_92.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[107]);
                  /*@lineinfo:translated-code*//*@lineinfo:330^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_93=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_93.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_93.setName("lista");
                    __jsp_taghandler_93.setProperty("codrub5");
                    __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_93.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[108]);
                  /*@lineinfo:translated-code*//*@lineinfo:331^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_94=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_94.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_94.setName("lista");
                    __jsp_taghandler_94.setProperty("codrub6");
                    __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_94.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[109]);
                  /*@lineinfo:translated-code*//*@lineinfo:332^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_95=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_95.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_95.setName("lista");
                    __jsp_taghandler_95.setProperty("tipdocentrega");
                    __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_95.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[110]);
                  /*@lineinfo:translated-code*//*@lineinfo:333^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_96=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_96.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_96.setName("lista");
                    __jsp_taghandler_96.setProperty("tipdocdevolucion");
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
                  out.write(__jsp_StaticText.text[111]);
                  /*@lineinfo:translated-code*//*@lineinfo:334^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_97=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_97.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_97.setName("lista");
                    __jsp_taghandler_97.setProperty("tipdoctransferencia");
                    __jsp_tag_starteval=__jsp_taghandler_97.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_97.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_97.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_97);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[112]);
                  /*@lineinfo:translated-code*//*@lineinfo:335^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_98=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_98.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_98.setName("lista");
                    __jsp_taghandler_98.setProperty("tipdocbaja");
                    __jsp_tag_starteval=__jsp_taghandler_98.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_98.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_98.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_98);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[113]);
                  /*@lineinfo:translated-code*//*@lineinfo:336^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_99=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_99.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_99.setName("lista");
                    __jsp_taghandler_99.setProperty("tipdoctraregionales");
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
                  out.write(__jsp_StaticText.text[114]);
                  /*@lineinfo:translated-code*//*@lineinfo:337^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_100=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_100.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_100.setName("lista");
                    __jsp_taghandler_100.setProperty("gestion");
                    __jsp_tag_starteval=__jsp_taghandler_100.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_100.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_100.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_100);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[115]);
                  /*@lineinfo:translated-code*//*@lineinfo:338^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_101=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_101.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_101.setName("lista");
                    __jsp_taghandler_101.setProperty("codrubaccesorios");
                    __jsp_tag_starteval=__jsp_taghandler_101.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_101.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_101.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_101);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[116]);
                  /*@lineinfo:translated-code*//*@lineinfo:339^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_102=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_102.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_102.setName("ParametrosForm");
                    __jsp_taghandler_102.setProperty("opcion");
                    __jsp_taghandler_102.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_102.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[117]);
                        /*@lineinfo:translated-code*//*@lineinfo:341^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_103=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_103.setParent(__jsp_taghandler_102);
                          __jsp_taghandler_103.setIndexed(true);
                          __jsp_taghandler_103.setOnclick("operacion.value=1;opcion.value=3");
                          __jsp_taghandler_103.setProperty("boton");
                          __jsp_taghandler_103.setStyleClass("boton1");
                          __jsp_taghandler_103.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[118]);
                      /*@lineinfo:translated-code*//*@lineinfo:341^135*/                      } while (__jsp_taghandler_102.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_102.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_102);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[119]);
                  /*@lineinfo:translated-code*//*@lineinfo:344^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_104=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_104.setParent(__jsp_taghandler_87);
                    __jsp_taghandler_104.setName("ParametrosForm");
                    __jsp_taghandler_104.setProperty("opcion");
                    __jsp_taghandler_104.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_104.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[120]);
                        /*@lineinfo:translated-code*//*@lineinfo:346^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_105=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_105.setParent(__jsp_taghandler_104);
                          __jsp_taghandler_105.setIndexed(true);
                          __jsp_taghandler_105.setOnclick("operacion.value=1;opcion.value=2");
                          __jsp_taghandler_105.setProperty("boton");
                          __jsp_taghandler_105.setStyleClass("boton1");
                          __jsp_taghandler_105.setValue("Modificar");
                          __jsp_tag_starteval=__jsp_taghandler_105.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_105,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_105.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_105.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_105);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[121]);
                      /*@lineinfo:translated-code*//*@lineinfo:346^136*/                      } while (__jsp_taghandler_104.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_104.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_104);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[122]);
                  /*@lineinfo:user-code*//*@lineinfo:350^4*/                   if (pnum==0) pnum=1; else pnum=0; 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[123]);
                /*@lineinfo:translated-code*//*@lineinfo:350^43*/                } while (__jsp_taghandler_87.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[124]);
            /*@lineinfo:translated-code*//*@lineinfo:352^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_106=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_106.setParent(__jsp_taghandler_1);
              __jsp_taghandler_106.setName("ParametrosForm");
              __jsp_taghandler_106.setProperty("opcion");
              __jsp_taghandler_106.setValue("5");
              __jsp_tag_starteval=__jsp_taghandler_106.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[125]);
                  /*@lineinfo:translated-code*//*@lineinfo:360^11*/                  {
                    org.apache.struts.taglib.html.LinkTag __jsp_taghandler_107=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href styleClass");
                    __jsp_taghandler_107.setParent(__jsp_taghandler_106);
                    __jsp_taghandler_107.setHref("parametros.do");
                    __jsp_taghandler_107.setStyleClass("T8b");
                    __jsp_tag_starteval=__jsp_taghandler_107.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_107,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[126]);
                      /*@lineinfo:translated-code*//*@lineinfo:360^60*/                      } while (__jsp_taghandler_107.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_107.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_107);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[127]);
                /*@lineinfo:translated-code*//*@lineinfo:362^23*/                } while (__jsp_taghandler_106.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_106.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_106);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[128]);
          /*@lineinfo:translated-code*//*@lineinfo:370^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[129]);


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
    private static final char text[][]=new char[130][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  function validar(form)\n  {\n    mensaje=\"\"\n    foco=\"\"  \n    if (form.opcion.value!=9) {\n       try {\n          if (!textoObligatorio( form.cte_codinstitucion.value )) {\n\t   \t      mensaje=mensaje+\"Debe introducir Código Institución\\n\"\n\t\t        if (foco.length==0) foco=\"form.cte_codinstitucion.focus()\"\n          }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_codrub1.value)){\n            mensaje=mensaje+\"Debe introducir Código de Rubro 1\\n\"\n            if (foco.length==0) foco=\"form.cte_codrub1.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_codrub2.value)){\n            mensaje=mensaje+\"Debe introducir Código de Rubro 2\\n\"\n            if (foco.length==0) foco=\"form.cte_codrub2.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_codrub3.value)){\n            mensaje=mensaje+\"Debe introducir Código de Rubro 3\\n\"\n            if (foco.length==0) foco=\"form.cte_codrub3.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_codrub4.value)){\n            mensaje=mensaje+\"Debe introducir Código de Rubro 4\\n\"\n            if (foco.length==0) foco=\"form.cte_codrub4.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_codrub5.value)){\n            mensaje=mensaje+\"Debe introducir Código de Rubro 5\\n\"\n            if (foco.length==0) foco=\"form.cte_codrub5.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_codrub6.value)){\n            mensaje=mensaje+\"Debe introducir Código de Rubro 6\\n\"\n            if (foco.length==0) foco=\"form.cte_codrub6.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_tipdocentrega.value)){\n            mensaje=mensaje+\"Debe introducir Tipo de Documento de Entrega\\n\"\n            if (foco.length==0) foco=\"form.cte_tipdocentrega.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_tipdocdevolucion.value)){\n            mensaje=mensaje+\"Debe introducir Tipo de Documento de Devolución\\n\"\n            if (foco.length==0) foco=\"form.cte_tipdocdevolucion.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_tipdoctransferencia.value)){\n            mensaje=mensaje+\"Debe introducir Tipo de Documento de Transferencia\\n\"\n            if (foco.length==0) foco=\"form.cte_tipdoctransferencia.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_tipdoctraregionales.value)){\n            mensaje=mensaje+\"Debe introducir Tipo de Documento de Transferencia Entre Regionales\\n\"\n            if (foco.length==0) foco=\"form.cte_tipdoctraregionales.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_tipdocbaja.value)){\n            mensaje=mensaje+\"Debe introducir Tipo de Documento de Baja\\n\"\n            if (foco.length==0) foco=\"form.cte_tipdocbaja.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_gestion.value)){\n            mensaje=mensaje+\"Debe introducir Gestión Actas\\n\"\n            if (foco.length==0) foco=\"form.cte_gestion.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }\n       try {\n         if (!textoObligatorio(form.cte_codrubaccesorios.value)){\n            mensaje=mensaje+\"Debe introducir Gestión a Depreciar\\n\"\n            if (foco.length==0) foco=\"form.cte_codrubaccesorios.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }       \n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }       \n  }\n</script>\n<body>\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<caption>Parametros</caption>\n".toCharArray();
      text[8] = 
      "\n   ".toCharArray();
      text[9] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[10] = 
      "</td>\n          <td>".toCharArray();
      text[11] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[12] = 
      "</td>\n          <td>".toCharArray();
      text[13] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[14] = 
      "</td>\n          <td>".toCharArray();
      text[15] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[16] = 
      "</td>\n          <td>".toCharArray();
      text[17] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[18] = 
      "</td>\n          <td>".toCharArray();
      text[19] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[20] = 
      "</td>\n          <td>".toCharArray();
      text[21] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[22] = 
      "</td>\n          <td>".toCharArray();
      text[23] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[24] = 
      "</td>\n          <td>".toCharArray();
      text[25] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[26] = 
      "</td>\n          <td>".toCharArray();
      text[27] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[28] = 
      "</td>\n          <td>".toCharArray();
      text[29] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[30] = 
      "</td>\n          <td>".toCharArray();
      text[31] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[32] = 
      "</td>\n          <td>".toCharArray();
      text[33] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[34] = 
      "</td>\n          <td>".toCharArray();
      text[35] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[36] = 
      "</td>\n          <td>".toCharArray();
      text[37] = 
      "</td>\n      </tr>      \n   ".toCharArray();
      text[38] = 
      "\n   ".toCharArray();
      text[39] = 
      "\n      <tr>\n          <td align=\"right\">".toCharArray();
      text[40] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[41] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[42] = 
      "\n   ".toCharArray();
      text[43] = 
      "\n      <tr>\n          <td align=\"right\">".toCharArray();
      text[44] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[45] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[46] = 
      "\n   ".toCharArray();
      text[47] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[48] = 
      "</td>\n          <td>".toCharArray();
      text[49] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[50] = 
      "</td>\n          <td>".toCharArray();
      text[51] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[52] = 
      "</td>\n          <td>".toCharArray();
      text[53] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[54] = 
      "</td>\n          <td>".toCharArray();
      text[55] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[56] = 
      "</td>\n          <td>".toCharArray();
      text[57] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[58] = 
      "</td>\n          <td>".toCharArray();
      text[59] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[60] = 
      "</td>\n          <td>".toCharArray();
      text[61] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[62] = 
      "</td>\n          <td>".toCharArray();
      text[63] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[64] = 
      "</td>\n          <td>".toCharArray();
      text[65] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[66] = 
      "</td>\n          <td>".toCharArray();
      text[67] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[68] = 
      "</td>\n          <td>".toCharArray();
      text[69] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[70] = 
      "</td>\n          <td>".toCharArray();
      text[71] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[72] = 
      "</td>\n          <td>".toCharArray();
      text[73] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[74] = 
      "</td>\n          <td>".toCharArray();
      text[75] = 
      "</td>\n      </tr>      \n      <tr>\n          <td align=\"right\">".toCharArray();
      text[76] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[77] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[78] = 
      "\n".toCharArray();
      text[79] = 
      "\n</table>\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<tr class=\"FondoAzul\">\n   <td width=\"60\"  scope=\"col\" class=\"S10c\">".toCharArray();
      text[80] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[81] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[82] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[83] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[84] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[85] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[86] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[87] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[88] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[89] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[90] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[91] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[92] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[93] = 
      "</td>   \n   ".toCharArray();
      text[94] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[95] = 
      "\n   ".toCharArray();
      text[96] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[97] = 
      "\n </tr>\n ".toCharArray();
      text[98] = 
      "\n".toCharArray();
      text[99] = 
      "\n  ".toCharArray();
      text[100] = 
      "\n     <tr class=\"T8b\">\n  ".toCharArray();
      text[101] = 
      "\n     <tr class=\"T8a\">\n  ".toCharArray();
      text[102] = 
      "\n     <td>".toCharArray();
      text[103] = 
      "</td>\n     <td>".toCharArray();
      text[104] = 
      "</td>\n     <td>".toCharArray();
      text[105] = 
      "</td>\n     <td>".toCharArray();
      text[106] = 
      "</td>\n     <td>".toCharArray();
      text[107] = 
      "</td>\n     <td>".toCharArray();
      text[108] = 
      "</td>\n     <td>".toCharArray();
      text[109] = 
      "</td>\n     <td>".toCharArray();
      text[110] = 
      "</td>\n     <td>".toCharArray();
      text[111] = 
      "</td>\n     <td>".toCharArray();
      text[112] = 
      "</td>\n     <td>".toCharArray();
      text[113] = 
      "</td>\n     <td>".toCharArray();
      text[114] = 
      "</td>\n     <td>".toCharArray();
      text[115] = 
      "</td>\n     <td>".toCharArray();
      text[116] = 
      "</td>     \n     ".toCharArray();
      text[117] = 
      "\n     <td>\n        ".toCharArray();
      text[118] = 
      "\n     </td>\n     ".toCharArray();
      text[119] = 
      "\n     ".toCharArray();
      text[120] = 
      "\n     <td>\n        ".toCharArray();
      text[121] = 
      "\n     </td>\n     ".toCharArray();
      text[122] = 
      "\n   </tr>\n   ".toCharArray();
      text[123] = 
      "\n".toCharArray();
      text[124] = 
      "\n".toCharArray();
      text[125] = 
      "\n<tr>\n<td colspan=\"2\">\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n  <tr>\n    <td align=\"center\"> \n      <FONT color=\"#023264\" face=\"Arial, Helvetica, san-serif\" size=1> \n        <em> \n          ".toCharArray();
      text[126] = 
      "\n          © 2006  Aduana Nacional de Bolivia Todos los derechos reservados.\n          ".toCharArray();
      text[127] = 
      " \n        </em>\n      </FONT>\n    </td>\n  </tr>\n</table>\n</td>\n</tr>\n".toCharArray();
      text[128] = 
      "\n</table>\n".toCharArray();
      text[129] = 
      "\n</body>\n</html>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
