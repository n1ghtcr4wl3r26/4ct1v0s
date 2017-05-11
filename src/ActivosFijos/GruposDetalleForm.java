package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class GruposDetalleForm extends ActionForm 
{
  String codigo;
  String descripcion;
  String codrub;
  String estado;
  String codrub_descripcion;

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

  public String getCodrub()
  {
    return codrub;
  }

  public void setCodrub(String newCodrub)
  {
    codrub = newCodrub;
  }

  public String getEstado()
  {
    return estado;
  }

  public void setEstado(String newEstado)
  {
    estado = newEstado;
  }

  public String getCodrub_descripcion()
  {
    return codrub_descripcion;
  }

  public void setCodrub_descripcion(String newCodrub_descripcion)
  {
    codrub_descripcion = newCodrub_descripcion;
  }
}