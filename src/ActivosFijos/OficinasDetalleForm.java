package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class OficinasDetalleForm extends ActionForm 
{
  String codigo;
  String descripcion;
  String codreg;
  String codubi;  
  String descripcion_codreg;
  String descripcion_codubi;

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

  public String getCodreg()
  {
    return codreg;
  }

  public void setCodreg(String newCodreg)
  {
    codreg = newCodreg;
  }

  public String getCodubi()
  {
    return codubi;
  }

  public void setCodubi(String newCodubi)
  {
    codubi = newCodubi;
  }

  public String getDescripcion_codreg()
  {
    return descripcion_codreg;
  }

  public void setDescripcion_codreg(String newDescripcion_codreg)
  {
    descripcion_codreg = newDescripcion_codreg;
  }

  public String getDescripcion_codubi()
  {
    return descripcion_codubi;
  }

  public void setDescripcion_codubi(String newDescripcion_codubi)
  {
    descripcion_codubi = newDescripcion_codubi;
  }

}