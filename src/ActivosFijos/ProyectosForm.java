package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ProyectosForm extends ActionForm 
{
  String pry_codigo;
  String pry_descripcion;
  String pry_codfin;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String descripcion_codfin;
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

  public String getPry_codigo()
  {
    return pry_codigo;
  }

  public void setPry_codigo(String newPry_codigo)
  {
    pry_codigo = newPry_codigo;
  }

  public String getPry_descripcion()
  {
    return pry_descripcion;
  }

  public void setPry_descripcion(String newPry_descripcion)
  {
    pry_descripcion = newPry_descripcion;
  }

  public String getPry_codfin()
  {
    return pry_codfin;
  }

  public void setPry_codfin(String newPry_codfin)
  {
    pry_codfin = newPry_codfin;
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

  public String getDescripcion_codfin()
  {
    return descripcion_codfin;
  }

  public void setDescripcion_codfin(String newDescripcion_codfin)
  {
    descripcion_codfin = newDescripcion_codfin;
  }
}