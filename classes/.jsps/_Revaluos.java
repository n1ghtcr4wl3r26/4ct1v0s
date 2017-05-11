  /*@lineinfo:filename=/Revaluos.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Revaluos extends oracle.jsp.runtime.HttpJsp {

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
    _Revaluos page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:291^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/revaluosAction");
        __jsp_taghandler_1.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:292^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:293^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:294^1*/            {
              org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_4=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("RevaluosForm");
              __jsp_taghandler_4.setProperty("rub_vidaut");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:295^1*/            {
              org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_5=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setName("RevaluosForm");
              __jsp_taghandler_5.setProperty("fecha_rev");
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
            /*@lineinfo:translated-code*//*@lineinfo:298^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_6=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setName("RevaluosForm");
              __jsp_taghandler_6.setProperty("operacion");
              __jsp_taghandler_6.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[10]);
                  /*@lineinfo:translated-code*//*@lineinfo:299^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_7=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                    __jsp_taghandler_7.setName("RevaluosForm");
                    __jsp_taghandler_7.setProperty("opcion");
                    __jsp_taghandler_7.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[11]);
                        /*@lineinfo:translated-code*//*@lineinfo:301^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_8.setKey("revaluos.codrub");
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
                        /*@lineinfo:translated-code*//*@lineinfo:302^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_9.setMaxlength("10");
                          __jsp_taghandler_9.setName("RevaluosForm");
                          __jsp_taghandler_9.setProperty("rev_codrub");
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
                        /*@lineinfo:translated-code*//*@lineinfo:303^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_10=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_10.setMaxlength("60");
                          __jsp_taghandler_10.setName("RevaluosForm");
                          __jsp_taghandler_10.setProperty("rev_rubdescripcion");
                          __jsp_taghandler_10.setReadonly(true);
                          __jsp_taghandler_10.setSize("60");
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
                        /*@lineinfo:translated-code*//*@lineinfo:306^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_11=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_11.setKey("revaluos.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[15]);
                        /*@lineinfo:translated-code*//*@lineinfo:307^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_12=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_12.setMaxlength("10");
                          __jsp_taghandler_12.setName("RevaluosForm");
                          __jsp_taghandler_12.setProperty("rev_codreg");
                          __jsp_taghandler_12.setReadonly(true);
                          __jsp_taghandler_12.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:308^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_13=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_13.setMaxlength("60");
                          __jsp_taghandler_13.setName("RevaluosForm");
                          __jsp_taghandler_13.setProperty("rev_regdescripcion");
                          __jsp_taghandler_13.setReadonly(true);
                          __jsp_taghandler_13.setSize("60");
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
                        /*@lineinfo:translated-code*//*@lineinfo:311^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_14=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_14.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_14.setKey("activos.codgrp");
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
                        /*@lineinfo:translated-code*//*@lineinfo:312^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_15=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_15.setMaxlength("10");
                          __jsp_taghandler_15.setName("RevaluosForm");
                          __jsp_taghandler_15.setProperty("act_codgrp");
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
                        /*@lineinfo:translated-code*//*@lineinfo:313^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_16=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_16.setMaxlength("60");
                          __jsp_taghandler_16.setName("RevaluosForm");
                          __jsp_taghandler_16.setProperty("rev_grpdescripcion");
                          __jsp_taghandler_16.setReadonly(true);
                          __jsp_taghandler_16.setSize("60");
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
                        /*@lineinfo:translated-code*//*@lineinfo:316^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_17=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_17.setKey("revaluos.codigo");
                          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[21]);
                        /*@lineinfo:translated-code*//*@lineinfo:317^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_18=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_18.setMaxlength("5");
                          __jsp_taghandler_18.setName("RevaluosForm");
                          __jsp_taghandler_18.setProperty("rev_codigo");
                          __jsp_taghandler_18.setReadonly(true);
                          __jsp_taghandler_18.setSize("5");
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
                        /*@lineinfo:translated-code*//*@lineinfo:318^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_19=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_19.setMaxlength("10");
                          __jsp_taghandler_19.setName("RevaluosForm");
                          __jsp_taghandler_19.setProperty("rev_codbarra");
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
                        /*@lineinfo:translated-code*//*@lineinfo:319^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_20=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_20.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_20.setMaxlength("70");
                          __jsp_taghandler_20.setName("RevaluosForm");
                          __jsp_taghandler_20.setProperty("act_descripcion");
                          __jsp_taghandler_20.setReadonly(true);
                          __jsp_taghandler_20.setSize("70");
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
                        /*@lineinfo:translated-code*//*@lineinfo:323^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_21=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_21.setKey("revaluos.numrevaluo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:324^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_22=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_22.setMaxlength("4");
                          __jsp_taghandler_22.setName("RevaluosForm");
                          __jsp_taghandler_22.setProperty("rev_numrevaluo");
                          __jsp_taghandler_22.setReadonly(true);
                          __jsp_taghandler_22.setSize("4");
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
                        /*@lineinfo:translated-code*//*@lineinfo:325^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_23=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_23.setKey("revaluos.fecha");
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
                        /*@lineinfo:translated-code*//*@lineinfo:326^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_24=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_24.setMaxlength("10");
                          __jsp_taghandler_24.setName("RevaluosForm");
                          __jsp_taghandler_24.setProperty("rev_fecha");
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
                        /*@lineinfo:translated-code*//*@lineinfo:329^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_25=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_25.setKey("revaluos.valbol");
                          __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[29]);
                        /*@lineinfo:translated-code*//*@lineinfo:330^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_26=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_26.setMaxlength("13");
                          __jsp_taghandler_26.setName("RevaluosForm");
                          __jsp_taghandler_26.setProperty("rev_valbol");
                          __jsp_taghandler_26.setSize("13");
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
                        /*@lineinfo:translated-code*//*@lineinfo:333^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_27=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_27.setKey("revaluos.vidaut");
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
                        /*@lineinfo:translated-code*//*@lineinfo:334^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_28=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_28.setMaxlength("4");
                          __jsp_taghandler_28.setName("RevaluosForm");
                          __jsp_taghandler_28.setProperty("rev_vidaut");
                          __jsp_taghandler_28.setSize("4");
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
                        /*@lineinfo:translated-code*//*@lineinfo:335^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_29=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_29.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_29.setKey("revaluos.estadoactivo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:336^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_30=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_30.setDisabled(false);
                          __jsp_taghandler_30.setName("RevaluosForm");
                          __jsp_taghandler_30.setProperty("rev_estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[34]);
                              /*@lineinfo:translated-code*//*@lineinfo:337^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_31=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                                __jsp_taghandler_31.setCollection("EstadosLista");
                                __jsp_taghandler_31.setLabelProperty("desestado");
                                __jsp_taghandler_31.setProperty("estado");
                                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[35]);
                            /*@lineinfo:translated-code*//*@lineinfo:337^99*/                            } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:342^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_32=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_32.setKey("revaluos.desestado");
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
                        out.write(__jsp_StaticText.text[37]);
                        /*@lineinfo:translated-code*//*@lineinfo:343^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_33=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_33.setMaxlength("60");
                          __jsp_taghandler_33.setName("RevaluosForm");
                          __jsp_taghandler_33.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_33.setProperty("rev_desestado");
                          __jsp_taghandler_33.setSize("60");
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
                        out.write(__jsp_StaticText.text[38]);
                        /*@lineinfo:translated-code*//*@lineinfo:346^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_34=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_34.setKey("revaluos.numdocumento");
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
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:347^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_35=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_35.setMaxlength("20");
                          __jsp_taghandler_35.setName("RevaluosForm");
                          __jsp_taghandler_35.setProperty("rev_numdocumento");
                          __jsp_taghandler_35.setSize("20");
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
                        /*@lineinfo:translated-code*//*@lineinfo:350^24*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_36=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_36.setOnclick("operacion.value=2;opcion.value=1");
                          __jsp_taghandler_36.setProperty("boton");
                          __jsp_taghandler_36.setStyleClass("boton1");
                          __jsp_taghandler_36.setValue("Insertar");
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
                      /*@lineinfo:translated-code*//*@lineinfo:350^136*/                      } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[42]);
                  /*@lineinfo:translated-code*//*@lineinfo:353^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_37=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_37.setParent(__jsp_taghandler_6);
                    __jsp_taghandler_37.setName("RevaluosForm");
                    __jsp_taghandler_37.setProperty("opcion");
                    __jsp_taghandler_37.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[43]);
                        /*@lineinfo:translated-code*//*@lineinfo:355^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_38=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_38.setKey("revaluos.codrub");
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
                        out.write(__jsp_StaticText.text[44]);
                        /*@lineinfo:translated-code*//*@lineinfo:356^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_39=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_39.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_39.setMaxlength("10");
                          __jsp_taghandler_39.setName("RevaluosForm");
                          __jsp_taghandler_39.setProperty("rev_codrub");
                          __jsp_taghandler_39.setReadonly(true);
                          __jsp_taghandler_39.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:357^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_40=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_40.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_40.setMaxlength("60");
                          __jsp_taghandler_40.setName("RevaluosForm");
                          __jsp_taghandler_40.setProperty("rev_rubdescripcion");
                          __jsp_taghandler_40.setReadonly(true);
                          __jsp_taghandler_40.setSize("60");
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
                        out.write(__jsp_StaticText.text[46]);
                        /*@lineinfo:translated-code*//*@lineinfo:360^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_41=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_41.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_41.setKey("revaluos.codreg");
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
                        out.write(__jsp_StaticText.text[47]);
                        /*@lineinfo:translated-code*//*@lineinfo:361^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_42=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_42.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_42.setMaxlength("10");
                          __jsp_taghandler_42.setName("RevaluosForm");
                          __jsp_taghandler_42.setProperty("rev_codreg");
                          __jsp_taghandler_42.setReadonly(true);
                          __jsp_taghandler_42.setSize("10");
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
                        out.write(__jsp_StaticText.text[48]);
                        /*@lineinfo:translated-code*//*@lineinfo:362^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_43=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_43.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_43.setMaxlength("60");
                          __jsp_taghandler_43.setName("RevaluosForm");
                          __jsp_taghandler_43.setProperty("rev_regdescripcion");
                          __jsp_taghandler_43.setReadonly(true);
                          __jsp_taghandler_43.setSize("60");
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
                        out.write(__jsp_StaticText.text[49]);
                        /*@lineinfo:translated-code*//*@lineinfo:365^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_44=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_44.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_44.setKey("activos.codgrp");
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
                        /*@lineinfo:translated-code*//*@lineinfo:366^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_45=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_45.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_45.setMaxlength("10");
                          __jsp_taghandler_45.setName("RevaluosForm");
                          __jsp_taghandler_45.setProperty("act_codgrp");
                          __jsp_taghandler_45.setReadonly(true);
                          __jsp_taghandler_45.setSize("10");
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
                        out.write(__jsp_StaticText.text[51]);
                        /*@lineinfo:translated-code*//*@lineinfo:367^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_46=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_46.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_46.setMaxlength("60");
                          __jsp_taghandler_46.setName("RevaluosForm");
                          __jsp_taghandler_46.setProperty("rev_grpdescripcion");
                          __jsp_taghandler_46.setReadonly(true);
                          __jsp_taghandler_46.setSize("60");
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
                        out.write(__jsp_StaticText.text[52]);
                        /*@lineinfo:translated-code*//*@lineinfo:370^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_47=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_47.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_47.setKey("revaluos.codigo");
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
                        out.write(__jsp_StaticText.text[53]);
                        /*@lineinfo:translated-code*//*@lineinfo:371^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_48=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_48.setMaxlength("5");
                          __jsp_taghandler_48.setName("RevaluosForm");
                          __jsp_taghandler_48.setProperty("rev_codigo");
                          __jsp_taghandler_48.setReadonly(true);
                          __jsp_taghandler_48.setSize("5");
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
                        out.write(__jsp_StaticText.text[54]);
                        /*@lineinfo:translated-code*//*@lineinfo:372^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_49=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_49.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_49.setMaxlength("10");
                          __jsp_taghandler_49.setName("RevaluosForm");
                          __jsp_taghandler_49.setProperty("rev_codbarra");
                          __jsp_taghandler_49.setReadonly(true);
                          __jsp_taghandler_49.setSize("10");
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
                        out.write(__jsp_StaticText.text[55]);
                        /*@lineinfo:translated-code*//*@lineinfo:373^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_50=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_50.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_50.setMaxlength("70");
                          __jsp_taghandler_50.setName("RevaluosForm");
                          __jsp_taghandler_50.setProperty("act_descripcion");
                          __jsp_taghandler_50.setReadonly(true);
                          __jsp_taghandler_50.setSize("70");
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
                        out.write(__jsp_StaticText.text[56]);
                        /*@lineinfo:translated-code*//*@lineinfo:377^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_51=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_51.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_51.setKey("revaluos.numrevaluo");
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
                        out.write(__jsp_StaticText.text[57]);
                        /*@lineinfo:translated-code*//*@lineinfo:378^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_52=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_52.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_52.setMaxlength("4");
                          __jsp_taghandler_52.setName("RevaluosForm");
                          __jsp_taghandler_52.setProperty("rev_numrevaluo");
                          __jsp_taghandler_52.setReadonly(true);
                          __jsp_taghandler_52.setSize("4");
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
                        out.write(__jsp_StaticText.text[58]);
                        /*@lineinfo:translated-code*//*@lineinfo:379^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_53=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_53.setKey("revaluos.fecha");
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
                        out.write(__jsp_StaticText.text[59]);
                        /*@lineinfo:translated-code*//*@lineinfo:380^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_54=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_54.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_54.setMaxlength("10");
                          __jsp_taghandler_54.setName("RevaluosForm");
                          __jsp_taghandler_54.setProperty("rev_fecha");
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
                        out.write(__jsp_StaticText.text[60]);
                        /*@lineinfo:translated-code*//*@lineinfo:383^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_55=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_55.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_55.setKey("revaluos.valbol");
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
                        out.write(__jsp_StaticText.text[61]);
                        /*@lineinfo:translated-code*//*@lineinfo:384^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_56=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_56.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_56.setMaxlength("13");
                          __jsp_taghandler_56.setName("RevaluosForm");
                          __jsp_taghandler_56.setProperty("rev_valbol");
                          __jsp_taghandler_56.setSize("13");
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
                        out.write(__jsp_StaticText.text[62]);
                        /*@lineinfo:translated-code*//*@lineinfo:387^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_57=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_57.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_57.setKey("revaluos.vidaut");
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
                        out.write(__jsp_StaticText.text[63]);
                        /*@lineinfo:translated-code*//*@lineinfo:388^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_58=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_58.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_58.setMaxlength("4");
                          __jsp_taghandler_58.setName("RevaluosForm");
                          __jsp_taghandler_58.setProperty("rev_vidaut");
                          __jsp_taghandler_58.setSize("4");
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
                        out.write(__jsp_StaticText.text[64]);
                        /*@lineinfo:translated-code*//*@lineinfo:389^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_59=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_59.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_59.setKey("revaluos.estadoactivo");
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
                        out.write(__jsp_StaticText.text[65]);
                        /*@lineinfo:translated-code*//*@lineinfo:390^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_60=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_60.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_60.setDisabled(false);
                          __jsp_taghandler_60.setName("RevaluosForm");
                          __jsp_taghandler_60.setProperty("rev_estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_60,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[66]);
                              /*@lineinfo:translated-code*//*@lineinfo:391^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_61=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_61.setParent(__jsp_taghandler_60);
                                __jsp_taghandler_61.setCollection("EstadosLista");
                                __jsp_taghandler_61.setLabelProperty("desestado");
                                __jsp_taghandler_61.setProperty("estado");
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
                              out.write(__jsp_StaticText.text[67]);
                            /*@lineinfo:translated-code*//*@lineinfo:391^99*/                            } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[68]);
                        /*@lineinfo:translated-code*//*@lineinfo:396^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_62=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_62.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_62.setKey("revaluos.desestado");
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
                        /*@lineinfo:translated-code*//*@lineinfo:397^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_63=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_63.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_63.setMaxlength("60");
                          __jsp_taghandler_63.setName("RevaluosForm");
                          __jsp_taghandler_63.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_63.setProperty("rev_desestado");
                          __jsp_taghandler_63.setSize("60");
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
                        /*@lineinfo:translated-code*//*@lineinfo:400^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_64=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_64.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_64.setKey("revaluos.numdocumento");
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
                        /*@lineinfo:translated-code*//*@lineinfo:401^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_65=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_65.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_65.setMaxlength("20");
                          __jsp_taghandler_65.setName("RevaluosForm");
                          __jsp_taghandler_65.setProperty("rev_numdocumento");
                          __jsp_taghandler_65.setSize("20");
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
                        /*@lineinfo:translated-code*//*@lineinfo:404^24*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_66=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_66.setParent(__jsp_taghandler_37);
                          __jsp_taghandler_66.setOnclick("operacion.value=2;opcion.value=2");
                          __jsp_taghandler_66.setProperty("boton");
                          __jsp_taghandler_66.setStyleClass("boton1");
                          __jsp_taghandler_66.setValue("Modificar");
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
                      /*@lineinfo:translated-code*//*@lineinfo:404^137*/                      } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[74]);
                  /*@lineinfo:translated-code*//*@lineinfo:407^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_67=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_67.setParent(__jsp_taghandler_6);
                    __jsp_taghandler_67.setName("RevaluosForm");
                    __jsp_taghandler_67.setProperty("opcion");
                    __jsp_taghandler_67.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[75]);
                        /*@lineinfo:translated-code*//*@lineinfo:409^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_68=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_68.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_68.setKey("revaluos.codrub");
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
                        out.write(__jsp_StaticText.text[76]);
                        /*@lineinfo:translated-code*//*@lineinfo:410^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_69=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_69.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_69.setMaxlength("10");
                          __jsp_taghandler_69.setName("RevaluosForm");
                          __jsp_taghandler_69.setProperty("rev_codrub");
                          __jsp_taghandler_69.setReadonly(true);
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
                        out.write(__jsp_StaticText.text[77]);
                        /*@lineinfo:translated-code*//*@lineinfo:411^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_70=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_70.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_70.setMaxlength("60");
                          __jsp_taghandler_70.setName("RevaluosForm");
                          __jsp_taghandler_70.setProperty("rev_rubdescripcion");
                          __jsp_taghandler_70.setReadonly(true);
                          __jsp_taghandler_70.setSize("60");
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
                        out.write(__jsp_StaticText.text[78]);
                        /*@lineinfo:translated-code*//*@lineinfo:414^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_71=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_71.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_71.setKey("revaluos.codreg");
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
                        out.write(__jsp_StaticText.text[79]);
                        /*@lineinfo:translated-code*//*@lineinfo:415^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_72=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_72.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_72.setMaxlength("10");
                          __jsp_taghandler_72.setName("RevaluosForm");
                          __jsp_taghandler_72.setProperty("rev_codreg");
                          __jsp_taghandler_72.setReadonly(true);
                          __jsp_taghandler_72.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_72,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_72.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[80]);
                        /*@lineinfo:translated-code*//*@lineinfo:416^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_73=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_73.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_73.setMaxlength("60");
                          __jsp_taghandler_73.setName("RevaluosForm");
                          __jsp_taghandler_73.setProperty("rev_regdescripcion");
                          __jsp_taghandler_73.setReadonly(true);
                          __jsp_taghandler_73.setSize("60");
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
                        out.write(__jsp_StaticText.text[81]);
                        /*@lineinfo:translated-code*//*@lineinfo:419^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_74=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_74.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_74.setKey("activos.codgrp");
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
                        out.write(__jsp_StaticText.text[82]);
                        /*@lineinfo:translated-code*//*@lineinfo:420^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_75=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_75.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_75.setMaxlength("10");
                          __jsp_taghandler_75.setName("RevaluosForm");
                          __jsp_taghandler_75.setProperty("act_codgrp");
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
                        out.write(__jsp_StaticText.text[83]);
                        /*@lineinfo:translated-code*//*@lineinfo:421^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_76=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_76.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_76.setMaxlength("60");
                          __jsp_taghandler_76.setName("RevaluosForm");
                          __jsp_taghandler_76.setProperty("rev_grpdescripcion");
                          __jsp_taghandler_76.setReadonly(true);
                          __jsp_taghandler_76.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_76,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_76.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[84]);
                        /*@lineinfo:translated-code*//*@lineinfo:424^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_77=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_77.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_77.setKey("revaluos.codigo");
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
                        out.write(__jsp_StaticText.text[85]);
                        /*@lineinfo:translated-code*//*@lineinfo:425^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_78=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_78.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_78.setMaxlength("5");
                          __jsp_taghandler_78.setName("RevaluosForm");
                          __jsp_taghandler_78.setProperty("rev_codigo");
                          __jsp_taghandler_78.setReadonly(true);
                          __jsp_taghandler_78.setSize("5");
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
                        out.write(__jsp_StaticText.text[86]);
                        /*@lineinfo:translated-code*//*@lineinfo:426^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_79=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_79.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_79.setMaxlength("10");
                          __jsp_taghandler_79.setName("RevaluosForm");
                          __jsp_taghandler_79.setProperty("rev_codbarra");
                          __jsp_taghandler_79.setReadonly(true);
                          __jsp_taghandler_79.setSize("10");
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
                        out.write(__jsp_StaticText.text[87]);
                        /*@lineinfo:translated-code*//*@lineinfo:427^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_80=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_80.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_80.setMaxlength("70");
                          __jsp_taghandler_80.setName("RevaluosForm");
                          __jsp_taghandler_80.setProperty("act_descripcion");
                          __jsp_taghandler_80.setReadonly(true);
                          __jsp_taghandler_80.setSize("70");
                          __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_80,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_80.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[88]);
                        /*@lineinfo:translated-code*//*@lineinfo:430^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_81=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_81.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_81.setKey("revaluos.numrevaluo");
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
                        out.write(__jsp_StaticText.text[89]);
                        /*@lineinfo:translated-code*//*@lineinfo:431^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_82=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_82.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_82.setMaxlength("4");
                          __jsp_taghandler_82.setName("RevaluosForm");
                          __jsp_taghandler_82.setProperty("rev_numrevaluo");
                          __jsp_taghandler_82.setReadonly(true);
                          __jsp_taghandler_82.setSize("4");
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
                        out.write(__jsp_StaticText.text[90]);
                        /*@lineinfo:translated-code*//*@lineinfo:432^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_83=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_83.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_83.setKey("revaluos.fecha");
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
                        out.write(__jsp_StaticText.text[91]);
                        /*@lineinfo:translated-code*//*@lineinfo:433^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_84=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_84.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_84.setMaxlength("10");
                          __jsp_taghandler_84.setName("RevaluosForm");
                          __jsp_taghandler_84.setProperty("rev_fecha");
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
                        out.write(__jsp_StaticText.text[92]);
                        /*@lineinfo:translated-code*//*@lineinfo:436^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_85=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_85.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_85.setKey("revaluos.valbol");
                          __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_85.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[93]);
                        /*@lineinfo:translated-code*//*@lineinfo:437^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_86=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_86.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_86.setMaxlength("15");
                          __jsp_taghandler_86.setName("RevaluosForm");
                          __jsp_taghandler_86.setProperty("rev_valbol");
                          __jsp_taghandler_86.setReadonly(true);
                          __jsp_taghandler_86.setSize("15");
                          __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_86,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_86.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[94]);
                        /*@lineinfo:translated-code*//*@lineinfo:440^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_87=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_87.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_87.setKey("revaluos.vidaut");
                          __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_87.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[95]);
                        /*@lineinfo:translated-code*//*@lineinfo:441^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_88=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_88.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_88.setMaxlength("4");
                          __jsp_taghandler_88.setName("RevaluosForm");
                          __jsp_taghandler_88.setProperty("rev_vidaut");
                          __jsp_taghandler_88.setReadonly(true);
                          __jsp_taghandler_88.setSize("4");
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
                        out.write(__jsp_StaticText.text[96]);
                        /*@lineinfo:translated-code*//*@lineinfo:442^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_89=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_89.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_89.setKey("revaluos.estadoactivo");
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
                        out.write(__jsp_StaticText.text[97]);
                        /*@lineinfo:translated-code*//*@lineinfo:443^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_90=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_90.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_90.setMaxlength("4");
                          __jsp_taghandler_90.setName("RevaluosForm");
                          __jsp_taghandler_90.setProperty("rev_estadoactivo");
                          __jsp_taghandler_90.setReadonly(true);
                          __jsp_taghandler_90.setSize("4");
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
                        out.write(__jsp_StaticText.text[98]);
                        /*@lineinfo:translated-code*//*@lineinfo:446^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_91=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_91.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_91.setKey("revaluos.desestado");
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
                        /*@lineinfo:translated-code*//*@lineinfo:447^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_92=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property readonly size");
                          __jsp_taghandler_92.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_92.setMaxlength("60");
                          __jsp_taghandler_92.setName("RevaluosForm");
                          __jsp_taghandler_92.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_92.setProperty("rev_desestado");
                          __jsp_taghandler_92.setReadonly(true);
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
                        /*@lineinfo:translated-code*//*@lineinfo:450^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_93=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_93.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_93.setKey("revaluos.numdocumento");
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
                        out.write(__jsp_StaticText.text[101]);
                        /*@lineinfo:translated-code*//*@lineinfo:451^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_94=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_94.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_94.setMaxlength("20");
                          __jsp_taghandler_94.setName("RevaluosForm");
                          __jsp_taghandler_94.setProperty("rev_numdocumento");
                          __jsp_taghandler_94.setReadonly(true);
                          __jsp_taghandler_94.setSize("20");
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
                        out.write(__jsp_StaticText.text[102]);
                        /*@lineinfo:translated-code*//*@lineinfo:454^26*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_95=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_95.setParent(__jsp_taghandler_67);
                          __jsp_taghandler_95.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_95.setProperty("boton");
                          __jsp_taghandler_95.setStyleClass("boton1");
                          __jsp_taghandler_95.setValue("Eliminar");
                          __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_95,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_95.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[103]);
                      /*@lineinfo:translated-code*//*@lineinfo:454^138*/                      } while (__jsp_taghandler_67.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[104]);
                  /*@lineinfo:translated-code*//*@lineinfo:457^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_96=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_96.setParent(__jsp_taghandler_6);
                    __jsp_taghandler_96.setName("RevaluosForm");
                    __jsp_taghandler_96.setProperty("opcion");
                    __jsp_taghandler_96.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_96.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[105]);
                        /*@lineinfo:translated-code*//*@lineinfo:459^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_97=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_97.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_97.setKey("revaluos.codrub");
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
                        out.write(__jsp_StaticText.text[106]);
                        /*@lineinfo:translated-code*//*@lineinfo:460^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_98=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_98.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_98.setMaxlength("10");
                          __jsp_taghandler_98.setName("RevaluosForm");
                          __jsp_taghandler_98.setProperty("rev_codrub");
                          __jsp_taghandler_98.setReadonly(true);
                          __jsp_taghandler_98.setSize("10");
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
                        out.write(__jsp_StaticText.text[107]);
                        /*@lineinfo:translated-code*//*@lineinfo:461^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_99=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_99.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_99.setMaxlength("60");
                          __jsp_taghandler_99.setName("RevaluosForm");
                          __jsp_taghandler_99.setProperty("rev_rubdescripcion");
                          __jsp_taghandler_99.setReadonly(true);
                          __jsp_taghandler_99.setSize("60");
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
                        out.write(__jsp_StaticText.text[108]);
                        /*@lineinfo:translated-code*//*@lineinfo:464^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_100=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_100.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_100.setKey("revaluos.codreg");
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
                        out.write(__jsp_StaticText.text[109]);
                        /*@lineinfo:translated-code*//*@lineinfo:465^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_101=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_101.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_101.setMaxlength("10");
                          __jsp_taghandler_101.setName("RevaluosForm");
                          __jsp_taghandler_101.setProperty("rev_codreg");
                          __jsp_taghandler_101.setReadonly(true);
                          __jsp_taghandler_101.setSize("10");
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
                        out.write(__jsp_StaticText.text[110]);
                        /*@lineinfo:translated-code*//*@lineinfo:466^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_102=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_102.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_102.setMaxlength("60");
                          __jsp_taghandler_102.setName("RevaluosForm");
                          __jsp_taghandler_102.setProperty("rev_regdescripcion");
                          __jsp_taghandler_102.setReadonly(true);
                          __jsp_taghandler_102.setSize("60");
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
                        out.write(__jsp_StaticText.text[111]);
                        /*@lineinfo:translated-code*//*@lineinfo:469^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_103=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_103.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_103.setKey("activos.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_103.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[112]);
                        /*@lineinfo:translated-code*//*@lineinfo:470^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_104=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_104.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_104.setMaxlength("10");
                          __jsp_taghandler_104.setName("RevaluosForm");
                          __jsp_taghandler_104.setProperty("act_codgrp");
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
                        out.write(__jsp_StaticText.text[113]);
                        /*@lineinfo:translated-code*//*@lineinfo:471^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_105=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_105.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_105.setMaxlength("60");
                          __jsp_taghandler_105.setName("RevaluosForm");
                          __jsp_taghandler_105.setProperty("rev_grpdescripcion");
                          __jsp_taghandler_105.setReadonly(true);
                          __jsp_taghandler_105.setSize("60");
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
                        out.write(__jsp_StaticText.text[114]);
                        /*@lineinfo:translated-code*//*@lineinfo:474^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_106=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_106.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_106.setKey("revaluos.codigo");
                          __jsp_tag_starteval=__jsp_taghandler_106.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_106.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_106.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_106);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[115]);
                        /*@lineinfo:translated-code*//*@lineinfo:475^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_107=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_107.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_107.setMaxlength("5");
                          __jsp_taghandler_107.setName("RevaluosForm");
                          __jsp_taghandler_107.setProperty("rev_codigo");
                          __jsp_taghandler_107.setReadonly(true);
                          __jsp_taghandler_107.setSize("5");
                          __jsp_tag_starteval=__jsp_taghandler_107.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_107,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_107.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_107.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_107);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[116]);
                        /*@lineinfo:translated-code*//*@lineinfo:476^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_108=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_108.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_108.setMaxlength("10");
                          __jsp_taghandler_108.setName("RevaluosForm");
                          __jsp_taghandler_108.setProperty("rev_codbarra");
                          __jsp_taghandler_108.setReadonly(true);
                          __jsp_taghandler_108.setSize("10");
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
                        out.write(__jsp_StaticText.text[117]);
                        /*@lineinfo:translated-code*//*@lineinfo:477^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_109=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_109.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_109.setMaxlength("70");
                          __jsp_taghandler_109.setName("RevaluosForm");
                          __jsp_taghandler_109.setProperty("act_descripcion");
                          __jsp_taghandler_109.setReadonly(true);
                          __jsp_taghandler_109.setSize("70");
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
                        out.write(__jsp_StaticText.text[118]);
                        /*@lineinfo:translated-code*//*@lineinfo:480^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_110=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_110.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_110.setKey("revaluos.numrevaluo");
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
                        out.write(__jsp_StaticText.text[119]);
                        /*@lineinfo:translated-code*//*@lineinfo:481^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_111=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_111.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_111.setMaxlength("4");
                          __jsp_taghandler_111.setName("RevaluosForm");
                          __jsp_taghandler_111.setProperty("rev_numrevaluo");
                          __jsp_taghandler_111.setReadonly(true);
                          __jsp_taghandler_111.setSize("4");
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
                        out.write(__jsp_StaticText.text[120]);
                        /*@lineinfo:translated-code*//*@lineinfo:482^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_112=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_112.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_112.setKey("revaluos.fecha");
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
                        out.write(__jsp_StaticText.text[121]);
                        /*@lineinfo:translated-code*//*@lineinfo:483^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_113=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_113.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_113.setMaxlength("10");
                          __jsp_taghandler_113.setName("RevaluosForm");
                          __jsp_taghandler_113.setProperty("rev_fecha");
                          __jsp_taghandler_113.setReadonly(true);
                          __jsp_taghandler_113.setSize("10");
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
                        out.write(__jsp_StaticText.text[122]);
                        /*@lineinfo:translated-code*//*@lineinfo:486^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_114=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_114.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_114.setKey("revaluos.valbol");
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
                        out.write(__jsp_StaticText.text[123]);
                        /*@lineinfo:translated-code*//*@lineinfo:487^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_115=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_115.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_115.setMaxlength("15");
                          __jsp_taghandler_115.setName("RevaluosForm");
                          __jsp_taghandler_115.setProperty("rev_valbol");
                          __jsp_taghandler_115.setReadonly(true);
                          __jsp_taghandler_115.setSize("15");
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
                        out.write(__jsp_StaticText.text[124]);
                        /*@lineinfo:translated-code*//*@lineinfo:490^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_116=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_116.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_116.setKey("revaluos.vidaut");
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
                        out.write(__jsp_StaticText.text[125]);
                        /*@lineinfo:translated-code*//*@lineinfo:491^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_117=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_117.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_117.setMaxlength("4");
                          __jsp_taghandler_117.setName("RevaluosForm");
                          __jsp_taghandler_117.setProperty("rev_vidaut");
                          __jsp_taghandler_117.setReadonly(true);
                          __jsp_taghandler_117.setSize("4");
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
                        out.write(__jsp_StaticText.text[126]);
                        /*@lineinfo:translated-code*//*@lineinfo:492^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_118=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_118.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_118.setKey("revaluos.estadoactivo");
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
                        out.write(__jsp_StaticText.text[127]);
                        /*@lineinfo:translated-code*//*@lineinfo:493^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_119=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_119.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_119.setMaxlength("4");
                          __jsp_taghandler_119.setName("RevaluosForm");
                          __jsp_taghandler_119.setProperty("rev_estadoactivo");
                          __jsp_taghandler_119.setReadonly(true);
                          __jsp_taghandler_119.setSize("4");
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
                        out.write(__jsp_StaticText.text[128]);
                        /*@lineinfo:translated-code*//*@lineinfo:496^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_120=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_120.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_120.setKey("revaluos.desestado");
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
                        out.write(__jsp_StaticText.text[129]);
                        /*@lineinfo:translated-code*//*@lineinfo:497^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_121=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property readonly size");
                          __jsp_taghandler_121.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_121.setMaxlength("60");
                          __jsp_taghandler_121.setName("RevaluosForm");
                          __jsp_taghandler_121.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_121.setProperty("rev_desestado");
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
                        out.write(__jsp_StaticText.text[130]);
                        /*@lineinfo:translated-code*//*@lineinfo:500^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_122=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_122.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_122.setKey("revaluos.numdocumento");
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
                        out.write(__jsp_StaticText.text[131]);
                        /*@lineinfo:translated-code*//*@lineinfo:501^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_123=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_123.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_123.setMaxlength("20");
                          __jsp_taghandler_123.setName("RevaluosForm");
                          __jsp_taghandler_123.setProperty("rev_numdocumento");
                          __jsp_taghandler_123.setReadonly(true);
                          __jsp_taghandler_123.setSize("20");
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
                        out.write(__jsp_StaticText.text[132]);
                        /*@lineinfo:translated-code*//*@lineinfo:504^26*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_124=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_124.setParent(__jsp_taghandler_96);
                          __jsp_taghandler_124.setOnclick("operacion.value=2;opcion.value=5");
                          __jsp_taghandler_124.setProperty("boton");
                          __jsp_taghandler_124.setStyleClass("boton1");
                          __jsp_taghandler_124.setValue("Consultar");
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
                        out.write(__jsp_StaticText.text[133]);
                      /*@lineinfo:translated-code*//*@lineinfo:504^139*/                      } while (__jsp_taghandler_96.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_96.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_96);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[134]);
                /*@lineinfo:translated-code*//*@lineinfo:506^18*/                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[135]);
            /*@lineinfo:translated-code*//*@lineinfo:508^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_125=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_125.setParent(__jsp_taghandler_1);
              __jsp_taghandler_125.setName("RevaluosForm");
              __jsp_taghandler_125.setProperty("operacion");
              __jsp_taghandler_125.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_125.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[136]);
                  /*@lineinfo:translated-code*//*@lineinfo:511^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_126=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_126.setParent(__jsp_taghandler_125);
                    __jsp_taghandler_126.setName("RevaluosForm");
                    __jsp_taghandler_126.setProperty("opcion");
                    __jsp_taghandler_126.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_126.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[137]);
                        /*@lineinfo:translated-code*//*@lineinfo:513^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_127=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_127.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_127.setKey("revaluos.codrub");
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
                        out.write(__jsp_StaticText.text[138]);
                        /*@lineinfo:translated-code*//*@lineinfo:514^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_128=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onchange property");
                          __jsp_taghandler_128.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_128.setDisabled(false);
                          __jsp_taghandler_128.setName("RevaluosForm");
                          __jsp_taghandler_128.setOnchange("quitar1()");
                          __jsp_taghandler_128.setProperty("rev_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_128,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[139]);
                              /*@lineinfo:translated-code*//*@lineinfo:515^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_129=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_129.setParent(__jsp_taghandler_128);
                                __jsp_taghandler_129.setCollection("RubrosLista");
                                __jsp_taghandler_129.setLabelProperty("descripcion");
                                __jsp_taghandler_129.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[140]);
                            /*@lineinfo:translated-code*//*@lineinfo:515^102*/                            } while (__jsp_taghandler_128.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[141]);
                        /*@lineinfo:translated-code*//*@lineinfo:519^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_130=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_130.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_130.setKey("revaluos.codreg");
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
                        out.write(__jsp_StaticText.text[142]);
                        /*@lineinfo:translated-code*//*@lineinfo:520^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_131=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_131.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_131.setName("RevaluosForm");
                          __jsp_taghandler_131.setProperty("rev_codreg");
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
                        out.write(__jsp_StaticText.text[143]);
                        /*@lineinfo:translated-code*//*@lineinfo:521^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_132=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_132.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_132.setMaxlength("30");
                          __jsp_taghandler_132.setName("RevaluosForm");
                          __jsp_taghandler_132.setProperty("rev_regdescripcion");
                          __jsp_taghandler_132.setReadonly(true);
                          __jsp_taghandler_132.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_132.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_132,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_132.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_132.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_132);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[144]);
                        /*@lineinfo:translated-code*//*@lineinfo:524^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_133=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_133.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_133.setKey("activos.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_133.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_133.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_133.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_133);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[145]);
                        /*@lineinfo:translated-code*//*@lineinfo:525^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_134=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_134.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_134.setDisabled(false);
                          __jsp_taghandler_134.setName("RevaluosForm");
                          __jsp_taghandler_134.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_134.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_134,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[146]);
                              /*@lineinfo:translated-code*//*@lineinfo:526^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_135=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_135.setParent(__jsp_taghandler_134);
                                __jsp_taghandler_135.setCollection("GruposLista");
                                __jsp_taghandler_135.setLabelProperty("descripcion");
                                __jsp_taghandler_135.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_135.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_135.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_135.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_135);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[147]);
                            /*@lineinfo:translated-code*//*@lineinfo:526^102*/                            } while (__jsp_taghandler_134.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_134.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_134);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[148]);
                        /*@lineinfo:translated-code*//*@lineinfo:530^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_136=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_136.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_136.setKey("activos.descripcion");
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
                        out.write(__jsp_StaticText.text[149]);
                        /*@lineinfo:translated-code*//*@lineinfo:531^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_137=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size value");
                          __jsp_taghandler_137.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_137.setMaxlength("50");
                          __jsp_taghandler_137.setName("RevaluosForm");
                          __jsp_taghandler_137.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_137.setProperty("act_descripcion");
                          __jsp_taghandler_137.setSize("50");
                          __jsp_taghandler_137.setValue("%");
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
                        out.write(__jsp_StaticText.text[150]);
                        /*@lineinfo:translated-code*//*@lineinfo:536^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_138=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_138.setParent(__jsp_taghandler_126);
                          __jsp_taghandler_138.setOnclick("operacion.value=3;opcion.value=5");
                          __jsp_taghandler_138.setProperty("boton");
                          __jsp_taghandler_138.setStyleClass("boton1");
                          __jsp_taghandler_138.setValue("Consultar");
                          __jsp_tag_starteval=__jsp_taghandler_138.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_138,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_138.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_138.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_138);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[151]);
                      /*@lineinfo:translated-code*//*@lineinfo:536^121*/                      } while (__jsp_taghandler_126.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_126.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_126);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[152]);
                  /*@lineinfo:translated-code*//*@lineinfo:540^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_139=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_139.setParent(__jsp_taghandler_125);
                    __jsp_taghandler_139.setName("RevaluosForm");
                    __jsp_taghandler_139.setProperty("opcion");
                    __jsp_taghandler_139.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_139.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[153]);
                        /*@lineinfo:translated-code*//*@lineinfo:542^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_140=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_140.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_140.setKey("revaluos.codrub");
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
                        out.write(__jsp_StaticText.text[154]);
                        /*@lineinfo:translated-code*//*@lineinfo:543^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_141=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onchange property");
                          __jsp_taghandler_141.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_141.setDisabled(false);
                          __jsp_taghandler_141.setName("RevaluosForm");
                          __jsp_taghandler_141.setOnchange("quitar1()");
                          __jsp_taghandler_141.setProperty("rev_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_141.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_141,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[155]);
                              /*@lineinfo:translated-code*//*@lineinfo:544^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_142=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_142.setParent(__jsp_taghandler_141);
                                __jsp_taghandler_142.setCollection("RubrosLista");
                                __jsp_taghandler_142.setLabelProperty("descripcion");
                                __jsp_taghandler_142.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[156]);
                            /*@lineinfo:translated-code*//*@lineinfo:544^102*/                            } while (__jsp_taghandler_141.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_141.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_141);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[157]);
                        /*@lineinfo:translated-code*//*@lineinfo:548^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_143=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_143.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_143.setKey("revaluos.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_143.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_143.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_143.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_143);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[158]);
                        /*@lineinfo:translated-code*//*@lineinfo:549^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_144=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_144.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_144.setName("RevaluosForm");
                          __jsp_taghandler_144.setProperty("rev_codreg");
                          __jsp_tag_starteval=__jsp_taghandler_144.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_144,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_144.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_144.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_144);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[159]);
                        /*@lineinfo:translated-code*//*@lineinfo:550^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_145=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_145.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_145.setMaxlength("30");
                          __jsp_taghandler_145.setName("RevaluosForm");
                          __jsp_taghandler_145.setProperty("rev_regdescripcion");
                          __jsp_taghandler_145.setReadonly(true);
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
                        out.write(__jsp_StaticText.text[160]);
                        /*@lineinfo:translated-code*//*@lineinfo:553^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_146=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_146.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_146.setKey("activos.codgrp");
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
                        out.write(__jsp_StaticText.text[161]);
                        /*@lineinfo:translated-code*//*@lineinfo:554^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_147=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_147.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_147.setDisabled(false);
                          __jsp_taghandler_147.setName("RevaluosForm");
                          __jsp_taghandler_147.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_147.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_147,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[162]);
                              /*@lineinfo:translated-code*//*@lineinfo:555^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_148=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_148.setParent(__jsp_taghandler_147);
                                __jsp_taghandler_148.setCollection("GruposLista");
                                __jsp_taghandler_148.setLabelProperty("descripcion");
                                __jsp_taghandler_148.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[163]);
                            /*@lineinfo:translated-code*//*@lineinfo:555^102*/                            } while (__jsp_taghandler_147.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_147.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_147);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[164]);
                        /*@lineinfo:translated-code*//*@lineinfo:559^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_149=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_149.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_149.setKey("activos.descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_149.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_149.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_149.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_149);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[165]);
                        /*@lineinfo:translated-code*//*@lineinfo:560^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_150=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size value");
                          __jsp_taghandler_150.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_150.setMaxlength("50");
                          __jsp_taghandler_150.setName("RevaluosForm");
                          __jsp_taghandler_150.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_150.setProperty("act_descripcion");
                          __jsp_taghandler_150.setSize("50");
                          __jsp_taghandler_150.setValue("%");
                          __jsp_tag_starteval=__jsp_taghandler_150.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_150,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_150.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_150.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_150);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[166]);
                        /*@lineinfo:translated-code*//*@lineinfo:565^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_151=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_151.setParent(__jsp_taghandler_139);
                          __jsp_taghandler_151.setOnclick("operacion.value=3;opcion.value=3");
                          __jsp_taghandler_151.setProperty("boton");
                          __jsp_taghandler_151.setStyleClass("boton1");
                          __jsp_taghandler_151.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[167]);
                      /*@lineinfo:translated-code*//*@lineinfo:565^120*/                      } while (__jsp_taghandler_139.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_139.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_139);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[168]);
                  /*@lineinfo:translated-code*//*@lineinfo:569^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_152=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_152.setParent(__jsp_taghandler_125);
                    __jsp_taghandler_152.setName("RevaluosForm");
                    __jsp_taghandler_152.setProperty("opcion");
                    __jsp_taghandler_152.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_152.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[169]);
                        /*@lineinfo:translated-code*//*@lineinfo:571^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_153=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_153.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_153.setKey("revaluos.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_153.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_153.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_153.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_153);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[170]);
                        /*@lineinfo:translated-code*//*@lineinfo:572^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_154=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onchange property");
                          __jsp_taghandler_154.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_154.setDisabled(false);
                          __jsp_taghandler_154.setName("RevaluosForm");
                          __jsp_taghandler_154.setOnchange("quitar1()");
                          __jsp_taghandler_154.setProperty("rev_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_154.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_154,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[171]);
                              /*@lineinfo:translated-code*//*@lineinfo:573^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_155=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_155.setParent(__jsp_taghandler_154);
                                __jsp_taghandler_155.setCollection("RubrosLista");
                                __jsp_taghandler_155.setLabelProperty("descripcion");
                                __jsp_taghandler_155.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_155.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_155.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_155.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_155);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[172]);
                            /*@lineinfo:translated-code*//*@lineinfo:573^102*/                            } while (__jsp_taghandler_154.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_154.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_154);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[173]);
                        /*@lineinfo:translated-code*//*@lineinfo:577^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_156=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_156.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_156.setKey("revaluos.codreg");
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
                        out.write(__jsp_StaticText.text[174]);
                        /*@lineinfo:translated-code*//*@lineinfo:578^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_157=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_157.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_157.setName("RevaluosForm");
                          __jsp_taghandler_157.setProperty("rev_codreg");
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
                        out.write(__jsp_StaticText.text[175]);
                        /*@lineinfo:translated-code*//*@lineinfo:579^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_158=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_158.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_158.setMaxlength("30");
                          __jsp_taghandler_158.setName("RevaluosForm");
                          __jsp_taghandler_158.setProperty("rev_regdescripcion");
                          __jsp_taghandler_158.setReadonly(true);
                          __jsp_taghandler_158.setSize("30");
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
                        out.write(__jsp_StaticText.text[176]);
                        /*@lineinfo:translated-code*//*@lineinfo:582^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_159=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_159.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_159.setKey("activos.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_159.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_159.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_159.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_159);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[177]);
                        /*@lineinfo:translated-code*//*@lineinfo:583^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_160=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_160.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_160.setDisabled(false);
                          __jsp_taghandler_160.setName("RevaluosForm");
                          __jsp_taghandler_160.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_160.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_160,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[178]);
                              /*@lineinfo:translated-code*//*@lineinfo:584^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_161=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_161.setParent(__jsp_taghandler_160);
                                __jsp_taghandler_161.setCollection("GruposLista");
                                __jsp_taghandler_161.setLabelProperty("descripcion");
                                __jsp_taghandler_161.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_161.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_161.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_161.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_161);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[179]);
                            /*@lineinfo:translated-code*//*@lineinfo:584^102*/                            } while (__jsp_taghandler_160.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_160.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_160);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[180]);
                        /*@lineinfo:translated-code*//*@lineinfo:588^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_162=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_162.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_162.setKey("activos.descripcion");
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
                        out.write(__jsp_StaticText.text[181]);
                        /*@lineinfo:translated-code*//*@lineinfo:589^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_163=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size value");
                          __jsp_taghandler_163.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_163.setMaxlength("50");
                          __jsp_taghandler_163.setName("RevaluosForm");
                          __jsp_taghandler_163.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_163.setProperty("act_descripcion");
                          __jsp_taghandler_163.setSize("50");
                          __jsp_taghandler_163.setValue("%");
                          __jsp_tag_starteval=__jsp_taghandler_163.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_163,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_163.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_163.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_163);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[182]);
                        /*@lineinfo:translated-code*//*@lineinfo:594^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_164=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_164.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_164.setOnclick("operacion.value=3;opcion.value=2");
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
                        out.write(__jsp_StaticText.text[183]);
                      /*@lineinfo:translated-code*//*@lineinfo:594^121*/                      } while (__jsp_taghandler_152.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_152.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_152);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[184]);
                  /*@lineinfo:translated-code*//*@lineinfo:598^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_165=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_165.setParent(__jsp_taghandler_125);
                    __jsp_taghandler_165.setName("RevaluosForm");
                    __jsp_taghandler_165.setProperty("opcion");
                    __jsp_taghandler_165.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_165.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[185]);
                        /*@lineinfo:translated-code*//*@lineinfo:600^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_166=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_166.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_166.setKey("revaluos.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_166.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_166.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_166.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_166);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[186]);
                        /*@lineinfo:translated-code*//*@lineinfo:601^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_167=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onchange property");
                          __jsp_taghandler_167.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_167.setDisabled(false);
                          __jsp_taghandler_167.setName("RevaluosForm");
                          __jsp_taghandler_167.setOnchange("quitar1()");
                          __jsp_taghandler_167.setProperty("rev_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_167.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_167,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[187]);
                              /*@lineinfo:translated-code*//*@lineinfo:602^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_168=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_168.setParent(__jsp_taghandler_167);
                                __jsp_taghandler_168.setCollection("RubrosLista");
                                __jsp_taghandler_168.setLabelProperty("descripcion");
                                __jsp_taghandler_168.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_168.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_168.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_168.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_168);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[188]);
                            /*@lineinfo:translated-code*//*@lineinfo:602^102*/                            } while (__jsp_taghandler_167.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_167.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_167);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[189]);
                        /*@lineinfo:translated-code*//*@lineinfo:606^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_169=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_169.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_169.setKey("revaluos.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_169.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_169.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_169.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_169);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[190]);
                        /*@lineinfo:translated-code*//*@lineinfo:607^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_170=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_170.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_170.setName("RevaluosForm");
                          __jsp_taghandler_170.setProperty("rev_codreg");
                          __jsp_tag_starteval=__jsp_taghandler_170.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_170,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_170.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_170.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_170);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[191]);
                        /*@lineinfo:translated-code*//*@lineinfo:608^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_171=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_171.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_171.setMaxlength("30");
                          __jsp_taghandler_171.setName("RevaluosForm");
                          __jsp_taghandler_171.setProperty("rev_regdescripcion");
                          __jsp_taghandler_171.setReadonly(true);
                          __jsp_taghandler_171.setSize("30");
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
                        out.write(__jsp_StaticText.text[192]);
                        /*@lineinfo:translated-code*//*@lineinfo:611^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_172=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_172.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_172.setKey("activos.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_172.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_172.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_172.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_172);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[193]);
                        /*@lineinfo:translated-code*//*@lineinfo:612^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_173=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_173.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_173.setDisabled(false);
                          __jsp_taghandler_173.setName("RevaluosForm");
                          __jsp_taghandler_173.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_173.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_173,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[194]);
                              /*@lineinfo:translated-code*//*@lineinfo:613^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_174=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_174.setParent(__jsp_taghandler_173);
                                __jsp_taghandler_174.setCollection("GruposLista");
                                __jsp_taghandler_174.setLabelProperty("descripcion");
                                __jsp_taghandler_174.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_174.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_174.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_174.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_174);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[195]);
                            /*@lineinfo:translated-code*//*@lineinfo:613^102*/                            } while (__jsp_taghandler_173.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_173.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_173);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[196]);
                        /*@lineinfo:translated-code*//*@lineinfo:617^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_175=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_175.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_175.setKey("activos.descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_175.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_175.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_175.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_175);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[197]);
                        /*@lineinfo:translated-code*//*@lineinfo:618^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_176=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size value");
                          __jsp_taghandler_176.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_176.setMaxlength("50");
                          __jsp_taghandler_176.setName("RevaluosForm");
                          __jsp_taghandler_176.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_176.setProperty("act_descripcion");
                          __jsp_taghandler_176.setSize("50");
                          __jsp_taghandler_176.setValue("%");
                          __jsp_tag_starteval=__jsp_taghandler_176.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_176,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_176.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_176.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_176);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[198]);
                        /*@lineinfo:translated-code*//*@lineinfo:623^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_177=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_177.setParent(__jsp_taghandler_165);
                          __jsp_taghandler_177.setOnclick("operacion.value=3;opcion.value=1");
                          __jsp_taghandler_177.setProperty("boton");
                          __jsp_taghandler_177.setStyleClass("boton1");
                          __jsp_taghandler_177.setValue("Insertar");
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
                        out.write(__jsp_StaticText.text[199]);
                      /*@lineinfo:translated-code*//*@lineinfo:623^120*/                      } while (__jsp_taghandler_165.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_165.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_165);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[200]);
                /*@lineinfo:translated-code*//*@lineinfo:626^20*/                } while (__jsp_taghandler_125.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_125.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_125);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[201]);
            /*@lineinfo:translated-code*//*@lineinfo:630^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_178=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_178.setParent(__jsp_taghandler_1);
              __jsp_taghandler_178.setName("RevaluosForm");
              __jsp_taghandler_178.setProperty("operacion");
              __jsp_taghandler_178.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_178.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[202]);
                  /*@lineinfo:translated-code*//*@lineinfo:635^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_179=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_179.setParent(__jsp_taghandler_178);
                    __jsp_taghandler_179.setName("RevaluosForm");
                    __jsp_taghandler_179.setProperty("rev_codrub");
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
                  out.write(__jsp_StaticText.text[203]);
                  /*@lineinfo:translated-code*//*@lineinfo:636^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_180=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_180.setParent(__jsp_taghandler_178);
                    __jsp_taghandler_180.setName("RevaluosForm");
                    __jsp_taghandler_180.setProperty("rev_codreg");
                    __jsp_tag_starteval=__jsp_taghandler_180.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_180,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_180.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_180.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_180);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[204]);
                  /*@lineinfo:translated-code*//*@lineinfo:637^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_181=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_181.setParent(__jsp_taghandler_178);
                    __jsp_taghandler_181.setName("RevaluosForm");
                    __jsp_taghandler_181.setProperty("act_codgrp");
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
                  out.write(__jsp_StaticText.text[205]);
                  /*@lineinfo:translated-code*//*@lineinfo:638^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_182=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_182.setParent(__jsp_taghandler_178);
                    __jsp_taghandler_182.setName("RevaluosForm");
                    __jsp_taghandler_182.setProperty("act_descripcion");
                    __jsp_tag_starteval=__jsp_taghandler_182.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_182,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_182.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_182.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_182);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[206]);
                  /*@lineinfo:translated-code*//*@lineinfo:643^10*/                  {
                    org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_183=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                    __jsp_taghandler_183.setParent(__jsp_taghandler_178);
                    __jsp_taghandler_183.setName("RevaluosForm");
                    __jsp_taghandler_183.setProperty("opcion");
                    __jsp_taghandler_183.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_183.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[207]);
                      /*@lineinfo:translated-code*//*@lineinfo:643^74*/                      } while (__jsp_taghandler_183.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_183.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_183);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[208]);
                  /*@lineinfo:user-code*//*@lineinfo:648^7*/                   int pnum=0;
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[209]);
                  /*@lineinfo:translated-code*//*@lineinfo:649^7*/                  {
                    org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_184=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
                    __jsp_taghandler_184.setParent(__jsp_taghandler_178);
                    __jsp_taghandler_184.setId("lista");
                    __jsp_taghandler_184.setName("Activos3Lista");
                    java.lang.Object lista = null;
                    __jsp_tag_starteval=__jsp_taghandler_184.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_184,__jsp_tag_starteval,out);
                      do {
                        lista = (java.lang.Object) pageContext.findAttribute("lista");
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[210]);
                        /*@lineinfo:user-code*//*@lineinfo:650^9*/                         if (pnum==1) {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[211]);
                        /*@lineinfo:user-code*//*@lineinfo:652^9*/                         } else { 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[212]);
                        /*@lineinfo:user-code*//*@lineinfo:654^9*/                         } 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[213]);
                        /*@lineinfo:translated-code*//*@lineinfo:655^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_185=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_185.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_185.setName("lista");
                          __jsp_taghandler_185.setProperty("codrub");
                          __jsp_tag_starteval=__jsp_taghandler_185.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_185.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_185.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_185);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[214]);
                        /*@lineinfo:translated-code*//*@lineinfo:655^62*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_186=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_186.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_186.setName("lista");
                          __jsp_taghandler_186.setProperty("codreg");
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
                        out.write(__jsp_StaticText.text[215]);
                        /*@lineinfo:translated-code*//*@lineinfo:655^108*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_187=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_187.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_187.setName("lista");
                          __jsp_taghandler_187.setProperty("ceros");
                          __jsp_tag_starteval=__jsp_taghandler_187.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_187.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_187.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_187);
                        }
/*@lineinfo:655^152*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_188=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_188.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_188.setName("lista");
                          __jsp_taghandler_188.setProperty("codigo");
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
                        out.write(__jsp_StaticText.text[216]);
                        /*@lineinfo:translated-code*//*@lineinfo:656^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_189=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_189.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_189.setName("lista");
                          __jsp_taghandler_189.setProperty("descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_189.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_189.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_189.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_189);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[217]);
                        /*@lineinfo:translated-code*//*@lineinfo:657^12*/                        {
                          org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_190=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                          __jsp_taghandler_190.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_190.setName("RevaluosForm");
                          __jsp_taghandler_190.setProperty("opcion");
                          __jsp_taghandler_190.setValue("1");
                          __jsp_tag_starteval=__jsp_taghandler_190.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[218]);
                              /*@lineinfo:translated-code*//*@lineinfo:658^16*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_191=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_191.setParent(__jsp_taghandler_190);
                                __jsp_taghandler_191.setName("lista");
                                __jsp_taghandler_191.setProperty("numrevaluo");
                                __jsp_tag_starteval=__jsp_taghandler_191.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_191.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_191.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_191);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[219]);
                            /*@lineinfo:translated-code*//*@lineinfo:658^65*/                            } while (__jsp_taghandler_190.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_190.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_190);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[220]);
                        /*@lineinfo:translated-code*//*@lineinfo:660^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_192=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_192.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_192.setName("RevaluosForm");
                          __jsp_taghandler_192.setProperty("opcion");
                          __jsp_taghandler_192.setValue("5");
                          __jsp_tag_starteval=__jsp_taghandler_192.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[221]);
                              /*@lineinfo:translated-code*//*@lineinfo:661^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_193=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_193.setParent(__jsp_taghandler_192);
                                __jsp_taghandler_193.setIndexed(true);
                                __jsp_taghandler_193.setOnclick("operacion.value=1;opcion.value=5");
                                __jsp_taghandler_193.setProperty("boton");
                                __jsp_taghandler_193.setStyleClass("boton1");
                                __jsp_taghandler_193.setValue("Consultar");
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
                              out.write(__jsp_StaticText.text[222]);
                            /*@lineinfo:translated-code*//*@lineinfo:661^160*/                            } while (__jsp_taghandler_192.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_192.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_192);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[223]);
                        /*@lineinfo:translated-code*//*@lineinfo:663^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_194=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_194.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_194.setName("RevaluosForm");
                          __jsp_taghandler_194.setProperty("opcion");
                          __jsp_taghandler_194.setValue("3");
                          __jsp_tag_starteval=__jsp_taghandler_194.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[224]);
                              /*@lineinfo:translated-code*//*@lineinfo:664^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_195=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_195.setParent(__jsp_taghandler_194);
                                __jsp_taghandler_195.setIndexed(true);
                                __jsp_taghandler_195.setOnclick("operacion.value=1;opcion.value=3");
                                __jsp_taghandler_195.setProperty("boton");
                                __jsp_taghandler_195.setStyleClass("boton1");
                                __jsp_taghandler_195.setValue("Eliminar");
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
                              out.write(__jsp_StaticText.text[225]);
                            /*@lineinfo:translated-code*//*@lineinfo:664^159*/                            } while (__jsp_taghandler_194.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_194.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_194);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[226]);
                        /*@lineinfo:translated-code*//*@lineinfo:666^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_196=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_196.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_196.setName("RevaluosForm");
                          __jsp_taghandler_196.setProperty("opcion");
                          __jsp_taghandler_196.setValue("2");
                          __jsp_tag_starteval=__jsp_taghandler_196.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[227]);
                              /*@lineinfo:translated-code*//*@lineinfo:667^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_197=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_197.setParent(__jsp_taghandler_196);
                                __jsp_taghandler_197.setIndexed(true);
                                __jsp_taghandler_197.setOnclick("operacion.value=1;opcion.value=2");
                                __jsp_taghandler_197.setProperty("boton");
                                __jsp_taghandler_197.setStyleClass("boton1");
                                __jsp_taghandler_197.setValue("Modificar");
                                __jsp_tag_starteval=__jsp_taghandler_197.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_197,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_197.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_197.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_197);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[228]);
                            /*@lineinfo:translated-code*//*@lineinfo:667^160*/                            } while (__jsp_taghandler_196.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_196.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_196);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[229]);
                        /*@lineinfo:translated-code*//*@lineinfo:669^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_198=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_198.setParent(__jsp_taghandler_184);
                          __jsp_taghandler_198.setName("RevaluosForm");
                          __jsp_taghandler_198.setProperty("opcion");
                          __jsp_taghandler_198.setValue("1");
                          __jsp_tag_starteval=__jsp_taghandler_198.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[230]);
                              /*@lineinfo:translated-code*//*@lineinfo:670^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_199=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_199.setParent(__jsp_taghandler_198);
                                __jsp_taghandler_199.setIndexed(true);
                                __jsp_taghandler_199.setOnclick("operacion.value=1;opcion.value=1");
                                __jsp_taghandler_199.setProperty("boton");
                                __jsp_taghandler_199.setStyleClass("boton1");
                                __jsp_taghandler_199.setValue("Insertar");
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
                              out.write(__jsp_StaticText.text[231]);
                            /*@lineinfo:translated-code*//*@lineinfo:670^159*/                            } while (__jsp_taghandler_198.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_198.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_198);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[232]);
                        /*@lineinfo:user-code*//*@lineinfo:673^10*/                         if (pnum==0) pnum=1; else pnum=0; 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[233]);
                      /*@lineinfo:translated-code*//*@lineinfo:673^49*/                      } while (__jsp_taghandler_184.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_184.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_184);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[234]);
                /*@lineinfo:translated-code*//*@lineinfo:674^23*/                } while (__jsp_taghandler_178.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_178.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_178);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[235]);
          /*@lineinfo:translated-code*//*@lineinfo:680^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[236]);


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
    private static final char text[][]=new char[237][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  var sesion=0\n  var dele0 = new Array()\n  var valo0 = new Array()\n  function validar(form)\n  {\n    hoy=devuelvehoy();\n    mensaje=\"\"\n    foco=\"\"\n  if (Number(form.opcion.value)!=5){\n    try {\n    i=form.rev_codrub.selectedIndex\n   \tif (!comboObligatorio(form.rev_codrub.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Rubro\\n\"\n\t\t  if (foco.length==0) foco=\"form.rev_codrub.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }\n    try {\n    i=form.rev_codreg.selectedIndex;\n   \tif (!comboObligatorio(form.rev_codreg.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Regional\\n\"\n\t\t  if (foco.length==0) foco=\"form.rev_codreg.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    i=form.act_codgrp.selectedIndex\n   \tif (!comboObligatorio(form.act_codgrp.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Grupo\\n\"\n\t\t  if (foco.length==0) foco=\"form.act_codgrp.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }    \n    try {\n    if (!textoObligatorio( form.rev_codigo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Código\\n\"\n\t\t  if (foco.length==0) foco=\"form.rev_codigo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n   \tif (!comboObligatorio(form.rev_codigo.value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Código <> 0\\n\"\n\t\t  if (foco.length==0) foco=\"form.rev_codigo.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!solonumeros(form.rev_codigo.value)){\n         mensaje=mensaje+\"Debe introducir Números en Código\\n\"\n         if (foco.length==0) foco=\"form.rev_codigo.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }\n\n\n    try {\n    if (!textoObligatorio( form.rev_numrevaluo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Número de Revaluo\\n\"\n\t\t  if (foco.length==0) foco=\"form.rev_numrevaluo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n   \tif (!comboObligatorio(form.rev_numrevaluo.value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Número de Revaluo <> 0\\n\"\n\t\t  if (foco.length==0) foco=\"form.rev_numrevaluo.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!solonumeros(form.rev_numrevaluo.value)){\n         mensaje=mensaje+\"Debe introducir Números en Número de Revaluo\\n\"\n         if (foco.length==0) foco=\"form.rev_numrevaluo.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!esFecha(form.rev_fecha.value)){\n      mensaje=mensaje+\"Debe introducir Fecha dd/mm/yyyy\\n\"\n      if (foco.length==0) foco=\"form.rev_fecha.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!ComparaFechas(form.rev_fecha.value,form.fecha_rev.value)){\n      mensaje=mensaje+\"Debe introducir Fecha mayor o igual a \" + form.fecha_rev.value + \"\\n\"\n      if (foco.length==0) foco=\"form.rev_fecha.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!ComparaFechas(hoy, form.rev_fecha.value)){\n      mensaje=mensaje+\"Debe introducir Fecha menor o igual a hoy\\n\"\n      if (foco.length==0) foco=\"form.rev_fecha.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    var sMes0 = form.rev_fecha.value;\n    var sAno0 = form.rev_fecha.value;\n    if ((sMes0.substr(3,2)!=form.mes.value)||(sAno0.substr(6,4)!=form.anio.value)){\n      mensaje=mensaje+\"Debe introducir Fecha igual al Periodo \"+form.anio.value+form.mes.value+\" de proceso\\n\"\n      if (foco.length==0) foco=\"form.rev_fecha.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio(form.rev_valcobol.value)){\n      mensaje=mensaje+\"Debe introducir Valor en Bolivianos\\n\"\n      if (foco.length==0) foco=\"form.rev_valcobol.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!solonumeros(form.rev_valcobol.value)){\n         mensaje=mensaje+\"Debe introducir Números en Valor en Bolivianos\\n\"\n         if (foco.length==0) foco=\"form.rev_valcobol.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }    \n    try {\n    if (Number(form.rev_valbol.value)<=0){\n      mensaje=mensaje+\"Debe introducir Valor en Bolivianos\\n\"\n      if (foco.length==0) foco=\"form.rev_valbol.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    i=form.rev_estadoactivo.selectedIndex\n   \tif (!comboObligatorio(form.rev_estadoactivo.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Estado de Activo\\n\"\n\t\t  if (foco.length==0) foco=\"form.rev_estadoactivo.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }\n    try {\n    if (!textoObligatorio(form.act_descripcion.value)){\n      mensaje=mensaje+\"Debe introducir Descripción\\n\"\n      if (foco.length==0) foco=\"form.act_descripcion.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio(form.rev_vidaut.value)){\n      mensaje=mensaje+\"Debe introducir Vida Útil\\n\"\n      if (foco.length==0) foco=\"form.rev_vidaut.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!solonumerosint(form.rev_vidaut.value)){\n         mensaje=mensaje+\"Debe introducir Números en Vida Útil\\n\"\n         if (foco.length==0) foco=\"form.rev_vidaut.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }        \n    try {\n      if (Number(form.rev_vidaut.value)>Number(form.rub_vidaut.value)){\n         mensaje=mensaje+\"Debe introducir Vida Útil menor o igual a \" + form.rub_vidaut.value + \"\\n\"\n         if (foco.length==0) foco=\"form.rev_vidaut.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }        \n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }\n  }\n  function cargar1() {\n     for\t(var i=0; i < document.RevaluosForm.act_codgrp.options.length; i++) {\n           valo0[i]=document.RevaluosForm.act_codgrp.options[i].value\n           dele0[i]=document.RevaluosForm.act_codgrp.options[i].text\n     }\n  }  \n  function quitar1()\n  {\n     var j=0\n     var k=0\n     var t=0\n     dele = new Array()\n     valo = new Array()\n\n     for \t(var i=0; i < document.RevaluosForm.rev_codrub.options.length; i++) {\n        if (document.RevaluosForm.rev_codrub.options[i].selected==true) {\n           k=i\n        }\n     }\n\n     if (sesion==0) {\n        m=0\n        for \t(var i=1; i < document.RevaluosForm.act_codgrp.options.length; i++) {\n           valor=document.RevaluosForm.act_codgrp.options[i].text\n           if (valor.substr(0,valor.indexOf(\"-\"))==document.RevaluosForm.rev_codrub.options[k].text) {       \n              valor=document.RevaluosForm.act_codgrp.options[i].text\n              valor=valor\n              dele[m]=valor.substr(valor.indexOf(\"-\")+1)\n              valo[m]=document.RevaluosForm.act_codgrp.options[i].value\n              m=m+1   \n           }\n        }\n        sesion=sesion+1\n     }\n     else {\n        m=0\n        for \t(var i=1; i < valo0.length; i++) {\n           valor=dele0[i]\n           if (valor.substr(0,valor.indexOf(\"-\"))==document.RevaluosForm.rev_codrub.options[k].text) {       \n              valor=dele0[i]\n              valor=valor\n              dele[m]=valor.substr(valor.indexOf(\"-\")+1)\n              valo[m]=valo0[i]\n              m=m+1   \n           }\n        }\n     }\n\n     lon=document.RevaluosForm.act_codgrp.options.length\n     for \t(var i=1; i < lon; i++) {\n        document.RevaluosForm.act_codgrp.options[0]=null           \n     }\n     document.RevaluosForm.act_codgrp.options[0]=null\n     n=0\n     for \t(var i=0; i < m; i++) {\n        valor=\"var option0 = new Option(dele[i], valo[i])\"\n        eval(valor)\n        eval(\"document.RevaluosForm.act_codgrp.options[n]=option0\") \n        n=++n\n     }     \n  }\n</script>\n<body onload=\"cargar1()\">\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n".toCharArray();
      text[8] = 
      "\n".toCharArray();
      text[9] = 
      "\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n<caption>Revaluos</caption>\n".toCharArray();
      text[10] = 
      "\n   ".toCharArray();
      text[11] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[12] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[13] = 
      "\n         ".toCharArray();
      text[14] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[15] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[16] = 
      "\n         ".toCharArray();
      text[17] = 
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[18] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[19] = 
      "\n         ".toCharArray();
      text[20] = 
      "</td>\n      </tr>            \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[21] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[22] = 
      "\n         ".toCharArray();
      text[23] = 
      "\n         ".toCharArray();
      text[24] = 
      "\n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[25] = 
      "</td>\n         <td>".toCharArray();
      text[26] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[27] = 
      "</td>\n         <td>".toCharArray();
      text[28] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[29] = 
      "</td>\n         <td>".toCharArray();
      text[30] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[31] = 
      "</td>\n         <td>".toCharArray();
      text[32] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[33] = 
      "</td>\n         <td>".toCharArray();
      text[34] = 
      "\n             ".toCharArray();
      text[35] = 
      "\n             ".toCharArray();
      text[36] = 
      "\n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[37] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[38] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[39] = 
      "</td>\n         <td>".toCharArray();
      text[40] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=6>".toCharArray();
      text[41] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[42] = 
      "\n   ".toCharArray();
      text[43] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[44] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[45] = 
      "\n         ".toCharArray();
      text[46] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[47] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[48] = 
      "\n         ".toCharArray();
      text[49] = 
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[50] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[51] = 
      "\n         ".toCharArray();
      text[52] = 
      "</td>\n      </tr>            \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[53] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[54] = 
      "\n         ".toCharArray();
      text[55] = 
      "\n         ".toCharArray();
      text[56] = 
      "\n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[57] = 
      "</td>\n         <td>".toCharArray();
      text[58] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[59] = 
      "</td>\n         <td>".toCharArray();
      text[60] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[61] = 
      "</td>\n         <td>".toCharArray();
      text[62] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[63] = 
      "</td>\n         <td>".toCharArray();
      text[64] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[65] = 
      "</td>\n         <td>".toCharArray();
      text[66] = 
      "\n             ".toCharArray();
      text[67] = 
      "\n             ".toCharArray();
      text[68] = 
      "\n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[69] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[70] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[71] = 
      "</td>\n         <td>".toCharArray();
      text[72] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=6>".toCharArray();
      text[73] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[74] = 
      "\n   ".toCharArray();
      text[75] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[76] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[77] = 
      "\n         ".toCharArray();
      text[78] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[79] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[80] = 
      "\n         ".toCharArray();
      text[81] = 
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[82] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[83] = 
      "\n         ".toCharArray();
      text[84] = 
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[85] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[86] = 
      "\n         ".toCharArray();
      text[87] = 
      "\n         ".toCharArray();
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
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[95] = 
      "</td>\n         <td>".toCharArray();
      text[96] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[97] = 
      "</td>\n         <td>".toCharArray();
      text[98] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[99] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[100] = 
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[101] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[102] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=\"6\">".toCharArray();
      text[103] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[104] = 
      "\n   ".toCharArray();
      text[105] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
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
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[112] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[113] = 
      "\n         ".toCharArray();
      text[114] = 
      "</td>\n      </tr>       \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[115] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[116] = 
      "\n         ".toCharArray();
      text[117] = 
      "\n         ".toCharArray();
      text[118] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[119] = 
      "</td>\n         <td>".toCharArray();
      text[120] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[121] = 
      "</td>\n         <td>".toCharArray();
      text[122] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[123] = 
      "</td>\n         <td>".toCharArray();
      text[124] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[125] = 
      "</td>\n         <td>".toCharArray();
      text[126] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[127] = 
      "</td>\n         <td>".toCharArray();
      text[128] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[129] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[130] = 
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[131] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[132] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=\"6\">".toCharArray();
      text[133] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[134] = 
      "   \n".toCharArray();
      text[135] = 
      "\n".toCharArray();
      text[136] = 
      "\n  <tr class=\"T8a\">\n     <td>\n     ".toCharArray();
      text[137] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[138] = 
      "</td>\n           <td>".toCharArray();
      text[139] = 
      "\n               ".toCharArray();
      text[140] = 
      "\n              ".toCharArray();
      text[141] = 
      "</td> \n        </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[142] = 
      "</td>\n            <td>".toCharArray();
      text[143] = 
      "\n            ".toCharArray();
      text[144] = 
      "</td>\n        </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[145] = 
      "</td>\n           <td>".toCharArray();
      text[146] = 
      "\n               ".toCharArray();
      text[147] = 
      "\n              ".toCharArray();
      text[148] = 
      "</td> \n        </tr>     \n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[149] = 
      " % = Comodin</td>\n           <td>".toCharArray();
      text[150] = 
      "</td>\n        </tr> \n        <tr>\n        <td></td>\n        <td align=\"left\">\n        ".toCharArray();
      text[151] = 
      "\n        </td>\n        </tr>\n     ".toCharArray();
      text[152] = 
      "\n     ".toCharArray();
      text[153] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[154] = 
      "</td>\n           <td>".toCharArray();
      text[155] = 
      "\n               ".toCharArray();
      text[156] = 
      "\n              ".toCharArray();
      text[157] = 
      "</td> \n        </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[158] = 
      "</td>\n            <td>".toCharArray();
      text[159] = 
      "\n            ".toCharArray();
      text[160] = 
      "</td>\n        </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[161] = 
      "</td>\n           <td>".toCharArray();
      text[162] = 
      "\n               ".toCharArray();
      text[163] = 
      "\n              ".toCharArray();
      text[164] = 
      "</td> \n        </tr>     \n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[165] = 
      " % = Comodin</td>\n           <td>".toCharArray();
      text[166] = 
      "</td>\n        </tr> \n        <tr>\n        <td></td>\n        <td align=\"left\">\n        ".toCharArray();
      text[167] = 
      "\n        </td>\n        </tr>\n     ".toCharArray();
      text[168] = 
      "\n     ".toCharArray();
      text[169] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[170] = 
      "</td>\n           <td>".toCharArray();
      text[171] = 
      "\n               ".toCharArray();
      text[172] = 
      "\n              ".toCharArray();
      text[173] = 
      "</td>           \n        </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[174] = 
      "</td>\n            <td>".toCharArray();
      text[175] = 
      "\n            ".toCharArray();
      text[176] = 
      "</td>\n        </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[177] = 
      "</td>\n           <td>".toCharArray();
      text[178] = 
      "\n               ".toCharArray();
      text[179] = 
      "\n              ".toCharArray();
      text[180] = 
      "</td>           \n        </tr>    \n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[181] = 
      " % = Comodin</td>\n           <td>".toCharArray();
      text[182] = 
      "</td>\n        </tr> \n        <tr>\n        <td></td>\n        <td align=\"left\">\n        ".toCharArray();
      text[183] = 
      "\n        </td>\n        </tr>\n     ".toCharArray();
      text[184] = 
      "\n     ".toCharArray();
      text[185] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[186] = 
      "</td>\n           <td>".toCharArray();
      text[187] = 
      "\n               ".toCharArray();
      text[188] = 
      "\n              ".toCharArray();
      text[189] = 
      "</td>           \n        </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[190] = 
      "</td>\n            <td>".toCharArray();
      text[191] = 
      "\n            ".toCharArray();
      text[192] = 
      "</td>\n        </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[193] = 
      "</td>\n           <td>".toCharArray();
      text[194] = 
      "\n               ".toCharArray();
      text[195] = 
      "\n              ".toCharArray();
      text[196] = 
      "</td>           \n        </tr>        \n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[197] = 
      " % = Comodin</td>\n           <td>".toCharArray();
      text[198] = 
      "</td>\n        </tr> \n        <tr>\n        <td></td>\n        <td align=\"left\">\n        ".toCharArray();
      text[199] = 
      "\n        </td>\n        </tr>\n     ".toCharArray();
      text[200] = 
      "\n     </td>\n   </tr>\n".toCharArray();
      text[201] = 
      "\n".toCharArray();
      text[202] = 
      "\n  <tr class=\"T8a\">\n     <td>\n     <table width=\"100%\" align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n     <tr><td>\n     ".toCharArray();
      text[203] = 
      "\n     ".toCharArray();
      text[204] = 
      "\n     ".toCharArray();
      text[205] = 
      "     \n     ".toCharArray();
      text[206] = 
      "\n      <table width=\"100%\" class=\"soloborde\" bgcolor=\"#C1C1FF\">\n       <tr class=\"FondoAzul\">\n         <td width=\"80\" scope=\"col\" class=\"S10c\">Código</td>\n         <td width=\"160\" scope=\"col\" class=\"S10c\">Descripción</td>\n         ".toCharArray();
      text[207] = 
      "\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Revaluo</td>\n         ".toCharArray();
      text[208] = 
      "\n         <td></td>\n       </tr>\n      ".toCharArray();
      text[209] = 
      "\n      ".toCharArray();
      text[210] = 
      "\n        ".toCharArray();
      text[211] = 
      "\n           <tr class=\"T8b\">\n        ".toCharArray();
      text[212] = 
      "\n           <tr class=\"T8a\">\n        ".toCharArray();
      text[213] = 
      "\n           <td>".toCharArray();
      text[214] = 
      "-".toCharArray();
      text[215] = 
      "-".toCharArray();
      text[216] = 
      "</td>\n           <td>".toCharArray();
      text[217] = 
      "</td>\n           ".toCharArray();
      text[218] = 
      "\n           <td>".toCharArray();
      text[219] = 
      "</td>\n           ".toCharArray();
      text[220] = 
      "\n           ".toCharArray();
      text[221] = 
      "\n              <td align=\"right\">".toCharArray();
      text[222] = 
      "</td>\n           ".toCharArray();
      text[223] = 
      "\n           ".toCharArray();
      text[224] = 
      "\n              <td align=\"right\">".toCharArray();
      text[225] = 
      "</td>\n           ".toCharArray();
      text[226] = 
      "     \n           ".toCharArray();
      text[227] = 
      "\n              <td align=\"right\">".toCharArray();
      text[228] = 
      "</td>\n           ".toCharArray();
      text[229] = 
      "     \n           ".toCharArray();
      text[230] = 
      "\n              <td align=\"right\">".toCharArray();
      text[231] = 
      "</td>\n           ".toCharArray();
      text[232] = 
      "     \n         </tr>\n         ".toCharArray();
      text[233] = 
      "\n      ".toCharArray();
      text[234] = 
      "\n      </table>\n     </td></tr>     \n     </table>\n     </td>\n   </tr>\n".toCharArray();
      text[235] = 
      "\n<tr><td align=\"center\" colspan=\"2\" class=\"S10d\">(*) Campos Obligatorios</td></tr>\n</table>\n".toCharArray();
      text[236] = 
      "\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
