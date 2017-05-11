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
  var sesion=0
  var dele0 = new Array()
  var valo0 = new Array()
  function validar(form)
  {
    hoy=devuelvehoy();
    mensaje=""
    foco=""
  if (Number(form.opcion.value)!=5){
    try {
    i=form.rev_codrub.selectedIndex
   	if (!comboObligatorio(form.rev_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.rev_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.rev_codreg.selectedIndex;
   	if (!comboObligatorio(form.rev_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.rev_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.act_codgrp.selectedIndex
   	if (!comboObligatorio(form.act_codgrp.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Grupo\n"
		  if (foco.length==0) foco="form.act_codgrp.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    if (!textoObligatorio( form.rev_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.rev_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.rev_codigo.value)) {
	   	mensaje=mensaje+"Debe introducir Código <> 0\n"
		  if (foco.length==0) foco="form.rev_codigo.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.rev_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.rev_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }


    try {
    if (!textoObligatorio( form.rev_numrevaluo.value )) {
	   	mensaje=mensaje+"Debe introducir Número de Revaluo\n"
		  if (foco.length==0) foco="form.rev_numrevaluo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.rev_numrevaluo.value)) {
	   	mensaje=mensaje+"Debe introducir Número de Revaluo <> 0\n"
		  if (foco.length==0) foco="form.rev_numrevaluo.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.rev_numrevaluo.value)){
         mensaje=mensaje+"Debe introducir Números en Número de Revaluo\n"
         if (foco.length==0) foco="form.rev_numrevaluo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!esFecha(form.rev_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha dd/mm/yyyy\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(form.rev_fecha.value,form.fecha_rev.value)){
      mensaje=mensaje+"Debe introducir Fecha mayor o igual a " + form.fecha_rev.value + "\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!ComparaFechas(hoy, form.rev_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha menor o igual a hoy\n"
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
      mensaje=mensaje+"Debe introducir Fecha igual al Periodo "+form.anio.value+form.mes.value+" de proceso\n"
      if (foco.length==0) foco="form.rev_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio(form.rev_valcobol.value)){
      mensaje=mensaje+"Debe introducir Valor en Bolivianos\n"
      if (foco.length==0) foco="form.rev_valcobol.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumeros(form.rev_valcobol.value)){
         mensaje=mensaje+"Debe introducir Números en Valor en Bolivianos\n"
         if (foco.length==0) foco="form.rev_valcobol.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (Number(form.rev_valbol.value)<=0){
      mensaje=mensaje+"Debe introducir Valor en Bolivianos\n"
      if (foco.length==0) foco="form.rev_valbol.focus()"
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
    try {
    if (!textoObligatorio(form.rev_vidaut.value)){
      mensaje=mensaje+"Debe introducir Vida Útil\n"
      if (foco.length==0) foco="form.rev_vidaut.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.rev_vidaut.value)){
         mensaje=mensaje+"Debe introducir Números en Vida Útil\n"
         if (foco.length==0) foco="form.rev_vidaut.focus()"
      }
    }
    catch (e) {
      xvar=0
    }        
    try {
      if (Number(form.rev_vidaut.value)>Number(form.rub_vidaut.value)){
         mensaje=mensaje+"Debe introducir Vida Útil menor o igual a " + form.rub_vidaut.value + "\n"
         if (foco.length==0) foco="form.rev_vidaut.focus()"
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
  function cargar1() {
     for	(var i=0; i < document.RevaluosForm.act_codgrp.options.length; i++) {
           valo0[i]=document.RevaluosForm.act_codgrp.options[i].value
           dele0[i]=document.RevaluosForm.act_codgrp.options[i].text
     }
  }  
  function quitar1()
  {
     var j=0
     var k=0
     var t=0
     dele = new Array()
     valo = new Array()

     for 	(var i=0; i < document.RevaluosForm.rev_codrub.options.length; i++) {
        if (document.RevaluosForm.rev_codrub.options[i].selected==true) {
           k=i
        }
     }

     if (sesion==0) {
        m=0
        for 	(var i=1; i < document.RevaluosForm.act_codgrp.options.length; i++) {
           valor=document.RevaluosForm.act_codgrp.options[i].text
           if (valor.substr(0,valor.indexOf("-"))==document.RevaluosForm.rev_codrub.options[k].text) {       
              valor=document.RevaluosForm.act_codgrp.options[i].text
              valor=valor
              dele[m]=valor.substr(valor.indexOf("-")+1)
              valo[m]=document.RevaluosForm.act_codgrp.options[i].value
              m=m+1   
           }
        }
        sesion=sesion+1
     }
     else {
        m=0
        for 	(var i=1; i < valo0.length; i++) {
           valor=dele0[i]
           if (valor.substr(0,valor.indexOf("-"))==document.RevaluosForm.rev_codrub.options[k].text) {       
              valor=dele0[i]
              valor=valor
              dele[m]=valor.substr(valor.indexOf("-")+1)
              valo[m]=valo0[i]
              m=m+1   
           }
        }
     }

     lon=document.RevaluosForm.act_codgrp.options.length
     for 	(var i=1; i < lon; i++) {
        document.RevaluosForm.act_codgrp.options[0]=null           
     }
     document.RevaluosForm.act_codgrp.options[0]=null
     n=0
     for 	(var i=0; i < m; i++) {
        valor="var option0 = new Option(dele[i], valo[i])"
        eval(valor)
        eval("document.RevaluosForm.act_codgrp.options[n]=option0") 
        n=++n
     }     
  }
</script>
<body onload="cargar1()">
<html:form action="/revaluosAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<html:hidden property="rub_vidaut" name="RevaluosForm"/>
<html:hidden property="fecha_rev" name="RevaluosForm"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
<caption>Revaluos</caption>
<logic:equal value="1" name="RevaluosForm" property="operacion">
   <logic:equal name="RevaluosForm" property = "opcion" value="1" >
      <tr>
         <td class="S10d"><bean:message key="revaluos.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codrub" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_rubdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codreg" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_regdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="activos.codgrp" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codgrp" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_grpdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>            
      <tr>
         <td class="S10d"><bean:message key="revaluos.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codigo" name="RevaluosForm" size="5" maxlength="5" />
         <html:text readonly="true" property="rev_codbarra" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_descripcion" name="RevaluosForm" size="70" maxlength="70" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.numrevaluo" /></td>
         <td><html:text readonly="true" property="rev_numrevaluo" name="RevaluosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="revaluos.fecha" /></td>
         <td><html:text property="rev_fecha" name="RevaluosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.valbol" /></td>
         <td><html:text property="rev_valbol" name="RevaluosForm" size="13" maxlength="13" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.vidaut" /></td>
         <td><html:text property="rev_vidaut" name="RevaluosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="revaluos.estadoactivo" /></td>
         <td><html:select name="RevaluosForm" property="rev_estadoactivo" disabled="false">
             <html:options collection="EstadosLista" property="estado" labelProperty="desestado"/>
             </html:select>
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.desestado" /></td>
         <td colspan="3"><html:text property="rev_desestado" name="RevaluosForm" size="60" maxlength="60" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.numdocumento" /></td>
         <td><html:text property="rev_numdocumento" name="RevaluosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td colspan=6><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="RevaluosForm" property = "opcion" value="2" >
      <tr>
         <td class="S10d"><bean:message key="revaluos.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codrub" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_rubdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codreg" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_regdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="activos.codgrp" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codgrp" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_grpdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>            
      <tr>
         <td class="S10d"><bean:message key="revaluos.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codigo" name="RevaluosForm" size="5" maxlength="5" />
         <html:text readonly="true" property="rev_codbarra" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_descripcion" name="RevaluosForm" size="70" maxlength="70" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.numrevaluo" /></td>
         <td><html:text readonly="true" property="rev_numrevaluo" name="RevaluosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="revaluos.fecha" /></td>
         <td><html:text property="rev_fecha" name="RevaluosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.valbol" /></td>
         <td><html:text property="rev_valbol" name="RevaluosForm" size="13" maxlength="13" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.vidaut" /></td>
         <td><html:text property="rev_vidaut" name="RevaluosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="revaluos.estadoactivo" /></td>
         <td><html:select name="RevaluosForm" property="rev_estadoactivo" disabled="false">
             <html:options collection="EstadosLista" property="estado" labelProperty="desestado"/>
             </html:select>
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.desestado" /></td>
         <td colspan="3"><html:text property="rev_desestado" name="RevaluosForm" size="60" maxlength="60" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.numdocumento" /></td>
         <td><html:text property="rev_numdocumento" name="RevaluosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td colspan=6><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="RevaluosForm" property = "opcion" value="3" >
      <tr>
         <td class="S10d"><bean:message key="revaluos.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codrub" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_rubdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codreg" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_regdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="activos.codgrp" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codgrp" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_grpdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="revaluos.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codigo" name="RevaluosForm" size="5" maxlength="5" />
         <html:text readonly="true" property="rev_codbarra" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_descripcion" name="RevaluosForm" size="70" maxlength="70" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.numrevaluo" /></td>
         <td><html:text readonly="true" property="rev_numrevaluo" name="RevaluosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="revaluos.fecha" /></td>
         <td><html:text readonly="true" property="rev_fecha" name="RevaluosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.valbol" /></td>
         <td><html:text readonly="true" property="rev_valbol" name="RevaluosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.vidaut" /></td>
         <td><html:text readonly="true" property="rev_vidaut" name="RevaluosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="revaluos.estadoactivo" /></td>
         <td><html:text readonly="true" name="RevaluosForm" property="rev_estadoactivo" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.desestado" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_desestado" name="RevaluosForm" size="60" maxlength="60" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="revaluos.numdocumento" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_numdocumento" name="RevaluosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td colspan="6"><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=3" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="RevaluosForm" property = "opcion" value="5" >
      <tr>
         <td class="S10d"><bean:message key="revaluos.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codrub" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_rubdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codreg" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_regdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="activos.codgrp" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codgrp" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="rev_grpdescripcion" name="RevaluosForm" size="60" maxlength="60" /></td>
      </tr>       
      <tr>
         <td class="S10d"><bean:message key="revaluos.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_codigo" name="RevaluosForm" size="5" maxlength="5" />
         <html:text readonly="true" property="rev_codbarra" name="RevaluosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_descripcion" name="RevaluosForm" size="70" maxlength="70" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.numrevaluo" /></td>
         <td><html:text readonly="true" property="rev_numrevaluo" name="RevaluosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="revaluos.fecha" /></td>
         <td><html:text readonly="true" property="rev_fecha" name="RevaluosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.valbol" /></td>
         <td><html:text readonly="true" property="rev_valbol" name="RevaluosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.vidaut" /></td>
         <td><html:text readonly="true" property="rev_vidaut" name="RevaluosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="revaluos.estadoactivo" /></td>
         <td><html:text readonly="true" name="RevaluosForm" property="rev_estadoactivo" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="revaluos.desestado" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_desestado" name="RevaluosForm" size="60" maxlength="60" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>      
      <tr>
         <td class="S10d"><bean:message key="revaluos.numdocumento" /></td>
         <td colspan="3"><html:text readonly="true" property="rev_numdocumento" name="RevaluosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td colspan="6"><html:submit value="Consultar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=5" /> </td>
      </tr>
   </logic:equal>   
</logic:equal>
<logic:equal value="2" name="RevaluosForm" property="operacion">
  <tr class="T8a">
     <td>
     <logic:equal value="5" name="RevaluosForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="revaluos.codrub" /></td>
           <td><html:select name="RevaluosForm" property="rev_codrub" disabled="false" onchange="quitar1()">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td> 
        </tr>
        <tr>
           <td class="S10d"><bean:message key="revaluos.codreg" /></td>
            <td><html:hidden property="rev_codreg" name="RevaluosForm" />
            <html:text readonly="true" property="rev_regdescripcion" name="RevaluosForm" size="30" maxlength="30" /></td>
        </tr>
        <tr>
           <td class="S10d"><bean:message key="activos.codgrp" /></td>
           <td><html:select name="RevaluosForm" property="act_codgrp" disabled="false">
               <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td> 
        </tr>     
        <tr>
           <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
           <td><html:text property="act_descripcion" name="RevaluosForm" size="50" maxlength="50" value="%" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
        </tr> 
        <tr>
        <td></td>
        <td align="left">
        <html:submit value="Consultar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=5"/>
        </td>
        </tr>
     </logic:equal>
     <logic:equal value="3" name="RevaluosForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="revaluos.codrub" /></td>
           <td><html:select name="RevaluosForm" property="rev_codrub" disabled="false" onchange="quitar1()">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td> 
        </tr>
        <tr>
           <td class="S10d"><bean:message key="revaluos.codreg" /></td>
            <td><html:hidden property="rev_codreg" name="RevaluosForm" />
            <html:text readonly="true" property="rev_regdescripcion" name="RevaluosForm" size="30" maxlength="30" /></td>
        </tr>
        <tr>
           <td class="S10d"><bean:message key="activos.codgrp" /></td>
           <td><html:select name="RevaluosForm" property="act_codgrp" disabled="false">
               <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td> 
        </tr>     
        <tr>
           <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
           <td><html:text property="act_descripcion" name="RevaluosForm" size="50" maxlength="50" value="%" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
        </tr> 
        <tr>
        <td></td>
        <td align="left">
        <html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=3"/>
        </td>
        </tr>
     </logic:equal>
     <logic:equal value="2" name="RevaluosForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="revaluos.codrub" /></td>
           <td><html:select name="RevaluosForm" property="rev_codrub" disabled="false" onchange="quitar1()">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>
        <tr>
           <td class="S10d"><bean:message key="revaluos.codreg" /></td>
            <td><html:hidden property="rev_codreg" name="RevaluosForm" />
            <html:text readonly="true" property="rev_regdescripcion" name="RevaluosForm" size="30" maxlength="30" /></td>
        </tr>
        <tr>
           <td class="S10d"><bean:message key="activos.codgrp" /></td>
           <td><html:select name="RevaluosForm" property="act_codgrp" disabled="false">
               <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>    
        <tr>
           <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
           <td><html:text property="act_descripcion" name="RevaluosForm" size="50" maxlength="50" value="%" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
        </tr> 
        <tr>
        <td></td>
        <td align="left">
        <html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=2"/>
        </td>
        </tr>
     </logic:equal>
     <logic:equal value="1" name="RevaluosForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="revaluos.codrub" /></td>
           <td><html:select name="RevaluosForm" property="rev_codrub" disabled="false" onchange="quitar1()">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>
        <tr>
           <td class="S10d"><bean:message key="revaluos.codreg" /></td>
            <td><html:hidden property="rev_codreg" name="RevaluosForm" />
            <html:text readonly="true" property="rev_regdescripcion" name="RevaluosForm" size="30" maxlength="30" /></td>
        </tr>
        <tr>
           <td class="S10d"><bean:message key="activos.codgrp" /></td>
           <td><html:select name="RevaluosForm" property="act_codgrp" disabled="false">
               <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>        
        <tr>
           <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
           <td><html:text property="act_descripcion" name="RevaluosForm" size="50" maxlength="50" value="%" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
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
<logic:equal value="3" name="RevaluosForm" property="operacion">
  <tr class="T8a">
     <td>
     <table width="100%" align="center" class="soloborde" bgcolor="#C1C1FF" border="1">
     <tr><td>
     <html:hidden property="rev_codrub" name="RevaluosForm" />
     <html:hidden property="rev_codreg" name="RevaluosForm" />
     <html:hidden property="act_codgrp" name="RevaluosForm" />     
     <html:hidden property="act_descripcion" name="RevaluosForm" />
      <table width="100%" class="soloborde" bgcolor="#C1C1FF">
       <tr class="FondoAzul">
         <td width="80" scope="col" class="S10c">Código</td>
         <td width="160" scope="col" class="S10c">Descripción</td>
         <logic:notEqual value="1" name="RevaluosForm" property="opcion">
         <td width="60" scope="col" class="S10c">Revaluo</td>
         </logic:notEqual>
         <td></td>
       </tr>
      <% int pnum=0;%>
      <logic:iterate name="Activos3Lista" id="lista">
        <% if (pnum==1) {%>
           <tr class="T8b">
        <% } else { %>
           <tr class="T8a">
        <% } %>
           <td><bean:write name="lista" property="codrub" />-<bean:write name="lista" property="codreg" />-<bean:write name="lista" property="ceros" /><bean:write name="lista" property="codigo" /></td>
           <td><bean:write name="lista" property="descripcion" /></td>
           <logic:notEqual value="1" name="RevaluosForm" property="opcion">
           <td><bean:write name="lista" property="numrevaluo" /></td>
           </logic:notEqual>
           <logic:equal value="5" name="RevaluosForm" property="opcion">
              <td align="right"><html:submit value="Consultar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=5"/></td>
           </logic:equal>
           <logic:equal value="3" name="RevaluosForm" property="opcion">
              <td align="right"><html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/></td>
           </logic:equal>     
           <logic:equal value="2" name="RevaluosForm" property="opcion">
              <td align="right"><html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/></td>
           </logic:equal>     
           <logic:equal value="1" name="RevaluosForm" property="opcion">
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
