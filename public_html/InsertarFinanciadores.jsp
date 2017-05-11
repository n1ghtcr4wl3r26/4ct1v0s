<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
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
<html:form action="/financiadoresAction" onsubmit="return validaform(this);">
<html:hidden property="estado"/>
<html:hidden property="operacion"/>
<table width="100%" border="0" class="soloborde" bgcolor="#C1C1FF">
<caption>Financiadores</caption>
<tr>
    <td colspan="1" class="S10d"><bean:message key="financiadores.codigo" /></td>
    <td colspan="2"><html:text property="fin_codigo" name="FinanciadoresForm" size="10" maxlength="10" /></td>
</tr>
<tr>
    <td colspan="1" class="S10d"><bean:message key="financiadores.descripcion" /></td>
    <td colspan="2"><html:text property="fin_descripcion" name="FinanciadoresForm" size="50" maxlength="50" /></td>
</tr>
<tr>
    <td></td>
    <td align="left" colspan="2"><html:submit value="Grabar" styleClass="boton1" property="boton" />
</td>
</tr>
<tr class="FondoAzul">
   <td class="S10c">Codigo</td>
   <td class="S10c">Descripcion</td>
 </tr>

<logic:iterate name="FinanciadoresLista" id="lista">
  <tr class="T8a">
     <td><bean:write name="lista" property="codigo" /></td>
     <td><bean:write name="lista" property="descripcion" /></td>
     <td><html:submit value="Borrar" styleClass="boton1" indexed="true" property="boton" />&nbsp;&nbsp;
     <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" /></td>
   </tr>
</logic:iterate>

</table>
</html:form>
</body>
</html>
