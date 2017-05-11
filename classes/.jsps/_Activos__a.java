  /*@lineinfo:filename=/Activos_a.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Activos__a extends oracle.jsp.runtime.HttpJsp {

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
    _Activos__a page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:18^10*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/activosAction");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:19^10*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:20^10*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:21^10*/            {
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
                  /*@lineinfo:translated-code*//*@lineinfo:22^13*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("ActivosForm");
                    __jsp_taghandler_5.setProperty("opcion");
                    __jsp_taghandler_5.setValue("4");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[9]);
                        /*@lineinfo:translated-code*//*@lineinfo:26^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setKey("activos.codrub");
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
                        /*@lineinfo:translated-code*//*@lineinfo:29^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_7.setMaxlength("10");
                          __jsp_taghandler_7.setName("ActivosForm");
                          __jsp_taghandler_7.setProperty("act_codrub");
                          __jsp_taghandler_7.setReadonly(true);
                          __jsp_taghandler_7.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:30^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_8=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_8.setMaxlength("60");
                          __jsp_taghandler_8.setName("ActivosForm");
                          __jsp_taghandler_8.setProperty("act_rubdescripcion");
                          __jsp_taghandler_8.setReadonly(true);
                          __jsp_taghandler_8.setSize("60");
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
                        /*@lineinfo:translated-code*//*@lineinfo:35^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_9=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_9.setKey("activos.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[13]);
                        /*@lineinfo:translated-code*//*@lineinfo:38^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_10=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_10.setMaxlength("10");
                          __jsp_taghandler_10.setName("ActivosForm");
                          __jsp_taghandler_10.setProperty("act_codreg");
                          __jsp_taghandler_10.setReadonly(true);
                          __jsp_taghandler_10.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:39^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_11=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_11.setMaxlength("60");
                          __jsp_taghandler_11.setName("ActivosForm");
                          __jsp_taghandler_11.setProperty("act_regdescripcion");
                          __jsp_taghandler_11.setReadonly(true);
                          __jsp_taghandler_11.setSize("60");
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
                        /*@lineinfo:translated-code*//*@lineinfo:44^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_12=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_12.setKey("activos.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:47^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_13=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_13.setMaxlength("5");
                          __jsp_taghandler_13.setName("ActivosForm");
                          __jsp_taghandler_13.setProperty("act_codigo");
                          __jsp_taghandler_13.setReadonly(true);
                          __jsp_taghandler_13.setSize("5");
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
                        /*@lineinfo:translated-code*//*@lineinfo:48^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_14=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_14.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_14.setMaxlength("10");
                          __jsp_taghandler_14.setName("ActivosForm");
                          __jsp_taghandler_14.setProperty("act_codbarra");
                          __jsp_taghandler_14.setReadonly(true);
                          __jsp_taghandler_14.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:53^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_15=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_15.setKey("activos.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[19]);
                        /*@lineinfo:translated-code*//*@lineinfo:56^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_16=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_16.setMaxlength("40");
                          __jsp_taghandler_16.setName("ActivosForm");
                          __jsp_taghandler_16.setProperty("act_grpdescripcion");
                          __jsp_taghandler_16.setReadonly(true);
                          __jsp_taghandler_16.setSize("40");
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
                        /*@lineinfo:translated-code*//*@lineinfo:57^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_17=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_17.setName("ActivosForm");
                          __jsp_taghandler_17.setProperty("act_codgrp");
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
                        /*@lineinfo:translated-code*//*@lineinfo:60^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_18.setKey("activos.codpar");
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
                        /*@lineinfo:translated-code*//*@lineinfo:63^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_19=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_19.setMaxlength("40");
                          __jsp_taghandler_19.setName("ActivosForm");
                          __jsp_taghandler_19.setProperty("act_pardescripcion");
                          __jsp_taghandler_19.setReadonly(true);
                          __jsp_taghandler_19.setSize("40");
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
                        /*@lineinfo:translated-code*//*@lineinfo:64^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_20=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_20.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_20.setName("ActivosForm");
                          __jsp_taghandler_20.setProperty("act_codpar");
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
                        /*@lineinfo:translated-code*//*@lineinfo:69^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_21=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_21.setKey("activos.codofi");
                          __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[25]);
                        /*@lineinfo:translated-code*//*@lineinfo:72^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_22=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_22.setMaxlength("40");
                          __jsp_taghandler_22.setName("ActivosForm");
                          __jsp_taghandler_22.setProperty("act_ofidescripcion");
                          __jsp_taghandler_22.setReadonly(true);
                          __jsp_taghandler_22.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_22,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[26]);
                        /*@lineinfo:translated-code*//*@lineinfo:73^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_23=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_23.setName("ActivosForm");
                          __jsp_taghandler_23.setProperty("act_codofi");
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
                        /*@lineinfo:translated-code*//*@lineinfo:76^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_24=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_24.setKey("activos.codfun");
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
                        /*@lineinfo:translated-code*//*@lineinfo:79^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_25=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_25.setMaxlength("40");
                          __jsp_taghandler_25.setName("ActivosForm");
                          __jsp_taghandler_25.setProperty("act_fundescripcion");
                          __jsp_taghandler_25.setReadonly(true);
                          __jsp_taghandler_25.setSize("40");
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
                        /*@lineinfo:translated-code*//*@lineinfo:80^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_26=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_26.setName("ActivosForm");
                          __jsp_taghandler_26.setProperty("act_codfun");
                          __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_26,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[30]);
                        /*@lineinfo:translated-code*//*@lineinfo:85^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_27=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_27.setKey("activos.codubi");
                          __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[31]);
                        /*@lineinfo:translated-code*//*@lineinfo:88^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_28=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_28.setMaxlength("40");
                          __jsp_taghandler_28.setName("ActivosForm");
                          __jsp_taghandler_28.setProperty("act_ubidescripcion");
                          __jsp_taghandler_28.setReadonly(true);
                          __jsp_taghandler_28.setSize("40");
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
                        /*@lineinfo:translated-code*//*@lineinfo:89^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_29=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_29.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_29.setName("ActivosForm");
                          __jsp_taghandler_29.setProperty("act_codubi");
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
                        /*@lineinfo:translated-code*//*@lineinfo:92^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_30=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_30.setKey("activos.codpry");
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
                        /*@lineinfo:translated-code*//*@lineinfo:95^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_31=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_31.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_31.setMaxlength("40");
                          __jsp_taghandler_31.setName("ActivosForm");
                          __jsp_taghandler_31.setProperty("act_prydescripcion");
                          __jsp_taghandler_31.setReadonly(true);
                          __jsp_taghandler_31.setSize("40");
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
                        /*@lineinfo:translated-code*//*@lineinfo:96^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_32=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_32.setName("ActivosForm");
                          __jsp_taghandler_32.setProperty("act_codpry");
                          __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_32,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:101^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_33=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_33.setKey("activos.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[37]);
                        /*@lineinfo:translated-code*//*@lineinfo:104^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_34=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_34.setMaxlength("40");
                          __jsp_taghandler_34.setName("ActivosForm");
                          __jsp_taghandler_34.setProperty("act_findescripcion");
                          __jsp_taghandler_34.setReadonly(true);
                          __jsp_taghandler_34.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_34,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[38]);
                        /*@lineinfo:translated-code*//*@lineinfo:105^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_35=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_35.setName("ActivosForm");
                          __jsp_taghandler_35.setProperty("act_codfin");
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
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:110^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_36=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_36.setKey("activos.feccompra");
                          __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[40]);
                        /*@lineinfo:translated-code*//*@lineinfo:113^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_37=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_37.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_37.setMaxlength("10");
                          __jsp_taghandler_37.setName("ActivosForm");
                          __jsp_taghandler_37.setProperty("act_feccompra");
                          __jsp_taghandler_37.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_37,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[41]);
                        /*@lineinfo:translated-code*//*@lineinfo:116^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_38=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_38.setKey("activos.tipcam");
                          __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[42]);
                        /*@lineinfo:translated-code*//*@lineinfo:119^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_39=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_39.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_39.setMaxlength("11");
                          __jsp_taghandler_39.setName("ActivosForm");
                          __jsp_taghandler_39.setProperty("act_tipcam");
                          __jsp_taghandler_39.setSize("11");
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
                        out.write(__jsp_StaticText.text[43]);
                        /*@lineinfo:translated-code*//*@lineinfo:124^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_40=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_40.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_40.setKey("activos.tipufv");
                          __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[44]);
                        /*@lineinfo:translated-code*//*@lineinfo:127^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_41=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_41.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_41.setMaxlength("11");
                          __jsp_taghandler_41.setName("ActivosForm");
                          __jsp_taghandler_41.setProperty("act_tipufv");
                          __jsp_taghandler_41.setSize("11");
                          __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_41,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_41.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[45]);
                        /*@lineinfo:translated-code*//*@lineinfo:130^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_42=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_42.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_42.setKey("activos.umanejo");
                          __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[46]);
                        /*@lineinfo:translated-code*//*@lineinfo:133^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_43=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_43.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_43.setMaxlength("20");
                          __jsp_taghandler_43.setName("ActivosForm");
                          __jsp_taghandler_43.setProperty("act_umanejo");
                          __jsp_taghandler_43.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_43,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[47]);
                        /*@lineinfo:translated-code*//*@lineinfo:140^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_44=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_44.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_44.setKey("activos.descripcion");
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
                        out.write(__jsp_StaticText.text[48]);
                        /*@lineinfo:translated-code*//*@lineinfo:143^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_45=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_45.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_45.setMaxlength("120");
                          __jsp_taghandler_45.setName("ActivosForm");
                          __jsp_taghandler_45.setProperty("act_descripcion");
                          __jsp_taghandler_45.setReadonly(true);
                          __jsp_taghandler_45.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_45,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[49]);
                        /*@lineinfo:translated-code*//*@lineinfo:148^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_46=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_46.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_46.setKey("activos.desadicional");
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
                        out.write(__jsp_StaticText.text[50]);
                        /*@lineinfo:translated-code*//*@lineinfo:151^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_47=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_47.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_47.setMaxlength("240");
                          __jsp_taghandler_47.setName("ActivosForm");
                          __jsp_taghandler_47.setProperty("act_desadicional");
                          __jsp_taghandler_47.setReadonly(true);
                          __jsp_taghandler_47.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_47,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[51]);
                        /*@lineinfo:translated-code*//*@lineinfo:158^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_48=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_48.setKey("activos.proveedor");
                          __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[52]);
                        /*@lineinfo:translated-code*//*@lineinfo:161^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_49=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_49.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_49.setMaxlength("50");
                          __jsp_taghandler_49.setName("ActivosForm");
                          __jsp_taghandler_49.setProperty("act_proveedor");
                          __jsp_taghandler_49.setReadonly(true);
                          __jsp_taghandler_49.setSize("50");
                          __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_49,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[53]);
                        /*@lineinfo:translated-code*//*@lineinfo:164^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_50=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_50.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_50.setKey("activos.marca");
                          __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[54]);
                        /*@lineinfo:translated-code*//*@lineinfo:167^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_51=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_51.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_51.setMaxlength("30");
                          __jsp_taghandler_51.setName("ActivosForm");
                          __jsp_taghandler_51.setProperty("act_marca");
                          __jsp_taghandler_51.setReadonly(true);
                          __jsp_taghandler_51.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_51,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[55]);
                        /*@lineinfo:translated-code*//*@lineinfo:172^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_52=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_52.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_52.setKey("activos.modelo");
                          __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_52.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[56]);
                        /*@lineinfo:translated-code*//*@lineinfo:175^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_53=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_53.setMaxlength("30");
                          __jsp_taghandler_53.setName("ActivosForm");
                          __jsp_taghandler_53.setProperty("act_modelo");
                          __jsp_taghandler_53.setReadonly(true);
                          __jsp_taghandler_53.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_53,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[57]);
                        /*@lineinfo:translated-code*//*@lineinfo:178^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_54=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_54.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_54.setKey("activos.serie1");
                          __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[58]);
                        /*@lineinfo:translated-code*//*@lineinfo:181^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_55=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_55.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_55.setMaxlength("30");
                          __jsp_taghandler_55.setName("ActivosForm");
                          __jsp_taghandler_55.setProperty("act_serie1");
                          __jsp_taghandler_55.setReadonly(true);
                          __jsp_taghandler_55.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_55,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[59]);
                        /*@lineinfo:translated-code*//*@lineinfo:186^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_56=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_56.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_56.setKey("activos.serie2");
                          __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[60]);
                        /*@lineinfo:translated-code*//*@lineinfo:189^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_57=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_57.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_57.setMaxlength("30");
                          __jsp_taghandler_57.setName("ActivosForm");
                          __jsp_taghandler_57.setProperty("act_serie2");
                          __jsp_taghandler_57.setReadonly(true);
                          __jsp_taghandler_57.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_57,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[61]);
                        /*@lineinfo:translated-code*//*@lineinfo:192^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_58=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_58.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_58.setKey("activos.docreferencia");
                          __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[62]);
                        /*@lineinfo:translated-code*//*@lineinfo:195^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_59=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_59.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_59.setMaxlength("30");
                          __jsp_taghandler_59.setName("ActivosForm");
                          __jsp_taghandler_59.setProperty("act_docreferencia");
                          __jsp_taghandler_59.setReadonly(true);
                          __jsp_taghandler_59.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_59,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_59.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[63]);
                        /*@lineinfo:translated-code*//*@lineinfo:200^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_60=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_60.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_60.setKey("activos.valcobol");
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
                        out.write(__jsp_StaticText.text[64]);
                        /*@lineinfo:translated-code*//*@lineinfo:203^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_61=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_61.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_61.setMaxlength("15");
                          __jsp_taghandler_61.setName("ActivosForm");
                          __jsp_taghandler_61.setProperty("act_valcobol");
                          __jsp_taghandler_61.setReadonly(true);
                          __jsp_taghandler_61.setSize("15");
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
                        out.write(__jsp_StaticText.text[65]);
                        /*@lineinfo:translated-code*//*@lineinfo:206^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_62=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_62.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_62.setKey("activos.ordencompra");
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
                        out.write(__jsp_StaticText.text[66]);
                        /*@lineinfo:translated-code*//*@lineinfo:209^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_63=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_63.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_63.setMaxlength("20");
                          __jsp_taghandler_63.setName("ActivosForm");
                          __jsp_taghandler_63.setProperty("act_ordencompra");
                          __jsp_taghandler_63.setReadonly(true);
                          __jsp_taghandler_63.setSize("20");
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
                        out.write(__jsp_StaticText.text[67]);
                        /*@lineinfo:translated-code*//*@lineinfo:214^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_64=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_64.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_64.setKey("activos.numfactura");
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
                        out.write(__jsp_StaticText.text[68]);
                        /*@lineinfo:translated-code*//*@lineinfo:217^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_65=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_65.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_65.setMaxlength("8");
                          __jsp_taghandler_65.setName("ActivosForm");
                          __jsp_taghandler_65.setProperty("act_numfactura");
                          __jsp_taghandler_65.setReadonly(true);
                          __jsp_taghandler_65.setSize("8");
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
                        out.write(__jsp_StaticText.text[69]);
                        /*@lineinfo:translated-code*//*@lineinfo:220^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_66=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_66.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_66.setKey("activos.numcomprobante");
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
                        out.write(__jsp_StaticText.text[70]);
                        /*@lineinfo:translated-code*//*@lineinfo:223^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_67=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_67.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_67.setMaxlength("20");
                          __jsp_taghandler_67.setName("ActivosForm");
                          __jsp_taghandler_67.setProperty("act_numcomprobante");
                          __jsp_taghandler_67.setReadonly(true);
                          __jsp_taghandler_67.setSize("20");
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
                        out.write(__jsp_StaticText.text[71]);
                        /*@lineinfo:translated-code*//*@lineinfo:228^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_68=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_68.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_68.setKey("activos.codanterior");
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
                        out.write(__jsp_StaticText.text[72]);
                        /*@lineinfo:translated-code*//*@lineinfo:231^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_69=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_69.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_69.setMaxlength("20");
                          __jsp_taghandler_69.setName("ActivosForm");
                          __jsp_taghandler_69.setProperty("act_codanterior");
                          __jsp_taghandler_69.setReadonly(true);
                          __jsp_taghandler_69.setSize("20");
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
                        out.write(__jsp_StaticText.text[73]);
                        /*@lineinfo:translated-code*//*@lineinfo:234^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_70=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_70.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_70.setKey("activos.fecha");
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
                        out.write(__jsp_StaticText.text[74]);
                        /*@lineinfo:translated-code*//*@lineinfo:237^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_71=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_71.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_71.setMaxlength("10");
                          __jsp_taghandler_71.setName("ActivosForm");
                          __jsp_taghandler_71.setProperty("rev_fecha");
                          __jsp_taghandler_71.setReadonly(true);
                          __jsp_taghandler_71.setSize("10");
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
                        out.write(__jsp_StaticText.text[75]);
                        /*@lineinfo:translated-code*//*@lineinfo:242^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_72=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_72.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_72.setKey("activos.vidaut");
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
                        out.write(__jsp_StaticText.text[76]);
                        /*@lineinfo:translated-code*//*@lineinfo:245^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_73=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_73.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_73.setMaxlength("4");
                          __jsp_taghandler_73.setName("ActivosForm");
                          __jsp_taghandler_73.setProperty("rev_vidaut");
                          __jsp_taghandler_73.setReadonly(true);
                          __jsp_taghandler_73.setSize("4");
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
                        out.write(__jsp_StaticText.text[77]);
                        /*@lineinfo:translated-code*//*@lineinfo:248^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_74=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_74.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_74.setKey("activos.estadoactivo");
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
                        out.write(__jsp_StaticText.text[78]);
                        /*@lineinfo:translated-code*//*@lineinfo:251^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_75=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag name property readonly size");
                          __jsp_taghandler_75.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_75.setName("ActivosForm");
                          __jsp_taghandler_75.setProperty("rev_estadoactivo");
                          __jsp_taghandler_75.setReadonly(true);
                          __jsp_taghandler_75.setSize("10");
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
                        out.write(__jsp_StaticText.text[79]);
                        /*@lineinfo:translated-code*//*@lineinfo:256^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_76=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_76.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_76.setKey("activos.desestado");
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
                        out.write(__jsp_StaticText.text[80]);
                        /*@lineinfo:translated-code*//*@lineinfo:259^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_77=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_77.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_77.setMaxlength("60");
                          __jsp_taghandler_77.setName("ActivosForm");
                          __jsp_taghandler_77.setProperty("rev_desestado");
                          __jsp_taghandler_77.setReadonly(true);
                          __jsp_taghandler_77.setSize("60");
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
                        out.write(__jsp_StaticText.text[81]);
                        /*@lineinfo:translated-code*//*@lineinfo:264^21*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_78=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_78.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_78.setOnclick("operacion.value=2;opcion.value=4");
                          __jsp_taghandler_78.setProperty("boton");
                          __jsp_taghandler_78.setStyleClass("boton1");
                          __jsp_taghandler_78.setValue("Consultar");
                          __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_78,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_78.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[82]);
                      /*@lineinfo:translated-code*//*@lineinfo:264^134*/                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[83]);
                  /*@lineinfo:translated-code*//*@lineinfo:270^13*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_79=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_79.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_79.setName("ActivosForm");
                    __jsp_taghandler_79.setProperty("opcion");
                    __jsp_taghandler_79.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[84]);
                        /*@lineinfo:translated-code*//*@lineinfo:274^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_80=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_80.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_80.setKey("activos.codrub");
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
                        out.write(__jsp_StaticText.text[85]);
                        /*@lineinfo:translated-code*//*@lineinfo:277^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_81=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_81.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_81.setMaxlength("10");
                          __jsp_taghandler_81.setName("ActivosForm");
                          __jsp_taghandler_81.setProperty("act_codrub");
                          __jsp_taghandler_81.setReadonly(true);
                          __jsp_taghandler_81.setSize("10");
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
                        out.write(__jsp_StaticText.text[86]);
                        /*@lineinfo:translated-code*//*@lineinfo:278^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_82=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_82.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_82.setMaxlength("60");
                          __jsp_taghandler_82.setName("ActivosForm");
                          __jsp_taghandler_82.setProperty("act_rubdescripcion");
                          __jsp_taghandler_82.setReadonly(true);
                          __jsp_taghandler_82.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_82,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_82.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[87]);
                        /*@lineinfo:translated-code*//*@lineinfo:283^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_83=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_83.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_83.setKey("activos.codreg");
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
                        out.write(__jsp_StaticText.text[88]);
                        /*@lineinfo:translated-code*//*@lineinfo:286^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_84=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_84.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_84.setMaxlength("10");
                          __jsp_taghandler_84.setName("ActivosForm");
                          __jsp_taghandler_84.setProperty("act_codreg");
                          __jsp_taghandler_84.setReadonly(true);
                          __jsp_taghandler_84.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_84,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_84.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[89]);
                        /*@lineinfo:translated-code*//*@lineinfo:287^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_85=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_85.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_85.setMaxlength("60");
                          __jsp_taghandler_85.setName("ActivosForm");
                          __jsp_taghandler_85.setProperty("act_regdescripcion");
                          __jsp_taghandler_85.setReadonly(true);
                          __jsp_taghandler_85.setSize("60");
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
                        out.write(__jsp_StaticText.text[90]);
                        /*@lineinfo:translated-code*//*@lineinfo:292^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_86=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_86.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_86.setKey("activos.codigo");
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
                        out.write(__jsp_StaticText.text[91]);
                        /*@lineinfo:translated-code*//*@lineinfo:295^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_87=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_87.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_87.setMaxlength("5");
                          __jsp_taghandler_87.setName("ActivosForm");
                          __jsp_taghandler_87.setProperty("act_codigo");
                          __jsp_taghandler_87.setReadonly(true);
                          __jsp_taghandler_87.setSize("5");
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
                        out.write(__jsp_StaticText.text[92]);
                        /*@lineinfo:translated-code*//*@lineinfo:296^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_88=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_88.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_88.setMaxlength("10");
                          __jsp_taghandler_88.setName("ActivosForm");
                          __jsp_taghandler_88.setProperty("act_codbarra");
                          __jsp_taghandler_88.setReadonly(true);
                          __jsp_taghandler_88.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_88,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_88.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[93]);
                        /*@lineinfo:translated-code*//*@lineinfo:301^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_89=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_89.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_89.setKey("activos.codgrp");
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
                        out.write(__jsp_StaticText.text[94]);
                        /*@lineinfo:translated-code*//*@lineinfo:304^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_90=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_90.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_90.setMaxlength("40");
                          __jsp_taghandler_90.setName("ActivosForm");
                          __jsp_taghandler_90.setProperty("act_grpdescripcion");
                          __jsp_taghandler_90.setReadonly(true);
                          __jsp_taghandler_90.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_90,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_90.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[95]);
                        /*@lineinfo:translated-code*//*@lineinfo:305^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_91=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_91.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_91.setName("ActivosForm");
                          __jsp_taghandler_91.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_91,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_91.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[96]);
                        /*@lineinfo:translated-code*//*@lineinfo:308^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_92=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_92.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_92.setKey("activos.codpar");
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
                        out.write(__jsp_StaticText.text[97]);
                        /*@lineinfo:translated-code*//*@lineinfo:311^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_93=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_93.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_93.setMaxlength("40");
                          __jsp_taghandler_93.setName("ActivosForm");
                          __jsp_taghandler_93.setProperty("act_pardescripcion");
                          __jsp_taghandler_93.setReadonly(true);
                          __jsp_taghandler_93.setSize("40");
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
                        out.write(__jsp_StaticText.text[98]);
                        /*@lineinfo:translated-code*//*@lineinfo:312^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_94=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_94.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_94.setName("ActivosForm");
                          __jsp_taghandler_94.setProperty("act_codpar");
                          __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_94,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_94.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[99]);
                        /*@lineinfo:translated-code*//*@lineinfo:317^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_95=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_95.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_95.setKey("activos.codofi");
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
                        out.write(__jsp_StaticText.text[100]);
                        /*@lineinfo:translated-code*//*@lineinfo:320^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_96=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_96.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_96.setMaxlength("40");
                          __jsp_taghandler_96.setName("ActivosForm");
                          __jsp_taghandler_96.setProperty("act_ofidescripcion");
                          __jsp_taghandler_96.setReadonly(true);
                          __jsp_taghandler_96.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_96.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_96,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_96.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_96.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_96);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[101]);
                        /*@lineinfo:translated-code*//*@lineinfo:321^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_97=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_97.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_97.setName("ActivosForm");
                          __jsp_taghandler_97.setProperty("act_codofi");
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
                        out.write(__jsp_StaticText.text[102]);
                        /*@lineinfo:translated-code*//*@lineinfo:324^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_98=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_98.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_98.setKey("activos.codfun");
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
                        out.write(__jsp_StaticText.text[103]);
                        /*@lineinfo:translated-code*//*@lineinfo:327^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_99=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_99.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_99.setMaxlength("40");
                          __jsp_taghandler_99.setName("ActivosForm");
                          __jsp_taghandler_99.setProperty("act_fundescripcion");
                          __jsp_taghandler_99.setReadonly(true);
                          __jsp_taghandler_99.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_99.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_99,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_99.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_99.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_99);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[104]);
                        /*@lineinfo:translated-code*//*@lineinfo:328^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_100=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_100.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_100.setName("ActivosForm");
                          __jsp_taghandler_100.setProperty("act_codfun");
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
                        out.write(__jsp_StaticText.text[105]);
                        /*@lineinfo:translated-code*//*@lineinfo:333^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_101=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_101.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_101.setKey("activos.codubi");
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
                        out.write(__jsp_StaticText.text[106]);
                        /*@lineinfo:translated-code*//*@lineinfo:336^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_102=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_102.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_102.setMaxlength("40");
                          __jsp_taghandler_102.setName("ActivosForm");
                          __jsp_taghandler_102.setProperty("act_ubidescripcion");
                          __jsp_taghandler_102.setReadonly(true);
                          __jsp_taghandler_102.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_102.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_102,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_102.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_102.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_102);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[107]);
                        /*@lineinfo:translated-code*//*@lineinfo:337^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_103=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_103.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_103.setName("ActivosForm");
                          __jsp_taghandler_103.setProperty("act_codubi");
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
                        out.write(__jsp_StaticText.text[108]);
                        /*@lineinfo:translated-code*//*@lineinfo:340^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_104=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_104.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_104.setKey("activos.codpry");
                          __jsp_tag_starteval=__jsp_taghandler_104.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_104.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_104.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_104);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[109]);
                        /*@lineinfo:translated-code*//*@lineinfo:343^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_105=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_105.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_105.setMaxlength("40");
                          __jsp_taghandler_105.setName("ActivosForm");
                          __jsp_taghandler_105.setProperty("act_prydescripcion");
                          __jsp_taghandler_105.setReadonly(true);
                          __jsp_taghandler_105.setSize("40");
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
                        out.write(__jsp_StaticText.text[110]);
                        /*@lineinfo:translated-code*//*@lineinfo:344^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_106=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_106.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_106.setName("ActivosForm");
                          __jsp_taghandler_106.setProperty("act_codpry");
                          __jsp_tag_starteval=__jsp_taghandler_106.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_106,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_106.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_106.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_106);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[111]);
                        /*@lineinfo:translated-code*//*@lineinfo:349^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_107=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_107.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_107.setKey("activos.codfin");
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
                        out.write(__jsp_StaticText.text[112]);
                        /*@lineinfo:translated-code*//*@lineinfo:352^25*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_108=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_108.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_108.setMaxlength("40");
                          __jsp_taghandler_108.setName("ActivosForm");
                          __jsp_taghandler_108.setProperty("act_findescripcion");
                          __jsp_taghandler_108.setReadonly(true);
                          __jsp_taghandler_108.setSize("40");
                          __jsp_tag_starteval=__jsp_taghandler_108.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_108,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_108.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_108.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_108);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[113]);
                        /*@lineinfo:translated-code*//*@lineinfo:353^25*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_109=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_109.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_109.setName("ActivosForm");
                          __jsp_taghandler_109.setProperty("act_codfin");
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
                        out.write(__jsp_StaticText.text[114]);
                        /*@lineinfo:translated-code*//*@lineinfo:358^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_110=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_110.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_110.setKey("activos.feccompra");
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
                        out.write(__jsp_StaticText.text[115]);
                        /*@lineinfo:translated-code*//*@lineinfo:361^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_111=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_111.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_111.setMaxlength("10");
                          __jsp_taghandler_111.setName("ActivosForm");
                          __jsp_taghandler_111.setProperty("act_feccompra");
                          __jsp_taghandler_111.setSize("10");
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
                        out.write(__jsp_StaticText.text[116]);
                        /*@lineinfo:translated-code*//*@lineinfo:364^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_112=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_112.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_112.setKey("activos.tipcam");
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
                        out.write(__jsp_StaticText.text[117]);
                        /*@lineinfo:translated-code*//*@lineinfo:367^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_113=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_113.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_113.setMaxlength("11");
                          __jsp_taghandler_113.setName("ActivosForm");
                          __jsp_taghandler_113.setProperty("act_tipcam");
                          __jsp_taghandler_113.setSize("11");
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
                        out.write(__jsp_StaticText.text[118]);
                        /*@lineinfo:translated-code*//*@lineinfo:372^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_114=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_114.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_114.setKey("activos.tipufv");
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
                        out.write(__jsp_StaticText.text[119]);
                        /*@lineinfo:translated-code*//*@lineinfo:375^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_115=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_115.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_115.setMaxlength("11");
                          __jsp_taghandler_115.setName("ActivosForm");
                          __jsp_taghandler_115.setProperty("act_tipufv");
                          __jsp_taghandler_115.setSize("11");
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
                        out.write(__jsp_StaticText.text[120]);
                        /*@lineinfo:translated-code*//*@lineinfo:378^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_116=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_116.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_116.setKey("activos.umanejo");
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
                        out.write(__jsp_StaticText.text[121]);
                        /*@lineinfo:translated-code*//*@lineinfo:381^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_117=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_117.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_117.setMaxlength("20");
                          __jsp_taghandler_117.setName("ActivosForm");
                          __jsp_taghandler_117.setProperty("act_umanejo");
                          __jsp_taghandler_117.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_117.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_117,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_117.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_117.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_117);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[122]);
                        /*@lineinfo:translated-code*//*@lineinfo:388^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_118=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_118.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_118.setKey("activos.descripcion");
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
                        out.write(__jsp_StaticText.text[123]);
                        /*@lineinfo:translated-code*//*@lineinfo:391^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_119=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_119.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_119.setMaxlength("120");
                          __jsp_taghandler_119.setName("ActivosForm");
                          __jsp_taghandler_119.setProperty("act_descripcion");
                          __jsp_taghandler_119.setReadonly(true);
                          __jsp_taghandler_119.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_119.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_119,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_119.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_119.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_119);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[124]);
                        /*@lineinfo:translated-code*//*@lineinfo:396^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_120=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_120.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_120.setKey("activos.desadicional");
                          __jsp_tag_starteval=__jsp_taghandler_120.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_120.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_120.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_120);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[125]);
                        /*@lineinfo:translated-code*//*@lineinfo:399^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_121=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_121.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_121.setMaxlength("240");
                          __jsp_taghandler_121.setName("ActivosForm");
                          __jsp_taghandler_121.setProperty("act_desadicional");
                          __jsp_taghandler_121.setReadonly(true);
                          __jsp_taghandler_121.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_121.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_121,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_121.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_121.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_121);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[126]);
                        /*@lineinfo:translated-code*//*@lineinfo:406^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_122=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_122.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_122.setKey("activos.proveedor");
                          __jsp_tag_starteval=__jsp_taghandler_122.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_122.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_122.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_122);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[127]);
                        /*@lineinfo:translated-code*//*@lineinfo:409^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_123=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_123.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_123.setMaxlength("50");
                          __jsp_taghandler_123.setName("ActivosForm");
                          __jsp_taghandler_123.setProperty("act_proveedor");
                          __jsp_taghandler_123.setReadonly(true);
                          __jsp_taghandler_123.setSize("50");
                          __jsp_tag_starteval=__jsp_taghandler_123.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_123,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_123.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_123.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_123);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[128]);
                        /*@lineinfo:translated-code*//*@lineinfo:412^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_124=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_124.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_124.setKey("activos.marca");
                          __jsp_tag_starteval=__jsp_taghandler_124.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_124.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_124.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_124);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[129]);
                        /*@lineinfo:translated-code*//*@lineinfo:415^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_125=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_125.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_125.setMaxlength("30");
                          __jsp_taghandler_125.setName("ActivosForm");
                          __jsp_taghandler_125.setProperty("act_marca");
                          __jsp_taghandler_125.setReadonly(true);
                          __jsp_taghandler_125.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_125.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_125,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_125.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_125.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_125);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[130]);
                        /*@lineinfo:translated-code*//*@lineinfo:420^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_126=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_126.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_126.setKey("activos.modelo");
                          __jsp_tag_starteval=__jsp_taghandler_126.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_126.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_126.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_126);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[131]);
                        /*@lineinfo:translated-code*//*@lineinfo:423^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_127=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_127.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_127.setMaxlength("30");
                          __jsp_taghandler_127.setName("ActivosForm");
                          __jsp_taghandler_127.setProperty("act_modelo");
                          __jsp_taghandler_127.setReadonly(true);
                          __jsp_taghandler_127.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_127.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_127,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_127.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_127.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_127);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[132]);
                        /*@lineinfo:translated-code*//*@lineinfo:426^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_128=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_128.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_128.setKey("activos.serie1");
                          __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_128.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[133]);
                        /*@lineinfo:translated-code*//*@lineinfo:429^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_129=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_129.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_129.setMaxlength("30");
                          __jsp_taghandler_129.setName("ActivosForm");
                          __jsp_taghandler_129.setProperty("act_serie1");
                          __jsp_taghandler_129.setReadonly(true);
                          __jsp_taghandler_129.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_129.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_129,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_129.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_129.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_129);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[134]);
                        /*@lineinfo:translated-code*//*@lineinfo:434^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_130=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_130.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_130.setKey("activos.serie2");
                          __jsp_tag_starteval=__jsp_taghandler_130.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_130.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_130.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_130);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[135]);
                        /*@lineinfo:translated-code*//*@lineinfo:437^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_131=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_131.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_131.setMaxlength("30");
                          __jsp_taghandler_131.setName("ActivosForm");
                          __jsp_taghandler_131.setProperty("act_serie2");
                          __jsp_taghandler_131.setReadonly(true);
                          __jsp_taghandler_131.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_131.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_131,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_131.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_131.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_131);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[136]);
                        /*@lineinfo:translated-code*//*@lineinfo:440^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_132=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_132.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_132.setKey("activos.docreferencia");
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
                        out.write(__jsp_StaticText.text[137]);
                        /*@lineinfo:translated-code*//*@lineinfo:443^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_133=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_133.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_133.setMaxlength("30");
                          __jsp_taghandler_133.setName("ActivosForm");
                          __jsp_taghandler_133.setProperty("act_docreferencia");
                          __jsp_taghandler_133.setReadonly(true);
                          __jsp_taghandler_133.setSize("30");
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
                        out.write(__jsp_StaticText.text[138]);
                        /*@lineinfo:translated-code*//*@lineinfo:448^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_134=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_134.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_134.setKey("activos.valcobol");
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
                        out.write(__jsp_StaticText.text[139]);
                        /*@lineinfo:translated-code*//*@lineinfo:451^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_135=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_135.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_135.setMaxlength("15");
                          __jsp_taghandler_135.setName("ActivosForm");
                          __jsp_taghandler_135.setProperty("act_valcobol");
                          __jsp_taghandler_135.setReadonly(true);
                          __jsp_taghandler_135.setSize("15");
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
                        out.write(__jsp_StaticText.text[140]);
                        /*@lineinfo:translated-code*//*@lineinfo:454^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_136=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_136.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_136.setKey("activos.ordencompra");
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
                        out.write(__jsp_StaticText.text[141]);
                        /*@lineinfo:translated-code*//*@lineinfo:457^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_137=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_137.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_137.setMaxlength("20");
                          __jsp_taghandler_137.setName("ActivosForm");
                          __jsp_taghandler_137.setProperty("act_ordencompra");
                          __jsp_taghandler_137.setReadonly(true);
                          __jsp_taghandler_137.setSize("20");
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
                        out.write(__jsp_StaticText.text[142]);
                        /*@lineinfo:translated-code*//*@lineinfo:462^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_138=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_138.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_138.setKey("activos.numfactura");
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
                        out.write(__jsp_StaticText.text[143]);
                        /*@lineinfo:translated-code*//*@lineinfo:465^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_139=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_139.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_139.setMaxlength("8");
                          __jsp_taghandler_139.setName("ActivosForm");
                          __jsp_taghandler_139.setProperty("act_numfactura");
                          __jsp_taghandler_139.setReadonly(true);
                          __jsp_taghandler_139.setSize("8");
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
                        out.write(__jsp_StaticText.text[144]);
                        /*@lineinfo:translated-code*//*@lineinfo:468^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_140=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_140.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_140.setKey("activos.numcomprobante");
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
                        out.write(__jsp_StaticText.text[145]);
                        /*@lineinfo:translated-code*//*@lineinfo:471^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_141=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_141.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_141.setMaxlength("20");
                          __jsp_taghandler_141.setName("ActivosForm");
                          __jsp_taghandler_141.setProperty("act_numcomprobante");
                          __jsp_taghandler_141.setReadonly(true);
                          __jsp_taghandler_141.setSize("20");
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
                        out.write(__jsp_StaticText.text[146]);
                        /*@lineinfo:translated-code*//*@lineinfo:476^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_142=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_142.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_142.setKey("activos.codanterior");
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
                        out.write(__jsp_StaticText.text[147]);
                        /*@lineinfo:translated-code*//*@lineinfo:479^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_143=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_143.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_143.setMaxlength("20");
                          __jsp_taghandler_143.setName("ActivosForm");
                          __jsp_taghandler_143.setProperty("act_codanterior");
                          __jsp_taghandler_143.setReadonly(true);
                          __jsp_taghandler_143.setSize("20");
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
                        out.write(__jsp_StaticText.text[148]);
                        /*@lineinfo:translated-code*//*@lineinfo:482^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_144=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_144.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_144.setKey("activos.fecha");
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
                        out.write(__jsp_StaticText.text[149]);
                        /*@lineinfo:translated-code*//*@lineinfo:485^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_145=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_145.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_145.setMaxlength("10");
                          __jsp_taghandler_145.setName("ActivosForm");
                          __jsp_taghandler_145.setProperty("rev_fecha");
                          __jsp_taghandler_145.setReadonly(true);
                          __jsp_taghandler_145.setSize("10");
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
                        out.write(__jsp_StaticText.text[150]);
                        /*@lineinfo:translated-code*//*@lineinfo:490^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_146=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_146.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_146.setKey("activos.vidaut");
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
                        out.write(__jsp_StaticText.text[151]);
                        /*@lineinfo:translated-code*//*@lineinfo:493^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_147=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_147.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_147.setMaxlength("4");
                          __jsp_taghandler_147.setName("ActivosForm");
                          __jsp_taghandler_147.setProperty("rev_vidaut");
                          __jsp_taghandler_147.setReadonly(true);
                          __jsp_taghandler_147.setSize("4");
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
                        out.write(__jsp_StaticText.text[152]);
                        /*@lineinfo:translated-code*//*@lineinfo:496^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_148=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_148.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_148.setKey("activos.estadoactivo");
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
                        out.write(__jsp_StaticText.text[153]);
                        /*@lineinfo:translated-code*//*@lineinfo:499^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_149=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag name property readonly size");
                          __jsp_taghandler_149.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_149.setName("ActivosForm");
                          __jsp_taghandler_149.setProperty("rev_estadoactivo");
                          __jsp_taghandler_149.setReadonly(true);
                          __jsp_taghandler_149.setSize("10");
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
                        out.write(__jsp_StaticText.text[154]);
                        /*@lineinfo:translated-code*//*@lineinfo:504^21*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_150=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_150.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_150.setKey("activos.desestado");
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
                        out.write(__jsp_StaticText.text[155]);
                        /*@lineinfo:translated-code*//*@lineinfo:507^21*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_151=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_151.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_151.setMaxlength("60");
                          __jsp_taghandler_151.setName("ActivosForm");
                          __jsp_taghandler_151.setProperty("rev_desestado");
                          __jsp_taghandler_151.setReadonly(true);
                          __jsp_taghandler_151.setSize("60");
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
                        out.write(__jsp_StaticText.text[156]);
                        /*@lineinfo:translated-code*//*@lineinfo:512^21*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_152=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_152.setParent(__jsp_taghandler_79);
                          __jsp_taghandler_152.setOnclick("operacion.value=2;opcion.value=4");
                          __jsp_taghandler_152.setProperty("boton");
                          __jsp_taghandler_152.setStyleClass("boton1");
                          __jsp_taghandler_152.setValue("Reportar");
                          __jsp_tag_starteval=__jsp_taghandler_152.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_152,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_152.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_152.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_152);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[157]);
                      /*@lineinfo:translated-code*//*@lineinfo:512^133*/                      } while (__jsp_taghandler_79.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[158]);
                /*@lineinfo:translated-code*//*@lineinfo:516^27*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[159]);
            /*@lineinfo:translated-code*//*@lineinfo:518^10*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_153=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_153.setParent(__jsp_taghandler_1);
              __jsp_taghandler_153.setName("ActivosForm");
              __jsp_taghandler_153.setProperty("operacion");
              __jsp_taghandler_153.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_153.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[160]);
                  /*@lineinfo:translated-code*//*@lineinfo:522^22*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_154=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_154.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_154.setKey("activos.codrub");
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
                  out.write(__jsp_StaticText.text[161]);
                  /*@lineinfo:translated-code*//*@lineinfo:525^19*/                  {
                    org.apache.struts.taglib.html.SelectTag __jsp_taghandler_155=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                    __jsp_taghandler_155.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_155.setDisabled(false);
                    __jsp_taghandler_155.setName("ActivosForm");
                    __jsp_taghandler_155.setProperty("act_codrub");
                    __jsp_tag_starteval=__jsp_taghandler_155.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_155,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[162]);
                        /*@lineinfo:translated-code*//*@lineinfo:526^25*/                        {
                          org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_156=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                          __jsp_taghandler_156.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_156.setCollection("RubrosLista");
                          __jsp_taghandler_156.setLabelProperty("descripcion");
                          __jsp_taghandler_156.setProperty("codigo");
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
                        out.write(__jsp_StaticText.text[163]);
                      /*@lineinfo:translated-code*//*@lineinfo:526^111*/                      } while (__jsp_taghandler_155.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_155.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_155);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[164]);
                  /*@lineinfo:translated-code*//*@lineinfo:532^19*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_157=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_157.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_157.setKey("activos.codreg");
                    __jsp_tag_starteval=__jsp_taghandler_157.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_157.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_157.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_157);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[165]);
                  /*@lineinfo:translated-code*//*@lineinfo:535^19*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_158=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_158.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_158.setName("ActivosForm");
                    __jsp_taghandler_158.setProperty("act_codreg");
                    __jsp_tag_starteval=__jsp_taghandler_158.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_158,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_158.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_158.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_158);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[166]);
                  /*@lineinfo:translated-code*//*@lineinfo:536^22*/                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_159=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                    __jsp_taghandler_159.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_159.setMaxlength("30");
                    __jsp_taghandler_159.setName("ActivosForm");
                    __jsp_taghandler_159.setProperty("act_regdescripcion");
                    __jsp_taghandler_159.setReadonly(true);
                    __jsp_taghandler_159.setSize("30");
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
                  out.write(__jsp_StaticText.text[167]);
                  /*@lineinfo:translated-code*//*@lineinfo:541^19*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_160=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_160.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_160.setKey("activos.codfin");
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
                  out.write(__jsp_StaticText.text[168]);
                  /*@lineinfo:translated-code*//*@lineinfo:544^19*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_161=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_161.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_161.setName("ActivosForm");
                    __jsp_taghandler_161.setProperty("act_codfin");
                    __jsp_tag_starteval=__jsp_taghandler_161.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_161,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_161.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_161.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_161);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[169]);
                  /*@lineinfo:translated-code*//*@lineinfo:545^22*/                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_162=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                    __jsp_taghandler_162.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_162.setMaxlength("30");
                    __jsp_taghandler_162.setName("ActivosForm");
                    __jsp_taghandler_162.setProperty("act_findescripcion");
                    __jsp_taghandler_162.setReadonly(true);
                    __jsp_taghandler_162.setSize("30");
                    __jsp_tag_starteval=__jsp_taghandler_162.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_162,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_162.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_162.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_162);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[170]);
                  /*@lineinfo:translated-code*//*@lineinfo:548^16*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_163=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_163.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_163.setName("ActivosForm");
                    __jsp_taghandler_163.setProperty("opcion");
                    __jsp_taghandler_163.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_163.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[171]);
                        /*@lineinfo:translated-code*//*@lineinfo:553^22*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_164=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_164.setParent(__jsp_taghandler_163);
                          __jsp_taghandler_164.setOnclick("operacion.value=6;opcion.value=2");
                          __jsp_taghandler_164.setProperty("boton");
                          __jsp_taghandler_164.setStyleClass("boton1");
                          __jsp_taghandler_164.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[172]);
                      /*@lineinfo:translated-code*//*@lineinfo:553^134*/                      } while (__jsp_taghandler_163.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_163.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_163);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[173]);
                  /*@lineinfo:translated-code*//*@lineinfo:557^16*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_165=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_165.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_165.setName("ActivosForm");
                    __jsp_taghandler_165.setProperty("opcion");
                    __jsp_taghandler_165.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_165.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[174]);
                        /*@lineinfo:translated-code*//*@lineinfo:562^22*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_166=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_166.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_166.setOnclick("operacion.value=6;opcion.value=3");
                          __jsp_taghandler_166.setProperty("boton");
                          __jsp_taghandler_166.setStyleClass("boton1");
                          __jsp_taghandler_166.setValue("Eliminar");
                          __jsp_tag_starteval=__jsp_taghandler_166.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_166,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_166.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_166.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_166);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[175]);
                      /*@lineinfo:translated-code*//*@lineinfo:562^133*/                      } while (__jsp_taghandler_165.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_165.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_165);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[176]);
                  /*@lineinfo:translated-code*//*@lineinfo:566^16*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_167=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_167.setParent(__jsp_taghandler_153);
                    __jsp_taghandler_167.setName("ActivosForm");
                    __jsp_taghandler_167.setProperty("opcion");
                    __jsp_taghandler_167.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_167.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[177]);
                        /*@lineinfo:translated-code*//*@lineinfo:571^22*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_168=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_168.setParent(__jsp_taghandler_167);
                          __jsp_taghandler_168.setOnclick("operacion.value=6;opcion.value=4");
                          __jsp_taghandler_168.setProperty("boton");
                          __jsp_taghandler_168.setStyleClass("boton1");
                          __jsp_taghandler_168.setValue("Consultar");
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
                        out.write(__jsp_StaticText.text[178]);
                      /*@lineinfo:translated-code*//*@lineinfo:571^134*/                      } while (__jsp_taghandler_167.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_167.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_167);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[179]);
                /*@lineinfo:translated-code*//*@lineinfo:574^30*/                } while (__jsp_taghandler_153.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_153.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_153);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[180]);
            /*@lineinfo:translated-code*//*@lineinfo:577^10*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_169=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_169.setParent(__jsp_taghandler_1);
              __jsp_taghandler_169.setName("ActivosForm");
              __jsp_taghandler_169.setProperty("operacion");
              __jsp_taghandler_169.setValue("6");
              __jsp_tag_starteval=__jsp_taghandler_169.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[181]);
                  /*@lineinfo:translated-code*//*@lineinfo:581^22*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_170=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_170.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_170.setKey("activos.codrub");
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
                  out.write(__jsp_StaticText.text[182]);
                  /*@lineinfo:translated-code*//*@lineinfo:584^19*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_171=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_171.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_171.setName("ActivosForm");
                    __jsp_taghandler_171.setProperty("act_codrub");
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
                  out.write(__jsp_StaticText.text[183]);
                  /*@lineinfo:translated-code*//*@lineinfo:585^22*/                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_172=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                    __jsp_taghandler_172.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_172.setMaxlength("30");
                    __jsp_taghandler_172.setName("ActivosForm");
                    __jsp_taghandler_172.setProperty("act_rubdescripcion");
                    __jsp_taghandler_172.setReadonly(true);
                    __jsp_taghandler_172.setSize("30");
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
                  out.write(__jsp_StaticText.text[184]);
                  /*@lineinfo:translated-code*//*@lineinfo:590^19*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_173=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_173.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_173.setKey("activos.codreg");
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
                  out.write(__jsp_StaticText.text[185]);
                  /*@lineinfo:translated-code*//*@lineinfo:593^19*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_174=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_174.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_174.setName("ActivosForm");
                    __jsp_taghandler_174.setProperty("act_codreg");
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
                  out.write(__jsp_StaticText.text[186]);
                  /*@lineinfo:translated-code*//*@lineinfo:594^22*/                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_175=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                    __jsp_taghandler_175.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_175.setMaxlength("30");
                    __jsp_taghandler_175.setName("ActivosForm");
                    __jsp_taghandler_175.setProperty("act_regdescripcion");
                    __jsp_taghandler_175.setReadonly(true);
                    __jsp_taghandler_175.setSize("30");
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
                  out.write(__jsp_StaticText.text[187]);
                  /*@lineinfo:translated-code*//*@lineinfo:599^19*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_176=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_176.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_176.setKey("activos.codfin");
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
                  out.write(__jsp_StaticText.text[188]);
                  /*@lineinfo:translated-code*//*@lineinfo:602^19*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_177=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_177.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_177.setName("ActivosForm");
                    __jsp_taghandler_177.setProperty("act_codfin");
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
                  out.write(__jsp_StaticText.text[189]);
                  /*@lineinfo:translated-code*//*@lineinfo:603^22*/                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_178=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                    __jsp_taghandler_178.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_178.setMaxlength("30");
                    __jsp_taghandler_178.setName("ActivosForm");
                    __jsp_taghandler_178.setProperty("act_findescripcion");
                    __jsp_taghandler_178.setReadonly(true);
                    __jsp_taghandler_178.setSize("30");
                    __jsp_tag_starteval=__jsp_taghandler_178.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_178,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_178.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_178.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_178);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[190]);
                  /*@lineinfo:translated-code*//*@lineinfo:608^19*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_179=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_179.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_179.setKey("activos.codgrp");
                    __jsp_tag_starteval=__jsp_taghandler_179.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_179.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_179.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_179);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[191]);
                  /*@lineinfo:translated-code*//*@lineinfo:611^22*/                  {
                    org.apache.struts.taglib.html.SelectTag __jsp_taghandler_180=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                    __jsp_taghandler_180.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_180.setDisabled(false);
                    __jsp_taghandler_180.setName("ActivosForm");
                    __jsp_taghandler_180.setProperty("act_codgrp");
                    __jsp_tag_starteval=__jsp_taghandler_180.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_180,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[192]);
                        /*@lineinfo:translated-code*//*@lineinfo:612^25*/                        {
                          org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_181=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                          __jsp_taghandler_181.setParent(__jsp_taghandler_180);
                          __jsp_taghandler_181.setCollection("GruposLista");
                          __jsp_taghandler_181.setLabelProperty("descripcion");
                          __jsp_taghandler_181.setProperty("codigo");
                          __jsp_tag_starteval=__jsp_taghandler_181.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_181.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_181.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_181);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[193]);
                      /*@lineinfo:translated-code*//*@lineinfo:612^111*/                      } while (__jsp_taghandler_180.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_180.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_180);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[194]);
                  /*@lineinfo:translated-code*//*@lineinfo:618^19*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_182=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_182.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_182.setKey("activos.descripcion");
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
                  out.write(__jsp_StaticText.text[195]);
                  /*@lineinfo:translated-code*//*@lineinfo:621^19*/                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_183=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size value");
                    __jsp_taghandler_183.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_183.setMaxlength("120");
                    __jsp_taghandler_183.setName("ActivosForm");
                    __jsp_taghandler_183.setOnchange("javascript:this.value=this.value.toUpperCase();");
                    __jsp_taghandler_183.setProperty("act_descripcion");
                    __jsp_taghandler_183.setSize("60");
                    __jsp_taghandler_183.setValue("%");
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
                  out.write(__jsp_StaticText.text[196]);
                  /*@lineinfo:translated-code*//*@lineinfo:624^16*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_184=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_184.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_184.setName("ActivosForm");
                    __jsp_taghandler_184.setProperty("opcion");
                    __jsp_taghandler_184.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_184.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[197]);
                        /*@lineinfo:translated-code*//*@lineinfo:629^25*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_185=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_185.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_185.setOnclick("operacion.value=3;opcion.value=2");
                          __jsp_taghandler_185.setProperty("boton");
                          __jsp_taghandler_185.setStyleClass("boton1");
                          __jsp_taghandler_185.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[198]);
                      /*@lineinfo:translated-code*//*@lineinfo:629^137*/                      } while (__jsp_taghandler_184.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_184.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_184);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[199]);
                  /*@lineinfo:translated-code*//*@lineinfo:633^16*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_186=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_186.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_186.setName("ActivosForm");
                    __jsp_taghandler_186.setProperty("opcion");
                    __jsp_taghandler_186.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_186.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[200]);
                        /*@lineinfo:translated-code*//*@lineinfo:638^25*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_187=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_187.setParent(__jsp_taghandler_186);
                          __jsp_taghandler_187.setOnclick("operacion.value=3;opcion.value=3");
                          __jsp_taghandler_187.setProperty("boton");
                          __jsp_taghandler_187.setStyleClass("boton1");
                          __jsp_taghandler_187.setValue("Eliminar");
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
                      /*@lineinfo:translated-code*//*@lineinfo:638^136*/                      } while (__jsp_taghandler_186.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_186.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_186);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[202]);
                  /*@lineinfo:translated-code*//*@lineinfo:642^16*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_188=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_188.setParent(__jsp_taghandler_169);
                    __jsp_taghandler_188.setName("ActivosForm");
                    __jsp_taghandler_188.setProperty("opcion");
                    __jsp_taghandler_188.setValue("4");
                    __jsp_tag_starteval=__jsp_taghandler_188.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[203]);
                        /*@lineinfo:translated-code*//*@lineinfo:647^25*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_189=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_189.setParent(__jsp_taghandler_188);
                          __jsp_taghandler_189.setOnclick("operacion.value=3;opcion.value=4");
                          __jsp_taghandler_189.setProperty("boton");
                          __jsp_taghandler_189.setStyleClass("boton1");
                          __jsp_taghandler_189.setValue("Consultar");
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
                        out.write(__jsp_StaticText.text[204]);
                      /*@lineinfo:translated-code*//*@lineinfo:647^137*/                      } while (__jsp_taghandler_188.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_188.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_188);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[205]);
                /*@lineinfo:translated-code*//*@lineinfo:650^30*/                } while (__jsp_taghandler_169.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_169.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_169);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[206]);
            /*@lineinfo:translated-code*//*@lineinfo:653^10*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_190=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_190.setParent(__jsp_taghandler_1);
              __jsp_taghandler_190.setName("ActivosForm");
              __jsp_taghandler_190.setProperty("operacion");
              __jsp_taghandler_190.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_190.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[207]);
                  /*@lineinfo:translated-code*//*@lineinfo:660^28*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_191=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_191.setParent(__jsp_taghandler_190);
                    __jsp_taghandler_191.setName("ActivosForm");
                    __jsp_taghandler_191.setProperty("act_codrub");
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
                  out.write(__jsp_StaticText.text[208]);
                  /*@lineinfo:translated-code*//*@lineinfo:661^28*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_192=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_192.setParent(__jsp_taghandler_190);
                    __jsp_taghandler_192.setName("ActivosForm");
                    __jsp_taghandler_192.setProperty("act_codreg");
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
                  out.write(__jsp_StaticText.text[209]);
                  /*@lineinfo:translated-code*//*@lineinfo:662^28*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_193=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_193.setParent(__jsp_taghandler_190);
                    __jsp_taghandler_193.setName("ActivosForm");
                    __jsp_taghandler_193.setProperty("act_codgrp");
                    __jsp_tag_starteval=__jsp_taghandler_193.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_193,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_193.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_193.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_193);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[210]);
                  /*@lineinfo:translated-code*//*@lineinfo:663^28*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_194=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_194.setParent(__jsp_taghandler_190);
                    __jsp_taghandler_194.setName("ActivosForm");
                    __jsp_taghandler_194.setProperty("act_codfin");
                    __jsp_tag_starteval=__jsp_taghandler_194.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_194,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_194.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_194.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_194);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[211]);
                  /*@lineinfo:translated-code*//*@lineinfo:664^28*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_195=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_195.setParent(__jsp_taghandler_190);
                    __jsp_taghandler_195.setName("ActivosForm");
                    __jsp_taghandler_195.setProperty("act_descripcion");
                    __jsp_tag_starteval=__jsp_taghandler_195.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_195,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_195.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_195.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_195);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[212]);
                  /*@lineinfo:user-code*//*@lineinfo:672^30*/                   int pnum=0;
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[213]);
                  /*@lineinfo:translated-code*//*@lineinfo:673^30*/                  {
                    org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_196=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
                    __jsp_taghandler_196.setParent(__jsp_taghandler_190);
                    __jsp_taghandler_196.setId("lista");
                    __jsp_taghandler_196.setName("Activos3Lista");
                    java.lang.Object lista = null;
                    __jsp_tag_starteval=__jsp_taghandler_196.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_196,__jsp_tag_starteval,out);
                      do {
                        lista = (java.lang.Object) pageContext.findAttribute("lista");
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[214]);
                        /*@lineinfo:user-code*//*@lineinfo:674^30*/                         if (pnum==1) {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[215]);
                        /*@lineinfo:user-code*//*@lineinfo:676^25*/                         } else { 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[216]);
                        /*@lineinfo:user-code*//*@lineinfo:678^25*/                         } 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[217]);
                        /*@lineinfo:translated-code*//*@lineinfo:680^25*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_197=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_197.setParent(__jsp_taghandler_196);
                          __jsp_taghandler_197.setName("lista");
                          __jsp_taghandler_197.setProperty("codrub");
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
                        out.write(__jsp_StaticText.text[218]);
                        /*@lineinfo:translated-code*//*@lineinfo:680^71*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_198=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_198.setParent(__jsp_taghandler_196);
                          __jsp_taghandler_198.setName("lista");
                          __jsp_taghandler_198.setProperty("codreg");
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
                        out.write(__jsp_StaticText.text[219]);
                        /*@lineinfo:translated-code*//*@lineinfo:680^117*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_199=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_199.setParent(__jsp_taghandler_196);
                          __jsp_taghandler_199.setName("lista");
                          __jsp_taghandler_199.setProperty("ceros");
                          __jsp_tag_starteval=__jsp_taghandler_199.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_199.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_199.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_199);
                        }
/*@lineinfo:680^161*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_200=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_200.setParent(__jsp_taghandler_196);
                          __jsp_taghandler_200.setName("lista");
                          __jsp_taghandler_200.setProperty("codigo");
                          __jsp_tag_starteval=__jsp_taghandler_200.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_200.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_200.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_200);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[220]);
                        /*@lineinfo:translated-code*//*@lineinfo:683^25*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_201=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_201.setParent(__jsp_taghandler_196);
                          __jsp_taghandler_201.setName("lista");
                          __jsp_taghandler_201.setProperty("descodgrp");
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
                        out.write(__jsp_StaticText.text[221]);
                        /*@lineinfo:translated-code*//*@lineinfo:686^25*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_202=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_202.setParent(__jsp_taghandler_196);
                          __jsp_taghandler_202.setName("lista");
                          __jsp_taghandler_202.setProperty("descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_202.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_202.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_202.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_202);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[222]);
                        /*@lineinfo:translated-code*//*@lineinfo:688^28*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_203=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_203.setParent(__jsp_taghandler_196);
                          __jsp_taghandler_203.setName("ActivosForm");
                          __jsp_taghandler_203.setProperty("opcion");
                          __jsp_taghandler_203.setValue("4");
                          __jsp_tag_starteval=__jsp_taghandler_203.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[223]);
                              /*@lineinfo:translated-code*//*@lineinfo:690^25*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_204=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_204.setParent(__jsp_taghandler_203);
                                __jsp_taghandler_204.setIndexed(true);
                                __jsp_taghandler_204.setOnclick("operacion.value=1;opcion.value=4");
                                __jsp_taghandler_204.setProperty("boton");
                                __jsp_taghandler_204.setStyleClass("boton1");
                                __jsp_taghandler_204.setValue("Consultar");
                                __jsp_tag_starteval=__jsp_taghandler_204.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_204,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_204.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_204.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_204);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[224]);
                            /*@lineinfo:translated-code*//*@lineinfo:690^152*/                            } while (__jsp_taghandler_203.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_203.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_203);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[225]);
                        /*@lineinfo:user-code*//*@lineinfo:694^25*/                         if (pnum==0) pnum=1; else pnum=0; 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[226]);
                      /*@lineinfo:translated-code*//*@lineinfo:694^64*/                      } while (__jsp_taghandler_196.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_196.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_196);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[227]);
                /*@lineinfo:translated-code*//*@lineinfo:695^41*/                } while (__jsp_taghandler_190.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_190.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_190);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[228]);
          /*@lineinfo:translated-code*//*@lineinfo:703^24*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[229]);


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
    private static final char text[][]=new char[230][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-125\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones2.js?1.3\"></script>\n<body>\n<table border=\"1\" width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n   <caption>Activos</caption>\n   <tr>\n      <td>\n         ".toCharArray();
      text[5] = 
      "\n         ".toCharArray();
      text[6] = 
      "\n         ".toCharArray();
      text[7] = 
      "\n         ".toCharArray();
      text[8] = 
      "\n            ".toCharArray();
      text[9] = 
      "\n               <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[10] = 
      "\n\t\t\t\t             </td>\n                     <td colspan=\"3\">\n\t\t\t\t                ".toCharArray();
      text[11] = 
      "\n                        ".toCharArray();
      text[12] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[13] = 
      "\n\t\t\t\t             </td>\n                     <td colspan=\"3\">\n\t\t\t\t                ".toCharArray();
      text[14] = 
      "\n                        ".toCharArray();
      text[15] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[16] = 
      "\n\t\t\t\t             </td>\n                     <td colspan=\"3\">\n\t\t\t\t                ".toCharArray();
      text[17] = 
      "\n                        ".toCharArray();
      text[18] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[19] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[20] = 
      " \n                        ".toCharArray();
      text[21] = 
      "\n                     </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[22] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[23] = 
      "\n                        ".toCharArray();
      text[24] = 
      "\n                     </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[25] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[26] = 
      "\n                        ".toCharArray();
      text[27] = 
      "\n                     </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[28] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[29] = 
      "\n                        ".toCharArray();
      text[30] = 
      "\n                     </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[31] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[32] = 
      " \n                        ".toCharArray();
      text[33] = 
      "\n                     </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[34] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[35] = 
      " \n                        ".toCharArray();
      text[36] = 
      "\n                     </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[37] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[38] = 
      " \n                        ".toCharArray();
      text[39] = 
      "\n                     </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[40] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[41] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[42] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[43] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[44] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[45] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[46] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[47] = 
      "\n\t\t\t\t             </td>\n                  </tr>     \n               </table>\n               <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[48] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[49] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[50] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[51] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n               </table>\n               <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">      \n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[52] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[53] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[54] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[55] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[56] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[57] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[58] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[59] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[60] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[61] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[62] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[63] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[64] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[65] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[66] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[67] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[68] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[69] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[70] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[71] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[72] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[73] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\"> \n\t\t\t\t                ".toCharArray();
      text[74] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[75] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[76] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[77] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[78] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[79] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[80] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[81] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td colspan=2>\n\t\t\t\t                ".toCharArray();
      text[82] = 
      "\n\t\t\t\t             </td>\n                  </tr>        \n               </table>      \n            ".toCharArray();
      text[83] = 
      "      \n\n            ".toCharArray();
      text[84] = 
      "\n               <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[85] = 
      "\n\t\t\t\t             </td>\n                     <td colspan=\"3\">\n\t\t\t\t                ".toCharArray();
      text[86] = 
      "\n                        ".toCharArray();
      text[87] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[88] = 
      "\n\t\t\t\t             </td>\n                     <td colspan=\"3\">\n\t\t\t\t                ".toCharArray();
      text[89] = 
      "\n                        ".toCharArray();
      text[90] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[91] = 
      "\n\t\t\t\t             </td>\n                     <td colspan=\"3\">\n\t\t\t\t                ".toCharArray();
      text[92] = 
      "\n                        ".toCharArray();
      text[93] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[94] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[95] = 
      " \n                        ".toCharArray();
      text[96] = 
      "\n                     </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[97] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[98] = 
      "\n                        ".toCharArray();
      text[99] = 
      "\n                     </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[100] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[101] = 
      "\n                        ".toCharArray();
      text[102] = 
      "\n                     </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[103] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[104] = 
      "\n                        ".toCharArray();
      text[105] = 
      "\n                     </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[106] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[107] = 
      " \n                        ".toCharArray();
      text[108] = 
      "\n                     </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[109] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[110] = 
      " \n                        ".toCharArray();
      text[111] = 
      "\n                     </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[112] = 
      "\n\t\t\t\t             </td>\n                     <td>\n                        ".toCharArray();
      text[113] = 
      " \n                        ".toCharArray();
      text[114] = 
      "\n                     </td>\n                  </tr>                  \n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[115] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[116] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[117] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[118] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[119] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[120] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[121] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[122] = 
      "\n\t\t\t\t             </td>\n                  </tr>     \n               </table>\n               <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[123] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[124] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[125] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[126] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n               </table>\n               <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">      \n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[127] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[128] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[129] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[130] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[131] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[132] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[133] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[134] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[135] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[136] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[137] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[138] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[139] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[140] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[141] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[142] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[143] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[144] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[145] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[146] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[147] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[148] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\"> \n\t\t\t\t                ".toCharArray();
      text[149] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[150] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[151] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[152] = 
      "\n\t\t\t\t             </td>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[153] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[154] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td class=\"S10d\">\n\t\t\t\t                ".toCharArray();
      text[155] = 
      "\n\t\t\t\t             </td>\n                     <td>\n\t\t\t\t                ".toCharArray();
      text[156] = 
      "\n\t\t\t\t             </td>\n                  </tr>\n                  <tr>\n                     <td colspan=2>\n\t\t\t\t                ".toCharArray();
      text[157] = 
      "\n\t\t\t\t             </td>\n                  </tr>        \n               </table>      \n            ".toCharArray();
      text[158] = 
      "      \n         ".toCharArray();
      text[159] = 
      "\n         ".toCharArray();
      text[160] = 
      "\n            <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n               <tr>\n                  <td class=\"S10d\">\n                     ".toCharArray();
      text[161] = 
      "\n                  </td>\n                  <td>\n\t\t\t               ".toCharArray();
      text[162] = 
      "\n                        ".toCharArray();
      text[163] = 
      "\n                     ".toCharArray();
      text[164] = 
      "\n\t\t\t            </td>\n               </tr>\n               <tr>\n                  <td class=\"S10d\">\n\t\t\t               ".toCharArray();
      text[165] = 
      "\n\t\t\t            </td>\n                  <td>\n\t\t\t               ".toCharArray();
      text[166] = 
      "\n                     ".toCharArray();
      text[167] = 
      "\n\t\t\t            </td>\n               </tr>  \n               <tr>\n                  <td class=\"S10d\">\n\t\t\t               ".toCharArray();
      text[168] = 
      "\n\t\t\t            </td>\n                  <td>\n\t\t\t               ".toCharArray();
      text[169] = 
      "\n                     ".toCharArray();
      text[170] = 
      "\n\t\t\t            </td>\n               </tr>  \n               ".toCharArray();
      text[171] = 
      "\n               <tr>\n                  <td>\n\t\t\t            </td>\n                  <td align=\"left\">\n                     ".toCharArray();
      text[172] = 
      "\n                  </td>\n               </tr>\n               ".toCharArray();
      text[173] = 
      "   \n               ".toCharArray();
      text[174] = 
      "\n               <tr>\n                  <td>\n\t\t\t            </td>\n                  <td align=\"left\">\n                     ".toCharArray();
      text[175] = 
      "\n                  </td>\n               </tr>\n               ".toCharArray();
      text[176] = 
      "   \n               ".toCharArray();
      text[177] = 
      "\n               <tr>\n                  <td>\n\t\t\t            </td>\n                  <td align=\"left\">\n                     ".toCharArray();
      text[178] = 
      "\n                  </td>\n               </tr>\n               ".toCharArray();
      text[179] = 
      "   \n            </table>\n         ".toCharArray();
      text[180] = 
      "         \n         ".toCharArray();
      text[181] = 
      "\n            <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n               <tr>\n                  <td class=\"S10d\">\n                     ".toCharArray();
      text[182] = 
      "\n                  </td>\n                  <td>\n\t\t\t               ".toCharArray();
      text[183] = 
      "\n                     ".toCharArray();
      text[184] = 
      "                  \n                  </td>\n               </tr>\n               <tr>\n                  <td class=\"S10d\">\n\t\t\t               ".toCharArray();
      text[185] = 
      "\n\t\t\t            </td>\n                  <td>\n\t\t\t               ".toCharArray();
      text[186] = 
      "\n                     ".toCharArray();
      text[187] = 
      "\n\t\t\t            </td>\n               </tr>  \n               <tr>\n                  <td class=\"S10d\">\n\t\t\t               ".toCharArray();
      text[188] = 
      "\n\t\t\t            </td>\n                  <td>\n\t\t\t               ".toCharArray();
      text[189] = 
      "\n                     ".toCharArray();
      text[190] = 
      "\n\t\t\t            </td>\n               </tr>  \n               <tr>\n                  <td class=\"S10d\">\n\t\t\t               ".toCharArray();
      text[191] = 
      "\n\t\t\t            </td>\n                  <td>\n                     ".toCharArray();
      text[192] = 
      "\n                        ".toCharArray();
      text[193] = 
      "\n                     ".toCharArray();
      text[194] = 
      "\n                  </td>\n               </tr>                    \n               <tr>\n                  <td class=\"S10d\">\n\t\t\t               ".toCharArray();
      text[195] = 
      " % = Comodin\n\t\t\t            </td>\n                  <td>\n\t\t\t               ".toCharArray();
      text[196] = 
      "\n\t\t\t            </td>\n               </tr>        \n               ".toCharArray();
      text[197] = 
      "\n                  <tr>\n                     <td>\n\t\t\t               </td>\n                     <td align=\"left\">\n                        ".toCharArray();
      text[198] = 
      "\n                     </td>\n                  </tr>\n               ".toCharArray();
      text[199] = 
      "   \n               ".toCharArray();
      text[200] = 
      "\n                  <tr>\n                     <td>\n\t\t\t               </td>\n                     <td align=\"left\">\n                        ".toCharArray();
      text[201] = 
      "\n                     </td>\n                  </tr>\n               ".toCharArray();
      text[202] = 
      "   \n               ".toCharArray();
      text[203] = 
      "\n                  <tr>\n                     <td>\n\t\t\t               </td>\n                     <td align=\"left\">\n                        ".toCharArray();
      text[204] = 
      "\n                     </td>\n                  </tr>\n               ".toCharArray();
      text[205] = 
      "   \n               </table>\n         ".toCharArray();
      text[206] = 
      "\n         ".toCharArray();
      text[207] = 
      "\n            <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n            <tr class=\"T8a\">\n               <td>\n                  <table width=\"100%\" align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n                     <tr>\n\t\t\t                  <td>\n                           ".toCharArray();
      text[208] = 
      "\n                           ".toCharArray();
      text[209] = 
      "\n                           ".toCharArray();
      text[210] = 
      "\n                           ".toCharArray();
      text[211] = 
      "                           \n                           ".toCharArray();
      text[212] = 
      "\n                           <table width=\"100%\" class=\"soloborde\" bgcolor=\"#C1C1FF\">\n                              <tr class=\"FondoAzul\">\n                                 <td width=\"60\" scope=\"col\" class=\"S10c\">Código</td>\n                                 <td width=\"60\" scope=\"col\" class=\"S10c\">Grupo</td>\n                                 <td width=\"160\" scope=\"col\" class=\"S10c\">Descripción</td>\n                                 <td></td>\n                              </tr>\n                             ".toCharArray();
      text[213] = 
      "\n                             ".toCharArray();
      text[214] = 
      "\n                             ".toCharArray();
      text[215] = 
      "\n                             <tr class=\"T8b\">\n                        ".toCharArray();
      text[216] = 
      "\n                        <tr class=\"T8a\">\n                        ".toCharArray();
      text[217] = 
      "\n                           <td>\n\t\t\t\t\t\t                  ".toCharArray();
      text[218] = 
      "-".toCharArray();
      text[219] = 
      "-".toCharArray();
      text[220] = 
      "\n\t\t\t\t\t\t               </td>\n                           <td>\n\t\t\t\t\t\t                  ".toCharArray();
      text[221] = 
      "\n\t\t\t\t\t\t               </td>\n                           <td>\n\t\t\t\t\t\t                  ".toCharArray();
      text[222] = 
      "\n\t\t\t\t\t\t               </td>\n                           ".toCharArray();
      text[223] = 
      "\n                           <td align=\"right\">\n\t\t\t\t\t\t                  ".toCharArray();
      text[224] = 
      "\n\t\t\t\t\t\t               </td>\n                           ".toCharArray();
      text[225] = 
      "     \n                        </tr>\n                        ".toCharArray();
      text[226] = 
      "\n                        ".toCharArray();
      text[227] = 
      "\n                     </table>\n                  </td>\n    \t\t       </tr>     \n            </table>\n           </td>\n         </tr>\n         </table>\n         ".toCharArray();
      text[228] = 
      "\n         ".toCharArray();
      text[229] = 
      "\n      </td>\n   </tr>\n   <tr>\n      <td align=\"center\" colspan=\"2\" class=\"S10d\">\n      (*) Campos Obligatorios\n      </td>\n   </tr>\n</table>\n</body>\n</html>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
