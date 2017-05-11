<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<html:html>
  <head>
    <title><tiles:getAsString name="title"/></title>
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="cache-control" value="no-cache, no-store, must-revalidate">
    <meta http-equiv="Expires" content="-1">
    <meta name="Author" content="Donald Gemio" lang="es"> 
    <meta name="copyright" content="&copy; 2006, PMA CONSULT" lang="es">     
    <link rel="stylesheet" href="Estilos.css" type="text/css"/>
  </head>
  <script language="JavaScript" type="text/JavaScript">

  </script>
  <body bgcolor="#ffffff" text="#000000" link="#023264" alink="#023264" vlink="#023264" oncontextmenu="return false">
  
  <center>
    <table width=100% border="0" cellspacing="1">
      <tr>
        <td colspan="2" width=100%>
          <tiles:insert attribute="header" />
        </td>
      </tr>

      <tr>
        <td valign="top" width=18%>
          <tiles:insert attribute="menu"/>
        </td>

        <td valign="top" width=82%>
          <html:errors />
          <tiles:insert attribute="body" />
        </td>
      </tr>
      
      <tr>
        <td colspan="2" width=100%>
          <tiles:insert attribute="footer" />
        </td>
      </tr>
    </table>
  </center>

  </body>
</html:html>