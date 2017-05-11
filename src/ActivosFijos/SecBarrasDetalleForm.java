package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class SecBarrasDetalleForm extends ActionForm 
{
  String rubro;
  String codreg;
  int numero;
  String codreg_descripcion;
  String codrub_descripcion;
  String fecalta;

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

  public String getRubro()
  {
    return rubro;
  }

  public void setRubro(String newRubro)
  {
    rubro = newRubro;
  }

  public String getCodreg()
  {
    return codreg;
  }

  public void setCodreg(String newCodreg)
  {
    codreg = newCodreg;
  }

  public int getNumero()
  {
    return numero;
  }

  public void setNumero(int newNumero)
  {
    numero = newNumero;
  }

  public String getCodreg_descripcion()
  {
    return codreg_descripcion;
  }

  public void setCodreg_descripcion(String newCodreg_descripcion)
  {
    codreg_descripcion = newCodreg_descripcion;
  }

  public String getCodrub_descripcion()
  {
    return codrub_descripcion;
  }

  public void setCodrub_descripcion(String newCodrub_descripcion)
  {
    codrub_descripcion = newCodrub_descripcion;
  }

  public String getFecalta()
  {
    return fecalta;
  }

  public void setFecalta(String newFecalta)
  {
    fecalta = newFecalta;
  }
}