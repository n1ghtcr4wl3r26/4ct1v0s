<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.Vector, PaquetePrincipal.*" %>
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
    <html:form action="/bajasAction" focus="aduana" onsubmit="return Evalua();">
    <html:hidden property="val"/>
    <html:hidden property="op"/>
    <table width=80% align="center" class="soloborde" bgcolor="#C1C1FF">
      <tr> <td class="FondoAzul" align=left><b>Retardo Emisión Pase de Salida.</b></td> </tr>
      <tr> <td><hr></td></tr>
      <tr> <td> 
             <table cols="50%,50%">
                <logic:equal name="BajasForm" property = "op" value="0" >
                <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Aduana :</td>                              
                    <td><html:select name="BajasForm" property="aduana" disabled="false">
                           <html:options collection="lAduana" property="codigo" labelProperty="desc"/>
                        </html:select>
                    </td>
                </tr>
                <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Patron :</td>                              
                    <td><html:select name="BajasForm" property="patron" disabled="false">
                           <html:options collection="lPatron" property="codigo" labelProperty="desc"/>
                        </html:select>
                    </td>
                </tr> 
                </logic:equal>
                <logic:notEqual name="BajasForm" property = "op" value="0" >
                <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Aduana :</td>                              
                    <td><html:select name="BajasForm" property="aduana" disabled="true">
                           <html:options collection="lAduana" property="codigo" labelProperty="desc"/>
                        </html:select>
                    </td>
                </tr>
                <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Patron :</td>                              
                    <td><html:select name="BajasForm" property="patron" disabled="true">
                           <html:options collection="lPatron" property="codigo" labelProperty="desc"/>
                        </html:select>
                    </td>
                </tr> 
                </logic:notEqual>
                <logic:equal name="BajasForm" property = "op" value="0" >                
                         <tr><td><html:submit value="Ver Datos" styleClass="boton1" onclick="val.value=2"/></td></tr>
                </logic:equal>
                <logic:equal name="BajasForm" property = "op" value="1" >                
                       <tr><td><html:submit value="Nuevo" styleClass="boton1" onclick="val.value=3" /></td></tr>
                </logic:equal>
               <logic:equal name="BajasForm" property = "op" value="2" >                
                    <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Tiempo (En minutos): </td>    
                        <td><html:text name="BajasForm" property="horas" size="15" maxlength="15" disabled="true"/></td>
                    </tr>                                          
                   <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Desde &nbsp;(dd/mm/yyyy hrs:min:seg)*: </td>
                       <td><html:text name="BajasForm" property="fec_ini" size="10" maxlength="10" disabled="true"/>&nbsp;&nbsp;
                           <html:text name="BajasForm" property="hr_ini" size="8" maxlength="8" disabled="true"/></td>
                   </tr>                
                   <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Hasta &nbsp;(dd/mm/yyyy hrs:min:seg)*: </td>
                       <td><html:text name="BajasForm" property="fec_fin" size="10" maxlength="10" disabled="true"/>&nbsp;&nbsp;
                           <html:text name="BajasForm" property="hr_fin" size="8" maxlength="8" disabled="true"/></td>
                   </tr> 
                   <tr><td colspan="2"><hr></td></tr>
                   <tr><td align="center"><html:submit value="Aceptar" styleClass="boton1" onclick="val.value=1" disabled="false" />                                          
                                          <html:cancel value="Cancelar" property="org.apache.struts.taglib.html.CANCEL" styleClass="boton1" disabled="false" />
                   </td></tr>
                   <tr>&nbsp;</tr>
                   <tr><td colspan="2"><hr></td></tr>
                   <TR><td class="S10i" colspan="2"> * La hora deberá ser expresada en horas de 00 a 24 </td></TR>                        
               </logic:equal>
               <logic:equal name="BajasForm" property = "op" value="3" >                
                    <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Tiempo (En minutos): </td>    
                        <td><html:text name="BajasForm" property="horas" size="15" maxlength="15" disabled="false" onkeypress="esNumero();"/></td>
                    </tr>                                          
                   <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Desde &nbsp;(dd/mm/yyyy hrs:min:seg)*: </td>
                       <td><html:text name="BajasForm" property="fec_ini" size="10" maxlength="10" disabled="true"/>&nbsp;&nbsp;
                           <html:text name="BajasForm" property="hr_ini" size="8" maxlength="8" disabled="true"/></td>
                   </tr>                
                   <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Hasta &nbsp;(dd/mm/yyyy hrs:min:seg)*: </td>
                       <td><html:text name="BajasForm" property="fec_fin" size="10" maxlength="10" disabled="true"/>&nbsp;&nbsp;
                           <html:text name="BajasForm" property="hr_fin" size="8" maxlength="8" disabled="true"/></td>
                   </tr> 
                   <tr><td colspan="2"><hr></td></tr>
                   <tr><td align="center"><html:submit value="Aceptar" styleClass="boton1" onclick="val.value=1" disabled="false" />
                                          <html:cancel value="Cancelar" styleClass="boton1" property="org.apache.struts.taglib.html.CANCEL" disabled="false" />
                   </td></tr>
                   <tr>&nbsp;</tr>
                   <tr><td colspan="2"><hr></td></tr>
                   <TR><td class="S10i" colspan="2"> * La hora deberá ser expresada en horas de 00 a 24 </td></TR>                        
               </logic:equal>                
               <logic:equal name="BajasForm" property = "op" value="4" >                
                    <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Tiempo (En minutos): </td>    
                        <td><html:text name="BajasForm" property="horas" size="15" maxlength="15" disabled="false" onkeypress="esNumero();"/></td>
                    </tr>                                          
                   <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Desde &nbsp;(dd/mm/yyyy hrs:min:seg)*: </td>
                       <td><html:text name="BajasForm" property="fec_ini" size="10" maxlength="10" disabled="false"/>&nbsp;&nbsp;
                           <html:text name="BajasForm" property="hr_ini" size="8" maxlength="8" disabled="false"/></td>
                   </tr>                
                   <tr><td class="S10d">&nbsp;&nbsp;&nbsp;&nbsp;Hasta &nbsp;(dd/mm/yyyy hrs:min:seg)*: </td>
                       <td><html:text name="BajasForm" property="fec_fin" size="10" maxlength="10" disabled="false"/>&nbsp;&nbsp;
                           <html:text name="BajasForm" property="hr_fin" size="8" maxlength="8" disabled="false"/></td>
                   </tr> 
                   <tr><td colspan="2"><hr></td></tr>
                   <tr><td align="center"><html:submit value="Aceptar" styleClass="boton1" onclick="val.value=1" disabled="false" />
                                          <html:cancel value="Cancelar" styleClass="boton1" property="org.apache.struts.taglib.html.CANCEL" disabled="false" />
                   </td></tr>
                   <tr>&nbsp;</tr>
                   <tr><td colspan="2"><hr></td></tr>
                   <TR><td class="S10i" colspan="2"> * La hora deberá ser expresada en horas de 00 a 24 </td></TR>                        
               </logic:equal>                  
             </table>
      </td> </tr>
      <tr> <td><hr></td></tr>
      <logic:notEqual name="BajasForm" property = "op" value="0" >                
      <tr><td>
            <table class="soloborde" bgcolor="#C1C1FF" width = 100%>
               <tr class="FondoAzul">
                   <td class="S10c">Aduana</td>                              
                   <td class="S10c">Patron</td>                              
                   <td class="S10c">Tiempo</td>                              
                   <td class="S10c">Desde</td>                              
                   <td class="S10c">Hasta</td>                              
                   <logic:equal name="BajasForm" property = "resu" value="0" > 
                    <td colspan="8"><html:submit value="Adicionar" styleClass="boton1" onclick="val.value=0"/></td>
                   </logic:equal>
                   <logic:equal name="BajasForm" property = "resu" value="-1" > 
                    <td colspan="8"><html:submit value="Adicionar" styleClass="boton1" onclick="val.value=0"/></td>
                   </logic:equal>                   
                </tr>                
                <logic:notEqual name="BajasForm" property = "resu" value="0" > 
                <logic:iterate name="Configuraciones" id="lista">
                   <tr class="T8a">
                        <td><bean:write name="lista" property="aduana" /></td>
                        <td><bean:write name="lista" property="patron" /></td>
                        <td><bean:write name="lista" property="horas" /></td>
                        <td><bean:write name="lista" property="desde"/>&nbsp;<bean:write name="lista" property="hr_desde" /></td>
                        <td><bean:write name="lista" property="hasta"/>&nbsp;<bean:write name="lista" property="hr_hasta" /> </td>
                        <td><html:submit value="Borrar" styleClass="boton1" indexed="true" property="boton" onclick="val.value=0"/></td>
                        <td><html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="val.value=0"/></td>
                        <td><html:submit value="Adicionar" styleClass="boton1" indexed="true" property="boton" onclick="val.value=0"/></td>
                   </tr>
                </logic:iterate>
                </logic:notEqual>
            </table>
      </td></tr>
      </logic:notEqual>
    </table>
</html:form>
</body>
</html:html>
