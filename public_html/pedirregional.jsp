<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <link href="Estilos.css" rel="stylesheet" type="text/css">
   <title>SISTEMA DE ACTIVOS FIJOS</title>
</head>
<script language="JavaScript" type="text/JavaScript" src="Validaciones.js"></script>
<script language="JavaScript" type="text/JavaScript">
  function validar(form)
  {
    mensaje=""
    foco=""
    try {
    i=form.cod_reg.selectedIndex
   	if (i==0) {
      mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.cod_reg.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    i=form.cod_fin.selectedIndex
   	if (i==0) {
	   	mensaje=mensaje+"Debe introducir Financiador\n"
		  if (foco.length==0) foco="form.cod_fin.focus()"
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
<html:errors />
<body oncontextmenu="return false">
<br><br><br><br>
  <html:form action="/pedirregional" onsubmit="return validar(this)"> 
    
    <table width=65% align="center" class="soloborde" bgcolor="#C1C1FF">
       <tr> <td class="FondoAzul" align="center" colspan="2"><b>Activos fijos</b></td> </tr>
       <tr> <td class="FondoAzul" align="center" colspan="2"><b>Regional</b></td> </tr>
       <tr>
       <td width=40% class="S8" align="right"><bean:message key="login.usuario" /></td>
       <td width=60% class="S8"><html:text readonly="true" property="txt_usu"  size="15" maxlength="17" accesskey="13" onblur="Mayusculas(this);" /> </td>
       </tr>
       <tr>
       <td width=40% class="S8" align="right"><bean:message key="login.password" /></td>
       <td width=60% class="S8"><html:password readonly="true" property="txt_pas"  size="15" maxlength="17" accesskey="13" /></td>
       </tr>       
       <tr>
         <td class="S8" align="right"><bean:message key="activos.codreg" /></td>
         <td><html:select name="InicioForm" property="cod_reg" disabled="false">
              <html:options collection="RegionalesLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
       </tr>   
       <tr>
         <td class="S8" align="right"><bean:message key="activos.codfin" /></td>
         <td><html:select name="InicioForm" property="cod_fin" disabled="false">
              <html:options collection="FinanciadoresLista" property="codigo" labelProperty="descripcion"/>
              </html:select></td>
       </tr>   
       <tr><td align="center" colspan="2"> <html:submit value="Seleccionar" styleClass="boton1" /> </td></tr>
     </table> 
  </html:form>    
</body>
</html>
