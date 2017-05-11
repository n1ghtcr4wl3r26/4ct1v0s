package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class OficinasForm extends ActionForm 
{
  String ofi_codigo;
  String ofi_descripcion;
  String ofi_codreg;
  String ofi_codubi;  
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String descripcion_codreg;
  String descripcion_codubi;
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

  public String getOfi_codigo()
  {
    return ofi_codigo;
  }

  public void setOfi_codigo(String newOfi_codigo)
  {
    ofi_codigo = newOfi_codigo;
  }

  public String getOfi_descripcion()
  {
    return ofi_descripcion;
  }

  public void setOfi_descripcion(String newOfi_descripcion)
  {
    ofi_descripcion = newOfi_descripcion;
  }

  public String getOfi_codreg()
  {
    return ofi_codreg;
  }

  public void setOfi_codreg(String newOfi_codreg)
  {
    ofi_codreg = newOfi_codreg;
  }

  public String getOfi_codubi()
  {
    return ofi_codubi;
  }

  public void setOfi_codubi(String newOfi_codubi)
  {
    ofi_codubi = newOfi_codubi;
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

  public String getDescripcion_codubi()
  {
    return descripcion_codubi;
  }

  public void setDescripcion_codubi(String newDescripcion_codubi)
  {
    descripcion_codubi = newDescripcion_codubi;
  }
}