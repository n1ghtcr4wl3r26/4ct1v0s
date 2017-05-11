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
   document.InicioForm.txt_pas.value="";
   document.InicioForm.txt_npas.value="";
   document.InicioForm.txt_cpas.value="";
}
function validar(form) {
    mensaje=""
    foco=""
    try {
    if (!textoObligatorio( form.txt_usu.value )) {
	   	mensaje=mensaje+"Debe introducir Nombre de Usuario\n"
		  if (foco.length==0) foco="form.txt_usu.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.txt_pas.value )) {
	   	mensaje=mensaje+"Debe introducir Clave de Acceso\n"
		  if (foco.length==0) foco="form.txt_pas.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.txt_npas.value )) {
	   	mensaje=mensaje+"Debe introducir Nueva Clave de Acceso\n"
		  if (foco.length==0) foco="form.txt_npas.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.txt_cpas.value )) {
	   	mensaje=mensaje+"Debe introducir Confirmar Clave de Acceso\n"
		  if (foco.length==0) foco="form.txt_cpas.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    if (mensaje.length>0)
    {
       alert(mensaje)
       eval(foco)
       return false
    }    
}

</script>
<html:errors />
<body onload="limpiar()" oncontextmenu="return false">
<br><br><br><br>
  <html:form action="/inicio" focus="txt_pas" onsubmit="return validar(this)"> 
    
    <table width=65% align="center" class="soloborde" bgcolor="#C1C1FF">
       <tr> <td class="FondoAzul" align="center" colspan="2"><b>Activos fijos</b></td> </tr>
       <tr> <td class="FondoAzul" align="center" colspan="2"><b>Autentificación</b></td> </tr>
       <br>
       <tr>
       <td width=40% class="S8" align="right"><bean:message key="login.usuario" /></td>
       <td width=60% class="S8"><html:text readonly="true" property="txt_usu" name="InicioForm"  size="15" maxlength="15" accesskey="13" onblur="Mayusculas(this);" /> </td>
       </tr>
       <tr>
       <td width=40% class="S8" align="right"><bean:message key="login.password" /></td>
       <td width=60% class="S8"><html:password property="txt_pas"  size="15" maxlength="17" accesskey="13" /></td>
       </tr>      
       <tr>
       <td colspan="2" align="center" class="S8">
       <hr>
       <b>Cambio de Clave de Acceso</b>
       </td>
       </tr>
       <tr>
       <td width=40% class="S8" align="right"><bean:message key="login.newpassword" /></td>
       <td width=60% class="S8"><html:password property="txt_npas"  size="15" maxlength="17" accesskey="13" /></td>
       </tr>      
       <tr>
       <td width=40% class="S8" align="right"><bean:message key="login.conpassword" /></td>
       <td width=60% class="S8"><html:password property="txt_cpas"  size="15" maxlength="17" accesskey="13" /></td>
       </tr>      
       <tr><td align="center" colspan="2"> <html:submit value="Cambio Clave" styleClass="boton1" /> </td></tr>
       <tr><td align="center" colspan="2" class="S8">
       Si desea cambiar la clave de acceso ingrese Clave de Acceso,<br> 
       Nueva Clave de Acceso y Confirmación Clave de Acceso
       </td></tr>
     </table> 
     
  </html:form>    
</body>
</html>
