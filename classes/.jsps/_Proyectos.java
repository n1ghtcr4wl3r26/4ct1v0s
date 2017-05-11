  /*@lineinfo:filename=/Proyectos.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Proyectos extends oracle.jsp.runtime.HttpJsp {

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
    _Proyectos page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:65^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/proyectosAction");
        __jsp_taghandler_1.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:66^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:67^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:70^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("ProyectosForm");
              __jsp_taghandler_4.setProperty("operacion");
              __jsp_taghandler_4.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:71^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("ProyectosForm");
                    __jsp_taghandler_5.setProperty("opcion");
                    __jsp_taghandler_5.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[9]);
                        /*@lineinfo:translated-code*//*@lineinfo:73^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setKey("proyectos.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:74^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_7.setMaxlength("10");
                          __jsp_taghandler_7.setName("ProyectosForm");
                          __jsp_taghandler_7.setProperty("pry_codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:77^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_8.setKey("proyectos.descripcion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:78^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_9.setMaxlength("50");
                          __jsp_taghandler_9.setName("ProyectosForm");
                          __jsp_taghandler_9.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_9.setProperty("pry_descripcion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:81^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_10=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_10.setOnclick("operacion.value=2;opcion.value=1");
                          __jsp_taghandler_10.setProperty("boton");
                          __jsp_taghandler_10.setStyleClass("boton1");
                          __jsp_taghandler_10.setValue("Insertar");
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
                        /*@lineinfo:translated-code*//*@lineinfo:82^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_11.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_11.setProperty("boton");
                          __jsp_taghandler_11.setStyleClass("boton1");
                          __jsp_taghandler_11.setValue("Cancelar");
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
                      /*@lineinfo:translated-code*//*@lineinfo:82^140*/                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[16]);
                  /*@lineinfo:translated-code*//*@lineinfo:85^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_12=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_12.setName("ProyectosForm");
                    __jsp_taghandler_12.setProperty("opcion");
                    __jsp_taghandler_12.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[17]);
                        /*@lineinfo:translated-code*//*@lineinfo:87^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_13=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_13.setKey("proyectos.codigo");
                          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[18]);
                        /*@lineinfo:translated-code*//*@lineinfo:88^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_14=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_14.setMaxlength("10");
                          __jsp_taghandler_14.setName("ProyectosForm");
                          __jsp_taghandler_14.setProperty("pry_codigo");
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
                        out.write(__jsp_StaticText.text[19]);
                        /*@lineinfo:translated-code*//*@lineinfo:91^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_15=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_15.setKey("proyectos.descripcion");
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
                        out.write(__jsp_StaticText.text[20]);
                        /*@lineinfo:translated-code*//*@lineinfo:92^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_16=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_16.setMaxlength("50");
                          __jsp_taghandler_16.setName("ProyectosForm");
                          __jsp_taghandler_16.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_16.setProperty("pry_descripcion");
                          __jsp_taghandler_16.setSize("50");
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
                        out.write(__jsp_StaticText.text[21]);
                        /*@lineinfo:translated-code*//*@lineinfo:95^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_17=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_17.setOnclick("operacion.value=2;opcion.value=2");
                          __jsp_taghandler_17.setProperty("boton");
                          __jsp_taghandler_17.setStyleClass("boton1");
                          __jsp_taghandler_17.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[22]);
                        /*@lineinfo:translated-code*//*@lineinfo:96^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_18=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_18.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_18.setProperty("boton");
                          __jsp_taghandler_18.setStyleClass("boton1");
                          __jsp_taghandler_18.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[23]);
                      /*@lineinfo:translated-code*//*@lineinfo:96^140*/                      } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[24]);
                  /*@lineinfo:translated-code*//*@lineinfo:99^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_19=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_19.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_19.setName("ProyectosForm");
                    __jsp_taghandler_19.setProperty("opcion");
                    __jsp_taghandler_19.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[25]);
                        /*@lineinfo:translated-code*//*@lineinfo:101^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_20=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_20.setKey("proyectos.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:102^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_21=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_21.setMaxlength("10");
                          __jsp_taghandler_21.setName("ProyectosForm");
                          __jsp_taghandler_21.setProperty("pry_codigo");
                          __jsp_taghandler_21.setReadonly(true);
                          __jsp_taghandler_21.setSize("10");
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
                        out.write(__jsp_StaticText.text[27]);
                        /*@lineinfo:translated-code*//*@lineinfo:105^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_22=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_22.setKey("proyectos.descripcion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:106^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_23=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_23.setMaxlength("50");
                          __jsp_taghandler_23.setName("ProyectosForm");
                          __jsp_taghandler_23.setProperty("pry_descripcion");
                          __jsp_taghandler_23.setReadonly(true);
                          __jsp_taghandler_23.setSize("50");
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
                        /*@lineinfo:translated-code*//*@lineinfo:109^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_24=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_24.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_24.setProperty("boton");
                          __jsp_taghandler_24.setStyleClass("boton1");
                          __jsp_taghandler_24.setValue("Eliminar");
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
                        /*@lineinfo:translated-code*//*@lineinfo:110^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_25=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_25.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_25.setProperty("boton");
                          __jsp_taghandler_25.setStyleClass("boton1");
                          __jsp_taghandler_25.setValue("Cancelar");
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
                        out.write(__jsp_StaticText.text[31]);
                      /*@lineinfo:translated-code*//*@lineinfo:110^140*/                      } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[32]);
                /*@lineinfo:translated-code*//*@lineinfo:112^18*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[33]);
            /*@lineinfo:translated-code*//*@lineinfo:117^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_26=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_26.setParent(__jsp_taghandler_1);
              __jsp_taghandler_26.setKey("proyectos.codigo");
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
            /*@lineinfo:translated-code*//*@lineinfo:118^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_27=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_27.setParent(__jsp_taghandler_1);
              __jsp_taghandler_27.setKey("proyectos.descripcion");
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
            out.write(__jsp_StaticText.text[35]);
            /*@lineinfo:translated-code*//*@lineinfo:119^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_28=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_28.setParent(__jsp_taghandler_1);
              __jsp_taghandler_28.setName("ProyectosForm");
              __jsp_taghandler_28.setProperty("opcion");
              __jsp_taghandler_28.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[36]);
                /*@lineinfo:translated-code*//*@lineinfo:119^66*/                } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[37]);
            /*@lineinfo:translated-code*//*@lineinfo:122^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_29=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_29.setParent(__jsp_taghandler_1);
              __jsp_taghandler_29.setName("ProyectosForm");
              __jsp_taghandler_29.setProperty("opcion");
              __jsp_taghandler_29.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[38]);
                /*@lineinfo:translated-code*//*@lineinfo:122^66*/                } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[39]);
            /*@lineinfo:user-code*//*@lineinfo:126^1*/             int pnum=0;
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[40]);
            /*@lineinfo:translated-code*//*@lineinfo:127^1*/            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_30=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
              __jsp_taghandler_30.setParent(__jsp_taghandler_1);
              __jsp_taghandler_30.setId("lista");
              __jsp_taghandler_30.setName("ProyectosLista");
              java.lang.Object lista = null;
              __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
                do {
                  lista = (java.lang.Object) pageContext.findAttribute("lista");
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[41]);
                  /*@lineinfo:user-code*//*@lineinfo:128^3*/                   if (pnum==1) {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[42]);
                  /*@lineinfo:user-code*//*@lineinfo:130^3*/                   } else { 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[43]);
                  /*@lineinfo:user-code*//*@lineinfo:132^3*/                   } 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[44]);
                  /*@lineinfo:translated-code*//*@lineinfo:133^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_31=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                    __jsp_taghandler_31.setName("lista");
                    __jsp_taghandler_31.setProperty("codigo");
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
                  out.write(__jsp_StaticText.text[45]);
                  /*@lineinfo:translated-code*//*@lineinfo:134^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_32=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_32.setParent(__jsp_taghandler_30);
                    __jsp_taghandler_32.setName("lista");
                    __jsp_taghandler_32.setProperty("descripcion");
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
                  out.write(__jsp_StaticText.text[46]);
                  /*@lineinfo:translated-code*//*@lineinfo:135^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_33=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_33.setParent(__jsp_taghandler_30);
                    __jsp_taghandler_33.setName("ProyectosForm");
                    __jsp_taghandler_33.setProperty("opcion");
                    __jsp_taghandler_33.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[47]);
                        /*@lineinfo:translated-code*//*@lineinfo:137^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_34=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                          __jsp_taghandler_34.setIndexed(true);
                          __jsp_taghandler_34.setOnclick("operacion.value=1;opcion.value=3");
                          __jsp_taghandler_34.setProperty("boton");
                          __jsp_taghandler_34.setStyleClass("boton1");
                          __jsp_taghandler_34.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[48]);
                      /*@lineinfo:translated-code*//*@lineinfo:137^135*/                      } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[49]);
                  /*@lineinfo:translated-code*//*@lineinfo:140^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_35=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_35.setParent(__jsp_taghandler_30);
                    __jsp_taghandler_35.setName("ProyectosForm");
                    __jsp_taghandler_35.setProperty("opcion");
                    __jsp_taghandler_35.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[50]);
                        /*@lineinfo:translated-code*//*@lineinfo:142^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_36=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                          __jsp_taghandler_36.setIndexed(true);
                          __jsp_taghandler_36.setOnclick("operacion.value=1;opcion.value=2");
                          __jsp_taghandler_36.setProperty("boton");
                          __jsp_taghandler_36.setStyleClass("boton1");
                          __jsp_taghandler_36.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[51]);
                      /*@lineinfo:translated-code*//*@lineinfo:142^136*/                      } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[52]);
                  /*@lineinfo:user-code*//*@lineinfo:146^4*/                   if (pnum==0) pnum=1; else pnum=0; 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[53]);
                /*@lineinfo:translated-code*//*@lineinfo:146^43*/                } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[54]);
            /*@lineinfo:translated-code*//*@lineinfo:148^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_37=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_37.setParent(__jsp_taghandler_1);
              __jsp_taghandler_37.setName("ProyectosForm");
              __jsp_taghandler_37.setProperty("opcion");
              __jsp_taghandler_37.setValue("5");
              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[55]);
                  /*@lineinfo:translated-code*//*@lineinfo:156^11*/                  {
                    org.apache.struts.taglib.html.LinkTag __jsp_taghandler_38=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href styleClass");
                    __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                    __jsp_taghandler_38.setHref("proyectos.do");
                    __jsp_taghandler_38.setStyleClass("T8b");
                    __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_38,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[56]);
                      /*@lineinfo:translated-code*//*@lineinfo:156^59*/                      } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[57]);
                /*@lineinfo:translated-code*//*@lineinfo:158^23*/                } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[58]);
          /*@lineinfo:translated-code*//*@lineinfo:166^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[59]);


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
    private static final char text[][]=new char[60][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  function validar(form)\n  {\n    mensaje=\"\"\n    foco=\"\"  \n    if (form.opcion.value!=9){\n    try {\n    if (!textoObligatorio( form.pry_codigo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Código\\n\"\n\t\t  if (foco.length==0) foco=\"form.pry_codigo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!solonumerosint(form.pry_codigo.value)){\n         mensaje=mensaje+\"Debe introducir Números en Código\\n\"\n         if (foco.length==0) foco=\"form.pry_codigo.focus()\"\n      }\n    }\n    catch (e) {\n       xvar=0\n    }    \n    try {\n    if (!textoObligatorio( form.pry_descripcion.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Descripción\\n\"\n\t\t  if (foco.length==0) foco=\"form.pry_descripcion.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n      if (!sololetras(form.pry_descripcion.value)){\n         mensaje=mensaje+\"Debe introducir Letras y Números\\n\"\n         if (foco.length==0) foco=\"form.pry_descripcion.focus()\"\n      }\n    }\n    catch (e) {\n      xvar=0\n    }    \n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }       \n  }\n</script>\n<body>\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<caption>Proyectos</caption>\n".toCharArray();
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
      "</td>\n      </tr>\n      <tr>\n          <td align=\"right\">".toCharArray();
      text[14] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[15] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[16] = 
      "\n   ".toCharArray();
      text[17] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[18] = 
      "</td>\n          <td>".toCharArray();
      text[19] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[20] = 
      "</td>\n          <td>".toCharArray();
      text[21] = 
      "</td>\n      </tr>\n      <tr>\n          <td align=\"right\">".toCharArray();
      text[22] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[23] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[24] = 
      "\n   ".toCharArray();
      text[25] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[26] = 
      "</td>\n          <td>".toCharArray();
      text[27] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[28] = 
      "</td>\n          <td>".toCharArray();
      text[29] = 
      "</td>\n      </tr>\n      <tr>\n          <td align=\"right\">".toCharArray();
      text[30] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[31] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[32] = 
      "\n".toCharArray();
      text[33] = 
      "\n</table>\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<tr class=\"FondoAzul\">\n   <td width=\"60\"  scope=\"col\" class=\"S10c\">".toCharArray();
      text[34] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[35] = 
      "</td>\n   ".toCharArray();
      text[36] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[37] = 
      "\n   ".toCharArray();
      text[38] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[39] = 
      "   \n </tr>\n".toCharArray();
      text[40] = 
      "\n".toCharArray();
      text[41] = 
      "\n  ".toCharArray();
      text[42] = 
      "\n     <tr class=\"T8b\">\n  ".toCharArray();
      text[43] = 
      "\n     <tr class=\"T8a\">\n  ".toCharArray();
      text[44] = 
      "\n     <td>".toCharArray();
      text[45] = 
      "</td>\n     <td>".toCharArray();
      text[46] = 
      "</td>\n     ".toCharArray();
      text[47] = 
      "\n     <td>\n        ".toCharArray();
      text[48] = 
      "\n     </td>\n     ".toCharArray();
      text[49] = 
      "\n     ".toCharArray();
      text[50] = 
      "\n     <td>\n        ".toCharArray();
      text[51] = 
      "\n     </td>\n     ".toCharArray();
      text[52] = 
      "\n   </tr>\n   ".toCharArray();
      text[53] = 
      "\n".toCharArray();
      text[54] = 
      "\n".toCharArray();
      text[55] = 
      "\n   <tr>\n   <td colspan=\"4\">\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n  <tr>\n    <td align=\"center\"> \n      <FONT color=\"#023264\" face=\"Arial, Helvetica, san-serif\" size=1> \n        <em> \n          ".toCharArray();
      text[56] = 
      "\n          © 2006  Aduana Nacional de Bolivia Todos los derechos reservados.\n          ".toCharArray();
      text[57] = 
      " \n        </em>\n      </FONT>\n    </td>\n  </tr>\n</table>\n   </td>\n   </tr>\n".toCharArray();
      text[58] = 
      "\n</table>\n".toCharArray();
      text[59] = 
      "\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
