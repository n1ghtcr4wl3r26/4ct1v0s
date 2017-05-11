<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<%@ page import="java.util.Iterator"%>

<tiles:useAttribute id="list" name="list" classname="java.util.List" />

<%
  Iterator i=list.iterator();
  while( i.hasNext() ) {
   String name= (String)i.next();
%>
  <tiles:insert name="<%= name %>" flush="true" />
  <br>
<%
  } // end loop
%>