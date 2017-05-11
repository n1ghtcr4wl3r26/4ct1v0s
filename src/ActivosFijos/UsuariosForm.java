package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class UsuariosForm extends ActionForm 
{
  String usu_codigo;
  String usu_carnet;
  String usu_codfun;
  String dsc_funcionario;
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

  public String getUsu_codigo()
  {
    return usu_codigo;
  }

  public void setUsu_codigo(String newUsu_codigo)
  {
    usu_codigo = newUsu_codigo;
  }

  public String getUsu_carnet()
  {
    return usu_carnet;
  }

  public void setUsu_carnet(String newUsu_carnet)
  {
    usu_carnet = newUsu_carnet;
  }

  public String getUsu_codfun()
  {
    return usu_codfun;
  }

  public void setUsu_codfun(String newUsu_codfun)
  {
    usu_codfun = newUsu_codfun;
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

  public String getDsc_funcionario()
  {
    return dsc_funcionario;
  }

  public void setDsc_funcionario(String newDsc_funcionario)
  {
    dsc_funcionario = newDsc_funcionario;
  }

}