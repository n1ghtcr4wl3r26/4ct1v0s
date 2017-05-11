package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class DetDocumentosDetalleForm extends ActionForm 
{
  String codfin;
  String codreg;
  String tipdoc;
  int numero;
  int item;
  String codrubactual;
  String codregactual;
  int codigo;
  String descripcion_rubro;
  String codesactivo;
  String descripcion_activo;
  String codmot;
  String descripcion_codmot;
  String codofiactual;
  String descripcion_codofiactual;
  String codanterior;
  String estado;
  String codgrp;

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

  public String getcodreg()
  {
    return codreg;
  }

  public void setcodreg(String newCodreg)
  {
    codreg = newCodreg;
  }

  public String getcodfin()
  {
    return codfin;
  }

  public void setcodfin(String newCodfin)
  {
    codfin = newCodfin;
  }

  public String gettipdoc()
  {
    return tipdoc;
  }

  public void settipdoc(String newTipdoc)
  {
    tipdoc = newTipdoc;
  }

  public int getnumero()
  {
    return numero;
  }

  public void setnumero(int newNumero)
  {
    numero = newNumero;
  }

  public int getitem()
  {
    return item;
  }

  public void setitem(int newItem)
  {
    item = newItem;
  }

  public String getcodrubactual()
  {
    return codrubactual;
  }

  public void setcodrubactual(String newCodrubactual)
  {
    codrubactual = newCodrubactual;
  }

  public String getcodregactual()
  {
    return codregactual;
  }

  public void setcodregactual(String newCodregactual)
  {
    codregactual = newCodregactual;
  }

  public int getcodigo()
  {
    return codigo;
  }

  public void setcodigo(int newCodigo)
  {
    codigo = newCodigo;
  }

  public String getCodesactivo()
  {
    return codesactivo;
  }

  public void setCodesactivo(String newCodesactivo)
  {
    codesactivo = newCodesactivo;
  }
  
  public String getDescripcion_activo()
  {
    return descripcion_activo;
  }

  public void setDescripcion_activo(String newDescripcion_activo)
  {
    descripcion_activo = newDescripcion_activo;
  }

 public String getDescripcion_rubro()
  {
    return descripcion_rubro;
  }

  public void setDescripcion_rubro(String newDescripcion_rubro)
  {
    descripcion_rubro = newDescripcion_rubro;
  }

  public String getCodmot()
  {
    return codmot;
  }

  public void setCodmot(String newCodmot)
  {
    codmot = newCodmot;
  }

  public String getDescripcion_codmot()
  {
    return descripcion_codmot;
  }

  public void setDescripcion_codmot(String newDescripcion_codmot)
  {
    descripcion_codmot = newDescripcion_codmot;
  }

  public String getCodofiactual()
  {
    return codofiactual;
  }

  public void setCodofiactual(String newCodofiactual)
  {
    codofiactual = newCodofiactual;
  }

  public String getDescripcion_codofiactual()
  {
    return descripcion_codofiactual;
  }

  public void setDescripcion_codofiactual(String newDescripcion_codofiactual)
  {
    descripcion_codofiactual = newDescripcion_codofiactual;
  }

  public String getCodanterior()
  {
    return codanterior;
  }

  public void setCodanterior(String newCodanterior)
  {
    codanterior = newCodanterior;
  }

  public String getEstado()
  {
    return estado;
  }

  public void setEstado(String newEstado)
  {
    estado = newEstado;
  }

  public String getCodgrp()
  {
    return codgrp;
  }

  public void setCodgrp(String newCodgrp)
  {
    codgrp = newCodgrp;
  }

}