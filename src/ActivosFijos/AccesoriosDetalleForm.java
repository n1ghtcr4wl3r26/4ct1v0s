package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AccesoriosDetalleForm extends ActionForm 
{
  String codrub;
  String codreg;
  int codigo;
  String codrubact;
  String codregact;
  int codigoact;
  String codgrp;
  String codmot;
  String feccompra;
  double tipcam;
  double tipufv;
  String umanejo;
  String descripcion;
  String desadicional;
  String proveedor;
  String marca;
  String modelo;
  String serie1;
  String serie2;
  String fecreferencia;
  double valcobol;
  double valcodol;
  double valcoufv;
  String fecbaja;
  String docbaja;
  String ordencompra;
  int numfactura;
  int numcomprobante;
  String codanterior;
  String indetiqueta;
  String docreferencia;

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

  public String getCodrub()
  {
    return codrub;
  }

  public void setCodrub(String newcodrub)
  {
    codrub = newcodrub;
  }

  public String getCodreg()
  {
    return codreg;
  }

  public void setCodreg(String newcodreg)
  {
    codreg = newcodreg;
  }

  public int getCodigo()
  {
    return codigo;
  }

  public void setCodigo(int newcodigo)
  {
    codigo = newcodigo;
  }

  public String getCodrubact()
  {
    return codrubact;
  }

  public void setCodrubact(String newcodrubant)
  {
    codrubact = newcodrubant;
  }

  public String getCodregact()
  {
    return codregact;
  }

  public void setCodregact(String newcodregact)
  {
    codregact = newcodregact;
  }

  public int getCodigoact()
  {
    return codigoact;
  }

  public void setCodigoact(int newcodigoact)
  {
    codigoact = newcodigoact;
  }

  public String getCodgrp()
  {
    return codgrp;
  }

  public void setCodgrp(String newcodgrp)
  {
    codgrp = newcodgrp;
  }

  public String getCodmot()
  {
    return codmot;
  }

  public void setCodmot(String newcodmot)
  {
    codmot = newcodmot;
  }

  public String getFeccompra()
  {
    return feccompra;
  }

  public void setFeccompra(String newfeccompra)
  {
    feccompra = newfeccompra;
  }

  public double getTipcam()
  {
    return tipcam;
  }

  public void setTipcam(double newtipcam)
  {
    tipcam = newtipcam;
  }

  public double getTipufv()
  {
    return tipufv;
  }

  public void setTipufv(double newtipufv)
  {
    tipufv = newtipufv;
  }

  public String getUmanejo()
  {
    return umanejo;
  }

  public void setUmanejo(String newumanejo)
  {
    umanejo = newumanejo;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion(String newdescripcion)
  {
    descripcion = newdescripcion;
  }

  public String getDesadicional()
  {
    return desadicional;
  }

  public void setDesadicional(String newdesadicional)
  {
    desadicional = newdesadicional;
  }

  public String getProveedor()
  {
    return proveedor;
  }

  public void setProveedor(String newproveedor)
  {
    proveedor = newproveedor;
  }

  public String getMarca()
  {
    return marca;
  }

  public void setMarca(String newmarca)
  {
    marca = newmarca;
  }

  public String getModelo()
  {
    return modelo;
  }

  public void setModelo(String newmodelo)
  {
    modelo = newmodelo;
  }

  public String getSerie1()
  {
    return serie1;
  }

  public void setSerie1(String newserie1)
  {
    serie1 = newserie1;
  }

  public String getSerie2()
  {
    return serie2;
  }

  public void setSerie2(String newserie2)
  {
    serie2 = newserie2;
  }

  public String getFecreferencia()
  {
    return fecreferencia;
  }

  public void setFecreferencia(String newfecreferencia)
  {
    fecreferencia = newfecreferencia;
  }

  public double getValcobol()
  {
    return valcobol;
  }

  public void setValcobol(double newvalcobol)
  {
    valcobol = newvalcobol;
  }

  public double getValcodol()
  {
    return valcodol;
  }

  public void setValcodol(double newvalcodol)
  {
    valcodol = newvalcodol;
  }

  public double getValcoufv()
  {
    return valcoufv;
  }

  public void setValcoufv(double newvalcoufv)
  {
    valcoufv = newvalcoufv;
  }

  public String getFecbaja()
  {
    return fecbaja;
  }

  public void setFecbaja(String newfecbaja)
  {
    fecbaja = newfecbaja;
  }

  public String getDocbaja()
  {
    return docbaja;
  }

  public void setDocbaja(String newdocbaja)
  {
    docbaja = newdocbaja;
  }

  public String getOrdencompra()
  {
    return ordencompra;
  }

  public void setOrdencompra(String newordencompra)
  {
    ordencompra = newordencompra;
  }

  public int getNumfactura()
  {
    return numfactura;
  }

  public void setNumfactura(int newnumfactura)
  {
    numfactura = newnumfactura;
  }

  public int getNumcomprobante()
  {
    return numcomprobante;
  }

  public void setNumcomprobante(int newnumcomprobante)
  {
    numcomprobante = newnumcomprobante;
  }

  public String getCodanterior()
  {
    return codanterior;
  }

  public void setCodanterior(String newcodanterior)
  {
    codanterior = newcodanterior;
  }

  public String getIndetiqueta()
  {
    return indetiqueta;
  }

  public void setIndetiqueta(String newindetiqueta)
  {
    indetiqueta = newindetiqueta;
  }

  public String getDocreferencia()
  {
    return docreferencia;
  }

  public void setDocreferencia(String newDocreferencia)
  {
    docreferencia = newDocreferencia;
  }

}