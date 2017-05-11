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

<body  bgcolor="#FFFFFF">  
<html:form action="/bajarAction" enctype="multipart/form-data" >
<table align="left" class="soloborde" width="100%">
    <caption>Bajar Archivos</caption>
      <tr> 
      <td align="center" width="100%">
           <html:submit value="Bajar" styleClass="boton1" />
      </td>
      </tr>
</table>
</html:form>
</body>
</html:html>
