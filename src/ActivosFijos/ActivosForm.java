package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ActivosForm extends ActionForm 
{
  String act_codrub;
  String act_codreg;
  int act_codigo;
  String act_codgrp;
  String act_codpar;
  String act_codofi;
  String act_codfun;
  String act_codubi;
  String act_codfin;
  String act_codpry;
  String act_codmot;
  String act_feccompra;
  double act_tipcam;
  double act_tipufv;
  String act_umanejo;
  String act_descripcion;
  String act_desadicional;
  String act_proveedor;
  String act_marca;
  String act_modelo;
  String act_serie1;
  String act_serie2;
  String act_docreferencia;
  String act_fecreferencia;
  String act_placa;
  String act_valcobol;
  String act_valcodol;
  String act_valcoufv;
  String act_fecbaja;
  String act_ordencompra;
  String act_numfactura;
  String act_numcomprobante;
  String act_codanterior;
  String act_indetiqueta;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String rev_fecha;
  int rev_vidaut;
  String rev_estadoactivo;
  String desestado;
  String rev_desestado;
  String rev_indepreciacion;
  String rev_numdocumento;
  String act_rubdescripcion;
  String act_regdescripcion;
  String act_codbarra;
  String act_fundescripcion;
  String act_ofidescripcion;
  String act_pardescripcion;
  String act_accesorios;
  String act_docrefotro;
  String act_aniofabricacion;
  String act_color;
  String act_procedencia;
  String act_gobmunicipal;
  String mes;
  String anio;
  String act_grpdescripcion;
  String act_ubidescripcion;
  String act_prydescripcion;
  String act_findescripcion;
  String codregor;
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

  public String getAct_codrub()
  {
    return act_codrub;
  }

  public void setAct_codrub(String newAct_codrub)
  {
    act_codrub = newAct_codrub;
  }

  public String getAct_codreg()
  {
    return act_codreg;
  }

  public void setAct_codreg(String newAct_codreg)
  {
    act_codreg = newAct_codreg;
  }

  public int getAct_codigo()
  {
    return act_codigo;
  }

  public void setAct_codigo(int newAct_codigo)
  {
    act_codigo = newAct_codigo;
  }

  public String getAct_codgrp()
  {
    return act_codgrp;
  }

  public void setAct_codgrp(String newAct_codgrp)
  {
    act_codgrp = newAct_codgrp;
  }

  public String getAct_codpar()
  {
    return act_codpar;
  }

  public void setAct_codpar(String newAct_codpar)
  {
    act_codpar = newAct_codpar;
  }

  public String getAct_codofi()
  {
    return act_codofi;
  }

  public void setAct_codofi(String newAct_codofi)
  {
    act_codofi = newAct_codofi;
  }

  public String getAct_codfun()
  {
    return act_codfun;
  }

  public void setAct_codfun(String newAct_codfun)
  {
    act_codfun = newAct_codfun;
  }

  public String getAct_codubi()
  {
    return act_codubi;
  }

  public void setAct_codubi(String newAct_codubi)
  {
    act_codubi = newAct_codubi;
  }

  public String getAct_codfin()
  {
    return act_codfin;
  }

  public void setAct_codfin(String newAct_codfin)
  {
    act_codfin = newAct_codfin;
  }

  public String getAct_codpry()
  {
    return act_codpry;
  }

  public void setAct_codpry(String newAct_codpry)
  {
    act_codpry = newAct_codpry;
  }

  public String getAct_codmot()
  {
    return act_codmot;
  }

  public void setAct_codmot(String newAct_codmot)
  {
    act_codmot = newAct_codmot;
  }

  public String getAct_feccompra()
  {
    return act_feccompra;
  }

  public void setAct_feccompra(String newAct_feccompra)
  {
    act_feccompra = newAct_feccompra;
  }

  public double getAct_tipcam()
  {
    return act_tipcam;
  }

  public void setAct_tipcam(double newAct_tipcam)
  {
    act_tipcam = newAct_tipcam;
  }

  public double getAct_tipufv()
  {
    return act_tipufv;
  }

  public void setAct_tipufv(double newAct_tipufv)
  {
    act_tipufv = newAct_tipufv;
  }

  public String getAct_umanejo()
  {
    return act_umanejo;
  }

  public void setAct_umanejo(String newAct_umanejo)
  {
    act_umanejo = newAct_umanejo;
  }

  public String getAct_descripcion()
  {
    return act_descripcion;
  }

  public void setAct_descripcion(String newAct_descripcion)
  {
    act_descripcion = newAct_descripcion;
  }

  public String getAct_desadicional()
  {
    return act_desadicional;
  }

  public void setAct_desadicional(String newAct_desadicional)
  {
    act_desadicional = newAct_desadicional;
  }

  public String getAct_proveedor()
  {
    return act_proveedor;
  }

  public void setAct_proveedor(String newAct_proveedor)
  {
    act_proveedor = newAct_proveedor;
  }

  public String getAct_marca()
  {
    return act_marca;
  }

  public void setAct_marca(String newAct_marca)
  {
    act_marca = newAct_marca;
  }

  public String getAct_modelo()
  {
    return act_modelo;
  }

  public void setAct_modelo(String newAct_modelo)
  {
    act_modelo = newAct_modelo;
  }

  public String getAct_serie1()
  {
    return act_serie1;
  }

  public void setAct_serie1(String newAct_serie1)
  {
    act_serie1 = newAct_serie1;
  }

  public String getAct_serie2()
  {
    return act_serie2;
  }

  public void setAct_serie2(String newAct_serie2)
  {
    act_serie2 = newAct_serie2;
  }

  public String getAct_docreferencia()
  {
    return act_docreferencia;
  }

  public void setAct_docreferencia(String newAct_docreferencia)
  {
    act_docreferencia = newAct_docreferencia;
  }

  public String getAct_fecreferencia()
  {
    return act_fecreferencia;
  }

  public void setAct_fecreferencia(String newAct_fecreferencia)
  {
    act_fecreferencia = newAct_fecreferencia;
  }

  public String getAct_placa()
  {
    return act_placa;
  }

  public void setAct_placa(String newAct_placa)
  {
    act_placa = newAct_placa;
  }

  public String getAct_valcobol()
  {
    return act_valcobol;
  }

  public void setAct_valcobol(String newAct_valcobol)
  {
    act_valcobol = newAct_valcobol;
  }

  public String getAct_valcodol()
  {
    return act_valcodol;
  }

  public void setAct_valcodol(String newAct_valcodol)
  {
    act_valcodol = newAct_valcodol;
  }

  public String getAct_valcoufv()
  {
    return act_valcoufv;
  }

  public void setAct_valcoufv(String newAct_valcoufv)
  {
    act_valcoufv = newAct_valcoufv;
  }

  public String getAct_fecbaja()
  {
    return act_fecbaja;
  }

  public void setAct_fecbaja(String newAct_fecbaja)
  {
    act_fecbaja = newAct_fecbaja;
  }

  public String getAct_ordencompra()
  {
    return act_ordencompra;
  }

  public void setAct_ordencompra(String newAct_ordencompra)
  {
    act_ordencompra = newAct_ordencompra;
  }

  public String getAct_numfactura()
  {
    return act_numfactura;
  }

  public void setAct_numfactura(String newAct_numfactura)
  {
    act_numfactura = newAct_numfactura;
  }

  public String getAct_numcomprobante()
  {
    return act_numcomprobante;
  }

  public void setAct_numcomprobante(String newAct_numcomprobante)
  {
    act_numcomprobante = newAct_numcomprobante;
  }

  public String getAct_codanterior()
  {
    return act_codanterior;
  }

  public void setAct_codanterior(String newAct_codanterior)
  {
    act_codanterior = newAct_codanterior;
  }

  public String getAct_indetiqueta()
  {
    return act_indetiqueta;
  }

  public void setAct_indetiqueta(String newAct_indetiqueta)
  {
    act_indetiqueta = newAct_indetiqueta;
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

  public String getRev_fecha()
  {
    return rev_fecha;
  }

  public void setRev_fecha(String newRev_fecha)
  {
    rev_fecha = newRev_fecha;
  }

  public int getRev_vidaut()
  {
    return rev_vidaut;
  }

  public void setRev_vidaut(int newRev_vidaut)
  {
    rev_vidaut = newRev_vidaut;
  }

  public String getRev_estadoactivo()
  {
    return rev_estadoactivo;
  }

  public void setRev_estadoactivo(String newRev_estadoactivo)
  {
    rev_estadoactivo = newRev_estadoactivo;
  }

  public String getRev_desestado()
  {
    return rev_desestado;
  }

  public void setRev_desestado(String newRev_desestado)
  {
    rev_desestado = newRev_desestado;
  }

  public String getRev_indepreciacion()
  {
    return rev_indepreciacion;
  }

  public void setRev_indepreciacion(String newRev_indepreciacion)
  {
    rev_indepreciacion = newRev_indepreciacion;
  }

  public String getRev_numdocumento()
  {
    return rev_numdocumento;
  }

  public void setRev_numdocumento(String newRev_numdocumento)
  {
    rev_numdocumento = newRev_numdocumento;
  }

  public String getAct_rubdescripcion()
  {
    return act_rubdescripcion;
  }

  public void setAct_rubdescripcion(String newAct_rubdescripcion)
  {
    act_rubdescripcion = newAct_rubdescripcion;
  }

  public String getAct_regdescripcion()
  {
    return act_regdescripcion;
  }

  public void setAct_regdescripcion(String newAct_regdescripcion)
  {
    act_regdescripcion = newAct_regdescripcion;
  }

  public String getAct_codbarra()
  {
    return act_codbarra;
  }

  public void setAct_codbarra(String newAct_codbarra)
  {
    act_codbarra = newAct_codbarra;
  }

  public String getAct_fundescripcion()
  {
    return act_fundescripcion;
  }

  public void setAct_fundescripcion(String newAct_fundescripcion)
  {
    act_fundescripcion = newAct_fundescripcion;
  }

  public String getAct_ofidescripcion()
  {
    return act_ofidescripcion;
  }

  public void setAct_ofidescripcion(String newAct_ofidescripcion)
  {
    act_ofidescripcion = newAct_ofidescripcion;
  }

  public String getAct_pardescripcion()
  {
    return act_pardescripcion;
  }

  public void setAct_pardescripcion(String newAct_pardescripcion)
  {
    act_pardescripcion = newAct_pardescripcion;
  }

  public String getAct_accesorios()
  {
    return act_accesorios;
  }

  public void setAct_accesorios(String newAct_accesorios)
  {
    act_accesorios = newAct_accesorios;
  }

  public String getAct_docrefotro()
  {
    return act_docrefotro;
  }

  public void setAct_docrefotro(String newAct_docrefotro)
  {
    act_docrefotro = newAct_docrefotro;
  }

  public String getAct_aniofabricacion()
  {
    return act_aniofabricacion;
  }

  public void setAct_aniofabricacion(String newAct_aniofabricacion)
  {
    act_aniofabricacion = newAct_aniofabricacion;
  }

  public String getAct_color()
  {
    return act_color;
  }

  public void setAct_color(String newAct_color)
  {
    act_color = newAct_color;
  }

  public String getAct_procedencia()
  {
    return act_procedencia;
  }

  public void setAct_procedencia(String newAct_procedencia)
  {
    act_procedencia = newAct_procedencia;
  }

  public String getAct_gobmunicipal()
  {
    return act_gobmunicipal;
  }

  public void setAct_gobmunicipal(String newAct_gobmunicipal)
  {
    act_gobmunicipal = newAct_gobmunicipal;
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

  public String getAct_grpdescripcion()
  {
    return act_grpdescripcion;
  }

  public void setAct_grpdescripcion(String newAct_grpdescripcion)
  {
    act_grpdescripcion = newAct_grpdescripcion;
  }

  public String getAct_ubidescripcion()
  {
    return act_ubidescripcion;
  }

  public void setAct_ubidescripcion(String newAct_ubidescripcion)
  {
    act_ubidescripcion = newAct_ubidescripcion;
  }

  public String getAct_prydescripcion()
  {
    return act_prydescripcion;
  }

  public void setAct_prydescripcion(String newAct_prydescripcion)
  {
    act_prydescripcion = newAct_prydescripcion;
  }

  public String getAct_findescripcion()
  {
    return act_findescripcion;
  }

  public void setAct_findescripcion(String newAct_findescripcion)
  {
    act_findescripcion = newAct_findescripcion;
  }

  public String getDesestado()
  {
    return desestado;
  }

  public void setDesestado(String newDesestado)
  {
    desestado = newDesestado;
  }

  public String getCodregor()
  {
    return codregor;
  }

  public void setCodregor(String newCodregor)
  {
    codregor = newCodregor;
  }  
}