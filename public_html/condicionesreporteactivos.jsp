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

  function ftarget()
  {
     f = document.forms[0];
     f.target='_blank';
  }
  function cargar_anios() {
      document.ReportesForm.condicion10.value=document.ReportesForm.condicion5.value.substr(6,4);
      document.ReportesForm.condicion11.value=Number(document.ReportesForm.condicion5.value.substr(6,4))-1;
  }
  function cargar() {
     if ((document.ReportesForm.opcion.value==3)||(document.ReportesForm.opcion.value==5))
       {
        for	(var i=0; i < document.ReportesForm.condicion2.options.length; i++) {
           valo0[i]=document.ReportesForm.condicion2.options[i].value
           dele0[i]=document.ReportesForm.condicion2.options[i].text
        }
     }
  }
  function quitar()
  {
     var j=0
     var k=0
     var t=0
     dele = new Array()
     valo = new Array()
     for 	(var i=0; i < document.ReportesForm.condicion1.options.length; i++) {
        if (document.ReportesForm.condicion1.options[i].selected==true) {
           k=i
        }
     }
     if (sesion==0) {
        m=0
        for 	(var i=1; i < document.ReportesForm.condicion2.options.length; i++) {
           valor=document.ReportesForm.condicion2.options[i].text
           if (valor.substr(0,valor.indexOf("-"))==document.ReportesForm.condicion1.options[k].text) {       
              valor=document.ReportesForm.condicion2.options[i].text
              valor=valor
              dele[m]=valor.substr(valor.indexOf("-")+1)
              valo[m]=document.ReportesForm.condicion2.options[i].value
              m=m+1   
           }
        }
        sesion=sesion+1
     }
     else {
        m=0
        for 	(var i=1; i < valo0.length; i++) {
           valor=dele0[i]
           if (valor.substr(0,valor.indexOf("-"))==document.ReportesForm.condicion1.options[k].text) {       
              valor=dele0[i]
              valor=valor
              dele[m]=valor.substr(valor.indexOf("-")+1)
              valo[m]=valo0[i]
              m=m+1   
           }
        }
     }
     lon=document.ReportesForm.condicion2.options.length
     for 	(var i=1; i < lon; i++) {
        document.ReportesForm.condicion2.options[0]=null           
     }
     document.ReportesForm.condicion2.options[0]=null
     n=0
     for 	(var i=0; i < m; i++) {
        valor="var option0 = new Option(dele[i], valo[i])"
        eval(valor)
        eval("document.ReportesForm.condicion2.options[n]=option0") 
        n=++n
     }     
  }
</script>
<body onload="cargar()">
<html:form action="/reporteactivosAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
  <caption>Reporte Activos</caption>
  <logic:equal value="1" name="ReportesForm" property="operacion">     
     <logic:equal value="1" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR REFERENCIA</b></td></tr>
        <tr><td class="S10d" width="50%">*Descripción : </td>
            <td width="50%"><html:text property="condicion1" name="ReportesForm" size="50" maxlength="50" /></td></tr></logic:equal>
     <logic:equal value="2" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR RANGO</b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Regional : </td>
           <td width="50%"><html:hidden property="condicion2" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Codigo Inicial : </td>
           <td width="50%"><html:text property="condicion3" name="ReportesForm" size="5" maxlength="5" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Codigo Final : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="5" maxlength="5" /></td></tr></logic:equal>
     <logic:equal value="3" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR GRUPO</b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false" onchange="quitar()" >
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Grupo : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion2" disabled="false">
              <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr></logic:equal>
     <logic:equal value="4" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR UBICACION</b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Ubicación : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="UbicacionesLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Regional : </td>
           <td width="50%"><html:hidden property="condicion2" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr></logic:equal>        
     <logic:equal value="5" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR RESPONSABLE</b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Funcionario : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion3" disabled="false">
              <html:options collection="FuncionariosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false" onchange="quitar()" >
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">Grupo : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion2" disabled="false">
              <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr></logic:equal>        
     <logic:equal value="6" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR PROYECTO</b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr></logic:equal>
     <logic:equal value="7" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR REFERENCIA (Terrenos/Edificios)</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Gobierno Municipal : </td>
           <td width="50%"><html:text property="condicion1" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Documento de Referencia : </td>
           <td width="50%"><html:text property="condicion2" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Nro. de Folio : </td>
           <td width="50%"><html:text property="condicion3" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Nro. de Testimonio : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="50" maxlength="50" /></td></tr></logic:equal>
     <logic:equal value="8" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR REFERENCIA (Muebles/Eq. Educación)</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Marca : </td>
           <td width="50%"><html:text property="condicion1" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Color : </td>
           <td width="50%"><html:text property="condicion2" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Material : </td>
           <td width="50%"><html:text property="condicion3" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Proveedor : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="50" maxlength="50" /></td></tr></logic:equal>
     <logic:equal value="9" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR REFERENCIA (Marca/Modelo/Serie)</b></td></tr>
       <tr>
           <td class="S10d" width="50%">Marca : </td>
           <td><html:text property="condicion1" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Modelo : </td>
           <td><html:text property="condicion2" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Serie : </td>
           <td><html:text property="condicion3" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Proveedor : </td>
           <td><html:text property="condicion4" name="ReportesForm" size="50" maxlength="50" /></td></tr></logic:equal>
     <logic:equal value="10" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR REFERENCIA (Vehículos)</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Marca : </td>
           <td><html:text property="condicion1" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Tipo : </td>
           <td><html:text property="condicion2" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Nro. de Motor : </td>
           <td><html:text property="condicion3" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Nro. de chasis : </td>
           <td><html:text property="condicion4" name="ReportesForm" size="50" maxlength="50" /></td></tr>
        <tr>
           <td class="S10d" width="50%">Placa : </td>
           <td><html:text property="condicion5" name="ReportesForm" size="50" maxlength="50" /></td></tr></logic:equal>
     <logic:equal value="11" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR OFICINA</b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Oficina : </td>
           <td><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Regional : </td>
           <td><html:hidden property="condicion2" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr></logic:equal>         
     <logic:equal value="12" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS POR REGIONAL PARA CUADRE</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion2" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr></logic:equal>         
     <logic:equal value="13" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE INCORPORACION DE ACTIVOS</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion3" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Inicial : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="10" maxlength="10" /></td></tr>         
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onchange="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr>               
        <tr>
           <td class="S10d">Incorporados\Revaluados: </td>
           <td class="S10i"><input type="radio" name="condirep" checked="checked" value="I"> Incorporados <input type="radio" name="condirep" value="R"> Revaluados</td></tr></logic:equal>          
     <logic:equal value="14" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS DADOS DE BAJA POR RUBRO</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion2" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr> 
        <tr>
           <td class="S10d" width="50%">Fecha Inicial : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="10" maxlength="10" /></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr> 
        <tr>
           <td class="S10d">Bajas\Ajustes: </td>
           <td class="S10i"><input type="radio" name="condirep" checked="checked" value="B"> Bajas <input type="radio" name="condirep" value="A"> Ajustes</td></tr></logic:equal>          
     <logic:equal value="15" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE INVENTARIO DE ACTIVOS POR REGIONAL</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false" >
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion2" name="ReportesForm" />
               <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>          
     <logic:equal value="16" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE INVENTARIO DE ACTIVOS POR RUBRO</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion2" name="ReportesForm" />
              <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>          
     <logic:equal value="17" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE RESUMEN DE ACTIVOS POR RUBRO </b></td></tr>
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion1" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>          
     <logic:equal value="18" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE RESUMEN DE ACTIVOS POR CUENTA (PARTIDA) </b></td></tr>
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion1" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>          
     <logic:equal value="19" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE RESUMEN DE ACTIVOS POR REGIONAL</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion1" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>          
     <logic:equal value="20" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE NUEVOS ACTIVOS</b></td></tr></logic:equal>  
     <logic:equal value="21" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE ACTIVOS INVENTARIADOS</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Fecha Inicial : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="10" maxlength="10" /></td></tr>         
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" /></td></tr></logic:equal>          
     <logic:equal value="22" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE CAMBIO DE ESTADO, OFICINA y PROYECTO</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Fecha Inicial : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="10" maxlength="10" /></td></tr>         
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" /></td></tr></logic:equal>             
     <logic:equal value="23" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE CAMBIO DE FUNCIONARIO</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Fecha Inicial : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="10" maxlength="10" /></td></tr>         
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" /></td></tr></logic:equal>            
     <logic:equal value="24" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE FALTANTES Y SOBRANTES</b></td></tr>
        <tr>
           <td class="S10d" width="50%">Fecha Inicial : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="10" maxlength="10" /></td></tr>         
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" /></td></tr>                 
        <tr>
           <td class="S10d" width="50%">*Funcionario : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="FuncionariosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr></logic:equal>              
     <logic:equal value="25" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE CONSOLIDADO POR RUBRO </b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>          
     <logic:equal value="26" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE VALIDA DEPRECIACION </b></td></tr></logic:equal>
     <logic:equal value="27" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>HISTORIAL DE ACTIVOS POR FECHA</b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Rubro : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Regional : </td>
           <td width="50%"><html:hidden property="condicion2" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Codigo Inicial : </td>
           <td width="50%"><html:text property="condicion3" name="ReportesForm" size="5" maxlength="5" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Codigo Final : </td>
           <td width="50%"><html:text property="condicion4" name="ReportesForm" size="5" maxlength="5" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Fecha Inicial : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" /></td></tr>         
        <tr>
           <td class="S10d" width="50%">*Fecha Final : </td>
           <td width="50%"><html:text property="condicion6" name="ReportesForm" size="10" maxlength="10" /></td></tr></logic:equal>        
     <logic:equal value="28" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE CONSOLIDADO POR CUENTA </b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>        
     <logic:equal value="29" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>HISTORIAL DE RESPONSABLES POR FECHA</b></td>
        <tr>
           <td class="S10d" width="50%">*Funcionario : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false">
              <html:options collection="FuncionariosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Fecha Inicial : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" /></td></tr>         
        <tr>
           <td class="S10d" width="50%">*Fecha Final : </td>
           <td width="50%"><html:text property="condicion6" name="ReportesForm" size="10" maxlength="10" /></td></tr></logic:equal>          
     <logic:equal value="30" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE DE INVENTARIO DE ACTIVOS POR UBICACION</b></td></tr>
        <tr>
           <td class="S10d" width="50%">*Ubicacion : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion1" disabled="false" >
              <html:options collection="UbicacionesLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">Oficina : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion3" disabled="false">
              <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>              
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion2" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">*Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>          
     <logic:equal value="31" name="ReportesForm" property="opcion">
        <tr><td colspan="2" align="center"><b>REPORTE RESUMEN DE ACTIVOS POR UBICACION</b></td></tr>       
        <tr>
           <td class="S10d" width="50%">Regional : </td>
           <td width="50%"><html:hidden property="condicion1" name="ReportesForm" />
           <html:text readonly="true" property="des_codreg" name="ReportesForm" size="60" maxlength="60" /></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion6" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>
        <tr>
           <td class="S10d" width="50%">*Proyecto : </td>
           <td width="50%"><html:select name="ReportesForm" property="condicion7" disabled="false">
              <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/></html:select></td></tr>        
        <tr>
           <td class="S10d" width="50%">*Fecha Final : </td>
           <td width="50%"><html:text property="condicion5" name="ReportesForm" size="10" maxlength="10" onblur="cargar_anios()" />
               <html:hidden property="condicion10" name="ReportesForm" />
               <html:hidden property="condicion11" name="ReportesForm" /></td></tr></logic:equal>       
     <tr>
      <td class="S10d" width="50%">Formato de Salida : </td>
      <td width="50%"><html:select property="tiporep" name="ReportesForm">
        <html:option value="PDF">PDF</html:option>
        <html:option value="XLS">Excel</html:option>
        <html:option value="HTML">Html</html:option></html:select></td></tr>      
      <tr>
        <td align="center" colspan="2" width="100%">
        <html:submit value="Reportar" styleClass="boton1" property="boton" onclick="operacion.value=2"/></td></tr>
  </logic:equal>
</table>
</html:form>
</body>
</html>