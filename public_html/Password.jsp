<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <link href="EstilosGaby.css" rel="stylesheet" type="text/css">
</head>
<html:errors />
<body>
  <html:form action="/password">
   <table width=70% align="center" class="soloborde" bgcolor="#C1C1FF">
       <tr> <td class="FondoAzul" align=left><b>INTRODUZCA NUEVA CONTRASEÑA.</b></td> </tr>
       <tr><td> <hr> </td></tr>
       <tr><td>
           <table cols="50%,50%">
              <tr><td class="S8"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CONTRASEÑA:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <html:password property="txt_pas"  size="30" maxlength="30"/></td>
              </tr>
              <tr><td class="S8">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CONFIRMAR CONTRASEÑA:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                          
                          <html:password property="txt_confPas"  size="30" maxlength="30"/> </td></tr>      
           </table>
       </td></tr>  
       <tr><td align="center">
           <html:submit value="Aceptar" styleClass="boton1" onclick="valP.value=1"/> &nbsp;&nbsp;&nbsp;
           <html:cancel value="Cancelar" styleClass="boton1"/>
       </td></tr>
       <tr><tr>&nbsp;</tr></tr>
   </table>
  </html:form> 
</body>
</html>
