  /*@lineinfo:filename=/Reporte.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _Reporte extends oracle.jsp.runtime.HttpJsp {

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
    _Reporte page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      /*@lineinfo:translated-code*//*@lineinfo:6^1*/      {
        org.apache.struts.taglib.html.HtmlTag __jsp_taghandler_1=(org.apache.struts.taglib.html.HtmlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HtmlTag.class,"org.apache.struts.taglib.html.HtmlTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:20^5*/            {
              org.apache.struts.taglib.html.FormTag __jsp_taghandler_2=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setAction("/reporteAction");
              __jsp_taghandler_2.setOnsubmit("return EvaluaR();");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[5]);
                  /*@lineinfo:translated-code*//*@lineinfo:22^8*/                  {
                    org.apache.struts.taglib.html.CancelTag __jsp_taghandler_3=(org.apache.struts.taglib.html.CancelTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.CancelTag.class,"org.apache.struts.taglib.html.CancelTag property styleClass value");
                    __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_3.setProperty("org.apache.struts.taglib.html.CANCEL");
                    __jsp_taghandler_3.setStyleClass("boton1");
                    __jsp_taghandler_3.setValue("Volver");
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
                  out.write(__jsp_StaticText.text[6]);
                  /*@lineinfo:translated-code*//*@lineinfo:31^25*/                  {
                    org.apache.struts.taglib.html.SelectTag __jsp_taghandler_4=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag name property");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_4.setName("ReporteForm");
                    __jsp_taghandler_4.setProperty("aduana");
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[7]);
                        /*@lineinfo:translated-code*//*@lineinfo:32^28*/                        {
                          org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_5=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                          __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                          __jsp_taghandler_5.setCollection("lAduana");
                          __jsp_taghandler_5.setLabelProperty("desc");
                          __jsp_taghandler_5.setProperty("codigo");
                          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[8]);
                      /*@lineinfo:translated-code*//*@lineinfo:32^103*/                      } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[9]);
                  /*@lineinfo:translated-code*//*@lineinfo:37^25*/                  {
                    org.apache.struts.taglib.html.SelectTag __jsp_taghandler_6=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag name property");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_6.setName("ReporteForm");
                    __jsp_taghandler_6.setProperty("patron");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[10]);
                        /*@lineinfo:translated-code*//*@lineinfo:38^28*/                        {
                          org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_7=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_7.setCollection("lPatron");
                          __jsp_taghandler_7.setLabelProperty("desc");
                          __jsp_taghandler_7.setProperty("codigo");
                          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[11]);
                      /*@lineinfo:translated-code*//*@lineinfo:38^103*/                      } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[12]);
                  /*@lineinfo:translated-code*//*@lineinfo:42^50*/                  {
                    org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_8=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_8.setStyleClass("boton1");
                    __jsp_taghandler_8.setValue("Actualizar Reporte");
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
                  out.write(__jsp_StaticText.text[13]);
                  /*@lineinfo:translated-code*//*@lineinfo:55^25*/                  {
                    org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_9=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_9.setName("ReporteForm");
                    __jsp_taghandler_9.setProperty("resu");
                    __jsp_taghandler_9.setValue("0");
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[14]);
                        /*@lineinfo:translated-code*//*@lineinfo:56^25*/                        {
                          org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_10=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                          __jsp_taghandler_10.setId("lista");
                          __jsp_taghandler_10.setName("registros");
                          java.lang.Object lista = null;
                          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                            do {
                              lista = (java.lang.Object) pageContext.findAttribute("lista");
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[15]);
                              /*@lineinfo:translated-code*//*@lineinfo:58^35*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_11=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                                __jsp_taghandler_11.setName("lista");
                                __jsp_taghandler_11.setProperty("aduana");
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
                              /*@lineinfo:translated-code*//*@lineinfo:59^35*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_12=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                                __jsp_taghandler_12.setName("lista");
                                __jsp_taghandler_12.setProperty("patron");
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
                              out.write(__jsp_StaticText.text[17]);
                              /*@lineinfo:translated-code*//*@lineinfo:60^35*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_13=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_13.setParent(__jsp_taghandler_10);
                                __jsp_taghandler_13.setName("lista");
                                __jsp_taghandler_13.setProperty("horas");
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
                              /*@lineinfo:translated-code*//*@lineinfo:61^35*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_14=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_14.setParent(__jsp_taghandler_10);
                                __jsp_taghandler_14.setName("lista");
                                __jsp_taghandler_14.setProperty("desde");
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
                              out.write(__jsp_StaticText.text[19]);
                              /*@lineinfo:translated-code*//*@lineinfo:62^35*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_15=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_15.setParent(__jsp_taghandler_10);
                                __jsp_taghandler_15.setName("lista");
                                __jsp_taghandler_15.setProperty("hasta");
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
                              /*@lineinfo:translated-code*//*@lineinfo:63^35*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_16=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_16.setParent(__jsp_taghandler_10);
                                __jsp_taghandler_16.setName("lista");
                                __jsp_taghandler_16.setProperty("estado");
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
                              out.write(__jsp_StaticText.text[21]);
                              /*@lineinfo:translated-code*//*@lineinfo:64^35*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_17=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_17.setParent(__jsp_taghandler_10);
                                __jsp_taghandler_17.setName("lista");
                                __jsp_taghandler_17.setProperty("usuario");
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
                              out.write(__jsp_StaticText.text[22]);
                              /*@lineinfo:translated-code*//*@lineinfo:65^35*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_18.setParent(__jsp_taghandler_10);
                                __jsp_taghandler_18.setName("lista");
                                __jsp_taghandler_18.setProperty("fecha");
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
                            /*@lineinfo:translated-code*//*@lineinfo:65^79*/                            } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[24]);
                      /*@lineinfo:translated-code*//*@lineinfo:67^41*/                      } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[25]);
                  /*@lineinfo:translated-code*//*@lineinfo:70^29*/                  {
                    org.apache.struts.taglib.html.CancelTag __jsp_taghandler_19=(org.apache.struts.taglib.html.CancelTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.CancelTag.class,"org.apache.struts.taglib.html.CancelTag property styleClass value");
                    __jsp_taghandler_19.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_19.setProperty("org.apache.struts.taglib.html.CANCEL");
                    __jsp_taghandler_19.setStyleClass("boton1");
                    __jsp_taghandler_19.setValue("Volver");
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
                  out.write(__jsp_StaticText.text[26]);
                /*@lineinfo:translated-code*//*@lineinfo:70^126*/                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[27]);
          /*@lineinfo:translated-code*//*@lineinfo:81^13*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[28]);


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
    private static final char text[][]=new char[29][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n\n".toCharArray();
      text[3] = 
      "\n".toCharArray();
      text[4] = 
      "\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <link href=\"EstilosGaby.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n<!--\n  bCancel = false;  \n-->\n</script>\n  <script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n\n<body  bgcolor=\"#FFFFFF\">       \n    ".toCharArray();
      text[5] = 
      "\n    <div align=\"center\">\n       ".toCharArray();
      text[6] = 
      "\n    </div>\n    <br><br>\n    <table width=90% align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\">\n      <tr> <td class=\"FondoAzul\" align=left><b>Retardo Emisión Pase de Salida.</b></td> </tr>      \n      <tr> <td><hr></td></tr>\n      <tr> <td> \n             <table align = \"center\">\n                <tr><td class=\"S10d\">&nbsp;&nbsp;&nbsp;&nbsp;Aduana :</td>                              \n                    <td>".toCharArray();
      text[7] = 
      "\n                           ".toCharArray();
      text[8] = 
      "\n                        ".toCharArray();
      text[9] = 
      "\n                    </td>\n                </tr>\n                <tr><td class=\"S10d\">&nbsp;&nbsp;&nbsp;&nbsp;Patron :</td>                              \n                    <td>".toCharArray();
      text[10] = 
      "\n                           ".toCharArray();
      text[11] = 
      "\n                        ".toCharArray();
      text[12] = 
      "\n                    </td>\n                </tr> \n               <tr><td colspan=\"3\" align=\"right\">".toCharArray();
      text[13] = 
      "</td></tr>\n               <tr>\n                     <table class=\"soloborde\" bgcolor=\"#C1C1FF\" width=100%>\n                       <tr class=\"FondoAzul\">\n                         <td class=\"S10c\">Aduana</td>                              \n                         <td class=\"S10c\">Patron</td>                              \n                         <td class=\"S10c\">Tiempo</td>                              \n                         <td class=\"S10c\">Desde</td>                              \n                         <td class=\"S10c\">Hasta</td>                                                \n                         <td class=\"S10c\">Estado</td>                         \n                         <td class=\"S10c\">Usuario</td>\n                         <td class=\"S10c\">Fecha Operación</td>\n                        </tr>\n                        ".toCharArray();
      text[14] = 
      "\n                        ".toCharArray();
      text[15] = 
      "\n                           <tr align=\"left\" class=\"T8a\">\n                              <td>".toCharArray();
      text[16] = 
      "</td>                    \n                              <td>".toCharArray();
      text[17] = 
      "</td>                    \n                              <td>".toCharArray();
      text[18] = 
      "</td>                    \n                              <td>".toCharArray();
      text[19] = 
      "</td>                    \n                              <td>".toCharArray();
      text[20] = 
      "</td>                    \n                              <td>".toCharArray();
      text[21] = 
      "</td>                    \n                              <td>".toCharArray();
      text[22] = 
      "</td>\n                              <td>".toCharArray();
      text[23] = 
      "</td>\n                           </tr>\n                        ".toCharArray();
      text[24] = 
      "\n                        ".toCharArray();
      text[25] = 
      "\n                        <tr><td colspan=\"8\" align=\"center\">\n                            ".toCharArray();
      text[26] = 
      "\n                        </td></tr>\n                     </table>   \n               </tr>      \n      <tr>\n      </table>\n      </td></tr> \n    </table>\n    <br><br>\n\n\n".toCharArray();
      text[27] = 
      "\n</body>\n".toCharArray();
      text[28] = 
      "\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
