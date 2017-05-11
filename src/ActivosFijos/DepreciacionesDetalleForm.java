package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class DepreciacionesDetalleForm extends ActionForm 
{
  String fecha;
  double tipcam;
  double tipufv;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }
  
  public String getfecha()
  {
    return fecha;
  }

  public void setfecha(String newfecha)
  {
    fecha = newfecha;
  }

  public double gettipcam()
  {
    return tipcam;
  }

  public void settipcam(double newtipcam)
  {
    tipcam = newtipcam;
  }

  public double gettipufv()
  {
    return tipufv;
  }

  public void settipufv(double newtipufv)
  {
    tipufv = newtipufv;
  }

}