  /*@lineinfo:filename=/Usuarios.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Usuarios extends oracle.jsp.runtime.HttpJsp {

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
    _Usuarios page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:56^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/usuariosAction");
        __jsp_taghandler_1.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:57^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:58^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:61^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("UsuariosForm");
              __jsp_taghandler_4.setProperty("operacion");
              __jsp_taghandler_4.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:62^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("UsuariosForm");
                    __jsp_taghandler_5.setProperty("opcion");
                    __jsp_taghandler_5.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[9]);
                        /*@lineinfo:translated-code*//*@lineinfo:64^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setKey("usuarios.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:65^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_7.setMaxlength("5");
                          __jsp_taghandler_7.setName("UsuariosForm");
                          __jsp_taghandler_7.setProperty("usu_codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:68^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_8.setKey("usuarios.carnet");
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
                        /*@lineinfo:translated-code*//*@lineinfo:69^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_9.setMaxlength("50");
                          __jsp_taghandler_9.setName("UsuariosForm");
                          __jsp_taghandler_9.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_9.setProperty("usu_carnet");
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
                        /*@lineinfo:translated-code*//*@lineinfo:72^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_10=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_10.setKey("usuarios.codfun");
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
                        /*@lineinfo:translated-code*//*@lineinfo:73^15*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_11.setDisabled(false);
                          __jsp_taghandler_11.setName("UsuariosForm");
                          __jsp_taghandler_11.setProperty("usu_codfun");
                          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[15]);
                              /*@lineinfo:translated-code*//*@lineinfo:74^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_12=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                                __jsp_taghandler_12.setCollection("FuncionariosLista");
                                __jsp_taghandler_12.setLabelProperty("descripcion");
                                __jsp_taghandler_12.setProperty("codigo");
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
                            /*@lineinfo:translated-code*//*@lineinfo:74^109*/                            } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[17]);
                        /*@lineinfo:translated-code*//*@lineinfo:78^29*/                        {
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
                        /*@lineinfo:translated-code*//*@lineinfo:79^28*/                        {
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
                      /*@lineinfo:translated-code*//*@lineinfo:79^140*/                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[20]);
                  /*@lineinfo:translated-code*//*@lineinfo:82^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_15=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_15.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_15.setName("UsuariosForm");
                    __jsp_taghandler_15.setProperty("opcion");
                    __jsp_taghandler_15.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[21]);
                        /*@lineinfo:translated-code*//*@lineinfo:84^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_16=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_16.setKey("usuarios.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:85^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_17=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_17.setMaxlength("5");
                          __jsp_taghandler_17.setName("UsuariosForm");
                          __jsp_taghandler_17.setProperty("usu_codigo");
                          __jsp_taghandler_17.setReadonly(true);
                          __jsp_taghandler_17.setSize("5");
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
                        /*@lineinfo:translated-code*//*@lineinfo:88^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_18.setKey("usuarios.carnet");
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
                        /*@lineinfo:translated-code*//*@lineinfo:89^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_19=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_19.setMaxlength("50");
                          __jsp_taghandler_19.setName("UsuariosForm");
                          __jsp_taghandler_19.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_19.setProperty("usu_carnet");
                          __jsp_taghandler_19.setSize("50");
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
                        /*@lineinfo:translated-code*//*@lineinfo:92^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_20=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_20.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_20.setKey("usuarios.codfun");
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
                        out.write(__jsp_StaticText.text[26]);
                        /*@lineinfo:translated-code*//*@lineinfo:93^15*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_21=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_21.setDisabled(false);
                          __jsp_taghandler_21.setName("UsuariosForm");
                          __jsp_taghandler_21.setProperty("usu_codfun");
                          __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_21,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[27]);
                              /*@lineinfo:translated-code*//*@lineinfo:94^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_22=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                                __jsp_taghandler_22.setCollection("FuncionariosLista");
                                __jsp_taghandler_22.setLabelProperty("descripcion");
                                __jsp_taghandler_22.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[28]);
                            /*@lineinfo:translated-code*//*@lineinfo:94^109*/                            } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[29]);
                        /*@lineinfo:translated-code*//*@lineinfo:98^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_23=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_23.setOnclick("operacion.value=2;opcion.value=2");
                          __jsp_taghandler_23.setProperty("boton");
                          __jsp_taghandler_23.setStyleClass("boton1");
                          __jsp_taghandler_23.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[30]);
                        /*@lineinfo:translated-code*//*@lineinfo:99^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_24=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_15);
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
                        out.write(__jsp_StaticText.text[31]);
                      /*@lineinfo:translated-code*//*@lineinfo:99^140*/                      } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[32]);
                  /*@lineinfo:translated-code*//*@lineinfo:102^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_25=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_25.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_25.setName("UsuariosForm");
                    __jsp_taghandler_25.setProperty("opcion");
                    __jsp_taghandler_25.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[33]);
                        /*@lineinfo:translated-code*//*@lineinfo:104^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_26=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_26.setKey("usuarios.codigo");
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
                        out.write(__jsp_StaticText.text[34]);
                        /*@lineinfo:translated-code*//*@lineinfo:105^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_27=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_27.setMaxlength("5");
                          __jsp_taghandler_27.setName("UsuariosForm");
                          __jsp_taghandler_27.setProperty("usu_codigo");
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
                        out.write(__jsp_StaticText.text[35]);
                        /*@lineinfo:translated-code*//*@lineinfo:108^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_28=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_28.setKey("usuarios.carnet");
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
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:109^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_29=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_29.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_29.setMaxlength("50");
                          __jsp_taghandler_29.setName("UsuariosForm");
                          __jsp_taghandler_29.setProperty("usu_carnet");
                          __jsp_taghandler_29.setReadonly(true);
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
                        out.write(__jsp_StaticText.text[37]);
                        /*@lineinfo:translated-code*//*@lineinfo:112^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_30=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_30.setKey("usuarios.codfun");
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
                        out.write(__jsp_StaticText.text[38]);
                        /*@lineinfo:translated-code*//*@lineinfo:113^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_31=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_31.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_31.setName("UsuariosForm");
                          __jsp_taghandler_31.setProperty("usu_codfun");
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
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:114^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_32=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_32.setMaxlength("30");
                          __jsp_taghandler_32.setName("UsuariosForm");
                          __jsp_taghandler_32.setProperty("dsc_funcionario");
                          __jsp_taghandler_32.setReadonly(true);
                          __jsp_taghandler_32.setSize("30");
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
                        out.write(__jsp_StaticText.text[40]);
                        /*@lineinfo:translated-code*//*@lineinfo:117^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_33=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_33.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_33.setProperty("boton");
                          __jsp_taghandler_33.setStyleClass("boton1");
                          __jsp_taghandler_33.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[41]);
                        /*@lineinfo:translated-code*//*@lineinfo:118^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_34=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_34.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_34.setProperty("boton");
                          __jsp_taghandler_34.setStyleClass("boton1");
                          __jsp_taghandler_34.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[42]);
                      /*@lineinfo:translated-code*//*@lineinfo:118^140*/                      } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[43]);
                /*@lineinfo:translated-code*//*@lineinfo:120^18*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[44]);
            /*@lineinfo:translated-code*//*@lineinfo:125^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_35=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_35.setParent(__jsp_taghandler_1);
              __jsp_taghandler_35.setKey("usuarios.codigo");
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
            out.write(__jsp_StaticText.text[45]);
            /*@lineinfo:translated-code*//*@lineinfo:126^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_36=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_36.setParent(__jsp_taghandler_1);
              __jsp_taghandler_36.setKey("usuarios.carnet");
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
            out.write(__jsp_StaticText.text[46]);
            /*@lineinfo:translated-code*//*@lineinfo:127^46*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_37=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_37.setParent(__jsp_taghandler_1);
              __jsp_taghandler_37.setKey("usuarios.codfun");
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
            out.write(__jsp_StaticText.text[47]);
            /*@lineinfo:translated-code*//*@lineinfo:129^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_38=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_38.setParent(__jsp_taghandler_1);
              __jsp_taghandler_38.setName("UsuariosForm");
              __jsp_taghandler_38.setProperty("opcion");
              __jsp_taghandler_38.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[48]);
                /*@lineinfo:translated-code*//*@lineinfo:129^65*/                } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[49]);
            /*@lineinfo:translated-code*//*@lineinfo:132^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_39=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_39.setParent(__jsp_taghandler_1);
              __jsp_taghandler_39.setName("UsuariosForm");
              __jsp_taghandler_39.setProperty("opcion");
              __jsp_taghandler_39.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[50]);
                /*@lineinfo:translated-code*//*@lineinfo:132^65*/                } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[51]);
            /*@lineinfo:user-code*//*@lineinfo:136^2*/             int pnum=0;
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[52]);
            /*@lineinfo:translated-code*//*@lineinfo:137^1*/            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_40=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
              __jsp_taghandler_40.setParent(__jsp_taghandler_1);
              __jsp_taghandler_40.setId("lista");
              __jsp_taghandler_40.setName("UsuariosLista");
              java.lang.Object lista = null;
              __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_40,__jsp_tag_starteval,out);
                do {
                  lista = (java.lang.Object) pageContext.findAttribute("lista");
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[53]);
                  /*@lineinfo:user-code*//*@lineinfo:138^3*/                   if (pnum==1) {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[54]);
                  /*@lineinfo:user-code*//*@lineinfo:140^3*/                   } else { 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[55]);
                  /*@lineinfo:user-code*//*@lineinfo:142^3*/                   } 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[56]);
                  /*@lineinfo:translated-code*//*@lineinfo:143^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_41=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                    __jsp_taghandler_41.setName("lista");
                    __jsp_taghandler_41.setProperty("codigo");
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
                  out.write(__jsp_StaticText.text[57]);
                  /*@lineinfo:translated-code*//*@lineinfo:144^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_42=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_42.setParent(__jsp_taghandler_40);
                    __jsp_taghandler_42.setName("lista");
                    __jsp_taghandler_42.setProperty("carnet");
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
                  out.write(__jsp_StaticText.text[58]);
                  /*@lineinfo:translated-code*//*@lineinfo:145^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_43=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_43.setParent(__jsp_taghandler_40);
                    __jsp_taghandler_43.setName("lista");
                    __jsp_taghandler_43.setProperty("codfun");
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
                  out.write(__jsp_StaticText.text[59]);
                  /*@lineinfo:translated-code*//*@lineinfo:146^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_44=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_44.setParent(__jsp_taghandler_40);
                    __jsp_taghandler_44.setName("lista");
                    __jsp_taghandler_44.setProperty("desfuncionario");
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
                  out.write(__jsp_StaticText.text[60]);
                  /*@lineinfo:translated-code*//*@lineinfo:147^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_45=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_45.setParent(__jsp_taghandler_40);
                    __jsp_taghandler_45.setName("UsuariosForm");
                    __jsp_taghandler_45.setProperty("opcion");
                    __jsp_taghandler_45.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[61]);
                        /*@lineinfo:translated-code*//*@lineinfo:149^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_46=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                          __jsp_taghandler_46.setIndexed(true);
                          __jsp_taghandler_46.setOnclick("operacion.value=1;opcion.value=3");
                          __jsp_taghandler_46.setProperty("boton");
                          __jsp_taghandler_46.setStyleClass("boton1");
                          __jsp_taghandler_46.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[62]);
                      /*@lineinfo:translated-code*//*@lineinfo:149^135*/                      } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[63]);
                  /*@lineinfo:translated-code*//*@lineinfo:152^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_47=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_47.setParent(__jsp_taghandler_40);
                    __jsp_taghandler_47.setName("UsuariosForm");
                    __jsp_taghandler_47.setProperty("opcion");
                    __jsp_taghandler_47.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[64]);
                        /*@lineinfo:translated-code*//*@lineinfo:154^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_48=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_47);
                          __jsp_taghandler_48.setIndexed(true);
                          __jsp_taghandler_48.setOnclick("operacion.value=1;opcion.value=2");
                          __jsp_taghandler_48.setProperty("boton");
                          __jsp_taghandler_48.setStyleClass("boton1");
                          __jsp_taghandler_48.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[65]);
                      /*@lineinfo:translated-code*//*@lineinfo:154^136*/                      } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[66]);
                  /*@lineinfo:user-code*//*@lineinfo:158^4*/                   if (pnum==0) pnum=1; else pnum=0; 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[67]);
                /*@lineinfo:translated-code*//*@lineinfo:158^43*/                } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[68]);
            /*@lineinfo:translated-code*//*@lineinfo:160^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_49=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_49.setParent(__jsp_taghandler_1);
              __jsp_taghandler_49.setName("UsuariosForm");
              __jsp_taghandler_49.setProperty("opcion");
              __jsp_taghandler_49.setValue("5");
              __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[69]);
                  /*@lineinfo:translated-code*//*@lineinfo:168^11*/                  {
                    org.apache.struts.taglib.html.LinkTag __jsp_taghandler_50=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href styleClass");
                    __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                    __jsp_taghandler_50.setHref("usuarios.do");
                    __jsp_taghandler_50.setStyleClass("T8b");
                    __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_50,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[70]);
                      /*@lineinfo:translated-code*//*@lineinfo:168^58*/                      } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[71]);
                /*@lineinfo:translated-code*//*@lineinfo:170^23*/                } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[72]);
          /*@lineinfo:translated-code*//*@lineinfo:178^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[73]);


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
    private static final char text[][]=new char[74][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  function validar(form)\n  {\n    mensaje=\"\"\n    foco=\"\"  \n    if (form.opcion.value!=9){\n    try {\n    if (!textoObligatorio( form.usu_codigo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Código\\n\"\n\t\t  if (foco.length==0) foco=\"form.usu_codigo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!solonumerosint(form.usu_codigo.value)){\n         mensaje=mensaje+\"Debe introducir Números en Usuario\\n\"\n         if (foco.length==0) foco=\"form.usu_codigo.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio( form.usu_carnet.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Carnet\\n\"\n\t\t  if (foco.length==0) foco=\"form.usu_carnet.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }   \n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }       \n  }\n</script>\n<body>\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<caption>Usuarios</caption>\n".toCharArray();
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
      "\n               ".toCharArray();
      text[16] = 
      "\n              ".toCharArray();
      text[17] = 
      "</td>      \n      </tr>\n      <tr>\n          <td align=\"right\">".toCharArray();
      text[18] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[19] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[20] = 
      "\n   ".toCharArray();
      text[21] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
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
      "\n               ".toCharArray();
      text[28] = 
      "\n              ".toCharArray();
      text[29] = 
      "</td>      \n      </tr>\n      <tr>\n          <td align=\"right\">".toCharArray();
      text[30] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[31] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[32] = 
      "\n   ".toCharArray();
      text[33] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[34] = 
      "</td>\n          <td>".toCharArray();
      text[35] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[36] = 
      "</td>\n          <td>".toCharArray();
      text[37] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[38] = 
      "</td>\n          <td>".toCharArray();
      text[39] = 
      "\n          ".toCharArray();
      text[40] = 
      "</td>\n      </tr>      \n      <tr>\n          <td align=\"right\">".toCharArray();
      text[41] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[42] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[43] = 
      "\n".toCharArray();
      text[44] = 
      "\n</table>\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<tr class=\"FondoAzul\">\n   <td width=\"60\"  scope=\"col\" class=\"S10c\">".toCharArray();
      text[45] = 
      "</td>\n   <td width=\"260\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[46] = 
      "</td>\n   <td width=\"160\"  scope=\"col\" class=\"S10c\">".toCharArray();
      text[47] = 
      "</td>\n   <td width=\"160\"  scope=\"col\" class=\"S10c\"></td>\n   ".toCharArray();
      text[48] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[49] = 
      "\n   ".toCharArray();
      text[50] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[51] = 
      "   \n </tr>\n ".toCharArray();
      text[52] = 
      "\n".toCharArray();
      text[53] = 
      "\n  ".toCharArray();
      text[54] = 
      "\n     <tr class=\"T8b\">\n  ".toCharArray();
      text[55] = 
      "\n     <tr class=\"T8a\">\n  ".toCharArray();
      text[56] = 
      "\n     <td>".toCharArray();
      text[57] = 
      "</td>\n     <td>".toCharArray();
      text[58] = 
      "</td>\n     <td>".toCharArray();
      text[59] = 
      "</td>\n     <td>".toCharArray();
      text[60] = 
      "</td>\n     ".toCharArray();
      text[61] = 
      "\n     <td>\n        ".toCharArray();
      text[62] = 
      "\n     </td>\n     ".toCharArray();
      text[63] = 
      "\n     ".toCharArray();
      text[64] = 
      "\n     <td>\n        ".toCharArray();
      text[65] = 
      "\n     </td>\n     ".toCharArray();
      text[66] = 
      "\n   </tr>\n   ".toCharArray();
      text[67] = 
      "\n".toCharArray();
      text[68] = 
      "\n".toCharArray();
      text[69] = 
      "\n   <tr>\n   <td colspan=\"4\">\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n  <tr>\n    <td align=\"center\"> \n      <FONT color=\"#023264\" face=\"Arial, Helvetica, san-serif\" size=1> \n        <em> \n          ".toCharArray();
      text[70] = 
      "\n          © 2006  Aduana Nacional de Bolivia Todos los derechos reservados.\n          ".toCharArray();
      text[71] = 
      " \n        </em>\n      </FONT>\n    </td>\n  </tr>\n</table>\n   </td>\n   </tr>\n".toCharArray();
      text[72] = 
      "\n</table>\n".toCharArray();
      text[73] = 
      "\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
