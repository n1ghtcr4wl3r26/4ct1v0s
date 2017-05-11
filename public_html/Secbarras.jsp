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
    i=form.bar_rubro.selectedIndex;
   	if (!comboObligatorio(form.bar_rubro.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Rubro\n"
		  if (foco.length==0) foco="form.bar_rubro.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    i=form.bar_codreg.selectedIndex;
   	if (!comboObligatorio(form.bar_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.bar_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    if (!textoObligatorio( form.bar_numero.value )) {
	   	mensaje=mensaje+"Debe introducir Número\n"
		  if (foco.length==0) foco="form.bar_numero.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.bar_numero.value)){
         mensaje=mensaje+"Debe introducir Números en Número\n"
         if (foco.length==0) foco="form.bar_numero.focus()"
      }
    }
    catch (e) {
      xvar=0
    }

    try {
       if ((Number(form.bar_numero.value)<0)||(Number(form.bar_numero.value)>100)) {
  	      mensaje=mensaje+"Debe introducir Números entre 0 y 100 unicamente\n"
  		    if (foco.length==0) foco="form.bar_numero.focus()"
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
<html:form action="/secbarrasAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Código Barras</caption>
<logic:equal value="1" name="SecbarrasForm" property="operacion">
   <logic:equal name="SecbarrasForm" property = "opcion" value="1" >
      <tr>
          <td class="S10d"><bean:message key="secbarras.rubro" /></td>
          <td><html:select name="SecbarrasForm" property="bar_rubro" disabled="false">
               <html:options collection="RubrosLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>          
      </tr>
      <tr>
          <td class="S10d"><bean:message key="secbarras.codreg" /></td>
          <td><html:hidden property="bar_codreg" name="SecbarrasForm" />
          <html:text readonly="true" property="descripcion_codreg" name="SecbarrasForm" size="30" maxlength="30" /></td>
      </tr>      
      <tr>
          <td class="S10d"><bean:message key="secbarras.numero" /></td>
          <td><html:text property="bar_numero" name="SecbarrasForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="SecbarrasForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="secbarras.rubro" /></td>
          <td><html:hidden property="bar_rubro" name="SecbarrasForm" />
          <html:text readonly="true" property="descripcion_codrub" name="SecbarrasForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="secbarras.codreg" /></td>
          <td><html:hidden property="bar_codreg" name="SecbarrasForm" />
          <html:text readonly="true" property="descripcion_codreg" name="SecbarrasForm" size="30" maxlength="30" /></td>
      </tr> 
      <tr>
          <td class="S10d"><bean:message key="secbarras.numero" /></td>
          <td><html:text readonly="true" property="bar_numero" name="SecbarrasForm" size="50" maxlength="50" /></td>
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
   <td width="60" scope="col" class="S10c"><bean:message key="secbarras.rubro" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="rubros.descripcion" /></td>   
   <td width="60" scope="col" class="S10c"><bean:message key="rubros.fecalta" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="secbarras.codreg" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="oficinas.descripcion" /></td>   
   <td width="60" scope="col" class="S10c"><bean:message key="secbarras.numero" /></td>
   <logic:equal value="2" name="SecbarrasForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="SecbarrasForm" property="opcion">   
   <td></td>
   </logic:equal>   
 </tr>
  <% int pnum=0;%>
<logic:iterate name="SecbarrasLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="rubro" /></td>
     <td><bean:write name="lista" property="codrub_descripcion" /></td>
     <td><bean:write name="lista" property="fecalta" /></td>
     <td><bean:write name="lista" property="codreg" /></td>
     <td><bean:write name="lista" property="codreg_descripcion" /></td>
     <td><bean:write name="lista" property="numero" /></td>
     <logic:equal value="3" name="SecbarrasForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="SecbarrasForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>
</logic:iterate>
<logic:equal value="5" name="SecbarrasForm" property="opcion">
   <tr>
   <td colspan="5">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="secbarras.do" styleClass="T8b">
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
