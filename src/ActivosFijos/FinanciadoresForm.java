package ActivosFijos;
import java.io.IOException;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import javax.servlet.http.HttpServletRequest;
import javax.*;

public class FinanciadoresForm extends ActionForm 
{
  private String fin_codigo;
  private String fin_descripcion;
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
    /*System.out.println("Ingreso a Validate");
    ActionErrors errors = new ActionErrors();

    if (getFin_codigo()==null || getFin_codigo().length() < 1) {
       System.out.println("Ingreso a Validate Fin_codigo NULL");
       errors.add("error",new ActionMessage("Debe introducir Codigo de Financiador"));
    }
    if (getFin_descripcion()==null || getFin_descripcion().length() < 1) {
       System.out.println("Ingreso a Validate Fin_descripcion NULL");
       errors.add("error",new ActionMessage("Debe introducir Descripcion de Financiador"));
    }
    return errors;*/
    return super.validate(mapping, request);
  }

  public String getFin_codigo()
  {
    return fin_codigo;
  }

  public void setFin_codigo(String newFin_codigo)
  {
    fin_codigo = newFin_codigo;
  }

  public String getFin_descripcion()
  {
    return fin_descripcion;
  }

  public void setFin_descripcion(String newFin_descripcion)
  {
    fin_descripcion = newFin_descripcion;
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