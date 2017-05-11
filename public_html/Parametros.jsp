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
    if (form.opcion.value!=9) {
       try {
          if (!textoObligatorio( form.cte_codinstitucion.value )) {
	   	      mensaje=mensaje+"Debe introducir Código Institución\n"
		        if (foco.length==0) foco="form.cte_codinstitucion.focus()"
          }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_codrub1.value)){
            mensaje=mensaje+"Debe introducir Código de Rubro 1\n"
            if (foco.length==0) foco="form.cte_codrub1.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_codrub2.value)){
            mensaje=mensaje+"Debe introducir Código de Rubro 2\n"
            if (foco.length==0) foco="form.cte_codrub2.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_codrub3.value)){
            mensaje=mensaje+"Debe introducir Código de Rubro 3\n"
            if (foco.length==0) foco="form.cte_codrub3.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_codrub4.value)){
            mensaje=mensaje+"Debe introducir Código de Rubro 4\n"
            if (foco.length==0) foco="form.cte_codrub4.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_codrub5.value)){
            mensaje=mensaje+"Debe introducir Código de Rubro 5\n"
            if (foco.length==0) foco="form.cte_codrub5.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_codrub6.value)){
            mensaje=mensaje+"Debe introducir Código de Rubro 6\n"
            if (foco.length==0) foco="form.cte_codrub6.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_tipdocentrega.value)){
            mensaje=mensaje+"Debe introducir Tipo de Documento de Entrega\n"
            if (foco.length==0) foco="form.cte_tipdocentrega.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_tipdocdevolucion.value)){
            mensaje=mensaje+"Debe introducir Tipo de Documento de Devolución\n"
            if (foco.length==0) foco="form.cte_tipdocdevolucion.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_tipdoctransferencia.value)){
            mensaje=mensaje+"Debe introducir Tipo de Documento de Transferencia\n"
            if (foco.length==0) foco="form.cte_tipdoctransferencia.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_tipdoctraregionales.value)){
            mensaje=mensaje+"Debe introducir Tipo de Documento de Transferencia Entre Regionales\n"
            if (foco.length==0) foco="form.cte_tipdoctraregionales.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_tipdocbaja.value)){
            mensaje=mensaje+"Debe introducir Tipo de Documento de Baja\n"
            if (foco.length==0) foco="form.cte_tipdocbaja.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_gestion.value)){
            mensaje=mensaje+"Debe introducir Gestión Actas\n"
            if (foco.length==0) foco="form.cte_gestion.focus()"
         }
       }
       catch (e) {
         xvar=0
       }
       try {
         if (!textoObligatorio(form.cte_codrubaccesorios.value)){
            mensaje=mensaje+"Debe introducir Gestión a Depreciar\n"
            if (foco.length==0) foco="form.cte_codrubaccesorios.focus()"
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
<html:form action="/parametrosAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Parametros</caption>
<logic:equal value="1" name="ParametrosForm" property="operacion">
   <logic:notEqual name="ParametrosForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="parametros.codinstitucion" /></td>
          <td><html:text readonly="true" property="cte_codinstitucion" name="ParametrosForm" size="3" maxlength="3" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub1" /></td>
          <td><html:text readonly="true" property="cte_codrub1" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub2" /></td>
          <td><html:text readonly="true" property="cte_codrub2" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub3" /></td>
          <td><html:text readonly="true" property="cte_codrub3" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub4" /></td>
          <td><html:text readonly="true" property="cte_codrub4" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub5" /></td>
          <td><html:text readonly="true" property="cte_codrub5" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub6" /></td>
          <td><html:text readonly="true" property="cte_codrub6" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdocentrega" /></td>
          <td><html:text readonly="true" property="cte_tipdocentrega" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdocdevolucion" /></td>
          <td><html:text readonly="true" property="cte_tipdocdevolucion" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdoctransferencia" /></td>
          <td><html:text readonly="true" property="cte_tipdoctransferencia" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdocbaja" /></td>
          <td><html:text readonly="true" property="cte_tipdocbaja" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdoctraregionales" /></td>
          <td><html:text readonly="true" property="cte_tipdoctraregionales" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.gestion" /></td>
          <td><html:text property="cte_gestion" name="ParametrosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrubaccesorios" /></td>
          <td><html:text property="cte_codrubaccesorios" name="ParametrosForm" size="4" maxlength="4" /></td>
      </tr>      
   </logic:notEqual>
   <logic:equal name="ParametrosForm" property = "opcion" value="1" >
      <tr>
          <td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="ParametrosForm" property = "opcion" value="2" >
      <tr>
          <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="ParametrosForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="parametros.codinstitucion" /></td>
          <td><html:text readonly="true" property="cte_codinstitucion" name="ParametrosForm" size="3" maxlength="3" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub1" /></td>
          <td><html:text readonly="true" property="cte_codrub1" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub2" /></td>
          <td><html:text readonly="true" property="cte_codrub2" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub3" /></td>
          <td><html:text readonly="true" property="cte_codrub3" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub4" /></td>
          <td><html:text readonly="true" property="cte_codrub4" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub5" /></td>
          <td><html:text readonly="true" property="cte_codrub5" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrub6" /></td>
          <td><html:text readonly="true" property="cte_codrub6" name="ParametrosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdocentrega" /></td>
          <td><html:text readonly="true" property="cte_tipdocentrega" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdocdevolucion" /></td>
          <td><html:text readonly="true" property="cte_tipdocdevolucion" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdoctransferencia" /></td>
          <td><html:text readonly="true" property="cte_tipdoctransferencia" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdocbaja" /></td>
          <td><html:text readonly="true" property="cte_tipdocbaja" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.tipdoctraregionales" /></td>
          <td><html:text readonly="true" property="cte_tipdoctraregionales" name="ParametrosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.gestion" /></td>
          <td><html:text readonly="true" property="cte_gestion" name="ParametrosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="parametros.codrubaccesorios" /></td>
          <td><html:text readonly="true" property="cte_codrubaccesorios" name="ParametrosForm" size="4" maxlength="4" /></td>
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
   <td width="60"  scope="col" class="S10c"><bean:message key="parametros.codinstitucion" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.codrub1" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.codrub2" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.codrub3" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.codrub4" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.codrub5" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.codrub6" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.tipdocentrega" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.tipdocdevolucion" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.tipdoctransferencia" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.tipdocbaja" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.tipdoctraregionales" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.gestion" /></td>
   <td width="260" scope="col" class="S10c"><bean:message key="parametros.codrubaccesorios" /></td>   
   <logic:equal value="2" name="ParametrosForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="ParametrosForm" property="opcion">   
   <td></td>
   </logic:equal>
 </tr>
 <% int pnum=0;%>
<logic:iterate name="ParametrosLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="codinstitucion" /></td>
     <td><bean:write name="lista" property="codrub1" /></td>
     <td><bean:write name="lista" property="codrub2" /></td>
     <td><bean:write name="lista" property="codrub3" /></td>
     <td><bean:write name="lista" property="codrub4" /></td>
     <td><bean:write name="lista" property="codrub5" /></td>
     <td><bean:write name="lista" property="codrub6" /></td>
     <td><bean:write name="lista" property="tipdocentrega" /></td>
     <td><bean:write name="lista" property="tipdocdevolucion" /></td>
     <td><bean:write name="lista" property="tipdoctransferencia" /></td>
     <td><bean:write name="lista" property="tipdocbaja" /></td>
     <td><bean:write name="lista" property="tipdoctraregionales" /></td>
     <td><bean:write name="lista" property="gestion" /></td>
     <td><bean:write name="lista" property="codrubaccesorios" /></td>     
     <logic:equal value="3" name="ParametrosForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="ParametrosForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>
</logic:iterate>
<logic:equal value="5" name="ParametrosForm" property="opcion">
<tr>
<td colspan="2">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="parametros.do" styleClass="T8b">
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