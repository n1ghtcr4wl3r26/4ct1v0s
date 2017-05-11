  /*@lineinfo:filename=/Ubicaciones.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Ubicaciones extends oracle.jsp.runtime.HttpJsp {

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
    _Ubicaciones page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:74^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/ubicacionesAction");
        __jsp_taghandler_1.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:75^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:76^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:79^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("UbicacionesForm");
              __jsp_taghandler_4.setProperty("operacion");
              __jsp_taghandler_4.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:80^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("UbicacionesForm");
                    __jsp_taghandler_5.setProperty("opcion");
                    __jsp_taghandler_5.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[9]);
                        /*@lineinfo:translated-code*//*@lineinfo:82^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setKey("ubicaciones.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:83^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_7.setMaxlength("10");
                          __jsp_taghandler_7.setName("UbicacionesForm");
                          __jsp_taghandler_7.setProperty("ubi_codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:86^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_8.setKey("ubicaciones.descripcion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:87^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_9.setMaxlength("50");
                          __jsp_taghandler_9.setName("UbicacionesForm");
                          __jsp_taghandler_9.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_9.setProperty("ubi_descripcion");
                          __jsp_taghandler_9.setSize("100");
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
                        /*@lineinfo:translated-code*//*@lineinfo:90^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_10=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_10.setKey("ubicaciones.direccion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:91^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_11=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_11.setMaxlength("50");
                          __jsp_taghandler_11.setName("UbicacionesForm");
                          __jsp_taghandler_11.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_11.setProperty("ubi_direccion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:94^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_12=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_12.setKey("ubicaciones.codreg");
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
                        /*@lineinfo:translated-code*//*@lineinfo:95^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_13=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_13.setName("UbicacionesForm");
                          __jsp_taghandler_13.setProperty("ubi_codreg");
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
                        /*@lineinfo:translated-code*//*@lineinfo:96^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_14=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_14.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_14.setMaxlength("30");
                          __jsp_taghandler_14.setName("UbicacionesForm");
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
                        /*@lineinfo:translated-code*//*@lineinfo:99^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_15=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_15.setOnclick("operacion.value=2;opcion.value=1");
                          __jsp_taghandler_15.setProperty("boton");
                          __jsp_taghandler_15.setStyleClass("boton1");
                          __jsp_taghandler_15.setValue("Insertar");
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
                        /*@lineinfo:translated-code*//*@lineinfo:100^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_16=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_16.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_16.setProperty("boton");
                          __jsp_taghandler_16.setStyleClass("boton1");
                          __jsp_taghandler_16.setValue("Cancelar");
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
                      /*@lineinfo:translated-code*//*@lineinfo:100^139*/                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[21]);
                  /*@lineinfo:translated-code*//*@lineinfo:103^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_17=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_17.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_17.setName("UbicacionesForm");
                    __jsp_taghandler_17.setProperty("opcion");
                    __jsp_taghandler_17.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[22]);
                        /*@lineinfo:translated-code*//*@lineinfo:105^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_18.setKey("ubicaciones.codigo");
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
                        /*@lineinfo:translated-code*//*@lineinfo:106^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_19=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_19.setMaxlength("10");
                          __jsp_taghandler_19.setName("UbicacionesForm");
                          __jsp_taghandler_19.setProperty("ubi_codigo");
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
                        out.write(__jsp_StaticText.text[24]);
                        /*@lineinfo:translated-code*//*@lineinfo:109^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_20=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_20.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_20.setKey("ubicaciones.descripcion");
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
                        /*@lineinfo:translated-code*//*@lineinfo:110^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_21=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_21.setMaxlength("50");
                          __jsp_taghandler_21.setName("UbicacionesForm");
                          __jsp_taghandler_21.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_21.setProperty("ubi_descripcion");
                          __jsp_taghandler_21.setSize("50");
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
                        out.write(__jsp_StaticText.text[26]);
                        /*@lineinfo:translated-code*//*@lineinfo:113^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_22=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_22.setKey("ubicaciones.direccion");
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
                        out.write(__jsp_StaticText.text[27]);
                        /*@lineinfo:translated-code*//*@lineinfo:114^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_23=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_23.setMaxlength("50");
                          __jsp_taghandler_23.setName("UbicacionesForm");
                          __jsp_taghandler_23.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_23.setProperty("ubi_direccion");
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
                        out.write(__jsp_StaticText.text[28]);
                        /*@lineinfo:translated-code*//*@lineinfo:117^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_24=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_24.setKey("ubicaciones.codreg");
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
                        out.write(__jsp_StaticText.text[29]);
                        /*@lineinfo:translated-code*//*@lineinfo:118^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_25=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_25.setName("UbicacionesForm");
                          __jsp_taghandler_25.setProperty("ubi_codreg");
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
                        out.write(__jsp_StaticText.text[30]);
                        /*@lineinfo:translated-code*//*@lineinfo:119^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_26=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_17);
                          __jsp_taghandler_26.setMaxlength("30");
                          __jsp_taghandler_26.setName("UbicacionesForm");
                          __jsp_taghandler_26.setProperty("descripcion_codreg");
                          __jsp_taghandler_26.setReadonly(true);
                          __jsp_taghandler_26.setSize("30");
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
                        out.write(__jsp_StaticText.text[31]);
                        /*@lineinfo:translated-code*//*@lineinfo:122^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_27=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_17);
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
                        out.write(__jsp_StaticText.text[32]);
                        /*@lineinfo:translated-code*//*@lineinfo:123^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_28=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_17);
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
                        out.write(__jsp_StaticText.text[33]);
                      /*@lineinfo:translated-code*//*@lineinfo:123^140*/                      } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[34]);
                  /*@lineinfo:translated-code*//*@lineinfo:126^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_29=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_29.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_29.setName("UbicacionesForm");
                    __jsp_taghandler_29.setProperty("opcion");
                    __jsp_taghandler_29.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[35]);
                        /*@lineinfo:translated-code*//*@lineinfo:128^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_30=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_30.setKey("ubicaciones.codigo");
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
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:129^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_31=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_31.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_31.setMaxlength("10");
                          __jsp_taghandler_31.setName("UbicacionesForm");
                          __jsp_taghandler_31.setProperty("ubi_codigo");
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
                        out.write(__jsp_StaticText.text[37]);
                        /*@lineinfo:translated-code*//*@lineinfo:132^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_32=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_32.setKey("ubicaciones.descripcion");
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
                        out.write(__jsp_StaticText.text[38]);
                        /*@lineinfo:translated-code*//*@lineinfo:133^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_33=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_33.setMaxlength("50");
                          __jsp_taghandler_33.setName("UbicacionesForm");
                          __jsp_taghandler_33.setProperty("ubi_descripcion");
                          __jsp_taghandler_33.setReadonly(true);
                          __jsp_taghandler_33.setSize("50");
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
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:136^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_34=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_34.setKey("ubicaciones.direccion");
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
                        out.write(__jsp_StaticText.text[40]);
                        /*@lineinfo:translated-code*//*@lineinfo:137^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_35=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_35.setMaxlength("50");
                          __jsp_taghandler_35.setName("UbicacionesForm");
                          __jsp_taghandler_35.setProperty("ubi_direccion");
                          __jsp_taghandler_35.setReadonly(true);
                          __jsp_taghandler_35.setSize("50");
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
                        out.write(__jsp_StaticText.text[41]);
                        /*@lineinfo:translated-code*//*@lineinfo:140^28*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_36=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_36.setKey("ubicaciones.codreg");
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
                        out.write(__jsp_StaticText.text[42]);
                        /*@lineinfo:translated-code*//*@lineinfo:141^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_37=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_37.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_37.setName("UbicacionesForm");
                          __jsp_taghandler_37.setProperty("ubi_codreg");
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
                        out.write(__jsp_StaticText.text[43]);
                        /*@lineinfo:translated-code*//*@lineinfo:142^11*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_38=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_38.setMaxlength("30");
                          __jsp_taghandler_38.setName("UbicacionesForm");
                          __jsp_taghandler_38.setProperty("descripcion_codreg");
                          __jsp_taghandler_38.setReadonly(true);
                          __jsp_taghandler_38.setSize("30");
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
                        /*@lineinfo:translated-code*//*@lineinfo:145^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_39=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_39.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_39.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_39.setProperty("boton");
                          __jsp_taghandler_39.setStyleClass("boton1");
                          __jsp_taghandler_39.setValue("Eliminar");
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
                        /*@lineinfo:translated-code*//*@lineinfo:146^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_40=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_40.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_40.setOnclick("operacion.value=2;opcion.value=9");
                          __jsp_taghandler_40.setProperty("boton");
                          __jsp_taghandler_40.setStyleClass("boton1");
                          __jsp_taghandler_40.setValue("Cancelar");
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
                      /*@lineinfo:translated-code*//*@lineinfo:146^140*/                      } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[47]);
                /*@lineinfo:translated-code*//*@lineinfo:148^18*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[48]);
            /*@lineinfo:translated-code*//*@lineinfo:153^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_41=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_41.setParent(__jsp_taghandler_1);
              __jsp_taghandler_41.setKey("ubicaciones.codigo");
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
            out.write(__jsp_StaticText.text[49]);
            /*@lineinfo:translated-code*//*@lineinfo:154^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_42=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_42.setParent(__jsp_taghandler_1);
              __jsp_taghandler_42.setKey("ubicaciones.descripcion");
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
            out.write(__jsp_StaticText.text[50]);
            /*@lineinfo:translated-code*//*@lineinfo:155^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_43=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_43.setParent(__jsp_taghandler_1);
              __jsp_taghandler_43.setKey("ubicaciones.direccion");
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
            out.write(__jsp_StaticText.text[51]);
            /*@lineinfo:translated-code*//*@lineinfo:156^44*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_44=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_44.setParent(__jsp_taghandler_1);
              __jsp_taghandler_44.setKey("ubicaciones.codreg");
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
            out.write(__jsp_StaticText.text[52]);
            /*@lineinfo:translated-code*//*@lineinfo:157^45*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_45=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_45.setParent(__jsp_taghandler_1);
              __jsp_taghandler_45.setKey("oficinas.descripcion");
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
            out.write(__jsp_StaticText.text[53]);
            /*@lineinfo:translated-code*//*@lineinfo:158^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_46=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_46.setParent(__jsp_taghandler_1);
              __jsp_taghandler_46.setName("UbicacionesForm");
              __jsp_taghandler_46.setProperty("opcion");
              __jsp_taghandler_46.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[54]);
                /*@lineinfo:translated-code*//*@lineinfo:158^68*/                } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[55]);
            /*@lineinfo:translated-code*//*@lineinfo:161^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_47=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_47.setParent(__jsp_taghandler_1);
              __jsp_taghandler_47.setName("UbicacionesForm");
              __jsp_taghandler_47.setProperty("opcion");
              __jsp_taghandler_47.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[56]);
                /*@lineinfo:translated-code*//*@lineinfo:161^68*/                } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[57]);
            /*@lineinfo:user-code*//*@lineinfo:165^4*/             int pnum=0;
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[58]);
            /*@lineinfo:translated-code*//*@lineinfo:166^1*/            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_48=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
              __jsp_taghandler_48.setParent(__jsp_taghandler_1);
              __jsp_taghandler_48.setId("lista");
              __jsp_taghandler_48.setName("UbicacionesLista");
              java.lang.Object lista = null;
              __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_48,__jsp_tag_starteval,out);
                do {
                  lista = (java.lang.Object) pageContext.findAttribute("lista");
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[59]);
                  /*@lineinfo:user-code*//*@lineinfo:167^3*/                   if (pnum==1) {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[60]);
                  /*@lineinfo:user-code*//*@lineinfo:169^3*/                   } else { 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[61]);
                  /*@lineinfo:user-code*//*@lineinfo:171^3*/                   } 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[62]);
                  /*@lineinfo:translated-code*//*@lineinfo:172^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_49=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                    __jsp_taghandler_49.setName("lista");
                    __jsp_taghandler_49.setProperty("codigo");
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
                  out.write(__jsp_StaticText.text[63]);
                  /*@lineinfo:translated-code*//*@lineinfo:173^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_50=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_50.setParent(__jsp_taghandler_48);
                    __jsp_taghandler_50.setName("lista");
                    __jsp_taghandler_50.setProperty("descripcion");
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
                  out.write(__jsp_StaticText.text[64]);
                  /*@lineinfo:translated-code*//*@lineinfo:174^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_51=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_51.setParent(__jsp_taghandler_48);
                    __jsp_taghandler_51.setName("lista");
                    __jsp_taghandler_51.setProperty("direccion");
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
                  out.write(__jsp_StaticText.text[65]);
                  /*@lineinfo:translated-code*//*@lineinfo:175^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_52=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_52.setParent(__jsp_taghandler_48);
                    __jsp_taghandler_52.setName("lista");
                    __jsp_taghandler_52.setProperty("codreg");
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
                  out.write(__jsp_StaticText.text[66]);
                  /*@lineinfo:translated-code*//*@lineinfo:176^10*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_53=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_53.setParent(__jsp_taghandler_48);
                    __jsp_taghandler_53.setName("lista");
                    __jsp_taghandler_53.setProperty("descripcion_codreg");
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
                  out.write(__jsp_StaticText.text[67]);
                  /*@lineinfo:translated-code*//*@lineinfo:177^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_54=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_54.setParent(__jsp_taghandler_48);
                    __jsp_taghandler_54.setName("UbicacionesForm");
                    __jsp_taghandler_54.setProperty("opcion");
                    __jsp_taghandler_54.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[68]);
                        /*@lineinfo:translated-code*//*@lineinfo:179^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_55=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                          __jsp_taghandler_55.setIndexed(true);
                          __jsp_taghandler_55.setOnclick("operacion.value=1;opcion.value=3");
                          __jsp_taghandler_55.setProperty("boton");
                          __jsp_taghandler_55.setStyleClass("boton1");
                          __jsp_taghandler_55.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[69]);
                      /*@lineinfo:translated-code*//*@lineinfo:179^135*/                      } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[70]);
                  /*@lineinfo:translated-code*//*@lineinfo:182^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_56=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_56.setParent(__jsp_taghandler_48);
                    __jsp_taghandler_56.setName("UbicacionesForm");
                    __jsp_taghandler_56.setProperty("opcion");
                    __jsp_taghandler_56.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[71]);
                        /*@lineinfo:translated-code*//*@lineinfo:184^9*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_57=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                          __jsp_taghandler_57.setParent(__jsp_taghandler_56);
                          __jsp_taghandler_57.setIndexed(true);
                          __jsp_taghandler_57.setOnclick("operacion.value=1;opcion.value=2");
                          __jsp_taghandler_57.setProperty("boton");
                          __jsp_taghandler_57.setStyleClass("boton1");
                          __jsp_taghandler_57.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[72]);
                      /*@lineinfo:translated-code*//*@lineinfo:184^136*/                      } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[73]);
                  /*@lineinfo:user-code*//*@lineinfo:188^4*/                   if (pnum==0) pnum=1; else pnum=0; 
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[74]);
                /*@lineinfo:translated-code*//*@lineinfo:188^43*/                } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[75]);
            /*@lineinfo:translated-code*//*@lineinfo:190^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_58=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_58.setParent(__jsp_taghandler_1);
              __jsp_taghandler_58.setName("UbicacionesForm");
              __jsp_taghandler_58.setProperty("opcion");
              __jsp_taghandler_58.setValue("5");
              __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[76]);
                  /*@lineinfo:translated-code*//*@lineinfo:198^11*/                  {
                    org.apache.struts.taglib.html.LinkTag __jsp_taghandler_59=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href styleClass");
                    __jsp_taghandler_59.setParent(__jsp_taghandler_58);
                    __jsp_taghandler_59.setHref("ubicaciones.do");
                    __jsp_taghandler_59.setStyleClass("T8b");
                    __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_59,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[77]);
                      /*@lineinfo:translated-code*//*@lineinfo:198^61*/                      } while (__jsp_taghandler_59.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[78]);
                /*@lineinfo:translated-code*//*@lineinfo:200^23*/                } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[79]);
          /*@lineinfo:translated-code*//*@lineinfo:208^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[80]);


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
    private static final char text[][]=new char[81][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  function validar(form)\n  {\n    mensaje=\"\"\n    foco=\"\"  \n    if (form.opcion.value!=9){\n    try {\n    if (!textoObligatorio( form.ubi_codigo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Código\\n\"\n\t\t  if (foco.length==0) foco=\"form.ubi_codigo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!solonumerosint( form.ubi_codigo.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir solo números en Código\\n\"\n\t\t  if (foco.length==0) foco=\"form.ubi_codigo.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio( form.ubi_descripcion.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Descripción\\n\"\n\t\t  if (foco.length==0) foco=\"form.ubi_descripcion.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio( form.ubi_direccion.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Dirección\\n\"\n\t\t  if (foco.length==0) foco=\"form.ubi_direccion.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    i=form.ubi_codreg.selectedIndex;\n   \tif (!comboObligatorio(form.ubi_codreg.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Regional\\n\"\n\t\t  if (foco.length==0) foco=\"form.ubi_codreg.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }    \n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }           \n  }\n</script>\n<body>\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<caption>Ubicaciones</caption>\n".toCharArray();
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
      "</td>\n      </tr>       \n      <tr>\n          <td align=\"right\">".toCharArray();
      text[19] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[20] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[21] = 
      "\n   ".toCharArray();
      text[22] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[23] = 
      "</td>\n          <td>".toCharArray();
      text[24] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[25] = 
      "</td>\n          <td>".toCharArray();
      text[26] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[27] = 
      "</td>\n          <td>".toCharArray();
      text[28] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[29] = 
      "</td>\n          <td>".toCharArray();
      text[30] = 
      "\n          ".toCharArray();
      text[31] = 
      "</td>\n      </tr>       \n      <tr>\n          <td align=\"right\">".toCharArray();
      text[32] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[33] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[34] = 
      "\n   ".toCharArray();
      text[35] = 
      "\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[36] = 
      "</td>\n          <td>".toCharArray();
      text[37] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[38] = 
      "</td>\n          <td>".toCharArray();
      text[39] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[40] = 
      "</td>\n          <td>".toCharArray();
      text[41] = 
      "</td>\n      </tr>\n      <tr>\n          <td class=\"S10d\">".toCharArray();
      text[42] = 
      "</td>\n          <td>".toCharArray();
      text[43] = 
      "\n          ".toCharArray();
      text[44] = 
      "</td>\n      </tr>       \n      <tr>\n          <td align=\"right\">".toCharArray();
      text[45] = 
      " </td>\n          <td align=\"left\">".toCharArray();
      text[46] = 
      " </td>\n      </tr>\n   ".toCharArray();
      text[47] = 
      "\n".toCharArray();
      text[48] = 
      "\n</table>\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<tr class=\"FondoAzul\">\n   <td width=\"60\"  scope=\"col\" class=\"S10c\">".toCharArray();
      text[49] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[50] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[51] = 
      "</td>\n   <td width=\"60\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[52] = 
      "</td>\n   <td width=\"160\" scope=\"col\" class=\"S10c\">".toCharArray();
      text[53] = 
      "</td>\n   ".toCharArray();
      text[54] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[55] = 
      "\n   ".toCharArray();
      text[56] = 
      "   \n   <td></td>\n   ".toCharArray();
      text[57] = 
      "\n </tr>\n   ".toCharArray();
      text[58] = 
      "\n".toCharArray();
      text[59] = 
      "\n  ".toCharArray();
      text[60] = 
      "\n     <tr class=\"T8b\">\n  ".toCharArray();
      text[61] = 
      "\n     <tr class=\"T8a\">\n  ".toCharArray();
      text[62] = 
      "\n     <td>".toCharArray();
      text[63] = 
      "</td>\n     <td>".toCharArray();
      text[64] = 
      "</td>\n     <td>".toCharArray();
      text[65] = 
      "</td>\n     <td>".toCharArray();
      text[66] = 
      "</td>\n     <td>".toCharArray();
      text[67] = 
      "</td>\n     ".toCharArray();
      text[68] = 
      "\n     <td>\n        ".toCharArray();
      text[69] = 
      "\n     </td>\n     ".toCharArray();
      text[70] = 
      "\n     ".toCharArray();
      text[71] = 
      "\n     <td>\n        ".toCharArray();
      text[72] = 
      "\n     </td>\n     ".toCharArray();
      text[73] = 
      "\n   </tr>\n   ".toCharArray();
      text[74] = 
      "\n".toCharArray();
      text[75] = 
      "\n".toCharArray();
      text[76] = 
      "\n   <tr>\n   <td colspan=\"5\">\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n  <tr>\n    <td align=\"center\"> \n      <FONT color=\"#023264\" face=\"Arial, Helvetica, san-serif\" size=1> \n        <em> \n          ".toCharArray();
      text[77] = 
      "\n          © 2006  Aduana Nacional de Bolivia Todos los derechos reservados.\n          ".toCharArray();
      text[78] = 
      " \n        </em>\n      </FONT>\n    </td>\n  </tr>\n</table>\n   </td>\n   </tr>\n".toCharArray();
      text[79] = 
      "\n</table>\n".toCharArray();
      text[80] = 
      "\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
