package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class InventariosDetalleForm extends ActionForm 
{

  String codbarra;
  String fecha;
  String codofi;
  String codfun;
  String codubi;
  String codfin;
  String codpry;
  String codreg;
  String estado;
  String mod;
  String codbarrad;
  String codfindes;
  String codfundes;
  String codofides;
  String codprydes;
  String codregdes;
  String codubides;
  String estadodes;

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

  public String getCodbarra()
  {
    return codbarra;
  }

  public void setCodbarra(String newCodbarra)
  {
    codbarra = newCodbarra;
  }

  public String getFecha()
  {
    return fecha;
  }

  public void setFecha(String newFecha)
  {
    fecha = newFecha;
  }

  public String getCodofi()
  {
    return codofi;
  }

  public void setCodofi(String newCodofi)
  {
    codofi = newCodofi;
  }

  public String getCodfun()
  {
    return codfun;
  }

  public void setCodfun(String newCodfun)
  {
    codfun = newCodfun;
  }

  public String getCodubi()
  {
    return codubi;
  }

  public void setCodubi(String newCodubi)
  {
    codubi = newCodubi;
  }

  public String getCodfin()
  {
    return codfin;
  }

  public void setCodfin(String newCodfin)
  {
    codfin = newCodfin;
  }

  public String getCodpry()
  {
    return codpry;
  }

  public void setCodpry(String newCodpry)
  {
    codpry = newCodpry;
  }

  public String getCodreg()
  {
    return codreg;
  }

  public void setCodreg(String newCodreg)
  {
    codreg = newCodreg;
  }

  public String getEstado()
  {
    return estado;
  }

  public void setEstado(String newEstado)
  {
    estado = newEstado;
  }

  public String getMod()
  {
    return mod;
  }

  public void setMod(String newMod)
  {
    mod = newMod;
  }

  public String getCodbarrad()
  {
    return codbarrad;
  }

  public void setCodbarrad(String newCodbarrad)
  {
    codbarrad = newCodbarrad;
  }

  public String getCodfindes()
  {
    return codfindes;
  }

  public void setCodfindes(String newCodfindes)
  {
    codfindes = newCodfindes;
  }

  public String getCodfundes()
  {
    return codfundes;
  }

  public void setCodfundes(String newCodfundes)
  {
    codfundes = newCodfundes;
  }

  public String getCodofides()
  {
    return codofides;
  }

  public void setCodofides(String newCodofides)
  {
    codofides = newCodofides;
  }

  public String getCodprydes()
  {
    return codprydes;
  }

  public void setCodprydes(String newCodprydes)
  {
    codprydes = newCodprydes;
  }

  public String getCodregdes()
  {
    return codregdes;
  }

  public void setCodregdes(String newCodregdes)
  {
    codregdes = newCodregdes;
  }

  public String getCodubides()
  {
    return codubides;
  }

  public void setCodubides(String newCodubides)
  {
    codubides = newCodubides;
  }

  public String getEstadodes()
  {
    return estadodes;
  }

  public void setEstadodes(String newEstadodes)
  {
    estadodes = newEstadodes;
  }

}