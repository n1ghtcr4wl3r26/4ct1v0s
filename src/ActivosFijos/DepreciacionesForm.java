package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class DepreciacionesForm extends ActionForm 
{
  String dpr_fecha;
  double dpr_tipcamini;
  double dpr_tipcamfin;
  double dpr_tipufvini;
  double dpr_tipufvfin;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;  
  String mes;
  String anio;
  String dep_codrub;
  String dep_codreg;
  String cod_inicial;
  String cod_final;
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

  public String getDpr_fecha()
  {
    return dpr_fecha;
  }

  public void setDpr_fecha(String newDpr_fecha)
  {
    dpr_fecha = newDpr_fecha;
  }

  public double getDpr_tipcamini()
  {
    return dpr_tipcamini;
  }

  public void setDpr_tipcamini(double newDpr_tipcamini)
  {
    dpr_tipcamini = newDpr_tipcamini;
  }

  public double getDpr_tipcamfin()
  {
    return dpr_tipcamfin;
  }

  public void setDpr_tipcamfin(double newDpr_tipcamfin)
  {
    dpr_tipcamfin = newDpr_tipcamfin;
  }

  public double getDpr_tipufvini()
  {
    return dpr_tipufvini;
  }

  public void setDpr_tipufvini(double newDpr_tipufvini)
  {
    dpr_tipufvini = newDpr_tipufvini;
  }

  public double getDpr_tipufvfin()
  {
    return dpr_tipufvfin;
  }

  public void setDpr_tipufvfin(double newDpr_tipufvfin)
  {
    dpr_tipufvfin = newDpr_tipufvfin;
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

  public String getMes()
  {
    return mes;
  }

  public void setMes(String newMes)
  {
    mes = newMes;
  }

  public String getAnio()
  {
    return anio;
  }

  public void setAnio(String newAnio)
  {
    anio = newAnio;
  }

  public String getDep_codrub()
  {
    return dep_codrub;
  }

  public void setDep_codrub(String newDep_codrub)
  {
    dep_codrub = newDep_codrub;
  }

  public String getDep_codreg()
  {
    return dep_codreg;
  }

  public void setDep_codreg(String newDep_codreg)
  {
    dep_codreg = newDep_codreg;
  }

  public String getCod_inicial()
  {
    return cod_inicial;
  }

  public void setCod_inicial(String newCod_inicial)
  {
    cod_inicial = newCod_inicial;
  }

  public String getCod_final()
  {
    return cod_final;
  }

  public void setCod_final(String newCod_final)
  {
    cod_final = newCod_final;
  }

}
