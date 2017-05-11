package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AccesoriosForm extends ActionForm 
{
  String acc_codrub;
  String acc_codreg;
  int acc_codigo;
  String acc_codrubact;
  String acc_codregact;
  int acc_codigoact;
  String acc_codgrp;
  String acc_codmot;
  String acc_feccompra;
  double acc_tipcam;
  double acc_tipufv;
  String acc_umanejo;
  String acc_descripcion;
  String acc_desadicional;
  String acc_proveedor;
  String acc_marca;
  String acc_modelo;
  String acc_serie1;
  String acc_serie2;
  String acc_fecreferencia;
  double acc_valcobol;
  double acc_valcodol;
  double acc_valcoufv;
  String acc_fecbaja;
  String acc_docbaja;
  String acc_ordencompra;
  int acc_numfactura;
  int acc_numcomprobante;
  String acc_codanterior;
  String acc_indetiqueta;
  String acc_docreferencia;
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

  public String getAcc_codrub()
  {
    return acc_codrub;
  }

  public void setAcc_codrub(String newAcc_codrub)
  {
    acc_codrub = newAcc_codrub;
  }

  public String getAcc_codreg()
  {
    return acc_codreg;
  }

  public void setAcc_codreg(String newAcc_codreg)
  {
    acc_codreg = newAcc_codreg;
  }

  public int getAcc_codigo()
  {
    return acc_codigo;
  }

  public void setAcc_codigo(int newAcc_codigo)
  {
    acc_codigo = newAcc_codigo;
  }

  public String getAcc_codrubact()
  {
    return acc_codrubact;
  }

  public void setAcc_codrubact(String newAcc_codrubant)
  {
    acc_codrubact = newAcc_codrubant;
  }

  public String getAcc_codregact()
  {
    return acc_codregact;
  }

  public void setAcc_codregact(String newAcc_codregact)
  {
    acc_codregact = newAcc_codregact;
  }

  public int getAcc_codigoact()
  {
    return acc_codigoact;
  }

  public void setAcc_codigoact(int newAcc_codigoact)
  {
    acc_codigoact = newAcc_codigoact;
  }

  public String getAcc_codgrp()
  {
    return acc_codgrp;
  }

  public void setAcc_codgrp(String newAcc_codgrp)
  {
    acc_codgrp = newAcc_codgrp;
  }

  public String getAcc_codmot()
  {
    return acc_codmot;
  }

  public void setAcc_codmot(String newAcc_codmot)
  {
    acc_codmot = newAcc_codmot;
  }

  public String getAcc_feccompra()
  {
    return acc_feccompra;
  }

  public void setAcc_feccompra(String newAcc_feccompra)
  {
    acc_feccompra = newAcc_feccompra;
  }

  public double getAcc_tipcam()
  {
    return acc_tipcam;
  }

  public void setAcc_tipcam(double newAcc_tipcam)
  {
    acc_tipcam = newAcc_tipcam;
  }

  public double getAcc_tipufv()
  {
    return acc_tipufv;
  }

  public void setAcc_tipufv(double newAcc_tipufv)
  {
    acc_tipufv = newAcc_tipufv;
  }

  public String getAcc_umanejo()
  {
    return acc_umanejo;
  }

  public void setAcc_umanejo(String newAcc_umanejo)
  {
    acc_umanejo = newAcc_umanejo;
  }

  public String getAcc_descripcion()
  {
    return acc_descripcion;
  }

  public void setAcc_descripcion(String newAcc_descripcion)
  {
    acc_descripcion = newAcc_descripcion;
  }

  public String getAcc_desadicional()
  {
    return acc_desadicional;
  }

  public void setAcc_desadicional(String newAcc_desadicional)
  {
    acc_desadicional = newAcc_desadicional;
  }

  public String getAcc_proveedor()
  {
    return acc_proveedor;
  }

  public void setAcc_proveedor(String newAcc_proveedor)
  {
    acc_proveedor = newAcc_proveedor;
  }

  public String getAcc_marca()
  {
    return acc_marca;
  }

  public void setAcc_marca(String newAcc_marca)
  {
    acc_marca = newAcc_marca;
  }

  public String getAcc_modelo()
  {
    return acc_modelo;
  }

  public void setAcc_modelo(String newAcc_modelo)
  {
    acc_modelo = newAcc_modelo;
  }

  public String getAcc_serie1()
  {
    return acc_serie1;
  }

  public void setAcc_serie1(String newAcc_serie1)
  {
    acc_serie1 = newAcc_serie1;
  }

  public String getAcc_serie2()
  {
    return acc_serie2;
  }

  public void setAcc_serie2(String newAcc_serie2)
  {
    acc_serie2 = newAcc_serie2;
  }

  public String getAcc_fecreferencia()
  {
    return acc_fecreferencia;
  }

  public void setAcc_fecreferencia(String newAcc_fecreferencia)
  {
    acc_fecreferencia = newAcc_fecreferencia;
  }

  public double getAcc_valcobol()
  {
    return acc_valcobol;
  }

  public void setAcc_valcobol(double newAcc_valcobol)
  {
    acc_valcobol = newAcc_valcobol;
  }

  public double getAcc_valcodol()
  {
    return acc_valcodol;
  }

  public void setAcc_valcodol(double newAcc_valcodol)
  {
    acc_valcodol = newAcc_valcodol;
  }

  public double getAcc_valcoufv()
  {
    return acc_valcoufv;
  }

  public void setAcc_valcoufv(double newAcc_valcoufv)
  {
    acc_valcoufv = newAcc_valcoufv;
  }

  public String getAcc_fecbaja()
  {
    return acc_fecbaja;
  }

  public void setAcc_fecbaja(String newAcc_fecbaja)
  {
    acc_fecbaja = newAcc_fecbaja;
  }

  public String getAcc_docbaja()
  {
    return acc_docbaja;
  }

  public void setAcc_docbaja(String newAcc_docbaja)
  {
    acc_docbaja = newAcc_docbaja;
  }

  public String getAcc_ordencompra()
  {
    return acc_ordencompra;
  }

  public void setAcc_ordencompra(String newAcc_ordencompra)
  {
    acc_ordencompra = newAcc_ordencompra;
  }

  public int getAcc_numfactura()
  {
    return acc_numfactura;
  }

  public void setAcc_numfactura(int newAcc_numfactura)
  {
    acc_numfactura = newAcc_numfactura;
  }

  public int getAcc_numcomprobante()
  {
    return acc_numcomprobante;
  }

  public void setAcc_numcomprobante(int newAcc_numcomprobante)
  {
    acc_numcomprobante = newAcc_numcomprobante;
  }

  public String getAcc_codanterior()
  {
    return acc_codanterior;
  }

  public void setAcc_codanterior(String newAcc_codanterior)
  {
    acc_codanterior = newAcc_codanterior;
  }

  public String getAcc_indetiqueta()
  {
    return acc_indetiqueta;
  }

  public void setAcc_indetiqueta(String newAcc_indetiqueta)
  {
    acc_indetiqueta = newAcc_indetiqueta;
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

  public String getAcc_docreferencia()
  {
    return acc_docreferencia;
  }

  public void setAcc_docreferencia(String newAcc_docreferencia)
  {
    acc_docreferencia = newAcc_docreferencia;
  }
}