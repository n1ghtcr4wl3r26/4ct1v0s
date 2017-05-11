package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class SectiposdocForm extends ActionForm 
{
  String std_codfin;
  String std_codreg;
  String std_tipdoc;
  int std_numero;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String descripcion_codreg;
  String descripcion_codfin;
  String descripcion_tipdoc;
  String std_gestion;
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

  public String getStd_codreg()
  {
    return std_codreg;
  }

  public void setStd_codreg(String newStd_codreg)
  {
    std_codreg = newStd_codreg;
  }

  public String getStd_codfin()
  {
    return std_codfin;
  }

  public void setStd_codfin(String newStd_codfin)
  {
    std_codfin = newStd_codfin;
  }

  public String getStd_tipdoc()
  {
    return std_tipdoc;
  }

  public void setStd_tipdoc(String newStd_tipdoc)
  {
    std_tipdoc = newStd_tipdoc;
  }

  public int getStd_numero()
  {
    return std_numero;
  }

  public void setStd_numero(int newStd_numero)
  {
    std_numero = newStd_numero;
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

  public String getDescripcion_codfin()
  {
    return descripcion_codfin;
  }

  public void setDescripcion_codfin(String newDescripcion_codfin)
  {
    descripcion_codfin = newDescripcion_codfin;
  }

  public String getDescripcion_tipdoc()
  {
    return descripcion_tipdoc;
  }

  public void setDescripcion_tipdoc(String newDescripcion_tipdoc)
  {
    descripcion_tipdoc = newDescripcion_tipdoc;
  }

  public String getStd_gestion()
  {
    return std_gestion;
  }

  public void setStd_gestion(String newStd_gestion)
  {
    std_gestion = newStd_gestion;
  }
}