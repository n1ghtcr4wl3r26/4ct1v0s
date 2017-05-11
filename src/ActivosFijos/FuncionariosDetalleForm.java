package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class FuncionariosDetalleForm extends ActionForm 
{
  String codigo;
  String descripcion;
  String cargo;
  String codofi;
  String codreg;  
  String codfin;  
  String descripcion_codofi;
  String descripcion_codreg;
  String descripcion_codfin;
  String correo;
  String estado;

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

  public String getCargo()
  {
    return cargo;
  }

  public void setCargo(String newCargo)
  {
    cargo = newCargo;
  }

  public String getCodofi()
  {
    return codofi;
  }

  public void setCodofi(String newCodofi)
  {
    codofi = newCodofi;
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

  public String getDescripcion_codofi()
  {
    return descripcion_codofi;
  }

  public void setDescripcion_codofi(String newDescripcion_codofi)
  {
    descripcion_codofi = newDescripcion_codofi;
  }

  public String getDescripcion_codreg()
  {
    return descripcion_codreg;
  }

  public void setDescripcion_codreg(String newDescripcion_codreg)
  {
    descripcion_codreg = newDescripcion_codreg;
  }

  public String getDescripcion_codfin()
  {
    return descripcion_codfin;
  }

  public void setDescripcion_codfin(String newDescripcion_codfin)
  {
    descripcion_codfin = newDescripcion_codfin;
  }

  public String getCorreo()
  {
    return correo;
  }

  public void setCorreo(String newCorreo)
  {
    correo = newCorreo;
  }
  public String getEstado()
  {
    return estado;
  }

  public void setEstado(String newEstado)
  {
    estado = newEstado;
  }
}