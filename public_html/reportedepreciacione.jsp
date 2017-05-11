<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<%@ page import="java.sql.*, oracle.jdbc.driver.*, java.util.*, ActivosFijos.*, java.text.*" %>
<%
  BDConection dc = new BDConection();
  String vcondicion1 = (String) session.getAttribute("condicion1");
  String vcondicion2 = (String) session.getAttribute("condicion2");
  String vcod_inicial = (String) session.getAttribute("cod_inicial");
  String vcod_final = (String) session.getAttribute("cod_final");
  Connection cn = null;
  ResultSet rs = null;
  CallableStatement call = null;
  try {
    NumberFormat formatter4 = new DecimalFormat("###,###,##0.0000");
    NumberFormat formatter5 = new DecimalFormat("###,###,##0.00000");
    cn = dc.getConexion();
    call = cn.prepareCall("{? = call pg_activos.reportedepreciacion(?,?,?,?) }");
    call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
    call.setString(2,vcondicion1);
    call.setString(3,vcondicion2);
    call.setString(4,vcod_inicial);
    call.setString(5,vcod_final);
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
<html:link href="depreciaciones.do">
Volver
</html:link>
<center><h2>Inventario General de Activos Fijos</h2></center>
<center><h2>(Expresado en bolivianos)</h2></center>
<table width="90%" border="1" cellpadding="0" cellspacing="0" style="font-size:10px">
  <tr class="FondoAzul10">
  <td align="center">Activo</td>
  <td align="center">Descripción</td>
  <td align="center">Resto Util</td>
  <td align="center">Vida Util</td>
  <td align="center">Fecha Activación</td>
  <td align="center">Fecha Depreciación</td>
  <td align="center">UFV Ini</td>
  <td align="center">UFV final</td>
  <td align="center">Valor</td>
  <td align="center">Actualización</td>
  <td align="center">Valor Actualización</td>
  <td align="center">Depreciación Mes Anterior</td>  
  <td align="center">Depreciación</td>  
  <td align="center">Actualización</td>
  <td align="center">Depreciación Actualización</td>
  <td align="center">Valor Neto</td>
  </tr>
<%
   String pcodigo="99999999";
   int pnum=0;
   double valbol=0;
   double facbol=0;
   double depvalbol=0;
   double depfacbol=0;
   double depfactordol=0;
   while (rs.next()){
   if (rs.getDouble("dep_actuvalbol")-rs.getDouble("dep_actufacdol")==0) {
      depfactordol=rs.getDouble("dep_factordol")-1;
   } 
   else {
      depfactordol=rs.getDouble("dep_factordol");
   }
   if ((!pcodigo.equals(rs.getString("codigo")))&&(!pcodigo.equals("99999999"))) {
   %>
   <tr>
   <td colspan="9">Sub Total : </td>
   <td align="right"><%= formatter4.format(valbol) %></td>
   <td></td>
   <td></td>
   <td align="right"><%= formatter4.format(depvalbol) %></td>
   <td align="right"><%= formatter4.format(facbol) %></td>
   <td align="right"><%= formatter4.format(depfacbol) %></td>
   <td></td>
   </tr>
   <% 
      valbol=0;
      facbol=0;
      depvalbol=0;
      depfacbol=0;  
   } %>
  <% if (pnum==1) {%>
     <tr class="suave">
  <% } else { %>
     <tr>
  <% } 
  String ceros=null;
  if (rs.getInt("dep_codigo")<10000)
     ceros="0";
  if (rs.getInt("dep_codigo")<1000)
     ceros="00";
  if (rs.getInt("dep_codigo")<100)
     ceros="000";
  if (rs.getInt("dep_codigo")<10)
     ceros="0000";  
  %>
  <td align="cwnter"><%= rs.getString("dep_codrub") %>-<%= rs.getString("dep_codreg") %>-<%= ceros %><%= rs.getString("dep_codigo") %></td>
  <td align="right"><%= rs.getString("act_descripcion") %></td>
  <td align="right"><%= rs.getInt("rev_vidaut")-rs.getInt("dep_numdepreciacion") %></td>
  <td align="right"><%= rs.getInt("rev_vidaut") %></td>
  <td align="center"><%= rs.getString("rev_fecha") %></td>
  <td align="center"><%= rs.getString("dep_fecha") %></td>
  <td align="right"><%= formatter5.format(rs.getDouble("dep_tipufvini")) %></td>
  <td align="right"><%= formatter5.format(rs.getDouble("dep_tipufvfin")) %></td>
  
  <td align="right"><%= formatter4.format(rs.getDouble("dep_actuvalbol")-rs.getDouble("dep_factorbol")) %></td>  
  <td align="right"><%= formatter4.format(rs.getDouble("dep_factorbol")) %></td>
  <td align="right"><%= formatter4.format(rs.getDouble("dep_actuvalbol")) %></td>  
  <td align="right"><%= formatter4.format(rs.getDouble("dep_actufacdol")-rs.getDouble("dep_actufacbol")-depfactordol) %></td>
  
  <td align="right"><%= formatter4.format(rs.getDouble("dep_actufacbol")) %></td>
  <td align="right"><%= formatter4.format(depfactordol) %></td>
  <td align="right"><%= formatter4.format(rs.getDouble("dep_actufacdol")) %></td>
  <td align="right"><%= formatter4.format(rs.getDouble("dep_actuvalbol")-rs.getDouble("dep_actufacdol"))%></td>  
  </tr>
  <% pcodigo=rs.getString("codigo");
   if (pnum==0) pnum=1; else pnum=0;
   valbol=valbol+rs.getDouble("dep_factorbol");
   depvalbol=depvalbol+rs.getDouble("dep_actufacbol");
   facbol=facbol+depfactordol;
   depfacbol=depfacbol+rs.getDouble("dep_actufacdol");
   }%>
   <tr>
   <td colspan="9">Sub Total : </td>
   <td align="right"><%= formatter4.format(valbol) %></td>   
   <td></td>
   <td></td>   
   <td align="right"><%= formatter4.format(depvalbol) %></td>   
   <td align="right"><%= formatter4.format(facbol) %></td>   
   <td align="right"><%= formatter4.format(depfacbol) %></td>   
   <td></td>
   </tr>
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

