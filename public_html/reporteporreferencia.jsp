<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<%@ page import="java.sql.*, oracle.jdbc.driver.*, java.util.*, ActivosFijos.*, java.text.*" %>
<%
  BDConection dc = new BDConection();
  Connection cn = null;
  ResultSet rs = null;
  CallableStatement call = null;
  try {
    NumberFormat formatter = new DecimalFormat("###,###,##0.00");
    cn = dc.getConexion();
    call = cn.prepareCall("{? = call pg_activos.reporteactivos(1) }");
    call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
    call.execute();
    rs = (ResultSet) call.getObject(1);
%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
   <meta http-equiv="Expires" content="-1">
   <link href="Estilos.css" rel="stylesheet" type="text/css">
</head>
<body>
<html:link href="paginamenu.do">
Volver
</html:link>
<center><h2>Listado de Activos Fijos por Referencia</h2></center>
<table width="90%" border="1" cellpadding="0" cellspacing="0" style="font-size:10px">
  <tr class="FondoAzul10">
  <td align="center">Código</td>
  <td align="center">Código Anterior</td>
  <td colspan="2" align="center">Descripción</td>
  <td align="center">Estado</td>
  <td align="center">Ubi. Fisica</td>
  <td align="center">Responsable</td>
  </tr>
<%
   int pnum=0;
   while (rs.next()){ 
  if (pnum==1) {%>
     <tr class="suave">
  <% } else { %>
     <tr>
  <% } %>
  <td align="left"><%= rs.getString("act_codigo") %></td>
  <td align="left"><%= rs.getString("act_codanterior") %></td>
  <td align="left"><%= rs.getString("grp_descripcion") %></td>
  <td align="left"><%= rs.getString("act_descripcion") %></td>
  <td align="center"><%= rs.getString("act_estado") %></td>
  <td align="center"><%= rs.getString("ubi_descripcion") %></td>
  <td align="left"><%= rs.getString("fun_descripcion") %></td>
  </tr>
  <%if (pnum==0) pnum=1; else pnum=0;  
  }%>
</table>
</body>
</html>
  <%}
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

