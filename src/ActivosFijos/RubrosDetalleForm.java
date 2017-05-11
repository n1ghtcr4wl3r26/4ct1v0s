package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class RubrosDetalleForm extends ActionForm 
{
  String codigo;
  String descripcion;
  int vidaut;
  double porcen;
  String codpar;
  String ctadep;
  String ctadac;
  String descripcion_codpar;

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

  public String getCodigo()
  {
    return codigo;
  }

  public void setCodigo(String newCodigo)
  {
    codigo = newCodigo;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion(String newDescripcion)
  {
    descripcion = newDescripcion;
  }

  public int getVidaut()
  {
    return vidaut;
  }

  public void setVidaut(int newVidaut)
  {
    vidaut = newVidaut;
  }

  public double getPorcen()
  {
    return porcen;
  }

  public void setPorcen(double newPorcen)
  {
    porcen = newPorcen;
  }

  public String getCodpar()
  {
    return codpar;
  }

  public void setCodpar(String newCodpar)
  {
    codpar = newCodpar;
  }

  public String getCtadep()
  {
    return ctadep;
  }

  public void setCtadep(String newCtadep)
  {
    ctadep = newCtadep;
  }

  public String getCtadac()
  {
    return ctadac;
  }

  public void setCtadac(String newCtadac)
  {
    ctadac = newCtadac;
  }

  public String getDescripcion_codpar()
  {
    return descripcion_codpar;
  }

  public void setDescripcion_codpar(String newDescripcion_codpar)
  {
    descripcion_codpar = newDescripcion_codpar;
  }
}