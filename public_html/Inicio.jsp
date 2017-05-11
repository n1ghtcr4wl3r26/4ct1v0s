<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <link href="Estilos.css" rel="stylesheet" type="text/css">
   <title>SISTEMA DE ACTIVOS FIJOS</title>
</head>
<script language="JavaScript" type="text/JavaScript" src="Validaciones.js"></script>
<script language="JavaScript" type="text/JavaScript" >
 
function limpiar()
{
   document.InicioForm.txt_usu.value="";
   document.InicioForm.txt_pas.value="";
   document.InicioForm.txt_npas.value="";
}

function checkShortcut()
{
   if (event.keycode==8 || event.keycode==13) {
      return false;
   }
}
</script>
<span class="S10i">
<html:errors />
</span>

<body onload="limpiar()" oncontextmenu="return false" onkeydown="return checkShortcut()">
<br><br><br><br>
  <html:form action="/inicio" focus="txt_usu"> 
    <html:hidden property="txt_npas" />
    <table width=65% align="center" class="soloborde" bgcolor="#C1C1FF">
       <tr> <td class="FondoAzul" align="center" colspan="2"><b>Activos fijos</b></td> </tr>
       <tr> <td class="FondoAzul" align="center" colspan="2"><b>Autentificación</b></td> </tr>
       <br>
       <tr>
       <td width=40% class="S8" align="right"><bean:message key="login.usuario" /></td>
       <td width=60% class="S8"><html:text property="txt_usu"  size="15" maxlength="15" accesskey="13" onblur="Mayusculas(this);" /> </td>
       </tr>
       <tr>
       <td width=40% class="S8" align="right"><bean:message key="login.password" /></td>
       <td width=60% class="S8"><html:password property="txt_pas"  size="15" maxlength="17" accesskey="13" /></td>
       </tr>      
       <tr>
       <tr><td align="center" colspan="2"> <html:submit value="Autentificar" styleClass="boton1" /> </td>
       </tr>
     </table> 
  </html:form>    
</body>
</html>
