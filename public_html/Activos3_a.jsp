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
<script language="JavaScript" type="text/JavaScript" src="Validaciones2.js?1.3"></script>
<body>
<table border="1" width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Activos</caption>
<tr><td>
<html:form action="/activosAction">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<logic:equal value="1" name="ActivosForm" property="operacion">
   <logic:equal name="ActivosForm" property = "opcion" value="4" >
      <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
      <tr>
         <td class="S10d"><bean:message key="activos3.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codrub" name="ActivosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_rubdescripcion" name="ActivosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codreg" name="ActivosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codigo" name="ActivosForm" size="5" maxlength="5" />
         <html:text readonly="true" property="act_codbarra" name="ActivosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codgrp" /></td>
         <td>
             <html:text readonly="true" property="act_grpdescripcion" name="ActivosForm" size="40" maxlength="40" /> 
             <html:hidden property="act_codgrp" name="ActivosForm" />
         </td>
         <td class="S10d"><bean:message key="activos3.codpar" /></td>
         <td>
              <html:text readonly="true" property="act_pardescripcion" name="ActivosForm" size="40" maxlength="40" />            
              <html:hidden property="act_codpar" name="ActivosForm" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codofi" /></td>
         <td>
         <html:text readonly="true" property="act_ofidescripcion" name="ActivosForm" size="40" maxlength="40" />            
         <html:hidden property="act_codofi" name="ActivosForm" />
         </td>
         <td class="S10d"><bean:message key="activos3.codfun" /></td>
         <td>
         <html:text readonly="true" property="act_fundescripcion" name="ActivosForm" size="40" maxlength="40" />            
         <html:hidden property="act_codfun" name="ActivosForm" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codubi" /></td>
         <td>
              <html:text readonly="true" property="act_ubidescripcion" name="ActivosForm" size="40" maxlength="40" /> 
              <html:hidden property="act_codubi" name="ActivosForm" />
         </td>
         <td class="S10d"><bean:message key="activos3.codpry" /></td>
         <td>
              <html:text readonly="true" property="act_prydescripcion" name="ActivosForm" size="40" maxlength="40" /> 
              <html:hidden property="act_codpry" name="ActivosForm" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codfin" /></td>
         <td>
              <html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="40" maxlength="40" /> 
              <html:hidden property="act_codfin" name="ActivosForm" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.feccompra" /></td>
         <td><html:text readonly="true" property="act_feccompra" name="ActivosForm" size="10" maxlength="10" /></td>
         <td class="S10d"><bean:message key="activos3.tipcam" /></td>
         <td><html:text readonly="true" property="act_tipcam" name="ActivosForm" size="11" maxlength="11" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.tipufv" /></td>
         <td><html:text readonly="true" property="act_tipufv" name="ActivosForm" size="11" maxlength="11" /></td>
         <td class="S10d"><bean:message key="activos3.umanejo" /></td>
         <td><html:text readonly="true" property="act_umanejo" name="ActivosForm" size="20" maxlength="20" /></td>
      </tr>
      </table>
     <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
      <tr>
         <td class="S10d"><bean:message key="activos3.descripcion" /></td>
         <td><html:text readonly="true" property="act_descripcion" name="ActivosForm" size="60" maxlength="120" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.desadicional" /></td>
         <td><html:text readonly="true" property="act_desadicional" name="ActivosForm" size="60" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d">
            <bean:message key="activos.proveedor" />
         </td>
         <td>
            <html:text readonly="true" property="act_proveedor" name="ActivosForm" size="50" maxlength="50" />
         </td>
      </tr>            
      </table>
      <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">      
      <tr>
         <td class="S10d"><bean:message key="activos3.accesorios" /></td>
         <td><html:text readonly="true" property="act_accesorios" name="ActivosForm" size="60" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.proveedor" /></td>
         <td><html:text readonly="true" property="act_proveedor" name="ActivosForm" size="50" maxlength="50" /></td>
         <td class="S10d"><bean:message key="activos3.marca" /></td>
         <td><html:text readonly="true" property="act_marca" name="ActivosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.modelo" /></td>
         <td><html:text readonly="true" property="act_modelo" name="ActivosForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="activos3.serie1" /></td>
         <td><html:text readonly="true" property="act_serie1" name="ActivosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.color" /></td>
         <td><html:text readonly="true" property="act_color" name="ActivosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.procedencia" /></td>
         <td><html:text readonly="true" property="act_procedencia" name="ActivosForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="activos3.gobmunicipal" /></td>
         <td><html:text readonly="true" property="act_gobmunicipal" name="ActivosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.valcobol" /></td>
         <td><html:text readonly="true" property="act_valcobol" name="ActivosForm" size="15" maxlength="15" /></td>
         <td class="S10d"><bean:message key="activos3.ordencompra" /></td>
         <td><html:text readonly="true" property="act_ordencompra" name="ActivosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.numfactura" /></td>
         <td><html:text readonly="true" property="act_numfactura" name="ActivosForm" size="8" maxlength="8" /></td>
         <td class="S10d"><bean:message key="activos3.numcomprobante" /></td>
         <td><html:text readonly="true" property="act_numcomprobante" name="ActivosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codanterior" /></td>
         <td><html:text readonly="true" property="act_codanterior" name="ActivosForm" size="20" maxlength="20" /></td>
         <td class="S10d"><bean:message key="activos3.fecha" /></td>
         <td><html:text readonly="true" property="rev_fecha" name="ActivosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.vidaut" /></td>
         <td><html:text readonly="true" property="rev_vidaut" name="ActivosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="activos3.estadoactivo" /></td>
         <td><html:text readonly="true" property="desestado" name="ActivosForm" size="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.desestado" /></td>
         <td><html:text readonly="true" property="rev_desestado" name="ActivosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td colspan=2><html:submit value="Consultar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=4" /></td>
      </tr>        
      </table>      
   </logic:equal>      
   <logic:equal name="ActivosForm" property = "opcion" value="5" >
      <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
      <tr>
         <td class="S10d"><bean:message key="activos3.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codrub" name="ActivosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_rubdescripcion" name="ActivosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codreg" name="ActivosForm" size="10" maxlength="10" />
         <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codigo" name="ActivosForm" size="5" maxlength="5" />
         <html:text readonly="true" property="act_codbarra" name="ActivosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codgrp" /></td>
         <td>
             <html:text readonly="true" property="act_grpdescripcion" name="ActivosForm" size="40" maxlength="40" /> 
             <html:hidden property="act_codgrp" name="ActivosForm" />
         </td>
         <td class="S10d"><bean:message key="activos3.codpar" /></td>
         <td>
              <html:text readonly="true" property="act_pardescripcion" name="ActivosForm" size="40" maxlength="40" />            
              <html:hidden property="act_codpar" name="ActivosForm" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codofi" /></td>
         <td>
         <html:text readonly="true" property="act_ofidescripcion" name="ActivosForm" size="40" maxlength="40" />            
         <html:hidden property="act_codofi" name="ActivosForm" />
         </td>
         <td class="S10d"><bean:message key="activos3.codfun" /></td>
         <td>
         <html:text readonly="true" property="act_fundescripcion" name="ActivosForm" size="40" maxlength="40" />            
         <html:hidden property="act_codfun" name="ActivosForm" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codubi" /></td>
         <td>
              <html:text readonly="true" property="act_ubidescripcion" name="ActivosForm" size="40" maxlength="40" /> 
              <html:hidden property="act_codubi" name="ActivosForm" />
         </td>
         <td class="S10d"><bean:message key="activos3.codpry" /></td>
         <td>
              <html:text readonly="true" property="act_prydescripcion" name="ActivosForm" size="40" maxlength="40" /> 
              <html:hidden property="act_codpry" name="ActivosForm" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codfin" /></td>
         <td>
              <html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="40" maxlength="40" /> 
              <html:hidden property="act_codfin" name="ActivosForm" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.feccompra" /></td>
         <td><html:text readonly="true" property="act_feccompra" name="ActivosForm" size="10" maxlength="10" /></td>
         <td class="S10d"><bean:message key="activos3.tipcam" /></td>
         <td><html:text readonly="true" property="act_tipcam" name="ActivosForm" size="11" maxlength="11" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.tipufv" /></td>
         <td><html:text readonly="true" property="act_tipufv" name="ActivosForm" size="11" maxlength="11" /></td>
         <td class="S10d"><bean:message key="activos3.umanejo" /></td>
         <td><html:text readonly="true" property="act_umanejo" name="ActivosForm" size="20" maxlength="20" /></td>
      </tr>
      </table>
     <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
      <tr>
         <td class="S10d"><bean:message key="activos3.descripcion" /></td>
         <td><html:text readonly="true" property="act_descripcion" name="ActivosForm" size="60" maxlength="120" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.desadicional" /></td>
         <td><html:text readonly="true" property="act_desadicional" name="ActivosForm" size="60" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d">
            <bean:message key="activos.proveedor" />
         </td>
         <td>
            <html:text readonly="true" property="act_proveedor" name="ActivosForm" size="50" maxlength="50" />
         </td>
      </tr>            
      </table>
      <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">      
      <tr>
         <td class="S10d"><bean:message key="activos3.accesorios" /></td>
         <td><html:text readonly="true" property="act_accesorios" name="ActivosForm" size="60" maxlength="240" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.proveedor" /></td>
         <td><html:text readonly="true" property="act_proveedor" name="ActivosForm" size="50" maxlength="50" /></td>
         <td class="S10d"><bean:message key="activos3.marca" /></td>
         <td><html:text readonly="true" property="act_marca" name="ActivosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.modelo" /></td>
         <td><html:text readonly="true" property="act_modelo" name="ActivosForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="activos3.serie1" /></td>
         <td><html:text readonly="true" property="act_serie1" name="ActivosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.color" /></td>
         <td><html:text readonly="true" property="act_color" name="ActivosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.procedencia" /></td>
         <td><html:text readonly="true" property="act_procedencia" name="ActivosForm" size="30" maxlength="30" /></td>
         <td class="S10d"><bean:message key="activos3.gobmunicipal" /></td>
         <td><html:text readonly="true" property="act_gobmunicipal" name="ActivosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.valcobol" /></td>
         <td><html:text readonly="true" property="act_valcobol" name="ActivosForm" size="15" maxlength="15" /></td>
         <td class="S10d"><bean:message key="activos3.ordencompra" /></td>
         <td><html:text readonly="true" property="act_ordencompra" name="ActivosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.numfactura" /></td>
         <td><html:text readonly="true" property="act_numfactura" name="ActivosForm" size="8" maxlength="8" /></td>
         <td class="S10d"><bean:message key="activos3.numcomprobante" /></td>
         <td><html:text readonly="true" property="act_numcomprobante" name="ActivosForm" size="20" maxlength="20" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.codanterior" /></td>
         <td><html:text readonly="true" property="act_codanterior" name="ActivosForm" size="20" maxlength="20" /></td>
         <td class="S10d"><bean:message key="activos3.fecha" /></td>
         <td><html:text readonly="true" property="rev_fecha" name="ActivosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.vidaut" /></td>
         <td><html:text readonly="true" property="rev_vidaut" name="ActivosForm" size="4" maxlength="4" /></td>
         <td class="S10d"><bean:message key="activos3.estadoactivo" /></td>
         <td><html:text readonly="true" property="desestado" name="ActivosForm" size="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos3.desestado" /></td>
         <td><html:text readonly="true" property="rev_desestado" name="ActivosForm" size="60" maxlength="60" /></td>
      </tr>
      <tr>
         <td colspan=2><html:submit value="Reportar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=4" /></td>
      </tr>        
      </table>      
   </logic:equal>      
</logic:equal>
         <logic:equal value="2" name="ActivosForm" property="operacion">
               <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
                  <tr>
                     <td class="S10d">
                        <bean:message key="activos.codrub" />
                     </td>
                     <td>
			                  <html:select name="ActivosForm" property="act_codrub" disabled="false">
                           <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
                        </html:select>
			               </td>
                  </tr>
                  <tr>
                     <td class="S10d">
			                  <bean:message key="activos.codreg" />
			               </td>
                     <td>
			                  <html:hidden property="act_codreg" name="ActivosForm" />
                        <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="30" maxlength="30" />
			               </td>
                  </tr>  
                  <tr>
                     <td class="S10d">
			                  <bean:message key="activos.codfin" />
			               </td>
                     <td>
			                  <html:hidden property="act_codfin" name="ActivosForm" />
                        <html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="30" maxlength="30" />
			               </td>
                  </tr>  
               <logic:equal value="2" name="ActivosForm" property="opcion">
               <tr>
                  <td>
			            </td>
                  <td align="left">
                     <html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=6;opcion.value=2"/>
                  </td>
               </tr>
               </logic:equal>   
               <logic:equal value="3" name="ActivosForm" property="opcion">
               <tr>
                  <td>
			            </td>
                  <td align="left">
                     <html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=6;opcion.value=3"/>
                  </td>
               </tr>
               </logic:equal>        
               <logic:equal value="5" name="ActivosForm" property="opcion">
                  <tr>
                     <td>
			               </td>
                     <td align="left">
                        <html:submit value="Consultar" styleClass="boton1" property="boton" onclick="operacion.value=6;opcion.value=4"/>
                     </td>
                  </tr>
               </logic:equal>   
               </table>
         </logic:equal>         
         <logic:equal value="6" name="ActivosForm" property="operacion">
               <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
                  <tr>
                     <td class="S10d">
                        <bean:message key="activos.codrub" />
                     </td>
                     <td>
	   		                <html:hidden property="act_codrub" name="ActivosForm" />
                        <html:text readonly="true" property="act_rubdescripcion" name="ActivosForm" size="30" maxlength="30" />                  
			               </td>
                  </tr>
                  <tr>
                     <td class="S10d">
			                  <bean:message key="activos.codreg" />
			               </td>
                     <td>
			                  <html:hidden property="act_codreg" name="ActivosForm" />
                        <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="30" maxlength="30" />
			               </td>
                  </tr>  
                  <tr>
                     <td class="S10d">
			                  <bean:message key="activos.codfin" />
			               </td>
                     <td>
			                  <html:hidden property="act_codfin" name="ActivosForm" />
                        <html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="30" maxlength="30" />
			               </td>
                  </tr>  
                  <tr>
                     <td class="S10d">
			                  <bean:message key="activos.codgrp" />
			               </td>
                     <td>
                        <html:select name="ActivosForm" property="act_codgrp" disabled="false">
                           <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
                        </html:select>
                     </td>
                  </tr>                    
                  <tr>
                     <td class="S10d">
			                  <bean:message key="activos.descripcion" /> % = Comodin
			               </td>
                     <td>
			                  <html:text property="act_descripcion" name="ActivosForm" size="60" maxlength="120" value="%" onchange="javascript:this.value=this.value.toUpperCase();" />
			               </td>
                  </tr>        
               <logic:equal value="2" name="ActivosForm" property="opcion">
                  <tr>
                     <td>
			               </td>
                     <td align="left">
                        <html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=2"/>
                     </td>
                  </tr>
               </logic:equal>   
               <logic:equal value="3" name="ActivosForm" property="opcion">
                  <tr>
                     <td>
			               </td>
                     <td align="left">
                        <html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=3"/>
                     </td>
                  </tr>
               </logic:equal>            
               <logic:equal value="4" name="ActivosForm" property="opcion">           
                  <tr>
                     <td>
			               </td>
                     <td align="left">
                        <html:submit value="Consultar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=4"/>
                     </td>
                  </tr>
               </logic:equal>   

               </table>
         </logic:equal>
<logic:equal value="3" name="ActivosForm" property="operacion">
<table width="100%" align="center" class="soloborde" bgcolor="#C1C1FF" border="1">
  <tr class="T8a">
     <td>
     <table width="100%" align="center" class="soloborde" bgcolor="#C1C1FF" border="1">
     <tr><td>
     <html:hidden property="act_codrub" name="ActivosForm" />
     <html:hidden property="act_codreg" name="ActivosForm" />
     <html:hidden property="act_codgrp" name="ActivosForm" />     
     <html:hidden property="act_codfin" name="ActivosForm" />     
     <html:hidden property="act_descripcion" name="ActivosForm" />     
      <table width="100%" class="soloborde" bgcolor="#C1C1FF">
       <tr class="FondoAzul">
         <td width="60" scope="col" class="S10c">Código</td>
         <td width="60" scope="col" class="S10c">Grupo</td>         
         <td width="160" scope="col" class="S10c">Descripción</td>
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
           <td><bean:write name="lista" property="descodgrp" /></td>
           <td><bean:write name="lista" property="descripcion" /></td>
           <logic:equal value="4" name="ActivosForm" property="opcion">
              <td align="right"><html:submit value="Consultar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=4"/></td>
           </logic:equal>     
         </tr>
         <% if (pnum==0) pnum=1; else pnum=0; %>
      </logic:iterate>
      </table>
     </td></tr>     
     </table>
     </td>
   </tr>
</table>   
</logic:equal>
</html:form>
</td></tr>
<tr><td align="center" colspan="2" class="S10d">(*) Campos Obligatorios</td></tr>
</table>
</body>
</html>