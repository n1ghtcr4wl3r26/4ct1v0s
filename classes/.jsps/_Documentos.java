  /*@lineinfo:filename=/Documentos.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;
import java.sql.*;
import oracle.jdbc.driver.*;
import java.util.*;
import java.text.*;


public class _Documentos extends oracle.jsp.runtime.HttpJsp {

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
    _Documentos page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      out.write(__jsp_StaticText.text[5]);
      /*@lineinfo:translated-code*//*@lineinfo:172^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_1=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("DocumentosForm");
        __jsp_taghandler_1.setProperty("doc_tipdoc");
        __jsp_taghandler_1.setValue("E");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
          /*@lineinfo:translated-code*//*@lineinfo:172^71*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[7]);
      /*@lineinfo:translated-code*//*@lineinfo:175^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_2=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setName("DocumentosForm");
        __jsp_taghandler_2.setProperty("doc_tipdoc");
        __jsp_taghandler_2.setValue("D");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[8]);
          /*@lineinfo:translated-code*//*@lineinfo:175^71*/          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[9]);
      /*@lineinfo:translated-code*//*@lineinfo:178^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_3=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setName("DocumentosForm");
        __jsp_taghandler_3.setProperty("doc_tipdoc");
        __jsp_taghandler_3.setValue("T");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[10]);
          /*@lineinfo:translated-code*//*@lineinfo:178^71*/          } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[11]);
      /*@lineinfo:translated-code*//*@lineinfo:181^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setName("DocumentosForm");
        __jsp_taghandler_4.setProperty("doc_tipdoc");
        __jsp_taghandler_4.setValue("U");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[12]);
          /*@lineinfo:translated-code*//*@lineinfo:181^71*/          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[13]);
      /*@lineinfo:translated-code*//*@lineinfo:184^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setName("DocumentosForm");
        __jsp_taghandler_5.setProperty("doc_tipdoc");
        __jsp_taghandler_5.setValue("B");
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[14]);
          /*@lineinfo:translated-code*//*@lineinfo:184^71*/          } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[15]);
      /*@lineinfo:translated-code*//*@lineinfo:187^1*/      {
        org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_6=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setName("DocumentosForm");
        __jsp_taghandler_6.setProperty("doc_tipdoc");
        __jsp_taghandler_6.setValue("V");
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[16]);
          /*@lineinfo:translated-code*//*@lineinfo:187^71*/          } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[17]);
      /*@lineinfo:translated-code*//*@lineinfo:190^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_7=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setAction("/documentosAction");
        __jsp_taghandler_7.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[18]);
            /*@lineinfo:translated-code*//*@lineinfo:191^1*/            {
              org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_8=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag property");
              __jsp_taghandler_8.setParent(__jsp_taghandler_7);
              __jsp_taghandler_8.setProperty("operacion");
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
            out.write(__jsp_StaticText.text[19]);
            /*@lineinfo:translated-code*//*@lineinfo:192^1*/            {
              org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_9=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag property");
              __jsp_taghandler_9.setParent(__jsp_taghandler_7);
              __jsp_taghandler_9.setProperty("opcion");
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
            out.write(__jsp_StaticText.text[20]);
            /*@lineinfo:translated-code*//*@lineinfo:194^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_10=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_10.setParent(__jsp_taghandler_7);
              __jsp_taghandler_10.setName("DocumentosForm");
              __jsp_taghandler_10.setProperty("operacion");
              __jsp_taghandler_10.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[21]);
                  /*@lineinfo:translated-code*//*@lineinfo:199^27*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_11=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_11.setKey("Documentos.codreg");
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
                  out.write(__jsp_StaticText.text[22]);
                  /*@lineinfo:translated-code*//*@lineinfo:200^14*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_12=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_12.setName("DocumentosForm");
                    __jsp_taghandler_12.setProperty("doc_codreg");
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
                  out.write(__jsp_StaticText.text[23]);
                  /*@lineinfo:translated-code*//*@lineinfo:201^10*/                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_13=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                    __jsp_taghandler_13.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_13.setMaxlength("30");
                    __jsp_taghandler_13.setName("DocumentosForm");
                    __jsp_taghandler_13.setProperty("doc_regdescripcion");
                    __jsp_taghandler_13.setReadonly(true);
                    __jsp_taghandler_13.setSize("30");
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
                  out.write(__jsp_StaticText.text[24]);
                  /*@lineinfo:translated-code*//*@lineinfo:204^27*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_14=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_14.setKey("Documentos.codfin");
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
                  out.write(__jsp_StaticText.text[25]);
                  /*@lineinfo:translated-code*//*@lineinfo:205^14*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_15=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_15.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_15.setName("DocumentosForm");
                    __jsp_taghandler_15.setProperty("doc_codfin");
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
                  out.write(__jsp_StaticText.text[26]);
                  /*@lineinfo:translated-code*//*@lineinfo:206^10*/                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_16=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                    __jsp_taghandler_16.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_16.setMaxlength("30");
                    __jsp_taghandler_16.setName("DocumentosForm");
                    __jsp_taghandler_16.setProperty("doc_findescripcion");
                    __jsp_taghandler_16.setReadonly(true);
                    __jsp_taghandler_16.setSize("30");
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
                  out.write(__jsp_StaticText.text[27]);
                  /*@lineinfo:translated-code*//*@lineinfo:209^26*/                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_17=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_17.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_17.setKey("Documentos.tipdoc");
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
                  out.write(__jsp_StaticText.text[28]);
                  /*@lineinfo:translated-code*//*@lineinfo:210^13*/                  {
                    org.apache.struts.taglib.html.SelectTag __jsp_taghandler_18=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                    __jsp_taghandler_18.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_18.setDisabled(false);
                    __jsp_taghandler_18.setName("DocumentosForm");
                    __jsp_taghandler_18.setProperty("doc_tipdoc");
                    __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[29]);
                        /*@lineinfo:translated-code*//*@lineinfo:211^13*/                        {
                          org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_19=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                          __jsp_taghandler_19.setCollection("TiposDocumentosLista");
                          __jsp_taghandler_19.setLabelProperty("descripcion");
                          __jsp_taghandler_19.setProperty("codigo");
                          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[30]);
                      /*@lineinfo:translated-code*//*@lineinfo:211^109*/                      } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[31]);
                  /*@lineinfo:translated-code*//*@lineinfo:214^6*/                  {
                    org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_20=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                    __jsp_taghandler_20.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_20.setName("DocumentosForm");
                    __jsp_taghandler_20.setProperty("opcion");
                    __jsp_taghandler_20.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[32]);
                        /*@lineinfo:translated-code*//*@lineinfo:216^26*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_21=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                          __jsp_taghandler_21.setKey("Documentos.inicio");
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
                        out.write(__jsp_StaticText.text[33]);
                        /*@lineinfo:translated-code*//*@lineinfo:217^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_22=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size value");
                          __jsp_taghandler_22.setParent(__jsp_taghandler_20);
                          __jsp_taghandler_22.setMaxlength("10");
                          __jsp_taghandler_22.setName("DocumentosForm");
                          __jsp_taghandler_22.setProperty("inicio");
                          __jsp_taghandler_22.setSize("10");
                          __jsp_taghandler_22.setValue("0");
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
                        out.write(__jsp_StaticText.text[34]);
                        /*@lineinfo:translated-code*//*@lineinfo:220^26*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_23=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_23.setParent(__jsp_taghandler_20);
                          __jsp_taghandler_23.setKey("Documentos.fin");
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
                        out.write(__jsp_StaticText.text[35]);
                        /*@lineinfo:translated-code*//*@lineinfo:221^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_24=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size value");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_20);
                          __jsp_taghandler_24.setMaxlength("10");
                          __jsp_taghandler_24.setName("DocumentosForm");
                          __jsp_taghandler_24.setProperty("fin");
                          __jsp_taghandler_24.setSize("10");
                          __jsp_taghandler_24.setValue("99999");
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
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:223^6*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_25=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_25.setParent(__jsp_taghandler_20);
                          __jsp_taghandler_25.setName("DocumentosForm");
                          __jsp_taghandler_25.setProperty("opcion");
                          __jsp_taghandler_25.setValue("5");
                          __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[37]);
                              /*@lineinfo:translated-code*//*@lineinfo:226^13*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_26=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                                __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                                __jsp_taghandler_26.setMaxlength("4");
                                __jsp_taghandler_26.setName("DocumentosForm");
                                __jsp_taghandler_26.setProperty("gestionant");
                                __jsp_taghandler_26.setSize("10");
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
                              out.write(__jsp_StaticText.text[38]);
                            /*@lineinfo:translated-code*//*@lineinfo:226^94*/                            } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[39]);
                      /*@lineinfo:translated-code*//*@lineinfo:232^20*/                      } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[40]);
                  /*@lineinfo:translated-code*//*@lineinfo:237^9*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_27=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_27.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_27.setName("DocumentosForm");
                    __jsp_taghandler_27.setProperty("opcion");
                    __jsp_taghandler_27.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[41]);
                        /*@lineinfo:translated-code*//*@lineinfo:238^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_28=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                          __jsp_taghandler_28.setOnclick("operacion.value=4;opcion.value=5;salir.value=0");
                          __jsp_taghandler_28.setProperty("boton");
                          __jsp_taghandler_28.setStyleClass("boton1");
                          __jsp_taghandler_28.setValue("Reportar");
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
                        out.write(__jsp_StaticText.text[42]);
                      /*@lineinfo:translated-code*//*@lineinfo:238^138*/                      } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[43]);
                  /*@lineinfo:translated-code*//*@lineinfo:240^9*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_29=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_29.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_29.setName("DocumentosForm");
                    __jsp_taghandler_29.setProperty("opcion");
                    __jsp_taghandler_29.setValue("4");
                    __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[44]);
                        /*@lineinfo:translated-code*//*@lineinfo:241^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_30=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                          __jsp_taghandler_30.setOnclick("operacion.value=4;opcion.value=4;salir.value=0");
                          __jsp_taghandler_30.setProperty("boton");
                          __jsp_taghandler_30.setStyleClass("boton1");
                          __jsp_taghandler_30.setValue("Confirmar");
                          __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[45]);
                      /*@lineinfo:translated-code*//*@lineinfo:241^139*/                      } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[46]);
                  /*@lineinfo:translated-code*//*@lineinfo:243^9*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_31=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_31.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_31.setName("DocumentosForm");
                    __jsp_taghandler_31.setProperty("opcion");
                    __jsp_taghandler_31.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[47]);
                        /*@lineinfo:translated-code*//*@lineinfo:244^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_32=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                          __jsp_taghandler_32.setOnclick("operacion.value=4;opcion.value=3;salir.value=0");
                          __jsp_taghandler_32.setProperty("boton");
                          __jsp_taghandler_32.setStyleClass("boton1");
                          __jsp_taghandler_32.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[48]);
                      /*@lineinfo:translated-code*//*@lineinfo:244^138*/                      } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[49]);
                  /*@lineinfo:translated-code*//*@lineinfo:246^9*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_33=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_33.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_33.setName("DocumentosForm");
                    __jsp_taghandler_33.setProperty("opcion");
                    __jsp_taghandler_33.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[50]);
                        /*@lineinfo:translated-code*//*@lineinfo:247^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_34=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                          __jsp_taghandler_34.setOnclick("operacion.value=4;opcion.value=2;salir.value=0");
                          __jsp_taghandler_34.setProperty("boton");
                          __jsp_taghandler_34.setStyleClass("boton1");
                          __jsp_taghandler_34.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[51]);
                      /*@lineinfo:translated-code*//*@lineinfo:247^139*/                      } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[52]);
                  /*@lineinfo:translated-code*//*@lineinfo:249^9*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_35=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_35.setParent(__jsp_taghandler_10);
                    __jsp_taghandler_35.setName("DocumentosForm");
                    __jsp_taghandler_35.setProperty("opcion");
                    __jsp_taghandler_35.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[53]);
                        /*@lineinfo:translated-code*//*@lineinfo:250^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_36=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                          __jsp_taghandler_36.setOnclick("operacion.value=5;opcion.value=1;salir.value=0");
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
                        out.write(__jsp_StaticText.text[54]);
                      /*@lineinfo:translated-code*//*@lineinfo:250^138*/                      } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[55]);
                /*@lineinfo:translated-code*//*@lineinfo:251^23*/                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[56]);
            /*@lineinfo:translated-code*//*@lineinfo:258^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_37=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_37.setParent(__jsp_taghandler_7);
              __jsp_taghandler_37.setName("DocumentosForm");
              __jsp_taghandler_37.setProperty("operacion");
              __jsp_taghandler_37.setValue("4");
              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[57]);
                  /*@lineinfo:translated-code*//*@lineinfo:261^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_38=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                    __jsp_taghandler_38.setName("DocumentosForm");
                    __jsp_taghandler_38.setProperty("inicio");
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
                  out.write(__jsp_StaticText.text[58]);
                  /*@lineinfo:translated-code*//*@lineinfo:262^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_39=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_39.setParent(__jsp_taghandler_37);
                    __jsp_taghandler_39.setName("DocumentosForm");
                    __jsp_taghandler_39.setProperty("fin");
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
                  out.write(__jsp_StaticText.text[59]);
                  /*@lineinfo:translated-code*//*@lineinfo:263^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_40=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_40.setParent(__jsp_taghandler_37);
                    __jsp_taghandler_40.setName("DocumentosForm");
                    __jsp_taghandler_40.setProperty("doc_tipdoc");
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
                  out.write(__jsp_StaticText.text[60]);
                  /*@lineinfo:translated-code*//*@lineinfo:264^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_41=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_41.setParent(__jsp_taghandler_37);
                    __jsp_taghandler_41.setName("DocumentosForm");
                    __jsp_taghandler_41.setProperty("confirmados");
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
                  out.write(__jsp_StaticText.text[61]);
                  /*@lineinfo:translated-code*//*@lineinfo:265^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_42=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_42.setParent(__jsp_taghandler_37);
                    __jsp_taghandler_42.setName("DocumentosForm");
                    __jsp_taghandler_42.setProperty("gestionant");
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
                  out.write(__jsp_StaticText.text[62]);
                  /*@lineinfo:translated-code*//*@lineinfo:274^10*/                  {
                    org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_43=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                    __jsp_taghandler_43.setParent(__jsp_taghandler_37);
                    __jsp_taghandler_43.setName("DocumentosForm");
                    __jsp_taghandler_43.setProperty("doc_tipdoc");
                    __jsp_taghandler_43.setValue("B");
                    __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[63]);
                      /*@lineinfo:translated-code*//*@lineinfo:274^83*/                      } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[64]);
                  /*@lineinfo:user-code*//*@lineinfo:280^7*/                   int pnum=0;
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[65]);
                  /*@lineinfo:translated-code*//*@lineinfo:281^7*/                  {
                    org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_44=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
                    __jsp_taghandler_44.setParent(__jsp_taghandler_37);
                    __jsp_taghandler_44.setId("lista");
                    __jsp_taghandler_44.setName("DocumentosLista");
                    java.lang.Object lista = null;
                    __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_44,__jsp_tag_starteval,out);
                      do {
                        lista = (java.lang.Object) pageContext.findAttribute("lista");
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[66]);
                        /*@lineinfo:user-code*//*@lineinfo:282^9*/                         if (pnum==1) {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[67]);
                        /*@lineinfo:user-code*//*@lineinfo:284^9*/                         } else { 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[68]);
                        /*@lineinfo:user-code*//*@lineinfo:286^9*/                         } 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[69]);
                        /*@lineinfo:translated-code*//*@lineinfo:287^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_45=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_45.setName("lista");
                          __jsp_taghandler_45.setProperty("descripcion_tipdoc");
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
                        out.write(__jsp_StaticText.text[70]);
                        /*@lineinfo:translated-code*//*@lineinfo:288^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_46=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_46.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_46.setName("lista");
                          __jsp_taghandler_46.setProperty("numero");
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
                        out.write(__jsp_StaticText.text[71]);
                        /*@lineinfo:translated-code*//*@lineinfo:289^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_47=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_47.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_47.setName("lista");
                          __jsp_taghandler_47.setProperty("fecha");
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
                        out.write(__jsp_StaticText.text[72]);
                        /*@lineinfo:translated-code*//*@lineinfo:290^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_48=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_48.setName("lista");
                          __jsp_taghandler_48.setProperty("codfunorigen");
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
                        out.write(__jsp_StaticText.text[73]);
                        /*@lineinfo:translated-code*//*@lineinfo:290^68*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_49=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_49.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_49.setName("lista");
                          __jsp_taghandler_49.setProperty("nombre_codfunorigen");
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
                        out.write(__jsp_StaticText.text[74]);
                        /*@lineinfo:translated-code*//*@lineinfo:291^12*/                        {
                          org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_50=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                          __jsp_taghandler_50.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_50.setName("DocumentosForm");
                          __jsp_taghandler_50.setProperty("doc_tipdoc");
                          __jsp_taghandler_50.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[75]);
                              /*@lineinfo:translated-code*//*@lineinfo:292^18*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_51=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_51.setParent(__jsp_taghandler_50);
                                __jsp_taghandler_51.setName("lista");
                                __jsp_taghandler_51.setProperty("codfundestino");
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
                              out.write(__jsp_StaticText.text[76]);
                              /*@lineinfo:translated-code*//*@lineinfo:292^71*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_52=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_52.setParent(__jsp_taghandler_50);
                                __jsp_taghandler_52.setName("lista");
                                __jsp_taghandler_52.setProperty("nombre_codfundestino");
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
                              out.write(__jsp_StaticText.text[77]);
                            /*@lineinfo:translated-code*//*@lineinfo:292^130*/                            } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[78]);
                        /*@lineinfo:translated-code*//*@lineinfo:294^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_53=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_53.setName("lista");
                          __jsp_taghandler_53.setProperty("observacion");
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
                        out.write(__jsp_StaticText.text[79]);
                        /*@lineinfo:translated-code*//*@lineinfo:296^13*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_54=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_54.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_54.setName("DocumentosForm");
                          __jsp_taghandler_54.setProperty("opcion");
                          __jsp_taghandler_54.setValue("5");
                          __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[80]);
                              /*@lineinfo:translated-code*//*@lineinfo:297^15*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_55=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                                __jsp_taghandler_55.setIndexed(true);
                                __jsp_taghandler_55.setOnclick("operacion.value=3;opcion.value=5;salir.value=0");
                                __jsp_taghandler_55.setProperty("boton");
                                __jsp_taghandler_55.setStyleClass("boton1");
                                __jsp_taghandler_55.setValue("Reportar");
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
                              out.write(__jsp_StaticText.text[81]);
                            /*@lineinfo:translated-code*//*@lineinfo:297^155*/                            } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[82]);
                        /*@lineinfo:translated-code*//*@lineinfo:299^13*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_56=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_56.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_56.setName("DocumentosForm");
                          __jsp_taghandler_56.setProperty("opcion");
                          __jsp_taghandler_56.setValue("4");
                          __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[83]);
                              /*@lineinfo:translated-code*//*@lineinfo:300^15*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_57=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_57.setParent(__jsp_taghandler_56);
                                __jsp_taghandler_57.setIndexed(true);
                                __jsp_taghandler_57.setOnclick("operacion.value=3;opcion.value=4;salir.value=0");
                                __jsp_taghandler_57.setProperty("boton");
                                __jsp_taghandler_57.setStyleClass("boton1");
                                __jsp_taghandler_57.setValue("Confirmar");
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
                              out.write(__jsp_StaticText.text[84]);
                            /*@lineinfo:translated-code*//*@lineinfo:300^156*/                            } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[85]);
                        /*@lineinfo:translated-code*//*@lineinfo:302^13*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_58=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_58.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_58.setName("DocumentosForm");
                          __jsp_taghandler_58.setProperty("opcion");
                          __jsp_taghandler_58.setValue("3");
                          __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[86]);
                              /*@lineinfo:translated-code*//*@lineinfo:303^15*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_59=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_59.setParent(__jsp_taghandler_58);
                                __jsp_taghandler_59.setIndexed(true);
                                __jsp_taghandler_59.setOnclick("operacion.value=3;opcion.value=3;salir.value=0");
                                __jsp_taghandler_59.setProperty("boton");
                                __jsp_taghandler_59.setStyleClass("boton1");
                                __jsp_taghandler_59.setValue("Eliminar");
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
                              out.write(__jsp_StaticText.text[87]);
                            /*@lineinfo:translated-code*//*@lineinfo:303^155*/                            } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[88]);
                        /*@lineinfo:translated-code*//*@lineinfo:305^13*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_60=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_60.setParent(__jsp_taghandler_44);
                          __jsp_taghandler_60.setName("DocumentosForm");
                          __jsp_taghandler_60.setProperty("opcion");
                          __jsp_taghandler_60.setValue("2");
                          __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[89]);
                              /*@lineinfo:translated-code*//*@lineinfo:306^15*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_61=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_61.setParent(__jsp_taghandler_60);
                                __jsp_taghandler_61.setIndexed(true);
                                __jsp_taghandler_61.setOnclick("operacion.value=5;opcion.value=2;salir.value=0");
                                __jsp_taghandler_61.setProperty("boton");
                                __jsp_taghandler_61.setStyleClass("boton1");
                                __jsp_taghandler_61.setValue("Modificar");
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
                              out.write(__jsp_StaticText.text[90]);
                            /*@lineinfo:translated-code*//*@lineinfo:306^156*/                            } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[91]);
                        /*@lineinfo:user-code*//*@lineinfo:310^10*/                         if (pnum==0) pnum=1; else pnum=0; 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[92]);
                      /*@lineinfo:translated-code*//*@lineinfo:310^49*/                      } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[93]);
                /*@lineinfo:translated-code*//*@lineinfo:311^23*/                } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[94]);
            /*@lineinfo:translated-code*//*@lineinfo:318^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_62=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_62.setParent(__jsp_taghandler_7);
              __jsp_taghandler_62.setName("DocumentosForm");
              __jsp_taghandler_62.setProperty("operacion");
              __jsp_taghandler_62.setValue("5");
              __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[95]);
                  /*@lineinfo:translated-code*//*@lineinfo:319^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_63=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_63.setParent(__jsp_taghandler_62);
                    __jsp_taghandler_63.setName("DocumentosForm");
                    __jsp_taghandler_63.setProperty("opcion");
                    __jsp_taghandler_63.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[96]);
                        /*@lineinfo:translated-code*//*@lineinfo:322^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_64=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_64.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_64.setName("DocumentosForm");
                          __jsp_taghandler_64.setProperty("inicio");
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
                        out.write(__jsp_StaticText.text[97]);
                        /*@lineinfo:translated-code*//*@lineinfo:323^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_65=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_65.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_65.setName("DocumentosForm");
                          __jsp_taghandler_65.setProperty("fin");
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
                        out.write(__jsp_StaticText.text[98]);
                        /*@lineinfo:translated-code*//*@lineinfo:324^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_66=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_66.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_66.setName("DocumentosForm");
                          __jsp_taghandler_66.setProperty("doc_codreg");
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
                        out.write(__jsp_StaticText.text[99]);
                        /*@lineinfo:translated-code*//*@lineinfo:325^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_67=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_67.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_67.setName("DocumentosForm");
                          __jsp_taghandler_67.setProperty("doc_codfin");
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
                        out.write(__jsp_StaticText.text[100]);
                        /*@lineinfo:translated-code*//*@lineinfo:326^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_68=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_68.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_68.setName("DocumentosForm");
                          __jsp_taghandler_68.setProperty("doc_tipdoc");
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
                        out.write(__jsp_StaticText.text[101]);
                        /*@lineinfo:translated-code*//*@lineinfo:327^10*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_69=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_69.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_69.setKey("Documentos.numero");
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
                        out.write(__jsp_StaticText.text[102]);
                        /*@lineinfo:translated-code*//*@lineinfo:328^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_70=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_70.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_70.setMaxlength("4");
                          __jsp_taghandler_70.setName("DocumentosForm");
                          __jsp_taghandler_70.setProperty("doc_numero");
                          __jsp_taghandler_70.setReadonly(true);
                          __jsp_taghandler_70.setSize("4");
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
                        out.write(__jsp_StaticText.text[103]);
                        /*@lineinfo:translated-code*//*@lineinfo:331^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_71=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_71.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_71.setKey("Documentos.fecha");
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
                        out.write(__jsp_StaticText.text[104]);
                        /*@lineinfo:translated-code*//*@lineinfo:332^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_72=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_72.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_72.setMaxlength("10");
                          __jsp_taghandler_72.setName("DocumentosForm");
                          __jsp_taghandler_72.setProperty("doc_fecha");
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
                        out.write(__jsp_StaticText.text[105]);
                        /*@lineinfo:translated-code*//*@lineinfo:335^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_73=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_73.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_73.setName("DocumentosForm");
                          __jsp_taghandler_73.setProperty("doc_tipdoc");
                          __jsp_taghandler_73.setValue("E");
                          __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[106]);
                              /*@lineinfo:translated-code*//*@lineinfo:336^29*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_74=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_74.setParent(__jsp_taghandler_73);
                                __jsp_taghandler_74.setKey("Documentos.codfunorigen");
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
                              out.write(__jsp_StaticText.text[107]);
                              /*@lineinfo:translated-code*//*@lineinfo:337^28*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_75=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_75.setParent(__jsp_taghandler_73);
                                __jsp_taghandler_75.setMaxlength("40");
                                __jsp_taghandler_75.setName("DocumentosForm");
                                __jsp_taghandler_75.setProperty("doc_funorinombre");
                                __jsp_taghandler_75.setReadonly(true);
                                __jsp_taghandler_75.setSize("40");
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
                              out.write(__jsp_StaticText.text[108]);
                              /*@lineinfo:translated-code*//*@lineinfo:338^12*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_76=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_76.setParent(__jsp_taghandler_73);
                                __jsp_taghandler_76.setName("DocumentosForm");
                                __jsp_taghandler_76.setProperty("doc_codfunorigen");
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
                              out.write(__jsp_StaticText.text[109]);
                            /*@lineinfo:translated-code*//*@lineinfo:338^77*/                            } while (__jsp_taghandler_73.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[110]);
                        /*@lineinfo:translated-code*//*@lineinfo:340^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_77=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_77.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_77.setName("DocumentosForm");
                          __jsp_taghandler_77.setProperty("doc_tipdoc");
                          __jsp_taghandler_77.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[111]);
                              /*@lineinfo:translated-code*//*@lineinfo:341^29*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_78=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_78.setParent(__jsp_taghandler_77);
                                __jsp_taghandler_78.setKey("Documentos.codfunorigen");
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
                              out.write(__jsp_StaticText.text[112]);
                              /*@lineinfo:translated-code*//*@lineinfo:342^28*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_79=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_79.setParent(__jsp_taghandler_77);
                                __jsp_taghandler_79.setMaxlength("40");
                                __jsp_taghandler_79.setName("DocumentosForm");
                                __jsp_taghandler_79.setProperty("doc_funorinombre");
                                __jsp_taghandler_79.setReadonly(true);
                                __jsp_taghandler_79.setSize("40");
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
                              out.write(__jsp_StaticText.text[113]);
                              /*@lineinfo:translated-code*//*@lineinfo:343^12*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_80=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_80.setParent(__jsp_taghandler_77);
                                __jsp_taghandler_80.setName("DocumentosForm");
                                __jsp_taghandler_80.setProperty("doc_codfunorigen");
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
                              out.write(__jsp_StaticText.text[114]);
                            /*@lineinfo:translated-code*//*@lineinfo:343^77*/                            } while (__jsp_taghandler_77.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[115]);
                        /*@lineinfo:translated-code*//*@lineinfo:345^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_81=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_81.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_81.setName("DocumentosForm");
                          __jsp_taghandler_81.setProperty("doc_tipdoc");
                          __jsp_taghandler_81.setValue("U");
                          __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[116]);
                              /*@lineinfo:translated-code*//*@lineinfo:346^29*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_82=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_82.setParent(__jsp_taghandler_81);
                                __jsp_taghandler_82.setKey("Documentos.codfunorigen");
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
                              out.write(__jsp_StaticText.text[117]);
                              /*@lineinfo:translated-code*//*@lineinfo:347^28*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_83=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_83.setParent(__jsp_taghandler_81);
                                __jsp_taghandler_83.setMaxlength("40");
                                __jsp_taghandler_83.setName("DocumentosForm");
                                __jsp_taghandler_83.setProperty("doc_funorinombre");
                                __jsp_taghandler_83.setReadonly(true);
                                __jsp_taghandler_83.setSize("40");
                                __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_83,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_83.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[118]);
                              /*@lineinfo:translated-code*//*@lineinfo:348^12*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_84=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_84.setParent(__jsp_taghandler_81);
                                __jsp_taghandler_84.setName("DocumentosForm");
                                __jsp_taghandler_84.setProperty("doc_codfunorigen");
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
                              out.write(__jsp_StaticText.text[119]);
                            /*@lineinfo:translated-code*//*@lineinfo:348^77*/                            } while (__jsp_taghandler_81.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[120]);
                        /*@lineinfo:translated-code*//*@lineinfo:350^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_85=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_85.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_85.setName("DocumentosForm");
                          __jsp_taghandler_85.setProperty("doc_tipdoc");
                          __jsp_taghandler_85.setValue("V");
                          __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[121]);
                              /*@lineinfo:translated-code*//*@lineinfo:351^29*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_86=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_86.setParent(__jsp_taghandler_85);
                                __jsp_taghandler_86.setKey("Documentos.codfunorigen");
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
                              out.write(__jsp_StaticText.text[122]);
                              /*@lineinfo:translated-code*//*@lineinfo:352^28*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_87=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_87.setParent(__jsp_taghandler_85);
                                __jsp_taghandler_87.setMaxlength("40");
                                __jsp_taghandler_87.setName("DocumentosForm");
                                __jsp_taghandler_87.setProperty("doc_funorinombre");
                                __jsp_taghandler_87.setReadonly(true);
                                __jsp_taghandler_87.setSize("40");
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
                              out.write(__jsp_StaticText.text[123]);
                              /*@lineinfo:translated-code*//*@lineinfo:353^12*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_88=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_88.setParent(__jsp_taghandler_85);
                                __jsp_taghandler_88.setName("DocumentosForm");
                                __jsp_taghandler_88.setProperty("doc_codfunorigen");
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
                              out.write(__jsp_StaticText.text[124]);
                            /*@lineinfo:translated-code*//*@lineinfo:353^77*/                            } while (__jsp_taghandler_85.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[125]);
                        /*@lineinfo:translated-code*//*@lineinfo:355^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_89=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_89.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_89.setName("DocumentosForm");
                          __jsp_taghandler_89.setProperty("doc_tipdoc");
                          __jsp_taghandler_89.setValue("D");
                          __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[126]);
                              /*@lineinfo:translated-code*//*@lineinfo:356^30*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_90=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_90.setParent(__jsp_taghandler_89);
                                __jsp_taghandler_90.setKey("Documentos.codfunorigen");
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
                              out.write(__jsp_StaticText.text[127]);
                              /*@lineinfo:translated-code*//*@lineinfo:358^15*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_91=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_91.setParent(__jsp_taghandler_89);
                                __jsp_taghandler_91.setDisabled(false);
                                __jsp_taghandler_91.setName("DocumentosForm");
                                __jsp_taghandler_91.setProperty("doc_codfunorigen");
                                __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_91,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[128]);
                                    /*@lineinfo:translated-code*//*@lineinfo:359^15*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_92=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_92.setParent(__jsp_taghandler_91);
                                      __jsp_taghandler_92.setCollection("FuncionariosLista2");
                                      __jsp_taghandler_92.setLabelProperty("descripcion");
                                      __jsp_taghandler_92.setProperty("codigo");
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
                                    out.write(__jsp_StaticText.text[129]);
                                  /*@lineinfo:translated-code*//*@lineinfo:359^109*/                                  } while (__jsp_taghandler_91.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[130]);
                            /*@lineinfo:translated-code*//*@lineinfo:360^29*/                            } while (__jsp_taghandler_89.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[131]);
                        /*@lineinfo:translated-code*//*@lineinfo:363^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_93=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_93.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_93.setName("DocumentosForm");
                          __jsp_taghandler_93.setProperty("doc_tipdoc");
                          __jsp_taghandler_93.setValue("T");
                          __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[132]);
                              /*@lineinfo:translated-code*//*@lineinfo:364^30*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_94=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_94.setParent(__jsp_taghandler_93);
                                __jsp_taghandler_94.setKey("Documentos.codfunorigen");
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
                              out.write(__jsp_StaticText.text[133]);
                              /*@lineinfo:translated-code*//*@lineinfo:366^15*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_95=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_95.setParent(__jsp_taghandler_93);
                                __jsp_taghandler_95.setDisabled(false);
                                __jsp_taghandler_95.setName("DocumentosForm");
                                __jsp_taghandler_95.setProperty("doc_codfunorigen");
                                __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_95,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[134]);
                                    /*@lineinfo:translated-code*//*@lineinfo:367^15*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_96=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_96.setParent(__jsp_taghandler_95);
                                      __jsp_taghandler_96.setCollection("FuncionariosLista2");
                                      __jsp_taghandler_96.setLabelProperty("descripcion");
                                      __jsp_taghandler_96.setProperty("codigo");
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
                                    out.write(__jsp_StaticText.text[135]);
                                  /*@lineinfo:translated-code*//*@lineinfo:367^109*/                                  } while (__jsp_taghandler_95.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[136]);
                            /*@lineinfo:translated-code*//*@lineinfo:368^29*/                            } while (__jsp_taghandler_93.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[137]);
                        /*@lineinfo:translated-code*//*@lineinfo:372^7*/                        {
                          org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_97=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                          __jsp_taghandler_97.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_97.setName("DocumentosForm");
                          __jsp_taghandler_97.setProperty("doc_tipdoc");
                          __jsp_taghandler_97.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_97.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[138]);
                              /*@lineinfo:translated-code*//*@lineinfo:374^27*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_98=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_98.setParent(__jsp_taghandler_97);
                                __jsp_taghandler_98.setKey("Documentos.codfundestino");
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
                              out.write(__jsp_StaticText.text[139]);
                              /*@lineinfo:translated-code*//*@lineinfo:376^12*/                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_99=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_99.setParent(__jsp_taghandler_97);
                                __jsp_taghandler_99.setName("DocumentosForm");
                                __jsp_taghandler_99.setProperty("doc_tipdoc");
                                __jsp_taghandler_99.setValue("D");
                                __jsp_tag_starteval=__jsp_taghandler_99.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[140]);
                                    /*@lineinfo:translated-code*//*@lineinfo:377^15*/                                    {
                                      org.apache.struts.taglib.html.TextTag __jsp_taghandler_100=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                      __jsp_taghandler_100.setParent(__jsp_taghandler_99);
                                      __jsp_taghandler_100.setMaxlength("40");
                                      __jsp_taghandler_100.setName("DocumentosForm");
                                      __jsp_taghandler_100.setProperty("doc_fundesnombre");
                                      __jsp_taghandler_100.setReadonly(true);
                                      __jsp_taghandler_100.setSize("40");
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
                                    out.write(__jsp_StaticText.text[141]);
                                    /*@lineinfo:translated-code*//*@lineinfo:378^15*/                                    {
                                      org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_101=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                      __jsp_taghandler_101.setParent(__jsp_taghandler_99);
                                      __jsp_taghandler_101.setName("DocumentosForm");
                                      __jsp_taghandler_101.setProperty("doc_codfundestino");
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
                                    out.write(__jsp_StaticText.text[142]);
                                  /*@lineinfo:translated-code*//*@lineinfo:378^81*/                                  } while (__jsp_taghandler_99.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_99.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_99);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[143]);
                              /*@lineinfo:translated-code*//*@lineinfo:380^12*/                              {
                                org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_102=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                                __jsp_taghandler_102.setParent(__jsp_taghandler_97);
                                __jsp_taghandler_102.setName("DocumentosForm");
                                __jsp_taghandler_102.setProperty("doc_tipdoc");
                                __jsp_taghandler_102.setValue("D");
                                __jsp_tag_starteval=__jsp_taghandler_102.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[144]);
                                    /*@lineinfo:translated-code*//*@lineinfo:381^14*/                                    {
                                      org.apache.struts.taglib.html.SelectTag __jsp_taghandler_103=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                      __jsp_taghandler_103.setParent(__jsp_taghandler_102);
                                      __jsp_taghandler_103.setDisabled(false);
                                      __jsp_taghandler_103.setName("DocumentosForm");
                                      __jsp_taghandler_103.setProperty("doc_codfundestino");
                                      __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                      {
                                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_103,__jsp_tag_starteval,out);
                                        do {
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[145]);
                                          /*@lineinfo:translated-code*//*@lineinfo:382^14*/                                          {
                                            org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_104=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                            __jsp_taghandler_104.setParent(__jsp_taghandler_103);
                                            __jsp_taghandler_104.setCollection("FuncionariosLista");
                                            __jsp_taghandler_104.setLabelProperty("descripcion");
                                            __jsp_taghandler_104.setProperty("codigo");
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
                                          out.write(__jsp_StaticText.text[146]);
                                        /*@lineinfo:translated-code*//*@lineinfo:382^107*/                                        } while (__jsp_taghandler_103.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                      }
                                      if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103);
                                    }
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[147]);
                                  /*@lineinfo:translated-code*//*@lineinfo:383^28*/                                  } while (__jsp_taghandler_102.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_102.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_102);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[148]);
                            /*@lineinfo:translated-code*//*@lineinfo:384^29*/                            } while (__jsp_taghandler_97.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_97.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_97);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[149]);
                        /*@lineinfo:translated-code*//*@lineinfo:389^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_105=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_105.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_105.setKey("Documentos.observacion");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[150]);
                        /*@lineinfo:translated-code*//*@lineinfo:390^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_106=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_106.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_106.setMaxlength("100");
                          __jsp_taghandler_106.setName("DocumentosForm");
                          __jsp_taghandler_106.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_106.setProperty("doc_observacion");
                          __jsp_taghandler_106.setSize("40");
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
                        out.write(__jsp_StaticText.text[151]);
                        /*@lineinfo:translated-code*//*@lineinfo:393^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_107=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_107.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_107.setOnclick("operacion.value=3;opcion.value=2;salir.value=0");
                          __jsp_taghandler_107.setProperty("boton");
                          __jsp_taghandler_107.setStyleClass("boton1");
                          __jsp_taghandler_107.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[152]);
                        /*@lineinfo:translated-code*//*@lineinfo:394^27*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_108=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_108.setParent(__jsp_taghandler_63);
                          __jsp_taghandler_108.setOnclick("operacion.value=2;opcion.value=2;salir.value=1");
                          __jsp_taghandler_108.setProperty("boton");
                          __jsp_taghandler_108.setStyleClass("boton1");
                          __jsp_taghandler_108.setValue("Salir");
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
                        out.write(__jsp_StaticText.text[153]);
                      /*@lineinfo:translated-code*//*@lineinfo:394^150*/                      } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[154]);
                  /*@lineinfo:translated-code*//*@lineinfo:397^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_109=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_109.setParent(__jsp_taghandler_62);
                    __jsp_taghandler_109.setName("DocumentosForm");
                    __jsp_taghandler_109.setProperty("opcion");
                    __jsp_taghandler_109.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_109.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[155]);
                        /*@lineinfo:translated-code*//*@lineinfo:400^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_110=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_110.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_110.setName("DocumentosForm");
                          __jsp_taghandler_110.setProperty("doc_codreg");
                          __jsp_tag_starteval=__jsp_taghandler_110.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_110,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_110.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_110.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_110);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[156]);
                        /*@lineinfo:translated-code*//*@lineinfo:401^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_111=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_111.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_111.setName("DocumentosForm");
                          __jsp_taghandler_111.setProperty("doc_codfin");
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
                        out.write(__jsp_StaticText.text[157]);
                        /*@lineinfo:translated-code*//*@lineinfo:402^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_112=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_112.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_112.setName("DocumentosForm");
                          __jsp_taghandler_112.setProperty("doc_tipdoc");
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
                        out.write(__jsp_StaticText.text[158]);
                        /*@lineinfo:translated-code*//*@lineinfo:403^10*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_113=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_113.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_113.setKey("Documentos.numero");
                          __jsp_tag_starteval=__jsp_taghandler_113.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_113.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_113.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_113);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[159]);
                        /*@lineinfo:translated-code*//*@lineinfo:404^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_114=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_114.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_114.setMaxlength("4");
                          __jsp_taghandler_114.setName("DocumentosForm");
                          __jsp_taghandler_114.setProperty("doc_numero");
                          __jsp_taghandler_114.setReadonly(true);
                          __jsp_taghandler_114.setSize("4");
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
                        out.write(__jsp_StaticText.text[160]);
                        /*@lineinfo:translated-code*//*@lineinfo:407^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_115=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_115.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_115.setKey("Documentos.fecha");
                          __jsp_tag_starteval=__jsp_taghandler_115.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_115.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_115.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_115);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[161]);
                        /*@lineinfo:translated-code*//*@lineinfo:408^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_116=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_116.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_116.setMaxlength("10");
                          __jsp_taghandler_116.setName("DocumentosForm");
                          __jsp_taghandler_116.setProperty("doc_fecha");
                          __jsp_taghandler_116.setSize("10");
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
                        out.write(__jsp_StaticText.text[162]);
                        /*@lineinfo:translated-code*//*@lineinfo:411^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_117=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_117.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_117.setKey("Documentos.codfunorigen");
                          __jsp_tag_starteval=__jsp_taghandler_117.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_117.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_117.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_117);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[163]);
                        /*@lineinfo:translated-code*//*@lineinfo:413^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_118=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_118.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_118.setName("DocumentosForm");
                          __jsp_taghandler_118.setProperty("doc_tipdoc");
                          __jsp_taghandler_118.setValue("E");
                          __jsp_tag_starteval=__jsp_taghandler_118.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[164]);
                              /*@lineinfo:translated-code*//*@lineinfo:414^13*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_119=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_119.setParent(__jsp_taghandler_118);
                                __jsp_taghandler_119.setMaxlength("40");
                                __jsp_taghandler_119.setName("DocumentosForm");
                                __jsp_taghandler_119.setProperty("doc_funorinombre");
                                __jsp_taghandler_119.setReadonly(true);
                                __jsp_taghandler_119.setSize("40");
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
                              out.write(__jsp_StaticText.text[165]);
                              /*@lineinfo:translated-code*//*@lineinfo:415^13*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_120=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_120.setParent(__jsp_taghandler_118);
                                __jsp_taghandler_120.setName("DocumentosForm");
                                __jsp_taghandler_120.setProperty("doc_codfunorigen");
                                __jsp_tag_starteval=__jsp_taghandler_120.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_120,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_120.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_120.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_120);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[166]);
                            /*@lineinfo:translated-code*//*@lineinfo:415^78*/                            } while (__jsp_taghandler_118.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_118.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_118);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[167]);
                        /*@lineinfo:translated-code*//*@lineinfo:417^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_121=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_121.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_121.setName("DocumentosForm");
                          __jsp_taghandler_121.setProperty("doc_tipdoc");
                          __jsp_taghandler_121.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_121.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[168]);
                              /*@lineinfo:translated-code*//*@lineinfo:418^13*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_122=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_122.setParent(__jsp_taghandler_121);
                                __jsp_taghandler_122.setMaxlength("40");
                                __jsp_taghandler_122.setName("DocumentosForm");
                                __jsp_taghandler_122.setProperty("doc_funorinombre");
                                __jsp_taghandler_122.setReadonly(true);
                                __jsp_taghandler_122.setSize("40");
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
                              out.write(__jsp_StaticText.text[169]);
                              /*@lineinfo:translated-code*//*@lineinfo:419^13*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_123=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_123.setParent(__jsp_taghandler_121);
                                __jsp_taghandler_123.setName("DocumentosForm");
                                __jsp_taghandler_123.setProperty("doc_codfunorigen");
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
                              out.write(__jsp_StaticText.text[170]);
                            /*@lineinfo:translated-code*//*@lineinfo:419^78*/                            } while (__jsp_taghandler_121.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_121.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_121);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[171]);
                        /*@lineinfo:translated-code*//*@lineinfo:421^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_124=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_124.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_124.setName("DocumentosForm");
                          __jsp_taghandler_124.setProperty("doc_tipdoc");
                          __jsp_taghandler_124.setValue("D");
                          __jsp_tag_starteval=__jsp_taghandler_124.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[172]);
                              /*@lineinfo:translated-code*//*@lineinfo:422^13*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_125=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_125.setParent(__jsp_taghandler_124);
                                __jsp_taghandler_125.setDisabled(false);
                                __jsp_taghandler_125.setName("DocumentosForm");
                                __jsp_taghandler_125.setProperty("doc_codfunorigen");
                                __jsp_tag_starteval=__jsp_taghandler_125.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_125,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[173]);
                                    /*@lineinfo:translated-code*//*@lineinfo:423^13*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_126=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_126.setParent(__jsp_taghandler_125);
                                      __jsp_taghandler_126.setCollection("FuncionariosLista2");
                                      __jsp_taghandler_126.setLabelProperty("descripcion");
                                      __jsp_taghandler_126.setProperty("codigo");
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
                                    out.write(__jsp_StaticText.text[174]);
                                  /*@lineinfo:translated-code*//*@lineinfo:423^107*/                                  } while (__jsp_taghandler_125.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_125.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_125);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[175]);
                            /*@lineinfo:translated-code*//*@lineinfo:424^27*/                            } while (__jsp_taghandler_124.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_124.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_124);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[176]);
                        /*@lineinfo:translated-code*//*@lineinfo:426^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_127=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_127.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_127.setName("DocumentosForm");
                          __jsp_taghandler_127.setProperty("doc_tipdoc");
                          __jsp_taghandler_127.setValue("T");
                          __jsp_tag_starteval=__jsp_taghandler_127.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[177]);
                              /*@lineinfo:translated-code*//*@lineinfo:427^13*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_128=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_128.setParent(__jsp_taghandler_127);
                                __jsp_taghandler_128.setDisabled(false);
                                __jsp_taghandler_128.setName("DocumentosForm");
                                __jsp_taghandler_128.setProperty("doc_codfunorigen");
                                __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_128,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[178]);
                                    /*@lineinfo:translated-code*//*@lineinfo:428^13*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_129=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_129.setParent(__jsp_taghandler_128);
                                      __jsp_taghandler_129.setCollection("FuncionariosLista2");
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
                                    out.write(__jsp_StaticText.text[179]);
                                  /*@lineinfo:translated-code*//*@lineinfo:428^107*/                                  } while (__jsp_taghandler_128.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[180]);
                            /*@lineinfo:translated-code*//*@lineinfo:429^27*/                            } while (__jsp_taghandler_127.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_127.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_127);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[181]);
                        /*@lineinfo:translated-code*//*@lineinfo:431^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_130=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_130.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_130.setName("DocumentosForm");
                          __jsp_taghandler_130.setProperty("doc_tipdoc");
                          __jsp_taghandler_130.setValue("U");
                          __jsp_tag_starteval=__jsp_taghandler_130.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[182]);
                              /*@lineinfo:translated-code*//*@lineinfo:432^13*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_131=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_131.setParent(__jsp_taghandler_130);
                                __jsp_taghandler_131.setMaxlength("40");
                                __jsp_taghandler_131.setName("DocumentosForm");
                                __jsp_taghandler_131.setProperty("doc_funorinombre");
                                __jsp_taghandler_131.setReadonly(true);
                                __jsp_taghandler_131.setSize("40");
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
                              out.write(__jsp_StaticText.text[183]);
                              /*@lineinfo:translated-code*//*@lineinfo:433^13*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_132=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_132.setParent(__jsp_taghandler_130);
                                __jsp_taghandler_132.setName("DocumentosForm");
                                __jsp_taghandler_132.setProperty("doc_codfunorigen");
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
                              out.write(__jsp_StaticText.text[184]);
                            /*@lineinfo:translated-code*//*@lineinfo:433^78*/                            } while (__jsp_taghandler_130.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_130.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_130);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[185]);
                        /*@lineinfo:translated-code*//*@lineinfo:435^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_133=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_133.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_133.setName("DocumentosForm");
                          __jsp_taghandler_133.setProperty("doc_tipdoc");
                          __jsp_taghandler_133.setValue("V");
                          __jsp_tag_starteval=__jsp_taghandler_133.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[186]);
                              /*@lineinfo:translated-code*//*@lineinfo:436^13*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_134=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_134.setParent(__jsp_taghandler_133);
                                __jsp_taghandler_134.setMaxlength("40");
                                __jsp_taghandler_134.setName("DocumentosForm");
                                __jsp_taghandler_134.setProperty("doc_funorinombre");
                                __jsp_taghandler_134.setReadonly(true);
                                __jsp_taghandler_134.setSize("40");
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
                              out.write(__jsp_StaticText.text[187]);
                              /*@lineinfo:translated-code*//*@lineinfo:437^13*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_135=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_135.setParent(__jsp_taghandler_133);
                                __jsp_taghandler_135.setName("DocumentosForm");
                                __jsp_taghandler_135.setProperty("doc_codfunorigen");
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
                              out.write(__jsp_StaticText.text[188]);
                            /*@lineinfo:translated-code*//*@lineinfo:437^78*/                            } while (__jsp_taghandler_133.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_133.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_133);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[189]);
                        /*@lineinfo:translated-code*//*@lineinfo:441^7*/                        {
                          org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_136=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                          __jsp_taghandler_136.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_136.setName("DocumentosForm");
                          __jsp_taghandler_136.setProperty("doc_tipdoc");
                          __jsp_taghandler_136.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_136.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[190]);
                              /*@lineinfo:translated-code*//*@lineinfo:443^27*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_137=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_137.setParent(__jsp_taghandler_136);
                                __jsp_taghandler_137.setKey("Documentos.codfundestino");
                                __jsp_tag_starteval=__jsp_taghandler_137.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_137.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_137.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_137);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[191]);
                              /*@lineinfo:translated-code*//*@lineinfo:445^12*/                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_138=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_138.setParent(__jsp_taghandler_136);
                                __jsp_taghandler_138.setName("DocumentosForm");
                                __jsp_taghandler_138.setProperty("doc_tipdoc");
                                __jsp_taghandler_138.setValue("D");
                                __jsp_tag_starteval=__jsp_taghandler_138.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[192]);
                                    /*@lineinfo:translated-code*//*@lineinfo:446^14*/                                    {
                                      org.apache.struts.taglib.html.TextTag __jsp_taghandler_139=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                      __jsp_taghandler_139.setParent(__jsp_taghandler_138);
                                      __jsp_taghandler_139.setMaxlength("40");
                                      __jsp_taghandler_139.setName("DocumentosForm");
                                      __jsp_taghandler_139.setProperty("doc_fundesnombre");
                                      __jsp_taghandler_139.setReadonly(true);
                                      __jsp_taghandler_139.setSize("40");
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
                                    out.write(__jsp_StaticText.text[193]);
                                    /*@lineinfo:translated-code*//*@lineinfo:447^14*/                                    {
                                      org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_140=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                      __jsp_taghandler_140.setParent(__jsp_taghandler_138);
                                      __jsp_taghandler_140.setName("DocumentosForm");
                                      __jsp_taghandler_140.setProperty("doc_codfundestino");
                                      __jsp_tag_starteval=__jsp_taghandler_140.doStartTag();
                                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                      {
                                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_140,__jsp_tag_starteval,out);
                                        do {
                                        } while (__jsp_taghandler_140.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                      }
                                      if (__jsp_taghandler_140.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_140);
                                    }
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[194]);
                                  /*@lineinfo:translated-code*//*@lineinfo:447^80*/                                  } while (__jsp_taghandler_138.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_138.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_138);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[195]);
                              /*@lineinfo:translated-code*//*@lineinfo:449^12*/                              {
                                org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_141=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                                __jsp_taghandler_141.setParent(__jsp_taghandler_136);
                                __jsp_taghandler_141.setName("DocumentosForm");
                                __jsp_taghandler_141.setProperty("doc_tipdoc");
                                __jsp_taghandler_141.setValue("D");
                                __jsp_tag_starteval=__jsp_taghandler_141.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[196]);
                                    /*@lineinfo:translated-code*//*@lineinfo:450^15*/                                    {
                                      org.apache.struts.taglib.html.SelectTag __jsp_taghandler_142=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                      __jsp_taghandler_142.setParent(__jsp_taghandler_141);
                                      __jsp_taghandler_142.setDisabled(false);
                                      __jsp_taghandler_142.setName("DocumentosForm");
                                      __jsp_taghandler_142.setProperty("doc_codfundestino");
                                      __jsp_tag_starteval=__jsp_taghandler_142.doStartTag();
                                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                      {
                                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_142,__jsp_tag_starteval,out);
                                        do {
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[197]);
                                          /*@lineinfo:translated-code*//*@lineinfo:451^15*/                                          {
                                            org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_143=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                            __jsp_taghandler_143.setParent(__jsp_taghandler_142);
                                            __jsp_taghandler_143.setCollection("FuncionariosLista");
                                            __jsp_taghandler_143.setLabelProperty("descripcion");
                                            __jsp_taghandler_143.setProperty("codigo");
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
                                          out.write(__jsp_StaticText.text[198]);
                                        /*@lineinfo:translated-code*//*@lineinfo:451^108*/                                        } while (__jsp_taghandler_142.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                      }
                                      if (__jsp_taghandler_142.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_142);
                                    }
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[199]);
                                  /*@lineinfo:translated-code*//*@lineinfo:452^29*/                                  } while (__jsp_taghandler_141.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_141.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_141);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[200]);
                            /*@lineinfo:translated-code*//*@lineinfo:453^29*/                            } while (__jsp_taghandler_136.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_136.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_136);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[201]);
                        /*@lineinfo:translated-code*//*@lineinfo:458^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_144=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_144.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_144.setKey("Documentos.observacion");
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
                        out.write(__jsp_StaticText.text[202]);
                        /*@lineinfo:translated-code*//*@lineinfo:459^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_145=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_145.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_145.setMaxlength("100");
                          __jsp_taghandler_145.setName("DocumentosForm");
                          __jsp_taghandler_145.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_145.setProperty("doc_observacion");
                          __jsp_taghandler_145.setSize("40");
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
                        out.write(__jsp_StaticText.text[203]);
                        /*@lineinfo:translated-code*//*@lineinfo:461^7*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_146=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_146.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_146.setName("DocumentosForm");
                          __jsp_taghandler_146.setProperty("doc_tipdoc");
                          __jsp_taghandler_146.setValue("E");
                          __jsp_tag_starteval=__jsp_taghandler_146.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[204]);
                              /*@lineinfo:translated-code*//*@lineinfo:464^26*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_147=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                                __jsp_taghandler_147.setParent(__jsp_taghandler_146);
                                __jsp_taghandler_147.setMaxlength("10");
                                __jsp_taghandler_147.setName("DocumentosForm");
                                __jsp_taghandler_147.setProperty("doc_devolucion");
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
                              out.write(__jsp_StaticText.text[205]);
                            /*@lineinfo:translated-code*//*@lineinfo:464^112*/                            } while (__jsp_taghandler_146.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_146.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_146);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[206]);
                        /*@lineinfo:translated-code*//*@lineinfo:469^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_148=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_148.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_148.setName("DocumentosForm");
                          __jsp_taghandler_148.setProperty("doc_tipdoc");
                          __jsp_taghandler_148.setValue("T");
                          __jsp_tag_starteval=__jsp_taghandler_148.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[207]);
                              /*@lineinfo:translated-code*//*@lineinfo:470^13*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_149=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                                __jsp_taghandler_149.setParent(__jsp_taghandler_148);
                                __jsp_taghandler_149.setOnclick("operacion.value=3;opcion.value=10;salir.value=0");
                                __jsp_taghandler_149.setProperty("boton");
                                __jsp_taghandler_149.setStyleClass("boton1");
                                __jsp_taghandler_149.setValue("Insertar Total");
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
                              out.write(__jsp_StaticText.text[208]);
                            /*@lineinfo:translated-code*//*@lineinfo:470^146*/                            } while (__jsp_taghandler_148.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_148.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_148);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[209]);
                        /*@lineinfo:translated-code*//*@lineinfo:472^10*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_150=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_150.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_150.setName("DocumentosForm");
                          __jsp_taghandler_150.setProperty("doc_tipdoc");
                          __jsp_taghandler_150.setValue("D");
                          __jsp_tag_starteval=__jsp_taghandler_150.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[210]);
                              /*@lineinfo:translated-code*//*@lineinfo:473^13*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_151=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                                __jsp_taghandler_151.setParent(__jsp_taghandler_150);
                                __jsp_taghandler_151.setOnclick("operacion.value=3;opcion.value=11;salir.value=0");
                                __jsp_taghandler_151.setProperty("boton");
                                __jsp_taghandler_151.setStyleClass("boton1");
                                __jsp_taghandler_151.setValue("Insertar Total");
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
                              out.write(__jsp_StaticText.text[211]);
                            /*@lineinfo:translated-code*//*@lineinfo:473^146*/                            } while (__jsp_taghandler_150.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_150.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_150);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[212]);
                        /*@lineinfo:translated-code*//*@lineinfo:475^10*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_152=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_152.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_152.setOnclick("operacion.value=3;opcion.value=1;salir.value=0");
                          __jsp_taghandler_152.setProperty("boton");
                          __jsp_taghandler_152.setStyleClass("boton1");
                          __jsp_taghandler_152.setValue("Insertar");
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
                        out.write(__jsp_StaticText.text[213]);
                        /*@lineinfo:translated-code*//*@lineinfo:476^27*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_153=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_153.setParent(__jsp_taghandler_109);
                          __jsp_taghandler_153.setOnclick("operacion.value=2;opcion.value=1;salir.value=1");
                          __jsp_taghandler_153.setProperty("boton");
                          __jsp_taghandler_153.setStyleClass("boton1");
                          __jsp_taghandler_153.setValue("Salir");
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
                        out.write(__jsp_StaticText.text[214]);
                      /*@lineinfo:translated-code*//*@lineinfo:476^150*/                      } while (__jsp_taghandler_109.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_109.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_109);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[215]);
                /*@lineinfo:translated-code*//*@lineinfo:478^18*/                } while (__jsp_taghandler_62.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[216]);
            /*@lineinfo:translated-code*//*@lineinfo:480^4*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_154=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_154.setParent(__jsp_taghandler_7);
              __jsp_taghandler_154.setName("DocumentosForm");
              __jsp_taghandler_154.setProperty("operacion");
              __jsp_taghandler_154.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_154.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[217]);
                  /*@lineinfo:translated-code*//*@lineinfo:481^5*/                  {
                    org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_155=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                    __jsp_taghandler_155.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_155.setName("DocumentosForm");
                    __jsp_taghandler_155.setProperty("opcion");
                    __jsp_taghandler_155.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_155.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[218]);
                        /*@lineinfo:translated-code*//*@lineinfo:484^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_156=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_156.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_156.setName("DocumentosForm");
                          __jsp_taghandler_156.setProperty("inicio");
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
                        out.write(__jsp_StaticText.text[219]);
                        /*@lineinfo:translated-code*//*@lineinfo:485^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_157=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_157.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_157.setName("DocumentosForm");
                          __jsp_taghandler_157.setProperty("fin");
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
                        out.write(__jsp_StaticText.text[220]);
                        /*@lineinfo:translated-code*//*@lineinfo:486^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_158=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_158.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_158.setName("DocumentosForm");
                          __jsp_taghandler_158.setProperty("doc_codreg");
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
                        out.write(__jsp_StaticText.text[221]);
                        /*@lineinfo:translated-code*//*@lineinfo:487^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_159=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_159.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_159.setName("DocumentosForm");
                          __jsp_taghandler_159.setProperty("doc_codfin");
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
                        out.write(__jsp_StaticText.text[222]);
                        /*@lineinfo:translated-code*//*@lineinfo:488^10*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_160=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_160.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_160.setName("DocumentosForm");
                          __jsp_taghandler_160.setProperty("doc_tipdoc");
                          __jsp_tag_starteval=__jsp_taghandler_160.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_160,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_160.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_160.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_160);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[223]);
                        /*@lineinfo:translated-code*//*@lineinfo:489^10*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_161=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_161.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_161.setKey("Documentos.numero");
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
                        out.write(__jsp_StaticText.text[224]);
                        /*@lineinfo:translated-code*//*@lineinfo:490^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_162=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_162.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_162.setMaxlength("4");
                          __jsp_taghandler_162.setName("DocumentosForm");
                          __jsp_taghandler_162.setProperty("doc_numero");
                          __jsp_taghandler_162.setReadonly(true);
                          __jsp_taghandler_162.setSize("4");
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
                        out.write(__jsp_StaticText.text[225]);
                        /*@lineinfo:translated-code*//*@lineinfo:493^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_163=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_163.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_163.setKey("Documentos.fecha");
                          __jsp_tag_starteval=__jsp_taghandler_163.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_163.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_163.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_163);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[226]);
                        /*@lineinfo:translated-code*//*@lineinfo:494^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_164=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_164.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_164.setMaxlength("10");
                          __jsp_taghandler_164.setName("DocumentosForm");
                          __jsp_taghandler_164.setProperty("doc_fecha");
                          __jsp_taghandler_164.setReadonly(true);
                          __jsp_taghandler_164.setSize("10");
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
                        out.write(__jsp_StaticText.text[227]);
                        /*@lineinfo:translated-code*//*@lineinfo:497^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_165=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_165.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_165.setKey("Documentos.codfunorigen");
                          __jsp_tag_starteval=__jsp_taghandler_165.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_165.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_165.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_165);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[228]);
                        /*@lineinfo:translated-code*//*@lineinfo:498^28*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_166=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_166.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_166.setMaxlength("40");
                          __jsp_taghandler_166.setName("DocumentosForm");
                          __jsp_taghandler_166.setProperty("doc_funorinombre");
                          __jsp_taghandler_166.setReadonly(true);
                          __jsp_taghandler_166.setSize("40");
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
                        out.write(__jsp_StaticText.text[229]);
                        /*@lineinfo:translated-code*//*@lineinfo:499^15*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_167=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_167.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_167.setName("DocumentosForm");
                          __jsp_taghandler_167.setProperty("doc_codfunorigen");
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
                        out.write(__jsp_StaticText.text[230]);
                        /*@lineinfo:translated-code*//*@lineinfo:501^7*/                        {
                          org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_168=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                          __jsp_taghandler_168.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_168.setName("DocumentosForm");
                          __jsp_taghandler_168.setProperty("doc_tipdoc");
                          __jsp_taghandler_168.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_168.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[231]);
                              /*@lineinfo:translated-code*//*@lineinfo:503^27*/                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_169=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_169.setParent(__jsp_taghandler_168);
                                __jsp_taghandler_169.setKey("Documentos.codfundestino");
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
                              out.write(__jsp_StaticText.text[232]);
                              /*@lineinfo:translated-code*//*@lineinfo:505^12*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_170=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                                __jsp_taghandler_170.setParent(__jsp_taghandler_168);
                                __jsp_taghandler_170.setMaxlength("40");
                                __jsp_taghandler_170.setName("DocumentosForm");
                                __jsp_taghandler_170.setProperty("doc_fundesnombre");
                                __jsp_taghandler_170.setReadonly(true);
                                __jsp_taghandler_170.setSize("40");
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
                              out.write(__jsp_StaticText.text[233]);
                              /*@lineinfo:translated-code*//*@lineinfo:506^12*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_171=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_171.setParent(__jsp_taghandler_168);
                                __jsp_taghandler_171.setName("DocumentosForm");
                                __jsp_taghandler_171.setProperty("doc_codfundestino");
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
                              out.write(__jsp_StaticText.text[234]);
                            /*@lineinfo:translated-code*//*@lineinfo:506^78*/                            } while (__jsp_taghandler_168.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_168.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_168);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[235]);
                        /*@lineinfo:translated-code*//*@lineinfo:511^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_172=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_172.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_172.setKey("Documentos.observacion");
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
                        out.write(__jsp_StaticText.text[236]);
                        /*@lineinfo:translated-code*//*@lineinfo:512^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_173=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_173.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_173.setMaxlength("100");
                          __jsp_taghandler_173.setName("DocumentosForm");
                          __jsp_taghandler_173.setProperty("doc_observacion");
                          __jsp_taghandler_173.setReadonly(true);
                          __jsp_taghandler_173.setSize("40");
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
                        out.write(__jsp_StaticText.text[237]);
                        /*@lineinfo:translated-code*//*@lineinfo:516^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_174=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_174.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_174.setName("DocumentosForm");
                          __jsp_taghandler_174.setProperty("doc_tipdoc");
                          __jsp_taghandler_174.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_174.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[238]);
                            /*@lineinfo:translated-code*//*@lineinfo:516^82*/                            } while (__jsp_taghandler_174.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_174.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_174);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[239]);
                        /*@lineinfo:translated-code*//*@lineinfo:519^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_175=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_175.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_175.setName("DocumentosForm");
                          __jsp_taghandler_175.setProperty("doc_tipdoc");
                          __jsp_taghandler_175.setValue("E");
                          __jsp_tag_starteval=__jsp_taghandler_175.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[240]);
                            /*@lineinfo:translated-code*//*@lineinfo:519^82*/                            } while (__jsp_taghandler_175.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_175.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_175);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[241]);
                        /*@lineinfo:translated-code*//*@lineinfo:522^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_176=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_176.setParent(__jsp_taghandler_155);
                          __jsp_taghandler_176.setName("DocumentosForm");
                          __jsp_taghandler_176.setProperty("doc_tipdoc");
                          __jsp_taghandler_176.setValue("T");
                          __jsp_tag_starteval=__jsp_taghandler_176.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[242]);
                            /*@lineinfo:translated-code*//*@lineinfo:522^82*/                            } while (__jsp_taghandler_176.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_176.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_176);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[243]);
                      /*@lineinfo:translated-code*//*@lineinfo:524^26*/                      } while (__jsp_taghandler_155.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_155.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_155);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[244]);
                  /*@lineinfo:translated-code*//*@lineinfo:527^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_177=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_177.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_177.setName("DocumentosForm");
                    __jsp_taghandler_177.setProperty("opcion");
                    __jsp_taghandler_177.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_177.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[245]);
                        /*@lineinfo:translated-code*//*@lineinfo:529^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_178=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_178.setParent(__jsp_taghandler_177);
                          __jsp_taghandler_178.setName("DocumentosForm");
                          __jsp_taghandler_178.setProperty("ddo_item");
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
                        out.write(__jsp_StaticText.text[246]);
                        /*@lineinfo:translated-code*//*@lineinfo:530^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_179=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_179.setParent(__jsp_taghandler_177);
                          __jsp_taghandler_179.setMaxlength("9");
                          __jsp_taghandler_179.setName("DocumentosForm");
                          __jsp_taghandler_179.setProperty("ddo_codrubactual");
                          __jsp_taghandler_179.setSize("10");
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
                        out.write(__jsp_StaticText.text[247]);
                        /*@lineinfo:translated-code*//*@lineinfo:531^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_180=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag name property readonly size");
                          __jsp_taghandler_180.setParent(__jsp_taghandler_177);
                          __jsp_taghandler_180.setName("DocumentosForm");
                          __jsp_taghandler_180.setProperty("desactivo");
                          __jsp_taghandler_180.setReadonly(true);
                          __jsp_taghandler_180.setSize("80");
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
                        out.write(__jsp_StaticText.text[248]);
                        /*@lineinfo:translated-code*//*@lineinfo:532^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_181=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_181.setParent(__jsp_taghandler_177);
                          __jsp_taghandler_181.setName("DocumentosForm");
                          __jsp_taghandler_181.setProperty("doc_tipdoc");
                          __jsp_taghandler_181.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_181.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[249]);
                              /*@lineinfo:translated-code*//*@lineinfo:533^31*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_182=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_182.setParent(__jsp_taghandler_181);
                                __jsp_taghandler_182.setDisabled(false);
                                __jsp_taghandler_182.setName("DocumentosForm");
                                __jsp_taghandler_182.setProperty("ddo_codmot");
                                __jsp_tag_starteval=__jsp_taghandler_182.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_182,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[250]);
                                    /*@lineinfo:translated-code*//*@lineinfo:534^15*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_183=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_183.setParent(__jsp_taghandler_182);
                                      __jsp_taghandler_183.setCollection("TiposBajaLista");
                                      __jsp_taghandler_183.setLabelProperty("descripcion");
                                      __jsp_taghandler_183.setProperty("codigo");
                                      __jsp_tag_starteval=__jsp_taghandler_183.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                        } while (__jsp_taghandler_183.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_183.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_183);
                                    }
                                  } while (__jsp_taghandler_182.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_182.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_182);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[251]);
                            /*@lineinfo:translated-code*//*@lineinfo:534^119*/                            } while (__jsp_taghandler_181.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_181.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_181);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[252]);
                        /*@lineinfo:translated-code*//*@lineinfo:536^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_184=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_184.setParent(__jsp_taghandler_177);
                          __jsp_taghandler_184.setName("DocumentosForm");
                          __jsp_taghandler_184.setProperty("doc_tipdoc");
                          __jsp_taghandler_184.setValue("E");
                          __jsp_tag_starteval=__jsp_taghandler_184.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[253]);
                              /*@lineinfo:translated-code*//*@lineinfo:537^31*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_185=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_185.setParent(__jsp_taghandler_184);
                                __jsp_taghandler_185.setDisabled(false);
                                __jsp_taghandler_185.setName("DocumentosForm");
                                __jsp_taghandler_185.setProperty("ddo_codofiactual");
                                __jsp_tag_starteval=__jsp_taghandler_185.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_185,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[254]);
                                    /*@lineinfo:translated-code*//*@lineinfo:538^15*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_186=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_186.setParent(__jsp_taghandler_185);
                                      __jsp_taghandler_186.setCollection("OficinasLista");
                                      __jsp_taghandler_186.setLabelProperty("descripcion");
                                      __jsp_taghandler_186.setProperty("codigo");
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
                                  } while (__jsp_taghandler_185.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_185.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_185);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[255]);
                            /*@lineinfo:translated-code*//*@lineinfo:538^118*/                            } while (__jsp_taghandler_184.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_184.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_184);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[256]);
                        /*@lineinfo:translated-code*//*@lineinfo:540^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_187=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_187.setParent(__jsp_taghandler_177);
                          __jsp_taghandler_187.setName("DocumentosForm");
                          __jsp_taghandler_187.setProperty("doc_tipdoc");
                          __jsp_taghandler_187.setValue("T");
                          __jsp_tag_starteval=__jsp_taghandler_187.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[257]);
                              /*@lineinfo:translated-code*//*@lineinfo:541^31*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_188=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_188.setParent(__jsp_taghandler_187);
                                __jsp_taghandler_188.setDisabled(false);
                                __jsp_taghandler_188.setName("DocumentosForm");
                                __jsp_taghandler_188.setProperty("ddo_codofiactual");
                                __jsp_tag_starteval=__jsp_taghandler_188.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_188,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[258]);
                                    /*@lineinfo:translated-code*//*@lineinfo:542^15*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_189=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_189.setParent(__jsp_taghandler_188);
                                      __jsp_taghandler_189.setCollection("OficinasLista");
                                      __jsp_taghandler_189.setLabelProperty("descripcion");
                                      __jsp_taghandler_189.setProperty("codigo");
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
                                  } while (__jsp_taghandler_188.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_188.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_188);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[259]);
                            /*@lineinfo:translated-code*//*@lineinfo:542^118*/                            } while (__jsp_taghandler_187.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_187.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_187);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[260]);
                      /*@lineinfo:translated-code*//*@lineinfo:543^26*/                      } while (__jsp_taghandler_177.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_177.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_177);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[261]);
                  /*@lineinfo:translated-code*//*@lineinfo:546^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_190=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_190.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_190.setName("DocumentosForm");
                    __jsp_taghandler_190.setProperty("opcion");
                    __jsp_taghandler_190.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_190.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[262]);
                        /*@lineinfo:translated-code*//*@lineinfo:548^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_191=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_191.setParent(__jsp_taghandler_190);
                          __jsp_taghandler_191.setName("DocumentosForm");
                          __jsp_taghandler_191.setProperty("ddo_item");
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
                        out.write(__jsp_StaticText.text[263]);
                        /*@lineinfo:translated-code*//*@lineinfo:549^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_192=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_192.setParent(__jsp_taghandler_190);
                          __jsp_taghandler_192.setMaxlength("9");
                          __jsp_taghandler_192.setName("DocumentosForm");
                          __jsp_taghandler_192.setProperty("ddo_codrubactual");
                          __jsp_taghandler_192.setSize("10");
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
                        out.write(__jsp_StaticText.text[264]);
                        /*@lineinfo:translated-code*//*@lineinfo:550^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_193=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag name property readonly size");
                          __jsp_taghandler_193.setParent(__jsp_taghandler_190);
                          __jsp_taghandler_193.setName("DocumentosForm");
                          __jsp_taghandler_193.setProperty("desactivo");
                          __jsp_taghandler_193.setReadonly(true);
                          __jsp_taghandler_193.setSize("80");
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
                        out.write(__jsp_StaticText.text[265]);
                        /*@lineinfo:translated-code*//*@lineinfo:551^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_194=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_194.setParent(__jsp_taghandler_190);
                          __jsp_taghandler_194.setName("DocumentosForm");
                          __jsp_taghandler_194.setProperty("doc_tipdoc");
                          __jsp_taghandler_194.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_194.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[266]);
                              /*@lineinfo:translated-code*//*@lineinfo:552^31*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_195=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_195.setParent(__jsp_taghandler_194);
                                __jsp_taghandler_195.setDisabled(false);
                                __jsp_taghandler_195.setName("DocumentosForm");
                                __jsp_taghandler_195.setProperty("ddo_codmot");
                                __jsp_tag_starteval=__jsp_taghandler_195.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_195,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[267]);
                                    /*@lineinfo:translated-code*//*@lineinfo:553^15*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_196=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_196.setParent(__jsp_taghandler_195);
                                      __jsp_taghandler_196.setCollection("TiposBajaLista");
                                      __jsp_taghandler_196.setLabelProperty("descripcion");
                                      __jsp_taghandler_196.setProperty("codigo");
                                      __jsp_tag_starteval=__jsp_taghandler_196.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                        } while (__jsp_taghandler_196.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_196.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_196);
                                    }
                                  } while (__jsp_taghandler_195.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_195.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_195);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[268]);
                            /*@lineinfo:translated-code*//*@lineinfo:553^119*/                            } while (__jsp_taghandler_194.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_194.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_194);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[269]);
                        /*@lineinfo:translated-code*//*@lineinfo:555^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_197=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_197.setParent(__jsp_taghandler_190);
                          __jsp_taghandler_197.setName("DocumentosForm");
                          __jsp_taghandler_197.setProperty("doc_tipdoc");
                          __jsp_taghandler_197.setValue("E");
                          __jsp_tag_starteval=__jsp_taghandler_197.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[270]);
                              /*@lineinfo:translated-code*//*@lineinfo:556^31*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_198=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_198.setParent(__jsp_taghandler_197);
                                __jsp_taghandler_198.setDisabled(false);
                                __jsp_taghandler_198.setName("DocumentosForm");
                                __jsp_taghandler_198.setProperty("ddo_codofiactual");
                                __jsp_tag_starteval=__jsp_taghandler_198.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_198,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[271]);
                                    /*@lineinfo:translated-code*//*@lineinfo:557^15*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_199=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_199.setParent(__jsp_taghandler_198);
                                      __jsp_taghandler_199.setCollection("OficinasLista");
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
                              out.write(__jsp_StaticText.text[272]);
                            /*@lineinfo:translated-code*//*@lineinfo:557^118*/                            } while (__jsp_taghandler_197.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_197.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_197);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[273]);
                        /*@lineinfo:translated-code*//*@lineinfo:559^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_200=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_200.setParent(__jsp_taghandler_190);
                          __jsp_taghandler_200.setName("DocumentosForm");
                          __jsp_taghandler_200.setProperty("doc_tipdoc");
                          __jsp_taghandler_200.setValue("T");
                          __jsp_tag_starteval=__jsp_taghandler_200.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[274]);
                              /*@lineinfo:translated-code*//*@lineinfo:560^31*/                              {
                                org.apache.struts.taglib.html.SelectTag __jsp_taghandler_201=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                                __jsp_taghandler_201.setParent(__jsp_taghandler_200);
                                __jsp_taghandler_201.setDisabled(false);
                                __jsp_taghandler_201.setName("DocumentosForm");
                                __jsp_taghandler_201.setProperty("ddo_codofiactual");
                                __jsp_tag_starteval=__jsp_taghandler_201.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_201,__jsp_tag_starteval,out);
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[275]);
                                    /*@lineinfo:translated-code*//*@lineinfo:561^15*/                                    {
                                      org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_202=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                      __jsp_taghandler_202.setParent(__jsp_taghandler_201);
                                      __jsp_taghandler_202.setCollection("OficinasLista");
                                      __jsp_taghandler_202.setLabelProperty("descripcion");
                                      __jsp_taghandler_202.setProperty("codigo");
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
                                  } while (__jsp_taghandler_201.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_201.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_201);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[276]);
                            /*@lineinfo:translated-code*//*@lineinfo:561^118*/                            } while (__jsp_taghandler_200.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_200.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_200);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[277]);
                      /*@lineinfo:translated-code*//*@lineinfo:562^26*/                      } while (__jsp_taghandler_190.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_190.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_190);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[278]);
                  /*@lineinfo:translated-code*//*@lineinfo:565^7*/                  {
                    org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_203=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                    __jsp_taghandler_203.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_203.setName("DocumentosForm");
                    __jsp_taghandler_203.setProperty("opcion");
                    __jsp_taghandler_203.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_203.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[279]);
                        /*@lineinfo:translated-code*//*@lineinfo:566^7*/                        {
                          org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_204=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
                          __jsp_taghandler_204.setParent(__jsp_taghandler_203);
                          __jsp_taghandler_204.setId("lista");
                          __jsp_taghandler_204.setName("DetDocumentosLista");
                          java.lang.Object lista = null;
                          __jsp_tag_starteval=__jsp_taghandler_204.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_204,__jsp_tag_starteval,out);
                            do {
                              lista = (java.lang.Object) pageContext.findAttribute("lista");
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[280]);
                              /*@lineinfo:translated-code*//*@lineinfo:568^28*/                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_205=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                                __jsp_taghandler_205.setParent(__jsp_taghandler_204);
                                __jsp_taghandler_205.setName("lista");
                                __jsp_taghandler_205.setProperty("item");
                                __jsp_tag_starteval=__jsp_taghandler_205.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_205,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_205.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_205.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_205);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[281]);
                              /*@lineinfo:translated-code*//*@lineinfo:569^12*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_206=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_206.setParent(__jsp_taghandler_204);
                                __jsp_taghandler_206.setName("lista");
                                __jsp_taghandler_206.setProperty("codrubactual");
                                __jsp_tag_starteval=__jsp_taghandler_206.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_206.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_206.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_206);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[282]);
                              /*@lineinfo:translated-code*//*@lineinfo:570^12*/                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_207=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_207.setParent(__jsp_taghandler_204);
                                __jsp_taghandler_207.setName("lista");
                                __jsp_taghandler_207.setProperty("descripcion_activo");
                                __jsp_tag_starteval=__jsp_taghandler_207.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_207.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_207.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_207);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[283]);
                              /*@lineinfo:translated-code*//*@lineinfo:571^12*/                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_208=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_208.setParent(__jsp_taghandler_204);
                                __jsp_taghandler_208.setName("DocumentosForm");
                                __jsp_taghandler_208.setProperty("doc_tipdoc");
                                __jsp_taghandler_208.setValue("B");
                                __jsp_tag_starteval=__jsp_taghandler_208.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[284]);
                                    /*@lineinfo:translated-code*//*@lineinfo:572^17*/                                    {
                                      org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_209=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                      __jsp_taghandler_209.setParent(__jsp_taghandler_208);
                                      __jsp_taghandler_209.setName("lista");
                                      __jsp_taghandler_209.setProperty("descripcion_codmot");
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
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[285]);
                                  /*@lineinfo:translated-code*//*@lineinfo:572^74*/                                  } while (__jsp_taghandler_208.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_208.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_208);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[286]);
                              /*@lineinfo:translated-code*//*@lineinfo:574^12*/                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_210=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_210.setParent(__jsp_taghandler_204);
                                __jsp_taghandler_210.setName("DocumentosForm");
                                __jsp_taghandler_210.setProperty("doc_tipdoc");
                                __jsp_taghandler_210.setValue("E");
                                __jsp_tag_starteval=__jsp_taghandler_210.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[287]);
                                    /*@lineinfo:translated-code*//*@lineinfo:575^17*/                                    {
                                      org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_211=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                      __jsp_taghandler_211.setParent(__jsp_taghandler_210);
                                      __jsp_taghandler_211.setName("lista");
                                      __jsp_taghandler_211.setProperty("descripcion_codmot");
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
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[288]);
                                  /*@lineinfo:translated-code*//*@lineinfo:575^74*/                                  } while (__jsp_taghandler_210.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_210.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_210);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[289]);
                              /*@lineinfo:translated-code*//*@lineinfo:577^12*/                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_212=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_212.setParent(__jsp_taghandler_204);
                                __jsp_taghandler_212.setName("DocumentosForm");
                                __jsp_taghandler_212.setProperty("doc_tipdoc");
                                __jsp_taghandler_212.setValue("T");
                                __jsp_tag_starteval=__jsp_taghandler_212.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[290]);
                                    /*@lineinfo:translated-code*//*@lineinfo:578^17*/                                    {
                                      org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_213=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                      __jsp_taghandler_213.setParent(__jsp_taghandler_212);
                                      __jsp_taghandler_213.setName("lista");
                                      __jsp_taghandler_213.setProperty("descripcion_codmot");
                                      __jsp_tag_starteval=__jsp_taghandler_213.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                        } while (__jsp_taghandler_213.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_213.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_213);
                                    }
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[291]);
                                  /*@lineinfo:translated-code*//*@lineinfo:578^74*/                                  } while (__jsp_taghandler_212.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_212.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_212);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[292]);
                              /*@lineinfo:translated-code*//*@lineinfo:580^12*/                              {
                                org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_214=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                                __jsp_taghandler_214.setParent(__jsp_taghandler_204);
                                __jsp_taghandler_214.setName("DocumentosForm");
                                __jsp_taghandler_214.setProperty("opcion");
                                __jsp_taghandler_214.setValue("3");
                                __jsp_tag_starteval=__jsp_taghandler_214.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[293]);
                                    /*@lineinfo:translated-code*//*@lineinfo:582^16*/                                    {
                                      org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_215=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                      __jsp_taghandler_215.setParent(__jsp_taghandler_214);
                                      __jsp_taghandler_215.setName("DocumentosForm");
                                      __jsp_taghandler_215.setProperty("opcion");
                                      __jsp_taghandler_215.setValue("10");
                                      __jsp_tag_starteval=__jsp_taghandler_215.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[294]);
                                          /*@lineinfo:translated-code*//*@lineinfo:583^18*/                                          {
                                            org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_216=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                            __jsp_taghandler_216.setParent(__jsp_taghandler_215);
                                            __jsp_taghandler_216.setIndexed(true);
                                            __jsp_taghandler_216.setOnclick("operacion.value=7;opcion.value=10;salir.value=0");
                                            __jsp_taghandler_216.setProperty("boton");
                                            __jsp_taghandler_216.setStyleClass("boton1");
                                            __jsp_taghandler_216.setValue("Eliminar");
                                            __jsp_tag_starteval=__jsp_taghandler_216.doStartTag();
                                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                            {
                                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_216,__jsp_tag_starteval,out);
                                              do {
                                              } while (__jsp_taghandler_216.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                            }
                                            if (__jsp_taghandler_216.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_216);
                                          }
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[295]);
                                        /*@lineinfo:translated-code*//*@lineinfo:583^159*/                                        } while (__jsp_taghandler_215.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_215.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_215);
                                    }
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[296]);
                                    /*@lineinfo:translated-code*//*@lineinfo:585^16*/                                    {
                                      org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_217=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                      __jsp_taghandler_217.setParent(__jsp_taghandler_214);
                                      __jsp_taghandler_217.setName("DocumentosForm");
                                      __jsp_taghandler_217.setProperty("opcion");
                                      __jsp_taghandler_217.setValue("11");
                                      __jsp_tag_starteval=__jsp_taghandler_217.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[297]);
                                          /*@lineinfo:translated-code*//*@lineinfo:586^18*/                                          {
                                            org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_218=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                            __jsp_taghandler_218.setParent(__jsp_taghandler_217);
                                            __jsp_taghandler_218.setIndexed(true);
                                            __jsp_taghandler_218.setOnclick("operacion.value=7;opcion.value=11;salir.value=0");
                                            __jsp_taghandler_218.setProperty("boton");
                                            __jsp_taghandler_218.setStyleClass("boton1");
                                            __jsp_taghandler_218.setValue("Eliminar");
                                            __jsp_tag_starteval=__jsp_taghandler_218.doStartTag();
                                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                            {
                                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_218,__jsp_tag_starteval,out);
                                              do {
                                              } while (__jsp_taghandler_218.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                            }
                                            if (__jsp_taghandler_218.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_218);
                                          }
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[298]);
                                        /*@lineinfo:translated-code*//*@lineinfo:586^159*/                                        } while (__jsp_taghandler_217.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_217.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_217);
                                    }
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[299]);
                                    /*@lineinfo:translated-code*//*@lineinfo:588^16*/                                    {
                                      org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_219=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                      __jsp_taghandler_219.setParent(__jsp_taghandler_214);
                                      __jsp_taghandler_219.setName("DocumentosForm");
                                      __jsp_taghandler_219.setProperty("opcion");
                                      __jsp_taghandler_219.setValue("1");
                                      __jsp_tag_starteval=__jsp_taghandler_219.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[300]);
                                          /*@lineinfo:translated-code*//*@lineinfo:589^18*/                                          {
                                            org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_220=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                            __jsp_taghandler_220.setParent(__jsp_taghandler_219);
                                            __jsp_taghandler_220.setIndexed(true);
                                            __jsp_taghandler_220.setOnclick("operacion.value=7;opcion.value=1;salir.value=0");
                                            __jsp_taghandler_220.setProperty("boton");
                                            __jsp_taghandler_220.setStyleClass("boton1");
                                            __jsp_taghandler_220.setValue("Eliminar");
                                            __jsp_tag_starteval=__jsp_taghandler_220.doStartTag();
                                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                            {
                                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_220,__jsp_tag_starteval,out);
                                              do {
                                              } while (__jsp_taghandler_220.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                            }
                                            if (__jsp_taghandler_220.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_220);
                                          }
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[301]);
                                        /*@lineinfo:translated-code*//*@lineinfo:589^158*/                                        } while (__jsp_taghandler_219.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_219.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_219);
                                    }
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[302]);
                                    /*@lineinfo:translated-code*//*@lineinfo:591^16*/                                    {
                                      org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_221=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                      __jsp_taghandler_221.setParent(__jsp_taghandler_214);
                                      __jsp_taghandler_221.setName("DocumentosForm");
                                      __jsp_taghandler_221.setProperty("opcion");
                                      __jsp_taghandler_221.setValue("2");
                                      __jsp_tag_starteval=__jsp_taghandler_221.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[303]);
                                          /*@lineinfo:translated-code*//*@lineinfo:592^18*/                                          {
                                            org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_222=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                            __jsp_taghandler_222.setParent(__jsp_taghandler_221);
                                            __jsp_taghandler_222.setIndexed(true);
                                            __jsp_taghandler_222.setOnclick("operacion.value=7;opcion.value=2;salir.value=0");
                                            __jsp_taghandler_222.setProperty("boton");
                                            __jsp_taghandler_222.setStyleClass("boton1");
                                            __jsp_taghandler_222.setValue("Eliminar");
                                            __jsp_tag_starteval=__jsp_taghandler_222.doStartTag();
                                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                            {
                                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_222,__jsp_tag_starteval,out);
                                              do {
                                              } while (__jsp_taghandler_222.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                            }
                                            if (__jsp_taghandler_222.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_222);
                                          }
                                          /*@lineinfo:generated-code*/
                                          out.write(__jsp_StaticText.text[304]);
                                        /*@lineinfo:translated-code*//*@lineinfo:592^158*/                                        } while (__jsp_taghandler_221.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_221.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_221);
                                    }
                                    /*@lineinfo:generated-code*/
                                    out.write(__jsp_StaticText.text[305]);
                                  /*@lineinfo:translated-code*//*@lineinfo:593^30*/                                  } while (__jsp_taghandler_214.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_214.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_214);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[306]);
                            /*@lineinfo:translated-code*//*@lineinfo:595^29*/                            } while (__jsp_taghandler_204.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_204.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_204);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[307]);
                      /*@lineinfo:translated-code*//*@lineinfo:597^23*/                      } while (__jsp_taghandler_203.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_203.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_203);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[308]);
                  /*@lineinfo:translated-code*//*@lineinfo:599^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_223=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_223.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_223.setName("DocumentosForm");
                    __jsp_taghandler_223.setProperty("opcion");
                    __jsp_taghandler_223.setValue("11");
                    __jsp_tag_starteval=__jsp_taghandler_223.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[309]);
                        /*@lineinfo:translated-code*//*@lineinfo:601^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_224=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_224.setParent(__jsp_taghandler_223);
                          __jsp_taghandler_224.setOnclick("operacion.value=2;opcion.value=1;salir.value=1");
                          __jsp_taghandler_224.setProperty("boton");
                          __jsp_taghandler_224.setStyleClass("boton1");
                          __jsp_taghandler_224.setValue("Salir");
                          __jsp_tag_starteval=__jsp_taghandler_224.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_224,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_224.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_224.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_224);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[310]);
                      /*@lineinfo:translated-code*//*@lineinfo:601^151*/                      } while (__jsp_taghandler_223.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_223.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_223);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[311]);
                  /*@lineinfo:translated-code*//*@lineinfo:604^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_225=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_225.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_225.setName("DocumentosForm");
                    __jsp_taghandler_225.setProperty("opcion");
                    __jsp_taghandler_225.setValue("10");
                    __jsp_tag_starteval=__jsp_taghandler_225.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[312]);
                        /*@lineinfo:translated-code*//*@lineinfo:606^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_226=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_226.setParent(__jsp_taghandler_225);
                          __jsp_taghandler_226.setOnclick("operacion.value=2;opcion.value=1;salir.value=1");
                          __jsp_taghandler_226.setProperty("boton");
                          __jsp_taghandler_226.setStyleClass("boton1");
                          __jsp_taghandler_226.setValue("Salir");
                          __jsp_tag_starteval=__jsp_taghandler_226.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_226,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_226.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_226.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_226);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[313]);
                      /*@lineinfo:translated-code*//*@lineinfo:606^151*/                      } while (__jsp_taghandler_225.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_225.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_225);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[314]);
                  /*@lineinfo:translated-code*//*@lineinfo:609^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_227=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_227.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_227.setName("DocumentosForm");
                    __jsp_taghandler_227.setProperty("opcion");
                    __jsp_taghandler_227.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_227.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[315]);
                        /*@lineinfo:translated-code*//*@lineinfo:611^30*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_228=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_228.setParent(__jsp_taghandler_227);
                          __jsp_taghandler_228.setOnclick("operacion.value=1;opcion.value=6;salir.value=0");
                          __jsp_taghandler_228.setProperty("boton");
                          __jsp_taghandler_228.setStyleClass("boton1");
                          __jsp_taghandler_228.setValue("Validar");
                          __jsp_tag_starteval=__jsp_taghandler_228.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_228,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_228.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_228.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_228);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[316]);
                        /*@lineinfo:translated-code*//*@lineinfo:612^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_229=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_229.setParent(__jsp_taghandler_227);
                          __jsp_taghandler_229.setOnclick("operacion.value=2;opcion.value=1;salir.value=1");
                          __jsp_taghandler_229.setProperty("boton");
                          __jsp_taghandler_229.setStyleClass("boton1");
                          __jsp_taghandler_229.setValue("Salir");
                          __jsp_tag_starteval=__jsp_taghandler_229.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_229,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_229.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_229.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_229);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[317]);
                      /*@lineinfo:translated-code*//*@lineinfo:612^152*/                      } while (__jsp_taghandler_227.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_227.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_227);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[318]);
                  /*@lineinfo:translated-code*//*@lineinfo:615^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_230=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_230.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_230.setName("DocumentosForm");
                    __jsp_taghandler_230.setProperty("opcion");
                    __jsp_taghandler_230.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_230.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[319]);
                        /*@lineinfo:translated-code*//*@lineinfo:617^30*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_231=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_231.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_231.setOnclick("operacion.value=1;opcion.value=6;salir.value=0");
                          __jsp_taghandler_231.setProperty("boton");
                          __jsp_taghandler_231.setStyleClass("boton1");
                          __jsp_taghandler_231.setValue("Validar");
                          __jsp_tag_starteval=__jsp_taghandler_231.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_231,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_231.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_231.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_231);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[320]);
                        /*@lineinfo:translated-code*//*@lineinfo:618^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_232=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_232.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_232.setOnclick("operacion.value=2;opcion.value=1;salir.value=1");
                          __jsp_taghandler_232.setProperty("boton");
                          __jsp_taghandler_232.setStyleClass("boton1");
                          __jsp_taghandler_232.setValue("Salir");
                          __jsp_tag_starteval=__jsp_taghandler_232.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_232,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_232.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_232.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_232);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[321]);
                      /*@lineinfo:translated-code*//*@lineinfo:618^152*/                      } while (__jsp_taghandler_230.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_230.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_230);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[322]);
                  /*@lineinfo:translated-code*//*@lineinfo:621^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_233=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_233.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_233.setName("DocumentosForm");
                    __jsp_taghandler_233.setProperty("opcion");
                    __jsp_taghandler_233.setValue("6");
                    __jsp_tag_starteval=__jsp_taghandler_233.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[323]);
                        /*@lineinfo:translated-code*//*@lineinfo:623^28*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_234=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_234.setParent(__jsp_taghandler_233);
                          __jsp_taghandler_234.setName("DocumentosForm");
                          __jsp_taghandler_234.setProperty("ddo_item");
                          __jsp_tag_starteval=__jsp_taghandler_234.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_234,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_234.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_234.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_234);
                        }
/*@lineinfo:623^85*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_235=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_235.setParent(__jsp_taghandler_233);
                          __jsp_taghandler_235.setName("DocumentosForm");
                          __jsp_taghandler_235.setProperty("ddo_codmot");
                          __jsp_tag_starteval=__jsp_taghandler_235.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_235,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_235.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_235.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_235);
                        }
/*@lineinfo:623^144*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_236=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_236.setParent(__jsp_taghandler_233);
                          __jsp_taghandler_236.setName("DocumentosForm");
                          __jsp_taghandler_236.setProperty("ddo_codofiactual");
                          __jsp_tag_starteval=__jsp_taghandler_236.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_236,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_236.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_236.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_236);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[324]);
                        /*@lineinfo:translated-code*//*@lineinfo:624^12*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_237=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag name property readonly size");
                          __jsp_taghandler_237.setParent(__jsp_taghandler_233);
                          __jsp_taghandler_237.setName("DocumentosForm");
                          __jsp_taghandler_237.setProperty("ddo_codrubactual");
                          __jsp_taghandler_237.setReadonly(true);
                          __jsp_taghandler_237.setSize("10");
                          __jsp_tag_starteval=__jsp_taghandler_237.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_237,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_237.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_237.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_237);
                        }
/*@lineinfo:624^101*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_238=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag name property readonly size");
                          __jsp_taghandler_238.setParent(__jsp_taghandler_233);
                          __jsp_taghandler_238.setName("DocumentosForm");
                          __jsp_taghandler_238.setProperty("desactivo");
                          __jsp_taghandler_238.setReadonly(true);
                          __jsp_taghandler_238.setSize("100");
                          __jsp_tag_starteval=__jsp_taghandler_238.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_238,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_238.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_238.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_238);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[325]);
                        /*@lineinfo:translated-code*//*@lineinfo:625^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_239=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_239.setParent(__jsp_taghandler_233);
                          __jsp_taghandler_239.setName("DocumentosForm");
                          __jsp_taghandler_239.setProperty("doc_tipdoc");
                          __jsp_taghandler_239.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_239.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[326]);
                              /*@lineinfo:translated-code*//*@lineinfo:626^30*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_240=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag name property readonly size");
                                __jsp_taghandler_240.setParent(__jsp_taghandler_239);
                                __jsp_taghandler_240.setName("DocumentosForm");
                                __jsp_taghandler_240.setProperty("desbaja");
                                __jsp_taghandler_240.setReadonly(true);
                                __jsp_taghandler_240.setSize("20");
                                __jsp_tag_starteval=__jsp_taghandler_240.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_240,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_240.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_240.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_240);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[327]);
                            /*@lineinfo:translated-code*//*@lineinfo:626^110*/                            } while (__jsp_taghandler_239.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_239.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_239);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[328]);
                        /*@lineinfo:translated-code*//*@lineinfo:628^12*/                        {
                          org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_241=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                          __jsp_taghandler_241.setParent(__jsp_taghandler_233);
                          __jsp_taghandler_241.setName("DocumentosForm");
                          __jsp_taghandler_241.setProperty("doc_tipdoc");
                          __jsp_taghandler_241.setValue("B");
                          __jsp_tag_starteval=__jsp_taghandler_241.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[329]);
                              /*@lineinfo:translated-code*//*@lineinfo:629^30*/                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_242=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag name property readonly size");
                                __jsp_taghandler_242.setParent(__jsp_taghandler_241);
                                __jsp_taghandler_242.setName("DocumentosForm");
                                __jsp_taghandler_242.setProperty("desofi");
                                __jsp_taghandler_242.setReadonly(true);
                                __jsp_taghandler_242.setSize("60");
                                __jsp_tag_starteval=__jsp_taghandler_242.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_242,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_242.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_242.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_242);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[330]);
                            /*@lineinfo:translated-code*//*@lineinfo:629^109*/                            } while (__jsp_taghandler_241.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_241.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_241);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[331]);
                        /*@lineinfo:translated-code*//*@lineinfo:632^12*/                        {
                          org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_243=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                          __jsp_taghandler_243.setParent(__jsp_taghandler_233);
                          __jsp_taghandler_243.setName("DocumentosForm");
                          __jsp_taghandler_243.setProperty("desactivo");
                          __jsp_taghandler_243.setValue("NO Existe Activo");
                          __jsp_tag_starteval=__jsp_taghandler_243.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[332]);
                              /*@lineinfo:translated-code*//*@lineinfo:633^36*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_244=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                                __jsp_taghandler_244.setParent(__jsp_taghandler_243);
                                __jsp_taghandler_244.setOnclick("operacion.value=1;opcion.value=1;salir.value=0");
                                __jsp_taghandler_244.setProperty("boton");
                                __jsp_taghandler_244.setStyleClass("boton1");
                                __jsp_taghandler_244.setValue("Insertar");
                                __jsp_tag_starteval=__jsp_taghandler_244.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_244,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_244.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_244.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_244);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[333]);
                              /*@lineinfo:translated-code*//*@lineinfo:634^31*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_245=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                                __jsp_taghandler_245.setParent(__jsp_taghandler_243);
                                __jsp_taghandler_245.setOnclick("operacion.value=2;opcion.value=1;salir.value=1");
                                __jsp_taghandler_245.setProperty("boton");
                                __jsp_taghandler_245.setStyleClass("boton1");
                                __jsp_taghandler_245.setValue("Salir");
                                __jsp_tag_starteval=__jsp_taghandler_245.doStartTag();
                                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_245,__jsp_tag_starteval,out);
                                  do {
                                  } while (__jsp_taghandler_245.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                                if (__jsp_taghandler_245.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_245);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[334]);
                            /*@lineinfo:translated-code*//*@lineinfo:634^154*/                            } while (__jsp_taghandler_243.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_243.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_243);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[335]);
                      /*@lineinfo:translated-code*//*@lineinfo:635^29*/                      } while (__jsp_taghandler_233.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_233.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_233);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[336]);
                  /*@lineinfo:translated-code*//*@lineinfo:638^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_246=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_246.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_246.setName("DocumentosForm");
                    __jsp_taghandler_246.setProperty("opcion");
                    __jsp_taghandler_246.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_246.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[337]);
                        /*@lineinfo:translated-code*//*@lineinfo:640^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_247=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_247.setParent(__jsp_taghandler_246);
                          __jsp_taghandler_247.setOnclick("operacion.value=1;opcion.value=3;salir.value=0");
                          __jsp_taghandler_247.setProperty("boton");
                          __jsp_taghandler_247.setStyleClass("boton1");
                          __jsp_taghandler_247.setValue("Eliminar");
                          __jsp_tag_starteval=__jsp_taghandler_247.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_247,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_247.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_247.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_247);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[338]);
                        /*@lineinfo:translated-code*//*@lineinfo:641^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_248=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_248.setParent(__jsp_taghandler_246);
                          __jsp_taghandler_248.setOnclick("operacion.value=4;opcion.value=3;salir.value=1");
                          __jsp_taghandler_248.setProperty("boton");
                          __jsp_taghandler_248.setStyleClass("boton1");
                          __jsp_taghandler_248.setValue("Salir");
                          __jsp_tag_starteval=__jsp_taghandler_248.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_248,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_248.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_248.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_248);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[339]);
                      /*@lineinfo:translated-code*//*@lineinfo:641^151*/                      } while (__jsp_taghandler_246.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_246.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_246);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[340]);
                  /*@lineinfo:translated-code*//*@lineinfo:644^7*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_249=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_249.setParent(__jsp_taghandler_154);
                    __jsp_taghandler_249.setName("DocumentosForm");
                    __jsp_taghandler_249.setProperty("opcion");
                    __jsp_taghandler_249.setValue("4");
                    __jsp_tag_starteval=__jsp_taghandler_249.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[341]);
                        /*@lineinfo:translated-code*//*@lineinfo:646^29*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_250=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_250.setParent(__jsp_taghandler_249);
                          __jsp_taghandler_250.setOnclick("operacion.value=1;opcion.value=4;salir.value=0");
                          __jsp_taghandler_250.setProperty("boton");
                          __jsp_taghandler_250.setStyleClass("boton1");
                          __jsp_taghandler_250.setValue("Confirmar");
                          __jsp_tag_starteval=__jsp_taghandler_250.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_250,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_250.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_250.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_250);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[342]);
                        /*@lineinfo:translated-code*//*@lineinfo:647^28*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_251=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_251.setParent(__jsp_taghandler_249);
                          __jsp_taghandler_251.setOnclick("operacion.value=4;opcion.value=4;salir.value=1");
                          __jsp_taghandler_251.setProperty("boton");
                          __jsp_taghandler_251.setStyleClass("boton1");
                          __jsp_taghandler_251.setValue("Salir");
                          __jsp_tag_starteval=__jsp_taghandler_251.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_251,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_251.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_251.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_251);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[343]);
                      /*@lineinfo:translated-code*//*@lineinfo:647^151*/                      } while (__jsp_taghandler_249.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_249.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_249);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[344]);
                /*@lineinfo:translated-code*//*@lineinfo:649^21*/                } while (__jsp_taghandler_154.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_154.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_154);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[345]);
          /*@lineinfo:translated-code*//*@lineinfo:650^18*/          } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[346]);
      /*@lineinfo:translated-code*//*@lineinfo:652^1*/      {
        org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_252=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
        __jsp_taghandler_252.setParent(null);
        __jsp_taghandler_252.setName("DocumentosForm");
        __jsp_taghandler_252.setProperty("opcion");
        __jsp_taghandler_252.setValue("5");
        __jsp_tag_starteval=__jsp_taghandler_252.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[347]);
          /*@lineinfo:translated-code*//*@lineinfo:652^70*/          } while (__jsp_taghandler_252.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_252.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_252);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[348]);


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
    private static final char text[][]=new char[349][];
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
      "\n".toCharArray();
      text[5] = 
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\nfunction ftarget()\n{\n  f = document.forms[0];\n  f.target='_blank';\n}\nfunction validar(form)\n{\n mensaje=\"\"\n foco=\"\"\n if ((form.operacion.value==3)&&(form.opcion.value==5)) {\n  ftarget()\n }\n if ((form.opcion.value==6)) {\n    try {\n        if (!textoObligatorio( form.ddo_codrubactual.value )) {\n      \t   \tmensaje=mensaje+\"Debe introducir Código Activo\\n\"\n      \t\t  if (foco.length==0) foco=\"form.ddo_codrubactual.focus()\"\n        }\n     }\n     catch (e) {\n        xvar=0\n    }\n }\n if ((form.operacion.value!=7)&&(form.operacion.value!=2)) {\n   try {\n   if (!esFecha(form.doc_fecha.value)){\n     mensaje=mensaje+\"Debe introducir fecha dd/mm/yyyy\\n\"\n     if (foco.length==0) foco=\"form.doc_fecha.focus()\"\n   }\n   }\n   catch (e) {\n     xvar=0\n   }  \n   try {\n      if (form.salir.value!=1){\n         i=form.ddo_codmot.selectedIndex;\n       \t if (!comboObligatorio(form.ddo_codmot.options[i].value)) {\n \t         mensaje=mensaje+\"Debe introducir Motivo de Baja\\n\"\n           if (foco.length==0) foco=\"form.ddo_codmot.focus()\"\n         }\n      }   \n   }\n   catch (e) {\n     xvar=0\n   }\n   try {\n      if (form.salir.value!=1){\n         i=form.ddo_codofiactual.selectedIndex;\n       \t if (!comboObligatorio(form.ddo_codofiactual.options[i].value)) {\n \t         mensaje=mensaje+\"Debe introducir Oficina Destino\\n\"\n           if (foco.length==0) foco=\"form.ddo_codofiactual.focus()\"\n         }\n      }   \n   }\n   catch (e) {\n     xvar=0\n   }   \n   try {\n    i=form.doc_codfunorigen.selectedIndex;\n   \tif (!comboObligatorio(form.doc_codfunorigen.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Funcionario Origen\\n\"\n\t\t  if (foco.length==0) foco=\"form.doc_codfunorigen.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n   try {\n    i=form.doc_codfundestino.selectedIndex;\n   \tif (!comboObligatorio(form.doc_codfundestino.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Funcionario Destino\\n\"\n\t\t  if (foco.length==0) foco=\"form.doc_codfundestino.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    i=form.doc_codfunorigen.selectedIndex;\n    j=form.doc_codfundestino.selectedIndex;\n   \tif ((form.doc_codfunorigen.options[i].value)==(form.doc_codfundestino.options[j].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Diferentes Funcionario Origen y Destino\\n\"\n\t\t  if (foco.length==0) foco=\"form.doc_codfunorigen.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n   try {\n    i=form.doc_codreg.selectedIndex;\n   \tif (!comboObligatorio(form.doc_codreg.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Regional\\n\"\n\t\t  if (foco.length==0) foco=\"form.doc_codreg.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n   try {\n    i=form.doc_codfin.selectedIndex;\n   \tif (!comboObligatorio(form.doc_codfin.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Financiador\\n\"\n\t\t  if (foco.length==0) foco=\"form.doc_codfin.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    i=form.doc_tipdoc.selectedIndex;\n   \tif (!comboObligatorio(form.doc_tipdoc.options[i].value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Tipo de Documento\\n\"\n\t\t  if (foco.length==0) foco=\"form.doc_tipdoc.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }\n    try {\n    if (!textoObligatorio( form.doc_numero.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Número\\n\"\n\t\t  if (foco.length==0) foco=\"form.doc_numero.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n   \tif (!comboObligatorio(form.doc_numero.value)) {\n\t   \tmensaje=mensaje+\"Debe introducir Número <> 0\\n\"\n\t\t  if (foco.length==0) foco=\"form.doc_numero.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0\n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }\n  }\n}\nfunction limpiar_numero_devolucion() {\n   try {\n      if (document.forms[0].doc_tipdoc.value==\"E\")\n         document.forms[0].doc_devolucion.value=\"\";\n   }\n   catch (e) {\n      xvar=0\n   }\n}\n</script>\n<body onload=\"limpiar_numero_devolucion();\">\n<table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n<caption>Acta</caption>\n".toCharArray();
      text[6] = 
      "\n<caption>De Entrega</caption>\n".toCharArray();
      text[7] = 
      "\n".toCharArray();
      text[8] = 
      "\n<caption>De Devolución</caption>\n".toCharArray();
      text[9] = 
      "\n".toCharArray();
      text[10] = 
      "\n<caption>De Transferencia</caption>\n".toCharArray();
      text[11] = 
      "\n".toCharArray();
      text[12] = 
      "\n<caption>De Transferencia Entre Regionales</caption>\n".toCharArray();
      text[13] = 
      "\n".toCharArray();
      text[14] = 
      "\n<caption>De Baja</caption>\n".toCharArray();
      text[15] = 
      "\n".toCharArray();
      text[16] = 
      "\n<caption>De Transferencia Entre Financiadores</caption>\n".toCharArray();
      text[17] = 
      "\n".toCharArray();
      text[18] = 
      "\n".toCharArray();
      text[19] = 
      "\n".toCharArray();
      text[20] = 
      "\n<input type=\"hidden\" name=\"salir\" value=\"0\">\n".toCharArray();
      text[21] = 
      "\n  <tr class=\"T8a\">\n     <td>\n     <table width=\"100%\" align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n     <tr>\n         <td class=\"S10d\">".toCharArray();
      text[22] = 
      "</td>\n         <td>".toCharArray();
      text[23] = 
      "\n         ".toCharArray();
      text[24] = 
      "</td>\n     </tr> \n     <tr>\n         <td class=\"S10d\">".toCharArray();
      text[25] = 
      "</td>\n         <td>".toCharArray();
      text[26] = 
      "\n         ".toCharArray();
      text[27] = 
      "</td>\n     </tr> \n     <tr>\n        <td class=\"S10d\">".toCharArray();
      text[28] = 
      "</td>\n        <td>".toCharArray();
      text[29] = 
      "\n            ".toCharArray();
      text[30] = 
      "\n            ".toCharArray();
      text[31] = 
      "</td>           \n     </tr>\n     ".toCharArray();
      text[32] = 
      "\n     <tr>\n        <td class=\"S10d\">".toCharArray();
      text[33] = 
      "</td>\n        <td>".toCharArray();
      text[34] = 
      "</td>\n     </tr> \n     <tr>\n        <td class=\"S10d\">".toCharArray();
      text[35] = 
      "</td>\n        <td>".toCharArray();
      text[36] = 
      "</td>\n     </tr> \n     ".toCharArray();
      text[37] = 
      "\n     <tr>\n        <td class=\"S10d\">Gestion: </td>  \n        <td>".toCharArray();
      text[38] = 
      "</td>        \n     </tr>\n     <tr></tr>\n        <td class=\"S10d\">Confirmados: </td>\n        <td class=\"S10i\"><input type=\"radio\" name=\"confirmados\" value=\"S\"> Si <input type=\"radio\" name=\"confirmados\" checked=\"checked\" value=\"N\"> No</td>\n     </tr> \n     ".toCharArray();
      text[39] = 
      "\n     ".toCharArray();
      text[40] = 
      "\n     <tr>\n        <td></td>\n        <td align=\"left\">\n        ".toCharArray();
      text[41] = 
      "\n           ".toCharArray();
      text[42] = 
      "\n        ".toCharArray();
      text[43] = 
      "\n        ".toCharArray();
      text[44] = 
      "\n           ".toCharArray();
      text[45] = 
      "\n        ".toCharArray();
      text[46] = 
      "\n        ".toCharArray();
      text[47] = 
      "\n           ".toCharArray();
      text[48] = 
      "\n        ".toCharArray();
      text[49] = 
      "\n        ".toCharArray();
      text[50] = 
      "\n           ".toCharArray();
      text[51] = 
      "\n        ".toCharArray();
      text[52] = 
      "\n        ".toCharArray();
      text[53] = 
      "\n           ".toCharArray();
      text[54] = 
      "\n        ".toCharArray();
      text[55] = 
      "\n        </td>\n     </tr>\n     </table>\n     </td>\n   </tr>\n".toCharArray();
      text[56] = 
      "\n".toCharArray();
      text[57] = 
      "\n  <tr class=\"T8a\">\n     <td>\n     ".toCharArray();
      text[58] = 
      "\n     ".toCharArray();
      text[59] = 
      "\n     ".toCharArray();
      text[60] = 
      "\n     ".toCharArray();
      text[61] = 
      "\n     ".toCharArray();
      text[62] = 
      "\n     <table width=\"100%\" align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n     <tr><td>\n      <table width=\"100%\" class=\"soloborde\" bgcolor=\"#C1C1FF\">\n       <tr class=\"FondoAzul\">\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Acta</td>\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Número</td>\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Fecha</td>\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Origen</td>\n         ".toCharArray();
      text[63] = 
      "\n          <td width=\"60\" scope=\"col\" class=\"S10c\">Destino</td>\n         ".toCharArray();
      text[64] = 
      "\n         <td width=\"100\" scope=\"col\" class=\"S10c\">Observación</td>         \n         <td></td>\n       </tr>\n      ".toCharArray();
      text[65] = 
      "\n      ".toCharArray();
      text[66] = 
      "\n        ".toCharArray();
      text[67] = 
      "\n           <tr class=\"T8b\">\n        ".toCharArray();
      text[68] = 
      "\n           <tr class=\"T8a\">\n        ".toCharArray();
      text[69] = 
      "\n           <td>".toCharArray();
      text[70] = 
      "</td>\n           <td>".toCharArray();
      text[71] = 
      "</td>\n           <td>".toCharArray();
      text[72] = 
      "</td>\n           <td>".toCharArray();
      text[73] = 
      "-".toCharArray();
      text[74] = 
      "</td>\n           ".toCharArray();
      text[75] = 
      "\n             <td>".toCharArray();
      text[76] = 
      "-".toCharArray();
      text[77] = 
      "</td>\n           ".toCharArray();
      text[78] = 
      "\n           <td>".toCharArray();
      text[79] = 
      "</td>\n           <td align=\"right\">\n            ".toCharArray();
      text[80] = 
      "\n              ".toCharArray();
      text[81] = 
      "\n            ".toCharArray();
      text[82] = 
      "\n            ".toCharArray();
      text[83] = 
      "\n              ".toCharArray();
      text[84] = 
      "\n            ".toCharArray();
      text[85] = 
      "     \n            ".toCharArray();
      text[86] = 
      "\n              ".toCharArray();
      text[87] = 
      "\n            ".toCharArray();
      text[88] = 
      "     \n            ".toCharArray();
      text[89] = 
      "\n              ".toCharArray();
      text[90] = 
      "\n            ".toCharArray();
      text[91] = 
      "     \n           </td>\n         </tr>\n         ".toCharArray();
      text[92] = 
      "\n      ".toCharArray();
      text[93] = 
      "\n      </table>\n     </td></tr>     \n     </table>\n     </td>\n   </tr>\n".toCharArray();
      text[94] = 
      "\n".toCharArray();
      text[95] = 
      "\n   ".toCharArray();
      text[96] = 
      "\n      <tr>\n         <td class=\"S10d\">\n         ".toCharArray();
      text[97] = 
      "\n         ".toCharArray();
      text[98] = 
      "\n         ".toCharArray();
      text[99] = 
      "\n         ".toCharArray();
      text[100] = 
      "\n         ".toCharArray();
      text[101] = 
      "\n         ".toCharArray();
      text[102] = 
      "</td>\n         <td>".toCharArray();
      text[103] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[104] = 
      "</td>\n         <td colspan=\"5\">".toCharArray();
      text[105] = 
      "</td>\n      </tr>\n      <tr>\n         ".toCharArray();
      text[106] = 
      "\n           <td class=\"S10d\">".toCharArray();
      text[107] = 
      "</td>\n           <td colspan=\"5\">".toCharArray();
      text[108] = 
      "            \n           ".toCharArray();
      text[109] = 
      "</td>\n         ".toCharArray();
      text[110] = 
      "\n         ".toCharArray();
      text[111] = 
      "\n           <td class=\"S10d\">".toCharArray();
      text[112] = 
      "</td>\n           <td colspan=\"5\">".toCharArray();
      text[113] = 
      "            \n           ".toCharArray();
      text[114] = 
      "</td>\n         ".toCharArray();
      text[115] = 
      "         \n         ".toCharArray();
      text[116] = 
      "\n           <td class=\"S10d\">".toCharArray();
      text[117] = 
      "</td>\n           <td colspan=\"5\">".toCharArray();
      text[118] = 
      "            \n           ".toCharArray();
      text[119] = 
      "</td>\n         ".toCharArray();
      text[120] = 
      "         \n         ".toCharArray();
      text[121] = 
      "\n           <td class=\"S10d\">".toCharArray();
      text[122] = 
      "</td>\n           <td colspan=\"5\">".toCharArray();
      text[123] = 
      "            \n           ".toCharArray();
      text[124] = 
      "</td>\n         ".toCharArray();
      text[125] = 
      "         \n         ".toCharArray();
      text[126] = 
      "\n            <td class=\"S10d\">".toCharArray();
      text[127] = 
      "</td>\n            <td colspan=\"5\">         \n              ".toCharArray();
      text[128] = 
      "\n              ".toCharArray();
      text[129] = 
      "\n              ".toCharArray();
      text[130] = 
      "\n            </td>\n         ".toCharArray();
      text[131] = 
      "\n         ".toCharArray();
      text[132] = 
      "\n            <td class=\"S10d\">".toCharArray();
      text[133] = 
      "</td>\n            <td colspan=\"5\">          \n              ".toCharArray();
      text[134] = 
      "\n              ".toCharArray();
      text[135] = 
      "\n              ".toCharArray();
      text[136] = 
      "\n            </td>\n         ".toCharArray();
      text[137] = 
      "\n      </tr>\n      ".toCharArray();
      text[138] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[139] = 
      "</td>\n         <td colspan=\"5\">\n           ".toCharArray();
      text[140] = 
      "\n              ".toCharArray();
      text[141] = 
      "            \n              ".toCharArray();
      text[142] = 
      "\n           ".toCharArray();
      text[143] = 
      "\n           ".toCharArray();
      text[144] = 
      "\n             ".toCharArray();
      text[145] = 
      "\n             ".toCharArray();
      text[146] = 
      "\n             ".toCharArray();
      text[147] = 
      "\n           ".toCharArray();
      text[148] = 
      "   \n         </td>\n      </tr>\n      ".toCharArray();
      text[149] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[150] = 
      "</td>\n         <td colspan=\"5\">".toCharArray();
      text[151] = 
      "</td>\n      </tr>\n      <tr>\n         <td align=\"right\">".toCharArray();
      text[152] = 
      "</td>\n         <td align=\"left\">".toCharArray();
      text[153] = 
      "</td>\n      </tr>\n   ".toCharArray();
      text[154] = 
      "\n   ".toCharArray();
      text[155] = 
      "\n      <tr>\n         <td class=\"S10d\">\n         ".toCharArray();
      text[156] = 
      "\n         ".toCharArray();
      text[157] = 
      "\n         ".toCharArray();
      text[158] = 
      "\n         ".toCharArray();
      text[159] = 
      "</td>\n         <td>".toCharArray();
      text[160] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[161] = 
      "</td>\n         <td colspan=\"5\">".toCharArray();
      text[162] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[163] = 
      "</td>\n         <td colspan=\"5\">\n         ".toCharArray();
      text[164] = 
      "\n            ".toCharArray();
      text[165] = 
      "            \n            ".toCharArray();
      text[166] = 
      "\n         ".toCharArray();
      text[167] = 
      "      \n         ".toCharArray();
      text[168] = 
      "\n            ".toCharArray();
      text[169] = 
      "            \n            ".toCharArray();
      text[170] = 
      "\n         ".toCharArray();
      text[171] = 
      "\n         ".toCharArray();
      text[172] = 
      "\n            ".toCharArray();
      text[173] = 
      "\n            ".toCharArray();
      text[174] = 
      "\n            ".toCharArray();
      text[175] = 
      "\n         ".toCharArray();
      text[176] = 
      "\n         ".toCharArray();
      text[177] = 
      "\n            ".toCharArray();
      text[178] = 
      "\n            ".toCharArray();
      text[179] = 
      "\n            ".toCharArray();
      text[180] = 
      "\n         ".toCharArray();
      text[181] = 
      "\n         ".toCharArray();
      text[182] = 
      "\n            ".toCharArray();
      text[183] = 
      "            \n            ".toCharArray();
      text[184] = 
      "   \n         ".toCharArray();
      text[185] = 
      "\n         ".toCharArray();
      text[186] = 
      "\n            ".toCharArray();
      text[187] = 
      "            \n            ".toCharArray();
      text[188] = 
      "   \n         ".toCharArray();
      text[189] = 
      "         \n         </td>\n      </tr>\n      ".toCharArray();
      text[190] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[191] = 
      "</td>\n         <td colspan=\"5\">\n           ".toCharArray();
      text[192] = 
      "\n             ".toCharArray();
      text[193] = 
      "            \n             ".toCharArray();
      text[194] = 
      "\n           ".toCharArray();
      text[195] = 
      "\n           ".toCharArray();
      text[196] = 
      "\n              ".toCharArray();
      text[197] = 
      "\n              ".toCharArray();
      text[198] = 
      "\n              ".toCharArray();
      text[199] = 
      "\n           ".toCharArray();
      text[200] = 
      "   \n         </td>\n      </tr>\n      ".toCharArray();
      text[201] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[202] = 
      "</td>\n         <td colspan=\"5\">".toCharArray();
      text[203] = 
      "</td>\n      </tr>\n      ".toCharArray();
      text[204] = 
      "\n      <tr>\n         <td class=\"S10d\">Número de Devolución :</td>\n         <td colspan=\"5\">".toCharArray();
      text[205] = 
      "</td>\n      </tr>\n      ".toCharArray();
      text[206] = 
      "\n      <tr>\n         <td align=\"right\">\n         ".toCharArray();
      text[207] = 
      "      \n            ".toCharArray();
      text[208] = 
      "\n         ".toCharArray();
      text[209] = 
      "\n         ".toCharArray();
      text[210] = 
      "      \n            ".toCharArray();
      text[211] = 
      "\n         ".toCharArray();
      text[212] = 
      "\n         ".toCharArray();
      text[213] = 
      "</td>\n         <td align=\"left\">".toCharArray();
      text[214] = 
      "</td>\n      </tr>\n   ".toCharArray();
      text[215] = 
      "\n".toCharArray();
      text[216] = 
      "\n   ".toCharArray();
      text[217] = 
      "\n    ".toCharArray();
      text[218] = 
      "\n      <tr>\n         <td class=\"S10d\">\n         ".toCharArray();
      text[219] = 
      "\n         ".toCharArray();
      text[220] = 
      "\n         ".toCharArray();
      text[221] = 
      "\n         ".toCharArray();
      text[222] = 
      "\n         ".toCharArray();
      text[223] = 
      "\n         ".toCharArray();
      text[224] = 
      "</td>\n         <td>".toCharArray();
      text[225] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[226] = 
      "</td>\n         <td colspan=\"5\">".toCharArray();
      text[227] = 
      "</td>\n      </tr>\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[228] = 
      "</td>\n           <td colspan=\"5\">".toCharArray();
      text[229] = 
      "            \n              ".toCharArray();
      text[230] = 
      "</td>\n        </tr>\n      ".toCharArray();
      text[231] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[232] = 
      "</td>\n         <td colspan=\"5\">\n           ".toCharArray();
      text[233] = 
      "            \n           ".toCharArray();
      text[234] = 
      "\n         </td>\n      </tr>\n      ".toCharArray();
      text[235] = 
      "\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[236] = 
      "</td>\n         <td colspan=\"5\">".toCharArray();
      text[237] = 
      "</td>\n      </tr>\n      <tr class=\"FondoAzul\">\n           <td colspan=\"3\">Codigo Activo.....Descripcion</td>\n           ".toCharArray();
      text[238] = 
      "      \n            <td colspan=\"1\">Baja</td>\n           ".toCharArray();
      text[239] = 
      "\n           ".toCharArray();
      text[240] = 
      "      \n            <td colspan=\"1\">Oficina Destino</td>\n           ".toCharArray();
      text[241] = 
      "      \n           ".toCharArray();
      text[242] = 
      "      \n            <td colspan=\"1\">Oficina Destino</td>\n           ".toCharArray();
      text[243] = 
      "           \n      </tr>\n    ".toCharArray();
      text[244] = 
      "\n      ".toCharArray();
      text[245] = 
      "\n         <tr>\n           <td colspan=\"3\">".toCharArray();
      text[246] = 
      "\n             ".toCharArray();
      text[247] = 
      "\n             ".toCharArray();
      text[248] = 
      "</td>               \n           ".toCharArray();
      text[249] = 
      "\n              <td colspan=\"1\">".toCharArray();
      text[250] = 
      "\n              ".toCharArray();
      text[251] = 
      "</td>              \n           ".toCharArray();
      text[252] = 
      "\n           ".toCharArray();
      text[253] = 
      "\n              <td colspan=\"1\">".toCharArray();
      text[254] = 
      "\n              ".toCharArray();
      text[255] = 
      "</td>              \n           ".toCharArray();
      text[256] = 
      "           \n           ".toCharArray();
      text[257] = 
      "\n              <td colspan=\"1\">".toCharArray();
      text[258] = 
      "\n              ".toCharArray();
      text[259] = 
      "</td>              \n           ".toCharArray();
      text[260] = 
      "                      \n         </tr>\n      ".toCharArray();
      text[261] = 
      "\n      ".toCharArray();
      text[262] = 
      "\n         <tr>\n           <td colspan=\"3\">".toCharArray();
      text[263] = 
      "\n             ".toCharArray();
      text[264] = 
      "\n             ".toCharArray();
      text[265] = 
      "</td>               \n           ".toCharArray();
      text[266] = 
      "\n              <td colspan=\"1\">".toCharArray();
      text[267] = 
      "\n              ".toCharArray();
      text[268] = 
      "</td>              \n           ".toCharArray();
      text[269] = 
      "\n           ".toCharArray();
      text[270] = 
      "\n              <td colspan=\"1\">".toCharArray();
      text[271] = 
      "\n              ".toCharArray();
      text[272] = 
      "</td>              \n           ".toCharArray();
      text[273] = 
      "           \n           ".toCharArray();
      text[274] = 
      "\n              <td colspan=\"1\">".toCharArray();
      text[275] = 
      "\n              ".toCharArray();
      text[276] = 
      "</td>              \n           ".toCharArray();
      text[277] = 
      "                                   \n         </tr>\n      ".toCharArray();
      text[278] = 
      "\n      ".toCharArray();
      text[279] = 
      "\n      ".toCharArray();
      text[280] = 
      "\n        <tr class=\"T8a\">\n           <td colspan=\"3\">".toCharArray();
      text[281] = 
      "\n           ".toCharArray();
      text[282] = 
      "\n           ".toCharArray();
      text[283] = 
      "</td>\n           ".toCharArray();
      text[284] = 
      "\n            <td>".toCharArray();
      text[285] = 
      "</td>\n           ".toCharArray();
      text[286] = 
      "\n           ".toCharArray();
      text[287] = 
      "\n            <td>".toCharArray();
      text[288] = 
      "</td>\n           ".toCharArray();
      text[289] = 
      "           \n           ".toCharArray();
      text[290] = 
      "\n            <td>".toCharArray();
      text[291] = 
      "</td>\n           ".toCharArray();
      text[292] = 
      "            \n           ".toCharArray();
      text[293] = 
      "\n             <td>\n               ".toCharArray();
      text[294] = 
      "\n                 ".toCharArray();
      text[295] = 
      "\n               ".toCharArray();
      text[296] = 
      "\n               ".toCharArray();
      text[297] = 
      "\n                 ".toCharArray();
      text[298] = 
      "\n               ".toCharArray();
      text[299] = 
      "\n               ".toCharArray();
      text[300] = 
      "\n                 ".toCharArray();
      text[301] = 
      "\n               ".toCharArray();
      text[302] = 
      "\n               ".toCharArray();
      text[303] = 
      "\n                 ".toCharArray();
      text[304] = 
      "\n               ".toCharArray();
      text[305] = 
      "\n             </td>\n           ".toCharArray();
      text[306] = 
      "\n        </tr>\n      ".toCharArray();
      text[307] = 
      "\n      ".toCharArray();
      text[308] = 
      "\n      ".toCharArray();
      text[309] = 
      "\n        <tr>\n          <td align=\"left\">".toCharArray();
      text[310] = 
      "</td>\n        </tr>\n      ".toCharArray();
      text[311] = 
      "\n      ".toCharArray();
      text[312] = 
      "\n        <tr>\n          <td align=\"left\">".toCharArray();
      text[313] = 
      "</td>\n        </tr>\n      ".toCharArray();
      text[314] = 
      "\n      ".toCharArray();
      text[315] = 
      "\n        <tr>\n           <td align=\"right\">".toCharArray();
      text[316] = 
      "</td>\n           <td align=\"left\">".toCharArray();
      text[317] = 
      "</td>\n        </tr>\n      ".toCharArray();
      text[318] = 
      "\n      ".toCharArray();
      text[319] = 
      "\n        <tr>\n           <td align=\"right\">".toCharArray();
      text[320] = 
      "</td>\n           <td align=\"left\">".toCharArray();
      text[321] = 
      "</td>\n        </tr>\n      ".toCharArray();
      text[322] = 
      "\n      ".toCharArray();
      text[323] = 
      "\n        <tr>\n           <td colspan=\"3\">".toCharArray();
      text[324] = 
      "\n           ".toCharArray();
      text[325] = 
      "</td>\n           ".toCharArray();
      text[326] = 
      "\n             <td colspan=\"1\">".toCharArray();
      text[327] = 
      "</td>\n           ".toCharArray();
      text[328] = 
      "  \n           ".toCharArray();
      text[329] = 
      "\n             <td colspan=\"1\">".toCharArray();
      text[330] = 
      "</td>\n           ".toCharArray();
      text[331] = 
      " \n           </tr>\n           ".toCharArray();
      text[332] = 
      "\n             <tr><td align=\"right\">".toCharArray();
      text[333] = 
      "</td>          \n             <td align=\"left\">".toCharArray();
      text[334] = 
      "</td>\n           ".toCharArray();
      text[335] = 
      "  \n        </tr>\n      ".toCharArray();
      text[336] = 
      "\n      ".toCharArray();
      text[337] = 
      "\n        <tr>\n          <td align=\"right\">".toCharArray();
      text[338] = 
      "</td>\n          <td align=\"left\">".toCharArray();
      text[339] = 
      "</td>\n        </tr>\n      ".toCharArray();
      text[340] = 
      "\n      ".toCharArray();
      text[341] = 
      "\n        <tr>\n          <td align=\"right\">".toCharArray();
      text[342] = 
      "</td>\n          <td align=\"left\">".toCharArray();
      text[343] = 
      "</td>\n        </tr>\n      ".toCharArray();
      text[344] = 
      "      \n   ".toCharArray();
      text[345] = 
      "\n".toCharArray();
      text[346] = 
      "\n".toCharArray();
      text[347] = 
      "\n  <tr><td align=\"center\" colspan=\"2\" class=\"S10d\">(*) Campos Obligatorios</td></tr>\n".toCharArray();
      text[348] = 
      "\n</table>\n</body>\n</html>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
