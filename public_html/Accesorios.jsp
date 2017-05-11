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
<body>
<html:form action="/accesoriosAction">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Accesorios</caption>
<logic:equal value="1" name="AccesoriosForm" property="operacion">
   <logic:equal name="AccesoriosForm" property = "opcion" value="1" >
      <tr>
         <td class="S10d"><bean:message key="accesorios.codrub" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codrub" disabled="false">
               <html:options collection="RubrosLista" property="codigo"  labelProperty="descripcion"/>
              </html:select></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codreg" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codreg" disabled="false">
               <html:options collection="RegionalesLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codigo" /></td>
         <td><html:text property="acc_codigo" name="AccesoriosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codrubact" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codrubact" disabled="false">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codregact" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codregact" disabled="false">
               <html:options collection="RegionalesLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codigoact" /></td>
         <td><html:text property="acc_codigoact" name="AccesoriosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codgrp" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codgrp" disabled="false">
               <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codmot" /></td>
         <td><html:text property="acc_codmot" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.feccompra" /></td>
         <td><html:text property="acc_feccompra" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.tipcam" /></td>
         <td><html:text property="acc_tipcam" name="AccesoriosForm" size="11" maxlength="11" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.tipufv" /></td>
         <td><html:text property="acc_tipufv" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.umanejo" /></td>
         <td><html:text property="acc_umanejo" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.descripcion" /></td>
         <td><html:text property="acc_descripcion" name="AccesoriosForm" size="60" maxlength="120" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.desadicional" /></td>
         <td><html:text property="acc_desadicional" name="AccesoriosForm" size="60" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.proveedor" /></td>
         <td><html:text property="acc_proveedor" name="AccesoriosForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.marca" /></td>
         <td><html:text property="acc_marca" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.modelo" /></td>
         <td><html:text property="acc_modelo" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.serie1" /></td>
         <td><html:text property="acc_serie1" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.serie2" /></td>
         <td><html:text property="acc_serie2" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.docreferencia" /></td>
         <td><html:text property="acc_docreferencia" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.fecreferencia" /></td>
         <td><html:text property="acc_fecreferencia" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcobol" /></td>
         <td><html:text property="acc_valcobol" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcodol" /></td>
         <td><html:text property="acc_valcodol" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcoufv" /></td>
         <td><html:text property="acc_valcoufv" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.fecbaja" /></td>
         <td><html:text property="acc_fecbaja" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.docbaja" /></td>
         <td><html:text property="acc_docbaja" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.ordencompra" /></td>
         <td><html:text property="acc_ordencompra" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.numfactura" /></td>
         <td><html:text property="acc_numfactura" name="AccesoriosForm" size="8" maxlength="8" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.numcomprobante" /></td>
         <td><html:text property="acc_numcomprobante" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codanterior" /></td>
         <td><html:text property="acc_codanterior" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.indetiqueta" /></td>
         <td><html:text property="acc_indetiqueta" name="AccesoriosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
         <td colspan=2><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" />
      </tr>
   </logic:equal>
   <logic:equal name="AccesoriosForm" property = "opcion" value="2" >
      <tr>
         <td class="S10d"><bean:message key="accesorios.codrub" /></td>
         <td><html:text readonly="true" property="acc_codrub" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codreg" /></td>
         <td><html:text readonly="true" property="acc_codreg" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codigo" /></td>
         <td><html:text readonly="true" property="acc_codigo" name="AccesoriosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codrubact" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codrubact" disabled="false">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codregact" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codregact" disabled="false">
               <html:options collection="RegionalesLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codigoact" /></td>
         <td><html:text property="acc_codigoact" name="AccesoriosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codgrp" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codgrp" disabled="false">
               <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codmot" /></td>
         <td><html:text property="acc_codmot" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.feccompra" /></td>
         <td><html:text property="acc_feccompra" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.tipcam" /></td>
         <td><html:text property="acc_tipcam" name="AccesoriosForm" size="11" maxlength="11" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.tipufv" /></td>
         <td><html:text property="acc_tipufv" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.umanejo" /></td>
         <td><html:text property="acc_umanejo" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.descripcion" /></td>
         <td><html:text property="acc_descripcion" name="AccesoriosForm" size="60" maxlength="120" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.desadicional" /></td>
         <td><html:text property="acc_desadicional" name="AccesoriosForm" size="60" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.proveedor" /></td>
         <td><html:text property="acc_proveedor" name="AccesoriosForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.marca" /></td>
         <td><html:text property="acc_marca" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.modelo" /></td>
         <td><html:text property="acc_modelo" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.serie1" /></td>
         <td><html:text property="acc_serie1" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.serie2" /></td>
         <td><html:text property="acc_serie2" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.docreferencia" /></td>
         <td><html:text property="acc_docreferencia" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.fecreferencia" /></td>
         <td><html:text property="acc_fecreferencia" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcobol" /></td>
         <td><html:text property="acc_valcobol" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcodol" /></td>
         <td><html:text property="acc_valcodol" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcoufv" /></td>
         <td><html:text property="acc_valcoufv" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.fecbaja" /></td>
         <td><html:text property="acc_fecbaja" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.docbaja" /></td>
         <td><html:text property="acc_docbaja" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.ordencompra" /></td>
         <td><html:text property="acc_ordencompra" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.numfactura" /></td>
         <td><html:text property="acc_numfactura" name="AccesoriosForm" size="8" maxlength="8" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.numcomprobante" /></td>
         <td><html:text property="acc_numcomprobante" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codanterior" /></td>
         <td><html:text property="acc_codanterior" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.indetiqueta" /></td>
         <td><html:text property="acc_indetiqueta" name="AccesoriosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
         <td colspan=2><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" />
      </tr>
   </logic:equal>
   <logic:equal name="AccesoriosForm" property = "opcion" value="3" >
      <tr>
         <td class="S10d"><bean:message key="accesorios.codrub" /></td>
         <td><html:text readonly="true" property="acc_codrub" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codreg" /></td>
         <td><html:text readonly="true" property="acc_codreg" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codigo" /></td>
         <td><html:text readonly="true" property="acc_codigo" name="AccesoriosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codrubact" /></td>
         <td><html:text readonly="true" property="acc_codrubact" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codregact" /></td>
         <td><html:text readonly="true" property="acc_codregact" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codigoact" /></td>
         <td><html:text readonly="true" property="acc_codigoact" name="AccesoriosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codgrp" /></td>
         <td><html:text readonly="true" property="acc_codgrp" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codmot" /></td>
         <td><html:text readonly="true" property="acc_codmot" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.feccompra" /></td>
         <td><html:text readonly="true" property="acc_feccompra" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.tipcam" /></td>
         <td><html:text readonly="true" property="acc_tipcam" name="AccesoriosForm" size="11" maxlength="11" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.tipufv" /></td>
         <td><html:text readonly="true" property="acc_tipufv" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.umanejo" /></td>
         <td><html:text readonly="true" property="acc_umanejo" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.descripcion" /></td>
         <td><html:text readonly="true" property="acc_descripcion" name="AccesoriosForm" size="60" maxlength="120" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.desadicional" /></td>
         <td><html:text readonly="true" property="acc_desadicional" name="AccesoriosForm" size="60" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.proveedor" /></td>
         <td><html:text readonly="true" property="acc_proveedor" name="AccesoriosForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.marca" /></td>
         <td><html:text readonly="true" property="acc_marca" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.modelo" /></td>
         <td><html:text readonly="true" property="acc_modelo" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.serie1" /></td>
         <td><html:text readonly="true" property="acc_serie1" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.serie2" /></td>
         <td><html:text readonly="true" property="acc_serie2" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.docreferencia" /></td>
         <td><html:text readonly="true" property="acc_docreferencia" name="AccesoriosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.fecreferencia" /></td>
         <td><html:text readonly="true" property="acc_fecreferencia" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcobol" /></td>
         <td><html:text readonly="true" property="acc_valcobol" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcodol" /></td>
         <td><html:text readonly="true" property="acc_valcodol" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.valcoufv" /></td>
         <td><html:text readonly="true" property="acc_valcoufv" name="AccesoriosForm" size="15" maxlength="15" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.fecbaja" /></td>
         <td><html:text readonly="true" property="acc_fecbaja" name="AccesoriosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.docbaja" /></td>
         <td><html:text readonly="true" property="acc_docbaja" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.ordencompra" /></td>
         <td><html:text readonly="true" property="acc_ordencompra" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.numfactura" /></td>
         <td><html:text readonly="true" property="acc_numfactura" name="AccesoriosForm" size="8" maxlength="8" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.numcomprobante" /></td>
         <td><html:text readonly="true" property="acc_numcomprobante" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.codanterior" /></td>
         <td><html:text readonly="true" property="acc_codanterior" name="AccesoriosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="accesorios.indetiqueta" /></td>
         <td><html:text readonly="true" property="acc_indetiqueta" name="AccesoriosForm" size="1" maxlength="1" /></td>
      </tr>
      <tr>
         <td colspan=2><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=3" />
      </tr>
   </logic:equal>
</logic:equal>
<logic:notEqual value="1" name="AccesoriosForm" property="operacion">
  <tr class="T8a">
     <td>
     <logic:equal value="3" name="AccesoriosForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="accesorios.codrub" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codrub" disabled="false">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion" />
              </html:select></td>           
        </tr>
        <tr>
           <td class="S10d"><bean:message key="accesorios.codreg" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codreg" disabled="false">
               <html:options collection="RegionalesLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>
        <tr>
           <td class="S10d"><bean:message key="accesorios.codigo" /></td>
           <td><html:text property="acc_codigo" name="AccesoriosForm" size="4" maxlength="4" /></td>
        </tr>
        <tr>
        <td colspan="2">
        <html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=1;opcion.value=3"/>
        </td>
        </tr>
     </logic:equal>
     <logic:equal value="2" name="AccesoriosForm" property="opcion">
        <tr>
           <td class="S10d"><bean:message key="accesorios.codrub" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codrub" disabled="false">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>
        <tr>
           <td class="S10d"><bean:message key="accesorios.codreg" /></td>
           <td><html:select name="AccesoriosForm" property="acc_codreg" disabled="false">
               <html:options collection="RegionalesLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>           
        </tr>
        <tr>
           <td class="S10d"><bean:message key="accesorios.codigo" /></td>
           <td><html:text property="acc_codigo" name="AccesoriosForm" size="4" maxlength="4" /></td>
        </tr>
        <tr>
        <td colspan="2">
        <html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=1;opcion.value=2"/>
        </td>
        </tr>
     </logic:equal>
     </td>
   </tr>
</logic:notEqual>
</table>
</html:form>
</body>
</html>
