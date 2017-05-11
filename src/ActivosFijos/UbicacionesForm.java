package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class UbicacionesForm extends ActionForm 
{
  String ubi_codigo;
  String ubi_descripcion;
  String ubi_direccion;
  String ubi_codreg;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String descripcion_codreg;
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

  public String getUbi_codigo()
  {
    return ubi_codigo;
  }

  public void setUbi_codigo(String newUbi_codigo)
  {
    ubi_codigo = newUbi_codigo;
  }

  public String getUbi_descripcion()
  {
    return ubi_descripcion;
  }

  public void setUbi_descripcion(String newUbi_descripcion)
  {
    ubi_descripcion = newUbi_descripcion;
  }

  public String getUbi_direccion()
  {
    return ubi_direccion;
  }

  public void setUbi_direccion(String newUbi_direccion)
  {
    ubi_direccion = newUbi_direccion;
  }

  public String getUbi_codreg()
  {
    return ubi_codreg;
  }

  public void setUbi_codreg(String newUbi_codreg)
  {
    ubi_codreg = newUbi_codreg;
  }

  public String getBoton()
  {
    return boton;
  }

  public void setBoton(String newBoton)
  {
    boton = newBoton;
  }

  public String getBoton(int index)
  {
    return boton;
  }

  public void setBoton(int index, String newBoton)
  {
    boton = newBoton;
    fila = index;
  }  
  public int getFila()
  {
    return fila;
  }

  public void setFila(int newFila)
  {
    fila = newFila;
  }

  public int getOperacion()
  {
    return operacion;
  }

  public void setOperacion(int newOperacion)
  {
    operacion = newOperacion;
  }

  public int getOpcion()
  {
    return opcion;
  }

  public void setOpcion(int newOpcion)
  {
    opcion = newOpcion;
  }

  public String getDescripcion_codreg()
  {
    return descripcion_codreg;
  }

  public void setDescripcion_codreg(String newDescripcion_codreg)
  {
    descripcion_codreg = newDescripcion_codreg;
  }
}