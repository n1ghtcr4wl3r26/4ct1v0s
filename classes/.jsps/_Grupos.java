  /*@lineinfo:filename=/Grupos.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Grupos extends oracle.jsp.runtime.HttpJsp {

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
    _Grupos page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:75^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/gruposAction");
        __jsp_taghandler_1.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:76^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:77^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:80^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("GruposForm");
              __jsp_taghandler_4.setProperty("operacion");
              __jsp_taghandler_4.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:81^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("GruposForm");
                    __jsp_taghandler_5.setProperty("opcion");
                    __jsp_taghandler_5.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[9]);
                        /*@lineinfo:translated-code*//*@lineinfo:83^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setKey("grupos.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:84^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_7.setMaxlength("10");
                          __jsp_taghandler_7.setName("GruposForm");
                          __jsp_taghandler_7.setProperty("grp_codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:87^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_8.setKey("grupos.codrub");
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
                        /*@lineinfo:translated-code*//*@lineinfo:88^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_9=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_9.setDisabled(false);
                          __jsp_taghandler_9.setName("GruposForm");
                          __jsp_taghandler_9.setProperty("grp_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[13]);
                              /*@lineinfo:translated-code*//*@lineinfo:89^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_10=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                                __jsp_taghandler_10.setCollection("RubrosLista");
                                __jsp_taghandler_10.setLabelProperty("descripcion");
                                __jsp_taghandler_10.setProperty("codigo");
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
                            /*@lineinfo:translated-code*//*@lineinfo:89^102*/                            } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[15]);
                        /*@lineinfo:translated-code*//*@lineinfo:93^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_11=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_11.setKey("grupos.descripcion");
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
                        out.write(__jsp_StaticText.text[16]);
                        /*@lineinfo:translated-code*//*@lineinfo:94^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_12=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_12.setMaxlength("50");
                          __jsp_taghandler_12.setName("GruposForm");
                          __jsp_taghandler_12.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_12.setProperty("grp_descripcion");
                          __jsp_taghandler_12.setSize("50");
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
                        out.write(__jsp_StaticText.text[17]);
                        /*@lineinfo:translated-code*//*@lineinfo:97^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_13=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_13.setOnclick("operacion.value=2;opcion.value=1");
                          __jsp_taghandler_13.setProperty("boton");
                          __jsp_taghandler_13.setStyleClass("boton1");
                          __jsp_taghandler_13.setValue("Insertar");
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
                        out.write(__jsp_StaticText.text[18]);
                        /*@lineinfo:translated-code*//*@lineinfo:98^27*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_14=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_14.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_14.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_14.setProperty("boton");
                          __jsp_taghandler_14.setStyleClass("boton1");
                          __jsp_taghandler_14.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[19]);
                      /*@lineinfo:translated-code*//*@lineinfo:98^139*/                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[20]);
                  /*@lineinfo:translated-code*//*@lineinfo:101^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_15=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_15.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_15.setName("GruposForm");
                    __jsp_taghandler_15.setProperty("opcion");
                    __jsp_taghandler_15.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[21]);
                        /*@lineinfo:translated-code*//*@lineinfo:103^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_16=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_16.setKey("grupos.codigo");
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
                        out.write(__jsp_StaticText.text[22]);
                        /*@lineinfo:translated-code*//*@lineinfo:104^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_17=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_17.setMaxlength("10");
                          __jsp_taghandler_17.setName("GruposForm");
                          __jsp_taghandler_17.setProperty("grp_codigo");
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
                        out.write(__jsp_StaticText.text[23]);
                        /*@lineinfo:translated-code*//*@lineinfo:107^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_18.setKey("grupos.codrub");
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
                        out.write(__jsp_StaticText.text[24]);
                        /*@lineinfo:translated-code*//*@lineinfo:108^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_19=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_19.setName("GruposForm");
                          __jsp_taghandler_19.setProperty("grp_codrub");
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
                        out.write(__jsp_StaticText.text[25]);
                        /*@lineinfo:translated-code*//*@lineinfo:109^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_20=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_20.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_20.setMaxlength("30");
                          __jsp_taghandler_20.setName("GruposForm");
                          __jsp_taghandler_20.setProperty("descripcion_codrub");
                          __jsp_taghandler_20.setReadonly(true);
                          __jsp_taghandler_20.setSize("30");
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
                        out.write(__jsp_StaticText.text[26]);
                        /*@lineinfo:translated-code*//*@lineinfo:112^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_21=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_21.setKey("grupos.descripcion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:113^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_22=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_22.setMaxlength("50");
                          __jsp_taghandler_22.setName("GruposForm");
                          __jsp_taghandler_22.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_22.setProperty("grp_descripcion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:116^11*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_23=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_23.setName("GruposForm");
                          __jsp_taghandler_23.setProperty("grp_estado");
                          __jsp_taghandler_23.setValue("A");
                          __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[29]);
                              /*@lineinfo:translated-code*//*@lineinfo:117^28*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_24=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                                __jsp_taghandler_24.setKey("grupos.estado");
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
                              out.write(__jsp_StaticText.text[30]);
                            /*@lineinfo:translated-code*//*@lineinfo:117^64*/                            } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[31]);
                        /*@lineinfo:translated-code*//*@lineinfo:122^11*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_25=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_25.setName("GruposForm");
                          __jsp_taghandler_25.setProperty("grp_estado");
                          __jsp_taghandler_25.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[32]);
                              /*@lineinfo:translated-code*//*@lineinfo:123^28*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_26=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                                __jsp_taghandler_26.setKey("grupos.estado");
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
                            /*@lineinfo:translated-code*//*@lineinfo:123^64*/                            } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[34]);
                        /*@lineinfo:translated-code*//*@lineinfo:130^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_27=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_27.setOnclick("operacion.value=2;opcion.value=2");
                          __jsp_taghandler_27.setProperty("boton");
                          __jsp_taghandler_27.setStyleClass("boton1");
                          __jsp_taghandler_27.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[35]);
                        /*@lineinfo:translated-code*//*@lineinfo:131^27*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_28=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_28.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_28.setProperty("boton");
                          __jsp_taghandler_28.setStyleClass("boton1");
                          __jsp_taghandler_28.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[36]);
                      /*@lineinfo:translated-code*//*@lineinfo:131^139*/                      } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[37]);
                  /*@lineinfo:translated-code*//*@lineinfo:134^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_29=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_29.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_29.setName("GruposForm");
                    __jsp_taghandler_29.setProperty("opcion");
                    __jsp_taghandler_29.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[38]);
                        /*@lineinfo:translated-code*//*@lineinfo:136^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_30=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_30.setKey("grupos.codigo");
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
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:137^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_31=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_31.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_31.setMaxlength("10");
                          __jsp_taghandler_31.setName("GruposForm");
                          __jsp_taghandler_31.setProperty("grp_codigo");
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
                        out.write(__jsp_StaticText.text[40]);
                        /*@lineinfo:translated-code*//*@lineinfo:140^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_32=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_32.setKey("grupos.codrub");
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
                        out.write(__jsp_StaticText.text[41]);
                        /*@lineinfo:translated-code*//*@lineinfo:141^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_33=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_33.setName("GruposForm");
                          __jsp_taghandler_33.setProperty("grp_codrub");
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
                        out.write(__jsp_StaticText.text[42]);
                        /*@lineinfo:translated-code*//*@lineinfo:142^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_34=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_34.setMaxlength("30");
                          __jsp_taghandler_34.setName("GruposForm");
                          __jsp_taghandler_34.setProperty("descripcion_codrub");
                          __jsp_taghandler_34.setReadonly(true);
                          __jsp_taghandler_34.setSize("30");
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
                        out.write(__jsp_StaticText.text[43]);
                        /*@lineinfo:translated-code*//*@lineinfo:145^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_35=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_35.setKey("grupos.descripcion");
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
                        out.write(__jsp_StaticText.text[44]);
                        /*@lineinfo:translated-code*//*@lineinfo:146^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_36=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_36.setMaxlength("50");
                          __jsp_taghandler_36.setName("GruposForm");
                          __jsp_taghandler_36.setProperty("grp_descripcion");
                          __jsp_taghandler_36.setReadonly(true);
                          __jsp_taghandler_36.setSize("50");
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
                        out.write(__jsp_StaticText.text[45]);
                        /*@lineinfo:translated-code*//*@lineinfo:149^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_37=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_37.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_37.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_37.setProperty("boton");
                          __jsp_taghandler_37.setStyleClass("boton1");
                          __jsp_taghandler_37.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[46]);
                        /*@lineinfo:translated-code*//*@lineinfo:150^27*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_38=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_38.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_38.setProperty("boton");
                          __jsp_taghandler_38.setStyleClass("boton1");
                          __jsp_taghandler_38.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[47]);
                      /*@lineinfo:translated-code*//*@lineinfo:150^139*/                      } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[48]);
                /*@lineinfo:translated-code*//*@lineinfo:152^18*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[49]);
            /*@lineinfo:translated-code*//*@lineinfo:155^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_39=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_39.setParent(__jsp_taghandler_1);
              __jsp_taghandler_39.setKey("grupos.codigo");
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
            out.write(__jsp_StaticText.text[50]);
            /*@lineinfo:translated-code*//*@lineinfo:156^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_40=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_40.setParent(__jsp_taghandler_1);
              __jsp_taghandler_40.setKey("grupos.descripcion");
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
            out.write(__jsp_StaticText.text[51]);
            /*@lineinfo:translated-code*//*@lineinfo:157^44*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_41=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_41.setParent(__jsp_taghandler_1);
              __jsp_taghandler_41.setKey("grupos.codrub");
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
            out.write(__jsp_StaticText.text[52]);
            /*@lineinfo:translated-code*//*@lineinfo:158^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_42=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_42.setParent(__jsp_taghandler_1);
              __jsp_taghandler_42.setKey("oficinas.descripcion");
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
            out.write(__jsp_StaticText.text[53]);
            /*@lineinfo:translated-code*//*@lineinfo:159^44*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_43=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_43.setParent(__jsp_taghandler_1);
              __jsp_taghandler_43.setKey("grupos.estado");
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
            out.write(__jsp_StaticText.text[54]);
            /*@lineinfo:translated-code*//*@lineinfo:160^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_44=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_44.setParent(__jsp_taghandler_1);
              __jsp_taghandler_44.setName("GruposForm");
              __jsp_taghandler_44.setProperty("opcion");
              __jsp_taghandler_44.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[55]);
                /*@lineinfo:translated-code*//*@lineinfo:160^63*/                } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[56]);
            /*@lineinfo:translated-code*//*@lineinfo:163^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_45=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_45.setParent(__jsp_taghandler_1);
              __jsp_taghandler_45.setName("GruposForm");
              __jsp_taghandler_45.setProperty("opcion");
              __jsp_taghandler_45.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[57]);
                /*@lineinfo:translated-code*//*@lineinfo:163^63*/                } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[58]);
            /*@lineinfo:user-code*//*@lineinfo:167^3*/             int pnum=0;
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[59]);
            /*@lineinfo:translated-code*//*@lineinfo:168^1*/            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_46=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
              __jsp_taghandler_46.setParent(__jsp_taghandler_1);
              __jsp_taghandler_46.setId("lista");
              __jsp_taghandler_46.setName("GruposLista");
              java.lang.Object lista = null;
              __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_46,__jsp_tag_starteval,out);
                do {
                  lista = (java.lang.Object) pageContext.findAttribute("lista");
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[60]);
                  /*@lineinfo:user-code*//*@lineinfo:169^3*/                   if (pnum==1) {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[61]);
                  /*@lineinfo:user-code*//*@lineinfo:171^3*/                   } else { 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[62]);
                  /*@lineinfo:user-code*//*@lineinfo:173^3*/                   } 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[63]);
                  /*@lineinfo:translated-code*//*@lineinfo:174^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_47=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                    __jsp_taghandler_47.setName("lista");
                    __jsp_taghandler_47.setProperty("codigo");
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
                  out.write(__jsp_StaticText.text[64]);
                  /*@lineinfo:translated-code*//*@lineinfo:175^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_48=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_48.setParent(__jsp_taghandler_46);
                    __jsp_taghandler_48.setName("lista");
                    __jsp_taghandler_48.setProperty("descripcion");
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
                  out.write(__jsp_StaticText.text[65]);
                  /*@lineinfo:translated-code*//*@lineinfo:176^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_49=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_49.setParent(__jsp_taghandler_46);
                    __jsp_taghandler_49.setName("lista");
                    __jsp_taghandler_49.setProperty("codrub");
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
                  out.write(__jsp_StaticText.text[66]);
                  /*@lineinfo:translated-code*//*@lineinfo:177^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_50=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_50.setParent(__jsp_taghandler_46);
                    __jsp_taghandler_50.setName("lista");
                    __jsp_taghandler_50.setProperty("codrub_descripcion");
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
                  out.write(__jsp_StaticText.text[67]);
                  /*@lineinfo:translated-code*//*@lineinfo:178^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_51=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_51.setParent(__jsp_taghandler_46);
                    __jsp_taghandler_51.setName("lista");
                    __jsp_taghandler_51.setProperty("estado");
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
                  out.write(__jsp_StaticText.text[68]);
                  /*@lineinfo:translated-code*//*@lineinfo:179^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_52=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_52.setParent(__jsp_taghandler_46);
                    __jsp_taghandler_52.setName("GruposForm");
                    __jsp_taghandler_52.setProperty("opcion");
                    __jsp_taghandler_52.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[69]);
                        /*@lineinfo:translated-code*//*@lineinfo:181^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_53=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_52);
                          __jsp_taghandler_53.setIndexed(true);
                          __jsp_taghandler_53.setOnclick("operacion.value=1;opcion.value=3");
                          __jsp_taghandler_53.setProperty("boton");
                          __jsp_taghandler_53.setStyleClass("boton1");
                          __jsp_taghandler_53.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[70]);
                      /*@lineinfo:translated-code*//*@lineinfo:181^135*/                      } while (__jsp_taghandler_52.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[71]);
                  /*@lineinfo:translated-code*//*@lineinfo:184^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_54=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_54.setParent(__jsp_taghandler_46);
                    __jsp_taghandler_54.setName("GruposForm");
                    __jsp_taghandler_54.setProperty("opcion");
                    __jsp_taghandler_54.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[72]);
                        /*@lineinfo:translated-code*//*@lineinfo:186^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_55=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                          __jsp_taghandler_55.setIndexed(true);
                          __jsp_taghandler_55.setOnclick("operacion.value=1;opcion.value=2");
                          __jsp_taghandler_55.setProperty("boton");
                          __jsp_taghandler_55.setStyleClass("boton1");
                          __jsp_taghandler_55.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[73]);
                      /*@lineinfo:translated-code*//*@lineinfo:186^136*/                      } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[74]);
                  /*@lineinfo:user-code*//*@lineinfo:190^4*/                   if (pnum==0) pnum=1; else pnum=0; 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[75]);
                /*@lineinfo:translated-code*//*@lineinfo:190^43*/                } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[76]);
            /*@lineinfo:translated-code*//*@lineinfo:192^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_56=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_56.setParent(__jsp_taghandler_1);
              __jsp_taghandler_56.setName("GruposForm");
              __jsp_taghandler_56.setProperty("opcion");
              __jsp_taghandler_56.setValue("5");
              __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[77]);
                  /*@lineinfo:translated-code*//*@lineinfo:200^11*/                  {
                    org.apache.struts.taglib.html.LinkTag __jsp_taghandler_57=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href styleClass");
                    __jsp_taghandler_57.setParent(__jsp_taghandler_56);
                    __jsp_taghandler_57.setHref("grupos.do");
                    __jsp_taghandler_57.setStyleClass("T8b");
                    __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_57,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[78]);
                      /*@lineinfo:translated-code*//*@lineinfo:200^56*/                      } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[79]);
                /*@lineinfo:translated-code*//*@lineinfo:202^23*/                } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[80]);
          /*@lineinfo:translated-code*//*@lineinfo:210^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[81]);


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
    private static final char text[][]=new char[82][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  function validar(form)\n  {\n    mensaje=\"\"\n    foco=\"\"  \n    if (form.opcion.value!=9){\n    try {\n    if (!textoObligatorio( form.grp_codigo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Código\\n\"\n\t\t  if (foco.length==0) foco=\"form.grp_codigo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!solonumerosint(form.grp_codigo.value)){\n         mensaje=mensaje+\"Debe introducir Números en Código\\n\"\n         if (foco.length==0) foco=\"form.grp_codigo.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }    \n    try {\n    if (!textoObligatorio( form.grp_descripcion.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Descripción\\n\"\n\t\t  if (foco.length==0) foco=\"form.grp_descripcion.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    i=form.grp_codrub.selectedIndex;\n   \tif (!comboObligatorio(form.grp_codrub.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Rubro\\n\"\n\t\t  if (foco.length==0) foco=\"form.grp_codrub.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }\n       try {\n         if (!sololetras(form.grr_descripcion.value)){\n            mensaje=mensaje+\"Debe introducir Letras y Números\\n\"\n            if (foco.length==0) foco=\"form.grr_descripcion.focus()\"\n         }\n       }\n       catch (e) {\n         xvar=0\n       }    \n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }     \n  }\n</script>\n<body>\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<caption>Grupo Activos</caption>\n".toCharArray();
      text[8] = 
      "\n   ".toCharArray();
      text[9] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[10] = 
      "</td>\n         <td>".toCharArray();
      text[11] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[12] = 
      "</td>\n         <td>".toCharArray();
      text[13] = 
      "\n              ".toCharArray();
      text[14] = 
      "\n              ".toCharArray();
      text[15] = 
      "</td> \n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[16] = 
      "</td>\n         <td>".toCharArray();
      text[17] = 
      "</td>\n      </tr>\n      <tr>\n         <td align=\"right\">".toCharArray();
      text[18] = 
      " </td>\n         <td align=\"left\">".toCharArray();
      text[19] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[20] = 
      "\n   ".toCharArray();
      text[21] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[22] = 
      "</td>\n         <td>".toCharArray();
      text[23] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[24] = 
      "</td>\n          <td>".toCharArray();
      text[25] = 
      "\n          ".toCharArray();
      text[26] = 
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[27] = 
      "</td>\n         <td>".toCharArray();
      text[28] = 
      "</td>\n      </tr>\n      <tr>\n          ".toCharArray();
      text[29] = 
      "\n          <td class=\"S10d\">".toCharArray();
      text[30] = 
      "</td>\n          <td class=\"S10i\">\n             <input type=\"radio\" name=\"grp_estado\" checked=\"checked\" value=\"A\"> Activo\n             <input type=\"radio\" name=\"grp_estado\" value=\"B\"> Baja </td>\n          ".toCharArray();
      text[31] = 
      "\n          ".toCharArray();
      text[32] = 
      "\n          <td class=\"S10d\">".toCharArray();
      text[33] = 
      "</td>\n          <td class=\"S10i\">\n             <input type=\"radio\" name=\"grp_estado\" value=\"A\"> Activo\n             <input type=\"radio\" name=\"grp_estado\" checked=\"checked\" value=\"B\"> Baja </td>\n          ".toCharArray();
      text[34] = 
      "\n      </tr>       \n      <tr>\n         <td align=\"right\">".toCharArray();
      text[35] = 
      " </td>\n         <td align=\"left\">".toCharArray();
      text[36] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[37] = 
      "\n   ".toCharArray();
      text[38] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[39] = 
      "</td>\n         <td>".toCharArray();
      text[40] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[41] = 
      "</td>\n          <td>".toCharArray();
      text[42] = 
      "\n          ".toCharArray();
      text[43] = 
      "</td>\n      </tr>      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[44] = 
      "</td>\n         <td>".toCharArray();
      text[45] = 
      "</td>\n      </tr>\n      <tr>\n         <td align=\"right\">".toCharArray();
      text[46] = 
      " </td>\n         <td align=\"lefy\">".toCharArray();
      text[47] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[48] = 
      "\n".toCharArray();
      text[49] = 
      "\n<tr class=\"FondoAzul\">\n   <td width=\"60\"  scope=\"col\" class=\"S10c\">".toCharArray();
      text[50] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[51] = 
      "</td>\n   <td width=\"60\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[52] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[53] = 
      "</td>\n   <td width=\"60\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[54] = 
      "</td>\n   ".toCharArray();
      text[55] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[56] = 
      "\n   ".toCharArray();
      text[57] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[58] = 
      "\n </tr>\n  ".toCharArray();
      text[59] = 
      "\n".toCharArray();
      text[60] = 
      "\n  ".toCharArray();
      text[61] = 
      "\n     <tr class=\"T8b\">\n  ".toCharArray();
      text[62] = 
      "\n     <tr class=\"T8a\">\n  ".toCharArray();
      text[63] = 
      "\n     <td>".toCharArray();
      text[64] = 
      "</td>\n     <td>".toCharArray();
      text[65] = 
      "</td>\n     <td>".toCharArray();
      text[66] = 
      "</td>\n     <td>".toCharArray();
      text[67] = 
      "</td>\n     <td>".toCharArray();
      text[68] = 
      "</td>\n     ".toCharArray();
      text[69] = 
      "\n     <td>\n        ".toCharArray();
      text[70] = 
      "\n     </td>\n     ".toCharArray();
      text[71] = 
      "\n     ".toCharArray();
      text[72] = 
      "\n     <td>\n        ".toCharArray();
      text[73] = 
      "\n     </td>\n     ".toCharArray();
      text[74] = 
      "\n   </tr>\n   ".toCharArray();
      text[75] = 
      "\n".toCharArray();
      text[76] = 
      "\n".toCharArray();
      text[77] = 
      "\n   <tr>\n   <td colspan=\"3\">\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n  <tr>\n    <td align=\"center\"> \n      <FONT color=\"#023264\" face=\"Arial, Helvetica, san-serif\" size=1> \n        <em> \n          ".toCharArray();
      text[78] = 
      "\n          © 2006  Aduana Nacional de Bolivia Todos los derechos reservados.\n          ".toCharArray();
      text[79] = 
      " \n        </em>\n      </FONT>\n    </td>\n  </tr>\n</table>\n   </td>\n   </tr>\n".toCharArray();
      text[80] = 
      "\n</table>\n".toCharArray();
      text[81] = 
      "\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
