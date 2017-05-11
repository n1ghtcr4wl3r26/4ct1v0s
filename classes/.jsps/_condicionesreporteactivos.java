  /*@lineinfo:filename=/condicionesreporteactivos.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _condicionesreporteactivos extends oracle.jsp.runtime.HttpJsp {

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
    _condicionesreporteactivos page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:90^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/reporteactivosAction");
        __jsp_taghandler_1.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:91^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:92^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:95^3*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setName("ReportesForm");
              __jsp_taghandler_4.setProperty("operacion");
              __jsp_taghandler_4.setValue("1");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:96^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("ReportesForm");
                    __jsp_taghandler_5.setProperty("opcion");
                    __jsp_taghandler_5.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[9]);
                        /*@lineinfo:translated-code*//*@lineinfo:99^29*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_6=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setMaxlength("50");
                          __jsp_taghandler_6.setName("ReportesForm");
                          __jsp_taghandler_6.setProperty("condicion1");
                          __jsp_taghandler_6.setSize("50");
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
                      /*@lineinfo:translated-code*//*@lineinfo:99^109*/                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[11]);
                  /*@lineinfo:translated-code*//*@lineinfo:100^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_7=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_7.setName("ReportesForm");
                    __jsp_taghandler_7.setProperty("opcion");
                    __jsp_taghandler_7.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[12]);
                        /*@lineinfo:translated-code*//*@lineinfo:104^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_8=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_8.setDisabled(false);
                          __jsp_taghandler_8.setName("ReportesForm");
                          __jsp_taghandler_8.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[13]);
                              /*@lineinfo:translated-code*//*@lineinfo:105^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_9=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                                __jsp_taghandler_9.setCollection("RubrosLista");
                                __jsp_taghandler_9.setLabelProperty("descripcion");
                                __jsp_taghandler_9.setProperty("codigo");
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
                            } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[14]);
                        /*@lineinfo:translated-code*//*@lineinfo:108^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_10=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_10.setName("ReportesForm");
                          __jsp_taghandler_10.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[15]);
                        /*@lineinfo:translated-code*//*@lineinfo:109^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_11=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_11.setMaxlength("60");
                          __jsp_taghandler_11.setName("ReportesForm");
                          __jsp_taghandler_11.setProperty("des_codreg");
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
                        out.write(__jsp_StaticText.text[16]);
                        /*@lineinfo:translated-code*//*@lineinfo:112^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_12=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_12.setMaxlength("5");
                          __jsp_taghandler_12.setName("ReportesForm");
                          __jsp_taghandler_12.setProperty("condicion3");
                          __jsp_taghandler_12.setSize("5");
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
                        /*@lineinfo:translated-code*//*@lineinfo:115^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_13=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_13.setMaxlength("5");
                          __jsp_taghandler_13.setName("ReportesForm");
                          __jsp_taghandler_13.setProperty("condicion4");
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
                        out.write(__jsp_StaticText.text[18]);
                      /*@lineinfo:translated-code*//*@lineinfo:115^106*/                      } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[19]);
                  /*@lineinfo:translated-code*//*@lineinfo:116^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_14=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_14.setName("ReportesForm");
                    __jsp_taghandler_14.setProperty("opcion");
                    __jsp_taghandler_14.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[20]);
                        /*@lineinfo:translated-code*//*@lineinfo:120^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_15=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onchange property");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                          __jsp_taghandler_15.setDisabled(false);
                          __jsp_taghandler_15.setName("ReportesForm");
                          __jsp_taghandler_15.setOnchange("quitar()");
                          __jsp_taghandler_15.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[21]);
                              /*@lineinfo:translated-code*//*@lineinfo:121^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_16=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                                __jsp_taghandler_16.setCollection("RubrosLista");
                                __jsp_taghandler_16.setLabelProperty("descripcion");
                                __jsp_taghandler_16.setProperty("codigo");
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
                            } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[22]);
                        /*@lineinfo:translated-code*//*@lineinfo:124^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_17=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_14);
                          __jsp_taghandler_17.setDisabled(false);
                          __jsp_taghandler_17.setName("ReportesForm");
                          __jsp_taghandler_17.setProperty("condicion2");
                          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[23]);
                              /*@lineinfo:translated-code*//*@lineinfo:125^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_18=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                                __jsp_taghandler_18.setCollection("GruposLista");
                                __jsp_taghandler_18.setLabelProperty("descripcion");
                                __jsp_taghandler_18.setProperty("codigo");
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
                            } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[24]);
                      /*@lineinfo:translated-code*//*@lineinfo:125^115*/                      } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[25]);
                  /*@lineinfo:translated-code*//*@lineinfo:126^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_19=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_19.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_19.setName("ReportesForm");
                    __jsp_taghandler_19.setProperty("opcion");
                    __jsp_taghandler_19.setValue("4");
                    __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[26]);
                        /*@lineinfo:translated-code*//*@lineinfo:130^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_20=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_20.setDisabled(false);
                          __jsp_taghandler_20.setName("ReportesForm");
                          __jsp_taghandler_20.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_20,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[27]);
                              /*@lineinfo:translated-code*//*@lineinfo:131^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_21=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                __jsp_taghandler_21.setCollection("UbicacionesLista");
                                __jsp_taghandler_21.setLabelProperty("descripcion");
                                __jsp_taghandler_21.setProperty("codigo");
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
                            } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[28]);
                        /*@lineinfo:translated-code*//*@lineinfo:134^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_22=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_22.setName("ReportesForm");
                          __jsp_taghandler_22.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[29]);
                        /*@lineinfo:translated-code*//*@lineinfo:135^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_23=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                          __jsp_taghandler_23.setMaxlength("60");
                          __jsp_taghandler_23.setName("ReportesForm");
                          __jsp_taghandler_23.setProperty("des_codreg");
                          __jsp_taghandler_23.setReadonly(true);
                          __jsp_taghandler_23.setSize("60");
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
                      /*@lineinfo:translated-code*//*@lineinfo:135^108*/                      } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[31]);
                  /*@lineinfo:translated-code*//*@lineinfo:136^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_24=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_24.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_24.setName("ReportesForm");
                    __jsp_taghandler_24.setProperty("opcion");
                    __jsp_taghandler_24.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[32]);
                        /*@lineinfo:translated-code*//*@lineinfo:140^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_25=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                          __jsp_taghandler_25.setDisabled(false);
                          __jsp_taghandler_25.setName("ReportesForm");
                          __jsp_taghandler_25.setProperty("condicion3");
                          __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_25,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[33]);
                              /*@lineinfo:translated-code*//*@lineinfo:141^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_26=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                                __jsp_taghandler_26.setCollection("FuncionariosLista");
                                __jsp_taghandler_26.setLabelProperty("descripcion");
                                __jsp_taghandler_26.setProperty("codigo");
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
                            } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[34]);
                        /*@lineinfo:translated-code*//*@lineinfo:144^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_27=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onchange property");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_24);
                          __jsp_taghandler_27.setDisabled(false);
                          __jsp_taghandler_27.setName("ReportesForm");
                          __jsp_taghandler_27.setOnchange("quitar()");
                          __jsp_taghandler_27.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[35]);
                              /*@lineinfo:translated-code*//*@lineinfo:145^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_28=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                                __jsp_taghandler_28.setCollection("RubrosLista");
                                __jsp_taghandler_28.setLabelProperty("descripcion");
                                __jsp_taghandler_28.setProperty("codigo");
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
                            } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:148^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_29=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_29.setParent(__jsp_taghandler_24);
                          __jsp_taghandler_29.setDisabled(false);
                          __jsp_taghandler_29.setName("ReportesForm");
                          __jsp_taghandler_29.setProperty("condicion2");
                          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[37]);
                              /*@lineinfo:translated-code*//*@lineinfo:149^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_30=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                __jsp_taghandler_30.setCollection("GruposLista");
                                __jsp_taghandler_30.setLabelProperty("descripcion");
                                __jsp_taghandler_30.setProperty("codigo");
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
                            } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[38]);
                      /*@lineinfo:translated-code*//*@lineinfo:149^115*/                      } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[39]);
                  /*@lineinfo:translated-code*//*@lineinfo:150^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_31=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_31.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_31.setName("ReportesForm");
                    __jsp_taghandler_31.setProperty("opcion");
                    __jsp_taghandler_31.setValue("6");
                    __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[40]);
                        /*@lineinfo:translated-code*//*@lineinfo:154^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_32=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                          __jsp_taghandler_32.setDisabled(false);
                          __jsp_taghandler_32.setName("ReportesForm");
                          __jsp_taghandler_32.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_32,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[41]);
                              /*@lineinfo:translated-code*//*@lineinfo:155^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_33=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                                __jsp_taghandler_33.setCollection("ProyectosLista");
                                __jsp_taghandler_33.setLabelProperty("descripcion");
                                __jsp_taghandler_33.setProperty("codigo");
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
                            } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[42]);
                      /*@lineinfo:translated-code*//*@lineinfo:155^118*/                      } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[43]);
                  /*@lineinfo:translated-code*//*@lineinfo:156^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_34=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_34.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_34.setName("ReportesForm");
                    __jsp_taghandler_34.setProperty("opcion");
                    __jsp_taghandler_34.setValue("7");
                    __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[44]);
                        /*@lineinfo:translated-code*//*@lineinfo:160^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_35=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                          __jsp_taghandler_35.setMaxlength("50");
                          __jsp_taghandler_35.setName("ReportesForm");
                          __jsp_taghandler_35.setProperty("condicion1");
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
                        out.write(__jsp_StaticText.text[45]);
                        /*@lineinfo:translated-code*//*@lineinfo:163^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_36=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_34);
                          __jsp_taghandler_36.setMaxlength("50");
                          __jsp_taghandler_36.setName("ReportesForm");
                          __jsp_taghandler_36.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[46]);
                        /*@lineinfo:translated-code*//*@lineinfo:166^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_37=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_37.setParent(__jsp_taghandler_34);
                          __jsp_taghandler_37.setMaxlength("50");
                          __jsp_taghandler_37.setName("ReportesForm");
                          __jsp_taghandler_37.setProperty("condicion3");
                          __jsp_taghandler_37.setSize("50");
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
                        out.write(__jsp_StaticText.text[47]);
                        /*@lineinfo:translated-code*//*@lineinfo:169^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_38=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_34);
                          __jsp_taghandler_38.setMaxlength("50");
                          __jsp_taghandler_38.setName("ReportesForm");
                          __jsp_taghandler_38.setProperty("condicion4");
                          __jsp_taghandler_38.setSize("50");
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
                        out.write(__jsp_StaticText.text[48]);
                      /*@lineinfo:translated-code*//*@lineinfo:169^108*/                      } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[49]);
                  /*@lineinfo:translated-code*//*@lineinfo:170^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_39=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_39.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_39.setName("ReportesForm");
                    __jsp_taghandler_39.setProperty("opcion");
                    __jsp_taghandler_39.setValue("8");
                    __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[50]);
                        /*@lineinfo:translated-code*//*@lineinfo:174^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_40=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                          __jsp_taghandler_40.setMaxlength("50");
                          __jsp_taghandler_40.setName("ReportesForm");
                          __jsp_taghandler_40.setProperty("condicion1");
                          __jsp_taghandler_40.setSize("50");
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
                        out.write(__jsp_StaticText.text[51]);
                        /*@lineinfo:translated-code*//*@lineinfo:177^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_41=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_41.setParent(__jsp_taghandler_39);
                          __jsp_taghandler_41.setMaxlength("50");
                          __jsp_taghandler_41.setName("ReportesForm");
                          __jsp_taghandler_41.setProperty("condicion2");
                          __jsp_taghandler_41.setSize("50");
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
                        out.write(__jsp_StaticText.text[52]);
                        /*@lineinfo:translated-code*//*@lineinfo:180^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_42=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_42.setParent(__jsp_taghandler_39);
                          __jsp_taghandler_42.setMaxlength("50");
                          __jsp_taghandler_42.setName("ReportesForm");
                          __jsp_taghandler_42.setProperty("condicion3");
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
                        out.write(__jsp_StaticText.text[53]);
                        /*@lineinfo:translated-code*//*@lineinfo:183^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_43=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_43.setParent(__jsp_taghandler_39);
                          __jsp_taghandler_43.setMaxlength("50");
                          __jsp_taghandler_43.setName("ReportesForm");
                          __jsp_taghandler_43.setProperty("condicion4");
                          __jsp_taghandler_43.setSize("50");
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
                        out.write(__jsp_StaticText.text[54]);
                      /*@lineinfo:translated-code*//*@lineinfo:183^108*/                      } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[55]);
                  /*@lineinfo:translated-code*//*@lineinfo:184^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_44=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_44.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_44.setName("ReportesForm");
                    __jsp_taghandler_44.setProperty("opcion");
                    __jsp_taghandler_44.setValue("9");
                    __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[56]);
                        /*@lineinfo:translated-code*//*@lineinfo:188^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_45=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_45.setMaxlength("50");
                          __jsp_taghandler_45.setName("ReportesForm");
                          __jsp_taghandler_45.setProperty("condicion1");
                          __jsp_taghandler_45.setSize("50");
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
                        out.write(__jsp_StaticText.text[57]);
                        /*@lineinfo:translated-code*//*@lineinfo:191^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_46=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_46.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_46.setMaxlength("50");
                          __jsp_taghandler_46.setName("ReportesForm");
                          __jsp_taghandler_46.setProperty("condicion2");
                          __jsp_taghandler_46.setSize("50");
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
                        out.write(__jsp_StaticText.text[58]);
                        /*@lineinfo:translated-code*//*@lineinfo:194^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_47=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_47.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_47.setMaxlength("50");
                          __jsp_taghandler_47.setName("ReportesForm");
                          __jsp_taghandler_47.setProperty("condicion3");
                          __jsp_taghandler_47.setSize("50");
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
                        /*@lineinfo:translated-code*//*@lineinfo:197^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_48=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_48.setMaxlength("50");
                          __jsp_taghandler_48.setName("ReportesForm");
                          __jsp_taghandler_48.setProperty("condicion4");
                          __jsp_taghandler_48.setSize("50");
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
                      /*@lineinfo:translated-code*//*@lineinfo:197^96*/                      } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[61]);
                  /*@lineinfo:translated-code*//*@lineinfo:198^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_49=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_49.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_49.setName("ReportesForm");
                    __jsp_taghandler_49.setProperty("opcion");
                    __jsp_taghandler_49.setValue("10");
                    __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[62]);
                        /*@lineinfo:translated-code*//*@lineinfo:202^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_50=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_50.setMaxlength("50");
                          __jsp_taghandler_50.setName("ReportesForm");
                          __jsp_taghandler_50.setProperty("condicion1");
                          __jsp_taghandler_50.setSize("50");
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
                        out.write(__jsp_StaticText.text[63]);
                        /*@lineinfo:translated-code*//*@lineinfo:205^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_51=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_51.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_51.setMaxlength("50");
                          __jsp_taghandler_51.setName("ReportesForm");
                          __jsp_taghandler_51.setProperty("condicion2");
                          __jsp_taghandler_51.setSize("50");
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
                        /*@lineinfo:translated-code*//*@lineinfo:208^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_52=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_52.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_52.setMaxlength("50");
                          __jsp_taghandler_52.setName("ReportesForm");
                          __jsp_taghandler_52.setProperty("condicion3");
                          __jsp_taghandler_52.setSize("50");
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
                        out.write(__jsp_StaticText.text[65]);
                        /*@lineinfo:translated-code*//*@lineinfo:211^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_53=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_53.setMaxlength("50");
                          __jsp_taghandler_53.setName("ReportesForm");
                          __jsp_taghandler_53.setProperty("condicion4");
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
                        /*@lineinfo:translated-code*//*@lineinfo:214^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_54=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_54.setParent(__jsp_taghandler_49);
                          __jsp_taghandler_54.setMaxlength("50");
                          __jsp_taghandler_54.setName("ReportesForm");
                          __jsp_taghandler_54.setProperty("condicion5");
                          __jsp_taghandler_54.setSize("50");
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
                        out.write(__jsp_StaticText.text[67]);
                      /*@lineinfo:translated-code*//*@lineinfo:214^96*/                      } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[68]);
                  /*@lineinfo:translated-code*//*@lineinfo:215^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_55=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_55.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_55.setName("ReportesForm");
                    __jsp_taghandler_55.setProperty("opcion");
                    __jsp_taghandler_55.setValue("11");
                    __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[69]);
                        /*@lineinfo:translated-code*//*@lineinfo:219^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_56=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_56.setParent(__jsp_taghandler_55);
                          __jsp_taghandler_56.setDisabled(false);
                          __jsp_taghandler_56.setName("ReportesForm");
                          __jsp_taghandler_56.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_56,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[70]);
                              /*@lineinfo:translated-code*//*@lineinfo:220^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_57=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_57.setParent(__jsp_taghandler_56);
                                __jsp_taghandler_57.setCollection("OficinasLista");
                                __jsp_taghandler_57.setLabelProperty("descripcion");
                                __jsp_taghandler_57.setProperty("codigo");
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
                            } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[71]);
                        /*@lineinfo:translated-code*//*@lineinfo:223^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_58=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_58.setParent(__jsp_taghandler_55);
                          __jsp_taghandler_58.setName("ReportesForm");
                          __jsp_taghandler_58.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[72]);
                        /*@lineinfo:translated-code*//*@lineinfo:224^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_59=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_59.setParent(__jsp_taghandler_55);
                          __jsp_taghandler_59.setMaxlength("60");
                          __jsp_taghandler_59.setName("ReportesForm");
                          __jsp_taghandler_59.setProperty("des_codreg");
                          __jsp_taghandler_59.setReadonly(true);
                          __jsp_taghandler_59.setSize("60");
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
                        out.write(__jsp_StaticText.text[73]);
                      /*@lineinfo:translated-code*//*@lineinfo:224^108*/                      } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[74]);
                  /*@lineinfo:translated-code*//*@lineinfo:225^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_60=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_60.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_60.setName("ReportesForm");
                    __jsp_taghandler_60.setProperty("opcion");
                    __jsp_taghandler_60.setValue("12");
                    __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[75]);
                        /*@lineinfo:translated-code*//*@lineinfo:229^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_61=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_61.setParent(__jsp_taghandler_60);
                          __jsp_taghandler_61.setDisabled(false);
                          __jsp_taghandler_61.setName("ReportesForm");
                          __jsp_taghandler_61.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_61,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[76]);
                              /*@lineinfo:translated-code*//*@lineinfo:230^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_62=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_62.setParent(__jsp_taghandler_61);
                                __jsp_taghandler_62.setCollection("RubrosLista");
                                __jsp_taghandler_62.setLabelProperty("descripcion");
                                __jsp_taghandler_62.setProperty("codigo");
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
                            } while (__jsp_taghandler_61.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[77]);
                        /*@lineinfo:translated-code*//*@lineinfo:233^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_63=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_63.setParent(__jsp_taghandler_60);
                          __jsp_taghandler_63.setName("ReportesForm");
                          __jsp_taghandler_63.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[78]);
                        /*@lineinfo:translated-code*//*@lineinfo:234^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_64=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_64.setParent(__jsp_taghandler_60);
                          __jsp_taghandler_64.setMaxlength("60");
                          __jsp_taghandler_64.setName("ReportesForm");
                          __jsp_taghandler_64.setProperty("des_codreg");
                          __jsp_taghandler_64.setReadonly(true);
                          __jsp_taghandler_64.setSize("60");
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
                        out.write(__jsp_StaticText.text[79]);
                      /*@lineinfo:translated-code*//*@lineinfo:234^108*/                      } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[80]);
                  /*@lineinfo:translated-code*//*@lineinfo:235^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_65=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_65.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_65.setName("ReportesForm");
                    __jsp_taghandler_65.setProperty("opcion");
                    __jsp_taghandler_65.setValue("13");
                    __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[81]);
                        /*@lineinfo:translated-code*//*@lineinfo:239^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_66=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_66.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_66.setDisabled(false);
                          __jsp_taghandler_66.setName("ReportesForm");
                          __jsp_taghandler_66.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_66,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[82]);
                              /*@lineinfo:translated-code*//*@lineinfo:240^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_67=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_67.setParent(__jsp_taghandler_66);
                                __jsp_taghandler_67.setCollection("RubrosLista");
                                __jsp_taghandler_67.setLabelProperty("descripcion");
                                __jsp_taghandler_67.setProperty("codigo");
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
                            } while (__jsp_taghandler_66.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[83]);
                        /*@lineinfo:translated-code*//*@lineinfo:243^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_68=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_68.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_68.setName("ReportesForm");
                          __jsp_taghandler_68.setProperty("condicion3");
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
                        out.write(__jsp_StaticText.text[84]);
                        /*@lineinfo:translated-code*//*@lineinfo:244^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_69=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_69.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_69.setMaxlength("60");
                          __jsp_taghandler_69.setName("ReportesForm");
                          __jsp_taghandler_69.setProperty("des_codreg");
                          __jsp_taghandler_69.setReadonly(true);
                          __jsp_taghandler_69.setSize("60");
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
                        out.write(__jsp_StaticText.text[85]);
                        /*@lineinfo:translated-code*//*@lineinfo:247^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_70=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_70.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_70.setDisabled(false);
                          __jsp_taghandler_70.setName("ReportesForm");
                          __jsp_taghandler_70.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_70,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[86]);
                              /*@lineinfo:translated-code*//*@lineinfo:248^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_71=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_71.setParent(__jsp_taghandler_70);
                                __jsp_taghandler_71.setCollection("ProyectosLista");
                                __jsp_taghandler_71.setLabelProperty("descripcion");
                                __jsp_taghandler_71.setProperty("codigo");
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
                            } while (__jsp_taghandler_70.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[87]);
                        /*@lineinfo:translated-code*//*@lineinfo:251^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_72=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_72.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_72.setDisabled(false);
                          __jsp_taghandler_72.setName("ReportesForm");
                          __jsp_taghandler_72.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_72,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[88]);
                              /*@lineinfo:translated-code*//*@lineinfo:252^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_73=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_73.setParent(__jsp_taghandler_72);
                                __jsp_taghandler_73.setCollection("ProyectosLista");
                                __jsp_taghandler_73.setLabelProperty("descripcion");
                                __jsp_taghandler_73.setProperty("codigo");
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
                            } while (__jsp_taghandler_72.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[89]);
                        /*@lineinfo:translated-code*//*@lineinfo:255^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_74=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_74.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_74.setMaxlength("10");
                          __jsp_taghandler_74.setName("ReportesForm");
                          __jsp_taghandler_74.setProperty("condicion4");
                          __jsp_taghandler_74.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_74,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_74.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[90]);
                        /*@lineinfo:translated-code*//*@lineinfo:258^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_75=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_75.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_75.setMaxlength("10");
                          __jsp_taghandler_75.setName("ReportesForm");
                          __jsp_taghandler_75.setOnchange("cargar_anios()");
                          __jsp_taghandler_75.setProperty("condicion5");
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
                        out.write(__jsp_StaticText.text[91]);
                        /*@lineinfo:translated-code*//*@lineinfo:259^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_76=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_76.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_76.setName("ReportesForm");
                          __jsp_taghandler_76.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[92]);
                        /*@lineinfo:translated-code*//*@lineinfo:260^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_77=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_77.setParent(__jsp_taghandler_65);
                          __jsp_taghandler_77.setName("ReportesForm");
                          __jsp_taghandler_77.setProperty("condicion11");
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
                        out.write(__jsp_StaticText.text[93]);
                      /*@lineinfo:translated-code*//*@lineinfo:260^74*/                      } while (__jsp_taghandler_65.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[94]);
                  /*@lineinfo:translated-code*//*@lineinfo:264^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_78=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_78.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_78.setName("ReportesForm");
                    __jsp_taghandler_78.setProperty("opcion");
                    __jsp_taghandler_78.setValue("14");
                    __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[95]);
                        /*@lineinfo:translated-code*//*@lineinfo:268^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_79=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_79.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_79.setDisabled(false);
                          __jsp_taghandler_79.setName("ReportesForm");
                          __jsp_taghandler_79.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_79,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[96]);
                              /*@lineinfo:translated-code*//*@lineinfo:269^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_80=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_80.setParent(__jsp_taghandler_79);
                                __jsp_taghandler_80.setCollection("RubrosLista");
                                __jsp_taghandler_80.setLabelProperty("descripcion");
                                __jsp_taghandler_80.setProperty("codigo");
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
                            } while (__jsp_taghandler_79.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[97]);
                        /*@lineinfo:translated-code*//*@lineinfo:272^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_81=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_81.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_81.setName("ReportesForm");
                          __jsp_taghandler_81.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[98]);
                        /*@lineinfo:translated-code*//*@lineinfo:273^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_82=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_82.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_82.setMaxlength("60");
                          __jsp_taghandler_82.setName("ReportesForm");
                          __jsp_taghandler_82.setProperty("des_codreg");
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
                        out.write(__jsp_StaticText.text[99]);
                        /*@lineinfo:translated-code*//*@lineinfo:276^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_83=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_83.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_83.setDisabled(false);
                          __jsp_taghandler_83.setName("ReportesForm");
                          __jsp_taghandler_83.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_83,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[100]);
                              /*@lineinfo:translated-code*//*@lineinfo:277^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_84=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_84.setParent(__jsp_taghandler_83);
                                __jsp_taghandler_84.setCollection("ProyectosLista");
                                __jsp_taghandler_84.setLabelProperty("descripcion");
                                __jsp_taghandler_84.setProperty("codigo");
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
                            } while (__jsp_taghandler_83.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[101]);
                        /*@lineinfo:translated-code*//*@lineinfo:280^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_85=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_85.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_85.setDisabled(false);
                          __jsp_taghandler_85.setName("ReportesForm");
                          __jsp_taghandler_85.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_85,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[102]);
                              /*@lineinfo:translated-code*//*@lineinfo:281^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_86=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_86.setParent(__jsp_taghandler_85);
                                __jsp_taghandler_86.setCollection("ProyectosLista");
                                __jsp_taghandler_86.setLabelProperty("descripcion");
                                __jsp_taghandler_86.setProperty("codigo");
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
                            } while (__jsp_taghandler_85.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[103]);
                        /*@lineinfo:translated-code*//*@lineinfo:284^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_87=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_87.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_87.setMaxlength("10");
                          __jsp_taghandler_87.setName("ReportesForm");
                          __jsp_taghandler_87.setProperty("condicion4");
                          __jsp_taghandler_87.setSize("10");
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
                        out.write(__jsp_StaticText.text[104]);
                        /*@lineinfo:translated-code*//*@lineinfo:287^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_88=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_88.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_88.setMaxlength("10");
                          __jsp_taghandler_88.setName("ReportesForm");
                          __jsp_taghandler_88.setOnblur("cargar_anios()");
                          __jsp_taghandler_88.setProperty("condicion5");
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
                        out.write(__jsp_StaticText.text[105]);
                        /*@lineinfo:translated-code*//*@lineinfo:288^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_89=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_89.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_89.setName("ReportesForm");
                          __jsp_taghandler_89.setProperty("condicion10");
                          __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_89,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_89.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[106]);
                        /*@lineinfo:translated-code*//*@lineinfo:289^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_90=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_90.setParent(__jsp_taghandler_78);
                          __jsp_taghandler_90.setName("ReportesForm");
                          __jsp_taghandler_90.setProperty("condicion11");
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
                        out.write(__jsp_StaticText.text[107]);
                      /*@lineinfo:translated-code*//*@lineinfo:289^74*/                      } while (__jsp_taghandler_78.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[108]);
                  /*@lineinfo:translated-code*//*@lineinfo:293^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_91=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_91.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_91.setName("ReportesForm");
                    __jsp_taghandler_91.setProperty("opcion");
                    __jsp_taghandler_91.setValue("15");
                    __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[109]);
                        /*@lineinfo:translated-code*//*@lineinfo:297^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_92=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_92.setParent(__jsp_taghandler_91);
                          __jsp_taghandler_92.setDisabled(false);
                          __jsp_taghandler_92.setName("ReportesForm");
                          __jsp_taghandler_92.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_92,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[110]);
                              /*@lineinfo:translated-code*//*@lineinfo:298^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_93=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_93.setParent(__jsp_taghandler_92);
                                __jsp_taghandler_93.setCollection("RubrosLista");
                                __jsp_taghandler_93.setLabelProperty("descripcion");
                                __jsp_taghandler_93.setProperty("codigo");
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
                            } while (__jsp_taghandler_92.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[111]);
                        /*@lineinfo:translated-code*//*@lineinfo:301^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_94=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_94.setParent(__jsp_taghandler_91);
                          __jsp_taghandler_94.setName("ReportesForm");
                          __jsp_taghandler_94.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[112]);
                        /*@lineinfo:translated-code*//*@lineinfo:302^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_95=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_95.setParent(__jsp_taghandler_91);
                          __jsp_taghandler_95.setMaxlength("60");
                          __jsp_taghandler_95.setName("ReportesForm");
                          __jsp_taghandler_95.setProperty("des_codreg");
                          __jsp_taghandler_95.setReadonly(true);
                          __jsp_taghandler_95.setSize("60");
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
                        out.write(__jsp_StaticText.text[113]);
                        /*@lineinfo:translated-code*//*@lineinfo:305^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_96=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_96.setParent(__jsp_taghandler_91);
                          __jsp_taghandler_96.setDisabled(false);
                          __jsp_taghandler_96.setName("ReportesForm");
                          __jsp_taghandler_96.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_96.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_96,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[114]);
                              /*@lineinfo:translated-code*//*@lineinfo:306^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_97=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_97.setParent(__jsp_taghandler_96);
                                __jsp_taghandler_97.setCollection("ProyectosLista");
                                __jsp_taghandler_97.setLabelProperty("descripcion");
                                __jsp_taghandler_97.setProperty("codigo");
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
                            } while (__jsp_taghandler_96.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_96.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_96);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[115]);
                        /*@lineinfo:translated-code*//*@lineinfo:309^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_98=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_98.setParent(__jsp_taghandler_91);
                          __jsp_taghandler_98.setDisabled(false);
                          __jsp_taghandler_98.setName("ReportesForm");
                          __jsp_taghandler_98.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_98.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_98,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[116]);
                              /*@lineinfo:translated-code*//*@lineinfo:310^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_99=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_99.setParent(__jsp_taghandler_98);
                                __jsp_taghandler_99.setCollection("ProyectosLista");
                                __jsp_taghandler_99.setLabelProperty("descripcion");
                                __jsp_taghandler_99.setProperty("codigo");
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
                            } while (__jsp_taghandler_98.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_98.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_98);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[117]);
                        /*@lineinfo:translated-code*//*@lineinfo:313^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_100=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_100.setParent(__jsp_taghandler_91);
                          __jsp_taghandler_100.setMaxlength("10");
                          __jsp_taghandler_100.setName("ReportesForm");
                          __jsp_taghandler_100.setOnblur("cargar_anios()");
                          __jsp_taghandler_100.setProperty("condicion5");
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
                        out.write(__jsp_StaticText.text[118]);
                        /*@lineinfo:translated-code*//*@lineinfo:314^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_101=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_101.setParent(__jsp_taghandler_91);
                          __jsp_taghandler_101.setName("ReportesForm");
                          __jsp_taghandler_101.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[119]);
                        /*@lineinfo:translated-code*//*@lineinfo:315^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_102=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_102.setParent(__jsp_taghandler_91);
                          __jsp_taghandler_102.setName("ReportesForm");
                          __jsp_taghandler_102.setProperty("condicion11");
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
                        out.write(__jsp_StaticText.text[120]);
                      /*@lineinfo:translated-code*//*@lineinfo:315^74*/                      } while (__jsp_taghandler_91.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[121]);
                  /*@lineinfo:translated-code*//*@lineinfo:316^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_103=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_103.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_103.setName("ReportesForm");
                    __jsp_taghandler_103.setProperty("opcion");
                    __jsp_taghandler_103.setValue("16");
                    __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[122]);
                        /*@lineinfo:translated-code*//*@lineinfo:320^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_104=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_104.setParent(__jsp_taghandler_103);
                          __jsp_taghandler_104.setDisabled(false);
                          __jsp_taghandler_104.setName("ReportesForm");
                          __jsp_taghandler_104.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_104.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_104,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[123]);
                              /*@lineinfo:translated-code*//*@lineinfo:321^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_105=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_105.setParent(__jsp_taghandler_104);
                                __jsp_taghandler_105.setCollection("RubrosLista");
                                __jsp_taghandler_105.setLabelProperty("descripcion");
                                __jsp_taghandler_105.setProperty("codigo");
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
                            } while (__jsp_taghandler_104.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_104.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_104);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[124]);
                        /*@lineinfo:translated-code*//*@lineinfo:324^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_106=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_106.setParent(__jsp_taghandler_103);
                          __jsp_taghandler_106.setName("ReportesForm");
                          __jsp_taghandler_106.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[125]);
                        /*@lineinfo:translated-code*//*@lineinfo:325^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_107=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_107.setParent(__jsp_taghandler_103);
                          __jsp_taghandler_107.setMaxlength("60");
                          __jsp_taghandler_107.setName("ReportesForm");
                          __jsp_taghandler_107.setProperty("des_codreg");
                          __jsp_taghandler_107.setReadonly(true);
                          __jsp_taghandler_107.setSize("60");
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
                        out.write(__jsp_StaticText.text[126]);
                        /*@lineinfo:translated-code*//*@lineinfo:328^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_108=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_108.setParent(__jsp_taghandler_103);
                          __jsp_taghandler_108.setDisabled(false);
                          __jsp_taghandler_108.setName("ReportesForm");
                          __jsp_taghandler_108.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_108.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_108,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[127]);
                              /*@lineinfo:translated-code*//*@lineinfo:329^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_109=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_109.setParent(__jsp_taghandler_108);
                                __jsp_taghandler_109.setCollection("ProyectosLista");
                                __jsp_taghandler_109.setLabelProperty("descripcion");
                                __jsp_taghandler_109.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_109.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_109.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_109.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_109);
                              }
                            } while (__jsp_taghandler_108.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_108.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_108);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[128]);
                        /*@lineinfo:translated-code*//*@lineinfo:332^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_110=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_110.setParent(__jsp_taghandler_103);
                          __jsp_taghandler_110.setDisabled(false);
                          __jsp_taghandler_110.setName("ReportesForm");
                          __jsp_taghandler_110.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_110.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_110,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[129]);
                              /*@lineinfo:translated-code*//*@lineinfo:333^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_111=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_111.setParent(__jsp_taghandler_110);
                                __jsp_taghandler_111.setCollection("ProyectosLista");
                                __jsp_taghandler_111.setLabelProperty("descripcion");
                                __jsp_taghandler_111.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_111.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_111.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_111.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_111);
                              }
                            } while (__jsp_taghandler_110.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_110.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_110);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[130]);
                        /*@lineinfo:translated-code*//*@lineinfo:336^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_112=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_112.setParent(__jsp_taghandler_103);
                          __jsp_taghandler_112.setMaxlength("10");
                          __jsp_taghandler_112.setName("ReportesForm");
                          __jsp_taghandler_112.setOnblur("cargar_anios()");
                          __jsp_taghandler_112.setProperty("condicion5");
                          __jsp_taghandler_112.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_112.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_112,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_112.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_112.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_112);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[131]);
                        /*@lineinfo:translated-code*//*@lineinfo:337^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_113=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_113.setParent(__jsp_taghandler_103);
                          __jsp_taghandler_113.setName("ReportesForm");
                          __jsp_taghandler_113.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[132]);
                        /*@lineinfo:translated-code*//*@lineinfo:338^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_114=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_114.setParent(__jsp_taghandler_103);
                          __jsp_taghandler_114.setName("ReportesForm");
                          __jsp_taghandler_114.setProperty("condicion11");
                          __jsp_tag_starteval=__jsp_taghandler_114.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_114,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_114.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_114.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_114);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[133]);
                      /*@lineinfo:translated-code*//*@lineinfo:338^74*/                      } while (__jsp_taghandler_103.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[134]);
                  /*@lineinfo:translated-code*//*@lineinfo:339^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_115=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_115.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_115.setName("ReportesForm");
                    __jsp_taghandler_115.setProperty("opcion");
                    __jsp_taghandler_115.setValue("17");
                    __jsp_tag_starteval=__jsp_taghandler_115.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[135]);
                        /*@lineinfo:translated-code*//*@lineinfo:343^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_116=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_116.setParent(__jsp_taghandler_115);
                          __jsp_taghandler_116.setName("ReportesForm");
                          __jsp_taghandler_116.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_116.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_116,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_116.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_116.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_116);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[136]);
                        /*@lineinfo:translated-code*//*@lineinfo:344^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_117=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_117.setParent(__jsp_taghandler_115);
                          __jsp_taghandler_117.setMaxlength("60");
                          __jsp_taghandler_117.setName("ReportesForm");
                          __jsp_taghandler_117.setProperty("des_codreg");
                          __jsp_taghandler_117.setReadonly(true);
                          __jsp_taghandler_117.setSize("60");
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
                        out.write(__jsp_StaticText.text[137]);
                        /*@lineinfo:translated-code*//*@lineinfo:347^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_118=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_118.setParent(__jsp_taghandler_115);
                          __jsp_taghandler_118.setDisabled(false);
                          __jsp_taghandler_118.setName("ReportesForm");
                          __jsp_taghandler_118.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_118.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_118,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[138]);
                              /*@lineinfo:translated-code*//*@lineinfo:348^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_119=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_119.setParent(__jsp_taghandler_118);
                                __jsp_taghandler_119.setCollection("ProyectosLista");
                                __jsp_taghandler_119.setLabelProperty("descripcion");
                                __jsp_taghandler_119.setProperty("codigo");
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
                            } while (__jsp_taghandler_118.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_118.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_118);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[139]);
                        /*@lineinfo:translated-code*//*@lineinfo:351^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_120=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_120.setParent(__jsp_taghandler_115);
                          __jsp_taghandler_120.setDisabled(false);
                          __jsp_taghandler_120.setName("ReportesForm");
                          __jsp_taghandler_120.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_120.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_120,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[140]);
                              /*@lineinfo:translated-code*//*@lineinfo:352^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_121=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_121.setParent(__jsp_taghandler_120);
                                __jsp_taghandler_121.setCollection("ProyectosLista");
                                __jsp_taghandler_121.setLabelProperty("descripcion");
                                __jsp_taghandler_121.setProperty("codigo");
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
                            } while (__jsp_taghandler_120.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_120.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_120);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[141]);
                        /*@lineinfo:translated-code*//*@lineinfo:355^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_122=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_122.setParent(__jsp_taghandler_115);
                          __jsp_taghandler_122.setMaxlength("10");
                          __jsp_taghandler_122.setName("ReportesForm");
                          __jsp_taghandler_122.setOnblur("cargar_anios()");
                          __jsp_taghandler_122.setProperty("condicion5");
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
                        out.write(__jsp_StaticText.text[142]);
                        /*@lineinfo:translated-code*//*@lineinfo:356^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_123=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_123.setParent(__jsp_taghandler_115);
                          __jsp_taghandler_123.setName("ReportesForm");
                          __jsp_taghandler_123.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[143]);
                        /*@lineinfo:translated-code*//*@lineinfo:357^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_124=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_124.setParent(__jsp_taghandler_115);
                          __jsp_taghandler_124.setName("ReportesForm");
                          __jsp_taghandler_124.setProperty("condicion11");
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
                        out.write(__jsp_StaticText.text[144]);
                      /*@lineinfo:translated-code*//*@lineinfo:357^74*/                      } while (__jsp_taghandler_115.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_115.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_115);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[145]);
                  /*@lineinfo:translated-code*//*@lineinfo:358^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_125=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_125.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_125.setName("ReportesForm");
                    __jsp_taghandler_125.setProperty("opcion");
                    __jsp_taghandler_125.setValue("18");
                    __jsp_tag_starteval=__jsp_taghandler_125.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[146]);
                        /*@lineinfo:translated-code*//*@lineinfo:362^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_126=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_126.setParent(__jsp_taghandler_125);
                          __jsp_taghandler_126.setName("ReportesForm");
                          __jsp_taghandler_126.setProperty("condicion1");
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
                        out.write(__jsp_StaticText.text[147]);
                        /*@lineinfo:translated-code*//*@lineinfo:363^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_127=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_127.setParent(__jsp_taghandler_125);
                          __jsp_taghandler_127.setMaxlength("60");
                          __jsp_taghandler_127.setName("ReportesForm");
                          __jsp_taghandler_127.setProperty("des_codreg");
                          __jsp_taghandler_127.setReadonly(true);
                          __jsp_taghandler_127.setSize("60");
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
                        out.write(__jsp_StaticText.text[148]);
                        /*@lineinfo:translated-code*//*@lineinfo:366^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_128=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_128.setParent(__jsp_taghandler_125);
                          __jsp_taghandler_128.setDisabled(false);
                          __jsp_taghandler_128.setName("ReportesForm");
                          __jsp_taghandler_128.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_128,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[149]);
                              /*@lineinfo:translated-code*//*@lineinfo:367^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_129=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_129.setParent(__jsp_taghandler_128);
                                __jsp_taghandler_129.setCollection("ProyectosLista");
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
                            } while (__jsp_taghandler_128.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[150]);
                        /*@lineinfo:translated-code*//*@lineinfo:370^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_130=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_130.setParent(__jsp_taghandler_125);
                          __jsp_taghandler_130.setDisabled(false);
                          __jsp_taghandler_130.setName("ReportesForm");
                          __jsp_taghandler_130.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_130.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_130,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[151]);
                              /*@lineinfo:translated-code*//*@lineinfo:371^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_131=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_131.setParent(__jsp_taghandler_130);
                                __jsp_taghandler_131.setCollection("ProyectosLista");
                                __jsp_taghandler_131.setLabelProperty("descripcion");
                                __jsp_taghandler_131.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_131.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_131.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_131.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_131);
                              }
                            } while (__jsp_taghandler_130.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_130.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_130);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[152]);
                        /*@lineinfo:translated-code*//*@lineinfo:374^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_132=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_132.setParent(__jsp_taghandler_125);
                          __jsp_taghandler_132.setMaxlength("10");
                          __jsp_taghandler_132.setName("ReportesForm");
                          __jsp_taghandler_132.setOnblur("cargar_anios()");
                          __jsp_taghandler_132.setProperty("condicion5");
                          __jsp_taghandler_132.setSize("10");
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
                        out.write(__jsp_StaticText.text[153]);
                        /*@lineinfo:translated-code*//*@lineinfo:375^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_133=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_133.setParent(__jsp_taghandler_125);
                          __jsp_taghandler_133.setName("ReportesForm");
                          __jsp_taghandler_133.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[154]);
                        /*@lineinfo:translated-code*//*@lineinfo:376^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_134=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_134.setParent(__jsp_taghandler_125);
                          __jsp_taghandler_134.setName("ReportesForm");
                          __jsp_taghandler_134.setProperty("condicion11");
                          __jsp_tag_starteval=__jsp_taghandler_134.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_134,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_134.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_134.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_134);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[155]);
                      /*@lineinfo:translated-code*//*@lineinfo:376^74*/                      } while (__jsp_taghandler_125.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_125.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_125);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[156]);
                  /*@lineinfo:translated-code*//*@lineinfo:377^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_135=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_135.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_135.setName("ReportesForm");
                    __jsp_taghandler_135.setProperty("opcion");
                    __jsp_taghandler_135.setValue("19");
                    __jsp_tag_starteval=__jsp_taghandler_135.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[157]);
                        /*@lineinfo:translated-code*//*@lineinfo:381^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_136=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_136.setParent(__jsp_taghandler_135);
                          __jsp_taghandler_136.setName("ReportesForm");
                          __jsp_taghandler_136.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_136.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_136,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_136.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_136.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_136);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[158]);
                        /*@lineinfo:translated-code*//*@lineinfo:382^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_137=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_137.setParent(__jsp_taghandler_135);
                          __jsp_taghandler_137.setMaxlength("60");
                          __jsp_taghandler_137.setName("ReportesForm");
                          __jsp_taghandler_137.setProperty("des_codreg");
                          __jsp_taghandler_137.setReadonly(true);
                          __jsp_taghandler_137.setSize("60");
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
                        out.write(__jsp_StaticText.text[159]);
                        /*@lineinfo:translated-code*//*@lineinfo:385^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_138=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_138.setParent(__jsp_taghandler_135);
                          __jsp_taghandler_138.setDisabled(false);
                          __jsp_taghandler_138.setName("ReportesForm");
                          __jsp_taghandler_138.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_138.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_138,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[160]);
                              /*@lineinfo:translated-code*//*@lineinfo:386^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_139=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_139.setParent(__jsp_taghandler_138);
                                __jsp_taghandler_139.setCollection("ProyectosLista");
                                __jsp_taghandler_139.setLabelProperty("descripcion");
                                __jsp_taghandler_139.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_139.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_139.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_139.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_139);
                              }
                            } while (__jsp_taghandler_138.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_138.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_138);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[161]);
                        /*@lineinfo:translated-code*//*@lineinfo:389^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_140=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_140.setParent(__jsp_taghandler_135);
                          __jsp_taghandler_140.setDisabled(false);
                          __jsp_taghandler_140.setName("ReportesForm");
                          __jsp_taghandler_140.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_140.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_140,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[162]);
                              /*@lineinfo:translated-code*//*@lineinfo:390^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_141=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_141.setParent(__jsp_taghandler_140);
                                __jsp_taghandler_141.setCollection("ProyectosLista");
                                __jsp_taghandler_141.setLabelProperty("descripcion");
                                __jsp_taghandler_141.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_141.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_141.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_141.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_141);
                              }
                            } while (__jsp_taghandler_140.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_140.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_140);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[163]);
                        /*@lineinfo:translated-code*//*@lineinfo:393^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_142=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_142.setParent(__jsp_taghandler_135);
                          __jsp_taghandler_142.setMaxlength("10");
                          __jsp_taghandler_142.setName("ReportesForm");
                          __jsp_taghandler_142.setOnblur("cargar_anios()");
                          __jsp_taghandler_142.setProperty("condicion5");
                          __jsp_taghandler_142.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_142.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_142,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_142.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_142.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_142);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[164]);
                        /*@lineinfo:translated-code*//*@lineinfo:394^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_143=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_143.setParent(__jsp_taghandler_135);
                          __jsp_taghandler_143.setName("ReportesForm");
                          __jsp_taghandler_143.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[165]);
                        /*@lineinfo:translated-code*//*@lineinfo:395^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_144=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_144.setParent(__jsp_taghandler_135);
                          __jsp_taghandler_144.setName("ReportesForm");
                          __jsp_taghandler_144.setProperty("condicion11");
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
                        out.write(__jsp_StaticText.text[166]);
                      /*@lineinfo:translated-code*//*@lineinfo:395^74*/                      } while (__jsp_taghandler_135.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_135.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_135);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[167]);
                  /*@lineinfo:translated-code*//*@lineinfo:396^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_145=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_145.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_145.setName("ReportesForm");
                    __jsp_taghandler_145.setProperty("opcion");
                    __jsp_taghandler_145.setValue("20");
                    __jsp_tag_starteval=__jsp_taghandler_145.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[168]);
                      /*@lineinfo:translated-code*//*@lineinfo:396^68*/                      } while (__jsp_taghandler_145.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_145.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_145);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[169]);
                  /*@lineinfo:translated-code*//*@lineinfo:398^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_146=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_146.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_146.setName("ReportesForm");
                    __jsp_taghandler_146.setProperty("opcion");
                    __jsp_taghandler_146.setValue("21");
                    __jsp_tag_starteval=__jsp_taghandler_146.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[170]);
                        /*@lineinfo:translated-code*//*@lineinfo:402^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_147=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_147.setParent(__jsp_taghandler_146);
                          __jsp_taghandler_147.setMaxlength("10");
                          __jsp_taghandler_147.setName("ReportesForm");
                          __jsp_taghandler_147.setProperty("condicion4");
                          __jsp_taghandler_147.setSize("10");
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
                        out.write(__jsp_StaticText.text[171]);
                        /*@lineinfo:translated-code*//*@lineinfo:405^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_148=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_148.setParent(__jsp_taghandler_146);
                          __jsp_taghandler_148.setMaxlength("10");
                          __jsp_taghandler_148.setName("ReportesForm");
                          __jsp_taghandler_148.setProperty("condicion5");
                          __jsp_taghandler_148.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_148.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_148,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_148.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_148.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_148);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[172]);
                      /*@lineinfo:translated-code*//*@lineinfo:405^108*/                      } while (__jsp_taghandler_146.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_146.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_146);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[173]);
                  /*@lineinfo:translated-code*//*@lineinfo:406^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_149=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_149.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_149.setName("ReportesForm");
                    __jsp_taghandler_149.setProperty("opcion");
                    __jsp_taghandler_149.setValue("22");
                    __jsp_tag_starteval=__jsp_taghandler_149.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[174]);
                        /*@lineinfo:translated-code*//*@lineinfo:410^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_150=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_150.setParent(__jsp_taghandler_149);
                          __jsp_taghandler_150.setMaxlength("10");
                          __jsp_taghandler_150.setName("ReportesForm");
                          __jsp_taghandler_150.setProperty("condicion4");
                          __jsp_taghandler_150.setSize("10");
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
                        out.write(__jsp_StaticText.text[175]);
                        /*@lineinfo:translated-code*//*@lineinfo:413^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_151=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_151.setParent(__jsp_taghandler_149);
                          __jsp_taghandler_151.setMaxlength("10");
                          __jsp_taghandler_151.setName("ReportesForm");
                          __jsp_taghandler_151.setProperty("condicion5");
                          __jsp_taghandler_151.setSize("10");
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
                        out.write(__jsp_StaticText.text[176]);
                      /*@lineinfo:translated-code*//*@lineinfo:413^108*/                      } while (__jsp_taghandler_149.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_149.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_149);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[177]);
                  /*@lineinfo:translated-code*//*@lineinfo:414^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_152=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_152.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_152.setName("ReportesForm");
                    __jsp_taghandler_152.setProperty("opcion");
                    __jsp_taghandler_152.setValue("23");
                    __jsp_tag_starteval=__jsp_taghandler_152.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[178]);
                        /*@lineinfo:translated-code*//*@lineinfo:418^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_153=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_153.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_153.setMaxlength("10");
                          __jsp_taghandler_153.setName("ReportesForm");
                          __jsp_taghandler_153.setProperty("condicion4");
                          __jsp_taghandler_153.setSize("10");
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
                        out.write(__jsp_StaticText.text[179]);
                        /*@lineinfo:translated-code*//*@lineinfo:421^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_154=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_154.setParent(__jsp_taghandler_152);
                          __jsp_taghandler_154.setMaxlength("10");
                          __jsp_taghandler_154.setName("ReportesForm");
                          __jsp_taghandler_154.setProperty("condicion5");
                          __jsp_taghandler_154.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_154.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_154,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_154.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_154.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_154);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[180]);
                      /*@lineinfo:translated-code*//*@lineinfo:421^108*/                      } while (__jsp_taghandler_152.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_152.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_152);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[181]);
                  /*@lineinfo:translated-code*//*@lineinfo:422^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_155=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_155.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_155.setName("ReportesForm");
                    __jsp_taghandler_155.setProperty("opcion");
                    __jsp_taghandler_155.setValue("24");
                    __jsp_tag_starteval=__jsp_taghandler_155.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[182]);
                        /*@lineinfo:translated-code*//*@lineinfo:426^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_156=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_156.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_156.setMaxlength("10");
                          __jsp_taghandler_156.setName("ReportesForm");
                          __jsp_taghandler_156.setProperty("condicion4");
                          __jsp_taghandler_156.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_156.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_156,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_156.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_156.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_156);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[183]);
                        /*@lineinfo:translated-code*//*@lineinfo:429^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_157=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_157.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_157.setMaxlength("10");
                          __jsp_taghandler_157.setName("ReportesForm");
                          __jsp_taghandler_157.setProperty("condicion5");
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
                        out.write(__jsp_StaticText.text[184]);
                        /*@lineinfo:translated-code*//*@lineinfo:432^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_158=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_158.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_158.setDisabled(false);
                          __jsp_taghandler_158.setName("ReportesForm");
                          __jsp_taghandler_158.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_158.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_158,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[185]);
                              /*@lineinfo:translated-code*//*@lineinfo:433^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_159=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_159.setParent(__jsp_taghandler_158);
                                __jsp_taghandler_159.setCollection("FuncionariosLista");
                                __jsp_taghandler_159.setLabelProperty("descripcion");
                                __jsp_taghandler_159.setProperty("codigo");
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
                            } while (__jsp_taghandler_158.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_158.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_158);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[186]);
                      /*@lineinfo:translated-code*//*@lineinfo:433^121*/                      } while (__jsp_taghandler_155.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_155.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_155);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[187]);
                  /*@lineinfo:translated-code*//*@lineinfo:434^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_160=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_160.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_160.setName("ReportesForm");
                    __jsp_taghandler_160.setProperty("opcion");
                    __jsp_taghandler_160.setValue("25");
                    __jsp_tag_starteval=__jsp_taghandler_160.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[188]);
                        /*@lineinfo:translated-code*//*@lineinfo:438^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_161=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_161.setParent(__jsp_taghandler_160);
                          __jsp_taghandler_161.setDisabled(false);
                          __jsp_taghandler_161.setName("ReportesForm");
                          __jsp_taghandler_161.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_161.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_161,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[189]);
                              /*@lineinfo:translated-code*//*@lineinfo:439^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_162=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_162.setParent(__jsp_taghandler_161);
                                __jsp_taghandler_162.setCollection("ProyectosLista");
                                __jsp_taghandler_162.setLabelProperty("descripcion");
                                __jsp_taghandler_162.setProperty("codigo");
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
                            } while (__jsp_taghandler_161.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_161.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_161);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[190]);
                        /*@lineinfo:translated-code*//*@lineinfo:442^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_163=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_163.setParent(__jsp_taghandler_160);
                          __jsp_taghandler_163.setDisabled(false);
                          __jsp_taghandler_163.setName("ReportesForm");
                          __jsp_taghandler_163.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_163.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_163,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[191]);
                              /*@lineinfo:translated-code*//*@lineinfo:443^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_164=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_164.setParent(__jsp_taghandler_163);
                                __jsp_taghandler_164.setCollection("ProyectosLista");
                                __jsp_taghandler_164.setLabelProperty("descripcion");
                                __jsp_taghandler_164.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_164.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_164.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_164.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_164);
                              }
                            } while (__jsp_taghandler_163.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_163.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_163);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[192]);
                        /*@lineinfo:translated-code*//*@lineinfo:446^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_165=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_165.setParent(__jsp_taghandler_160);
                          __jsp_taghandler_165.setMaxlength("10");
                          __jsp_taghandler_165.setName("ReportesForm");
                          __jsp_taghandler_165.setOnblur("cargar_anios()");
                          __jsp_taghandler_165.setProperty("condicion5");
                          __jsp_taghandler_165.setSize("10");
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
                        out.write(__jsp_StaticText.text[193]);
                        /*@lineinfo:translated-code*//*@lineinfo:447^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_166=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_166.setParent(__jsp_taghandler_160);
                          __jsp_taghandler_166.setName("ReportesForm");
                          __jsp_taghandler_166.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[194]);
                        /*@lineinfo:translated-code*//*@lineinfo:448^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_167=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_167.setParent(__jsp_taghandler_160);
                          __jsp_taghandler_167.setName("ReportesForm");
                          __jsp_taghandler_167.setProperty("condicion11");
                          __jsp_tag_starteval=__jsp_taghandler_167.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_167,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_167.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_167.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_167);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[195]);
                      /*@lineinfo:translated-code*//*@lineinfo:448^74*/                      } while (__jsp_taghandler_160.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_160.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_160);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[196]);
                  /*@lineinfo:translated-code*//*@lineinfo:449^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_168=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_168.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_168.setName("ReportesForm");
                    __jsp_taghandler_168.setProperty("opcion");
                    __jsp_taghandler_168.setValue("26");
                    __jsp_tag_starteval=__jsp_taghandler_168.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[197]);
                      /*@lineinfo:translated-code*//*@lineinfo:449^68*/                      } while (__jsp_taghandler_168.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_168.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_168);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[198]);
                  /*@lineinfo:translated-code*//*@lineinfo:451^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_169=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_169.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_169.setName("ReportesForm");
                    __jsp_taghandler_169.setProperty("opcion");
                    __jsp_taghandler_169.setValue("27");
                    __jsp_tag_starteval=__jsp_taghandler_169.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[199]);
                        /*@lineinfo:translated-code*//*@lineinfo:455^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_170=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_170.setParent(__jsp_taghandler_169);
                          __jsp_taghandler_170.setDisabled(false);
                          __jsp_taghandler_170.setName("ReportesForm");
                          __jsp_taghandler_170.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_170.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_170,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[200]);
                              /*@lineinfo:translated-code*//*@lineinfo:456^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_171=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_171.setParent(__jsp_taghandler_170);
                                __jsp_taghandler_171.setCollection("RubrosLista");
                                __jsp_taghandler_171.setLabelProperty("descripcion");
                                __jsp_taghandler_171.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_171.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_171.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_171.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_171);
                              }
                            } while (__jsp_taghandler_170.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_170.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_170);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[201]);
                        /*@lineinfo:translated-code*//*@lineinfo:459^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_172=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_172.setParent(__jsp_taghandler_169);
                          __jsp_taghandler_172.setName("ReportesForm");
                          __jsp_taghandler_172.setProperty("condicion2");
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
                        out.write(__jsp_StaticText.text[202]);
                        /*@lineinfo:translated-code*//*@lineinfo:460^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_173=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_173.setParent(__jsp_taghandler_169);
                          __jsp_taghandler_173.setMaxlength("60");
                          __jsp_taghandler_173.setName("ReportesForm");
                          __jsp_taghandler_173.setProperty("des_codreg");
                          __jsp_taghandler_173.setReadonly(true);
                          __jsp_taghandler_173.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_173.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_173,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_173.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_173.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_173);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[203]);
                        /*@lineinfo:translated-code*//*@lineinfo:463^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_174=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_174.setParent(__jsp_taghandler_169);
                          __jsp_taghandler_174.setMaxlength("5");
                          __jsp_taghandler_174.setName("ReportesForm");
                          __jsp_taghandler_174.setProperty("condicion3");
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
                        out.write(__jsp_StaticText.text[204]);
                        /*@lineinfo:translated-code*//*@lineinfo:466^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_175=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_175.setParent(__jsp_taghandler_169);
                          __jsp_taghandler_175.setMaxlength("5");
                          __jsp_taghandler_175.setName("ReportesForm");
                          __jsp_taghandler_175.setProperty("condicion4");
                          __jsp_taghandler_175.setSize("5");
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
                        out.write(__jsp_StaticText.text[205]);
                        /*@lineinfo:translated-code*//*@lineinfo:469^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_176=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_176.setParent(__jsp_taghandler_169);
                          __jsp_taghandler_176.setMaxlength("10");
                          __jsp_taghandler_176.setName("ReportesForm");
                          __jsp_taghandler_176.setProperty("condicion5");
                          __jsp_taghandler_176.setSize("10");
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
                        out.write(__jsp_StaticText.text[206]);
                        /*@lineinfo:translated-code*//*@lineinfo:472^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_177=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_177.setParent(__jsp_taghandler_169);
                          __jsp_taghandler_177.setMaxlength("10");
                          __jsp_taghandler_177.setName("ReportesForm");
                          __jsp_taghandler_177.setProperty("condicion6");
                          __jsp_taghandler_177.setSize("10");
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
                        out.write(__jsp_StaticText.text[207]);
                      /*@lineinfo:translated-code*//*@lineinfo:472^108*/                      } while (__jsp_taghandler_169.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_169.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_169);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[208]);
                  /*@lineinfo:translated-code*//*@lineinfo:473^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_178=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_178.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_178.setName("ReportesForm");
                    __jsp_taghandler_178.setProperty("opcion");
                    __jsp_taghandler_178.setValue("28");
                    __jsp_tag_starteval=__jsp_taghandler_178.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[209]);
                        /*@lineinfo:translated-code*//*@lineinfo:477^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_179=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_179.setParent(__jsp_taghandler_178);
                          __jsp_taghandler_179.setDisabled(false);
                          __jsp_taghandler_179.setName("ReportesForm");
                          __jsp_taghandler_179.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_179.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_179,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[210]);
                              /*@lineinfo:translated-code*//*@lineinfo:478^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_180=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_180.setParent(__jsp_taghandler_179);
                                __jsp_taghandler_180.setCollection("ProyectosLista");
                                __jsp_taghandler_180.setLabelProperty("descripcion");
                                __jsp_taghandler_180.setProperty("codigo");
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
                            } while (__jsp_taghandler_179.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_179.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_179);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[211]);
                        /*@lineinfo:translated-code*//*@lineinfo:481^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_181=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_181.setParent(__jsp_taghandler_178);
                          __jsp_taghandler_181.setDisabled(false);
                          __jsp_taghandler_181.setName("ReportesForm");
                          __jsp_taghandler_181.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_181.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_181,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[212]);
                              /*@lineinfo:translated-code*//*@lineinfo:482^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_182=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_182.setParent(__jsp_taghandler_181);
                                __jsp_taghandler_182.setCollection("ProyectosLista");
                                __jsp_taghandler_182.setLabelProperty("descripcion");
                                __jsp_taghandler_182.setProperty("codigo");
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
                            } while (__jsp_taghandler_181.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_181.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_181);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[213]);
                        /*@lineinfo:translated-code*//*@lineinfo:485^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_183=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_183.setParent(__jsp_taghandler_178);
                          __jsp_taghandler_183.setMaxlength("10");
                          __jsp_taghandler_183.setName("ReportesForm");
                          __jsp_taghandler_183.setOnblur("cargar_anios()");
                          __jsp_taghandler_183.setProperty("condicion5");
                          __jsp_taghandler_183.setSize("10");
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
                        out.write(__jsp_StaticText.text[214]);
                        /*@lineinfo:translated-code*//*@lineinfo:486^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_184=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_184.setParent(__jsp_taghandler_178);
                          __jsp_taghandler_184.setName("ReportesForm");
                          __jsp_taghandler_184.setProperty("condicion10");
                          __jsp_tag_starteval=__jsp_taghandler_184.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_184,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_184.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_184.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_184);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[215]);
                        /*@lineinfo:translated-code*//*@lineinfo:487^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_185=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_185.setParent(__jsp_taghandler_178);
                          __jsp_taghandler_185.setName("ReportesForm");
                          __jsp_taghandler_185.setProperty("condicion11");
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
                        out.write(__jsp_StaticText.text[216]);
                      /*@lineinfo:translated-code*//*@lineinfo:487^74*/                      } while (__jsp_taghandler_178.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_178.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_178);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[217]);
                  /*@lineinfo:translated-code*//*@lineinfo:488^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_186=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_186.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_186.setName("ReportesForm");
                    __jsp_taghandler_186.setProperty("opcion");
                    __jsp_taghandler_186.setValue("29");
                    __jsp_tag_starteval=__jsp_taghandler_186.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[218]);
                        /*@lineinfo:translated-code*//*@lineinfo:492^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_187=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_187.setParent(__jsp_taghandler_186);
                          __jsp_taghandler_187.setDisabled(false);
                          __jsp_taghandler_187.setName("ReportesForm");
                          __jsp_taghandler_187.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_187.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_187,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[219]);
                              /*@lineinfo:translated-code*//*@lineinfo:493^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_188=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_188.setParent(__jsp_taghandler_187);
                                __jsp_taghandler_188.setCollection("FuncionariosLista");
                                __jsp_taghandler_188.setLabelProperty("descripcion");
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
                            } while (__jsp_taghandler_187.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_187.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_187);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[220]);
                        /*@lineinfo:translated-code*//*@lineinfo:496^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_189=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_189.setParent(__jsp_taghandler_186);
                          __jsp_taghandler_189.setMaxlength("10");
                          __jsp_taghandler_189.setName("ReportesForm");
                          __jsp_taghandler_189.setProperty("condicion5");
                          __jsp_taghandler_189.setSize("10");
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
                        out.write(__jsp_StaticText.text[221]);
                        /*@lineinfo:translated-code*//*@lineinfo:499^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_190=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_190.setParent(__jsp_taghandler_186);
                          __jsp_taghandler_190.setMaxlength("10");
                          __jsp_taghandler_190.setName("ReportesForm");
                          __jsp_taghandler_190.setProperty("condicion6");
                          __jsp_taghandler_190.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_190.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_190,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_190.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_190.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_190);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[222]);
                      /*@lineinfo:translated-code*//*@lineinfo:499^108*/                      } while (__jsp_taghandler_186.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_186.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_186);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[223]);
                  /*@lineinfo:translated-code*//*@lineinfo:500^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_191=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_191.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_191.setName("ReportesForm");
                    __jsp_taghandler_191.setProperty("opcion");
                    __jsp_taghandler_191.setValue("30");
                    __jsp_tag_starteval=__jsp_taghandler_191.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[224]);
                        /*@lineinfo:translated-code*//*@lineinfo:504^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_192=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_192.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_192.setDisabled(false);
                          __jsp_taghandler_192.setName("ReportesForm");
                          __jsp_taghandler_192.setProperty("condicion1");
                          __jsp_tag_starteval=__jsp_taghandler_192.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_192,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[225]);
                              /*@lineinfo:translated-code*//*@lineinfo:505^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_193=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_193.setParent(__jsp_taghandler_192);
                                __jsp_taghandler_193.setCollection("UbicacionesLista");
                                __jsp_taghandler_193.setLabelProperty("descripcion");
                                __jsp_taghandler_193.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_193.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_193.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_193.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_193);
                              }
                            } while (__jsp_taghandler_192.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_192.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_192);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[226]);
                        /*@lineinfo:translated-code*//*@lineinfo:508^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_194=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_194.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_194.setDisabled(false);
                          __jsp_taghandler_194.setName("ReportesForm");
                          __jsp_taghandler_194.setProperty("condicion3");
                          __jsp_tag_starteval=__jsp_taghandler_194.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_194,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[227]);
                              /*@lineinfo:translated-code*//*@lineinfo:509^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_195=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_195.setParent(__jsp_taghandler_194);
                                __jsp_taghandler_195.setCollection("OficinasLista");
                                __jsp_taghandler_195.setLabelProperty("descripcion");
                                __jsp_taghandler_195.setProperty("codigo");
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
                            } while (__jsp_taghandler_194.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_194.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_194);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[228]);
                        /*@lineinfo:translated-code*//*@lineinfo:513^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_196=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_196.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_196.setName("ReportesForm");
                          __jsp_taghandler_196.setProperty("condicion2");
                          __jsp_tag_starteval=__jsp_taghandler_196.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_196,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_196.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_196.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_196);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[229]);
                        /*@lineinfo:translated-code*//*@lineinfo:514^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_197=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_197.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_197.setMaxlength("60");
                          __jsp_taghandler_197.setName("ReportesForm");
                          __jsp_taghandler_197.setProperty("des_codreg");
                          __jsp_taghandler_197.setReadonly(true);
                          __jsp_taghandler_197.setSize("60");
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
                        out.write(__jsp_StaticText.text[230]);
                        /*@lineinfo:translated-code*//*@lineinfo:517^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_198=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_198.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_198.setDisabled(false);
                          __jsp_taghandler_198.setName("ReportesForm");
                          __jsp_taghandler_198.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_198.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_198,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[231]);
                              /*@lineinfo:translated-code*//*@lineinfo:518^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_199=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_199.setParent(__jsp_taghandler_198);
                                __jsp_taghandler_199.setCollection("ProyectosLista");
                                __jsp_taghandler_199.setLabelProperty("descripcion");
                                __jsp_taghandler_199.setProperty("codigo");
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
                            } while (__jsp_taghandler_198.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_198.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_198);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[232]);
                        /*@lineinfo:translated-code*//*@lineinfo:521^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_200=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_200.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_200.setDisabled(false);
                          __jsp_taghandler_200.setName("ReportesForm");
                          __jsp_taghandler_200.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_200.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_200,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[233]);
                              /*@lineinfo:translated-code*//*@lineinfo:522^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_201=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_201.setParent(__jsp_taghandler_200);
                                __jsp_taghandler_201.setCollection("ProyectosLista");
                                __jsp_taghandler_201.setLabelProperty("descripcion");
                                __jsp_taghandler_201.setProperty("codigo");
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
                            } while (__jsp_taghandler_200.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_200.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_200);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[234]);
                        /*@lineinfo:translated-code*//*@lineinfo:525^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_202=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_202.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_202.setMaxlength("10");
                          __jsp_taghandler_202.setName("ReportesForm");
                          __jsp_taghandler_202.setOnblur("cargar_anios()");
                          __jsp_taghandler_202.setProperty("condicion5");
                          __jsp_taghandler_202.setSize("10");
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
                        out.write(__jsp_StaticText.text[235]);
                        /*@lineinfo:translated-code*//*@lineinfo:526^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_203=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_203.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_203.setName("ReportesForm");
                          __jsp_taghandler_203.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[236]);
                        /*@lineinfo:translated-code*//*@lineinfo:527^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_204=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_204.setParent(__jsp_taghandler_191);
                          __jsp_taghandler_204.setName("ReportesForm");
                          __jsp_taghandler_204.setProperty("condicion11");
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
                        out.write(__jsp_StaticText.text[237]);
                      /*@lineinfo:translated-code*//*@lineinfo:527^74*/                      } while (__jsp_taghandler_191.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_191.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_191);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[238]);
                  /*@lineinfo:translated-code*//*@lineinfo:528^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_205=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_205.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_205.setName("ReportesForm");
                    __jsp_taghandler_205.setProperty("opcion");
                    __jsp_taghandler_205.setValue("31");
                    __jsp_tag_starteval=__jsp_taghandler_205.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[239]);
                        /*@lineinfo:translated-code*//*@lineinfo:532^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_206=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_206.setParent(__jsp_taghandler_205);
                          __jsp_taghandler_206.setName("ReportesForm");
                          __jsp_taghandler_206.setProperty("condicion1");
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
                        out.write(__jsp_StaticText.text[240]);
                        /*@lineinfo:translated-code*//*@lineinfo:533^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_207=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_207.setParent(__jsp_taghandler_205);
                          __jsp_taghandler_207.setMaxlength("60");
                          __jsp_taghandler_207.setName("ReportesForm");
                          __jsp_taghandler_207.setProperty("des_codreg");
                          __jsp_taghandler_207.setReadonly(true);
                          __jsp_taghandler_207.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_207.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_207,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_207.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_207.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_207);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[241]);
                        /*@lineinfo:translated-code*//*@lineinfo:536^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_208=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_208.setParent(__jsp_taghandler_205);
                          __jsp_taghandler_208.setDisabled(false);
                          __jsp_taghandler_208.setName("ReportesForm");
                          __jsp_taghandler_208.setProperty("condicion6");
                          __jsp_tag_starteval=__jsp_taghandler_208.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_208,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[242]);
                              /*@lineinfo:translated-code*//*@lineinfo:537^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_209=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_209.setParent(__jsp_taghandler_208);
                                __jsp_taghandler_209.setCollection("ProyectosLista");
                                __jsp_taghandler_209.setLabelProperty("descripcion");
                                __jsp_taghandler_209.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_209.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_209.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_209.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_209);
                              }
                            } while (__jsp_taghandler_208.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_208.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_208);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[243]);
                        /*@lineinfo:translated-code*//*@lineinfo:540^28*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_210=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_210.setParent(__jsp_taghandler_205);
                          __jsp_taghandler_210.setDisabled(false);
                          __jsp_taghandler_210.setName("ReportesForm");
                          __jsp_taghandler_210.setProperty("condicion7");
                          __jsp_tag_starteval=__jsp_taghandler_210.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_210,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[244]);
                              /*@lineinfo:translated-code*//*@lineinfo:541^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_211=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_211.setParent(__jsp_taghandler_210);
                                __jsp_taghandler_211.setCollection("ProyectosLista");
                                __jsp_taghandler_211.setLabelProperty("descripcion");
                                __jsp_taghandler_211.setProperty("codigo");
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
                            } while (__jsp_taghandler_210.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_210.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_210);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[245]);
                        /*@lineinfo:translated-code*//*@lineinfo:544^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_212=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onblur property size");
                          __jsp_taghandler_212.setParent(__jsp_taghandler_205);
                          __jsp_taghandler_212.setMaxlength("10");
                          __jsp_taghandler_212.setName("ReportesForm");
                          __jsp_taghandler_212.setOnblur("cargar_anios()");
                          __jsp_taghandler_212.setProperty("condicion5");
                          __jsp_taghandler_212.setSize("10");
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
                        out.write(__jsp_StaticText.text[246]);
                        /*@lineinfo:translated-code*//*@lineinfo:545^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_213=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_213.setParent(__jsp_taghandler_205);
                          __jsp_taghandler_213.setName("ReportesForm");
                          __jsp_taghandler_213.setProperty("condicion10");
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
                        out.write(__jsp_StaticText.text[247]);
                        /*@lineinfo:translated-code*//*@lineinfo:546^16*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_214=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_214.setParent(__jsp_taghandler_205);
                          __jsp_taghandler_214.setName("ReportesForm");
                          __jsp_taghandler_214.setProperty("condicion11");
                          __jsp_tag_starteval=__jsp_taghandler_214.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_214,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_214.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_214.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_214);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[248]);
                      /*@lineinfo:translated-code*//*@lineinfo:546^74*/                      } while (__jsp_taghandler_205.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_205.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_205);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[249]);
                  /*@lineinfo:translated-code*//*@lineinfo:549^23*/                  {
                    org.apache.struts.taglib.html.SelectTag __jsp_taghandler_215=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag name property");
                    __jsp_taghandler_215.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_215.setName("ReportesForm");
                    __jsp_taghandler_215.setProperty("tiporep");
                    __jsp_tag_starteval=__jsp_taghandler_215.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_215,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[250]);
                        /*@lineinfo:translated-code*//*@lineinfo:550^9*/                        {
                          org.apache.struts.taglib.html.OptionTag __jsp_taghandler_216=(org.apache.struts.taglib.html.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionTag.class,"org.apache.struts.taglib.html.OptionTag value");
                          __jsp_taghandler_216.setParent(__jsp_taghandler_215);
                          __jsp_taghandler_216.setValue("PDF");
                          __jsp_tag_starteval=__jsp_taghandler_216.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_216,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[251]);
                            /*@lineinfo:translated-code*//*@lineinfo:550^34*/                            } while (__jsp_taghandler_216.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_216.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_216);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[252]);
                        /*@lineinfo:translated-code*//*@lineinfo:551^9*/                        {
                          org.apache.struts.taglib.html.OptionTag __jsp_taghandler_217=(org.apache.struts.taglib.html.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionTag.class,"org.apache.struts.taglib.html.OptionTag value");
                          __jsp_taghandler_217.setParent(__jsp_taghandler_215);
                          __jsp_taghandler_217.setValue("XLS");
                          __jsp_tag_starteval=__jsp_taghandler_217.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_217,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[253]);
                            /*@lineinfo:translated-code*//*@lineinfo:551^34*/                            } while (__jsp_taghandler_217.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_217.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_217);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[254]);
                        /*@lineinfo:translated-code*//*@lineinfo:552^9*/                        {
                          org.apache.struts.taglib.html.OptionTag __jsp_taghandler_218=(org.apache.struts.taglib.html.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionTag.class,"org.apache.struts.taglib.html.OptionTag value");
                          __jsp_taghandler_218.setParent(__jsp_taghandler_215);
                          __jsp_taghandler_218.setValue("HTML");
                          __jsp_tag_starteval=__jsp_taghandler_218.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_218,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[255]);
                            /*@lineinfo:translated-code*//*@lineinfo:552^35*/                            } while (__jsp_taghandler_218.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_218.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_218);
                        }
                      } while (__jsp_taghandler_215.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_215.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_215);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[256]);
                  /*@lineinfo:translated-code*//*@lineinfo:555^9*/                  {
                    org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_219=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                    __jsp_taghandler_219.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_219.setOnclick("operacion.value=2");
                    __jsp_taghandler_219.setProperty("boton");
                    __jsp_taghandler_219.setStyleClass("boton1");
                    __jsp_taghandler_219.setValue("Reportar");
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
                  out.write(__jsp_StaticText.text[257]);
                /*@lineinfo:translated-code*//*@lineinfo:555^105*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[258]);
          /*@lineinfo:translated-code*//*@lineinfo:556^17*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[259]);


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
    private static final char text[][]=new char[260][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  var sesion=0\n  var dele0 = new Array()\n  var valo0 = new Array()\n\n  function ftarget()\n  {\n     f = document.forms[0];\n     f.target='_blank';\n  }\n  function cargar_anios() {\n      document.ReportesForm.condicion10.value=document.ReportesForm.condicion5.value.substr(6,4);\n      document.ReportesForm.condicion11.value=Number(document.ReportesForm.condicion5.value.substr(6,4))-1;\n  }\n  function cargar() {\n     if ((document.ReportesForm.opcion.value==3)||(document.ReportesForm.opcion.value==5))\n       {\n        for\t(var i=0; i < document.ReportesForm.condicion2.options.length; i++) {\n           valo0[i]=document.ReportesForm.condicion2.options[i].value\n           dele0[i]=document.ReportesForm.condicion2.options[i].text\n        }\n     }\n  }\n  function quitar()\n  {\n     var j=0\n     var k=0\n     var t=0\n     dele = new Array()\n     valo = new Array()\n     for \t(var i=0; i < document.ReportesForm.condicion1.options.length; i++) {\n        if (document.ReportesForm.condicion1.options[i].selected==true) {\n           k=i\n        }\n     }\n     if (sesion==0) {\n        m=0\n        for \t(var i=1; i < document.ReportesForm.condicion2.options.length; i++) {\n           valor=document.ReportesForm.condicion2.options[i].text\n           if (valor.substr(0,valor.indexOf(\"-\"))==document.ReportesForm.condicion1.options[k].text) {       \n              valor=document.ReportesForm.condicion2.options[i].text\n              valor=valor\n              dele[m]=valor.substr(valor.indexOf(\"-\")+1)\n              valo[m]=document.ReportesForm.condicion2.options[i].value\n              m=m+1   \n           }\n        }\n        sesion=sesion+1\n     }\n     else {\n        m=0\n        for \t(var i=1; i < valo0.length; i++) {\n           valor=dele0[i]\n           if (valor.substr(0,valor.indexOf(\"-\"))==document.ReportesForm.condicion1.options[k].text) {       \n              valor=dele0[i]\n              valor=valor\n              dele[m]=valor.substr(valor.indexOf(\"-\")+1)\n              valo[m]=valo0[i]\n              m=m+1   \n           }\n        }\n     }\n     lon=document.ReportesForm.condicion2.options.length\n     for \t(var i=1; i < lon; i++) {\n        document.ReportesForm.condicion2.options[0]=null           \n     }\n     document.ReportesForm.condicion2.options[0]=null\n     n=0\n     for \t(var i=0; i < m; i++) {\n        valor=\"var option0 = new Option(dele[i], valo[i])\"\n        eval(valor)\n        eval(\"document.ReportesForm.condicion2.options[n]=option0\") \n        n=++n\n     }     \n  }\n</script>\n<body onload=\"cargar()\">\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n  <caption>Reporte Activos</caption>\n  ".toCharArray();
      text[8] = 
      "     \n     ".toCharArray();
      text[9] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR REFERENCIA</b></td></tr>\n        <tr><td class=\"S10d\" width=\"50%\">*Descripción : </td>\n            <td width=\"50%\">".toCharArray();
      text[10] = 
      "</td></tr>".toCharArray();
      text[11] = 
      "\n     ".toCharArray();
      text[12] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR RANGO</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[13] = 
      "\n              ".toCharArray();
      text[14] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[15] = 
      "\n           ".toCharArray();
      text[16] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Codigo Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[17] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Codigo Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[18] = 
      "</td></tr>".toCharArray();
      text[19] = 
      "\n     ".toCharArray();
      text[20] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR GRUPO</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[21] = 
      "\n              ".toCharArray();
      text[22] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Grupo : </td>\n           <td width=\"50%\">".toCharArray();
      text[23] = 
      "\n              ".toCharArray();
      text[24] = 
      "</td></tr>".toCharArray();
      text[25] = 
      "\n     ".toCharArray();
      text[26] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR UBICACION</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Ubicación : </td>\n           <td width=\"50%\">".toCharArray();
      text[27] = 
      "\n              ".toCharArray();
      text[28] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[29] = 
      "\n           ".toCharArray();
      text[30] = 
      "</td></tr>".toCharArray();
      text[31] = 
      "        \n     ".toCharArray();
      text[32] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR RESPONSABLE</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Funcionario : </td>\n           <td width=\"50%\">".toCharArray();
      text[33] = 
      "\n              ".toCharArray();
      text[34] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[35] = 
      "\n              ".toCharArray();
      text[36] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Grupo : </td>\n           <td width=\"50%\">".toCharArray();
      text[37] = 
      "\n              ".toCharArray();
      text[38] = 
      "</td></tr>".toCharArray();
      text[39] = 
      "        \n     ".toCharArray();
      text[40] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR PROYECTO</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[41] = 
      "\n              ".toCharArray();
      text[42] = 
      "</td></tr>".toCharArray();
      text[43] = 
      "\n     ".toCharArray();
      text[44] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR REFERENCIA (Terrenos/Edificios)</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Gobierno Municipal : </td>\n           <td width=\"50%\">".toCharArray();
      text[45] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Documento de Referencia : </td>\n           <td width=\"50%\">".toCharArray();
      text[46] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Nro. de Folio : </td>\n           <td width=\"50%\">".toCharArray();
      text[47] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Nro. de Testimonio : </td>\n           <td width=\"50%\">".toCharArray();
      text[48] = 
      "</td></tr>".toCharArray();
      text[49] = 
      "\n     ".toCharArray();
      text[50] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR REFERENCIA (Muebles/Eq. Educación)</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Marca : </td>\n           <td width=\"50%\">".toCharArray();
      text[51] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Color : </td>\n           <td width=\"50%\">".toCharArray();
      text[52] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Material : </td>\n           <td width=\"50%\">".toCharArray();
      text[53] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Proveedor : </td>\n           <td width=\"50%\">".toCharArray();
      text[54] = 
      "</td></tr>".toCharArray();
      text[55] = 
      "\n     ".toCharArray();
      text[56] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR REFERENCIA (Marca/Modelo/Serie)</b></td></tr>\n       <tr>\n           <td class=\"S10d\" width=\"50%\">Marca : </td>\n           <td>".toCharArray();
      text[57] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Modelo : </td>\n           <td>".toCharArray();
      text[58] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Serie : </td>\n           <td>".toCharArray();
      text[59] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Proveedor : </td>\n           <td>".toCharArray();
      text[60] = 
      "</td></tr>".toCharArray();
      text[61] = 
      "\n     ".toCharArray();
      text[62] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR REFERENCIA (Vehículos)</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Marca : </td>\n           <td>".toCharArray();
      text[63] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Tipo : </td>\n           <td>".toCharArray();
      text[64] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Nro. de Motor : </td>\n           <td>".toCharArray();
      text[65] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Nro. de chasis : </td>\n           <td>".toCharArray();
      text[66] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Placa : </td>\n           <td>".toCharArray();
      text[67] = 
      "</td></tr>".toCharArray();
      text[68] = 
      "\n     ".toCharArray();
      text[69] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR OFICINA</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Oficina : </td>\n           <td>".toCharArray();
      text[70] = 
      "\n              ".toCharArray();
      text[71] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Regional : </td>\n           <td>".toCharArray();
      text[72] = 
      "\n           ".toCharArray();
      text[73] = 
      "</td></tr>".toCharArray();
      text[74] = 
      "         \n     ".toCharArray();
      text[75] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS POR REGIONAL PARA CUADRE</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[76] = 
      "\n              ".toCharArray();
      text[77] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[78] = 
      "\n           ".toCharArray();
      text[79] = 
      "</td></tr>".toCharArray();
      text[80] = 
      "         \n     ".toCharArray();
      text[81] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE INCORPORACION DE ACTIVOS</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[82] = 
      "\n              ".toCharArray();
      text[83] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[84] = 
      "\n           ".toCharArray();
      text[85] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[86] = 
      "\n              ".toCharArray();
      text[87] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[88] = 
      "\n              ".toCharArray();
      text[89] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[90] = 
      "</td></tr>         \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[91] = 
      "\n               ".toCharArray();
      text[92] = 
      "\n               ".toCharArray();
      text[93] = 
      "</td></tr>               \n        <tr>\n           <td class=\"S10d\">Incorporados\\Revaluados: </td>\n           <td class=\"S10i\"><input type=\"radio\" name=\"condirep\" checked=\"checked\" value=\"I\"> Incorporados <input type=\"radio\" name=\"condirep\" value=\"R\"> Revaluados</td></tr>".toCharArray();
      text[94] = 
      "          \n     ".toCharArray();
      text[95] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS DADOS DE BAJA POR RUBRO</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[96] = 
      "\n              ".toCharArray();
      text[97] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[98] = 
      "\n           ".toCharArray();
      text[99] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[100] = 
      "\n              ".toCharArray();
      text[101] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[102] = 
      "\n              ".toCharArray();
      text[103] = 
      "</td></tr> \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[104] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[105] = 
      "\n               ".toCharArray();
      text[106] = 
      "\n               ".toCharArray();
      text[107] = 
      "</td></tr> \n        <tr>\n           <td class=\"S10d\">Bajas\\Ajustes: </td>\n           <td class=\"S10i\"><input type=\"radio\" name=\"condirep\" checked=\"checked\" value=\"B\"> Bajas <input type=\"radio\" name=\"condirep\" value=\"A\"> Ajustes</td></tr>".toCharArray();
      text[108] = 
      "          \n     ".toCharArray();
      text[109] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE INVENTARIO DE ACTIVOS POR REGIONAL</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[110] = 
      "\n              ".toCharArray();
      text[111] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[112] = 
      "\n               ".toCharArray();
      text[113] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[114] = 
      "\n              ".toCharArray();
      text[115] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[116] = 
      "\n              ".toCharArray();
      text[117] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[118] = 
      "\n               ".toCharArray();
      text[119] = 
      "\n               ".toCharArray();
      text[120] = 
      "</td></tr>".toCharArray();
      text[121] = 
      "          \n     ".toCharArray();
      text[122] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE INVENTARIO DE ACTIVOS POR RUBRO</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[123] = 
      "\n              ".toCharArray();
      text[124] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[125] = 
      "\n              ".toCharArray();
      text[126] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[127] = 
      "\n              ".toCharArray();
      text[128] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[129] = 
      "\n              ".toCharArray();
      text[130] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[131] = 
      "\n               ".toCharArray();
      text[132] = 
      "\n               ".toCharArray();
      text[133] = 
      "</td></tr>".toCharArray();
      text[134] = 
      "          \n     ".toCharArray();
      text[135] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE RESUMEN DE ACTIVOS POR RUBRO </b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[136] = 
      "\n           ".toCharArray();
      text[137] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[138] = 
      "\n              ".toCharArray();
      text[139] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[140] = 
      "\n              ".toCharArray();
      text[141] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[142] = 
      "\n               ".toCharArray();
      text[143] = 
      "\n               ".toCharArray();
      text[144] = 
      "</td></tr>".toCharArray();
      text[145] = 
      "          \n     ".toCharArray();
      text[146] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE RESUMEN DE ACTIVOS POR CUENTA (PARTIDA) </b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[147] = 
      "\n           ".toCharArray();
      text[148] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[149] = 
      "\n              ".toCharArray();
      text[150] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[151] = 
      "\n              ".toCharArray();
      text[152] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[153] = 
      "\n               ".toCharArray();
      text[154] = 
      "\n               ".toCharArray();
      text[155] = 
      "</td></tr>".toCharArray();
      text[156] = 
      "          \n     ".toCharArray();
      text[157] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE RESUMEN DE ACTIVOS POR REGIONAL</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[158] = 
      "\n           ".toCharArray();
      text[159] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[160] = 
      "\n              ".toCharArray();
      text[161] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[162] = 
      "\n              ".toCharArray();
      text[163] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[164] = 
      "\n               ".toCharArray();
      text[165] = 
      "\n               ".toCharArray();
      text[166] = 
      "</td></tr>".toCharArray();
      text[167] = 
      "          \n     ".toCharArray();
      text[168] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE NUEVOS ACTIVOS</b></td></tr>".toCharArray();
      text[169] = 
      "  \n     ".toCharArray();
      text[170] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE ACTIVOS INVENTARIADOS</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[171] = 
      "</td></tr>         \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[172] = 
      "</td></tr>".toCharArray();
      text[173] = 
      "          \n     ".toCharArray();
      text[174] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE CAMBIO DE ESTADO, OFICINA y PROYECTO</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[175] = 
      "</td></tr>         \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[176] = 
      "</td></tr>".toCharArray();
      text[177] = 
      "             \n     ".toCharArray();
      text[178] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE CAMBIO DE FUNCIONARIO</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[179] = 
      "</td></tr>         \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[180] = 
      "</td></tr>".toCharArray();
      text[181] = 
      "            \n     ".toCharArray();
      text[182] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE FALTANTES Y SOBRANTES</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[183] = 
      "</td></tr>         \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[184] = 
      "</td></tr>                 \n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Funcionario : </td>\n           <td width=\"50%\">".toCharArray();
      text[185] = 
      "\n              ".toCharArray();
      text[186] = 
      "</td></tr>".toCharArray();
      text[187] = 
      "              \n     ".toCharArray();
      text[188] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE CONSOLIDADO POR RUBRO </b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[189] = 
      "\n              ".toCharArray();
      text[190] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[191] = 
      "\n              ".toCharArray();
      text[192] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[193] = 
      "\n               ".toCharArray();
      text[194] = 
      "\n               ".toCharArray();
      text[195] = 
      "</td></tr>".toCharArray();
      text[196] = 
      "          \n     ".toCharArray();
      text[197] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE VALIDA DEPRECIACION </b></td></tr>".toCharArray();
      text[198] = 
      "\n     ".toCharArray();
      text[199] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>HISTORIAL DE ACTIVOS POR FECHA</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Rubro : </td>\n           <td width=\"50%\">".toCharArray();
      text[200] = 
      "\n              ".toCharArray();
      text[201] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[202] = 
      "\n           ".toCharArray();
      text[203] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Codigo Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[204] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Codigo Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[205] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Fecha Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[206] = 
      "</td></tr>         \n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[207] = 
      "</td></tr>".toCharArray();
      text[208] = 
      "        \n     ".toCharArray();
      text[209] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE CONSOLIDADO POR CUENTA </b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[210] = 
      "\n              ".toCharArray();
      text[211] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[212] = 
      "\n              ".toCharArray();
      text[213] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[214] = 
      "\n               ".toCharArray();
      text[215] = 
      "\n               ".toCharArray();
      text[216] = 
      "</td></tr>".toCharArray();
      text[217] = 
      "        \n     ".toCharArray();
      text[218] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>HISTORIAL DE RESPONSABLES POR FECHA</b></td>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Funcionario : </td>\n           <td width=\"50%\">".toCharArray();
      text[219] = 
      "\n              ".toCharArray();
      text[220] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Fecha Inicial : </td>\n           <td width=\"50%\">".toCharArray();
      text[221] = 
      "</td></tr>         \n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[222] = 
      "</td></tr>".toCharArray();
      text[223] = 
      "          \n     ".toCharArray();
      text[224] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE DE INVENTARIO DE ACTIVOS POR UBICACION</b></td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Ubicacion : </td>\n           <td width=\"50%\">".toCharArray();
      text[225] = 
      "\n              ".toCharArray();
      text[226] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">Oficina : </td>\n           <td width=\"50%\">".toCharArray();
      text[227] = 
      "\n              ".toCharArray();
      text[228] = 
      "</td></tr>\n        <tr>              \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[229] = 
      "\n           ".toCharArray();
      text[230] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[231] = 
      "\n              ".toCharArray();
      text[232] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[233] = 
      "\n              ".toCharArray();
      text[234] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[235] = 
      "\n               ".toCharArray();
      text[236] = 
      "\n               ".toCharArray();
      text[237] = 
      "</td></tr>".toCharArray();
      text[238] = 
      "          \n     ".toCharArray();
      text[239] = 
      "\n        <tr><td colspan=\"2\" align=\"center\"><b>REPORTE RESUMEN DE ACTIVOS POR UBICACION</b></td></tr>       \n        <tr>\n           <td class=\"S10d\" width=\"50%\">Regional : </td>\n           <td width=\"50%\">".toCharArray();
      text[240] = 
      "\n           ".toCharArray();
      text[241] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[242] = 
      "\n              ".toCharArray();
      text[243] = 
      "</td></tr>\n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Proyecto : </td>\n           <td width=\"50%\">".toCharArray();
      text[244] = 
      "\n              ".toCharArray();
      text[245] = 
      "</td></tr>        \n        <tr>\n           <td class=\"S10d\" width=\"50%\">*Fecha Final : </td>\n           <td width=\"50%\">".toCharArray();
      text[246] = 
      "\n               ".toCharArray();
      text[247] = 
      "\n               ".toCharArray();
      text[248] = 
      "</td></tr>".toCharArray();
      text[249] = 
      "       \n     <tr>\n      <td class=\"S10d\" width=\"50%\">Formato de Salida : </td>\n      <td width=\"50%\">".toCharArray();
      text[250] = 
      "\n        ".toCharArray();
      text[251] = 
      "PDF".toCharArray();
      text[252] = 
      "\n        ".toCharArray();
      text[253] = 
      "Excel".toCharArray();
      text[254] = 
      "\n        ".toCharArray();
      text[255] = 
      "Html".toCharArray();
      text[256] = 
      "</td></tr>      \n      <tr>\n        <td align=\"center\" colspan=\"2\" width=\"100%\">\n        ".toCharArray();
      text[257] = 
      "</td></tr>\n  ".toCharArray();
      text[258] = 
      "\n</table>\n".toCharArray();
      text[259] = 
      "\n</body>\n</html>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
