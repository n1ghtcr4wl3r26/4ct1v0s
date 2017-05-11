package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class SecbarrasForm extends ActionForm 
{
  String bar_rubro;
  String bar_codreg;
  int bar_numero;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String descripcion_codreg;
  String descripcion_codrub;
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

  public String getBar_rubro()
  {
    return bar_rubro;
  }

  public void setBar_rubro(String newBar_rubro)
  {
    bar_rubro = newBar_rubro;
  }

  public String getBar_codreg()
  {
    return bar_codreg;
  }

  public void setBar_codreg(String newBar_codreg)
  {
    bar_codreg = newBar_codreg;
  }

  public int getBar_numero()
  {
    return bar_numero;
  }

  public void setBar_numero(int newBar_numero)
  {
    bar_numero = newBar_numero;
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

  public String getDescripcion_codrub()
  {
    return descripcion_codrub;
  }

  public void setDescripcion_codrub(String newDescripcion_codrub)
  {
    descripcion_codrub = newDescripcion_codrub;
  }
}