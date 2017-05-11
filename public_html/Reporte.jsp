<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ page contentType="text/html;charset=windows-1252"%>
<html:html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <link href="EstilosGaby.css" rel="stylesheet" type="text/css">
</head>

<script language="JavaScript" type="text/JavaScript">
<!--
  bCancel = false;  
-->
</script>
  <script language="JavaScript" type="text/JavaScript" src="Validaciones.js"></script>

<body  bgcolor="#FFFFFF">       
    <html:form action="/reporteAction" onsubmit="return EvaluaR();">
    <div align="center">
       <html:cancel value="Volver" property="org.apache.struts.taglib.html.CANCEL" styleClass="boton1"/>
    </div>
    <br><br>
    <table width=90% align="center" class="soloborde" bgcolor="#C1C1FF">
      <tr> <td class="FondoAzul" align=left><b>Retardo Emisión Pase de Salida.</b></td> </tr>      
      <tr> <td><hr></td></tr>
      <tr> <td> 
             <table align = "center">
                <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Aduana :</td>                              
                    <td><html:select name="ReporteForm" property="aduana">
                           <html:options collection="lAduana" property="codigo" labelProperty="desc"/>
                        </html:select>
                    </td>
                </tr>
                <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Patron :</td>                              
                    <td><html:select name="ReporteForm" property="patron">
                           <html:options collection="lPatron" property="codigo" labelProperty="desc"/>
                        </html:select>
                    </td>
                </tr> 
               <tr><td colspan="3" align="right"><html:submit value="Actualizar Reporte" styleClass="boton1"/></td></tr>
               <tr>
                     <table class="soloborde" bgcolor="#C1C1FF" width=100%>
                       <tr class="FondoAzul">
                         <td class="S10c">Aduana</td>                              
                         <td class="S10c">Patron</td>                              
                         <td class="S10c">Tiempo</td>                              
                         <td class="S10c">Desde</td>                              
                         <td class="S10c">Hasta</td>                                                
                         <td class="S10c">Estado</td>                         
                         <td class="S10c">Usuario</td>
                         <td class="S10c">Fecha Operación</td>
                        </tr>
                        <logic:notEqual name="ReporteForm" property="resu" value="0">
                        <logic:iterate id="lista" name="registros">
                           <tr align="left" class="T8a">
                              <td><bean:write name="lista" property="aduana" /></td>                    
                              <td><bean:write name="lista" property="patron" /></td>                    
                              <td><bean:write name="lista" property="horas" /></td>                    
                              <td><bean:write name="lista" property="desde" /></td>                    
                              <td><bean:write name="lista" property="hasta" /></td>                    
                              <td><bean:write name="lista" property="estado" /></td>                    
                              <td><bean:write name="lista" property="usuario" /></td>
                              <td><bean:write name="lista" property="fecha" /></td>
                           </tr>
                        </logic:iterate>
                        </logic:notEqual>
                        <tr><td colspan="8" align="center">
                            <html:cancel value="Volver" property="org.apache.struts.taglib.html.CANCEL" styleClass="boton1"/>
                        </td></tr>
                     </table>   
               </tr>      
      <tr>
      </table>
      </td></tr> 
    </table>
    <br><br>


</html:form>
</body>
</html:html>
