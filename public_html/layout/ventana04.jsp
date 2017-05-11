<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="ActivosFijos.*;"%>

<tiles:importAttribute />

<table border="0" cellPadding="0" cellSpacing="2" class="menu" width="160">

  <logic:present name="title">
    <tr>
      <%--td background="imagen/bg_cabecera_menu.gif" class="cabecera_menu" height="25" width="100%"--%>
      <td class="cabecera_menu" height="25" width="100%">
        <strong> <tiles:getAsString name="title"/> </strong>
      </td>
    </tr>
  </logic:present>

  <%-- iterate on items list --%>
  <logic:iterate id="item" name="items" type="org.apache.struts.tiles.beans.MenuItem" >
    <%
      String link = item.getLink();
      if(link.startsWith("/") ) link = request.getContextPath() + link;

       String valor = item.getValue();
       InicioForm iform = (InicioForm) request.getSession().getAttribute("InicioForm");               
       ArrayList op = (ArrayList) iform.getOpciones();
       Iterator i = op.iterator();
       while (i.hasNext()) {	
              ClaseOpcion reg =	(ClaseOpcion) i.next();	
              String cod = reg.getNombre();       
              if ( valor.equals(cod))
              { %>
                <tr>
                   <td class="entrada_menu">
                      <a class="entrada_menu" href="<%=link%>">                  
                      <%
                        String res = reg.getDescripcion();
                        out.println(".: " + res); %>                                       
                      </a>
                   </td>
                </tr>
                   <%   
              }
               }
              %>            

  </logic:iterate>
</table>
