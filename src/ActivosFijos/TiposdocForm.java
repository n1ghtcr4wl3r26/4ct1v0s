package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class TiposdocForm extends ActionForm 
{
  String tdo_codigo;
  String tdo_descripcion;
  String tdo_feccie;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
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

  public String getTdo_codigo()
  {
    return tdo_codigo;
  }

  public void setTdo_codigo(String newTdo_codigo)
  {
    tdo_codigo = newTdo_codigo;
  }

  public String getTdo_descripcion()
  {
    return tdo_descripcion;
  }

  public void setTdo_descripcion(String newTdo_descripcion)
  {
    tdo_descripcion = newTdo_descripcion;
  }

  public String getTdo_feccie()
  {
    return tdo_feccie;
  }

  public void setTdo_feccie(String newTdo_feccie)
  {
    tdo_feccie = newTdo_feccie;
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
}