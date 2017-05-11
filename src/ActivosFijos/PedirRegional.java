package ActivosFijos;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.MessageResources;

import java.lang.String;

import java.util.ArrayList;
import java.util.Locale;


public class PedirRegional extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
      try {
         InicioForm fInicio = (InicioForm)form;
         BDConection bdc = new BDConection();
         String desreg = bdc.DescripcionRegional(fInicio.getCod_reg());
         fInicio.setRegional(desreg.toUpperCase());
         String desfin = bdc.DescripcionFinanciador(fInicio.getCod_fin());
         fInicio.setFinanciador(desfin.toUpperCase());
         return mapping.findForward("menu");
      }
      catch( Exception e )
      {
         return (mapping.findForward("menu"));
      }      
  }
}