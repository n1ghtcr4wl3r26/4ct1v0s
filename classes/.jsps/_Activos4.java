  /*@lineinfo:filename=/Activos4.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ActivosFijos.*;


public class _Activos4 extends oracle.jsp.runtime.HttpJsp {

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
    _Activos4 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      out.write(__jsp_StaticText.text[3]);
      out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:25^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/activosAction");
        __jsp_taghandler_1.setOnsubmit("return validar4(this)");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:26^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:27^1*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:28^1*/            {
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
                  /*@lineinfo:translated-code*//*@lineinfo:29^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_5=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setName("ActivosForm");
                    __jsp_taghandler_5.setProperty("act_codpar");
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
                  /*@lineinfo:translated-code*//*@lineinfo:30^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_6=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_6.setName("ActivosForm");
                    __jsp_taghandler_6.setProperty("act_codofi");
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
                  /*@lineinfo:translated-code*//*@lineinfo:31^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_7=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_7.setName("ActivosForm");
                    __jsp_taghandler_7.setProperty("act_codfun");
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
                  /*@lineinfo:translated-code*//*@lineinfo:32^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_8=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_8.setName("ActivosForm");
                    __jsp_taghandler_8.setProperty("act_codfin");
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
                  /*@lineinfo:translated-code*//*@lineinfo:33^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_9=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_9.setName("ActivosForm");
                    __jsp_taghandler_9.setProperty("act_codmot");
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
                  /*@lineinfo:translated-code*//*@lineinfo:34^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_10=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_10.setName("ActivosForm");
                    __jsp_taghandler_10.setProperty("act_tipcam");
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
                  /*@lineinfo:translated-code*//*@lineinfo:35^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_11=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_11.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_11.setName("ActivosForm");
                    __jsp_taghandler_11.setProperty("act_tipufv");
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
                  /*@lineinfo:translated-code*//*@lineinfo:36^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_12=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_12.setName("ActivosForm");
                    __jsp_taghandler_12.setProperty("act_accesorios");
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
                  /*@lineinfo:translated-code*//*@lineinfo:37^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_13=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_13.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_13.setName("ActivosForm");
                    __jsp_taghandler_13.setProperty("act_modelo");
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
                  /*@lineinfo:translated-code*//*@lineinfo:38^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_14=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_14.setName("ActivosForm");
                    __jsp_taghandler_14.setProperty("act_serie1");
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
                  /*@lineinfo:translated-code*//*@lineinfo:39^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_15=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_15.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_15.setName("ActivosForm");
                    __jsp_taghandler_15.setProperty("act_serie2");
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
                  /*@lineinfo:translated-code*//*@lineinfo:40^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_16=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_16.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_16.setName("ActivosForm");
                    __jsp_taghandler_16.setProperty("act_docreferencia");
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
                  /*@lineinfo:translated-code*//*@lineinfo:41^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_17=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_17.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_17.setName("ActivosForm");
                    __jsp_taghandler_17.setProperty("act_fecreferencia");
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
                  /*@lineinfo:translated-code*//*@lineinfo:42^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_18=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_18.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_18.setName("ActivosForm");
                    __jsp_taghandler_18.setProperty("act_docrefotro");
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
                  /*@lineinfo:translated-code*//*@lineinfo:43^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_19=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_19.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_19.setName("ActivosForm");
                    __jsp_taghandler_19.setProperty("act_placa");
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
                  /*@lineinfo:translated-code*//*@lineinfo:44^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_20=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_20.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_20.setName("ActivosForm");
                    __jsp_taghandler_20.setProperty("act_aniofabricacion");
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
                  /*@lineinfo:translated-code*//*@lineinfo:45^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_21=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_21.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_21.setName("ActivosForm");
                    __jsp_taghandler_21.setProperty("act_valcodol");
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
                  out.write(__jsp_StaticText.text[25]);
                  /*@lineinfo:translated-code*//*@lineinfo:46^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_22=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_22.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_22.setName("ActivosForm");
                    __jsp_taghandler_22.setProperty("act_valcoufv");
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
                  /*@lineinfo:translated-code*//*@lineinfo:47^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_23=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_23.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_23.setName("ActivosForm");
                    __jsp_taghandler_23.setProperty("act_fecbaja");
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
                  /*@lineinfo:translated-code*//*@lineinfo:48^4*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_24=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_24.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_24.setName("ActivosForm");
                    __jsp_taghandler_24.setProperty("act_indetiqueta");
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
                  /*@lineinfo:translated-code*//*@lineinfo:49^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_25=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_25.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_25.setName("ActivosForm");
                    __jsp_taghandler_25.setProperty("opcion");
                    __jsp_taghandler_25.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[29]);
                        /*@lineinfo:translated-code*//*@lineinfo:52^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_26=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_26.setKey("activos4.codrub");
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
                        out.write(__jsp_StaticText.text[30]);
                        /*@lineinfo:translated-code*//*@lineinfo:53^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_27=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_27.setMaxlength("10");
                          __jsp_taghandler_27.setName("ActivosForm");
                          __jsp_taghandler_27.setProperty("act_codrub");
                          __jsp_taghandler_27.setReadonly(true);
                          __jsp_taghandler_27.setSize("10");
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
                        out.write(__jsp_StaticText.text[31]);
                        /*@lineinfo:translated-code*//*@lineinfo:54^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_28=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_28.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_28.setMaxlength("60");
                          __jsp_taghandler_28.setName("ActivosForm");
                          __jsp_taghandler_28.setProperty("act_rubdescripcion");
                          __jsp_taghandler_28.setReadonly(true);
                          __jsp_taghandler_28.setSize("60");
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
                        /*@lineinfo:translated-code*//*@lineinfo:57^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_29=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_29.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_29.setKey("activos4.codreg");
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
                        /*@lineinfo:translated-code*//*@lineinfo:58^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_30=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_30.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_30.setMaxlength("10");
                          __jsp_taghandler_30.setName("ActivosForm");
                          __jsp_taghandler_30.setProperty("act_codreg");
                          __jsp_taghandler_30.setReadonly(true);
                          __jsp_taghandler_30.setSize("10");
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
                        out.write(__jsp_StaticText.text[34]);
                        /*@lineinfo:translated-code*//*@lineinfo:59^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_31=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_31.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_31.setMaxlength("60");
                          __jsp_taghandler_31.setName("ActivosForm");
                          __jsp_taghandler_31.setProperty("act_regdescripcion");
                          __jsp_taghandler_31.setReadonly(true);
                          __jsp_taghandler_31.setSize("60");
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
                        /*@lineinfo:translated-code*//*@lineinfo:62^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_32=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_32.setKey("activos4.codigo");
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
                        out.write(__jsp_StaticText.text[36]);
                        /*@lineinfo:translated-code*//*@lineinfo:63^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_33=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_33.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_33.setMaxlength("5");
                          __jsp_taghandler_33.setName("ActivosForm");
                          __jsp_taghandler_33.setProperty("act_codigo");
                          __jsp_taghandler_33.setReadonly(true);
                          __jsp_taghandler_33.setSize("5");
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
                        out.write(__jsp_StaticText.text[37]);
                        /*@lineinfo:translated-code*//*@lineinfo:64^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_34=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_34.setMaxlength("10");
                          __jsp_taghandler_34.setName("ActivosForm");
                          __jsp_taghandler_34.setProperty("act_codbarra");
                          __jsp_taghandler_34.setReadonly(true);
                          __jsp_taghandler_34.setSize("10");
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
                        /*@lineinfo:translated-code*//*@lineinfo:67^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_35=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_35.setKey("activos4.codgrp");
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
                        out.write(__jsp_StaticText.text[39]);
                        /*@lineinfo:translated-code*//*@lineinfo:68^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_36=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_36.setDisabled(false);
                          __jsp_taghandler_36.setName("ActivosForm");
                          __jsp_taghandler_36.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_36,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[40]);
                              /*@lineinfo:translated-code*//*@lineinfo:69^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_37=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                                __jsp_taghandler_37.setCollection("GruposLista");
                                __jsp_taghandler_37.setLabelProperty("descripcion");
                                __jsp_taghandler_37.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[41]);
                            /*@lineinfo:translated-code*//*@lineinfo:69^101*/                            } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[42]);
                        /*@lineinfo:translated-code*//*@lineinfo:71^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_38=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_38.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_38.setKey("activos4.codpar");
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
                        out.write(__jsp_StaticText.text[43]);
                        /*@lineinfo:translated-code*//*@lineinfo:73^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_39=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_39.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_39.setMaxlength("40");
                          __jsp_taghandler_39.setName("ActivosForm");
                          __jsp_taghandler_39.setProperty("act_pardescripcion");
                          __jsp_taghandler_39.setReadonly(true);
                          __jsp_taghandler_39.setSize("40");
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
                        out.write(__jsp_StaticText.text[44]);
                        /*@lineinfo:translated-code*//*@lineinfo:77^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_40=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_40.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_40.setKey("activos4.codofi");
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
                        out.write(__jsp_StaticText.text[45]);
                        /*@lineinfo:translated-code*//*@lineinfo:79^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_41=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_41.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_41.setMaxlength("40");
                          __jsp_taghandler_41.setName("ActivosForm");
                          __jsp_taghandler_41.setProperty("act_ofidescripcion");
                          __jsp_taghandler_41.setReadonly(true);
                          __jsp_taghandler_41.setSize("40");
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
                        out.write(__jsp_StaticText.text[46]);
                        /*@lineinfo:translated-code*//*@lineinfo:81^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_42=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_42.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_42.setKey("activos4.codfun");
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
                        out.write(__jsp_StaticText.text[47]);
                        /*@lineinfo:translated-code*//*@lineinfo:83^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_43=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_43.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_43.setMaxlength("40");
                          __jsp_taghandler_43.setName("ActivosForm");
                          __jsp_taghandler_43.setProperty("act_fundescripcion");
                          __jsp_taghandler_43.setReadonly(true);
                          __jsp_taghandler_43.setSize("40");
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
                        out.write(__jsp_StaticText.text[48]);
                        /*@lineinfo:translated-code*//*@lineinfo:87^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_44=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_44.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_44.setKey("activos4.codubi");
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
                        out.write(__jsp_StaticText.text[49]);
                        /*@lineinfo:translated-code*//*@lineinfo:88^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_45=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_45.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_45.setDisabled(false);
                          __jsp_taghandler_45.setName("ActivosForm");
                          __jsp_taghandler_45.setProperty("act_codubi");
                          __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_45,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[50]);
                              /*@lineinfo:translated-code*//*@lineinfo:89^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_46=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                                __jsp_taghandler_46.setCollection("UbicacionesLista");
                                __jsp_taghandler_46.setLabelProperty("descripcion");
                                __jsp_taghandler_46.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[51]);
                            /*@lineinfo:translated-code*//*@lineinfo:89^106*/                            } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[52]);
                        /*@lineinfo:translated-code*//*@lineinfo:91^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_47=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_47.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_47.setKey("activos4.codpry");
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
                        /*@lineinfo:translated-code*//*@lineinfo:92^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_48=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_48.setDisabled(false);
                          __jsp_taghandler_48.setName("ActivosForm");
                          __jsp_taghandler_48.setProperty("act_codpry");
                          __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_48,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[54]);
                              /*@lineinfo:translated-code*//*@lineinfo:93^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_49=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                                __jsp_taghandler_49.setCollection("ProyectosLista");
                                __jsp_taghandler_49.setLabelProperty("descripcion");
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
                              out.write(__jsp_StaticText.text[55]);
                            /*@lineinfo:translated-code*//*@lineinfo:93^104*/                            } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[56]);
                        /*@lineinfo:translated-code*//*@lineinfo:97^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_50=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_50.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_50.setKey("activos4.codfin");
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
                        out.write(__jsp_StaticText.text[57]);
                        /*@lineinfo:translated-code*//*@lineinfo:98^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_51=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_51.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_51.setMaxlength("40");
                          __jsp_taghandler_51.setName("ActivosForm");
                          __jsp_taghandler_51.setProperty("act_findescripcion");
                          __jsp_taghandler_51.setReadonly(true);
                          __jsp_taghandler_51.setSize("40");
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
                        out.write(__jsp_StaticText.text[58]);
                        /*@lineinfo:translated-code*//*@lineinfo:101^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_52=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_52.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_52.setKey("activos4.feccompra");
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
                        out.write(__jsp_StaticText.text[59]);
                        /*@lineinfo:translated-code*//*@lineinfo:102^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_53=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_53.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_53.setMaxlength("10");
                          __jsp_taghandler_53.setName("ActivosForm");
                          __jsp_taghandler_53.setProperty("act_feccompra");
                          __jsp_taghandler_53.setSize("10");
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
                        out.write(__jsp_StaticText.text[60]);
                        /*@lineinfo:translated-code*//*@lineinfo:103^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_54=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_54.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_54.setKey("activos4.umanejo");
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
                        out.write(__jsp_StaticText.text[61]);
                        /*@lineinfo:translated-code*//*@lineinfo:104^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_55=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_55.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_55.setMaxlength("20");
                          __jsp_taghandler_55.setName("ActivosForm");
                          __jsp_taghandler_55.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_55.setProperty("act_umanejo");
                          __jsp_taghandler_55.setSize("20");
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
                        out.write(__jsp_StaticText.text[62]);
                        /*@lineinfo:translated-code*//*@lineinfo:109^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_56=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_56.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_56.setKey("activos4.descripcion");
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
                        out.write(__jsp_StaticText.text[63]);
                        /*@lineinfo:translated-code*//*@lineinfo:110^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_57=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_57.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_57.setMaxlength("120");
                          __jsp_taghandler_57.setName("ActivosForm");
                          __jsp_taghandler_57.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_57.setProperty("act_descripcion");
                          __jsp_taghandler_57.setSize("60");
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
                        out.write(__jsp_StaticText.text[64]);
                        /*@lineinfo:translated-code*//*@lineinfo:113^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_58=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_58.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_58.setKey("activos4.desadicional");
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
                        out.write(__jsp_StaticText.text[65]);
                        /*@lineinfo:translated-code*//*@lineinfo:114^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_59=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_59.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_59.setMaxlength("240");
                          __jsp_taghandler_59.setName("ActivosForm");
                          __jsp_taghandler_59.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_59.setProperty("act_desadicional");
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
                        out.write(__jsp_StaticText.text[66]);
                        /*@lineinfo:translated-code*//*@lineinfo:118^13*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_60=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_60.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_60.setKey("activos.proveedor");
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
                        out.write(__jsp_StaticText.text[67]);
                        /*@lineinfo:translated-code*//*@lineinfo:121^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_61=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_61.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_61.setMaxlength("50");
                          __jsp_taghandler_61.setName("ActivosForm");
                          __jsp_taghandler_61.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_61.setProperty("act_proveedor");
                          __jsp_taghandler_61.setSize("50");
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
                        out.write(__jsp_StaticText.text[68]);
                        /*@lineinfo:translated-code*//*@lineinfo:127^27*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_62=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_62.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_62.setName("ActivosForm");
                          __jsp_taghandler_62.setProperty("act_codrub");
                          __jsp_taghandler_62.setValue("08");
                          __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[69]);
                            /*@lineinfo:translated-code*//*@lineinfo:127^92*/                            } while (__jsp_taghandler_62.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62);
                        }
/*@lineinfo:127^107*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_63=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_63.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_63.setKey("activos4.marca");
                          __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[70]);
                        /*@lineinfo:translated-code*//*@lineinfo:128^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_64=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_64.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_64.setMaxlength("30");
                          __jsp_taghandler_64.setName("ActivosForm");
                          __jsp_taghandler_64.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_64.setProperty("act_marca");
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
                        out.write(__jsp_StaticText.text[71]);
                        /*@lineinfo:translated-code*//*@lineinfo:129^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_65=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_65.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_65.setKey("activos4.color");
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
                        out.write(__jsp_StaticText.text[72]);
                        /*@lineinfo:translated-code*//*@lineinfo:130^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_66=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_66.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_66.setMaxlength("30");
                          __jsp_taghandler_66.setName("ActivosForm");
                          __jsp_taghandler_66.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_66.setProperty("act_color");
                          __jsp_taghandler_66.setSize("30");
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
                        /*@lineinfo:translated-code*//*@lineinfo:133^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_67=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_67.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_67.setKey("activos4.procedencia");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[74]);
                        /*@lineinfo:translated-code*//*@lineinfo:134^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_68=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_68.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_68.setMaxlength("30");
                          __jsp_taghandler_68.setName("ActivosForm");
                          __jsp_taghandler_68.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_68.setProperty("act_procedencia");
                          __jsp_taghandler_68.setSize("30");
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
                        out.write(__jsp_StaticText.text[75]);
                        /*@lineinfo:translated-code*//*@lineinfo:135^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_69=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_69.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_69.setKey("activos4.gobmunicipal");
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
                        out.write(__jsp_StaticText.text[76]);
                        /*@lineinfo:translated-code*//*@lineinfo:136^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_70=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_70.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_70.setMaxlength("60");
                          __jsp_taghandler_70.setName("ActivosForm");
                          __jsp_taghandler_70.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_70.setProperty("act_gobmunicipal");
                          __jsp_taghandler_70.setSize("30");
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
                        out.write(__jsp_StaticText.text[77]);
                        /*@lineinfo:translated-code*//*@lineinfo:139^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_71=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_71.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_71.setKey("activos4.valcobol");
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
                        out.write(__jsp_StaticText.text[78]);
                        /*@lineinfo:translated-code*//*@lineinfo:140^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_72=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_72.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_72.setMaxlength("13");
                          __jsp_taghandler_72.setName("ActivosForm");
                          __jsp_taghandler_72.setProperty("act_valcobol");
                          __jsp_taghandler_72.setSize("13");
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
                        out.write(__jsp_StaticText.text[79]);
                        /*@lineinfo:translated-code*//*@lineinfo:141^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_73=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_73.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_73.setKey("activos4.ordencompra");
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
                        out.write(__jsp_StaticText.text[80]);
                        /*@lineinfo:translated-code*//*@lineinfo:142^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_74=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_74.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_74.setMaxlength("20");
                          __jsp_taghandler_74.setName("ActivosForm");
                          __jsp_taghandler_74.setProperty("act_ordencompra");
                          __jsp_taghandler_74.setSize("20");
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
                        out.write(__jsp_StaticText.text[81]);
                        /*@lineinfo:translated-code*//*@lineinfo:145^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_75=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_75.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_75.setKey("activos4.numfactura");
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
                        out.write(__jsp_StaticText.text[82]);
                        /*@lineinfo:translated-code*//*@lineinfo:146^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_76=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_76.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_76.setMaxlength("12");
                          __jsp_taghandler_76.setName("ActivosForm");
                          __jsp_taghandler_76.setProperty("act_numfactura");
                          __jsp_taghandler_76.setSize("12");
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
                        out.write(__jsp_StaticText.text[83]);
                        /*@lineinfo:translated-code*//*@lineinfo:147^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_77=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_77.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_77.setKey("activos4.numcomprobante");
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
                        out.write(__jsp_StaticText.text[84]);
                        /*@lineinfo:translated-code*//*@lineinfo:148^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_78=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_78.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_78.setMaxlength("20");
                          __jsp_taghandler_78.setName("ActivosForm");
                          __jsp_taghandler_78.setProperty("act_numcomprobante");
                          __jsp_taghandler_78.setSize("20");
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
                        out.write(__jsp_StaticText.text[85]);
                        /*@lineinfo:translated-code*//*@lineinfo:151^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_79=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_79.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_79.setKey("activos4.codanterior");
                          __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_79.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[86]);
                        /*@lineinfo:translated-code*//*@lineinfo:152^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_80=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_80.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_80.setMaxlength("20");
                          __jsp_taghandler_80.setName("ActivosForm");
                          __jsp_taghandler_80.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_80.setProperty("act_codanterior");
                          __jsp_taghandler_80.setSize("20");
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
                        out.write(__jsp_StaticText.text[87]);
                        /*@lineinfo:translated-code*//*@lineinfo:153^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_81=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_81.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_81.setKey("activos4.fecha");
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
                        out.write(__jsp_StaticText.text[88]);
                        /*@lineinfo:translated-code*//*@lineinfo:154^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_82=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_82.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_82.setMaxlength("10");
                          __jsp_taghandler_82.setName("ActivosForm");
                          __jsp_taghandler_82.setProperty("rev_fecha");
                          __jsp_taghandler_82.setSize("10");
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
                        out.write(__jsp_StaticText.text[89]);
                        /*@lineinfo:translated-code*//*@lineinfo:157^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_83=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_83.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_83.setKey("activos4.vidaut");
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
                        out.write(__jsp_StaticText.text[90]);
                        /*@lineinfo:translated-code*//*@lineinfo:158^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_84=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_84.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_84.setMaxlength("4");
                          __jsp_taghandler_84.setName("ActivosForm");
                          __jsp_taghandler_84.setProperty("rev_vidaut");
                          __jsp_taghandler_84.setReadonly(true);
                          __jsp_taghandler_84.setSize("4");
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
                        out.write(__jsp_StaticText.text[91]);
                        /*@lineinfo:translated-code*//*@lineinfo:159^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_85=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_85.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_85.setKey("activos4.estadoactivo");
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
                        out.write(__jsp_StaticText.text[92]);
                        /*@lineinfo:translated-code*//*@lineinfo:160^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_86=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_86.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_86.setDisabled(false);
                          __jsp_taghandler_86.setName("ActivosForm");
                          __jsp_taghandler_86.setProperty("rev_estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_86,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[93]);
                              /*@lineinfo:translated-code*//*@lineinfo:161^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_87=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_87.setParent(__jsp_taghandler_86);
                                __jsp_taghandler_87.setCollection("EstadosLista");
                                __jsp_taghandler_87.setLabelProperty("desestado");
                                __jsp_taghandler_87.setProperty("estado");
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
                              out.write(__jsp_StaticText.text[94]);
                            /*@lineinfo:translated-code*//*@lineinfo:161^99*/                            } while (__jsp_taghandler_86.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[95]);
                        /*@lineinfo:translated-code*//*@lineinfo:166^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_88=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_88.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_88.setKey("activos4.desestado");
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
                        out.write(__jsp_StaticText.text[96]);
                        /*@lineinfo:translated-code*//*@lineinfo:167^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_89=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_89.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_89.setMaxlength("60");
                          __jsp_taghandler_89.setName("ActivosForm");
                          __jsp_taghandler_89.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_89.setProperty("rev_desestado");
                          __jsp_taghandler_89.setSize("60");
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
                        out.write(__jsp_StaticText.text[97]);
                        /*@lineinfo:translated-code*//*@lineinfo:170^24*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_90=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_90.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_90.setOnclick("operacion.value=2;opcion.value=1");
                          __jsp_taghandler_90.setProperty("boton");
                          __jsp_taghandler_90.setStyleClass("boton1");
                          __jsp_taghandler_90.setValue("Insertar");
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
                        /*@lineinfo:translated-code*//*@lineinfo:175^12*/                        {
                          org.apache.struts.taglib.html.LinkTag __jsp_taghandler_91=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag href");
                          __jsp_taghandler_91.setParent(__jsp_taghandler_25);
                          __jsp_taghandler_91.setHref("javascript:pantallaCompleta('tipocambio.do');");
                          __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_91,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[99]);
                            /*@lineinfo:translated-code*//*@lineinfo:175^76*/                            } while (__jsp_taghandler_91.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[100]);
                      /*@lineinfo:translated-code*//*@lineinfo:177^24*/                      } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[101]);
                  /*@lineinfo:translated-code*//*@lineinfo:183^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_92=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_92.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_92.setName("ActivosForm");
                    __jsp_taghandler_92.setProperty("opcion");
                    __jsp_taghandler_92.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[102]);
                        /*@lineinfo:translated-code*//*@lineinfo:186^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_93=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_93.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_93.setKey("activos4.codrub");
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
                        out.write(__jsp_StaticText.text[103]);
                        /*@lineinfo:translated-code*//*@lineinfo:187^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_94=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_94.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_94.setMaxlength("10");
                          __jsp_taghandler_94.setName("ActivosForm");
                          __jsp_taghandler_94.setProperty("act_codrub");
                          __jsp_taghandler_94.setReadonly(true);
                          __jsp_taghandler_94.setSize("10");
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
                        out.write(__jsp_StaticText.text[104]);
                        /*@lineinfo:translated-code*//*@lineinfo:188^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_95=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_95.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_95.setMaxlength("60");
                          __jsp_taghandler_95.setName("ActivosForm");
                          __jsp_taghandler_95.setProperty("act_rubdescripcion");
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
                        out.write(__jsp_StaticText.text[105]);
                        /*@lineinfo:translated-code*//*@lineinfo:191^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_96=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_96.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_96.setKey("activos4.codreg");
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
                        out.write(__jsp_StaticText.text[106]);
                        /*@lineinfo:translated-code*//*@lineinfo:192^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_97=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_97.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_97.setMaxlength("10");
                          __jsp_taghandler_97.setName("ActivosForm");
                          __jsp_taghandler_97.setProperty("act_codreg");
                          __jsp_taghandler_97.setReadonly(true);
                          __jsp_taghandler_97.setSize("10");
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
                        out.write(__jsp_StaticText.text[107]);
                        /*@lineinfo:translated-code*//*@lineinfo:193^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_98=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_98.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_98.setMaxlength("60");
                          __jsp_taghandler_98.setName("ActivosForm");
                          __jsp_taghandler_98.setProperty("act_regdescripcion");
                          __jsp_taghandler_98.setReadonly(true);
                          __jsp_taghandler_98.setSize("60");
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
                        out.write(__jsp_StaticText.text[108]);
                        /*@lineinfo:translated-code*//*@lineinfo:196^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_99=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_99.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_99.setKey("activos4.codigo");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[109]);
                        /*@lineinfo:translated-code*//*@lineinfo:197^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_100=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_100.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_100.setMaxlength("5");
                          __jsp_taghandler_100.setName("ActivosForm");
                          __jsp_taghandler_100.setProperty("act_codigo");
                          __jsp_taghandler_100.setReadonly(true);
                          __jsp_taghandler_100.setSize("5");
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
                        out.write(__jsp_StaticText.text[110]);
                        /*@lineinfo:translated-code*//*@lineinfo:198^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_101=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_101.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_101.setMaxlength("10");
                          __jsp_taghandler_101.setName("ActivosForm");
                          __jsp_taghandler_101.setProperty("act_codbarra");
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
                        out.write(__jsp_StaticText.text[111]);
                        /*@lineinfo:translated-code*//*@lineinfo:201^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_102=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_102.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_102.setKey("activos4.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_102.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_102.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_102.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_102);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[112]);
                        /*@lineinfo:translated-code*//*@lineinfo:203^13*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_103=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name onkeypress property");
                          __jsp_taghandler_103.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_103.setDisabled(false);
                          __jsp_taghandler_103.setName("ActivosForm");
                          __jsp_taghandler_103.setOnkeypress("return handleEnter(this, event)");
                          __jsp_taghandler_103.setProperty("act_codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_103,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[113]);
                              /*@lineinfo:translated-code*//*@lineinfo:204^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_104=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_104.setParent(__jsp_taghandler_103);
                                __jsp_taghandler_104.setCollection("GruposLista");
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
                              out.write(__jsp_StaticText.text[114]);
                            /*@lineinfo:translated-code*//*@lineinfo:204^102*/                            } while (__jsp_taghandler_103.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[115]);
                        /*@lineinfo:translated-code*//*@lineinfo:207^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_105=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_105.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_105.setKey("activos4.codpar");
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
                        out.write(__jsp_StaticText.text[116]);
                        /*@lineinfo:translated-code*//*@lineinfo:209^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_106=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_106.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_106.setMaxlength("40");
                          __jsp_taghandler_106.setName("ActivosForm");
                          __jsp_taghandler_106.setProperty("act_pardescripcion");
                          __jsp_taghandler_106.setReadonly(true);
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
                        out.write(__jsp_StaticText.text[117]);
                        /*@lineinfo:translated-code*//*@lineinfo:213^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_107=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_107.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_107.setKey("activos4.codofi");
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
                        out.write(__jsp_StaticText.text[118]);
                        /*@lineinfo:translated-code*//*@lineinfo:215^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_108=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_108.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_108.setMaxlength("40");
                          __jsp_taghandler_108.setName("ActivosForm");
                          __jsp_taghandler_108.setProperty("act_ofidescripcion");
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
                        out.write(__jsp_StaticText.text[119]);
                        /*@lineinfo:translated-code*//*@lineinfo:217^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_109=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_109.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_109.setKey("activos4.codfun");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[120]);
                        /*@lineinfo:translated-code*//*@lineinfo:219^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_110=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_110.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_110.setMaxlength("40");
                          __jsp_taghandler_110.setName("ActivosForm");
                          __jsp_taghandler_110.setProperty("act_fundescripcion");
                          __jsp_taghandler_110.setReadonly(true);
                          __jsp_taghandler_110.setSize("40");
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
                        out.write(__jsp_StaticText.text[121]);
                        /*@lineinfo:translated-code*//*@lineinfo:223^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_111=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_111.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_111.setKey("activos4.codubi");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[122]);
                        /*@lineinfo:translated-code*//*@lineinfo:225^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_112=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_112.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_112.setMaxlength("40");
                          __jsp_taghandler_112.setName("ActivosForm");
                          __jsp_taghandler_112.setProperty("act_ubidescripcion");
                          __jsp_taghandler_112.setReadonly(true);
                          __jsp_taghandler_112.setSize("40");
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
                        out.write(__jsp_StaticText.text[123]);
                        /*@lineinfo:translated-code*//*@lineinfo:227^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_113=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_113.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_113.setKey("activos4.codpry");
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
                        out.write(__jsp_StaticText.text[124]);
                        /*@lineinfo:translated-code*//*@lineinfo:228^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_114=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_114.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_114.setDisabled(false);
                          __jsp_taghandler_114.setName("ActivosForm");
                          __jsp_taghandler_114.setProperty("act_codpry");
                          __jsp_tag_starteval=__jsp_taghandler_114.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_114,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[125]);
                              /*@lineinfo:translated-code*//*@lineinfo:229^15*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_115=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_115.setParent(__jsp_taghandler_114);
                                __jsp_taghandler_115.setCollection("ProyectosLista");
                                __jsp_taghandler_115.setLabelProperty("descripcion");
                                __jsp_taghandler_115.setProperty("codigo");
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
                              out.write(__jsp_StaticText.text[126]);
                            /*@lineinfo:translated-code*//*@lineinfo:229^104*/                            } while (__jsp_taghandler_114.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_114.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_114);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[127]);
                        /*@lineinfo:translated-code*//*@lineinfo:234^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_116=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_116.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_116.setKey("activos4.codfin");
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
                        out.write(__jsp_StaticText.text[128]);
                        /*@lineinfo:translated-code*//*@lineinfo:236^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_117=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_117.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_117.setMaxlength("40");
                          __jsp_taghandler_117.setName("ActivosForm");
                          __jsp_taghandler_117.setProperty("act_findescripcion");
                          __jsp_taghandler_117.setReadonly(true);
                          __jsp_taghandler_117.setSize("40");
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
                        out.write(__jsp_StaticText.text[129]);
                        /*@lineinfo:translated-code*//*@lineinfo:240^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_118=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_118.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_118.setKey("activos4.feccompra");
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
                        out.write(__jsp_StaticText.text[130]);
                        /*@lineinfo:translated-code*//*@lineinfo:241^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_119=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_119.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_119.setMaxlength("10");
                          __jsp_taghandler_119.setName("ActivosForm");
                          __jsp_taghandler_119.setProperty("act_feccompra");
                          __jsp_taghandler_119.setSize("10");
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
                        out.write(__jsp_StaticText.text[131]);
                        /*@lineinfo:translated-code*//*@lineinfo:242^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_120=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_120.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_120.setKey("activos4.umanejo");
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
                        out.write(__jsp_StaticText.text[132]);
                        /*@lineinfo:translated-code*//*@lineinfo:243^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_121=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_121.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_121.setMaxlength("20");
                          __jsp_taghandler_121.setName("ActivosForm");
                          __jsp_taghandler_121.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_121.setProperty("act_umanejo");
                          __jsp_taghandler_121.setSize("20");
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
                        out.write(__jsp_StaticText.text[133]);
                        /*@lineinfo:translated-code*//*@lineinfo:248^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_122=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_122.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_122.setKey("activos4.descripcion");
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
                        out.write(__jsp_StaticText.text[134]);
                        /*@lineinfo:translated-code*//*@lineinfo:249^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_123=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_123.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_123.setMaxlength("120");
                          __jsp_taghandler_123.setName("ActivosForm");
                          __jsp_taghandler_123.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_123.setProperty("act_descripcion");
                          __jsp_taghandler_123.setSize("60");
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
                        out.write(__jsp_StaticText.text[135]);
                        /*@lineinfo:translated-code*//*@lineinfo:252^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_124=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_124.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_124.setKey("activos4.desadicional");
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
                        out.write(__jsp_StaticText.text[136]);
                        /*@lineinfo:translated-code*//*@lineinfo:253^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_125=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_125.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_125.setMaxlength("240");
                          __jsp_taghandler_125.setName("ActivosForm");
                          __jsp_taghandler_125.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_125.setProperty("act_desadicional");
                          __jsp_taghandler_125.setSize("60");
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
                        out.write(__jsp_StaticText.text[137]);
                        /*@lineinfo:translated-code*//*@lineinfo:257^13*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_126=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_126.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_126.setKey("activos.proveedor");
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
                        out.write(__jsp_StaticText.text[138]);
                        /*@lineinfo:translated-code*//*@lineinfo:260^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_127=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_127.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_127.setMaxlength("50");
                          __jsp_taghandler_127.setName("ActivosForm");
                          __jsp_taghandler_127.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_127.setProperty("act_proveedor");
                          __jsp_taghandler_127.setSize("50");
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
                        out.write(__jsp_StaticText.text[139]);
                        /*@lineinfo:translated-code*//*@lineinfo:266^27*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_128=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_128.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_128.setName("ActivosForm");
                          __jsp_taghandler_128.setProperty("act_codrub");
                          __jsp_taghandler_128.setValue("08");
                          __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[140]);
                            /*@lineinfo:translated-code*//*@lineinfo:266^92*/                            } while (__jsp_taghandler_128.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128);
                        }
/*@lineinfo:266^107*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_129=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_129.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_129.setKey("activos4.marca");
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
                        out.write(__jsp_StaticText.text[141]);
                        /*@lineinfo:translated-code*//*@lineinfo:267^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_130=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_130.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_130.setMaxlength("30");
                          __jsp_taghandler_130.setName("ActivosForm");
                          __jsp_taghandler_130.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_130.setProperty("act_marca");
                          __jsp_taghandler_130.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_130.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_130,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_130.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_130.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_130);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[142]);
                        /*@lineinfo:translated-code*//*@lineinfo:268^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_131=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_131.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_131.setKey("activos4.color");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[143]);
                        /*@lineinfo:translated-code*//*@lineinfo:269^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_132=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_132.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_132.setMaxlength("30");
                          __jsp_taghandler_132.setName("ActivosForm");
                          __jsp_taghandler_132.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_132.setProperty("act_color");
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
                        /*@lineinfo:translated-code*//*@lineinfo:272^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_133=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_133.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_133.setKey("activos4.procedencia");
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
                        /*@lineinfo:translated-code*//*@lineinfo:273^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_134=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_134.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_134.setMaxlength("30");
                          __jsp_taghandler_134.setName("ActivosForm");
                          __jsp_taghandler_134.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_134.setProperty("act_procedencia");
                          __jsp_taghandler_134.setSize("30");
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
                        out.write(__jsp_StaticText.text[146]);
                        /*@lineinfo:translated-code*//*@lineinfo:274^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_135=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_135.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_135.setKey("activos4.gobmunicipal");
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
                        /*@lineinfo:translated-code*//*@lineinfo:275^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_136=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_136.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_136.setMaxlength("60");
                          __jsp_taghandler_136.setName("ActivosForm");
                          __jsp_taghandler_136.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_136.setProperty("act_gobmunicipal");
                          __jsp_taghandler_136.setSize("30");
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
                        out.write(__jsp_StaticText.text[148]);
                        /*@lineinfo:translated-code*//*@lineinfo:278^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_137=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_137.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_137.setKey("activos4.valcobol");
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
                        out.write(__jsp_StaticText.text[149]);
                        /*@lineinfo:translated-code*//*@lineinfo:279^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_138=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_138.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_138.setMaxlength("15");
                          __jsp_taghandler_138.setName("ActivosForm");
                          __jsp_taghandler_138.setProperty("act_valcobol");
                          __jsp_taghandler_138.setSize("15");
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
                        out.write(__jsp_StaticText.text[150]);
                        /*@lineinfo:translated-code*//*@lineinfo:280^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_139=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_139.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_139.setKey("activos4.ordencompra");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[151]);
                        /*@lineinfo:translated-code*//*@lineinfo:281^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_140=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_140.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_140.setMaxlength("20");
                          __jsp_taghandler_140.setName("ActivosForm");
                          __jsp_taghandler_140.setProperty("act_ordencompra");
                          __jsp_taghandler_140.setSize("20");
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
                        out.write(__jsp_StaticText.text[152]);
                        /*@lineinfo:translated-code*//*@lineinfo:284^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_141=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_141.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_141.setKey("activos4.numfactura");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[153]);
                        /*@lineinfo:translated-code*//*@lineinfo:285^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_142=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_142.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_142.setMaxlength("12");
                          __jsp_taghandler_142.setName("ActivosForm");
                          __jsp_taghandler_142.setProperty("act_numfactura");
                          __jsp_taghandler_142.setSize("12");
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
                        out.write(__jsp_StaticText.text[154]);
                        /*@lineinfo:translated-code*//*@lineinfo:286^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_143=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_143.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_143.setKey("activos4.numcomprobante");
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
                        out.write(__jsp_StaticText.text[155]);
                        /*@lineinfo:translated-code*//*@lineinfo:287^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_144=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_144.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_144.setMaxlength("20");
                          __jsp_taghandler_144.setName("ActivosForm");
                          __jsp_taghandler_144.setProperty("act_numcomprobante");
                          __jsp_taghandler_144.setSize("20");
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
                        out.write(__jsp_StaticText.text[156]);
                        /*@lineinfo:translated-code*//*@lineinfo:290^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_145=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_145.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_145.setKey("activos4.codanterior");
                          __jsp_tag_starteval=__jsp_taghandler_145.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_145.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_145.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_145);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[157]);
                        /*@lineinfo:translated-code*//*@lineinfo:291^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_146=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_146.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_146.setMaxlength("20");
                          __jsp_taghandler_146.setName("ActivosForm");
                          __jsp_taghandler_146.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_146.setProperty("act_codanterior");
                          __jsp_taghandler_146.setSize("20");
                          __jsp_tag_starteval=__jsp_taghandler_146.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_146,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_146.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_146.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_146);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[158]);
                        /*@lineinfo:translated-code*//*@lineinfo:292^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_147=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_147.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_147.setKey("activos4.fecha");
                          __jsp_tag_starteval=__jsp_taghandler_147.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_147.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_147.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_147);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[159]);
                        /*@lineinfo:translated-code*//*@lineinfo:293^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_148=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property size");
                          __jsp_taghandler_148.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_148.setMaxlength("10");
                          __jsp_taghandler_148.setName("ActivosForm");
                          __jsp_taghandler_148.setProperty("rev_fecha");
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
                        out.write(__jsp_StaticText.text[160]);
                        /*@lineinfo:translated-code*//*@lineinfo:296^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_149=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_149.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_149.setKey("activos4.vidaut");
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
                        out.write(__jsp_StaticText.text[161]);
                        /*@lineinfo:translated-code*//*@lineinfo:297^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_150=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_150.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_150.setMaxlength("4");
                          __jsp_taghandler_150.setName("ActivosForm");
                          __jsp_taghandler_150.setProperty("rev_vidaut");
                          __jsp_taghandler_150.setReadonly(true);
                          __jsp_taghandler_150.setSize("4");
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
                        out.write(__jsp_StaticText.text[162]);
                        /*@lineinfo:translated-code*//*@lineinfo:298^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_151=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_151.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_151.setKey("activos4.estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_151.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_151.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_151.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_151);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[163]);
                        /*@lineinfo:translated-code*//*@lineinfo:299^14*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_152=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_152.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_152.setDisabled(false);
                          __jsp_taghandler_152.setName("ActivosForm");
                          __jsp_taghandler_152.setProperty("rev_estadoactivo");
                          __jsp_tag_starteval=__jsp_taghandler_152.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_152,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[164]);
                              /*@lineinfo:translated-code*//*@lineinfo:300^14*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_153=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_153.setParent(__jsp_taghandler_152);
                                __jsp_taghandler_153.setCollection("EstadosLista");
                                __jsp_taghandler_153.setLabelProperty("desestado");
                                __jsp_taghandler_153.setProperty("estado");
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
                              out.write(__jsp_StaticText.text[165]);
                            /*@lineinfo:translated-code*//*@lineinfo:300^99*/                            } while (__jsp_taghandler_152.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_152.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_152);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[166]);
                        /*@lineinfo:translated-code*//*@lineinfo:306^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_154=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_154.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_154.setKey("activos4.desestado");
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
                        out.write(__jsp_StaticText.text[167]);
                        /*@lineinfo:translated-code*//*@lineinfo:307^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_155=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_155.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_155.setMaxlength("60");
                          __jsp_taghandler_155.setName("ActivosForm");
                          __jsp_taghandler_155.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_155.setProperty("rev_desestado");
                          __jsp_taghandler_155.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_155.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_155,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_155.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_155.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_155);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[168]);
                        /*@lineinfo:translated-code*//*@lineinfo:310^24*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_156=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_156.setParent(__jsp_taghandler_92);
                          __jsp_taghandler_156.setOnclick("operacion.value=2;opcion.value=2");
                          __jsp_taghandler_156.setProperty("boton");
                          __jsp_taghandler_156.setStyleClass("boton1");
                          __jsp_taghandler_156.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[169]);
                      /*@lineinfo:translated-code*//*@lineinfo:310^137*/                      } while (__jsp_taghandler_92.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[170]);
                  /*@lineinfo:translated-code*//*@lineinfo:314^4*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_157=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_157.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_157.setName("ActivosForm");
                    __jsp_taghandler_157.setProperty("opcion");
                    __jsp_taghandler_157.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_157.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[171]);
                        /*@lineinfo:translated-code*//*@lineinfo:317^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_158=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_158.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_158.setKey("activos4.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_158.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_158.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_158.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_158);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[172]);
                        /*@lineinfo:translated-code*//*@lineinfo:318^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_159=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_159.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_159.setMaxlength("10");
                          __jsp_taghandler_159.setName("ActivosForm");
                          __jsp_taghandler_159.setProperty("act_codrub");
                          __jsp_taghandler_159.setReadonly(true);
                          __jsp_taghandler_159.setSize("10");
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
                        out.write(__jsp_StaticText.text[173]);
                        /*@lineinfo:translated-code*//*@lineinfo:319^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_160=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_160.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_160.setMaxlength("60");
                          __jsp_taghandler_160.setName("ActivosForm");
                          __jsp_taghandler_160.setProperty("act_rubdescripcion");
                          __jsp_taghandler_160.setReadonly(true);
                          __jsp_taghandler_160.setSize("60");
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
                        out.write(__jsp_StaticText.text[174]);
                        /*@lineinfo:translated-code*//*@lineinfo:322^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_161=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_161.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_161.setKey("activos4.codreg");
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
                        out.write(__jsp_StaticText.text[175]);
                        /*@lineinfo:translated-code*//*@lineinfo:323^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_162=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_162.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_162.setMaxlength("10");
                          __jsp_taghandler_162.setName("ActivosForm");
                          __jsp_taghandler_162.setProperty("act_codreg");
                          __jsp_taghandler_162.setReadonly(true);
                          __jsp_taghandler_162.setSize("10");
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
                        out.write(__jsp_StaticText.text[176]);
                        /*@lineinfo:translated-code*//*@lineinfo:324^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_163=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_163.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_163.setMaxlength("60");
                          __jsp_taghandler_163.setName("ActivosForm");
                          __jsp_taghandler_163.setProperty("act_regdescripcion");
                          __jsp_taghandler_163.setReadonly(true);
                          __jsp_taghandler_163.setSize("60");
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
                        out.write(__jsp_StaticText.text[177]);
                        /*@lineinfo:translated-code*//*@lineinfo:327^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_164=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_164.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_164.setKey("activos4.codigo");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[178]);
                        /*@lineinfo:translated-code*//*@lineinfo:328^26*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_165=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_165.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_165.setMaxlength("5");
                          __jsp_taghandler_165.setName("ActivosForm");
                          __jsp_taghandler_165.setProperty("act_codigo");
                          __jsp_taghandler_165.setReadonly(true);
                          __jsp_taghandler_165.setSize("5");
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
                        out.write(__jsp_StaticText.text[179]);
                        /*@lineinfo:translated-code*//*@lineinfo:329^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_166=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_166.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_166.setMaxlength("10");
                          __jsp_taghandler_166.setName("ActivosForm");
                          __jsp_taghandler_166.setProperty("act_codbarra");
                          __jsp_taghandler_166.setReadonly(true);
                          __jsp_taghandler_166.setSize("10");
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
                        out.write(__jsp_StaticText.text[180]);
                        /*@lineinfo:translated-code*//*@lineinfo:332^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_167=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_167.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_167.setKey("activos4.codgrp");
                          __jsp_tag_starteval=__jsp_taghandler_167.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_167.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_167.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_167);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[181]);
                        /*@lineinfo:translated-code*//*@lineinfo:334^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_168=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_168.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_168.setMaxlength("40");
                          __jsp_taghandler_168.setName("ActivosForm");
                          __jsp_taghandler_168.setProperty("act_grpdescripcion");
                          __jsp_taghandler_168.setReadonly(true);
                          __jsp_taghandler_168.setSize("40");
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
                        out.write(__jsp_StaticText.text[182]);
                        /*@lineinfo:translated-code*//*@lineinfo:336^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_169=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_169.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_169.setKey("activos4.codpar");
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
                        out.write(__jsp_StaticText.text[183]);
                        /*@lineinfo:translated-code*//*@lineinfo:338^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_170=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_170.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_170.setMaxlength("40");
                          __jsp_taghandler_170.setName("ActivosForm");
                          __jsp_taghandler_170.setProperty("act_pardescripcion");
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
                        out.write(__jsp_StaticText.text[184]);
                        /*@lineinfo:translated-code*//*@lineinfo:342^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_171=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_171.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_171.setKey("activos4.codofi");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[185]);
                        /*@lineinfo:translated-code*//*@lineinfo:344^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_172=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_172.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_172.setMaxlength("40");
                          __jsp_taghandler_172.setName("ActivosForm");
                          __jsp_taghandler_172.setProperty("act_ofidescripcion");
                          __jsp_taghandler_172.setReadonly(true);
                          __jsp_taghandler_172.setSize("40");
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
                        out.write(__jsp_StaticText.text[186]);
                        /*@lineinfo:translated-code*//*@lineinfo:346^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_173=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_173.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_173.setKey("activos4.codfun");
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
                        out.write(__jsp_StaticText.text[187]);
                        /*@lineinfo:translated-code*//*@lineinfo:348^10*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_174=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_174.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_174.setMaxlength("40");
                          __jsp_taghandler_174.setName("ActivosForm");
                          __jsp_taghandler_174.setProperty("act_fundescripcion");
                          __jsp_taghandler_174.setReadonly(true);
                          __jsp_taghandler_174.setSize("40");
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
                        out.write(__jsp_StaticText.text[188]);
                        /*@lineinfo:translated-code*//*@lineinfo:352^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_175=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_175.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_175.setKey("activos4.codubi");
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
                        out.write(__jsp_StaticText.text[189]);
                        /*@lineinfo:translated-code*//*@lineinfo:354^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_176=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_176.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_176.setMaxlength("40");
                          __jsp_taghandler_176.setName("ActivosForm");
                          __jsp_taghandler_176.setProperty("act_ubidescripcion");
                          __jsp_taghandler_176.setReadonly(true);
                          __jsp_taghandler_176.setSize("40");
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
                        out.write(__jsp_StaticText.text[190]);
                        /*@lineinfo:translated-code*//*@lineinfo:356^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_177=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_177.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_177.setKey("activos4.codpry");
                          __jsp_tag_starteval=__jsp_taghandler_177.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_177.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_177.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_177);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[191]);
                        /*@lineinfo:translated-code*//*@lineinfo:358^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_178=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_178.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_178.setMaxlength("40");
                          __jsp_taghandler_178.setName("ActivosForm");
                          __jsp_taghandler_178.setProperty("act_prydescripcion");
                          __jsp_taghandler_178.setReadonly(true);
                          __jsp_taghandler_178.setSize("40");
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
                        out.write(__jsp_StaticText.text[192]);
                        /*@lineinfo:translated-code*//*@lineinfo:362^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_179=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_179.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_179.setKey("activos4.codfin");
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
                        out.write(__jsp_StaticText.text[193]);
                        /*@lineinfo:translated-code*//*@lineinfo:364^15*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_180=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_180.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_180.setMaxlength("40");
                          __jsp_taghandler_180.setName("ActivosForm");
                          __jsp_taghandler_180.setProperty("act_findescripcion");
                          __jsp_taghandler_180.setReadonly(true);
                          __jsp_taghandler_180.setSize("40");
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
                        out.write(__jsp_StaticText.text[194]);
                        /*@lineinfo:translated-code*//*@lineinfo:368^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_181=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_181.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_181.setKey("activos4.feccompra");
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
                        out.write(__jsp_StaticText.text[195]);
                        /*@lineinfo:translated-code*//*@lineinfo:369^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_182=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_182.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_182.setMaxlength("10");
                          __jsp_taghandler_182.setName("ActivosForm");
                          __jsp_taghandler_182.setProperty("act_feccompra");
                          __jsp_taghandler_182.setReadonly(true);
                          __jsp_taghandler_182.setSize("10");
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
                        out.write(__jsp_StaticText.text[196]);
                        /*@lineinfo:translated-code*//*@lineinfo:370^27*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_183=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_183.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_183.setKey("activos4.umanejo");
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
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[197]);
                        /*@lineinfo:translated-code*//*@lineinfo:371^14*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_184=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_184.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_184.setMaxlength("20");
                          __jsp_taghandler_184.setName("ActivosForm");
                          __jsp_taghandler_184.setProperty("act_umanejo");
                          __jsp_taghandler_184.setReadonly(true);
                          __jsp_taghandler_184.setSize("20");
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
                        out.write(__jsp_StaticText.text[198]);
                        /*@lineinfo:translated-code*//*@lineinfo:374^24*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_185=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_185.setParent(__jsp_taghandler_157);
                          __jsp_taghandler_185.setOnclick("operacion.value=2;opcion.value=3");
                          __jsp_taghandler_185.setProperty("boton");
                          __jsp_taghandler_185.setStyleClass("boton1");
                          __jsp_taghandler_185.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[199]);
                      /*@lineinfo:translated-code*//*@lineinfo:374^136*/                      } while (__jsp_taghandler_157.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_157.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_157);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[200]);
                /*@lineinfo:translated-code*//*@lineinfo:377^18*/                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[201]);
            /*@lineinfo:translated-code*//*@lineinfo:379^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_186=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_186.setParent(__jsp_taghandler_1);
              __jsp_taghandler_186.setName("ActivosForm");
              __jsp_taghandler_186.setProperty("operacion");
              __jsp_taghandler_186.setValue("2");
              __jsp_tag_starteval=__jsp_taghandler_186.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[202]);
                  /*@lineinfo:translated-code*//*@lineinfo:383^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_187=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_187.setParent(__jsp_taghandler_186);
                    __jsp_taghandler_187.setName("ActivosForm");
                    __jsp_taghandler_187.setProperty("opcion");
                    __jsp_taghandler_187.setValue("3");
                    __jsp_tag_starteval=__jsp_taghandler_187.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[203]);
                        /*@lineinfo:translated-code*//*@lineinfo:385^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_188=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_188.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_188.setKey("activos4.codrub");
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
                        out.write(__jsp_StaticText.text[204]);
                        /*@lineinfo:translated-code*//*@lineinfo:386^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_189=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_189.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_189.setDisabled(false);
                          __jsp_taghandler_189.setName("ActivosForm");
                          __jsp_taghandler_189.setProperty("act_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_189.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_189,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[205]);
                              /*@lineinfo:translated-code*//*@lineinfo:387^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_190=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_190.setParent(__jsp_taghandler_189);
                                __jsp_taghandler_190.setCollection("RubrosLista");
                                __jsp_taghandler_190.setLabelProperty("descripcion");
                                __jsp_taghandler_190.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_190.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_190.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_190.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_190);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[206]);
                            /*@lineinfo:translated-code*//*@lineinfo:387^102*/                            } while (__jsp_taghandler_189.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_189.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_189);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[207]);
                        /*@lineinfo:translated-code*//*@lineinfo:391^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_191=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_191.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_191.setKey("activos4.codreg");
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
                        out.write(__jsp_StaticText.text[208]);
                        /*@lineinfo:translated-code*//*@lineinfo:392^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_192=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_192.setParent(__jsp_taghandler_187);
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
                        /*@lineinfo:translated-code*//*@lineinfo:393^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_193=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_193.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_193.setMaxlength("30");
                          __jsp_taghandler_193.setName("ActivosForm");
                          __jsp_taghandler_193.setProperty("act_regdescripcion");
                          __jsp_taghandler_193.setReadonly(true);
                          __jsp_taghandler_193.setSize("30");
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
                        /*@lineinfo:translated-code*//*@lineinfo:396^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_194=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_194.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_194.setKey("activos4.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_194.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_194.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_194.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_194);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[211]);
                        /*@lineinfo:translated-code*//*@lineinfo:397^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_195=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_195.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_195.setName("ActivosForm");
                          __jsp_taghandler_195.setProperty("act_codfin");
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
                        /*@lineinfo:translated-code*//*@lineinfo:398^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_196=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_196.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_196.setMaxlength("30");
                          __jsp_taghandler_196.setName("ActivosForm");
                          __jsp_taghandler_196.setProperty("act_findescripcion");
                          __jsp_taghandler_196.setReadonly(true);
                          __jsp_taghandler_196.setSize("30");
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
                        out.write(__jsp_StaticText.text[213]);
                        /*@lineinfo:translated-code*//*@lineinfo:401^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_197=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_197.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_197.setKey("activos4.descripcion");
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
                        out.write(__jsp_StaticText.text[214]);
                        /*@lineinfo:translated-code*//*@lineinfo:402^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_198=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size value");
                          __jsp_taghandler_198.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_198.setMaxlength("120");
                          __jsp_taghandler_198.setName("ActivosForm");
                          __jsp_taghandler_198.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_198.setProperty("act_descripcion");
                          __jsp_taghandler_198.setSize("60");
                          __jsp_taghandler_198.setValue("%");
                          __jsp_tag_starteval=__jsp_taghandler_198.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_198,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_198.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_198.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_198);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[215]);
                        /*@lineinfo:translated-code*//*@lineinfo:407^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_199=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_199.setParent(__jsp_taghandler_187);
                          __jsp_taghandler_199.setOnclick("operacion.value=3;opcion.value=3");
                          __jsp_taghandler_199.setProperty("boton");
                          __jsp_taghandler_199.setStyleClass("boton1");
                          __jsp_taghandler_199.setValue("Eliminar");
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
                        out.write(__jsp_StaticText.text[216]);
                      /*@lineinfo:translated-code*//*@lineinfo:407^123*/                      } while (__jsp_taghandler_187.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_187.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_187);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[217]);
                  /*@lineinfo:translated-code*//*@lineinfo:411^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_200=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_200.setParent(__jsp_taghandler_186);
                    __jsp_taghandler_200.setName("ActivosForm");
                    __jsp_taghandler_200.setProperty("opcion");
                    __jsp_taghandler_200.setValue("2");
                    __jsp_tag_starteval=__jsp_taghandler_200.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[218]);
                        /*@lineinfo:translated-code*//*@lineinfo:413^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_201=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_201.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_201.setKey("activos4.codrub");
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
                        out.write(__jsp_StaticText.text[219]);
                        /*@lineinfo:translated-code*//*@lineinfo:414^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_202=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_202.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_202.setDisabled(false);
                          __jsp_taghandler_202.setName("ActivosForm");
                          __jsp_taghandler_202.setProperty("act_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_202.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_202,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[220]);
                              /*@lineinfo:translated-code*//*@lineinfo:415^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_203=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_203.setParent(__jsp_taghandler_202);
                                __jsp_taghandler_203.setCollection("RubrosLista");
                                __jsp_taghandler_203.setLabelProperty("descripcion");
                                __jsp_taghandler_203.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_203.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_203.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_203.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_203);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[221]);
                            /*@lineinfo:translated-code*//*@lineinfo:415^102*/                            } while (__jsp_taghandler_202.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_202.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_202);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[222]);
                        /*@lineinfo:translated-code*//*@lineinfo:419^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_204=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_204.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_204.setKey("activos4.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_204.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_204.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_204.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_204);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[223]);
                        /*@lineinfo:translated-code*//*@lineinfo:420^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_205=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_205.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_205.setName("ActivosForm");
                          __jsp_taghandler_205.setProperty("act_codreg");
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
                        out.write(__jsp_StaticText.text[224]);
                        /*@lineinfo:translated-code*//*@lineinfo:421^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_206=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_206.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_206.setMaxlength("30");
                          __jsp_taghandler_206.setName("ActivosForm");
                          __jsp_taghandler_206.setProperty("act_regdescripcion");
                          __jsp_taghandler_206.setReadonly(true);
                          __jsp_taghandler_206.setSize("30");
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
                        out.write(__jsp_StaticText.text[225]);
                        /*@lineinfo:translated-code*//*@lineinfo:424^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_207=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_207.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_207.setKey("activos4.codfin");
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
                        out.write(__jsp_StaticText.text[226]);
                        /*@lineinfo:translated-code*//*@lineinfo:425^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_208=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_208.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_208.setName("ActivosForm");
                          __jsp_taghandler_208.setProperty("act_codfin");
                          __jsp_tag_starteval=__jsp_taghandler_208.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_208,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_208.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_208.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_208);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[227]);
                        /*@lineinfo:translated-code*//*@lineinfo:426^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_209=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_209.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_209.setMaxlength("30");
                          __jsp_taghandler_209.setName("ActivosForm");
                          __jsp_taghandler_209.setProperty("act_findescripcion");
                          __jsp_taghandler_209.setReadonly(true);
                          __jsp_taghandler_209.setSize("30");
                          __jsp_tag_starteval=__jsp_taghandler_209.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_209,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_209.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_209.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_209);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[228]);
                        /*@lineinfo:translated-code*//*@lineinfo:429^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_210=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_210.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_210.setKey("activos4.descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_210.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_210.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_210.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_210);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[229]);
                        /*@lineinfo:translated-code*//*@lineinfo:430^16*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_211=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name onchange property size");
                          __jsp_taghandler_211.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_211.setMaxlength("120");
                          __jsp_taghandler_211.setName("ActivosForm");
                          __jsp_taghandler_211.setOnchange("javascript:this.value=this.value.toUpperCase();");
                          __jsp_taghandler_211.setProperty("act_descripcion");
                          __jsp_taghandler_211.setSize("60");
                          __jsp_tag_starteval=__jsp_taghandler_211.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_211,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_211.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_211.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_211);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[230]);
                        /*@lineinfo:translated-code*//*@lineinfo:435^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_212=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_212.setParent(__jsp_taghandler_200);
                          __jsp_taghandler_212.setOnclick("operacion.value=3;opcion.value=2");
                          __jsp_taghandler_212.setProperty("boton");
                          __jsp_taghandler_212.setStyleClass("boton1");
                          __jsp_taghandler_212.setValue("Modificar");
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
                        out.write(__jsp_StaticText.text[231]);
                      /*@lineinfo:translated-code*//*@lineinfo:435^124*/                      } while (__jsp_taghandler_200.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_200.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_200);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[232]);
                  /*@lineinfo:translated-code*//*@lineinfo:439^6*/                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_213=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                    __jsp_taghandler_213.setParent(__jsp_taghandler_186);
                    __jsp_taghandler_213.setName("ActivosForm");
                    __jsp_taghandler_213.setProperty("opcion");
                    __jsp_taghandler_213.setValue("1");
                    __jsp_tag_starteval=__jsp_taghandler_213.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[233]);
                        /*@lineinfo:translated-code*//*@lineinfo:441^29*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_214=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_214.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_214.setKey("activos4.codrub");
                          __jsp_tag_starteval=__jsp_taghandler_214.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_214.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_214.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_214);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[234]);
                        /*@lineinfo:translated-code*//*@lineinfo:442^16*/                        {
                          org.apache.struts.taglib.html.SelectTag __jsp_taghandler_215=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
                          __jsp_taghandler_215.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_215.setDisabled(false);
                          __jsp_taghandler_215.setName("ActivosForm");
                          __jsp_taghandler_215.setProperty("act_codrub");
                          __jsp_tag_starteval=__jsp_taghandler_215.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_215,__jsp_tag_starteval,out);
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[235]);
                              /*@lineinfo:translated-code*//*@lineinfo:443^16*/                              {
                                org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_216=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                __jsp_taghandler_216.setParent(__jsp_taghandler_215);
                                __jsp_taghandler_216.setCollection("RubrosLista");
                                __jsp_taghandler_216.setLabelProperty("descripcion");
                                __jsp_taghandler_216.setProperty("codigo");
                                __jsp_tag_starteval=__jsp_taghandler_216.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                  } while (__jsp_taghandler_216.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_216.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_216);
                              }
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[236]);
                            /*@lineinfo:translated-code*//*@lineinfo:443^102*/                            } while (__jsp_taghandler_215.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_215.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_215);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[237]);
                        /*@lineinfo:translated-code*//*@lineinfo:447^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_217=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_217.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_217.setKey("activos4.codreg");
                          __jsp_tag_starteval=__jsp_taghandler_217.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_217.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_217.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_217);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[238]);
                        /*@lineinfo:translated-code*//*@lineinfo:448^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_218=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_218.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_218.setName("ActivosForm");
                          __jsp_taghandler_218.setProperty("act_codreg");
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
                        out.write(__jsp_StaticText.text[239]);
                        /*@lineinfo:translated-code*//*@lineinfo:449^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_219=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_219.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_219.setMaxlength("30");
                          __jsp_taghandler_219.setName("ActivosForm");
                          __jsp_taghandler_219.setProperty("act_regdescripcion");
                          __jsp_taghandler_219.setReadonly(true);
                          __jsp_taghandler_219.setSize("30");
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
                        out.write(__jsp_StaticText.text[240]);
                        /*@lineinfo:translated-code*//*@lineinfo:452^30*/                        {
                          org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_220=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                          __jsp_taghandler_220.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_220.setKey("activos4.codfin");
                          __jsp_tag_starteval=__jsp_taghandler_220.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_220.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_220.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_220);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[241]);
                        /*@lineinfo:translated-code*//*@lineinfo:453^17*/                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_221=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                          __jsp_taghandler_221.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_221.setName("ActivosForm");
                          __jsp_taghandler_221.setProperty("act_codfin");
                          __jsp_tag_starteval=__jsp_taghandler_221.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_221,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_221.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_221.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_221);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[242]);
                        /*@lineinfo:translated-code*//*@lineinfo:454^13*/                        {
                          org.apache.struts.taglib.html.TextTag __jsp_taghandler_222=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength name property readonly size");
                          __jsp_taghandler_222.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_222.setMaxlength("30");
                          __jsp_taghandler_222.setName("ActivosForm");
                          __jsp_taghandler_222.setProperty("act_findescripcion");
                          __jsp_taghandler_222.setReadonly(true);
                          __jsp_taghandler_222.setSize("30");
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
                        out.write(__jsp_StaticText.text[243]);
                        /*@lineinfo:translated-code*//*@lineinfo:459^12*/                        {
                          org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_223=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag onclick property styleClass value");
                          __jsp_taghandler_223.setParent(__jsp_taghandler_213);
                          __jsp_taghandler_223.setOnclick("operacion.value=1;opcion.value=1");
                          __jsp_taghandler_223.setProperty("boton");
                          __jsp_taghandler_223.setStyleClass("boton1");
                          __jsp_taghandler_223.setValue("Insertar");
                          __jsp_tag_starteval=__jsp_taghandler_223.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_223,__jsp_tag_starteval,out);
                            do {
                            } while (__jsp_taghandler_223.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_223.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_223);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[244]);
                      /*@lineinfo:translated-code*//*@lineinfo:459^123*/                      } while (__jsp_taghandler_213.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_213.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_213);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[245]);
                /*@lineinfo:translated-code*//*@lineinfo:462^20*/                } while (__jsp_taghandler_186.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_186.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_186);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[246]);
            /*@lineinfo:translated-code*//*@lineinfo:467^1*/            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_224=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_224.setParent(__jsp_taghandler_1);
              __jsp_taghandler_224.setName("ActivosForm");
              __jsp_taghandler_224.setProperty("operacion");
              __jsp_taghandler_224.setValue("3");
              __jsp_tag_starteval=__jsp_taghandler_224.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[247]);
                  /*@lineinfo:translated-code*//*@lineinfo:473^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_225=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_225.setParent(__jsp_taghandler_224);
                    __jsp_taghandler_225.setName("ActivosForm");
                    __jsp_taghandler_225.setProperty("act_codrub");
                    __jsp_tag_starteval=__jsp_taghandler_225.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_225,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_225.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_225.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_225);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[248]);
                  /*@lineinfo:translated-code*//*@lineinfo:474^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_226=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_226.setParent(__jsp_taghandler_224);
                    __jsp_taghandler_226.setName("ActivosForm");
                    __jsp_taghandler_226.setProperty("act_codreg");
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
                  out.write(__jsp_StaticText.text[249]);
                  /*@lineinfo:translated-code*//*@lineinfo:475^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_227=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_227.setParent(__jsp_taghandler_224);
                    __jsp_taghandler_227.setName("ActivosForm");
                    __jsp_taghandler_227.setProperty("act_codgrp");
                    __jsp_tag_starteval=__jsp_taghandler_227.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_227,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_227.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_227.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_227);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[250]);
                  /*@lineinfo:translated-code*//*@lineinfo:476^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_228=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_228.setParent(__jsp_taghandler_224);
                    __jsp_taghandler_228.setName("ActivosForm");
                    __jsp_taghandler_228.setProperty("act_codfin");
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
                  out.write(__jsp_StaticText.text[251]);
                  /*@lineinfo:translated-code*//*@lineinfo:477^6*/                  {
                    org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_229=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag name property");
                    __jsp_taghandler_229.setParent(__jsp_taghandler_224);
                    __jsp_taghandler_229.setName("ActivosForm");
                    __jsp_taghandler_229.setProperty("act_descripcion");
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
                  out.write(__jsp_StaticText.text[252]);
                  /*@lineinfo:user-code*//*@lineinfo:485^7*/                   int pnum=0;
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[253]);
                  /*@lineinfo:translated-code*//*@lineinfo:486^7*/                  {
                    org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_230=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id name");
                    __jsp_taghandler_230.setParent(__jsp_taghandler_224);
                    __jsp_taghandler_230.setId("lista");
                    __jsp_taghandler_230.setName("Activos3Lista");
                    java.lang.Object lista = null;
                    __jsp_tag_starteval=__jsp_taghandler_230.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_230,__jsp_tag_starteval,out);
                      do {
                        lista = (java.lang.Object) pageContext.findAttribute("lista");
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[254]);
                        /*@lineinfo:user-code*//*@lineinfo:487^9*/                         if (pnum==1) {
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[255]);
                        /*@lineinfo:user-code*//*@lineinfo:489^9*/                         } else { 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[256]);
                        /*@lineinfo:user-code*//*@lineinfo:491^9*/                         } 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[257]);
                        /*@lineinfo:translated-code*//*@lineinfo:492^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_231=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_231.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_231.setName("lista");
                          __jsp_taghandler_231.setProperty("codrub");
                          __jsp_tag_starteval=__jsp_taghandler_231.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_231.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_231.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_231);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[258]);
                        /*@lineinfo:translated-code*//*@lineinfo:492^62*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_232=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_232.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_232.setName("lista");
                          __jsp_taghandler_232.setProperty("codreg");
                          __jsp_tag_starteval=__jsp_taghandler_232.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_232.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_232.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_232);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[259]);
                        /*@lineinfo:translated-code*//*@lineinfo:492^108*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_233=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_233.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_233.setName("lista");
                          __jsp_taghandler_233.setProperty("ceros");
                          __jsp_tag_starteval=__jsp_taghandler_233.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_233.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_233.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_233);
                        }
/*@lineinfo:492^152*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_234=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_234.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_234.setName("lista");
                          __jsp_taghandler_234.setProperty("codigo");
                          __jsp_tag_starteval=__jsp_taghandler_234.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_234.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_234.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_234);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[260]);
                        /*@lineinfo:translated-code*//*@lineinfo:493^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_235=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_235.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_235.setName("lista");
                          __jsp_taghandler_235.setProperty("descodgrp");
                          __jsp_tag_starteval=__jsp_taghandler_235.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_235.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_235.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_235);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[261]);
                        /*@lineinfo:translated-code*//*@lineinfo:494^16*/                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_236=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                          __jsp_taghandler_236.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_236.setName("lista");
                          __jsp_taghandler_236.setProperty("descripcion");
                          __jsp_tag_starteval=__jsp_taghandler_236.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                            } while (__jsp_taghandler_236.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_236.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_236);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[262]);
                        /*@lineinfo:translated-code*//*@lineinfo:495^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_237=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_237.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_237.setName("ActivosForm");
                          __jsp_taghandler_237.setProperty("opcion");
                          __jsp_taghandler_237.setValue("5");
                          __jsp_tag_starteval=__jsp_taghandler_237.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[263]);
                              /*@lineinfo:translated-code*//*@lineinfo:496^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_238=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_238.setParent(__jsp_taghandler_237);
                                __jsp_taghandler_238.setIndexed(true);
                                __jsp_taghandler_238.setOnclick("operacion.value=1;opcion.value=5");
                                __jsp_taghandler_238.setProperty("boton");
                                __jsp_taghandler_238.setStyleClass("boton1");
                                __jsp_taghandler_238.setValue("Reportar");
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
                              out.write(__jsp_StaticText.text[264]);
                            /*@lineinfo:translated-code*//*@lineinfo:496^159*/                            } while (__jsp_taghandler_237.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_237.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_237);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[265]);
                        /*@lineinfo:translated-code*//*@lineinfo:498^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_239=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_239.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_239.setName("ActivosForm");
                          __jsp_taghandler_239.setProperty("opcion");
                          __jsp_taghandler_239.setValue("3");
                          __jsp_tag_starteval=__jsp_taghandler_239.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[266]);
                              /*@lineinfo:translated-code*//*@lineinfo:499^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_240=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_240.setParent(__jsp_taghandler_239);
                                __jsp_taghandler_240.setIndexed(true);
                                __jsp_taghandler_240.setOnclick("operacion.value=1;opcion.value=3");
                                __jsp_taghandler_240.setProperty("boton");
                                __jsp_taghandler_240.setStyleClass("boton1");
                                __jsp_taghandler_240.setValue("Eliminar");
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
                              out.write(__jsp_StaticText.text[267]);
                            /*@lineinfo:translated-code*//*@lineinfo:499^159*/                            } while (__jsp_taghandler_239.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_239.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_239);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[268]);
                        /*@lineinfo:translated-code*//*@lineinfo:501^12*/                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_241=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_241.setParent(__jsp_taghandler_230);
                          __jsp_taghandler_241.setName("ActivosForm");
                          __jsp_taghandler_241.setProperty("opcion");
                          __jsp_taghandler_241.setValue("2");
                          __jsp_tag_starteval=__jsp_taghandler_241.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              /*@lineinfo:generated-code*/
                              out.write(__jsp_StaticText.text[269]);
                              /*@lineinfo:translated-code*//*@lineinfo:502^33*/                              {
                                org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_242=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag indexed onclick property styleClass value");
                                __jsp_taghandler_242.setParent(__jsp_taghandler_241);
                                __jsp_taghandler_242.setIndexed(true);
                                __jsp_taghandler_242.setOnclick("operacion.value=1;opcion.value=2");
                                __jsp_taghandler_242.setProperty("boton");
                                __jsp_taghandler_242.setStyleClass("boton1");
                                __jsp_taghandler_242.setValue("Modificar");
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
                              out.write(__jsp_StaticText.text[270]);
                            /*@lineinfo:translated-code*//*@lineinfo:502^160*/                            } while (__jsp_taghandler_241.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_241.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_241);
                        }
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[271]);
                        /*@lineinfo:user-code*//*@lineinfo:505^10*/                         if (pnum==0) pnum=1; else pnum=0; 
                        /*@lineinfo:generated-code*/
                        out.write(__jsp_StaticText.text[272]);
                      /*@lineinfo:translated-code*//*@lineinfo:505^49*/                      } while (__jsp_taghandler_230.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_230.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_230);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[273]);
                /*@lineinfo:translated-code*//*@lineinfo:506^23*/                } while (__jsp_taghandler_224.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_224.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_224);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[274]);
          /*@lineinfo:translated-code*//*@lineinfo:513^15*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[275]);


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
    private static final char text[][]=new char[276][];
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
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-125\">\n   <meta http-equiv=\"Expires\" content=\"-1\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones2.js?1.3\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  function pantallaCompleta(pagina) {\n    var ancho = window.screen.availWidth - 50;\n    var alto = window.screen.availHeight - 150;\n    var omenu = window.open(pagina, \"_blank\", \"width=\"+ancho+\", height=\"+alto+\",left=20,top=20,status=yes,resizable=yes,titlebar=yes,scrollbars=yes,dependent=yes\");\n    omenu.focus();\n  }\n</script>\n<body>\n<table border=\"1\" width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n<caption>Activos</caption>\n<tr><td>\n".toCharArray();
      text[5] = 
      "\n".toCharArray();
      text[6] = 
      "\n".toCharArray();
      text[7] = 
      "\n".toCharArray();
      text[8] = 
      "\n   ".toCharArray();
      text[9] = 
      "\n   ".toCharArray();
      text[10] = 
      "\n   ".toCharArray();
      text[11] = 
      "\n   ".toCharArray();
      text[12] = 
      "\n   ".toCharArray();
      text[13] = 
      "\n   ".toCharArray();
      text[14] = 
      "\n   ".toCharArray();
      text[15] = 
      "\n   ".toCharArray();
      text[16] = 
      "\n   ".toCharArray();
      text[17] = 
      "\n   ".toCharArray();
      text[18] = 
      "\n   ".toCharArray();
      text[19] = 
      "\n   ".toCharArray();
      text[20] = 
      "\n   ".toCharArray();
      text[21] = 
      "\n   ".toCharArray();
      text[22] = 
      "\n   ".toCharArray();
      text[23] = 
      "\n   ".toCharArray();
      text[24] = 
      "\n   ".toCharArray();
      text[25] = 
      "\n   ".toCharArray();
      text[26] = 
      "\n   ".toCharArray();
      text[27] = 
      "\n   ".toCharArray();
      text[28] = 
      "\n   ".toCharArray();
      text[29] = 
      "\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[30] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[31] = 
      "\n         ".toCharArray();
      text[32] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[33] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[34] = 
      "\n         ".toCharArray();
      text[35] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[36] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[37] = 
      "\n         ".toCharArray();
      text[38] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[39] = 
      "</td>\n         <td>".toCharArray();
      text[40] = 
      "\n              ".toCharArray();
      text[41] = 
      "\n              ".toCharArray();
      text[42] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[43] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[44] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[45] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[46] = 
      "            \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[47] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[48] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[49] = 
      "</td>\n         <td>".toCharArray();
      text[50] = 
      "\n              ".toCharArray();
      text[51] = 
      "\n              ".toCharArray();
      text[52] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[53] = 
      "</td>\n         <td>".toCharArray();
      text[54] = 
      "\n              ".toCharArray();
      text[55] = 
      "\n              ".toCharArray();
      text[56] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[57] = 
      "</td>\n         <td>".toCharArray();
      text[58] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[59] = 
      "</td>\n         <td>".toCharArray();
      text[60] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[61] = 
      "</td>\n         <td>".toCharArray();
      text[62] = 
      "</td>\n      </tr>\n      </table>\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[63] = 
      "</td>\n         <td>".toCharArray();
      text[64] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[65] = 
      "</td>\n         <td>".toCharArray();
      text[66] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">*\n            ".toCharArray();
      text[67] = 
      "\n         </td>\n         <td>\n            ".toCharArray();
      text[68] = 
      "\n         </td>\n      </tr>      \n      </table>\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[69] = 
      "*".toCharArray();
      text[70] = 
      "</td>\n         <td>".toCharArray();
      text[71] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[72] = 
      "</td>\n         <td>".toCharArray();
      text[73] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[74] = 
      "</td>\n         <td>".toCharArray();
      text[75] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[76] = 
      "</td>\n         <td>".toCharArray();
      text[77] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[78] = 
      "</td>\n         <td>".toCharArray();
      text[79] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[80] = 
      "</td>\n         <td>".toCharArray();
      text[81] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[82] = 
      "</td>\n         <td>".toCharArray();
      text[83] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[84] = 
      "</td>\n         <td>".toCharArray();
      text[85] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[86] = 
      "</td>\n         <td>".toCharArray();
      text[87] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[88] = 
      "</td>\n         <td>".toCharArray();
      text[89] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[90] = 
      "</td>\n         <td>".toCharArray();
      text[91] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[92] = 
      "</td>\n         <td>".toCharArray();
      text[93] = 
      "\n             ".toCharArray();
      text[94] = 
      "\n             ".toCharArray();
      text[95] = 
      "\n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[96] = 
      "</td>\n         <td>".toCharArray();
      text[97] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=2>".toCharArray();
      text[98] = 
      "</td>\n      </tr>      \n      <tr>\n        <td colspan=\"4\">\n           <FONT color=\"#FF0000\" face=\"Arial, Helvetica, san-serif\" size=2> \n           ".toCharArray();
      text[99] = 
      "\n           No se olvide verificar la existencia del tipo de cambio para la fecha de compra y la fecha de activación\n           ".toCharArray();
      text[100] = 
      "\n           </FONT>\n        </td>\n      </tr>       \n      </table>\n   ".toCharArray();
      text[101] = 
      "\n   ".toCharArray();
      text[102] = 
      "\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[103] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[104] = 
      "\n         ".toCharArray();
      text[105] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
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
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[112] = 
      "</td>\n         <td>\n            ".toCharArray();
      text[113] = 
      "\n               ".toCharArray();
      text[114] = 
      "\n            ".toCharArray();
      text[115] = 
      "\n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[116] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[117] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[118] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[119] = 
      "            \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[120] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[121] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[122] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[123] = 
      " \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[124] = 
      "</td>\n         <td>".toCharArray();
      text[125] = 
      "\n              ".toCharArray();
      text[126] = 
      "\n              ".toCharArray();
      text[127] = 
      "\n         </td>         \n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[128] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[129] = 
      " \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[130] = 
      "</td>\n         <td>".toCharArray();
      text[131] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[132] = 
      "</td>\n         <td>".toCharArray();
      text[133] = 
      "</td>\n      </tr>      \n      </table>\n     <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[134] = 
      "</td>\n         <td>".toCharArray();
      text[135] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[136] = 
      "</td>\n         <td>".toCharArray();
      text[137] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">*\n            ".toCharArray();
      text[138] = 
      "\n         </td>\n         <td>\n            ".toCharArray();
      text[139] = 
      "\n         </td>\n      </tr>            \n      </table>\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[140] = 
      "*".toCharArray();
      text[141] = 
      "</td>\n         <td>".toCharArray();
      text[142] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[143] = 
      "</td>\n         <td>".toCharArray();
      text[144] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[145] = 
      "</td>\n         <td>".toCharArray();
      text[146] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[147] = 
      "</td>\n         <td>".toCharArray();
      text[148] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[149] = 
      "</td>\n         <td>".toCharArray();
      text[150] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[151] = 
      "</td>\n         <td>".toCharArray();
      text[152] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[153] = 
      "</td>\n         <td>".toCharArray();
      text[154] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[155] = 
      "</td>\n         <td>".toCharArray();
      text[156] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[157] = 
      "</td>\n         <td>".toCharArray();
      text[158] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[159] = 
      "</td>\n         <td>".toCharArray();
      text[160] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[161] = 
      "</td>\n         <td>".toCharArray();
      text[162] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[163] = 
      "</td>\n         <td>".toCharArray();
      text[164] = 
      "\n             ".toCharArray();
      text[165] = 
      "\n             ".toCharArray();
      text[166] = 
      "\n         </td>\n      </tr>\n      \n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[167] = 
      "</td>\n         <td>".toCharArray();
      text[168] = 
      "</td>\n      </tr>\n      <tr>\n         <td colspan=2>".toCharArray();
      text[169] = 
      "</td>\n      </tr>        \n      </table>      \n   ".toCharArray();
      text[170] = 
      "   \n   ".toCharArray();
      text[171] = 
      "\n      <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[172] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[173] = 
      "\n         ".toCharArray();
      text[174] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[175] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[176] = 
      "\n         ".toCharArray();
      text[177] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[178] = 
      "</td>\n         <td colspan=\"3\">".toCharArray();
      text[179] = 
      "\n         ".toCharArray();
      text[180] = 
      "</td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[181] = 
      "</td>\n         <td>\n             ".toCharArray();
      text[182] = 
      " \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[183] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[184] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[185] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[186] = 
      "            \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[187] = 
      "</td>\n         <td>\n         ".toCharArray();
      text[188] = 
      "            \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[189] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[190] = 
      " \n         </td>\n         <td class=\"S10d\">".toCharArray();
      text[191] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[192] = 
      " \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[193] = 
      "</td>\n         <td>\n              ".toCharArray();
      text[194] = 
      " \n         </td>\n      </tr>\n      <tr>\n         <td class=\"S10d\">".toCharArray();
      text[195] = 
      "</td>\n         <td>".toCharArray();
      text[196] = 
      "</td>\n         <td class=\"S10d\">".toCharArray();
      text[197] = 
      "</td>\n         <td>".toCharArray();
      text[198] = 
      "</td>\n      </tr>      \n      <tr>\n         <td colspan=2>".toCharArray();
      text[199] = 
      "</td>\n      </tr>            \n      </table>\n   ".toCharArray();
      text[200] = 
      "\n".toCharArray();
      text[201] = 
      "\n".toCharArray();
      text[202] = 
      "\n   <table width=\"100%\" align=\"center\"  class=\"soloborde\" bgcolor=\"#C1C1FF\">\n   <tr class=\"T8a\">\n     <td>\n     ".toCharArray();
      text[203] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[204] = 
      "</td>\n           <td>".toCharArray();
      text[205] = 
      "\n               ".toCharArray();
      text[206] = 
      "\n              ".toCharArray();
      text[207] = 
      "</td>           \n        </tr>\n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[208] = 
      "</td>\n            <td>".toCharArray();
      text[209] = 
      "\n            ".toCharArray();
      text[210] = 
      "</td>\n        </tr>  \n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[211] = 
      "</td>\n            <td>".toCharArray();
      text[212] = 
      "\n            ".toCharArray();
      text[213] = 
      "</td>\n        </tr>  \n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[214] = 
      " % = Comodin</td>\n           <td>".toCharArray();
      text[215] = 
      "</td>\n        </tr>\n        <tr>\n           <td></td>\n           <td align=\"left\">\n           ".toCharArray();
      text[216] = 
      "\n        </td>\n        </tr>\n     ".toCharArray();
      text[217] = 
      "\n     ".toCharArray();
      text[218] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[219] = 
      "</td>\n           <td>".toCharArray();
      text[220] = 
      "\n               ".toCharArray();
      text[221] = 
      "\n              ".toCharArray();
      text[222] = 
      "</td>           \n        </tr>\n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[223] = 
      "</td>\n            <td>".toCharArray();
      text[224] = 
      "\n            ".toCharArray();
      text[225] = 
      "</td>\n        </tr>  \n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[226] = 
      "</td>\n            <td>".toCharArray();
      text[227] = 
      "\n            ".toCharArray();
      text[228] = 
      "</td>\n        </tr>  \n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[229] = 
      " % = Comodin</td>\n           <td>".toCharArray();
      text[230] = 
      "</td>\n        </tr>\n        <tr>\n           <td></td>\n           <td align=\"left\">\n           ".toCharArray();
      text[231] = 
      "\n        </td>\n        </tr>\n     ".toCharArray();
      text[232] = 
      "\n     ".toCharArray();
      text[233] = 
      "\n        <tr>\n           <td class=\"S10d\">".toCharArray();
      text[234] = 
      "</td>\n           <td>".toCharArray();
      text[235] = 
      "\n               ".toCharArray();
      text[236] = 
      "\n              ".toCharArray();
      text[237] = 
      "</td>           \n        </tr>\n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[238] = 
      "</td>\n            <td>".toCharArray();
      text[239] = 
      "\n            ".toCharArray();
      text[240] = 
      "</td>\n        </tr>         \n        <tr>\n            <td class=\"S10d\">".toCharArray();
      text[241] = 
      "</td>\n            <td>".toCharArray();
      text[242] = 
      "\n            ".toCharArray();
      text[243] = 
      "</td>\n        </tr>         \n        <tr>\n           <td></td>\n           <td align=\"left\">\n           ".toCharArray();
      text[244] = 
      "\n           </td>\n        </tr>\n     ".toCharArray();
      text[245] = 
      "\n     </td>\n   </tr>\n   </table>\n".toCharArray();
      text[246] = 
      "\n".toCharArray();
      text[247] = 
      "\n<table width=\"100%\" align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n  <tr class=\"T8a\">\n     <td>\n     <table width=\"100%\" align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\" border=\"1\">\n     <tr><td>\n     ".toCharArray();
      text[248] = 
      "\n     ".toCharArray();
      text[249] = 
      "\n     ".toCharArray();
      text[250] = 
      "\n     ".toCharArray();
      text[251] = 
      "     \n     ".toCharArray();
      text[252] = 
      "     \n      <table width=\"100%\" class=\"soloborde\" bgcolor=\"#C1C1FF\">\n       <tr class=\"FondoAzul\">\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Código</td>\n         <td width=\"60\" scope=\"col\" class=\"S10c\">Grupo</td>         \n         <td width=\"160\" scope=\"col\" class=\"S10c\">Descripción</td>\n         <td></td>\n       </tr>\n      ".toCharArray();
      text[253] = 
      "\n      ".toCharArray();
      text[254] = 
      "\n        ".toCharArray();
      text[255] = 
      "\n           <tr class=\"T8b\">\n        ".toCharArray();
      text[256] = 
      "\n           <tr class=\"T8a\">\n        ".toCharArray();
      text[257] = 
      "\n           <td>".toCharArray();
      text[258] = 
      "-".toCharArray();
      text[259] = 
      "-".toCharArray();
      text[260] = 
      "</td>\n           <td>".toCharArray();
      text[261] = 
      "</td>\n           <td>".toCharArray();
      text[262] = 
      "</td>\n           ".toCharArray();
      text[263] = 
      "\n              <td align=\"right\">".toCharArray();
      text[264] = 
      "</td>\n           ".toCharArray();
      text[265] = 
      "\n           ".toCharArray();
      text[266] = 
      "\n              <td align=\"right\">".toCharArray();
      text[267] = 
      "</td>\n           ".toCharArray();
      text[268] = 
      "     \n           ".toCharArray();
      text[269] = 
      "\n              <td align=\"right\">".toCharArray();
      text[270] = 
      "</td>\n           ".toCharArray();
      text[271] = 
      "     \n         </tr>\n         ".toCharArray();
      text[272] = 
      "\n      ".toCharArray();
      text[273] = 
      "\n      </table>\n     </td></tr>     \n     </table>\n     </td>\n   </tr>\n</table>   \n".toCharArray();
      text[274] = 
      "\n".toCharArray();
      text[275] = 
      "\n</td></tr>\n<tr><td align=\"center\" colspan=\"2\" class=\"S10d\">(*) Campos Obligatorios</td></tr>\n</table>\n</body>\n</html>".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
