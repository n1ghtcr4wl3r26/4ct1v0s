<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.Vector, ActivosFijos.*" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*, oracle.jdbc.driver.*, java.util.*, java.text.*" %>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <meta http-equiv="Expires" content="-1">
   <link href="Estilos.css" rel="stylesheet" type="text/css">
</head>
<script language="JavaScript" type="text/JavaScript" src="Validaciones.js"></script>
<script language="JavaScript" type="text/JavaScript">
function ftarget()
{
  f = document.forms[0];
  f.target='_blank';
}
function validar(form)
{
 mensaje=""
 foco=""
 if ((form.operacion.value==3)&&(form.opcion.value==5)) {
  ftarget()
 }
 if ((form.opcion.value==6)) {
    try {
        if (!textoObligatorio( form.ddo_codrubactual.value )) {
      	   	mensaje=mensaje+"Debe introducir Código Activo\n"
      		  if (foco.length==0) foco="form.ddo_codrubactual.focus()"
        }
     }
     catch (e) {
        xvar=0
    }
 }
 if ((form.operacion.value!=7)&&(form.operacion.value!=2)) {
   try {
   if (!esFecha(form.doc_fecha.value)){
     mensaje=mensaje+"Debe introducir fecha dd/mm/yyyy\n"
     if (foco.length==0) foco="form.doc_fecha.focus()"
   }
   }
   catch (e) {
     xvar=0
   }  
   try {
      if (form.salir.value!=1){
         i=form.ddo_codmot.selectedIndex;
       	 if (!comboObligatorio(form.ddo_codmot.options[i].value)) {
 	         mensaje=mensaje+"Debe introducir Motivo de Baja\n"
           if (foco.length==0) foco="form.ddo_codmot.focus()"
         }
      }   
   }
   catch (e) {
     xvar=0
   }
   try {
      if (form.salir.value!=1){
         i=form.ddo_codofiactual.selectedIndex;
       	 if (!comboObligatorio(form.ddo_codofiactual.options[i].value)) {
 	         mensaje=mensaje+"Debe introducir Oficina Destino\n"
           if (foco.length==0) foco="form.ddo_codofiactual.focus()"
         }
      }   
   }
   catch (e) {
     xvar=0
   }   
   try {
    i=form.doc_codfunorigen.selectedIndex;
   	if (!comboObligatorio(form.doc_codfunorigen.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Funcionario Origen\n"
		  if (foco.length==0) foco="form.doc_codfunorigen.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
   try {
    i=form.doc_codfundestino.selectedIndex;
   	if (!comboObligatorio(form.doc_codfundestino.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Funcionario Destino\n"
		  if (foco.length==0) foco="form.doc_codfundestino.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.doc_codfunorigen.selectedIndex;
    j=form.doc_codfundestino.selectedIndex;
   	if ((form.doc_codfunorigen.options[i].value)==(form.doc_codfundestino.options[j].value)) {
	   	mensaje=mensaje+"Debe introducir Diferentes Funcionario Origen y Destino\n"
		  if (foco.length==0) foco="form.doc_codfunorigen.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
   try {
    i=form.doc_codreg.selectedIndex;
   	if (!comboObligatorio(form.doc_codreg.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Regional\n"
		  if (foco.length==0) foco="form.doc_codreg.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
   try {
    i=form.doc_codfin.selectedIndex;
   	if (!comboObligatorio(form.doc_codfin.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Financiador\n"
		  if (foco.length==0) foco="form.doc_codfin.focus()"
  	}  
    }
    catch (e) {
      xvar=0
    }
    try {
    i=form.doc_tipdoc.selectedIndex;
   	if (!comboObligatorio(form.doc_tipdoc.options[i].value)) {
	   	mensaje=mensaje+"Debe introducir Tipo de Documento\n"
		  if (foco.length==0) foco="form.doc_tipdoc.focus()"
  	}  
    }
    catch (e) {
      xvar=0      
    }
    try {
    if (!textoObligatorio( form.doc_numero.value )) {
	   	mensaje=mensaje+"Debe introducir Número\n"
		  if (foco.length==0) foco="form.doc_numero.focus()"
    }
    }
    catch (e) {
      xvar=0
    }
    try {
   	if (!comboObligatorio(form.doc_numero.value)) {
	   	mensaje=mensaje+"Debe introducir Número <> 0\n"
		  if (foco.length==0) foco="form.doc_numero.focus()"
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
}
function limpiar_numero_devolucion() {
   try {
      if (document.forms[0].doc_tipdoc.value=="E")
         document.forms[0].doc_devolucion.value="";
   }
   catch (e) {
      xvar=0
   }
}
</script>
<body onload="limpiar_numero_devolucion();">
<table width="100%" align="center"  class="soloborde" bgcolor="#C1C1FF" border="1">
<caption>Acta</caption>
<logic:equal name="DocumentosForm" property = "doc_tipdoc" value='E' >
<caption>De Entrega</caption>
</logic:equal>
<logic:equal name="DocumentosForm" property = "doc_tipdoc" value='D' >
<caption>De Devolución</caption>
</logic:equal>
<logic:equal name="DocumentosForm" property = "doc_tipdoc" value='T' >
<caption>De Transferencia</caption>
</logic:equal>
<logic:equal name="DocumentosForm" property = "doc_tipdoc" value='U' >
<caption>De Transferencia Entre Regionales</caption>
</logic:equal>
<logic:equal name="DocumentosForm" property = "doc_tipdoc" value='B' >
<caption>De Baja</caption>
</logic:equal>
<logic:equal name="DocumentosForm" property = "doc_tipdoc" value='V' >
<caption>De Transferencia Entre Financiadores</caption>
</logic:equal>
<html:form action="/documentosAction" onsubmit="return validar(this)">
<html:hidden property="operacion" />
<html:hidden property="opcion" />
<input type="hidden" name="salir" value="0">
<logic:equal value="2" name="DocumentosForm" property="operacion">
  <tr class="T8a">
     <td>
     <table width="100%" align="center" class="soloborde" bgcolor="#C1C1FF" border="1">
     <tr>
         <td class="S10d"><bean:message key="Documentos.codreg" /></td>
         <td><html:hidden property="doc_codreg" name="DocumentosForm" />
         <html:text readonly="true" property="doc_regdescripcion" name="DocumentosForm" size="30" maxlength="30" /></td>
     </tr> 
     <tr>
         <td class="S10d"><bean:message key="Documentos.codfin" /></td>
         <td><html:hidden property="doc_codfin" name="DocumentosForm" />
         <html:text readonly="true" property="doc_findescripcion" name="DocumentosForm" size="30" maxlength="30" /></td>
     </tr> 
     <tr>
        <td class="S10d"><bean:message key="Documentos.tipdoc" /></td>
        <td><html:select name="DocumentosForm" property="doc_tipdoc" disabled="false">
            <html:options collection="TiposDocumentosLista" property="codigo" labelProperty="descripcion" />
            </html:select></td>           
     </tr>
     <logic:notEqual value="1" name="DocumentosForm" property="opcion">
     <tr>
        <td class="S10d"><bean:message key="Documentos.inicio" /></td>
        <td><html:text property="inicio" name="DocumentosForm" size="10" maxlength="10" value="0"/></td>
     </tr> 
     <tr>
        <td class="S10d"><bean:message key="Documentos.fin" /></td>
        <td><html:text property="fin" name="DocumentosForm" size="10" maxlength="10" value="99999" /></td>
     </tr> 
     <logic:equal value="5" name="DocumentosForm" property="opcion">
     <tr>
        <td class="S10d">Gestion: </td>  
        <td><html:text property="gestionant" name="DocumentosForm" size="10" maxlength="4" /></td>        
     </tr>
     <tr></tr>
        <td class="S10d">Confirmados: </td>
        <td class="S10i"><input type="radio" name="confirmados" value="S"> Si <input type="radio" name="confirmados" checked="checked" value="N"> No</td>
     </tr> 
     </logic:equal>
     </logic:notEqual>
     <tr>
        <td></td>
        <td align="left">
        <logic:equal value="5" name="DocumentosForm" property="opcion">
           <html:submit value="Reportar" styleClass="boton1" property="boton" onclick="operacion.value=4;opcion.value=5;salir.value=0" />
        </logic:equal>
        <logic:equal value="4" name="DocumentosForm" property="opcion">
           <html:submit value="Confirmar" styleClass="boton1" property="boton" onclick="operacion.value=4;opcion.value=4;salir.value=0" />
        </logic:equal>
        <logic:equal value="3" name="DocumentosForm" property="opcion">
           <html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=4;opcion.value=3;salir.value=0" />
        </logic:equal>
        <logic:equal value="2" name="DocumentosForm" property="opcion">
           <html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=4;opcion.value=2;salir.value=0" />
        </logic:equal>
        <logic:equal value="1" name="DocumentosForm" property="opcion">
           <html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=5;opcion.value=1;salir.value=0" />
        </logic:equal>
        </td>
     </tr>
     </table>
     </td>
   </tr>
</logic:equal>
<logic:equal value="4" name="DocumentosForm" property="operacion">
  <tr class="T8a">
     <td>
     <html:hidden property="inicio" name="DocumentosForm"  />
     <html:hidden property="fin" name="DocumentosForm"  />
     <html:hidden property="doc_tipdoc" name="DocumentosForm" />
     <html:hidden property="confirmados" name="DocumentosForm"  />
     <html:hidden property="gestionant" name="DocumentosForm"  />
     <table width="100%" align="center" class="soloborde" bgcolor="#C1C1FF" border="1">
     <tr><td>
      <table width="100%" class="soloborde" bgcolor="#C1C1FF">
       <tr class="FondoAzul">
         <td width="60" scope="col" class="S10c">Acta</td>
         <td width="60" scope="col" class="S10c">Número</td>
         <td width="60" scope="col" class="S10c">Fecha</td>
         <td width="60" scope="col" class="S10c">Origen</td>
         <logic:notEqual name="DocumentosForm" property = "doc_tipdoc" value='B' >
          <td width="60" scope="col" class="S10c">Destino</td>
         </logic:notEqual>
         <td width="100" scope="col" class="S10c">Observación</td>         
         <td></td>
       </tr>
      <% int pnum=0;%>
      <logic:iterate name="DocumentosLista" id="lista">
        <% if (pnum==1) {%>
           <tr class="T8b">
        <% } else { %>
           <tr class="T8a">
        <% } %>
           <td><bean:write name="lista" property="descripcion_tipdoc" /></td>
           <td><bean:write name="lista" property="numero" /></td>
           <td><bean:write name="lista" property="fecha" /></td>
           <td><bean:write name="lista" property="codfunorigen" />-<bean:write name="lista" property="nombre_codfunorigen" /></td>
           <logic:notEqual name="DocumentosForm" property = "doc_tipdoc" value='B' >
             <td><bean:write name="lista" property="codfundestino" />-<bean:write name="lista" property="nombre_codfundestino" /></td>
           </logic:notEqual>
           <td><bean:write name="lista" property="observacion" /></td>
           <td align="right">
            <logic:equal value="5" name="DocumentosForm" property="opcion">
              <html:submit value="Reportar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=3;opcion.value=5;salir.value=0"/>
            </logic:equal>
            <logic:equal value="4" name="DocumentosForm" property="opcion">
              <html:submit value="Confirmar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=3;opcion.value=4;salir.value=0"/>
            </logic:equal>     
            <logic:equal value="3" name="DocumentosForm" property="opcion">
              <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=3;opcion.value=3;salir.value=0"/>
            </logic:equal>     
            <logic:equal value="2" name="DocumentosForm" property="opcion">
              <html:submit value="Modificar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=5;opcion.value=2;salir.value=0"/>
            </logic:equal>     
           </td>
         </tr>
         <% if (pnum==0) pnum=1; else pnum=0; %>
      </logic:iterate>
      </table>
     </td></tr>     
     </table>
     </td>
   </tr>
</logic:equal>
<logic:equal value="5" name="DocumentosForm" property="operacion">
   <logic:equal name="DocumentosForm" property = "opcion" value="2" >
      <tr>
         <td class="S10d">
         <html:hidden property="inicio"  name="DocumentosForm" />
         <html:hidden property="fin"  name="DocumentosForm" />
         <html:hidden property="doc_codreg" name="DocumentosForm" />
         <html:hidden property="doc_codfin" name="DocumentosForm" />
         <html:hidden property="doc_tipdoc" name="DocumentosForm" />
         <bean:message key="Documentos.numero" /></td>
         <td><html:text readonly="true" property="doc_numero" name="DocumentosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="Documentos.fecha" /></td>
         <td colspan="5"><html:text property="doc_fecha" name="DocumentosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='E' >
           <td class="S10d"><bean:message key="Documentos.codfunorigen" /></td>
           <td colspan="5"><html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
           <html:hidden property="doc_codfunorigen" name="DocumentosForm" /></td>
         </logic:equal>
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='B' >
           <td class="S10d"><bean:message key="Documentos.codfunorigen" /></td>
           <td colspan="5"><html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
           <html:hidden property="doc_codfunorigen" name="DocumentosForm" /></td>
         </logic:equal>         
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='U' >
           <td class="S10d"><bean:message key="Documentos.codfunorigen" /></td>
           <td colspan="5"><html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
           <html:hidden property="doc_codfunorigen" name="DocumentosForm" /></td>
         </logic:equal>         
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='V' >
           <td class="S10d"><bean:message key="Documentos.codfunorigen" /></td>
           <td colspan="5"><html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
           <html:hidden property="doc_codfunorigen" name="DocumentosForm" /></td>
         </logic:equal>         
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='D' >
            <td class="S10d"><bean:message key="Documentos.codfunorigen" /></td>
            <td colspan="5">         
              <html:select name="DocumentosForm" property="doc_codfunorigen" disabled="false" >
              <html:options collection="FuncionariosLista2" property="codigo" labelProperty="descripcion" />
              </html:select>
            </td>
         </logic:equal>
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='T' >
            <td class="S10d"><bean:message key="Documentos.codfunorigen" /></td>
            <td colspan="5">          
              <html:select name="DocumentosForm" property="doc_codfunorigen" disabled="false" >
              <html:options collection="FuncionariosLista2" property="codigo" labelProperty="descripcion" />
              </html:select>
            </td>
         </logic:equal>
      </tr>
      <logic:notEqual name="DocumentosForm" property = "doc_tipdoc" value='B' >
      <tr>
         <td class="S10d"><bean:message key="Documentos.codfundestino" /></td>
         <td colspan="5">
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='D' >
              <html:text readonly="true" property="doc_fundesnombre" name="DocumentosForm" size="40" maxlength="40" />            
              <html:hidden property="doc_codfundestino" name="DocumentosForm" />
           </logic:equal>
           <logic:notEqual name="DocumentosForm" property = "doc_tipdoc" value='D' >
             <html:select name="DocumentosForm" property="doc_codfundestino" disabled="false">
             <html:options collection="FuncionariosLista" property="codigo" labelProperty="descripcion" />
             </html:select>
           </logic:notEqual>   
         </td>
      </tr>
      </logic:notEqual>
      <tr>
         <td class="S10d"><bean:message key="Documentos.observacion" /></td>
         <td colspan="5"><html:text property="doc_observacion" name="DocumentosForm" size="40" maxlength="100" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <tr>
         <td align="right"><html:submit value="Modificar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=2;salir.value=0" /></td>
         <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=2;salir.value=1" /></td>
      </tr>
   </logic:equal>
   <logic:equal name="DocumentosForm" property = "opcion" value="1" >
      <tr>
         <td class="S10d">
         <html:hidden property="doc_codreg" name="DocumentosForm" />
         <html:hidden property="doc_codfin" name="DocumentosForm" />
         <html:hidden property="doc_tipdoc" name="DocumentosForm" />
         <bean:message key="Documentos.numero" /></td>
         <td><html:text readonly="true" property="doc_numero" name="DocumentosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="Documentos.fecha" /></td>
         <td colspan="5"><html:text property="doc_fecha" name="DocumentosForm" size="10" maxlength="10" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="Documentos.codfunorigen" /></td>
         <td colspan="5">
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='E' >
            <html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
            <html:hidden property="doc_codfunorigen" name="DocumentosForm" />
         </logic:equal>      
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='B' >
            <html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
            <html:hidden property="doc_codfunorigen" name="DocumentosForm" />
         </logic:equal>
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='D' >
            <html:select name="DocumentosForm" property="doc_codfunorigen" disabled="false" >
            <html:options collection="FuncionariosLista2" property="codigo" labelProperty="descripcion" />
            </html:select>
         </logic:equal>
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='T' >
            <html:select name="DocumentosForm" property="doc_codfunorigen" disabled="false" >
            <html:options collection="FuncionariosLista2" property="codigo" labelProperty="descripcion" />
            </html:select>
         </logic:equal>
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='U' >
            <html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
            <html:hidden property="doc_codfunorigen" name="DocumentosForm" />   
         </logic:equal>
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='V' >
            <html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
            <html:hidden property="doc_codfunorigen" name="DocumentosForm" />   
         </logic:equal>         
         </td>
      </tr>
      <logic:notEqual name="DocumentosForm" property = "doc_tipdoc" value='B' >
      <tr>
         <td class="S10d"><bean:message key="Documentos.codfundestino" /></td>
         <td colspan="5">
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='D' >
             <html:text readonly="true" property="doc_fundesnombre" name="DocumentosForm" size="40" maxlength="40" />            
             <html:hidden property="doc_codfundestino" name="DocumentosForm" />
           </logic:equal>
           <logic:notEqual name="DocumentosForm" property = "doc_tipdoc" value='D' >
              <html:select name="DocumentosForm" property="doc_codfundestino" disabled="false">
              <html:options collection="FuncionariosLista" property="codigo" labelProperty="descripcion" />
              </html:select>
           </logic:notEqual>   
         </td>
      </tr>
      </logic:notEqual>
      <tr>
         <td class="S10d"><bean:message key="Documentos.observacion" /></td>
         <td colspan="5"><html:text property="doc_observacion" name="DocumentosForm" size="40" maxlength="100" onchange="javascript:this.value=this.value.toUpperCase();" /></td>
      </tr>
      <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='E' >
      <tr>
         <td class="S10d">Número de Devolución :</td>
         <td colspan="5"><html:text property="doc_devolucion" name="DocumentosForm" size="10" maxlength="10" /></td>
      </tr>
      </logic:equal>
      <tr>
         <td align="right">
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='T' >      
            <html:submit value="Insertar Total" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=10;salir.value=0" />
         </logic:equal>
         <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='D' >      
            <html:submit value="Insertar Total" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=11;salir.value=0" />
         </logic:equal>
         <html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=3;opcion.value=1;salir.value=0" /></td>
         <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1;salir.value=1" /></td>
      </tr>
   </logic:equal>
</logic:equal>
   <logic:equal value="3" name="DocumentosForm" property="operacion">
    <logic:notEqual name="DocumentosForm" property = "opcion" value="5" >
      <tr>
         <td class="S10d">
         <html:hidden property="inicio" name="DocumentosForm" />
         <html:hidden property="fin" name="DocumentosForm" />
         <html:hidden property="doc_codreg" name="DocumentosForm" />
         <html:hidden property="doc_codfin" name="DocumentosForm" />
         <html:hidden property="doc_tipdoc" name="DocumentosForm" />
         <bean:message key="Documentos.numero" /></td>
         <td><html:text readonly="true" property="doc_numero" name="DocumentosForm" size="4" maxlength="4" /></td>
      </tr>
      <tr>
         <td class="S10d"><bean:message key="Documentos.fecha" /></td>
         <td colspan="5"><html:text readonly="true" property="doc_fecha" name="DocumentosForm" size="10" maxlength="10" /></td>
      </tr>
        <tr>
           <td class="S10d"><bean:message key="Documentos.codfunorigen" /></td>
           <td colspan="5"><html:text readonly="true" property="doc_funorinombre" name="DocumentosForm" size="40" maxlength="40" />            
              <html:hidden property="doc_codfunorigen" name="DocumentosForm" /></td>
        </tr>
      <logic:notEqual name="DocumentosForm" property = "doc_tipdoc" value='B' >
      <tr>
         <td class="S10d"><bean:message key="Documentos.codfundestino" /></td>
         <td colspan="5">
           <html:text readonly="true" property="doc_fundesnombre" name="DocumentosForm" size="40" maxlength="40" />            
           <html:hidden property="doc_codfundestino" name="DocumentosForm" />
         </td>
      </tr>
      </logic:notEqual>
      <tr>
         <td class="S10d"><bean:message key="Documentos.observacion" /></td>
         <td colspan="5"><html:text readonly="true" property="doc_observacion" name="DocumentosForm" size="40" maxlength="100" /></td>
      </tr>
      <tr class="FondoAzul">
           <td colspan="3">Codigo Activo.....Descripcion</td>
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='B' >      
            <td colspan="1">Baja</td>
           </logic:equal>
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='E' >      
            <td colspan="1">Oficina Destino</td>
           </logic:equal>      
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='T' >      
            <td colspan="1">Oficina Destino</td>
           </logic:equal>           
      </tr>
    </logic:notEqual>
      <logic:equal name="DocumentosForm" property = "opcion" value="1" >
         <tr>
           <td colspan="3"><html:hidden property="ddo_item" name="DocumentosForm" />
             <html:text property="ddo_codrubactual" name="DocumentosForm" size="10" maxlength="9"/>
             <html:text readonly="true" property="desactivo" name="DocumentosForm" size="80" /></td>               
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='B' >
              <td colspan="1"><html:select name="DocumentosForm" property="ddo_codmot" disabled="false">
              <html:options collection="TiposBajaLista" property="codigo" labelProperty="descripcion" /></html:select></td>              
           </logic:equal>
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='E' >
              <td colspan="1"><html:select name="DocumentosForm" property="ddo_codofiactual" disabled="false">
              <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion" /></html:select></td>              
           </logic:equal>           
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='T' >
              <td colspan="1"><html:select name="DocumentosForm" property="ddo_codofiactual" disabled="false">
              <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion" /></html:select></td>              
           </logic:equal>                      
         </tr>
      </logic:equal>
      <logic:equal name="DocumentosForm" property = "opcion" value="2" >
         <tr>
           <td colspan="3"><html:hidden property="ddo_item" name="DocumentosForm" />
             <html:text property="ddo_codrubactual" name="DocumentosForm" size="10" maxlength="9"/>
             <html:text readonly="true" property="desactivo" name="DocumentosForm" size="80" /></td>               
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='B' >
              <td colspan="1"><html:select name="DocumentosForm" property="ddo_codmot" disabled="false">
              <html:options collection="TiposBajaLista" property="codigo" labelProperty="descripcion" /></html:select></td>              
           </logic:equal>
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='E' >
              <td colspan="1"><html:select name="DocumentosForm" property="ddo_codofiactual" disabled="false">
              <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion" /></html:select></td>              
           </logic:equal>           
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='T' >
              <td colspan="1"><html:select name="DocumentosForm" property="ddo_codofiactual" disabled="false">
              <html:options collection="OficinasLista" property="codigo" labelProperty="descripcion" /></html:select></td>              
           </logic:equal>                                   
         </tr>
      </logic:equal>
      <logic:notEqual name="DocumentosForm" property = "opcion" value="5" >
      <logic:iterate name="DetDocumentosLista" id="lista">
        <tr class="T8a">
           <td colspan="3"><html:hidden name="lista" property="item" />
           <bean:write name="lista" property="codrubactual" />
           <bean:write name="lista" property="descripcion_activo" /></td>
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='B' >
            <td><bean:write name="lista" property="descripcion_codmot" /></td>
           </logic:equal>
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='E' >
            <td><bean:write name="lista" property="descripcion_codmot" /></td>
           </logic:equal>           
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='T' >
            <td><bean:write name="lista" property="descripcion_codmot" /></td>
           </logic:equal>            
           <logic:notEqual name="DocumentosForm" property = "opcion" value="3" >
             <td>
               <logic:equal name="DocumentosForm" property = "opcion" value="10" >
                 <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=7;opcion.value=10;salir.value=0"/>
               </logic:equal>
               <logic:equal name="DocumentosForm" property = "opcion" value="11" >
                 <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=7;opcion.value=11;salir.value=0"/>
               </logic:equal>
               <logic:equal name="DocumentosForm" property = "opcion" value="1" >
                 <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=7;opcion.value=1;salir.value=0"/>
               </logic:equal>
               <logic:equal name="DocumentosForm" property = "opcion" value="2" >
                 <html:submit value="Eliminar" styleClass="boton1" indexed="true" property="boton" onclick="operacion.value=7;opcion.value=2;salir.value=0"/>
               </logic:equal>
             </td>
           </logic:notEqual>
        </tr>
      </logic:iterate>
      </logic:notEqual>
      <logic:equal name="DocumentosForm" property = "opcion" value="11" >
        <tr>
          <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1;salir.value=1" /></td>
        </tr>
      </logic:equal>
      <logic:equal name="DocumentosForm" property = "opcion" value="10" >
        <tr>
          <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1;salir.value=1" /></td>
        </tr>
      </logic:equal>
      <logic:equal name="DocumentosForm" property = "opcion" value="1" >
        <tr>
           <td align="right"><html:submit value="Validar" styleClass="boton1" property="boton" onclick="operacion.value=1;opcion.value=6;salir.value=0" /></td>
           <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1;salir.value=1" /></td>
        </tr>
      </logic:equal>
      <logic:equal name="DocumentosForm" property = "opcion" value="2" >
        <tr>
           <td align="right"><html:submit value="Validar" styleClass="boton1" property="boton" onclick="operacion.value=1;opcion.value=6;salir.value=0" /></td>
           <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1;salir.value=1" /></td>
        </tr>
      </logic:equal>
      <logic:equal name="DocumentosForm" property = "opcion" value="6" >
        <tr>
           <td colspan="3"><html:hidden property="ddo_item" name="DocumentosForm" /><html:hidden property="ddo_codmot" name="DocumentosForm" /><html:hidden property="ddo_codofiactual" name="DocumentosForm" />
           <html:text readonly="true" property="ddo_codrubactual" name="DocumentosForm" size="10" /><html:text readonly="true" property="desactivo" name="DocumentosForm" size="100" /></td>
           <logic:equal name="DocumentosForm" property = "doc_tipdoc" value='B' >
             <td colspan="1"><html:text readonly="true" property="desbaja" name="DocumentosForm" size="20" /></td>
           </logic:equal>  
           <logic:notEqual name="DocumentosForm" property = "doc_tipdoc" value='B' >
             <td colspan="1"><html:text readonly="true" property="desofi" name="DocumentosForm" size="60" /></td>
           </logic:notEqual> 
           </tr>
           <logic:notEqual name="DocumentosForm" property = "desactivo" value="NO Existe Activo" >
             <tr><td align="right"><html:submit value="Insertar" styleClass="boton1" property="boton" onclick="operacion.value=1;opcion.value=1;salir.value=0" /></td>          
             <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=2;opcion.value=1;salir.value=1" /></td>
           </logic:notEqual>  
        </tr>
      </logic:equal>
      <logic:equal name="DocumentosForm" property = "opcion" value="3" >
        <tr>
          <td align="right"><html:submit value="Eliminar" styleClass="boton1" property="boton" onclick="operacion.value=1;opcion.value=3;salir.value=0" /></td>
          <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=4;opcion.value=3;salir.value=1" /></td>
        </tr>
      </logic:equal>
      <logic:equal name="DocumentosForm" property = "opcion" value="4" >
        <tr>
          <td align="right"><html:submit value="Confirmar" styleClass="boton1" property="boton" onclick="operacion.value=1;opcion.value=4;salir.value=0" /></td>
          <td align="left"><html:submit value="Salir" styleClass="boton1" property="boton" onclick="operacion.value=4;opcion.value=4;salir.value=1" /></td>
        </tr>
      </logic:equal>      
   </logic:equal>
</html:form>
<logic:notEqual name="DocumentosForm" property = "opcion" value="5" >
  <tr><td align="center" colspan="2" class="S10d">(*) Campos Obligatorios</td></tr>
</logic:notEqual>
</table>
</body>
</html>