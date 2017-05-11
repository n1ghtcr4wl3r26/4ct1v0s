package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class InventariosForm extends ActionForm 
{
  String inv_codbarra;
  String inv_fecha;
  String inv_codofi;
  String inv_codfun;
  String inv_codubi;
  String inv_codfin;
  String inv_codpry;
  String inv_codreg;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String Inv_regdescripcion;
  String Inv_findescripcion;
  String inv_estado;
  String inv_mod;
  String inv_codbarrad;
  String inv_codfindes;
  String inv_codfundes;
  String inv_codofides;
  String inv_codprydes;
  String inv_codregdes;
  String inv_codubides;
  String inv_estadodes;
  String actas;
  
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

  public String getInv_codbarra()
  {
    return inv_codbarra;
  }

  public void setInv_codbarra(String newInv_codbarra)
  {
    inv_codbarra = newInv_codbarra;
  }

  public String getInv_fecha()
  {
    return inv_fecha;
  }

  public void setInv_fecha(String newInv_fecha)
  {
    inv_fecha = newInv_fecha;
  }

  public String getInv_codofi()
  {
    return inv_codofi;
  }

  public void setInv_codofi(String newInv_codofi)
  {
    inv_codofi = newInv_codofi;
  }

  public String getInv_codfun()
  {
    return inv_codfun;
  }

  public void setInv_codfun(String newInv_codfun)
  {
    inv_codfun = newInv_codfun;
  }

  public String getInv_codubi()
  {
    return inv_codubi;
  }

  public void setInv_codubi(String newInv_codubi)
  {
    inv_codubi = newInv_codubi;
  }

  public String getInv_codfin()
  {
    return inv_codfin;
  }

  public void setInv_codfin(String newInv_codfin)
  {
    inv_codfin = newInv_codfin;
  }

  public String getInv_codpry()
  {
    return inv_codpry;
  }

  public void setInv_codpry(String newInv_codpry)
  {
    inv_codpry = newInv_codpry;
  }

  public String getInv_codreg()
  {
    return inv_codreg;
  }

  public void setInv_codreg(String newInv_codreg)
  {
    inv_codreg = newInv_codreg;
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

  public String getInv_regdescripcion()
  {
    return Inv_regdescripcion;
  }

  public void setInv_regdescripcion(String newInv_regdescripcion)
  {
    Inv_regdescripcion = newInv_regdescripcion;
  }

  public String getInv_findescripcion()
  {
    return Inv_findescripcion;
  }

  public void setInv_findescripcion(String newInv_findescripcion)
  {
    Inv_findescripcion = newInv_findescripcion;
  }

  public String getInv_estado()
  {
    return inv_estado;
  }

  public void setInv_estado(String newInv_estado)
  {
    inv_estado = newInv_estado;
  }

  public String getInv_mod()
  {
    return inv_mod;
  }

  public void setInv_mod(String newInv_mod)
  {
    inv_mod = newInv_mod;
  }

  public String getInv_codbarrad()
  {
    return inv_codbarrad;
  }

  public void setInv_codbarrad(String newInv_codbarrad)
  {
    inv_codbarrad = newInv_codbarrad;
  }

  public String getInv_codfindes()
  {
    return inv_codfindes;
  }

  public void setInv_codfindes(String newInv_codfindes)
  {
    inv_codfindes = newInv_codfindes;
  }

  public String getInv_codfundes()
  {
    return inv_codfundes;
  }

  public void setInv_codfundes(String newInv_codfundes)
  {
    inv_codfundes = newInv_codfundes;
  }

  public String getInv_codofides()
  {
    return inv_codofides;
  }

  public void setInv_codofides(String newInv_codofides)
  {
    inv_codofides = newInv_codofides;
  }

  public String getInv_codprydes()
  {
    return inv_codprydes;
  }

  public void setInv_codprydes(String newInv_codprydes)
  {
    inv_codprydes = newInv_codprydes;
  }

  public String getInv_codregdes()
  {
    return inv_codregdes;
  }

  public void setInv_codregdes(String newInv_codregdes)
  {
    inv_codregdes = newInv_codregdes;
  }

  public String getInv_codubides()
  {
    return inv_codubides;
  }

  public void setInv_codubides(String newInv_codubides)
  {
    inv_codubides = newInv_codubides;
  }

  public String getInv_estadodes()
  {
    return inv_estadodes;
  }

  public void setInv_estadodes(String newInv_estadodes)
  {
    inv_estadodes = newInv_estadodes;
  }
  public String getActas()
  {
    return actas;
  }
  public void setActas(String newActas)
  {
    actas = newActas;
  }
}
