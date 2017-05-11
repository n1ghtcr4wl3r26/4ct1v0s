package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class RegionalesForm extends ActionForm 
{
  String reg_codigo;
  String reg_descripcion;
  String reg_codfun;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String descripcion_codfun;

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

  public String getReg_codigo()
  {
    return reg_codigo;
  }

  public void setReg_codigo(String newReg_codigo)
  {
    reg_codigo = newReg_codigo;
  }

  public String getReg_descripcion()
  {
    return reg_descripcion;
  }

  public void setReg_descripcion(String newReg_descripcion)
  {
    reg_descripcion = newReg_descripcion;
  }

  public String getReg_codfun()
  {
    return reg_codfun;
  }

  public void setReg_codfun(String newReg_codfun)
  {
    reg_codfun = newReg_codfun;
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

  public String getDescripcion_codfun()
  {
    return descripcion_codfun;
  }

  public void setDescripcion_codfun(String newDescripcion_codfun)
  {
    descripcion_codfun = newDescripcion_codfun;
  }

}