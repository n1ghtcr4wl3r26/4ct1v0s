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
    hoy=devuelvehoy();
    mensaje=""
    foco=""
    if (form.opcion.value!=9&&form.opcion.value!=10){
    try {
   	if (!esFecha(form.tca_fecha.value)) {
	   	mensaje=mensaje+"Debe introducir Fecha dd/mm/yyyy \n"
		  if (foco.length==0) foco="form.tca_fecha.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    if (!ComparaFechas(hoy, form.tca_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha de Tipo de Cambio menor o igual a hoy\n"
      if (foco.length==0) foco="form.tca_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.tca_tipcam.value)){
      mensaje=mensaje+"Debe introducir Tipo de Cambio\n"
      if (foco.length==0) foco="form.tca_tipcam.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.tca_tipcam.value)<=0){
      mensaje=mensaje+"Debe introducir Tipo de Cambio\n"
      if (foco.length==0) foco="form.tca_tipcam.focus()"
    }
    }
    catch (e) {
      xvar=0
    }   
    try {
   	if (!textoObligatorio(form.tca_tipufv.value)) {
	   	mensaje=mensaje+"Debe introducir Factor UFV\n"
		  if (foco.length==0) foco="form.tca_tipufv.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    } 
    try {
      if (!solonumeros(form.tca_tipcam.value)){
         mensaje=mensaje+"Debe introducir Números en Tipo de Cambio\n"
         if (foco.length==0) foco="form.tca_tipcam.focus()"
      }
    }
    catch (e) {
      xvar=0
    }        
    try {
      if (!solonumeros(form.tca_tipufv.value)){
         mensaje=mensaje+"Debe introducir Números en Factor UFV\n"
         if (foco.length==0) foco="form.tca_tipufv.focus()"
      }
    }
    catch (e) {
      xvar=0
    }        
    try {
    if (Number(form.tca_tipufv.value)<=0){
      mensaje=mensaje+"Debe introducir Factor UFV\n"
      if (foco.length==0) foco="form.tca_tipufv.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.tca_tipcam.value)>=100){
      mensaje=mensaje+"Debe introducir Tipo de Cambio menor a 100\n"
      if (foco.length==0) foco="form.tca_tipcam.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.tca_tipufv.value)>=100){
      mensaje=mensaje+"Debe introducir Factor UFV menor 100\n"
      if (foco.length==0) foco="form.tca_tipufv.focus()"
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
<html:form action="/tipocambioAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Tipo de Cambio</caption>
<logic:equal value="1" name="TipocambioForm" property="operacion">
   <logic:equal name="TipocambioForm" property = "opcion" value="1" >
      <tr>
          <td class="S10d"><bean:message key="tipocambio.fecha" /></td>
          <td><html:text property="tca_fecha" name="TipocambioForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tipocambio.tipcam" /></td>
          <td><html:text property="tca_tipcam" name="TipocambioForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tipocambio.tipufv" /></td>
          <td><html:text property="tca_tipufv" name="TipocambioForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td align="right">
              <html:submit value="Insertar Total" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=10" />
              <html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" />
          </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="TipocambioForm" property = "opcion" value="2" >
      <tr>
          <td class="S10d"><bean:message key="tipocambio.fecha" /></td>
          <td><html:text readonly="true" property="tca_fecha" name="TipocambioForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tipocambio.tipcam" /></td>
          <td><html:text property="tca_tipcam" name="TipocambioForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tipocambio.tipufv" /></td>
          <td><html:text property="tca_tipufv" name="TipocambioForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="TipocambioForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="tipocambio.fecha" /></td>
          <td><html:text readonly="true" property="tca_fecha" name="TipocambioForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tipocambio.tipcam" /></td>
          <td><html:text readonly="true" property="tca_tipcam" name="TipocambioForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="tipocambio.tipufv" /></td>
          <td><html:text readonly="true" property="tca_tipufv" name="TipocambioForm" size="50" maxlength="50" /></td>
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
   <td width="100"  scope="col" class="S10c"><bean:message key="tipocambio.fecha" /></td>
   <td width="100" scope="col" class="S10c"><bean:message key="tipocambio.tipcam" /></td>
   <td width="100" scope="col" class="S10c"><bean:message key="tipocambio.tipufv" /></td>
   <logic:equal value="2" name="TipocambioForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="TipocambioForm" property="opcion">   
   <td></td>
   </logic:equal>
 </tr>
 <% int pnum=0;%>
<logic:iterate name="TipocambioLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="fecha" /></td>
     <td><bean:write name="lista" property="tipcam" /></td>
     <td><bean:write name="lista" property="tipufv" /></td>
     <logic:equal value="3" name="TipocambioForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="TipocambioForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>
</logic:iterate>
<logic:equal value="5" name="TipocambioForm" property="opcion">
   <tr>
   <td colspan="3">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="tipocambio.do" styleClass="T8b">
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
