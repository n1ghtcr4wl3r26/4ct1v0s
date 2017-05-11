package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class GruposForm extends ActionForm 
{
  String grp_codigo;
  String grp_descripcion;
  String grp_codrub;
  String grp_estado;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
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

  public String getGrp_codigo()
  {
    return grp_codigo;
  }

  public void setGrp_codigo(String newGrp_codigo)
  {
    grp_codigo = newGrp_codigo;
  }

  public String getGrp_descripcion()
  {
    return grp_descripcion;
  }

  public void setGrp_descripcion(String newGrp_descripcion)
  {
    grp_descripcion = newGrp_descripcion;
  }

  public String getGrp_codrub()
  {
    return grp_codrub;
  }

  public void setGrp_codrub(String newGrp_codrub)
  {
    grp_codrub = newGrp_codrub;
  }

  public String getGrp_estado()
  {
    return grp_estado;
  }

  public void setGrp_estado(String newGrp_estado)
  {
    grp_estado = newGrp_estado;
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

  public String getDescripcion_codrub()
  {
    return descripcion_codrub;
  }

  public void setDescripcion_codrub(String newDescripcion_codrub)
  {
    descripcion_codrub = newDescripcion_codrub;
  }
}