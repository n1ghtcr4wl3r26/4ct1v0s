  <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.Vector, ActivosFijos.*" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
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
    if (!textoObligatorio( form.mot_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir C�digo\n"
		  if (foco.length==0) foco="form.mot_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.mot_codigo.value)){
         mensaje=mensaje+"Debe introducir N�meros en C�digo\n"
         if (foco.length==0) foco="form.mot_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio( form.mot_descripcion.value )) {
	   	mensaje=mensaje+"Debe introducir Descripci�n\n"
		  if (foco.length==0) foco="form.mot_descripcion.focus()"
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
<html:form action="/tiposbajaAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Motivos de Baja</caption>
<logic:equal value="1" name="TiposbajaForm" property="operacion">
   <logic:equal name="TiposbajaForm" property = "opcion" value="1" >
      <tr>
          <td class="S10d"><bean:message key="tiposbaja.codigo" /></td>
          <td><html:text property="mot_codigo" name="TiposbajaForm" size="2" maxlength="2" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tiposbaja.descripcion" /></td>
          <td><html:text property="mot_descripcion" name="TiposbajaForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="TiposbajaForm" property = "opcion" value="2" >
      <tr>
          <td class="S10d"><bean:message key="tiposbaja.codigo" /></td>
          <td><html:text readonly="true" property="mot_codigo" name="TiposbajaForm" size="2" maxlength="2" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tiposbaja.descripcion" /></td>
          <td><html:text property="mot_descripcion" name="TiposbajaForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="TiposbajaForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="tiposbaja.codigo" /></td>
          <td><html:text readonly="true" property="mot_codigo" name="TiposbajaForm" size="2" maxlength="2" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tiposbaja.descripcion" /></td>
          <td><html:text readonly="true" property="mot_descripcion" name="TiposbajaForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=3" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
</logic:equal>
</table>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<tr class="FondoAzul">
   <td width="60"  scope="col" class="S10c"><bean:message key="tiposbaja.codigo" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="tiposbaja.descripcion" /></td>
   <logic:equal value="2" name="TiposbajaForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="TiposbajaForm" property="opcion">   
   <td></td>
   </logic:equal>   
 </tr>
  <% int pnum=0;%>
<logic:iterate name="TiposbajaLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="codigo" /></td>
     <td><bean:write name="lista" property="descripcion" /></td>
     <logic:equal value="3" name="TiposbajaForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="TiposbajaForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>
</logic:iterate>
<logic:equal value="5" name="TiposbajaForm" property="opcion">
   <tr>
   <td colspan="2">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="tiposbaja.do" styleClass="T8b">
        � � 2006  Aduana Nacional de Bolivia Todos los derechos reservados.
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
</html:form>
</body>
</html>
