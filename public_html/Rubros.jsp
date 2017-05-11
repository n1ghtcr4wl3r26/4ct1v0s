<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
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
    if (!textoObligatorio( form.rub_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.rub_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.rub_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.rub_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
       if (Number(form.rub_codigo.value)<=0){
         mensaje=mensaje+"Debe introducir Código\n"
         if (foco.length==0) foco="form.rub_codigo.focus()"
       }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.rub_descripcion.value )) {
	   	mensaje=mensaje+"Debe introducir Descripción\n"
		  if (foco.length==0) foco="form.rub_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.rub_vidaut.value )) {
	   	mensaje=mensaje+"Debe introducir Vida Útil\n"
		  if (foco.length==0) foco="form.rub_vidaut.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.rub_vidaut.value)){
         mensaje=mensaje+"Debe introducir Números en Vida Útil\n"
         if (foco.length==0) foco="form.rub_vidaut.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
       if (Number(form.rub_vidaut.value)<=0){
         if (form.rub_codigo.value!="01"){
            mensaje=mensaje+"Debe introducir Vida Útil\n"
            if (foco.length==0) foco="form.rub_vidaut.focus()"
         }
       }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.rub_porcen.value )) {
	   	mensaje=mensaje+"Debe introducir Porcentaje\n"
		  if (foco.length==0) foco="form.rub_porcen.focus()"
    }
    if ((Number(form.rub_porcen.value)<0)||(Number(form.rub_porcen.value)>100)) {
  	   mensaje=mensaje+"Porcentaje debe ser mayor a cero y menor a cien\n"
  		 if (foco.length==0) foco="form.rub_porcen.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.rub_porcen.value)){
         mensaje=mensaje+"Debe introducir Números en Porcentaje\n"
         if (foco.length==0) foco="form.rub_porcen.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    i=form.rub_codpar.selectedIndex;
   	if (!comboObligatorio(form.rub_codpar.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Partida\n"
		  if (foco.length==0) foco="form.rub_codpar.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    if (form.rub_codigo.value!="01") {
       try {
       if (!textoObligatorio( form.rub_ctadep.value )) {
	   	   mensaje=mensaje+"Debe introducir Cuenta Depreciación\n"
		     if (foco.length==0) foco="form.rub_ctadep.focus()"
       }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!solonumeros(form.rub_ctadep.value)){
            mensaje=mensaje+"Debe introducir Números en Cuenta Depreciación\n"
            if (foco.length==0) foco="form.rub_ctadep.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (Number(form.rub_ctadep.value)<=0){
            mensaje=mensaje+"Debe introducir Número > 0 en Cuenta Depreciación\n"
            if (foco.length==0) foco="form.rub_ctadep.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
       if (!textoObligatorio( form.rub_ctadac.value )) {
	   	   mensaje=mensaje+"Debe introducir Cuenta Actualización\n"
		     if (foco.length==0) foco="form.rub_ctadac.focus()"
       }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!solonumeros(form.rub_ctadac.value)){
            mensaje=mensaje+"Debe introducir Números en Cuenta Actualización\n"
            if (foco.length==0) foco="form.rub_ctadac.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
          if (Number(form.rub_ctadac.value)<=0){
            mensaje=mensaje+"Debe introducir Número > 0 en Cuenta Actualización\n"
            if (foco.length==0) foco="form.rub_ctadac.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!sololetras(form.rub_descripcion.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.rub_descripcion.focus()"
         }
       }
       catch (e) {
         xvar=0
       }         
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
<html:form action="/rubrosAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Rubros</caption>
<logic:equal value="1" name="RubrosForm" property="operacion">
   <logic:equal name="RubrosForm" property = "opcion" value="1" >
      <tr>
          <td class="S10d"><bean:message key="rubros.codigo" /></td>
          <td><html:text property="rub_codigo" name="RubrosForm" size="2" maxlength="2" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.descripcion" /></td>
          <td><html:text property="rub_descripcion" name="RubrosForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.vidaut" /></td>
          <td><html:text property="rub_vidaut" name="RubrosForm" size="3" maxlength="3" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.porcen" /></td>
          <td><html:text property="rub_porcen" name="RubrosForm" size="6" maxlength="6" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.codpar" /></td>
          <td><html:select name="RubrosForm" property="rub_codpar" disabled="false">
               <html:options collection="PartidasLista" property="codigo" labelProperty="descripcion" />
              </html:select></td>          
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.ctadep" /></td>
          <td><html:text property="rub_ctadep" name="RubrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.ctadac" /></td>
          <td><html:text property="rub_ctadac" name="RubrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="RubrosForm" property = "opcion" value="2" >
      <tr>
          <td class="S10d"><bean:message key="rubros.codigo" /></td>
          <td><html:text readonly="true" property="rub_codigo" name="RubrosForm" size="2" maxlength="2" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.descripcion" /></td>
          <td><html:text property="rub_descripcion" name="RubrosForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.vidaut" /></td>
          <td><html:text property="rub_vidaut" name="RubrosForm" size="3" maxlength="3" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.porcen" /></td>
          <td><html:text property="rub_porcen" name="RubrosForm" size="6" maxlength="6" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.codpar" /></td>
          <td><html:select name="RubrosForm" property="rub_codpar" disabled="false">
               <html:options collection="PartidasLista" property="codigo" labelProperty="descripcion" />
              </html:select></td> 
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.ctadep" /></td>
          <td><html:text property="rub_ctadep" name="RubrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.ctadac" /></td>
          <td><html:text property="rub_ctadac" name="RubrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="RubrosForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="rubros.codigo" /></td>
          <td><html:text readonly="true" property="rub_codigo" name="RubrosForm" size="2" maxlength="2" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.descripcion" /></td>
          <td><html:text readonly="true" property="rub_descripcion" name="RubrosForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.vidaut" /></td>
          <td><html:text readonly="true" property="rub_vidaut" name="RubrosForm" size="3" maxlength="3" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.porcen" /></td>
          <td><html:text readonly="true" property="rub_porcen" name="RubrosForm" size="6" maxlength="6" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.codpar" /></td>
          <td><html:text readonly="true" property="rub_codpar" name="RubrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.ctadep" /></td>
          <td><html:text readonly="true" property="rub_ctadep" name="RubrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="rubros.ctadac" /></td>
          <td><html:text readonly="true" property="rub_ctadac" name="RubrosForm" size="10" maxlength="10" /></td>
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
   <td width="60"  scope="col" class="S10c"><bean:message key="rubros.codigo" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="rubros.descripcion" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="rubros.vidaut" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="rubros.porcen" /></td>
   <td width="90" scope="col" class="S10c"><bean:message key="rubros.codpar" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="rubros.ctadep" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="rubros.ctadac" /></td>
   <logic:equal value="2" name="RubrosForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="RubrosForm" property="opcion">   
   <td></td>
   </logic:equal>
 </tr>
 <% int pnum=0;%> 
 <logic:iterate name="RubrosLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="codigo" /></td>
     <td><bean:write name="lista" property="descripcion" /></td>
     <td><bean:write name="lista" property="vidaut" /></td>
     <td><bean:write name="lista" property="porcen" /></td>
     <td><bean:write name="lista" property="descripcion_codpar" /></td>
     <td><bean:write name="lista" property="ctadep" /></td>
     <td><bean:write name="lista" property="ctadac" /></td>
     <logic:equal value="3" name="RubrosForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="RubrosForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>   
</logic:iterate>
<logic:equal value="5" name="RubrosForm" property="opcion">
   <tr>
   <td colspan="7">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="rubros.do" styleClass="T8b">
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
</html:form>
</body>
</html>
