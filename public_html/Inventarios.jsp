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
       if (!textoObligatorio( form.inv_codbarra.value )) {
 	      mensaje=mensaje+"Debe introducir Código de Barras\n"
       if (foco.length==0) foco="form.inv_codbarra.focus()"
       }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.inv_codbarra.value)){
         mensaje=mensaje+"Debe introducir Números en Código de Barras\n"
         if (foco.length==0) foco="form.inv_codbarra.focus()"
      }
    }
    catch (e) {
      xvar=0
    }
    try {
        if (!textoObligatorio( form.inv_fecha.value )) {
	         mensaje=mensaje+"Debe introducir Fecha\n"
	         if (foco.length==0) foco="form.inv_fecha.focus()"
        }
    }
    catch (e) {
        xvar=0
    }
    try {
    i=form.inv_codofi.selectedIndex;
   	if (!comboObligatorio(form.inv_codofi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Oficina\n"
		  if (foco.length==0) foco="form.inv_codofi.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    i=form.inv_codfun.selectedIndex;
   	if (!comboObligatorio(form.inv_codfun.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Funcionario\n"
		  if (foco.length==0) foco="form.inv_codfun.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    i=form.inv_codfin.selectedIndex;
   	if (!comboObligatorio(form.inv_codfin.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Financiador\n"
		  if (foco.length==0) foco="form.inv_codfin.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    i=form.inv_codpry.selectedIndex;
   	if (!comboObligatorio(form.inv_codpry.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Proyecto\n"
		  if (foco.length==0) foco="form.inv_codpry.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    i=form.inv_codreg.selectedIndex;
   	if (!comboObligatorio(form.inv_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.inv_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    if ((mensaje.length>0)&&(Number(form.opcion.value)!=9))
    {
        alert(mensaje)
        eval(foco)
        return false
    }
  }
</script>
<body>
<html:form action="/inventariosAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Inventarios</caption>
<logic:equal value="1" name="InventariosForm" property="operacion">
   <logic:equal name="InventariosForm" property = "opcion" value="1" >
      <tr>
          <td class="S10d"><bean:message key="inventarios.codbarra" /></td>
          <td><html:text property="inv_codbarra" name="InventariosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.fecha" /></td>
          <td><html:text property="inv_fecha" name="InventariosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codofi" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codofi" disabled="false">
             <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion"/>
          </html:select>          
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codfun" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codfun" disabled="false">
             <html:options collection="FuncionariosLista" property="codigo" labelProperty="descripcion"/>
          </html:select>          
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codfin" /></td>
          <td>
             <html:hidden property="inv_codfin" name="InventariosForm" />
             <html:text readonly="true" property="inv_findescripcion" name="InventariosForm" size="30" maxlength="30" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codpry" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codpry" disabled="false">
             <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/>
          </html:select>          
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codreg" /></td>
          <td>
             <html:hidden property="inv_codreg" name="InventariosForm" />
             <html:text readonly="true" property="inv_regdescripcion" name="InventariosForm" size="30" maxlength="30" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.estado" /></td>
          <td>
             <html:select name="InventariosForm" property="inv_estado" disabled="false">
              <html:options collection="EstadosLista" property="estado" labelProperty="desestado" />
             </html:select>
          </td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="InventariosForm" property = "opcion" value="2" >
      <tr>
          <td class="S10d"><bean:message key="inventarios.codbarra" /></td>
          <td><html:text readonly="true" property="inv_codbarra" name="InventariosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.fecha" /></td>
          <td><html:text readonly="true" property="inv_fecha" name="InventariosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codofi" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codofi" disabled="false">
             <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion"/>
          </html:select>          
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codfun" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codfun" disabled="false">
             <html:options collection="FuncionariosLista" property="codigo" labelProperty="descripcion"/>
          </html:select> 
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codfin" /></td>
          <td>
             <html:hidden property="inv_codfin" name="InventariosForm" />
             <html:text readonly="true" property="inv_findescripcion" name="InventariosForm" size="30" maxlength="30" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codpry" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codpry" disabled="false">
             <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/>
          </html:select>          
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codreg" /></td>
          <td>
             <html:hidden property="inv_codreg" name="InventariosForm" />
             <html:text readonly="true" property="inv_regdescripcion" name="InventariosForm" size="30" maxlength="30" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.estado" /></td>
          <td>
             <html:select name="InventariosForm" property="inv_estado" disabled="false">
             <html:options collection="EstadosLista" property="estado" labelProperty="desestado"/>
             </html:select>
          </td>
      </tr>      
      <tr>
          <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="InventariosForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="inventarios.codbarra" /></td>
          <td><html:text readonly="true" property="inv_codbarra" name="InventariosForm" size="30" maxlength="30" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.fecha" /></td>
          <td><html:text readonly="true" property="inv_fecha" name="InventariosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codofi" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codofi" disabled="true">
             <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion"/>
          </html:select>
          <html:hidden property="inv_codofi" name="InventariosForm" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codfun" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codfun" disabled="true">
             <html:options collection="FuncionariosLista" property="codigo" labelProperty="descripcion"/>
          </html:select>          
          <html:hidden property="inv_codfun" name="InventariosForm" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codfin" /></td>
          <td>
          <html:text readonly="true" property="inv_findescripcion" name="InventariosForm" size="30" maxlength="30" />
          <html:hidden property="inv_codfin" name="InventariosForm" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codpry" /></td>
          <td>
          <html:select name="InventariosForm" property="inv_codpry" disabled="true">
             <html:options collection="ProyectosLista" property="codigo" labelProperty="descripcion"/>
          </html:select>           
          <html:hidden property="inv_codpry" name="InventariosForm" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.codreg" /></td>
          <td><html:text readonly="true" property="inv_regdescripcion" name="InventariosForm" size="30" maxlength="30" />
          <html:hidden property="inv_codreg" name="InventariosForm" />
          </td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="inventarios.estado" /></td>
          <td>
             <html:select name="InventariosForm" property="inv_estado" disabled="true">
             <html:options collection="EstadosLista" property="estado" labelProperty="desestado"/>
             </html:select>
          </td>
      </tr>       
      <tr>
          <td align="right"><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=3" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="InventariosForm" property = "opcion" value="6" >
      <tr>
          <td class="S10d">Actas: </td>
          <td class="S10i"><input type="radio" name="actas"  checked="checked" value="I"> Asignacion <input type="radio" name="actas" value="M"> Transferencia
          </td>
      </tr>    
      <tr>
          <td align="right"><html:submit value="Generar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=6" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
</logic:equal>
</table>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<tr class="FondoAzul">
   <td width="30" scope="col" class="S10c"><bean:message key="inventarios.codbarra" /></td>
   <td width="10" scope="col" class="S10c"><bean:message key="inventarios.fecha" /></td>
   <td width="10" scope="col" class="S10c"><bean:message key="inventarios.codofi" /></td>
   <td width="10" scope="col" class="S10c"><bean:message key="inventarios.codfun" /></td>
   <td width="10" scope="col" class="S10c"><bean:message key="inventarios.codfin" /></td>
   <td width="10" scope="col" class="S10c"><bean:message key="inventarios.codpry" /></td>
   <td width="10" scope="col" class="S10c"><bean:message key="inventarios.codreg" /></td>
   <td width="10" scope="col" class="S10c"><bean:message key="inventarios.estado" /></td>
   <logic:equal value="2" name="InventariosForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="InventariosForm" property="opcion">   
   <td></td>
   </logic:equal>
 </tr>
 <% int pnum=0;%>
<logic:iterate name="InventariosLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="codbarrad" /></td>
     <td><bean:write name="lista" property="fecha" /></td>
     <td><bean:write name="lista" property="codofides" /></td>
     <td><bean:write name="lista" property="codfundes" /></td>
     <td><bean:write name="lista" property="codfindes" /></td>
     <td><bean:write name="lista" property="codprydes" /></td>
     <td><bean:write name="lista" property="codregdes" /></td>
     <td><bean:write name="lista" property="estadodes" /></td>
     <logic:equal value="3" name="InventariosForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="InventariosForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>
</logic:iterate>
<logic:equal value="5" name="InventariosForm" property="opcion">
<tr>
<td colspan="2">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="inventarios.do" styleClass="T8b">
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