  /*@lineinfo:filename=/CambioClave.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _CambioClave extends oracle.jsp.runtime.HttpJsp {

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
    _CambioClave page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:66^1*/      {
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
      /*@lineinfo:translated-code*//*@lineinfo:69^3*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_2=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action focus onsubmit");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setAction("/inicio");
        __jsp_taghandler_2.setFocus("txt_pas");
        __jsp_taghandler_2.setOnsubmit("return validar(this)");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:76^47*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:77^33*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_4=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag accesskey maxlength name onblur property readonly size");
              __jsp_taghandler_4.setParent(__jsp_taghandler_2);
              __jsp_taghandler_4.setAccesskey("13");
              __jsp_taghandler_4.setMaxlength("15");
              __jsp_taghandler_4.setName("InicioForm");
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
            /*@lineinfo:translated-code*//*@lineinfo:80^47*/            {
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
            /*@lineinfo:translated-code*//*@lineinfo:81^33*/            {
              org.apache.struts.taglib.html.PasswordTag __jsp_taghandler_6=(org.apache.struts.taglib.html.PasswordTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.PasswordTag.class,"org.apache.struts.taglib.html.PasswordTag accesskey maxlength property size");
              __jsp_taghandler_6.setParent(__jsp_taghandler_2);
              __jsp_taghandler_6.setAccesskey("13");
              __jsp_taghandler_6.setMaxlength("17");
              __jsp_taghandler_6.setProperty("txt_pas");
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
            /*@lineinfo:translated-code*//*@lineinfo:90^47*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_7=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_7.setParent(__jsp_taghandler_2);
              __jsp_taghandler_7.setKey("login.newpassword");
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
            /*@lineinfo:translated-code*//*@lineinfo:91^33*/            {
              org.apache.struts.taglib.html.PasswordTag __jsp_taghandler_8=(org.apache.struts.taglib.html.PasswordTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.PasswordTag.class,"org.apache.struts.taglib.html.PasswordTag accesskey maxlength property size");
              __jsp_taghandler_8.setParent(__jsp_taghandler_2);
              __jsp_taghandler_8.setAccesskey("13");
              __jsp_taghandler_8.setMaxlength("17");
              __jsp_taghandler_8.setProperty("txt_npas");
              __jsp_taghandler_8.setSize("15");
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
            out.write(__jsp_StaticText.text[10]);
            /*@lineinfo:translated-code*//*@lineinfo:94^47*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_9=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_9.setParent(__jsp_taghandler_2);
              __jsp_taghandler_9.setKey("login.conpassword");
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
            /*@lineinfo:translated-code*//*@lineinfo:95^33*/            {
              org.apache.struts.taglib.html.PasswordTag __jsp_taghandler_10=(org.apache.struts.taglib.html.PasswordTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.PasswordTag.class,"org.apache.struts.taglib.html.PasswordTag accesskey maxlength property size");
              __jsp_taghandler_10.setParent(__jsp_taghandler_2);
              __jsp_taghandler_10.setAccesskey("13");
              __jsp_taghandler_10.setMaxlength("17");
              __jsp_taghandler_10.setProperty("txt_cpas");
              __jsp_taghandler_10.setSize("15");
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
            out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:97^44*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
              __jsp_taghandler_11.setParent(__jsp_taghandler_2);
              __jsp_taghandler_11.setStyleClass("boton1");
              __jsp_taghandler_11.setValue("Cambio Clave");
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
            out.write(__jsp_StaticText.text[13]);
          /*@lineinfo:translated-code*//*@lineinfo:97^100*/          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[14]);


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
    private static final char text[][]=new char[15][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n<html>\n<head>\n   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n   <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n   <title>SISTEMA DE ACTIVOS FIJOS</title>\n</head>\n<script language=\"JavaScript\" type=\"text/JavaScript\" src=\"Validaciones.js\"></script>\n<script language=\"JavaScript\" type=\"text/JavaScript\" >\nfunction limpiar()\n{\n   document.InicioForm.txt_pas.value=\"\";\n   document.InicioForm.txt_npas.value=\"\";\n   document.InicioForm.txt_cpas.value=\"\";\n}\nfunction validar(form) {\n    mensaje=\"\"\n    foco=\"\"\n    try {\n    if (!textoObligatorio( form.txt_usu.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Nombre de Usuario\\n\"\n\t\t  if (foco.length==0) foco=\"form.txt_usu.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio( form.txt_pas.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Clave de Acceso\\n\"\n\t\t  if (foco.length==0) foco=\"form.txt_pas.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio( form.txt_npas.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Nueva Clave de Acceso\\n\"\n\t\t  if (foco.length==0) foco=\"form.txt_npas.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    try {\n    if (!textoObligatorio( form.txt_cpas.value )) {\n\t   \tmensaje=mensaje+\"Debe introducir Confirmar Clave de Acceso\\n\"\n\t\t  if (foco.length==0) foco=\"form.txt_cpas.focus()\"\n    }\n    }\n    catch (e) {\n      xvar=0\n    }\n    if (mensaje.length>0)\n    {\n       alert(mensaje)\n       eval(foco)\n       return false\n    }    \n}\n\n</script>\n".toCharArray();
      text[3] = 
      "\n<body onload=\"limpiar()\" oncontextmenu=\"return false\">\n<br><br><br><br>\n  ".toCharArray();
      text[4] = 
      " \n    \n    <table width=65% align=\"center\" class=\"soloborde\" bgcolor=\"#C1C1FF\">\n       <tr> <td class=\"FondoAzul\" align=\"center\" colspan=\"2\"><b>Activos fijos</b></td> </tr>\n       <tr> <td class=\"FondoAzul\" align=\"center\" colspan=\"2\"><b>Autentificación</b></td> </tr>\n       <br>\n       <tr>\n       <td width=40% class=\"S8\" align=\"right\">".toCharArray();
      text[5] = 
      "</td>\n       <td width=60% class=\"S8\">".toCharArray();
      text[6] = 
      " </td>\n       </tr>\n       <tr>\n       <td width=40% class=\"S8\" align=\"right\">".toCharArray();
      text[7] = 
      "</td>\n       <td width=60% class=\"S8\">".toCharArray();
      text[8] = 
      "</td>\n       </tr>      \n       <tr>\n       <td colspan=\"2\" align=\"center\" class=\"S8\">\n       <hr>\n       <b>Cambio de Clave de Acceso</b>\n       </td>\n       </tr>\n       <tr>\n       <td width=40% class=\"S8\" align=\"right\">".toCharArray();
      text[9] = 
      "</td>\n       <td width=60% class=\"S8\">".toCharArray();
      text[10] = 
      "</td>\n       </tr>      \n       <tr>\n       <td width=40% class=\"S8\" align=\"right\">".toCharArray();
      text[11] = 
      "</td>\n       <td width=60% class=\"S8\">".toCharArray();
      text[12] = 
      "</td>\n       </tr>      \n       <tr><td align=\"center\" colspan=\"2\"> ".toCharArray();
      text[13] = 
      " </td></tr>\n       <tr><td align=\"center\" colspan=\"2\" class=\"S8\">\n       Si desea cambiar la clave de acceso ingrese Clave de Acceso,<br> \n       Nueva Clave de Acceso y Confirmación Clave de Acceso\n       </td></tr>\n     </table> \n     \n  ".toCharArray();
      text[14] = 
      "    \n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
