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
    call = cn.prepareCall("{? = call pg_activos.reportedepreciacion() }");
    call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
    call.execute();
    rs = (ResultSet) call.getObject(1);
%>
<style type="text/css">
<!--
TD.cabecera {
	COLOR: #FFFFFF;
	FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif;
	FONT-SIZE: 10px;
	TEXT-ALIGN: left;
}
tr.borde {
	FONT-SIZE: 8px;
	TEXT-DECORATION: none;
	FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif;  
	border: 2px groove #0066CC;
}
table {
	font-size: 12px;
	font-family: Arial, Helvetica, sans-serif;
}
H1.SaltoDePagina
 {
     PAGE-BREAK-AFTER: always
 }
-->
</style>
<table width="90%" border="1" cellpadding="0" cellspacing="0">
  <tr>
  <td><bean:message property="reportedepreciacion.codrub" /></td>
  <td><bean:message property="reportedepreciacion.codreg" /></td>
  <td><bean:message property="reportedepreciacion.codigo" /></td>
  <td><bean:message property="reportedepreciacion.numrevaluo" /></td>
  <td><bean:message property="reportedepreciacion.numdepreciacion" /></td>
  <td><bean:message property="reportedepreciacion.fecha" /></td>
  <td><bean:message property="reportedepreciacion.tipcam" /></td>
  <td><bean:message property="reportedepreciacion.tipufv" /></td>
  <td><bean:message property="reportedepreciacion.factorbol" /></td>
  <td><bean:message property="reportedepreciacion.factordol" /></td>
  <td><bean:message property="reportedepreciacion.factorufv" /></td>
  <td><bean:message property="reportedepreciacion.actuvalbol" /></td>
  <td><bean:message property="reportedepreciacion.actuvaldol" /></td>
  <td><bean:message property="reportedepreciacion.actuvalufv" /></td>
  <td><bean:message property="reportedepreciacion.actufacbol" /></td>
  <td><bean:message property="reportedepreciacion.actufacdol" /></td>
  <td><bean:message property="reportedepreciacion.actufacufv" /></td>
  </tr>
<%
   while (rs.next()){
%>
  <tr>
  <td><%= rs.getString("dep_codrub") %></td>
  <td><%= rs.getString("dep_codreg") %></td>
  <td><%= rs.getString("dep_codigo") %></td>  
  <td><%= rs.getString("dep_numrevaluo") %></td>
  <td><%= rs.getString("dep_numdepreciacion") %></td>
  <td><%= rs.getString("dep_fecha") %></td>
  <td><%= rs.getString("dep_tipcam") %></td>
  <td><%= rs.getString("dep_tipufv") %></td>  
  <td><%= rs.getString("dep_factorbol") %></td>
  <td><%= rs.getString("dep_factordol") %></td>
  <td><%= rs.getString("dep_factorufv") %></td>  
  <td><%= rs.getString("dep_actuvalbol") %></td>
  <td><%= rs.getString("dep_actuvaldol") %></td>
  <td><%= rs.getString("dep_Actuvalufv") %></td>
  <td><%= rs.getString("dep_acufacbol") %></td>
  <td><%= rs.getString("dep_acufacdol") %></td>  
  <td><%= rs.getString("dep_acufacufv") %></td>  
  </tr>
</table>
<H1 class="SaltoDePagina"> </H1>
  <%
  }
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

