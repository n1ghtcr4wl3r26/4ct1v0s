package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class TipocambioForm extends ActionForm 
{
  String tca_fecha;
  double tca_tipcam;
  double tca_tipufv;
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

  public String getTca_fecha()
  {
    return tca_fecha;
  }

  public void setTca_fecha(String newTca_fecha)
  {
    tca_fecha = newTca_fecha;
  }

  public double getTca_tipcam()
  {
    return tca_tipcam;
  }

  public void setTca_tipcam(double newTca_tipcam)
  {
    tca_tipcam = newTca_tipcam;
  }

  public double getTca_tipufv()
  {
    return tca_tipufv;
  }

  public void setTca_tipufv(double newTca_tipufv)
  {
    tca_tipufv = newTca_tipufv;
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