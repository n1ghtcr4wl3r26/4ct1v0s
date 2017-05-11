package aduana.app.struts.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.tiles.TilesRequestProcessor;
import org.apache.struts.util.MessageResources;

public class CustomController extends TilesRequestProcessor {
  public CustomController() {
  }

  protected boolean processRoles(HttpServletRequest request, 
                                 HttpServletResponse response, 
                                 ActionMapping mapping)
                          throws ServletException, IOException {
    String[] roles = mapping.getRoleNames();

    if ((roles == null) || (roles.length < 1)) {
      return true;
    }

    String rol = request.getSession().getAttribute("user.perfil").toString();

    if (!(rol == null || rol.equals(""))) {
      for (int i = 0; i < roles.length; i++) {
        if (rol.equals(roles[i])) {
          return true;
        }
      }
    }

    response.sendError(400, 
                       getInternal()
                         .getMessage("notAuthorized", mapping.getPath()));

    return false;
  }

  public void process(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
    super.process(request, response);
  }
}