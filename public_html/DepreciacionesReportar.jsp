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
    try {
    i=form.dep_codreg.selectedIndex;
   	if (!comboObligatorio(form.dep_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.dep_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }    
    try {
    i=form.dep_codrub.selectedIndex
   	if (!comboObligatorio(form.dep_codrub.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.dep_codrub.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    if (!esFecha(form.dpr_fecha.value)){
      mensaje=mensaje+"Debe introducir Fecha dd/mm/yyyy\n"
      if (foco.length==0) foco="form.dpr_fecha.focus()"
    }
    }
    catch (e) {
      xvar=0
    }   
    try {
      if (!solonumeros(form.cod_inicial.value)){
         mensaje=mensaje+"Debe introducir Números en Código Inicial\n"
         if (foco.length==0) foco="form.cod_inicial.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if (!solonumeros(form.cod_final.value)){
         mensaje=mensaje+"Debe introducir Números en Código Final\n"
         if (foco.length==0) foco="form.cod_final.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (substr(form.dpr_fecha.value,7,4)<>substr(form.anio.value,1,4)){
      mensaje=mensaje+"La fecha No pertenece a la Gestion\n"
      if (foco.length==0) foco="form.cod_final.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (Number(form.cod_final.value)<Number(form.cod_inicial.value)){
      mensaje=mensaje+"Debe introducir Código Final Mayor a Código Inicial\n"
      if (foco.length==0) foco="form.cod_final.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio( form.cod_inicial.value )) {
	   	mensaje=mensaje+"Debe introducir Código Inicial\n"
		  if (foco.length==0) foco="form.cod_inicial.focus()"
    }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio( form.cod_final.value )) {
	   	mensaje=mensaje+"Debe introducir Código Final\n"
		  if (foco.length==0) foco="form.cod_final.focus()"
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
<html:form action="/depreciacionesAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="0">
<caption>Depreciaciones</caption>
<logic:equal value="1" name="DepreciacionesForm" property="operacion">
     <tr>
        <td class="S10d">Regional : </td>
        <td>
           <html:select name="DepreciacionesForm" property="dep_codreg" disabled="false">
              <html:options collection="RegionalesLista" property="codigo" labelProperty="descripcion"/>
           </html:select>
        </td>
     </tr>
     <tr>
        <td class="S10d">Rubro : </td>
        <td>
           <html:select name="DepreciacionesForm" property="dep_codrub" disabled="false">
              <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
           </html:select>          
        </td>
     </tr>
     <tr>
        <td class="S10d">Código Inicial : </td>
        <td>
           <html:text property="cod_inicial" name="DepreciacionesForm" size="10" maxlength="10" value="1" />          
        </td>
     </tr>
     <tr>
        <td class="S10d">Código Final : </td>
        <td>
           <html:text property="cod_final" name="DepreciacionesForm" size="10" maxlength="10" value="99999" />          
        </td>
     </tr>
     <tr>
        <td align="center" colspan="2">
        <html:submit value="Reportar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2"/>
        </td>
     </tr>
</logic:equal>
</table>
</html:form>
</body>
</html>

