<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<table border="1" cellpadding="0" cellspacing="0" width="100%" bgcolor="#30509A">
  <tr> 
    <td align="center">
        <FONT color="#FFFFF" face="Arial, Helvetica, san-serif" size=4  > 
             Sistema de Activos Fijos  
        </FONT> 
    </td>
  </tr>
</table>  
<table border="0" cellpadding="0" cellspacing="0" width="100%" >
  <tr valign="middle"> 
    <td align="left">
      <FONT color="#000066" face="Arial, Helvetica, san-serif" size=2 > 
          <bean:write name="InicioForm" property="regional"/> 
      </FONT>    
    </td>
    <td align="left">
      <FONT color="#000066" face="Arial, Helvetica, san-serif" size=2 > 
          <bean:write name="InicioForm" property="financiador"/> 
      </FONT>    
    </td>
    <td align="right">
      <FONT color="#000066" face="Arial, Helvetica, san-serif" size=2 > 
          <bean:write name="InicioForm" property="nombreUsuario"/> 
      </FONT>    
    </td>
    <td align="center"> 
      <FONT color="#000066" face="Arial, Helvetica, san-serif" size=2> 
        <em> 
          <html:link href="paginamenu.do">Menu Principal
          </html:link> 
        </em>
      </FONT>
    </td>
  </tr>
</table>
<hr>