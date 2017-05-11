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
<script language="JavaScript" type="text/JavaScript">
  function pantallaCompleta(pagina) {
    var ancho = window.screen.availWidth - 50;
    var alto = window.screen.availHeight - 150;
    var omenu = window.open(pagina, "_blank", "width="+ancho+", height="+alto+",left=20,top=20,status=yes,resizable=yes,titlebar=yes,scrollbars=yes,dependent=yes");
    omenu.focus();
  }

</script>
<body>
<table border="1" width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Activos FIJOS</caption>
<tr><td>
<html:form action="/activosAction" onsubmit="return validar0(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<logic:equal value="1" name="ActivosForm" property = "operacion" >
   <html:hidden property="act_codpar" name="ActivosForm" />           
   <html:hidden property="act_codofi" name="ActivosForm" />
   <html:hidden property="act_codfun" name="ActivosForm" />
   <html:hidden property="act_codfin" name="ActivosForm" />           
   <html:hidden property="act_codmot" name="ActivosForm" />
   <html:hidden property="act_tipcam" name="ActivosForm" />
   <html:hidden property="act_tipufv" name="ActivosForm" />
   <html:hidden property="act_accesorios" name="ActivosForm" />
   <html:hidden property="act_fecreferencia" name="ActivosForm" />            
   <html:hidden property="act_docrefotro" name="ActivosForm" />
   <html:hidden property="act_placa" name="ActivosForm" />
   <html:hidden property="act_aniofabricacion" name="ActivosForm" />
   <html:hidden property="act_color" name="ActivosForm" />
   <html:hidden property="act_procedencia" name="ActivosForm" />
   <html:hidden property="act_gobmunicipal" name="ActivosForm" />
   <html:hidden property="act_valcodol" name="ActivosForm" />
   <html:hidden property="act_valcoufv" name="ActivosForm" />
   <html:hidden property="act_fecbaja" name="ActivosForm" />
   <html:hidden property="act_indetiqueta" name="ActivosForm" />
   <logic:equal value="1" name="ActivosForm" property = "opcion" >
      <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
      <tr>
         <td class="S10d"><bean:message key="activos.codrub" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codrub" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" />
                        <html:text readonly="true" property="act_rubdescripcion" name="ActivosForm" size="60" maxlength="60" onkeypress="return handleEnter(this, event)" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.codreg" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codreg" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" />
                         <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="60" maxlength="60" onkeypress="return handleEnter(this, event)" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.codigo" /></td>
         <td colspan="3"><html:text readonly="true" property="act_codigo" name="ActivosForm" size="5" maxlength="5" onkeypress="return handleEnter(this, event)" />
                         <html:text readonly="true" property="act_codbarra" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" />
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.codgrp" /></td>
         <td>
            <html:select name="ActivosForm" property="act_codgrp" disabled="false" onkeypress="return handleEnter(this, event)">
               <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
            </html:select>
         </td>
         <td class="S10d"><bean:message key="activos.codpar" /></td>
         <td><html:text readonly="true" property="act_pardescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.codofi" /></td>
         <td><html:text readonly="true" property="act_ofidescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><bean:message key="activos.codfun" /></td>
         <td><html:text readonly="true" property="act_fundescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.codubi" /></td>
         <td>
            <html:select name="ActivosForm" property="act_codubi" disabled="false" onkeypress="return handleEnter(this, event)">
               <html:options collection="UbicacionesLista" property="codigo" labelProperty="descripcion"/>
            </html:select>
         </td>
         <td class="S10d"><bean:message key="activos.codpry" /></td>
         <td>
            <html:select name="ActivosForm" property="act_codpry" disabled="false" onkeypress="return handleEnter(this, event)">
               <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/>
            </html:select>
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.codfin" /></td>
         <td><html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /></td>
      </tr>                  
      <tr>
         <td class="S10d"><bean:message key="activos.feccompra" /></td>
         <td><html:text property="act_feccompra" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><bean:message key="activos.umanejo" /></td>
         <td><html:text property="act_umanejo" name="ActivosForm" size="20" maxlength="20" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      </table>
      <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
      <tr>
         <td class="S10d"><bean:message key="activos.descripcion" /></td>
         <td><html:text property="act_descripcion" name="ActivosForm" size="60" maxlength="120" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.desadicional" /></td>
         <td><html:text property="act_desadicional" name="ActivosForm" size="60" maxlength="240" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      </table>
      <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">      
      <tr>
         <td class="S10d">*<bean:message key="activos.proveedor" /></td>
         <td><html:text property="act_proveedor" name="ActivosForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><logic:equal value="07" name="ActivosForm" property="act_codrub">*</logic:equal><logic:equal value="12" name="ActivosForm" property="act_codrub">*</logic:equal><bean:message key="activos.marca" /></td>
         <td><html:text property="act_marca" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.modelo" /></td>
         <td><html:text property="act_modelo" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><bean:message key="activos.serie1" /></td>
         <td><html:text property="act_serie1" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.serie2" /></td>
         <td><html:text property="act_serie2" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><bean:message key="activos.docreferencia" /></td>
         <td><html:text property="act_docreferencia" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.valcobol" /></td>
         <td><html:text property="act_valcobol" name="ActivosForm" size="13" maxlength="13" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><bean:message key="activos.ordencompra" /></td>
         <td><html:text property="act_ordencompra" name="ActivosForm" size="20" maxlength="20" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.numfactura" /></td>
         <td><html:text property="act_numfactura" name="ActivosForm" size="12" maxlength="12" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><bean:message key="activos.numcomprobante" /></td>
         <td><html:text property="act_numcomprobante" name="ActivosForm" size="20" maxlength="20" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.codanterior" /></td>
         <td><html:text property="act_codanterior" name="ActivosForm" size="20" maxlength="20" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><bean:message key="activos.fecha" /></td>
         <td><html:text property="rev_fecha" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.vidaut" /></td>
         <td><html:text readonly="true" property="rev_vidaut" name="ActivosForm" size="4" maxlength="4" onkeypress="return handleEnter(this, event)" /></td>
         <td class="S10d"><bean:message key="activos.estadoactivo" /></td>
         <td>
            <html:select name="ActivosForm" property="rev_estadoactivo" disabled="false" onkeypress="return handleEnter(this, event)">
               <html:options collection="EstadosLista" property="estado" labelProperty="desestado"/>
            </html:select>
         </td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="activos.desestado" /></td>
         <td><html:text property="rev_desestado" name="ActivosForm" size="60" maxlength="60" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      </tr>
      <tr>
         <td colspan=2><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /></td>
      </tr>      
      <tr>
         <td colspan=4>
            <FONT color="#FF0000" face="Arial, Helvetica, san-serif" size=2> 
            <html:link href="javascript:pantallaCompleta('tipocambio.do');">
                     No se olvide verificar la existencia del tipo de cambio para la fecha de compra y la fecha de activación
            </html:link>
            </FONT>
         </td>
      </tr>      
     </table>
   </logic:equal>
   <logic:equal name="ActivosForm" property = "opcion" value="2" >
   <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
   <tr>
      <td class="S10d"><bean:message key="activos.codrub" /></td>
      <td colspan="3"><html:text readonly="true" property="act_codrub" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" />
                      <html:text readonly="true" property="act_rubdescripcion" name="ActivosForm" size="60" maxlength="60" onkeypress="return handleEnter(this, event)" />
      </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codreg" /></td>
      <td colspan="3"><html:text readonly="true" property="act_codreg" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" />
                      <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="60" maxlength="60" onkeypress="return handleEnter(this, event)" />
      </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codigo" /></td>
      <td colspan="3"><html:text readonly="true" property="act_codigo" name="ActivosForm" size="5" maxlength="5" onkeypress="return handleEnter(this, event)" />
                      <html:text readonly="true" property="act_codbarra" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" />
			</td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codgrp" /></td>
         <td>
            <html:select name="ActivosForm" property="act_codgrp" disabled="false" onkeypress="return handleEnter(this, event)">
               <html:options collection="GruposLista" property="codigo" labelProperty="descripcion"/>
            </html:select>
         </td>
      <td class="S10d"><bean:message key="activos.codpar" /></td>
      <td><html:text readonly="true" property="act_pardescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codofi" /></td>
      <td><html:text readonly="true" property="act_ofidescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><bean:message key="activos.codfun" /></td>
      <td><html:text readonly="true" property="act_fundescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codubi" /></td>
      <td><html:text readonly="true" property="act_ubidescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /> </td>
      <td class="S10d"><bean:message key="activos.codpry" /></td>
      <td><html:select name="ActivosForm" property="act_codpry" disabled="false">
           <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/>
           </html:select>
      </td>         
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codfin" /></td>
      <td><html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="40" maxlength="40" onkeypress="return handleEnter(this, event)" /> </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.feccompra" /></td>
      <td><html:text property="act_feccompra" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><bean:message key="activos.umanejo" /></td>
      <td><html:text property="act_umanejo" name="ActivosForm" size="20" maxlength="20" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
   </tr>     
   </table>
   <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1" onkeypress="return handleEnter(this, event)">
   <tr>
      <td class="S10d"><bean:message key="activos.descripcion" /></td>
      <td><html:text property="act_descripcion" name="ActivosForm" size="60" maxlength="120" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.desadicional" /></td>
      <td><html:text property="act_desadicional" name="ActivosForm" size="60" maxlength="240" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   </table>
   <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1" onkeypress="return handleEnter(this, event)">      
   <tr>
      <td class="S10d">*<bean:message key="activos.proveedor" /></td>
      <td><html:text property="act_proveedor" name="ActivosForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><logic:equal value="07" name="ActivosForm" property="act_codrub">*</logic:equal><logic:equal value="12" name="ActivosForm" property="act_codrub">*</logic:equal><bean:message key="activos.marca" /></td>
      <td><html:text property="act_marca" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.modelo" /></td>
      <td><html:text property="act_modelo" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><bean:message key="activos.serie1" /></td>
      <td><html:text property="act_serie1" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.serie2" /></td>
      <td><html:text property="act_serie2" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><bean:message key="activos.docreferencia" /></td>
      <td><html:text property="act_docreferencia" name="ActivosForm" size="30" maxlength="30" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.valcobol" /></td>
      <td><html:text property="act_valcobol" name="ActivosForm" size="13" maxlength="13" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><bean:message key="activos.ordencompra" /></td>
      <td><html:text property="act_ordencompra" name="ActivosForm" size="20" maxlength="20" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.numfactura" /></td>
      <td><html:text property="act_numfactura" name="ActivosForm" size="8" maxlength="8" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><bean:message key="activos.numcomprobante" /></td>
      <td><html:text property="act_numcomprobante" name="ActivosForm" size="20" maxlength="20" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codanterior" /></td>
      <td><html:text property="act_codanterior" name="ActivosForm" size="20" maxlength="20" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><bean:message key="activos.fecha" /></td>
      <td><html:text property="rev_fecha" name="ActivosForm" size="10" maxlength="10" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.vidaut" /></td>
      <td><html:text readonly="true" property="rev_vidaut" name="ActivosForm" size="4" maxlength="4" onkeypress="return handleEnter(this, event)" /></td>
      <td class="S10d"><bean:message key="activos.estadoactivo" /></td>
      <td><html:select name="ActivosForm" property="rev_estadoactivo" disabled="false" onkeypress="return handleEnter(this, event)">
             <html:options collection="EstadosLista" property="estado" labelProperty="desestado"/>
          </html:select>
      </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.desestado" /></td>
      <td><html:text property="rev_desestado" name="ActivosForm" size="60" maxlength="60" onchange="javascript:this.value=this.value.toUpperCase();" onkeypress="return handleEnter(this, event)" /></td>
   </tr>
   <tr>
      <td colspan=2><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /></td>
   </tr>        
   </table>      
   </logic:equal>   
   <logic:equal name="ActivosForm" property = "opcion" value="3" >
   <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
   <tr>
      <td class="S10d"><bean:message key="activos.codrub" /></td>
      <td colspan="3"><html:text readonly="true" property="act_codrub" name="ActivosForm" size="10" maxlength="10" />
                      <html:text readonly="true" property="act_rubdescripcion" name="ActivosForm" size="60" maxlength="60" />
      </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codreg" /></td>
      <td colspan="3"><html:text readonly="true" property="act_codreg" name="ActivosForm" size="10" maxlength="10" />
                      <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="60" maxlength="60" />
      </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codigo" /></td>
      <td colspan="3"><html:text readonly="true" property="act_codigo" name="ActivosForm" size="5" maxlength="5" />
                      <html:text readonly="true" property="act_codbarra" name="ActivosForm" size="10" maxlength="10" />
      </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codgrp" /></td>
      <td><html:text readonly="true" property="act_grpdescripcion" name="ActivosForm" size="40" maxlength="40" /> </td>
      <td class="S10d"><bean:message key="activos.codpar" /></td>
      <td><html:text readonly="true" property="act_pardescripcion" name="ActivosForm" size="40" maxlength="40" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codofi" /></td>
      <td><html:text readonly="true" property="act_ofidescripcion" name="ActivosForm" size="40" maxlength="40" /></td>
      <td class="S10d"><bean:message key="activos.codfun" /></td>
      <td><html:text readonly="true" property="act_fundescripcion" name="ActivosForm" size="40" maxlength="40" /></td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codubi" /></td>
      <td><html:text readonly="true" property="act_ubidescripcion" name="ActivosForm" size="40" maxlength="40" /> </td>
      <td class="S10d"><bean:message key="activos.codpry" /></td>
      <td><html:text readonly="true" property="act_prydescripcion" name="ActivosForm" size="40" maxlength="40" /> </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codfin" /></td>
      <td><html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="40" maxlength="40" /> </td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.feccompra" /></td>
      <td><html:text readonly="true" property="act_feccompra" name="ActivosForm" size="10" maxlength="10" /></td>
      <td class="S10d"><bean:message key="activos.umanejo" /></td>
      <td><html:text readonly="true" property="act_umanejo" name="ActivosForm" size="20" maxlength="20" /></td>
   </tr>      
   <tr>
      <td colspan=2><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=3" /></td>
   </tr>            
   </table>
   </logic:equal>
</logic:equal>
<logic:equal value="2" name="ActivosForm" property="operacion">
   <logic:equal value="3" name="ActivosForm" property="opcion">
   <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
   <tr>
      <td class="S10d"><bean:message key="activos.codrub" /></td>
      <td><html:select name="ActivosForm" property="act_codrub" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
          </html:select>
			</td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codreg" /></td>
      <td><html:hidden property="act_codreg" name="ActivosForm" />
           <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="30" maxlength="30" />
      </td>
   </tr>         
   <tr>
      <td class="S10d"><bean:message key="activos.codfin" /></td>
      <td><html:hidden property="act_codfin" name="ActivosForm" />
          <html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="30" maxlength="30" />
			</td>
   </tr>         
   <tr>
      <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
      <td><html:text property="act_descripcion" name="ActivosForm" size="60" maxlength="120" value="%"  onchange="javascript:this.value=this.value.toUpperCase();" /></td>
   </tr>       
   <tr>
      <td></td>
      <td align="left"><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=3"/></td>
   </tr>
   </table>
   </logic:equal>
   <logic:equal value="2" name="ActivosForm" property="opcion">
   <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
   <tr>
      <td class="S10d"><bean:message key="activos.codrub" /></td>
      <td><html:select name="ActivosForm" property="act_codrub" disabled="false">
             <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
          </html:select>
			</td>
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codreg" /></td>
      <td><html:hidden property="act_codreg" name="ActivosForm" />
          <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="30" maxlength="30" />
			</td>
   </tr>  
   <tr>
      <td class="S10d"><bean:message key="activos.codfin" /></td>
      <td><html:hidden property="act_codfin" name="ActivosForm" />
          <html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="30" maxlength="30" />
			</td>
   </tr>  
   <tr>
      <td class="S10d"><bean:message key="activos.descripcion" /> % = Comodin</td>
      <td><html:text property="act_descripcion" name="ActivosForm" size="60" maxlength="120" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
   </tr>        
   <tr>
      <td></td>
      <td align="left"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=2"/></td>
   </tr>
   </table>
   </logic:equal>
   <logic:equal value="1" name="ActivosForm" property="opcion">
   <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
   <tr>
      <td class="S10d"><bean:message key="activos.codrub" /></td>
      <td><html:select name="ActivosForm" property="act_codrub" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
           </html:select>
			</td>           
   </tr>
   <tr>
      <td class="S10d"><bean:message key="activos.codreg" /></td>
      <td><html:hidden property="act_codreg" name="ActivosForm" />
          <html:text readonly="true" property="act_regdescripcion" name="ActivosForm" size="30" maxlength="30" />
      </td>
   </tr>  
   <tr>
      <td class="S10d"><bean:message key="activos.codfin" /></td>
      <td><html:hidden property="act_codfin" name="ActivosForm" />
          <html:text readonly="true" property="act_findescripcion" name="ActivosForm" size="30" maxlength="30" />
      </td>
   </tr>  
   <tr>
      <td></td>
      <td align="left"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=1;opcion.value=1"/></td>
   </tr>
   </table>
   </logic:equal>
</logic:equal>
<logic:equal value="3" name="ActivosForm" property="operacion">
   <table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
   <tr class="T8a">
      <td>
      <table width="100%" align="center" class="soloborde" bgcolor="#C1C1FF" border="1">
      <tr>
			   <td>
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
            <tr class="T8a"><% } %>
               <td><bean:write name="lista" property="codrub" />-<bean:write name="lista" property="codreg" />-<bean:write name="lista" property="ceros" /><bean:write name="lista" property="codigo" /></td>
               <td><bean:write name="lista" property="descodgrp" /></td>
               <td><bean:write name="lista" property="descripcion" /></td>
               <logic:equal value="5" name="ActivosForm" property="opcion">
               <td align="right"><html:submit value="Reportar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=5"/></td>
               </logic:equal>
               <logic:equal value="3" name="ActivosForm" property="opcion">
               <td align="right"><html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/></td>
               </logic:equal>     
               <logic:equal value="2" name="ActivosForm" property="opcion">
               <td align="right"><html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/></td>
               </logic:equal>     
            </tr>
            <% if (pnum==0) pnum=1; else pnum=0; %>
            </logic:iterate>
            </table>
         </td>
      </tr>     
      </table>
   </td>
</tr>
</table>
</logic:equal>
</html:form>
</td>
</tr>
<tr>
   <td align="center" colspan="2" class="S10d">(*) Campos Obligatorios</td>
 </tr>
</table>
</body>
</html>