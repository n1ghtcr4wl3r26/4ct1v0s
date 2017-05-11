package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class MejorasRebajasForm extends ActionForm 
{
  int mre_codrub;
  String mre_codreg;
  String mre_codigo;
  String mre_inmejreb;
  String mre_codrubact;
  String mre_codregact;
  int mre_codigoact;
  String mre_codgrp;
  String mre_motbaj;
  String mre_fecha;
  double mre_tipcam;
  double mre_tipufv;
  String mre_descripcion;
  String mre_desadicional;
  String mre_proveedor;
  String mre_docreferencia;
  String mre_fecreferencia;
  double mre_valbol;
  double mre_valdol;
  double mre_valufv;
  String mre_fecbaja;
  String mre_docbaja;
  int mre_numfactura;
  String mre_numcomprobante;
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

  public int getMre_codrub()
  {
    return mre_codrub;
  }

  public void setMre_codrub(int newMre_codrub)
  {
    mre_codrub = newMre_codrub;
  }

  public String getMre_codreg()
  {
    return mre_codreg;
  }

  public void setMre_codreg(String newMre_codreg)
  {
    mre_codreg = newMre_codreg;
  }

  public String getMre_codigo()
  {
    return mre_codigo;
  }

  public void setMre_codigo(String newMre_codigo)
  {
    mre_codigo = newMre_codigo;
  }

  public String getMre_inmejreb()
  {
    return mre_inmejreb;
  }

  public void setMre_inmejreb(String newMre_inmejreb)
  {
    mre_inmejreb = newMre_inmejreb;
  }

  public String getMre_codrubact()
  {
    return mre_codrubact;
  }

  public void setMre_codrubact(String newMre_codrubact)
  {
    mre_codrubact = newMre_codrubact;
  }

  public String getMre_codregact()
  {
    return mre_codregact;
  }

  public void setMre_codregact(String newMre_codregact)
  {
    mre_codregact = newMre_codregact;
  }

  public int getMre_codigoact()
  {
    return mre_codigoact;
  }

  public void setMre_codigoact(int newMre_codigoact)
  {
    mre_codigoact = newMre_codigoact;
  }

  public String getMre_codgrp()
  {
    return mre_codgrp;
  }

  public void setMre_codgrp(String newMre_codgrp)
  {
    mre_codgrp = newMre_codgrp;
  }

  public String getMre_motbaj()
  {
    return mre_motbaj;
  }

  public void setMre_motbaj(String newMre_motbaj)
  {
    mre_motbaj = newMre_motbaj;
  }

  public String getMre_fecha()
  {
    return mre_fecha;
  }

  public void setMre_fecha(String newMre_fecha)
  {
    mre_fecha = newMre_fecha;
  }

  public double getMre_tipcam()
  {
    return mre_tipcam;
  }

  public void setMre_tipcam(double newMre_tipcam)
  {
    mre_tipcam = newMre_tipcam;
  }

  public double getMre_tipufv()
  {
    return mre_tipufv;
  }

  public void setMre_tipufv(double newMre_tipufv)
  {
    mre_tipufv = newMre_tipufv;
  }

  public String getMre_descripcion()
  {
    return mre_descripcion;
  }

  public void setMre_descripcion(String newMre_descripcion)
  {
    mre_descripcion = newMre_descripcion;
  }

  public String getMre_desadicional()
  {
    return mre_desadicional;
  }

  public void setMre_desadicional(String newMre_desadicional)
  {
    mre_desadicional = newMre_desadicional;
  }

  public String getMre_proveedor()
  {
    return mre_proveedor;
  }

  public void setMre_proveedor(String newMre_proveedor)
  {
    mre_proveedor = newMre_proveedor;
  }

  public String getMre_docreferencia()
  {
    return mre_docreferencia;
  }

  public void setMre_docreferencia(String newMre_docreferencia)
  {
    mre_docreferencia = newMre_docreferencia;
  }

  public String getMre_fecreferencia()
  {
    return mre_fecreferencia;
  }

  public void setMre_fecreferencia(String newMre_fecreferencia)
  {
    mre_fecreferencia = newMre_fecreferencia;
  }

  public double getMre_valbol()
  {
    return mre_valbol;
  }

  public void setMre_valbol(double newMre_valbol)
  {
    mre_valbol = newMre_valbol;
  }

  public double getMre_valdol()
  {
    return mre_valdol;
  }

  public void setMre_valdol(double newMre_valdol)
  {
    mre_valdol = newMre_valdol;
  }

  public double getMre_valufv()
  {
    return mre_valufv;
  }

  public void setMre_valufv(double newMre_valufv)
  {
    mre_valufv = newMre_valufv;
  }

  public String getMre_fecbaja()
  {
    return mre_fecbaja;
  }

  public void setMre_fecbaja(String newMre_fecbaja)
  {
    mre_fecbaja = newMre_fecbaja;
  }

  public String getMre_docbaja()
  {
    return mre_docbaja;
  }

  public void setMre_docbaja(String newMre_docbaja)
  {
    mre_docbaja = newMre_docbaja;
  }

  public int getMre_numfactura()
  {
    return mre_numfactura;
  }

  public void setMre_numfactura(int newMre_numfactura)
  {
    mre_numfactura = newMre_numfactura;
  }

  public String getMre_numcomprobante()
  {
    return mre_numcomprobante;
  }

  public void setMre_numcomprobante(String newMre_numcomprobante)
  {
    mre_numcomprobante = newMre_numcomprobante;
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