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
    NumberFormat formatter = new DecimalFormat("###,###,##0.0000");
    cn = dc.getConexion();
    call = cn.prepareCall("{? = call pg_activos.reportedepreciacion_d() }");
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
<center><h2>Inventario General de Activos Fijos</h2></center>
<center><h2>(Expresado en Bolivianos)</h2></center>
<table width="90%" border="1" cellpadding="0" cellspacing="0" style="font-size:10px">
  <tr class="FondoAzul10">
  <td align="center">Unidad</td>
  <td align="center">Código</td>
  <td align="center">Detalle</td>
  <td align="center">Vida Util</td>
  <td align="center">Resto Util</td>
  <td align="center">Fecha Activación</td>
  <td align="center">Valor Adquisición</td>
  <td align="center">Valor Original<br>Gestion Anterior</td>
  <td align="center">Actualizaciones<br>Valores<br>Gestión Actual</td>
  <td align="center">Valor Original<br>Gestion Actual</td>
  <td align="center">Actualización</td>
  <td align="center">Depreciación<br>Acumulada Gestión Anterior</td>  
  <td align="center">Depreciación Gestión Actual</td>  
  <td align="center">Actualizaciones<br>Valores<br>Gestión Actual</td>
  <td align="center">Depreciación<br>Acumulada<br>Gestión Actual</td>  
  <td align="center">Valor Residual</td>
  </tr>
<%
   String pcodigo="99999999";
   int pnum=0;
   double valor1=0;
   double valor2=0;
   double valor3=0;
   double valor4=0;
   double valor5=0;
   double valor6=0;
   double valor7=0;
   double valor8=0;
   double valor9=0;
   while (rs.next()){ 
   if ((!pcodigo.equals(rs.getString("unidad")))&&(!pcodigo.equals("99999999"))) {
   %>
   <tr>
   <td colspan="5">Sub Total : </td>
   <td></td>
   <td></td>
   <td></td>
   <td></td>
   <td></td>
   <td align="right"><%= formatter.format(valor1) %></td>   
   <td align="right"><%= formatter.format(valor2) %></td>   
   <td align="right"><%= formatter.format(valor3) %></td>   
   <td align="right"><%= formatter.format(valor4) %></td>   
   <td align="right"><%= formatter.format(valor5) %></td>   
   <td align="right"><%= formatter.format(valor6) %></td>   
   <td align="right"><%= formatter.format(valor7) %></td>   
   <td align="right"><%= formatter.format(valor8) %></td>   
   <td align="right"><%= formatter.format(valor9) %></td>   
   </tr>
   <% 
      valor1=0;
      valor2=0;
      valor3=0;
      valor4=0;
      valor5=0;
      valor6=0;
      valor7=0;
      valor8=0;
      valor9=0;
   } %>
  <% if (pnum==1) {%>
     <tr class="suave">
  <% } else { %>
     <tr>
  <% } %>
  <td align="cwnter"><%= rs.getString("unidad") %></td>
  <td align="right"><%= rs.getString("codigo") %></td>
  <td align="right"><%= rs.getString("detalle") %></td>
  <td align="right"><%= rs.getInt("vida_util") %></td>
  <td align="center"><%= rs.getString("fecha_activacion") %></td>
  <td align="right"><%= formatter.format(rs.getDouble("valor_adquisicion")) %></td>
  <td align="right"><%= formatter.format(rs.getDouble("valor_original_2004")) %></td>  
  <td align="right"><%= formatter.format(rs.getDouble("actualizacion_valores_2004")) %></td>  
  <td align="right"><%= formatter.format(rs.getDouble("valor_original_2004")+rs.getDouble("actualizacion_valores_2004")) %></td>
  <td align="right"><%= formatter.format(rs.getDouble("depreciacion_acumulada_2004")) %></td>  
  <td align="right"><%= formatter.format(rs.getDouble("depreciacion_2005")) %></td>
  <td align="right"><%= formatter.format(rs.getDouble("actualizacion_valores_2005")) %></td>
  <td align="right"><%= formatter.format(rs.getDouble("depreciacion_acumulada_2004")+rs.getDouble("depreciacion_2005")+rs.getDouble("actualizacion_valores_2005")) %></td>
  <td align="right"><%= formatter.format(rs.getDouble("valor_original_2004")+rs.getDouble("actualizacion_valores_2004")-rs.getDouble("depreciacion_acumulada_2004")+rs.getDouble("depreciacion_2005")+rs.getDouble("actualizacion_valores_2005")) %></td>
  </tr>
  <% pcodigo=rs.getString("unidad");
    if (pnum==0) pnum=1; else pnum=0;
    valor1=valor1 + rs.getDouble("valor_adquisicion");
    valor2=valor2 + rs.getDouble("valor_original_2004");
    valor3=valor3 + rs.getDouble("actualizacion_valores_2004");  
    valor4=valor4 + rs.getDouble("valor_original_2004")+rs.getDouble("actualizacion_valores_2004");
    valor5=valor5 + rs.getDouble("depreciacion_acumulada_2004");
    valor6=valor6 + rs.getDouble("depreciacion_2005");
    valor7=valor7 + rs.getDouble("actualizacion_valores_2005");
    valor8=valor8 + rs.getDouble("depreciacion_acumulada_2004")+rs.getDouble("depreciacion_2005")+rs.getDouble("actualizacion_valores_2005");
    valor9=valor9 + rs.getDouble("valor_original_2004")+rs.getDouble("actualizacion_valores_2004")-rs.getDouble("depreciacion_acumulada_2004")+rs.getDouble("depreciacion_2005")+rs.getDouble("actualizacion_valores_2005");
   }%>
   <tr>
   <td colspan="5">Sub Total : </td>
   <td></td>
   <td></td>
   <td></td>
   <td></td>
   <td></td>
   <td align="right"><%= formatter.format(valor1) %></td>   
   <td align="right"><%= formatter.format(valor2) %></td>   
   <td align="right"><%= formatter.format(valor3) %></td>   
   <td align="right"><%= formatter.format(valor4) %></td>   
   <td align="right"><%= formatter.format(valor5) %></td>   
   <td align="right"><%= formatter.format(valor6) %></td>   
   <td align="right"><%= formatter.format(valor7) %></td>   
   <td align="right"><%= formatter.format(valor8) %></td>   
   <td align="right"><%= formatter.format(valor9) %></td>   
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

