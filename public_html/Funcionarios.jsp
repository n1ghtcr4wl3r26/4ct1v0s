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
    mensaje=""
    foco=""  
    if (form.opcion.value!=9){
    try {
    if (!textoObligatorio( form.fun_codigo.value )) {
	   	mensaje=mensaje+"Debe introducir Código\n"
		  if (foco.length==0) foco="form.fun_codigo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
      if (!solonumerosint(form.fun_codigo.value)){
         mensaje=mensaje+"Debe introducir Números en Código\n"
         if (foco.length==0) foco="form.fun_codigo.focus()"
      }
    }
    catch (e) {
      xvar=0
    }    
    try {
    if (!textoObligatorio( form.fun_descripcion.value )) {
	   	mensaje=mensaje+"Debe introducir Nombre\n"
		  if (foco.length==0) foco="form.fun_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!sololetras( form.fun_descripcion.value )) {
	   	mensaje=mensaje+"Debe introducir Letras en Nombre\n"
		  if (foco.length==0) foco="form.fun_descripcion.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    if (!textoObligatorio( form.fun_cargo.value )) {
	   	mensaje=mensaje+"Debe introducir Cargo\n"
		  if (foco.length==0) foco="form.fun_cargo.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.fun_codofi.selectedIndex;
   	if (!comboObligatorio(form.fun_codofi.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Oficina\n"
		  if (foco.length==0) foco="form.fun_codofi.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.fun_codreg.selectedIndex;
   	if (!comboObligatorio(form.fun_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.fun_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.fun_codfin.selectedIndex;
   	if (!comboObligatorio(form.fun_codfin.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Financiador\n"
		  if (foco.length==0) foco="form.fun_codfin.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }    
    try {
    if (form.fun_correo.value>"          ") {
      if (!ValidaMail( form.fun_correo.value )) {
        mensaje=mensaje+"Debe introducir Correo Valido\n"
        if (foco.length==0) foco="form.fun_correo.focus()"
      }
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
    else 
    {
       return true
    }
  }
  
function cargar() {
     for	(var i=0; i < document.FuncionariosForm.fun_codofi.options.length; i++) {
         valo0[i]=document.FuncionariosForm.fun_codofi.options[i].value
         dele0[i]=document.FuncionariosForm.fun_codofi.options[i].text
      }
   }

  function quitar()
  {
     var j=0
     var k=0
     var t=0
     dele = new Array()
     valo = new Array()

     for 	(var i=0; i < document.FuncionariosForm.fun_codreg.options.length; i++) {
        if (document.FuncionariosForm.fun_codreg.options[i].selected==true) {
           k=i
        }
     }
     if (sesion==0) {
        m=0
        for 	(var i=1; i < document.FuncionariosForm.fun_codofi.options.length; i++) {
           valor=document.FuncionariosForm.fun_codofi.options[i].text
           if (valor.substr(0,valor.indexOf("-"))==document.FuncionariosForm.fun_codreg.options[k].text) {       
              valor=document.FuncionariosForm.fun_codofi.options[i].text
              valor=valor
              dele[m]=valor.substr(valor.indexOf("-")+1)
              valo[m]=document.FuncionariosForm.fun_codofi.options[i].value
              m=m+1   
           }
        }
        sesion=sesion+1
     }
     else {
        m=0
        for 	(var i=1; i < valo0.length; i++) {
           valor=dele0[i]
           if (valor.substr(0,valor.indexOf("-"))==document.FuncionariosForm.fun_codreg.options[k].text) {       
              valor=dele0[i]
              valor=valor
              dele[m]=valor.substr(valor.indexOf("-")+1)
              valo[m]=valo0[i]
              m=m+1   
           }
        }
     }

     lon=document.FuncionariosForm.fun_codofi.options.length
     for 	(var i=1; i < lon; i++) {
        document.FuncionariosForm.fun_codofi.options[0]=null           
     }
     document.FuncionariosForm.fun_codofi.options[0]=null
     n=0
     for 	(var i=0; i < m; i++) {
        valor="var option0 = new Option(dele[i], valo[i])"
        eval(valor)
        eval("document.FuncionariosForm.fun_codofi.options[n]=option0") 
        n=++n
     }     

  }    
</script>
<body onload="cargar()">
<html:form action="/funcionariosAction" onsubmit="return validar(this)">
<html:hidden property="operacion"/>
<html:hidden property="opcion"/>
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF">
<caption>Funcionarios</caption>
<logic:equal value="1" name="FuncionariosForm" property="operacion">
   <logic:equal name="FuncionariosForm" property = "opcion" value="1" >
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codigo" /></td>
          <td><html:text property="fun_codigo" name="FuncionariosForm" size="5" maxlength="5" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.descripcion" /></td>
          <td><html:text property="fun_descripcion" name="FuncionariosForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.cargo" /></td>
          <td><html:text property="fun_cargo" name="FuncionariosForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codreg" /></td>
          <td><html:hidden property="fun_codreg" name="FuncionariosForm" />
          <html:text readonly="true" property="descripcion_codreg" name="FuncionariosForm" size="30" maxlength="30" /></td>
      </tr>  
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codofi" /></td>
          <td><html:select name="FuncionariosForm" property="fun_codofi" disabled="false">
               <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion" />
              </html:select></td>          
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codfin" /></td>
          <td><html:select name="FuncionariosForm" property="fun_codfin" disabled="false">
             <html:options collection="FinanciadoresLista" property="codigo" labelProperty="descripcion" />
              </html:select></td> 
      </tr>      
      <tr>
          <td class="S10d"><bean:message key="funcionarios.correo" /></td>
          <td><html:text property="fun_correo" name="FuncionariosForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="FuncionariosForm" property = "opcion" value="2" >
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codigo" /></td>
          <td><html:text readonly="true" property="fun_codigo" name="FuncionariosForm" size="5" maxlength="5" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.descripcion" /></td>
          <td><html:text property="fun_descripcion" name="FuncionariosForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.cargo" /></td>
          <td><html:text property="fun_cargo" name="FuncionariosForm" size="50" maxlength="50" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codreg" /></td>
          <td><html:select name="FuncionariosForm" property="fun_codreg" disabled="false" onchange="quitar()">
             <html:options collection="RegionalesLista" property="codigo" labelProperty="descripcion" />
              </html:select></td> 
      </tr>  
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codofi" /></td>
          <td><html:select name="FuncionariosForm" property="fun_codofi" disabled="false">
             <html:options collection="OficinasLista1" property="codofi" labelProperty="descripcion_codofi" />
              </html:select></td>          
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codfin" /></td>
          <td><html:select name="FuncionariosForm" property="fun_codfin" disabled="false">
             <html:options collection="FinanciadoresLista" property="codigo" labelProperty="descripcion" />
              </html:select></td> 
      </tr>  
      <tr>
          <td class="S10d"><bean:message key="funcionarios.correo" /></td>
          <td><html:text property="fun_correo" name="FuncionariosForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <logic:equal name="FuncionariosForm" property = "fun_estado" value="A" >
          <td class="S10d"><bean:message key="funcionarios.estado" /></td>
          <td class="S10i">
             <input type="radio" name="fun_estado" checked="checked" value="A"> Activo
             <input type="radio" name="fun_estado" value="B"> Baja </td>
          </logic:equal>
          <logic:equal name="FuncionariosForm" property = "fun_estado" value="B" >
          <td class="S10d"><bean:message key="funcionarios.estado" /></td>
          <td class="S10i">
             <input type="radio" name="fun_estado" value="A"> Activo
             <input type="radio" name="fun_estado" checked="checked" value="B"> Baja </td>
          </logic:equal>
      </tr> 
      <tr>
          <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2" /> </td>
          <td align="left"><html:submit value="Cancelar" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=9" /> </td>
      </tr>
   </logic:equal>
   <logic:equal name="FuncionariosForm" property = "opcion" value="3" >
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codigo" /></td>
          <td><html:text readonly="true" property="fun_codigo" name="FuncionariosForm" size="5" maxlength="5" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.descripcion" /></td>
          <td><html:text readonly="true" property="fun_descripcion" name="FuncionariosForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.cargo" /></td>
          <td><html:text readonly="true" property="fun_cargo" name="FuncionariosForm" size="50" maxlength="50" /></td>
      </tr>
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codreg" /></td>
          <td><html:hidden property="fun_codreg" name="FuncionariosForm" />
          <html:text readonly="true" property="descripcion_codreg" name="FuncionariosForm" size="30" maxlength="30" /></td>
      </tr>  
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codofi" /></td>
          <td><html:hidden property="fun_codofi" name="FuncionariosForm" />
          <html:text readonly="true" property="descripcion_codofi" name="FuncionariosForm" size="30" maxlength="30" /></td>
      </tr> 
      <tr>
          <td class="S10d"><bean:message key="funcionarios.codfin" /></td>
          <td><html:hidden property="fun_codfin" name="FuncionariosForm" />
          <html:text readonly="true" property="descripcion_codfin" name="FuncionariosForm" size="30" maxlength="30" /></td>
      </tr>        
      <tr>
          <td class="S10d"><bean:message key="funcionarios.correo" /></td>
          <td><html:text readonly="true" property="fun_correo" name="FuncionariosForm" size="50" maxlength="50" /></td>
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
   <td width="60"  scope="col" class="S10c"><bean:message key="funcionarios.codigo" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="funcionarios.descripcion" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="funcionarios.cargo" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="funcionarios.codofi" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="oficinas.descripcion" /></td> 
   <td width="60" scope="col" class="S10c"><bean:message key="funcionarios.codreg" /></td>
   <td width="160" scope="col" class="S10c"><bean:message key="oficinas.descripcion" /></td>
   <td width="60" scope="col" class="S10c"><bean:message key="funcionarios.codfin" /></td>   
   <td width="60" scope="col" class="S10c"><bean:message key="funcionarios.estado" /></td>   
   <logic:equal value="2" name="FuncionariosForm" property="opcion">   
   <td></td>
   </logic:equal>
   <logic:equal value="3" name="FuncionariosForm" property="opcion">   
   <td></td>
   </logic:equal>   
</tr>
 <% int pnum=0;%>
<logic:iterate name="FuncionariosLista" id="lista">
  <% if (pnum==1) {%>
     <tr class="T8b">
  <% } else { %>
     <tr class="T8a">
  <% } %>
     <td><bean:write name="lista" property="codigo" /></td>
     <td><bean:write name="lista" property="descripcion" /></td>
     <td><bean:write name="lista" property="cargo" /></td>
     <td><bean:write name="lista" property="codofi" /></td>
     <td><bean:write name="lista" property="descripcion_codofi" /></td>
     <td><bean:write name="lista" property="codreg" /></td>
     <td><bean:write name="lista" property="descripcion_codreg" /></td>
     <td><bean:write name="lista" property="codfin" /></td>
     <td><bean:write name="lista" property="estado" /></td>
     <logic:equal value="3" name="FuncionariosForm" property="opcion">
     <td>
        <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=3"/>
     </td>
     </logic:equal>
     <logic:equal value="2" name="FuncionariosForm" property="opcion">
     <td>
        <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=1;opcion.value=2"/>
     </td>
     </logic:equal>
   </tr>
   <% if (pnum==0) pnum=1; else pnum=0; %>   
</logic:iterate>
<logic:equal value="5" name="FuncionariosForm" property="opcion">
   <tr>
   <td colspan="9">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td align="center"> 
      <FONT color="#023264" face="Arial, Helvetica, san-serif" size=1> 
        <em> 
          <html:link href="funcionarios.do" styleClass="T8b">
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