package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ReporteDepreciacionesForm extends ActionForm 
{
  String dpr_codrub;
  String dpr_codreg;
  int dpr_codigo;
  int dpr_numrevaluo;
  int dpr_numdepreciacion;
  String dpr_fecha;
  double dpr_tipcam;
  double dpr_tipufv;
  double dpr_factorbol;
  double dpr_factordol;
  double dpr_factorufv;
  double dpr_actuvalbol;
  double dpr_actuvaldol;
  double dpr_actuvalufv;
  double dpr_actufacbol;
  double dpr_actufacdol;
  double dpr_actufacufv;
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

  public String getDpr_codrub()
  {
    return dpr_codrub;
  }

  public void setDpr_codrub(String newDpr_codrub)
  {
    dpr_codrub = newDpr_codrub;
  }

  public String getDpr_codreg()
  {
    return dpr_codreg;
  }

  public void setDpr_codreg(String newDpr_codreg)
  {
    dpr_codreg = newDpr_codreg;
  }

  public int getDpr_codigo()
  {
    return dpr_codigo;
  }

  public void setDpr_codigo(int newDpr_codigo)
  {
    dpr_codigo = newDpr_codigo;
  }

  public int getDpr_numrevaluo()
  {
    return dpr_numrevaluo;
  }

  public void setDpr_numrevaluo(int newDpr_numrevaluo)
  {
    dpr_numrevaluo = newDpr_numrevaluo;
  }

  public int getDpr_numdepreciacion()
  {
    return dpr_numdepreciacion;
  }

  public void setDpr_numdepreciacion(int newDpr_numdepreciacion)
  {
    dpr_numdepreciacion = newDpr_numdepreciacion;
  }

  public String getDpr_fecha()
  {
    return dpr_fecha;
  }

  public void setDpr_fecha(String newDpr_fecha)
  {
    dpr_fecha = newDpr_fecha;
  }

  public double getDpr_tipcam()
  {
    return dpr_tipcam;
  }

  public void setDpr_tipcam(double newDpr_tipcam)
  {
    dpr_tipcam = newDpr_tipcam;
  }

  public double getDpr_tipufv()
  {
    return dpr_tipufv;
  }

  public void setDpr_tipufv(double newDpr_tipufv)
  {
    dpr_tipufv = newDpr_tipufv;
  }

  public double getDpr_factorbol()
  {
    return dpr_factorbol;
  }

  public void setDpr_factorbol(double newDpr_factorbol)
  {
    dpr_factorbol = newDpr_factorbol;
  }

  public double getDpr_factordol()
  {
    return dpr_factordol;
  }

  public void setDpr_factordol(double newDpr_factordol)
  {
    dpr_factordol = newDpr_factordol;
  }

  public double getDpr_factorufv()
  {
    return dpr_factorufv;
  }

  public void setDpr_factorufv(double newDpr_factorufv)
  {
    dpr_factorufv = newDpr_factorufv;
  }

  public double getDpr_actuvalbol()
  {
    return dpr_actuvalbol;
  }

  public void setDpr_actuvalbol(double newDpr_actuvalbol)
  {
    dpr_actuvalbol = newDpr_actuvalbol;
  }

  public double getDpr_actuvaldol()
  {
    return dpr_actuvaldol;
  }

  public void setDpr_actuvaldol(double newDpr_actuvaldol)
  {
    dpr_actuvaldol = newDpr_actuvaldol;
  }

  public double getDpr_actuvalufv()
  {
    return dpr_actuvalufv;
  }

  public void setDpr_actuvalufv(double newDpr_actuvalufv)
  {
    dpr_actuvalufv = newDpr_actuvalufv;
  }

  public double getDpr_actufacbol()
  {
    return dpr_actufacbol;
  }

  public void setDpr_actufacbol(double newDpr_actufacbol)
  {
    dpr_actufacbol = newDpr_actufacbol;
  }

  public double getDpr_actufacdol()
  {
    return dpr_actufacdol;
  }

  public void setDpr_actufacdol(double newDpr_actufacdol)
  {
    dpr_actufacdol = newDpr_actufacdol;
  }

  public double getDpr_actufacufv()
  {
    return dpr_actufacufv;
  }

  public void setDpr_actufacufv(double newDpr_actufacufv)
  {
    dpr_actufacufv = newDpr_actufacufv;
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
