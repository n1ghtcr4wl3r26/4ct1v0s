<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.Vector, ActivosFijos.*" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-125">
   <meta http-equiv="Expires" content="-1">
   <link href="Estilos.css" rel="stylesheet" type="text/css">
</head>
<script language="JavaScript" type="text/JavaScript" src="Validaciones.js"></script>
<script language="JavaScript" type="text/JavaScript">
  function validar(form)
  {
    hoy=devuelvehoy();
    mensaje=""
    foco=""
    try {
    i=form.mre_codrub.selectedIndex
   	if (!comboObligatorio(form.mre_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.mre_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    if (!textoObligatorio( form.mre_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.mre_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.mre_codigo.value)) {
	   	mensaje=mensaje+"Debe introducir Código <> 0\n"
		  if (foco.length==0) foco="form.mre_codigo.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.mre_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.mre_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.mre_corel.value )) {
	   	mensaje=mensaje+"Debe introducir Correlativo\n"
		  if (foco.length==0) foco="form.mre_corel.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.mre_corel.value)) {
	   	mensaje=mensaje+"Debe introducir Correlativo <> 0\n"
		  if (foco.length==0) foco="form.mre_corel.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.mre_corel.value)){
         mensaje=mensaje+"Debe introducir Números en Correlativo\n"
         if (foco.length==0) foco="form.mre_corel.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!esFecha(form.mre_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha dd/mm/yyyy\n"
      if (foco.length==0) foco="form.mre_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(hoy, form.mre_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha menor o igual a hoy\n"
      if (foco.length==0) foco="form.mre_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.mre_tipcam.value)){
      mensaje=mensaje+"Debe introducir Tipo de Cambio\n"
      if (foco.length==0) foco="form.mre_tipcam.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.mre_tipcam.value)){
         mensaje=mensaje+"Debe introducir Números en Tipo de Cambio\n"
         if (foco.length==0) foco="form.mre_tipcam.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (Number(form.mre_tipcam.value)<=0){
      mensaje=mensaje+"Debe introducir Tipo de Cambio\n"
      if (foco.length==0) foco="form.mre_tipcam.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (Number(form.mre_tipufv.value)<=0){
      mensaje=mensaje+"Debe introducir Factor UFV\n"
      if (foco.length==0) foco="form.mre_tipufv.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.mre_tipufv.value)){
         mensaje=mensaje+"Debe introducir Números en Factor UFV\n"
         if (foco.length==0) foco="form.mre_tipufv.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.mre_tipufv.value)){
      mensaje=mensaje+"Debe introducir Factor UFV\n"
      if (foco.length==0) foco="form.mre_tipufv.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.mre_docreferencia.value)){
      mensaje=mensaje+"Debe introducir Documento de Referencia No.\n"
      if (foco.length==0) foco="form.mre_docreferencia.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio(form.mre_valbol.value)){
      mensaje=mensaje+"Debe introducir Valor de Compra Bolivianos\n"
      if (foco.length==0) foco="form.mre_valbol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.mre_valbol.value)){
         mensaje=mensaje+"Debe introducir Números en Valor de Compra Bs\n"
         if (foco.length==0) foco="form.mre_valbol.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.mre_valbol.value)<=0){
      mensaje=mensaje+"Debe introducir Valor de Compra Bs\n"
      if (foco.length==0) foco="form.mre_valbol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.mre_numfactura.value)){
         mensaje=mensaje+"Debe introducir Números en Número de Factura\n"
         if (foco.length==0) foco="form.mre_numfactura.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.mre_numfactura.value)<=0){
      mensaje=mensaje+"Debe introducir Número de Factura\n"
      if (foco.length==0) foco="form.mre_numfactura.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.mre_numfactura.value)){
      mensaje=mensaje+"Debe introducir Número de Factura\n"
      if (foco.length==0) foco="form.mre_numfactura.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!esFecha(form.rev_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación dd/mm/yyyy\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    var sMes0 = form.rev_fecha.value;
    var sAno0 = form.rev_fecha.value;
    if ((sMes0.substr(3,2)!=form.mes.value)||(sAno0.substr(6,4)!=form.anio.value)){
      mensaje=mensaje+"Debe introducir Fecha de Activación igual al periodo "+form.anio.value+form.mes.value+" de proceso\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
     i=form.rev_estadoactivo.selectedIndex
   	 if (!comboObligatorio(form.rev_estadoactivo.options[i].value)) {
	    	mensaje=mensaje+"Debe introducir Estado de Activo\n"
		   if (foco.length==0) foco="form.rev_estadoactivo.focus()"
  	 }  
    }
    catch (e) {
      xvar=0      
    }
    try {
    if (!textoObligatorio(form.act_descripcion.value)){
      mensaje=mensaje+"Debe introducir Descripción\n"
      if (foco.length==0) foco="form.act_descripcion.focus()"
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
<body>
<html:form action="/mejorasrebajasAction" onsubmit="return validar(this)">
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
<caption>Mejoras/Rebajas</caption>
<tr><td align="left" class="S10d">
Mes Proceso : <html:text readonly="true" property="mes" name="MejorasRebajasForm" size="4"/> 
</td>
<td align="right" class="S10d">
Año Proceso  : <html:text readonly="true" property="anio" name="MejorasRebajasForm" size="6"/>
</td></tr>
</table>
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="0">
<logic:equal value="1" name="MejorasRebajasForm" property="operacion">
   <logic:equal name="MejorasRebajasForm" property = "opcion" value="1" >
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codrub" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="mre_rubdescripcion" name="MejorasRebajasForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codreg" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="mre_regdescripcion" name="MejorasRebajasForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codigo" name="MejorasRebajasForm" size="5" maxlength="5" />
         <html:text readonly="true" property="mre_codbarra" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_descripcion" name="MejorasRebajasForm" size="70" maxlength="70" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.corel" /></td>
         <td><html:text readonly="true" property="mre_corel" name="MejorasRebajasForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.fecha" /></td>
         <td><html:text property="mre_fecha" name="MejorasRebajasForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.tipcam" /></td>
         <td><html:text property="mre_tipcam" name="MejorasRebajasForm" size="11" maxlength="11" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.tipufv" /></td>
         <td><html:text property="mre_tipufv" name="MejorasRebajasForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.descripcion" /></td>
         <td colspan="3"><html:text property="mre_descripcion" name="MejorasRebajasForm" size="90" maxlength="120" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.desadicional" /></td>
         <td colspan="3"><html:text property="mre_desadicional" name="MejorasRebajasForm" size="90" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.proveedor" /></td>
         <td colspan="3"><html:text property="mre_proveedor" name="MejorasRebajasForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.marca" /></td>
         <td><html:text property="mre_marca" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.modelo" /></td>
         <td><html:text property="mre_modelo" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.serie" /></td>
         <td><html:text property="mre_serie" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.docreferencia" /></td>
         <td><html:text property="mre_docreferencia" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.valbol" /></td>
         <td><html:text property="mre_valbol" name="MejorasRebajasForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.ordencompra" /></td>
         <td><html:text property="mre_ordencompra" name="MejorasRebajasForm" size="20" maxlength="20" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.numfactura" /></td>
         <td><html:text property="mre_numfactura" name="MejorasRebajasForm" size="8" maxlength="8" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.numcomprobante" /></td>
         <td><html:text property="mre_numcomprobante" name="MejorasRebajasForm" size="20" maxlength="20" /></td>
         <td class="S10d"><bean:message key="activos.fecha" /></td>
         <td><html:text property="rev_fecha" name="MejorasRebajasForm" size="10" maxlength="10" /></td>      
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.estadoactivo" /></td>        
         <td><html:select name="MejorasRebajasForm" property="rev_estadoactivo" disabled="false">
             <html:options collection="EstadosLista" property="estado" labelProperty="desestado"/>
             </html:select>
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.desestado" /></td>
         <td><html:text property="rev_desestado" name="MejorasRebajasForm" size="60" maxlength="60" /></td>
      </tr>      
      <tr>
         <td colspan=6><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" />
      </tr>
   </logic:equal>
   <logic:equal name="MejorasRebajasForm" property = "opcion" value="2" >
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codrub" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="mre_rubdescripcion" name="MejorasRebajasForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codreg" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="mre_regdescripcion" name="MejorasRebajasForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codigo" name="MejorasRebajasForm" size="5" maxlength="5" />
         <html:text readonly="true" property="mre_codbarra" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_descripcion" name="MejorasRebajasForm" size="70" maxlength="70" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.corel" /></td>
         <td><html:text readonly="true" property="mre_corel" name="MejorasRebajasForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.fecha" /></td>
         <td><html:text property="mre_fecha" name="MejorasRebajasForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.tipcam" /></td>
         <td><html:text property="mre_tipcam" name="MejorasRebajasForm" size="11" maxlength="11" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.tipufv" /></td>
         <td><html:text property="mre_tipufv" name="MejorasRebajasForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.descripcion" /></td>
         <td colspan="3"><html:text property="mre_descripcion" name="MejorasRebajasForm" size="90" maxlength="120" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.desadicional" /></td>
         <td colspan="3"><html:text property="mre_desadicional" name="MejorasRebajasForm" size="90" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.proveedor" /></td>
         <td colspan="3"><html:text property="mre_proveedor" name="MejorasRebajasForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.marca" /></td>
         <td><html:text property="mre_marca" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.modelo" /></td>
         <td><html:text property="mre_modelo" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.serie" /></td>
         <td><html:text property="mre_serie" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.docreferencia" /></td>
         <td><html:text property="mre_docreferencia" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.valbol" /></td>
         <td><html:text property="mre_valbol" name="MejorasRebajasForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.ordencompra" /></td>
         <td><html:text property="mre_ordencompra" name="MejorasRebajasForm" size="20" maxlength="20" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.numfactura" /></td>
         <td><html:text property="mre_numfactura" name="MejorasRebajasForm" size="8" maxlength="8" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.numcomprobante" /></td>
         <td><html:text property="mre_numcomprobante" name="MejorasRebajasForm" size="20" maxlength="20" /></td>
         <td class="S10d"><bean:message key="activos.fecha" /></td>
         <td><html:text property="rev_fecha" name="MejorasRebajasForm" size="10" maxlength="10" /></td>      
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.vidaut" /></td>
         <td><html:text readonly="true" property="rev_vidaut" name="MejorasRebajasForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="activos.estadoactivo" /></td>
         <td><html:select name="MejorasRebajasForm" property="rev_estadoactivo" disabled="false">
             <html:options collection="EstadosLista" property="estado" labelProperty="desestado"/>
             </html:select>
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.desestado" /></td>
         <td><html:text property="rev_desestado" name="MejorasRebajasForm" size="60" maxlength="60" /></td>
      </tr>    
      <tr>
         <td colspan=6><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" />
      </tr>
   </logic:equal>
   <logic:equal name="MejorasRebajasForm" property = "opcion" value="3" >
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codrub" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="mre_rubdescripcion" name="MejorasRebajasForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codreg" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="mre_regdescripcion" name="MejorasRebajasForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_codigo" name="MejorasRebajasForm" size="5" maxlength="5" />
         <html:text readonly="true" property="mre_codbarra" name="MejorasRebajasForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_descripcion" name="MejorasRebajasForm" size="70" maxlength="70" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.corel" /></td>
         <td><html:text readonly="true" property="mre_corel" name="MejorasRebajasForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.fecha" /></td>
         <td><html:text readonly="true" property="mre_fecha" name="MejorasRebajasForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.tipcam" /></td>
         <td><html:text readonly="true" property="mre_tipcam" name="MejorasRebajasForm" size="11" maxlength="11" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.tipufv" /></td>
         <td><html:text readonly="true" property="mre_tipufv" name="MejorasRebajasForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.descripcion" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_descripcion" name="MejorasRebajasForm" size="90" maxlength="120" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.desadicional" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_desadicional" name="MejorasRebajasForm" size="90" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.proveedor" /></td>
         <td colspan="3"><html:text readonly="true" property="mre_proveedor" name="MejorasRebajasForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.marca" /></td>
         <td><html:text readonly="true" property="mre_marca" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.modelo" /></td>
         <td><html:text readonly="true" property="mre_modelo" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.serie" /></td>
         <td><html:text readonly="true" property="mre_serie" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.docreferencia" /></td>
         <td><html:text readonly="true" property="mre_docreferencia" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.valbol" /></td>
         <td><html:text readonly="true" property="mre_valbol" name="MejorasRebajasForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.ordencompra" /></td>
         <td><html:text readonly="true" property="mre_ordencompra" name="MejorasRebajasForm" size="20" maxlength="20" /></td>
         <td class="S10d"><bean:message key="mejorasrebajas.numfactura" /></td>
         <td><html:text readonly="true" property="mre_numfactura" name="MejorasRebajasForm" size="8" maxlength="8" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="mejorasrebajas.numcomprobante" /></td>
         <td><html:text readonly="true" property="mre_numcomprobante" name="MejorasRebajasForm" size="20" maxlength="20" /></td>
         <td class="S10d"><bean:message key="activos.fecha" /></td>
         <td><html:text property="rev_fecha" name="MejorasRebajasForm" size="10" maxlength="10" /></td>      
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.vidaut" /></td>
         <td><html:text readonly="true" property="rev_vidaut" name="MejorasRebajasForm" size="4" maxlength="4" /></td>
      </tr>    
      <tr>
         <td colspan="6"><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=3" />
      </tr>
   </logic:equal>
</logic:equal>
<logic:equal value="2" name="MejorasRebajasForm" property="operacion">
  <tr class="T8a">
     <td>
     <logic:equal value="3" name="MejorasRebajasForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="mejorasrebajas.codrub" /></td>
           <td><html:select name="MejorasRebajasForm" property="mre_codrub" disabled="false">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td> 
        </tr>
        <tr>
           <td class="S10d"><bean:message key="mejorasrebajas.codreg" /></td>
            <td><html:hidden property="mre_codreg" name="MejorasRebajasForm" />
            <html:text readonly="true" property="mre_regdescripcion" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
        </tr>        
        <tr>
           <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
           <td><html:text property="act_descripcion" name="MejorasRebajasForm" size="50" maxlength="50" /></td>
        </tr>        
        <tr>
        <td></td>
        <td align="left">
        <html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=3"/>
        </td>
        </tr>
     </logic:equal>
     <logic:equal value="2" name="MejorasRebajasForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="mejorasrebajas.codrub" /></td>
           <td><html:select name="MejorasRebajasForm" property="mre_codrub" disabled="false">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>
        <tr>
           <td class="S10d"><bean:message key="mejorasrebajas.codreg" /></td>
            <td><html:hidden property="mre_codreg" name="MejorasRebajasForm" />
            <html:text readonly="true" property="mre_regdescripcion" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
        </tr>        
        <tr>
           <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
           <td><html:text property="act_descripcion" name="MejorasRebajasForm" size="50" maxlength="50" /></td>
        </tr>
        <tr>
        <td></td>
        <td align="left">
        <html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=2"/>
        </td>
        </tr>
     </logic:equal>
     <logic:equal value="1" name="MejorasRebajasForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="mejorasrebajas.codrub" /></td>
           <td><html:select name="MejorasRebajasForm" property="mre_codrub" disabled="false">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>
        <tr>
           <td class="S10d"><bean:message key="mejorasrebajas.codreg" /></td>
            <td><html:hidden property="mre_codreg" name="MejorasRebajasForm" />
            <html:text readonly="true" property="mre_regdescripcion" name="MejorasRebajasForm" size="30" maxlength="30" /></td>
        </tr>        
        <tr>
           <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
           <td><html:text property="act_descripcion" name="MejorasRebajasForm" size="50" maxlength="50" /></td>
        </tr>        
        <tr>
        <td></td>
        <td align="left">
        <html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=1"/>
        </td>
        </tr>
     </logic:equal>
     </td>
   </tr>
</logic:equal>
<logic:equal value="3" name="MejorasRebajasForm" property="operacion">
  <tr class="T8a">
     <td>
     <table width="100%" align="center" class="soloborde" bgcolor="#C1C1FF" border="1">
     <tr><td>
     <html:hidden property="mre_codrub" name="MejorasRebajasForm" />
     <html:hidden property="mre_codreg" name="MejorasRebajasForm" />
     <html:hidden property="act_descripcion" name="MejorasRebajasForm" />
      <table width="100%" class="soloborde" bgcolor="#C1C1FF">
       <tr class="FondoAzul">
         <td width="60" scope="col" class="S10c">Código</td>
         <td width="160" scope="col" class="S10c">Descripción</td>
         <logic:notEqual value="1" name="MejorasRebajasForm" property="opcion">
           <td width="60" scope="col" class="S10c">Correlativo</td>
         </logic:notEqual>
         <td></td>
       </tr>
      <% int pnum=0; %>
      <logic:iterate name="Activos3Lista" id="lista">
        <% if (pnum==1) {%>
           <tr class="T8b">
        <% } else { %>
           <tr class="T8a">
        <% } %>
           <td><bean:write name="lista" property="codrub" />-<bean:write name="lista" property="codreg" />-<bean:write name="lista" property="codigo" /></td>
           <td><bean:write name="lista" property="descripcion" /></td>
           <logic:notEqual value="1" name="MejorasRebajasForm" property="opcion">
              <td><bean:write name="lista" property="corel" /></td>
           </logic:notEqual>
           <logic:equal value="5" name="MejorasRebajasForm" property="opcion">
              <td align="right"><html:submit value="Reportar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=5"/></td>
           </logic:equal>
           <logic:equal value="3" name="MejorasRebajasForm" property="opcion">
              <td align="right"><html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/></td>
           </logic:equal>     
           <logic:equal value="2" name="MejorasRebajasForm" property="opcion">
              <td align="right"><html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/></td>
           </logic:equal>     
           <logic:equal value="1" name="MejorasRebajasForm" property="opcion">
              <td align="right"><html:submit value="Insertar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=1"/></td>
           </logic:equal>     
         </tr>
         <% if (pnum==0) pnum=1; else pnum=0; %>
      </logic:iterate>
      </table>
     </td></tr>     
     </table>
     </td>
   </tr>
</logic:equal>
<tr><td align="center" colspan="2" class="S10d">(*) Campos Obligatorios</td></tr>
</table>
</html:form>
</body>
</html>
