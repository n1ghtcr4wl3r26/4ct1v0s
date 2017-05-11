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
    if (!textoObligatorio( form.grp_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.grp_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.grp_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.grp_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio( form.grp_descripcion.value )) {
	   	mensaje=mensaje+"Debe introducir Descripción\n"
		  if (foco.length==0) foco="form.grp_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.grp_codrub.selectedIndex;
   	if (!comboObligatorio(form.grp_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.grp_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
       try {
         if (!sololetras(form.grr_descripcion.value)){
            mensaje=mensaje+"Debe introducir Letras y Números\n"
            if (foco.length==0) foco="form.grr_descripcion.focus()"
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
<html:form action="/gruposAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Grupo Activos</caption>
<logic:equal value="1" name="GruposForm" property="operacion">
   <logic:equal name="GruposForm" property = "opcion" value="1" >
      <tr>
         <td class="S10d"><bean:message key="grupos.codigo" /></td>
         <td><html:text property="grp_codigo" name="GruposForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="grupos.codrub" /></td>
         <td><html:select name="GruposForm" property="grp_codrub" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion" />
              </html:select></td> 
      </tr>
      <tr>
         <td class="S10d"><bean:message key="grupos.descripcion" /></td>
         <td><html:text property="grp_descripcion" name="GruposForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
         <td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
         <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="GruposForm" property = "opcion" value="2" >
      <tr>
         <td class="S10d"><bean:message key="grupos.codigo" /></td>
         <td><html:text readonly="true" property="grp_codigo" name="GruposForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="grupos.codrub" /></td>
          <td><html:hidden property="grp_codrub" name="GruposForm" />
          <html:text readonly="true" property="descripcion_codrub" name="GruposForm" size="30" maxlength="30" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="grupos.descripcion" /></td>
         <td><html:text property="grp_descripcion" name="GruposForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <logic:equal name="GruposForm" property = "grp_estado" value="A" >
          <td class="S10d"><bean:message key="grupos.estado" /></td>
          <td class="S10i">
             <input type="radio" name="grp_estado" checked="checked" value="A"> Activo
             <input type="radio" name="grp_estado" value="B"> Baja </td>
          </logic:equal>
          <logic:equal name="GruposForm" property = "grp_estado" value="B" >
          <td class="S10d"><bean:message key="grupos.estado" /></td>
          <td class="S10i">
             <input type="radio" name="grp_estado" value="A"> Activo
             <input type="radio" name="grp_estado" checked="checked" value="B"> Baja </td>
          </logic:equal>
      </tr>       
      <tr>
         <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
         <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="GruposForm" property = "opcion" value="3" >
      <tr>
         <td class="S10d"><bean:message key="grupos.codigo" /></td>
         <td><html:text readonly="true" property="grp_codigo" name="GruposForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="grupos.codrub" /></td>
          <td><html:hidden property="grp_codrub" name="GruposForm" />
          <html:text readonly="true" property="descripcion_codrub" name="GruposForm" size="30" maxlength="30" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="grupos.descripcion" /></td>
         <td><html:text readonly="true" property="grp_descripcion" name="GruposForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
         <td align="right"><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=3" /> </td>
         <td align="lefy"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
</logic:equal>
<tr class="FondoAzul">
   <td width="60"  scope="col" class="S10c"><bean:message key="grupos.codigo" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="grupos.descripcion" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="grupos.codrub" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="oficinas.descripcion" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="grupos.estado" /></td>
   <logic:equal value="2" name="GruposForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="GruposForm" property="opcion">   
   <td></td>
   </logic:equal>
 </tr>
  <% int pnum=0;%>
<logic:iterate name="GruposLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="codigo" /></td>
     <td><bean:write name="lista" property="descripcion" /></td>
     <td><bean:write name="lista" property="codrub" /></td>
     <td><bean:write name="lista" property="codrub_descripcion" /></td>
     <td><bean:write name="lista" property="estado" /></td>
     <logic:equal value="3" name="GruposForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="GruposForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>
</logic:iterate>
<logic:equal value="5" name="GruposForm" property="opcion">
   <tr>
   <td colspan="3">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="grupos.do" styleClass="T8b">
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
