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
    mensaje=""
    foco=""  
    if (form.opcion.value!=9){
    try {
    i=form.std_codreg.selectedIndex;
   	if (!comboObligatorio(form.std_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.std_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    i=form.std_tipdoc.selectedIndex;
   	if (!comboObligatorio(form.std_tipdoc.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Tipo de Acta\n"
		  if (foco.length==0) foco="form.std_tipdoc.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    if (!textoObligatorio( form.std_numero.value )) {
	   	mensaje=mensaje+"Debe introducir Número\n"
		  if (foco.length==0) foco="form.std_numero.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.std_numero.value)){
         mensaje=mensaje+"Debe introducir Números en Número Inicial\n"
         if (foco.length==0) foco="form.std_numero.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
      if ((Number(form.std_numero.value)<0)||(Number(form.std_numero.value)>999999)) {
  	     mensaje=mensaje+"Número Inicial debe ser mayor a cero y menor a 1000000 en Número Inicial\n"
  		   if (foco.length==0) foco="form.std_numero.focus()"
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
<html:form action="/sectiposdocAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Correlativo Actas</caption>
<logic:equal value="1" name="SectiposdocForm" property="operacion">
   <logic:equal name="SectiposdocForm" property = "opcion" value="1" >
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.codfin" /></td>
          <td><html:hidden property="std_codfin" name="SectiposdocForm" />
          <html:text readonly="true" property="descripcion_codfin" name="SectiposdocForm" size="30" maxlength="30" /></td>
      </tr> 
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.codreg" /></td>
          <td><html:hidden property="std_codreg" name="SectiposdocForm" />
          <html:text readonly="true" property="descripcion_codreg" name="SectiposdocForm" size="30" maxlength="30" /></td>
      </tr> 
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.tipdoc" /></td>
          <td><html:select name="SectiposdocForm" property="std_tipdoc" disabled="false">
              <html:options collection="TiposdocLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>          
      </tr>
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.numero" /></td>
          <td><html:text property="std_numero" name="SectiposdocForm" size="6" maxlength="6" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="SectiposdocForm" property = "opcion" value="2" >
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.codfin" /></td>
          <td><html:hidden property="std_codfin" name="SectiposdocForm" />
          <html:text readonly="true" property="descripcion_codfin" name="SectiposdocForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.codreg" /></td>
          <td><html:hidden property="std_codreg" name="SectiposdocForm" />
          <html:text readonly="true" property="descripcion_codreg" name="SectiposdocForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.tipdoc" /></td>
          <td><html:hidden property="std_tipdoc" name="SectiposdocForm" />
          <html:text readonly="true" property="descripcion_tipdoc" name="SectiposdocForm" size="30" maxlength="30" /></td>
      </tr>           
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.numero" /></td>
          <td><html:text property="std_numero" name="SectiposdocForm" size="6" maxlength="6" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="SectiposdocForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.codfin" /></td>
          <td><html:hidden property="std_codfin" name="SectiposdocForm" />
          <html:text readonly="true" property="descripcion_codfin" name="SectiposdocForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.codreg" /></td>
          <td><html:hidden property="std_codreg" name="SectiposdocForm" />
          <html:text readonly="true" property="descripcion_codreg" name="SectiposdocForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.tipdoc" /></td>
          <td><html:hidden property="std_tipdoc" name="SectiposdocForm" />
          <html:text readonly="true" property="descripcion_tipdoc" name="SectiposdocForm" size="30" maxlength="30" /></td>
      </tr>      
      <tr>
          <td class="S10d"><bean:message key="sectiposdoc.numero" /></td>
          <td><html:text readonly="true" property="std_numero" name="SectiposdocForm" size="6" maxlength="6" /></td>
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
   <td width="100"  scope="col" class="S10c"><bean:message key="sectiposdoc.codreg" /></td>
   <td width="60"  scope="col" class="S10c">Gestión</td>
   <td width="160" scope="col" class="S10c">Descripción</td>  
   <td width="100"  scope="col" class="S10c"><bean:message key="sectiposdoc.codfin" /></td>
   <td width="160" scope="col" class="S10c">Descripción</td>  
   <td width="100" scope="col" class="S10c"><bean:message key="sectiposdoc.tipdoc" /></td>
   <td width="160" scope="col" class="S10c">Descripción</td>  
   <td width="100" scope="col" class="S10c"><bean:message key="sectiposdoc.numero" /></td>
   <logic:equal value="2" name="SectiposdocForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="SectiposdocForm" property="opcion">   
   <td></td>
   </logic:equal>   
 </tr>
  <% int pnum=0;%>
<logic:iterate name="SectiposdocLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="codreg" /></td>
     <td><bean:write name="lista" property="gestion" /></td>
     <td><bean:write name="lista" property="codreg_descripcion" /></td>     
     <td><bean:write name="lista" property="codfin" /></td>
     <td><bean:write name="lista" property="codfin_descripcion" /></td>     
     <td><bean:write name="lista" property="tipdoc" /></td>
     <td><bean:write name="lista" property="tipdoc_descripcion" /></td>     
     <td><bean:write name="lista" property="numero" /></td>
     <logic:equal value="3" name="SectiposdocForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="SectiposdocForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>
</logic:iterate>
<logic:equal value="5" name="SectiposdocForm" property="opcion">
   <tr>
   <td colspan="3">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="sectiposdoc.do" styleClass="T8b">
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
