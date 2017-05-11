package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class FuncionariosForm extends ActionForm 
{
  String fun_codigo;
  String fun_descripcion;
  String fun_cargo;
  String fun_codofi;
  String fun_codreg;
  String fun_codfin;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;  
  String descripcion_codreg;
  String descripcion_codfin;
  String descripcion_codofi;
  String fun_correo;
  String fun_estado;

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

  public String getFun_codigo()
  {
    return fun_codigo;
  }

  public void setFun_codigo(String newFun_codigo)
  {
    fun_codigo = newFun_codigo;
  }

  public String getFun_descripcion()
  {
    return fun_descripcion;
  }

  public void setFun_descripcion(String newFun_descripcion)
  {
    fun_descripcion = newFun_descripcion;
  }

  public String getFun_cargo()
  {
    return fun_cargo;
  }

  public void setFun_cargo(String newFun_cargo)
  {
    fun_cargo = newFun_cargo;
  }

  public String getFun_codofi()
  {
    return fun_codofi;
  }

  public void setFun_codofi(String newFun_codofi)
  {
    fun_codofi = newFun_codofi;
  }

  public String getFun_codreg()
  {
    return fun_codreg;
  }

  public void setFun_codreg(String newFun_codreg)
  {
    fun_codreg = newFun_codreg;
  }

  public String getFun_codfin()
  {
    return fun_codfin;
  }

  public void setFun_codfin(String newFun_codfin)
  {
    fun_codfin = newFun_codfin;
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

  public String getDescripcion_codofi()
  {
    return descripcion_codofi;
  }

  public void setDescripcion_codofi(String newDescripcion_codofi)
  {
    descripcion_codofi = newDescripcion_codofi;
  }

  public String getDescripcion_codfin()
  {
    return descripcion_codfin;
  }

  public void setDescripcion_codfin(String newDescripcion_codfin)
  {
    descripcion_codfin = newDescripcion_codfin;
  }

  public String getFun_correo()
  {
    return fun_correo;
  }

  public void setFun_correo(String newFun_correo)
  {
    fun_correo = newFun_correo;
  }
  
  public String getFun_estado()
  {
    return fun_estado;
  }

  public void setFun_estado(String newFun_estado)
  {
    fun_estado = newFun_estado;
  }
}
