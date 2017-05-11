  /*@lineinfo:filename=/Funcionarios.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Funcionarios extends oracle.jsp.runtime.HttpJsp {

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
    _Funcionarios page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:185^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/funcionariosAction");
        __jsp_taghandler_1.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:186^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:187^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:190^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("FuncionariosForm");
              __jsp_taghandler_4.setProperty("operacion");
              __jsp_taghandler_4.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:191^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("FuncionariosForm");
                    __jsp_taghandler_5.setProperty("opcion");
                    __jsp_taghandler_5.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[9]);
                        /*@lineinfo:translated-code*//*@lineinfo:193^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setKey("funcionarios.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:194^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_7.setMaxlength("5");
                          __jsp_taghandler_7.setName("FuncionariosForm");
                          __jsp_taghandler_7.setProperty("fun_codigo");
                          __jsp_taghandler_7.setSize("5");
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
                        /*@lineinfo:translated-code*//*@lineinfo:197^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_8.setKey("funcionarios.descripcion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:198^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_9.setMaxlength("50");
                          __jsp_taghandler_9.setName("FuncionariosForm");
                          __jsp_taghandler_9.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_9.setProperty("fun_descripcion");
                          __jsp_taghandler_9.setSize("50");
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
                        /*@lineinfo:translated-code*//*@lineinfo:201^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_10=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_10.setKey("funcionarios.cargo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:202^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_11=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_11.setMaxlength("50");
                          __jsp_taghandler_11.setName("FuncionariosForm");
                          __jsp_taghandler_11.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_11.setProperty("fun_cargo");
                          __jsp_taghandler_11.setSize("50");
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
                        /*@lineinfo:translated-code*//*@lineinfo:205^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_12=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_12.setKey("funcionarios.codreg");
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
                        /*@lineinfo:translated-code*//*@lineinfo:206^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_13=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_13.setName("FuncionariosForm");
                          __jsp_taghandler_13.setProperty("fun_codreg");
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
                        /*@lineinfo:translated-code*//*@lineinfo:207^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_14=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_14.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_14.setMaxlength("30");
                          __jsp_taghandler_14.setName("FuncionariosForm");
                          __jsp_taghandler_14.setProperty("descripcion_codreg");
                          __jsp_taghandler_14.setReadonly(true);
                          __jsp_taghandler_14.setSize("30");
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
                        /*@lineinfo:translated-code*//*@lineinfo:210^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_15=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_15.setKey("funcionarios.codofi");
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
                        /*@lineinfo:translated-code*//*@lineinfo:211^15*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_16=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_16.setDisabled(false);
                          __jsp_taghandler_16.setName("FuncionariosForm");
                          __jsp_taghandler_16.setProperty("fun_codofi");
                          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[20]);
                              /*@lineinfo:translated-code*//*@lineinfo:212^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_17=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                                __jsp_taghandler_17.setCollection("OficinasLista");
                                __jsp_taghandler_17.setLabelProperty("descripcion");
                                __jsp_taghandler_17.setProperty("codigo");
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
                            /*@lineinfo:translated-code*//*@lineinfo:212^105*/                            } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[22]);
                        /*@lineinfo:translated-code*//*@lineinfo:216^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_18.setKey("funcionarios.codfin");
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
                        out.write(__jsp_StaticText.text[23]);
                        /*@lineinfo:translated-code*//*@lineinfo:217^15*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_19=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_19.setDisabled(false);
                          __jsp_taghandler_19.setName("FuncionariosForm");
                          __jsp_taghandler_19.setProperty("fun_codfin");
                          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[24]);
                              /*@lineinfo:translated-code*//*@lineinfo:218^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_20=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                                __jsp_taghandler_20.setCollection("FinanciadoresLista");
                                __jsp_taghandler_20.setLabelProperty("descripcion");
                                __jsp_taghandler_20.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[25]);
                            /*@lineinfo:translated-code*//*@lineinfo:218^108*/                            } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[26]);
                        /*@lineinfo:translated-code*//*@lineinfo:222^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_21=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_21.setKey("funcionarios.correo");
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
                        out.write(__jsp_StaticText.text[27]);
                        /*@lineinfo:translated-code*//*@lineinfo:223^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_22=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_22.setMaxlength("50");
                          __jsp_taghandler_22.setName("FuncionariosForm");
                          __jsp_taghandler_22.setProperty("fun_correo");
                          __jsp_taghandler_22.setSize("50");
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
                        out.write(__jsp_StaticText.text[28]);
                        /*@lineinfo:translated-code*//*@lineinfo:226^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_23=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_23.setOnclick("operacion.value=2;opcion.value=1");
                          __jsp_taghandler_23.setProperty("boton");
                          __jsp_taghandler_23.setStyleClass("boton1");
                          __jsp_taghandler_23.setValue("Insertar");
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
                        out.write(__jsp_StaticText.text[29]);
                        /*@lineinfo:translated-code*//*@lineinfo:227^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_24=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_24.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_24.setProperty("boton");
                          __jsp_taghandler_24.setStyleClass("boton1");
                          __jsp_taghandler_24.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[30]);
                      /*@lineinfo:translated-code*//*@lineinfo:227^140*/                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[31]);
                  /*@lineinfo:translated-code*//*@lineinfo:230^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_25=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_25.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_25.setName("FuncionariosForm");
                    __jsp_taghandler_25.setProperty("opcion");
                    __jsp_taghandler_25.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[32]);
                        /*@lineinfo:translated-code*//*@lineinfo:232^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_26=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_26.setKey("funcionarios.codigo");
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
                        out.write(__jsp_StaticText.text[33]);
                        /*@lineinfo:translated-code*//*@lineinfo:233^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_27=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_27.setMaxlength("5");
                          __jsp_taghandler_27.setName("FuncionariosForm");
                          __jsp_taghandler_27.setProperty("fun_codigo");
                          __jsp_taghandler_27.setReadonly(true);
                          __jsp_taghandler_27.setSize("5");
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
                        out.write(__jsp_StaticText.text[34]);
                        /*@lineinfo:translated-code*//*@lineinfo:236^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_28=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_28.setKey("funcionarios.descripcion");
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
                        out.write(__jsp_StaticText.text[35]);
                        /*@lineinfo:translated-code*//*@lineinfo:237^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_29=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_29.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_29.setMaxlength("50");
                          __jsp_taghandler_29.setName("FuncionariosForm");
                          __jsp_taghandler_29.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_29.setProperty("fun_descripcion");
                          __jsp_taghandler_29.setSize("50");
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
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:240^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_30=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_30.setKey("funcionarios.cargo");
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
                        out.write(__jsp_StaticText.text[37]);
                        /*@lineinfo:translated-code*//*@lineinfo:241^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_31=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_31.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_31.setMaxlength("50");
                          __jsp_taghandler_31.setName("FuncionariosForm");
                          __jsp_taghandler_31.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_31.setProperty("fun_cargo");
                          __jsp_taghandler_31.setSize("50");
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
                        out.write(__jsp_StaticText.text[38]);
                        /*@lineinfo:translated-code*//*@lineinfo:244^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_32=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_32.setKey("funcionarios.codreg");
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
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:245^15*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_33=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onchange property");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_33.setDisabled(false);
                          __jsp_taghandler_33.setName("FuncionariosForm");
                          __jsp_taghandler_33.setOnchange("quitar()");
                          __jsp_taghandler_33.setProperty("fun_codreg");
                          __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_33,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[40]);
                              /*@lineinfo:translated-code*//*@lineinfo:246^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_34=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                                __jsp_taghandler_34.setCollection("RegionalesLista");
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
                              out.write(__jsp_StaticText.text[41]);
                            /*@lineinfo:translated-code*//*@lineinfo:246^105*/                            } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[42]);
                        /*@lineinfo:translated-code*//*@lineinfo:250^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_35=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_35.setKey("funcionarios.codofi");
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
                        out.write(__jsp_StaticText.text[43]);
                        /*@lineinfo:translated-code*//*@lineinfo:251^15*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_36=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_36.setDisabled(false);
                          __jsp_taghandler_36.setName("FuncionariosForm");
                          __jsp_taghandler_36.setProperty("fun_codofi");
                          __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_36,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[44]);
                              /*@lineinfo:translated-code*//*@lineinfo:252^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_37=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                                __jsp_taghandler_37.setCollection("OficinasLista1");
                                __jsp_taghandler_37.setLabelProperty("descripcion_codofi");
                                __jsp_taghandler_37.setProperty("codofi");
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
                              out.write(__jsp_StaticText.text[45]);
                            /*@lineinfo:translated-code*//*@lineinfo:252^111*/                            } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[46]);
                        /*@lineinfo:translated-code*//*@lineinfo:256^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_38=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_38.setKey("funcionarios.codfin");
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
                        out.write(__jsp_StaticText.text[47]);
                        /*@lineinfo:translated-code*//*@lineinfo:257^15*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_39=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_39.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_39.setDisabled(false);
                          __jsp_taghandler_39.setName("FuncionariosForm");
                          __jsp_taghandler_39.setProperty("fun_codfin");
                          __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_39,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[48]);
                              /*@lineinfo:translated-code*//*@lineinfo:258^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_40=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                                __jsp_taghandler_40.setCollection("FinanciadoresLista");
                                __jsp_taghandler_40.setLabelProperty("descripcion");
                                __jsp_taghandler_40.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[49]);
                            /*@lineinfo:translated-code*//*@lineinfo:258^108*/                            } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[50]);
                        /*@lineinfo:translated-code*//*@lineinfo:262^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_41=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_41.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_41.setKey("funcionarios.correo");
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
                        out.write(__jsp_StaticText.text[51]);
                        /*@lineinfo:translated-code*//*@lineinfo:263^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_42=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_42.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_42.setMaxlength("50");
                          __jsp_taghandler_42.setName("FuncionariosForm");
                          __jsp_taghandler_42.setProperty("fun_correo");
                          __jsp_taghandler_42.setSize("50");
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
                        out.write(__jsp_StaticText.text[52]);
                        /*@lineinfo:translated-code*//*@lineinfo:266^11*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_43=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_43.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_43.setName("FuncionariosForm");
                          __jsp_taghandler_43.setProperty("fun_estado");
                          __jsp_taghandler_43.setValue("A");
                          __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[53]);
                              /*@lineinfo:translated-code*//*@lineinfo:267^28*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_44=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_44.setParent(__jsp_taghandler_43);
                                __jsp_taghandler_44.setKey("funcionarios.estado");
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
                              out.write(__jsp_StaticText.text[54]);
                            /*@lineinfo:translated-code*//*@lineinfo:267^70*/                            } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[55]);
                        /*@lineinfo:translated-code*//*@lineinfo:272^11*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_45=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_45.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_45.setName("FuncionariosForm");
                          __jsp_taghandler_45.setProperty("fun_estado");
                          __jsp_taghandler_45.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[56]);
                              /*@lineinfo:translated-code*//*@lineinfo:273^28*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_46=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                                __jsp_taghandler_46.setKey("funcionarios.estado");
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
                              out.write(__jsp_StaticText.text[57]);
                            /*@lineinfo:translated-code*//*@lineinfo:273^70*/                            } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[58]);
                        /*@lineinfo:translated-code*//*@lineinfo:280^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_47=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_47.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_47.setOnclick("operacion.value=2;opcion.value=2");
                          __jsp_taghandler_47.setProperty("boton");
                          __jsp_taghandler_47.setStyleClass("boton1");
                          __jsp_taghandler_47.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[59]);
                        /*@lineinfo:translated-code*//*@lineinfo:281^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_48=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_48.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_48.setProperty("boton");
                          __jsp_taghandler_48.setStyleClass("boton1");
                          __jsp_taghandler_48.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[60]);
                      /*@lineinfo:translated-code*//*@lineinfo:281^140*/                      } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[61]);
                  /*@lineinfo:translated-code*//*@lineinfo:284^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_49=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_49.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_49.setName("FuncionariosForm");
                    __jsp_taghandler_49.setProperty("opcion");
                    __jsp_taghandler_49.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[62]);
                        /*@lineinfo:translated-code*//*@lineinfo:286^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_50=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_50.setKey("funcionarios.codigo");
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
                        out.write(__jsp_StaticText.text[63]);
                        /*@lineinfo:translated-code*//*@lineinfo:287^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_51=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_51.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_51.setMaxlength("5");
                          __jsp_taghandler_51.setName("FuncionariosForm");
                          __jsp_taghandler_51.setProperty("fun_codigo");
                          __jsp_taghandler_51.setReadonly(true);
                          __jsp_taghandler_51.setSize("5");
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
                        out.write(__jsp_StaticText.text[64]);
                        /*@lineinfo:translated-code*//*@lineinfo:290^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_52=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_52.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_52.setKey("funcionarios.descripcion");
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
                        out.write(__jsp_StaticText.text[65]);
                        /*@lineinfo:translated-code*//*@lineinfo:291^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_53=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_53.setMaxlength("50");
                          __jsp_taghandler_53.setName("FuncionariosForm");
                          __jsp_taghandler_53.setProperty("fun_descripcion");
                          __jsp_taghandler_53.setReadonly(true);
                          __jsp_taghandler_53.setSize("50");
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
                        out.write(__jsp_StaticText.text[66]);
                        /*@lineinfo:translated-code*//*@lineinfo:294^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_54=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_54.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_54.setKey("funcionarios.cargo");
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
                        out.write(__jsp_StaticText.text[67]);
                        /*@lineinfo:translated-code*//*@lineinfo:295^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_55=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_55.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_55.setMaxlength("50");
                          __jsp_taghandler_55.setName("FuncionariosForm");
                          __jsp_taghandler_55.setProperty("fun_cargo");
                          __jsp_taghandler_55.setReadonly(true);
                          __jsp_taghandler_55.setSize("50");
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
                        out.write(__jsp_StaticText.text[68]);
                        /*@lineinfo:translated-code*//*@lineinfo:298^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_56=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_56.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_56.setKey("funcionarios.codreg");
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
                        out.write(__jsp_StaticText.text[69]);
                        /*@lineinfo:translated-code*//*@lineinfo:299^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_57=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_57.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_57.setName("FuncionariosForm");
                          __jsp_taghandler_57.setProperty("fun_codreg");
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
                        out.write(__jsp_StaticText.text[70]);
                        /*@lineinfo:translated-code*//*@lineinfo:300^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_58=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_58.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_58.setMaxlength("30");
                          __jsp_taghandler_58.setName("FuncionariosForm");
                          __jsp_taghandler_58.setProperty("descripcion_codreg");
                          __jsp_taghandler_58.setReadonly(true);
                          __jsp_taghandler_58.setSize("30");
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
                        out.write(__jsp_StaticText.text[71]);
                        /*@lineinfo:translated-code*//*@lineinfo:303^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_59=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_59.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_59.setKey("funcionarios.codofi");
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
                        out.write(__jsp_StaticText.text[72]);
                        /*@lineinfo:translated-code*//*@lineinfo:304^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_60=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_60.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_60.setName("FuncionariosForm");
                          __jsp_taghandler_60.setProperty("fun_codofi");
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
                        out.write(__jsp_StaticText.text[73]);
                        /*@lineinfo:translated-code*//*@lineinfo:305^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_61=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_61.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_61.setMaxlength("30");
                          __jsp_taghandler_61.setName("FuncionariosForm");
                          __jsp_taghandler_61.setProperty("descripcion_codofi");
                          __jsp_taghandler_61.setReadonly(true);
                          __jsp_taghandler_61.setSize("30");
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
                        out.write(__jsp_StaticText.text[74]);
                        /*@lineinfo:translated-code*//*@lineinfo:308^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_62=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_62.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_62.setKey("funcionarios.codfin");
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
                        out.write(__jsp_StaticText.text[75]);
                        /*@lineinfo:translated-code*//*@lineinfo:309^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_63=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_63.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_63.setName("FuncionariosForm");
                          __jsp_taghandler_63.setProperty("fun_codfin");
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
                        out.write(__jsp_StaticText.text[76]);
                        /*@lineinfo:translated-code*//*@lineinfo:310^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_64=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_64.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_64.setMaxlength("30");
                          __jsp_taghandler_64.setName("FuncionariosForm");
                          __jsp_taghandler_64.setProperty("descripcion_codfin");
                          __jsp_taghandler_64.setReadonly(true);
                          __jsp_taghandler_64.setSize("30");
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
                        out.write(__jsp_StaticText.text[77]);
                        /*@lineinfo:translated-code*//*@lineinfo:313^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_65=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_65.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_65.setKey("funcionarios.correo");
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
                        out.write(__jsp_StaticText.text[78]);
                        /*@lineinfo:translated-code*//*@lineinfo:314^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_66=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_66.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_66.setMaxlength("50");
                          __jsp_taghandler_66.setName("FuncionariosForm");
                          __jsp_taghandler_66.setProperty("fun_correo");
                          __jsp_taghandler_66.setReadonly(true);
                          __jsp_taghandler_66.setSize("50");
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
                        out.write(__jsp_StaticText.text[79]);
                        /*@lineinfo:translated-code*//*@lineinfo:317^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_67=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_67.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_67.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_67.setProperty("boton");
                          __jsp_taghandler_67.setStyleClass("boton1");
                          __jsp_taghandler_67.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[80]);
                        /*@lineinfo:translated-code*//*@lineinfo:318^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_68=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_68.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_68.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_68.setProperty("boton");
                          __jsp_taghandler_68.setStyleClass("boton1");
                          __jsp_taghandler_68.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[81]);
                      /*@lineinfo:translated-code*//*@lineinfo:318^140*/                      } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[82]);
                /*@lineinfo:translated-code*//*@lineinfo:320^18*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[83]);
            /*@lineinfo:translated-code*//*@lineinfo:325^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_69=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_69.setParent(__jsp_taghandler_1);
              __jsp_taghandler_69.setKey("funcionarios.codigo");
              __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_69.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[84]);
            /*@lineinfo:translated-code*//*@lineinfo:326^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_70=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_70.setParent(__jsp_taghandler_1);
              __jsp_taghandler_70.setKey("funcionarios.descripcion");
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
            out.write(__jsp_StaticText.text[85]);
            /*@lineinfo:translated-code*//*@lineinfo:327^44*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_71=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_71.setParent(__jsp_taghandler_1);
              __jsp_taghandler_71.setKey("funcionarios.cargo");
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
            out.write(__jsp_StaticText.text[86]);
            /*@lineinfo:translated-code*//*@lineinfo:328^44*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_72=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_72.setParent(__jsp_taghandler_1);
              __jsp_taghandler_72.setKey("funcionarios.codofi");
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
            out.write(__jsp_StaticText.text[87]);
            /*@lineinfo:translated-code*//*@lineinfo:329^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_73=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_73.setParent(__jsp_taghandler_1);
              __jsp_taghandler_73.setKey("oficinas.descripcion");
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
            out.write(__jsp_StaticText.text[88]);
            /*@lineinfo:translated-code*//*@lineinfo:330^44*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_74=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_74.setParent(__jsp_taghandler_1);
              __jsp_taghandler_74.setKey("funcionarios.codreg");
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
            out.write(__jsp_StaticText.text[89]);
            /*@lineinfo:translated-code*//*@lineinfo:331^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_75=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_75.setParent(__jsp_taghandler_1);
              __jsp_taghandler_75.setKey("oficinas.descripcion");
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
            out.write(__jsp_StaticText.text[90]);
            /*@lineinfo:translated-code*//*@lineinfo:332^44*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_76=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_76.setParent(__jsp_taghandler_1);
              __jsp_taghandler_76.setKey("funcionarios.codfin");
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
            out.write(__jsp_StaticText.text[91]);
            /*@lineinfo:translated-code*//*@lineinfo:333^44*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_77=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_77.setParent(__jsp_taghandler_1);
              __jsp_taghandler_77.setKey("funcionarios.estado");
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
            out.write(__jsp_StaticText.text[92]);
            /*@lineinfo:translated-code*//*@lineinfo:334^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_78=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_78.setParent(__jsp_taghandler_1);
              __jsp_taghandler_78.setName("FuncionariosForm");
              __jsp_taghandler_78.setProperty("opcion");
              __jsp_taghandler_78.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[93]);
                /*@lineinfo:translated-code*//*@lineinfo:334^69*/                } while (__jsp_taghandler_78.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[94]);
            /*@lineinfo:translated-code*//*@lineinfo:337^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_79=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_79.setParent(__jsp_taghandler_1);
              __jsp_taghandler_79.setName("FuncionariosForm");
              __jsp_taghandler_79.setProperty("opcion");
              __jsp_taghandler_79.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[95]);
                /*@lineinfo:translated-code*//*@lineinfo:337^69*/                } while (__jsp_taghandler_79.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[96]);
            /*@lineinfo:user-code*//*@lineinfo:341^2*/             int pnum=0;
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[97]);
            /*@lineinfo:translated-code*//*@lineinfo:342^1*/            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_80=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
              __jsp_taghandler_80.setParent(__jsp_taghandler_1);
              __jsp_taghandler_80.setId("lista");
              __jsp_taghandler_80.setName("FuncionariosLista");
              java.lang.Object lista = null;
              __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_80,__jsp_tag_starteval,out);
                do {
                  lista = (java.lang.Object) pageContext.findAttribute("lista");
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[98]);
                  /*@lineinfo:user-code*//*@lineinfo:343^3*/                   if (pnum==1) {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[99]);
                  /*@lineinfo:user-code*//*@lineinfo:345^3*/                   } else { 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[100]);
                  /*@lineinfo:user-code*//*@lineinfo:347^3*/                   } 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[101]);
                  /*@lineinfo:translated-code*//*@lineinfo:348^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_81=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_81.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_81.setName("lista");
                    __jsp_taghandler_81.setProperty("codigo");
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
                  out.write(__jsp_StaticText.text[102]);
                  /*@lineinfo:translated-code*//*@lineinfo:349^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_82=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_82.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_82.setName("lista");
                    __jsp_taghandler_82.setProperty("descripcion");
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
                  out.write(__jsp_StaticText.text[103]);
                  /*@lineinfo:translated-code*//*@lineinfo:350^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_83=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_83.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_83.setName("lista");
                    __jsp_taghandler_83.setProperty("cargo");
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
                  out.write(__jsp_StaticText.text[104]);
                  /*@lineinfo:translated-code*//*@lineinfo:351^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_84=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_84.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_84.setName("lista");
                    __jsp_taghandler_84.setProperty("codofi");
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
                  out.write(__jsp_StaticText.text[105]);
                  /*@lineinfo:translated-code*//*@lineinfo:352^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_85=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_85.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_85.setName("lista");
                    __jsp_taghandler_85.setProperty("descripcion_codofi");
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
                  out.write(__jsp_StaticText.text[106]);
                  /*@lineinfo:translated-code*//*@lineinfo:353^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_86=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_86.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_86.setName("lista");
                    __jsp_taghandler_86.setProperty("codreg");
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
                  out.write(__jsp_StaticText.text[107]);
                  /*@lineinfo:translated-code*//*@lineinfo:354^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_87=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_87.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_87.setName("lista");
                    __jsp_taghandler_87.setProperty("descripcion_codreg");
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
                  out.write(__jsp_StaticText.text[108]);
                  /*@lineinfo:translated-code*//*@lineinfo:355^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_88=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_88.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_88.setName("lista");
                    __jsp_taghandler_88.setProperty("codfin");
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
                  out.write(__jsp_StaticText.text[109]);
                  /*@lineinfo:translated-code*//*@lineinfo:356^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_89=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_89.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_89.setName("lista");
                    __jsp_taghandler_89.setProperty("estado");
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
                  out.write(__jsp_StaticText.text[110]);
                  /*@lineinfo:translated-code*//*@lineinfo:357^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_90=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_90.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_90.setName("FuncionariosForm");
                    __jsp_taghandler_90.setProperty("opcion");
                    __jsp_taghandler_90.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[111]);
                        /*@lineinfo:translated-code*//*@lineinfo:359^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_91=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_91.setParent(__jsp_taghandler_90);
                          __jsp_taghandler_91.setIndexed(true);
                          __jsp_taghandler_91.setOnclick("operacion.value=1;opcion.value=3");
                          __jsp_taghandler_91.setProperty("boton");
                          __jsp_taghandler_91.setStyleClass("boton1");
                          __jsp_taghandler_91.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[112]);
                      /*@lineinfo:translated-code*//*@lineinfo:359^135*/                      } while (__jsp_taghandler_90.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[113]);
                  /*@lineinfo:translated-code*//*@lineinfo:362^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_92=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_92.setParent(__jsp_taghandler_80);
                    __jsp_taghandler_92.setName("FuncionariosForm");
                    __jsp_taghandler_92.setProperty("opcion");
                    __jsp_taghandler_92.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[114]);
                        /*@lineinfo:translated-code*//*@lineinfo:364^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_93=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_93.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_93.setIndexed(true);
                          __jsp_taghandler_93.setOnclick("operacion.value=1;opcion.value=2");
                          __jsp_taghandler_93.setProperty("boton");
                          __jsp_taghandler_93.setStyleClass("boton1");
                          __jsp_taghandler_93.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[115]);
                      /*@lineinfo:translated-code*//*@lineinfo:364^136*/                      } while (__jsp_taghandler_92.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[116]);
                  /*@lineinfo:user-code*//*@lineinfo:368^4*/                   if (pnum==0) pnum=1; else pnum=0; 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[117]);
                /*@lineinfo:translated-code*//*@lineinfo:368^43*/                } while (__jsp_taghandler_80.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[118]);
            /*@lineinfo:translated-code*//*@lineinfo:370^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_94=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_94.setParent(__jsp_taghandler_1);
              __jsp_taghandler_94.setName("FuncionariosForm");
              __jsp_taghandler_94.setProperty("opcion");
              __jsp_taghandler_94.setValue("5");
              __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[119]);
                  /*@lineinfo:translated-code*//*@lineinfo:378^11*/                  {
                    org.apache.struts.taglib.html.LinkTag __jsp_taghandler_95=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href styleClass");
                    __jsp_taghandler_95.setParent(__jsp_taghandler_94);
                    __jsp_taghandler_95.setHref("funcionarios.do");
                    __jsp_taghandler_95.setStyleClass("T8b");
                    __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_95,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[120]);
                      /*@lineinfo:translated-code*//*@lineinfo:378^62*/                      } while (__jsp_taghandler_95.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[121]);
                /*@lineinfo:translated-code*//*@lineinfo:380^23*/                } while (__jsp_taghandler_94.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[122]);
          /*@lineinfo:translated-code*//*@lineinfo:388^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[123]);


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
    private static final char text[][]=new char[124][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  var sesion=0\n  var dele0 = new Array()\n  var valo0 = new Array()\n  function validar(form)\n  {\n    mensaje=\"\"\n    foco=\"\"  \n    if (form.opcion.value!=9){\n    try {\n    if (!textoObligatorio( form.fun_codigo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Código\\n\"\n\t\t  if (foco.length==0) foco=\"form.fun_codigo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!solonumerosint(form.fun_codigo.value)){\n         mensaje=mensaje+\"Debe introducir Números en Código\\n\"\n         if (foco.length==0) foco=\"form.fun_codigo.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }    \n    try {\n    if (!textoObligatorio( form.fun_descripcion.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Nombre\\n\"\n\t\t  if (foco.length==0) foco=\"form.fun_descripcion.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!sololetras( form.fun_descripcion.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Letras en Nombre\\n\"\n\t\t  if (foco.length==0) foco=\"form.fun_descripcion.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio( form.fun_cargo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Cargo\\n\"\n\t\t  if (foco.length==0) foco=\"form.fun_cargo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    i=form.fun_codofi.selectedIndex;\n   \tif (!comboObligatorio(form.fun_codofi.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Oficina\\n\"\n\t\t  if (foco.length==0) foco=\"form.fun_codofi.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }\n    try {\n    i=form.fun_codreg.selectedIndex;\n   \tif (!comboObligatorio(form.fun_codreg.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Regional\\n\"\n\t\t  if (foco.length==0) foco=\"form.fun_codreg.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }\n    try {\n    i=form.fun_codfin.selectedIndex;\n   \tif (!comboObligatorio(form.fun_codfin.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Financiador\\n\"\n\t\t  if (foco.length==0) foco=\"form.fun_codfin.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }    \n    try {\n    if (form.fun_correo.value>\"          \") {\n      if (!ValidaMail( form.fun_correo.value )) {\n        mensaje=mensaje+\"Debe introducir Correo Valido\\n\"\n        if (foco.length==0) foco=\"form.fun_correo.focus()\"\n      }\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    } \n    else \n    {\n       return true\n    }\n  }\n  \nfunction cargar() {\n     for\t(var i=0; i < document.FuncionariosForm.fun_codofi.options.length; i++) {\n         valo0[i]=document.FuncionariosForm.fun_codofi.options[i].value\n         dele0[i]=document.FuncionariosForm.fun_codofi.options[i].text\n      }\n   }\n\n  function quitar()\n  {\n     var j=0\n     var k=0\n     var t=0\n     dele = new Array()\n     valo = new Array()\n\n     for \t(var i=0; i < document.FuncionariosForm.fun_codreg.options.length; i++) {\n        if (document.FuncionariosForm.fun_codreg.options[i].selected==true) {\n           k=i\n        }\n     }\n     if (sesion==0) {\n        m=0\n        for \t(var i=1; i < document.FuncionariosForm.fun_codofi.options.length; i++) {\n           valor=document.FuncionariosForm.fun_codofi.options[i].text\n           if (valor.substr(0,valor.indexOf(\"-\"))==document.FuncionariosForm.fun_codreg.options[k].text) {       \n              valor=document.FuncionariosForm.fun_codofi.options[i].text\n              valor=valor\n              dele[m]=valor.substr(valor.indexOf(\"-\")+1)\n              valo[m]=document.FuncionariosForm.fun_codofi.options[i].value\n              m=m+1   \n           }\n        }\n        sesion=sesion+1\n     }\n     else {\n        m=0\n        for \t(var i=1; i < valo0.length; i++) {\n           valor=dele0[i]\n           if (valor.substr(0,valor.indexOf(\"-\"))==document.FuncionariosForm.fun_codreg.options[k].text) {       \n              valor=dele0[i]\n              valor=valor\n              dele[m]=valor.substr(valor.indexOf(\"-\")+1)\n              valo[m]=valo0[i]\n              m=m+1   \n           }\n        }\n     }\n\n     lon=document.FuncionariosForm.fun_codofi.options.length\n     for \t(var i=1; i < lon; i++) {\n        document.FuncionariosForm.fun_codofi.options[0]=null           \n     }\n     document.FuncionariosForm.fun_codofi.options[0]=null\n     n=0\n     for \t(var i=0; i < m; i++) {\n        valor=\"var option0 = new Option(dele[i], valo[i])\"\n        eval(valor)\n        eval(\"document.FuncionariosForm.fun_codofi.options[n]=option0\") \n        n=++n\n     }     \n\n  }    \n</script>\n<body onload=\"cargar()\">\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<caption>Funcionarios</caption>\n".toCharArray();
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
      "\n          ".toCharArray();
      text[18] = 
      "</td>\n      </tr>  \n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[19] = 
      "</td>\n          <td>".toCharArray();
      text[20] = 
      "\n               ".toCharArray();
      text[21] = 
      "\n              ".toCharArray();
      text[22] = 
      "</td>          \n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[23] = 
      "</td>\n          <td>".toCharArray();
      text[24] = 
      "\n             ".toCharArray();
      text[25] = 
      "\n              ".toCharArray();
      text[26] = 
      "</td> \n      </tr>      \n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[27] = 
      "</td>\n          <td>".toCharArray();
      text[28] = 
      "</td>\n      </tr>\n      <tr>\n          <td align=\"right\">".toCharArray();
      text[29] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[30] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[31] = 
      "\n   ".toCharArray();
      text[32] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[33] = 
      "</td>\n          <td>".toCharArray();
      text[34] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[35] = 
      "</td>\n          <td>".toCharArray();
      text[36] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[37] = 
      "</td>\n          <td>".toCharArray();
      text[38] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[39] = 
      "</td>\n          <td>".toCharArray();
      text[40] = 
      "\n             ".toCharArray();
      text[41] = 
      "\n              ".toCharArray();
      text[42] = 
      "</td> \n      </tr>  \n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[43] = 
      "</td>\n          <td>".toCharArray();
      text[44] = 
      "\n             ".toCharArray();
      text[45] = 
      "\n              ".toCharArray();
      text[46] = 
      "</td>          \n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[47] = 
      "</td>\n          <td>".toCharArray();
      text[48] = 
      "\n             ".toCharArray();
      text[49] = 
      "\n              ".toCharArray();
      text[50] = 
      "</td> \n      </tr>  \n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[51] = 
      "</td>\n          <td>".toCharArray();
      text[52] = 
      "</td>\n      </tr>\n      <tr>\n          ".toCharArray();
      text[53] = 
      "\n          <td class=\"S10d\">".toCharArray();
      text[54] = 
      "</td>\n          <td class=\"S10i\">\n             <input type=\"radio\" name=\"fun_estado\" checked=\"checked\" value=\"A\"> Activo\n             <input type=\"radio\" name=\"fun_estado\" value=\"B\"> Baja </td>\n          ".toCharArray();
      text[55] = 
      "\n          ".toCharArray();
      text[56] = 
      "\n          <td class=\"S10d\">".toCharArray();
      text[57] = 
      "</td>\n          <td class=\"S10i\">\n             <input type=\"radio\" name=\"fun_estado\" value=\"A\"> Activo\n             <input type=\"radio\" name=\"fun_estado\" checked=\"checked\" value=\"B\"> Baja </td>\n          ".toCharArray();
      text[58] = 
      "\n      </tr> \n      <tr>\n          <td align=\"right\">".toCharArray();
      text[59] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[60] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[61] = 
      "\n   ".toCharArray();
      text[62] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[63] = 
      "</td>\n          <td>".toCharArray();
      text[64] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[65] = 
      "</td>\n          <td>".toCharArray();
      text[66] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[67] = 
      "</td>\n          <td>".toCharArray();
      text[68] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[69] = 
      "</td>\n          <td>".toCharArray();
      text[70] = 
      "\n          ".toCharArray();
      text[71] = 
      "</td>\n      </tr>  \n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[72] = 
      "</td>\n          <td>".toCharArray();
      text[73] = 
      "\n          ".toCharArray();
      text[74] = 
      "</td>\n      </tr> \n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[75] = 
      "</td>\n          <td>".toCharArray();
      text[76] = 
      "\n          ".toCharArray();
      text[77] = 
      "</td>\n      </tr>        \n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[78] = 
      "</td>\n          <td>".toCharArray();
      text[79] = 
      "</td>\n      </tr>      \n      <tr>\n          <td align=\"right\">".toCharArray();
      text[80] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[81] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[82] = 
      "\n".toCharArray();
      text[83] = 
      "   \n</table>\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<tr class=\"FondoAzul\">\n   <td width=\"60\"  scope=\"col\" class=\"S10c\">".toCharArray();
      text[84] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[85] = 
      "</td>\n   <td width=\"60\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[86] = 
      "</td>\n   <td width=\"60\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[87] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[88] = 
      "</td> \n   <td width=\"60\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[89] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[90] = 
      "</td>\n   <td width=\"60\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[91] = 
      "</td>   \n   <td width=\"60\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[92] = 
      "</td>   \n   ".toCharArray();
      text[93] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[94] = 
      "\n   ".toCharArray();
      text[95] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[96] = 
      "   \n</tr>\n ".toCharArray();
      text[97] = 
      "\n".toCharArray();
      text[98] = 
      "\n  ".toCharArray();
      text[99] = 
      "\n     <tr class=\"T8b\">\n  ".toCharArray();
      text[100] = 
      "\n     <tr class=\"T8a\">\n  ".toCharArray();
      text[101] = 
      "\n     <td>".toCharArray();
      text[102] = 
      "</td>\n     <td>".toCharArray();
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
      "</td>\n     ".toCharArray();
      text[111] = 
      "\n     <td>\n        ".toCharArray();
      text[112] = 
      "\n     </td>\n     ".toCharArray();
      text[113] = 
      "\n     ".toCharArray();
      text[114] = 
      "\n     <td>\n        ".toCharArray();
      text[115] = 
      "\n     </td>\n     ".toCharArray();
      text[116] = 
      "\n   </tr>\n   ".toCharArray();
      text[117] = 
      "   \n".toCharArray();
      text[118] = 
      "\n".toCharArray();
      text[119] = 
      "\n   <tr>\n   <td colspan=\"9\">\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n  <tr>\n    <td align=\"center\"> \n      <FONT color=\"#023264\" face=\"Arial, Helvetica, san-serif\" size=1> \n        <em> \n          ".toCharArray();
      text[120] = 
      "\n          © 2006  Aduana Nacional de Bolivia Todos los derechos reservados.\n          ".toCharArray();
      text[121] = 
      " \n        </em>\n      </FONT>\n    </td>\n  </tr>\n</table> \n   </td>\n   </tr>\n".toCharArray();
      text[122] = 
      "\n</table>\n".toCharArray();
      text[123] = 
      "\n</body>\n</html>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
