<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.Vector, ActivosFijos.*" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <meta http-equiv="Expires" content="-1">
   <link href="Estilos.css" rel="stylesheet" type="text/css">
</head>
<script language="JavaScript" type="text/JavaScript" src="Validaciones.js"></script>
<script language="JavaScript" type="text/JavaScript">

  function validar(form)
  {
    mensaje=""
    foco=""
    if (form.opcion.value!=9){
       try {
          if (!textoObligatorio( form.fin_codigo.value )) {
	         	 mensaje=mensaje+"Debe introducir Código\n"
             if (foco.length==0) foco="form.fin_codigo.focus()"
          }
       }
       catch (e) {
          xvar=0
       }
       try {
         if (!solonumerosint(form.fin_codigo.value)){
            mensaje=mensaje+"Debe introducir Números en Código\n"
            if (foco.length==0) foco="form.fin_codigo.focus()"
         }
       }
       catch (e) {
          xvar=0
       }    
       try {
          if (!textoObligatorio( form.fin_descripcion.value )) {
	   	       mensaje=mensaje+"Debe introducir Descripción\n"
		         if (foco.length==0) foco="form.fin_descripcion.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!sololetras(form.fin_descripcion.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.fin_descripcion.focus()"
         }
       }
       catch (e) {
         xvar=0
       }       
    }
    if (mensaje.length>0)
    {
       alert(mensaje)
       eval(foco)
       return false
    }    
  }
</script>
<body> 
<html:form action="/financiadoresAction" onsubmit="return validar(this);">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Financiadores</caption>
<logic:equal value="1" name="FinanciadoresForm" property="operacion">
   <logic:equal name="FinanciadoresForm" property = "opcion" value="1" >
      <tr>
          <td colspan="1" class="S10d"><bean:message key="financiadores.codigo" /></td>
          <td colspan="2"><html:text property="fin_codigo" name="FinanciadoresForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td colspan="1" class="S10d"><bean:message key="financiadores.descripcion" /></td>
         <td colspan="2"><html:text property="fin_descripcion" name="FinanciadoresForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
         <td align="right" ><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /></td>
         <td align="left" ><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /></td>
      </tr>
   </logic:equal>
   <logic:equal name="FinanciadoresForm" property = "opcion" value="2" >
      <tr>
          <td colspan="1" class="S10d"><bean:message key="financiadores.codigo" /></td>
          <td colspan="2"><html:text readonly="true" property="fin_codigo" name="FinanciadoresForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td colspan="1" class="S10d"><bean:message key="financiadores.descripcion" /></td>
         <td colspan="2"><html:text property="fin_descripcion" name="FinanciadoresForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
         <td align="right" ><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /></td>
         <td align="left" ><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /></td>
      </tr>
   </logic:equal>
   <logic:equal name="FinanciadoresForm" property = "opcion" value="3" >
      <tr>
          <td colspan="1" class="S10d"><bean:message key="financiadores.codigo" /></td>
          <td colspan="2"><html:text readonly="true" property="fin_codigo" name="FinanciadoresForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td colspan="1" class="S10d"><bean:message key="financiadores.descripcion" /></td>
         <td colspan="2"><html:text readonly="true" property="fin_descripcion" name="FinanciadoresForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
         <td align="right"><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=3" /></td>
         <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /></td>
      </tr>
   </logic:equal>
</logic:equal>
</table>
<center>
<table width="100%" class="soloborde" bgcolor="#C1C1FF">
<tr class="FondoAzul">
   <td width="60"  scope="col" class="S10c"><bean:message key="financiadores.codigo" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="financiadores.descripcion" /></td>
   <logic:equal value="2" name="FinanciadoresForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="FinanciadoresForm" property="opcion">   
   <td></td>
   </logic:equal>
 </tr>
<% int pnum=0;%>
<logic:iterate name="FinanciadoresLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="codigo" /></td>
     <td><bean:write name="lista" property="descripcion" /></td>
     <logic:equal value="3" name="FinanciadoresForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="FinanciadoresForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>
</logic:iterate>
<logic:equal value="5" name="FinanciadoresForm" property="opcion">
   <tr>
   <td colspan="2">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="financiadores.do" styleClass="T8b">
          © 2006  Aduana Nacional de Bolivia Todos los derechos reservados.
          </html:link> 
        </em>
      </FONT>
    </td>
  </tr>
</table> 
   </td>
   </tr>
</logic:equal>
</table>
</center>
</html:form>
</body>
</html>
