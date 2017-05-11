  /*@lineinfo:filename=/pedirregional.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _pedirregional extends oracle.jsp.runtime.HttpJsp {

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
    _pedirregional page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:44^1*/      {
        org.apache.struts.taglib.html.ErrorsTag __jsp_taghandler_1=(org.apache.struts.taglib.html.ErrorsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.ErrorsTag.class,"org.apache.struts.taglib.html.ErrorsTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[3]);
      /*@lineinfo:translated-code*//*@lineinfo:47^3*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_2=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setAction("/pedirregional");
        __jsp_taghandler_2.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:53^47*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_3=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setKey("login.usuario");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:54^33*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_4=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag accesskey maxlength onblur property readonly size");
              __jsp_taghandler_4.setParent(__jsp_taghandler_2);
              __jsp_taghandler_4.setAccesskey("13");
              __jsp_taghandler_4.setMaxlength("17");
              __jsp_taghandler_4.setOnblur("Mayusculas(this);");
              __jsp_taghandler_4.setProperty("txt_usu");
              __jsp_taghandler_4.setReadonly(true);
              __jsp_taghandler_4.setSize("15");
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
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:57^47*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_5=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_5.setParent(__jsp_taghandler_2);
              __jsp_taghandler_5.setKey("login.password");
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
            out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:58^33*/            {
              org.apache.struts.taglib.html.PasswordTag __jsp_taghandler_6=(org.apache.struts.taglib.html.PasswordTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.PasswordTag.class,"org.apache.struts.taglib.html.PasswordTag accesskey maxlength property readonly size");
              __jsp_taghandler_6.setParent(__jsp_taghandler_2);
              __jsp_taghandler_6.setAccesskey("13");
              __jsp_taghandler_6.setMaxlength("17");
              __jsp_taghandler_6.setProperty("txt_pas");
              __jsp_taghandler_6.setReadonly(true);
              __jsp_taghandler_6.setSize("15");
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
            out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:61^39*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_7=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_7.setParent(__jsp_taghandler_2);
              __jsp_taghandler_7.setKey("activos.codreg");
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
            out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:62^14*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_8=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
              __jsp_taghandler_8.setParent(__jsp_taghandler_2);
              __jsp_taghandler_8.setDisabled(false);
              __jsp_taghandler_8.setName("InicioForm");
              __jsp_taghandler_8.setProperty("cod_reg");
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[10]);
                  /*@lineinfo:translated-code*//*@lineinfo:63^15*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_9=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                    __jsp_taghandler_9.setCollection("RegionalesLista");
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
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[11]);
                /*@lineinfo:translated-code*//*@lineinfo:63^105*/                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:67^39*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_10=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_10.setParent(__jsp_taghandler_2);
              __jsp_taghandler_10.setKey("activos.codfin");
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
            out.write(__jsp_StaticText.text[13]);
            /*@lineinfo:translated-code*//*@lineinfo:68^14*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled name property");
              __jsp_taghandler_11.setParent(__jsp_taghandler_2);
              __jsp_taghandler_11.setDisabled(false);
              __jsp_taghandler_11.setName("InicioForm");
              __jsp_taghandler_11.setProperty("cod_fin");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[14]);
                  /*@lineinfo:translated-code*//*@lineinfo:69^15*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_12=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                    __jsp_taghandler_12.setCollection("FinanciadoresLista");
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
                  out.write(__jsp_StaticText.text[15]);
                /*@lineinfo:translated-code*//*@lineinfo:69^108*/                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[16]);
            /*@lineinfo:translated-code*//*@lineinfo:72^44*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_13=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
              __jsp_taghandler_13.setParent(__jsp_taghandler_2);
              __jsp_taghandler_13.setStyleClass("boton1");
              __jsp_taghandler_13.setValue("Seleccionar");
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
          /*@lineinfo:translated-code*//*@lineinfo:72^99*/          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[18]);


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
    private static final char text[][]=new char[19][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n   <title>SISTEMA DE ACTIVOS FIJOS</title>\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\">\n  function validar(form)\n  {\n    mensaje=\"\"\n    foco=\"\"\n    try {\n    i=form.cod_reg.selectedIndex\n   \tif (i==0) {\n      mensaje=mensaje+\"Debe introducir Regional\\n\"\n\t\t  if (foco.length==0) foco=\"form.cod_reg.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }\n    try {\n    i=form.cod_fin.selectedIndex\n   \tif (i==0) {\n\t   \tmensaje=mensaje+\"Debe introducir Financiador\\n\"\n\t\t  if (foco.length==0) foco=\"form.cod_fin.focus()\"\n  \t}  \n    }\n    catch (e) {\n      xvar=0      \n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }    \n  }\n</script>\n".toCharArray();
      text[3] = 
      "\n<body oncontextmenu=\"return false\">\n<br><br><br><br>\n  ".toCharArray();
      text[4] = 
      " \n    \n    <table width=65% align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\">\n       <tr> <td class=\"FondoAzul\" align=\"center\" colspan=\"2\"><b>Activos fijos</b></td> </tr>\n       <tr> <td class=\"FondoAzul\" align=\"center\" colspan=\"2\"><b>Regional</b></td> </tr>\n       <tr>\n       <td width=40% class=\"S8\" align=\"right\">".toCharArray();
      text[5] = 
      "</td>\n       <td width=60% class=\"S8\">".toCharArray();
      text[6] = 
      " </td>\n       </tr>\n       <tr>\n       <td width=40% class=\"S8\" align=\"right\">".toCharArray();
      text[7] = 
      "</td>\n       <td width=60% class=\"S8\">".toCharArray();
      text[8] = 
      "</td>\n       </tr>       \n       <tr>\n         <td class=\"S8\" align=\"right\">".toCharArray();
      text[9] = 
      "</td>\n         <td>".toCharArray();
      text[10] = 
      "\n              ".toCharArray();
      text[11] = 
      "\n              ".toCharArray();
      text[12] = 
      "</td>\n       </tr>   \n       <tr>\n         <td class=\"S8\" align=\"right\">".toCharArray();
      text[13] = 
      "</td>\n         <td>".toCharArray();
      text[14] = 
      "\n              ".toCharArray();
      text[15] = 
      "\n              ".toCharArray();
      text[16] = 
      "</td>\n       </tr>   \n       <tr><td align=\"center\" colspan=\"2\"> ".toCharArray();
      text[17] = 
      " </td></tr>\n     </table> \n  ".toCharArray();
      text[18] = 
      "    \n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
