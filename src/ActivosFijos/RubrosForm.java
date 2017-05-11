package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class RubrosForm extends ActionForm 
{
  String rub_codigo;
  String rub_descripcion;
  int rub_vidaut;
  double rub_porcen;
  String rub_codpar;
  String rub_ctadep;
  String rub_ctadac;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
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

  public String getRub_codigo()
  {
    return rub_codigo;
  }

  public void setRub_codigo(String newRub_codigo)
  {
    rub_codigo = newRub_codigo;
  }

  public String getRub_descripcion()
  {
    return rub_descripcion;
  }

  public void setRub_descripcion(String newRub_descripcion)
  {
    rub_descripcion = newRub_descripcion;
  }

  public int getRub_vidaut()
  {
    return rub_vidaut;
  }

  public void setRub_vidaut(int newRub_vidaut)
  {
    rub_vidaut = newRub_vidaut;
  }

  public double getRub_porcen()
  {
    return rub_porcen;
  }

  public void setRub_porcen(double newRub_porcen)
  {
    rub_porcen = newRub_porcen;
  }

  public String getRub_codpar()
  {
    return rub_codpar;
  }

  public void setRub_codpar(String newRub_codpar)
  {
    rub_codpar = newRub_codpar;
  }

  public String getRub_ctadep()
  {
    return rub_ctadep;
  }

  public void setRub_ctadep(String newRub_ctadep)
  {
    rub_ctadep = newRub_ctadep;
  }

  public String getRub_ctadac()
  {
    return rub_ctadac;
  }

  public void setRub_ctadac(String newRub_ctadac)
  {
    rub_ctadac = newRub_ctadac;
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

  public String getDescripcion_codpar()
  {
    return descripcion_codpar;
  }

  public void setDescripcion_codpar(String newDescripcion_codpar)
  {
    descripcion_codpar = newDescripcion_codpar;
  }
}