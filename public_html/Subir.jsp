<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.Vector, ActivosFijos.*" %>
<%@ page contentType="text/html;charset=windows-1252"%>

<html:html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <link href="EstilosGaby.css" rel="stylesheet" type="text/css">
</head>

<script language="JavaScript" type="text/JavaScript" src="Validaciones.js"></script>
<script language="JavaScript" type="text/JavaScript">
<!--
  bCancel = false;  
-->
</script>

<body  bgcolor="#FFFFFF">  
<html:form action="/subirAction" enctype="multipart/form-data"  >
   <table align="left" class="soloborde" width="100%">
    <caption>Subir Archivos</caption>
      <tr> 
      <td class="S10d" width="50%"> Archivo a subir : </td> 
      <td width="50%"> <html:file property="txt_medio" /> </td> 
      </tr>
      <tr> 
      <td colspan="2" align="center" width="100%">
           <html:submit value="Subir" styleClass="boton1"  />
      </td>
      </tr>
    </table>
</html:form>
</body>
</html:html>
