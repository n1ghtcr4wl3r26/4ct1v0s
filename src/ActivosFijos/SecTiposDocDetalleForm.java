package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class SecTiposDocDetalleForm extends ActionForm 
{
  String codfin;
  String codreg;
  String tipdoc;
  int numero;
  String codreg_descripcion;
  String codfin_descripcion;
  String tipdoc_descripcion;
  String gestion;

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

  public String getCodreg()
  {
    return codreg;
  }

  public void setCodreg(String newCodreg)
  {
    codreg = newCodreg;
  }

  public String getCodfin()
  {
    return codfin;
  }

  public void setCodfin(String newCodfin)
  {
    codfin = newCodfin;
  }

  public String getTipdoc()
  {
    return tipdoc;
  }

  public void setTipdoc(String newTipdoc)
  {
    tipdoc = newTipdoc;
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

  public String getCodfin_descripcion()
  {
    return codfin_descripcion;
  }

  public void setCodfin_descripcion(String newCodfin_descripcion)
  {
    codfin_descripcion = newCodfin_descripcion;
  }

  public String getTipdoc_descripcion()
  {
    return tipdoc_descripcion;
  }

  public void setTipdoc_descripcion(String newTipdoc_descripcion)
  {
    tipdoc_descripcion = newTipdoc_descripcion;
  }

  public String getGestion()
  {
    return gestion;
  }

  public void setGestion(String newGestion)
  {
    gestion = newGestion;
  }
}