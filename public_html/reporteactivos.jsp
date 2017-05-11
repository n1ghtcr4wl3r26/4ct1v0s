<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<%@ page import="java.sql.*, oracle.jdbc.driver.*, java.util.*, ActivosFijos.*, java.text.*" %>
<%
  BDConection dc = new BDConection();
  ReportesForm repfom = (ReportesForm) session.getAttribute("ReportesSession");
  String vcondicion1 = repfom.getCondicion1();
  String vcondicion2 = repfom.getCondicion2();
  String vcod_reg    = repfom.getCod_reg();
  Connection cn = null;
  ResultSet rs = null;
  CallableStatement call = null;
  try {
    NumberFormat formatter = new DecimalFormat("###,###,##0.0000");
    cn = dc.getConexion();
    call = cn.prepareCall("{? = call pg_activos.reporteactivos(?,?,?,?) }");
    call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);%>
    <logic:equal name="ReportesForm" property = "opcion" value="1" >
    <%call.setString(2,vcondicion1);
    call.setString(3,"");
    call.setInt(4,1);
    call.setString(5,vcod_reg);%>
    </logic:equal>    
    <logic:equal name="ReportesForm" property = "opcion" value="2" >
    <%call.setString(2,vcondicion1);
    call.setString(3,"");
    call.setInt(4,2);
    call.setString(5,vcod_reg);%>
    </logic:equal>    
    <logic:equal name="ReportesForm" property = "opcion" value="3" >
    <%call.setString(2,vcondicion1);
    call.setString(3,"");
    call.setInt(4,3);
    call.setString(5,vcod_reg);%>
    </logic:equal>    
    <logic:equal name="ReportesForm" property = "opcion" value="4" >
    <%call.setString(2,vcondicion1);
    call.setString(3,vcondicion2);
    call.setInt(4,4);
    call.setString(5,vcod_reg);%>
    </logic:equal>    
    <% call.execute();
    rs = (ResultSet) call.getObject(1);%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <meta http-equiv="Expires" content="-1">
   <link href="Estilos.css" rel="stylesheet" type="text/css">
</head>
<body>
<html:link href="reportes.do">
Volver
</html:link>
<logic:equal name="ReportesForm" property = "opcion" value="1" >
  <center><h2>Listado de Activos Fijos por Referencia</h2></center>
  <h3>Referencia : <%= vcondicion1 %></h3>
</logic:equal>    
<logic:equal name="ReportesForm" property = "opcion" value="2" >
  <center><h2>Listado de Activos Fijos por Responsable</h2></center>
  <h3>Responsable : <%= vcondicion1 %></h3>
  <h4>Rubro : <%= vcondicion2 %></h4>
</logic:equal>    
<logic:equal name="ReportesForm" property = "opcion" value="3" >
  <center><h2>Listado de Activos Fijos por Ubicación</h2></center>
  <h3>Ubicación : <%= vcondicion1 %></h3>
</logic:equal>    
<logic:equal name="ReportesForm" property = "opcion" value="4" >
  <center><h2>Listado de Activos Fijos por Rango de Codigo</h2></center>
  <h3>De : <%= vcondicion1 %></h3>
  <h3>A  : <%= vcondicion2 %></h3>
</logic:equal>    

<table width="90%" border="1" cellpadding="0" cellspacing="0" style="font-size:10px">
  <tr class="FondoAzul10">
  <td align="center">Codigo</td>
  <td align="center">Código Anterior</td>
  <td align="center" colspan="2">Descripcion</td>
  <td align="center">Estado</td>
  <td align="center">Ubicacion</td>
  <td align="center">Responsable</td>
  <td align="center">Documento</td>
  </tr>
<%
   int pnum=0;
   String vdescripcion="9999999999";
   while (rs.next()){ 
   if (!(rs.getString("fun_descripcion").equals(vdescripcion))) {%>
      <tr>
        <td colspan="8"></td>
      </tr>
   <% vdescripcion=rs.getString("fun_descripcion");
   } %>

  <% if (pnum==1) {%>
     <tr class="suave">
  <% } else { %>
     <tr>
  <% } %>
  <td align="center"><%= rs.getString("act_codigo") %></td>
  <td align="left"><%= rs.getString("act_codanterior") %></td>
  <td align="left"><%= rs.getString("grp_descripcion") %></td>
  <td align="left"><%= rs.getString("act_descripcion") %></td>
  <td align="center"><%= rs.getString("act_estado") %></td>
  <td align="left"><%= rs.getString("ubi_descripcion") %></td>
  <td align="left"><%= rs.getString("fun_descripcion") %></td>
  <td align="left"><%= rs.getString("act_ultimo_doc") %></td>
  </tr>
  <% 
    if (pnum==0) pnum=1; else pnum=0;
   }%>
</table>
</body>
</html>
  <%
  }
  catch (SQLException e) 
  {
      e.printStackTrace();
  }
  finally 
  {
    try
    {
      if (rs != null)
      {
        rs.close();
        rs = null;
      }
      if (call != null) 
      {
        call.close();
        call = null;
      }
      if (cn != null) 
      {
        cn.close();
        cn = null;
      }
    } 
    catch (Exception ex) 
    {
        ;
    }
  }
%>

