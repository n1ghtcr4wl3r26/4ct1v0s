package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class RevaluosForm extends ActionForm 
{
  String rev_codrub;
  String rev_codreg;
  int rev_codigo;
  int rev_correlmre;
  int rev_numrevaluo;
  String rev_fecha;
  double rev_tipcam;
  double rev_tipufv;
  double rev_valbol;
  double rev_valdol;
  double rev_valufv;
  double rev_depacubol;
  double rev_depacudol;
  double rev_depacuufv;
  int rev_vidaut;
  String rev_estadoactivo;
  String rev_desestado;  
  String rev_indepreciacion;
  String rev_numdocumento;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String rev_regdescripcion;
  String rev_rubdescripcion;
  String rev_grpdescripcion;
  String mes;
  String anio;
  String rev_codbarra;
  String act_descripcion;
  String act_codgrp;
  int rub_vidaut;
  String fecha_rev;

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

  public String getRev_codrub()
  {
    return rev_codrub;
  }

  public void setRev_codrub(String newRev_codrub)
  {
    rev_codrub = newRev_codrub;
  }

  public String getRev_codreg()
  {
    return rev_codreg;
  }

  public void setRev_codreg(String newRev_codreg)
  {
    rev_codreg = newRev_codreg;
  }

  public int getRev_codigo()
  {
    return rev_codigo;
  }

  public void setRev_codigo(int newRev_codigo)
  {
    rev_codigo = newRev_codigo;
  }

  public int getRev_correlmre()
  {
    return rev_correlmre;
  }

  public void setRev_correlmre(int newRev_correlmre)
  {
    rev_correlmre = newRev_correlmre;
  }

  public String getRev_fecha()
  {
    return rev_fecha;
  }

  public void setRev_fecha(String newRev_fecha)
  {
    rev_fecha = newRev_fecha;
  }

  public double getRev_tipcam()
  {
    return rev_tipcam;
  }

  public void setRev_tipcam(double newRev_tipcam)
  {
    rev_tipcam = newRev_tipcam;
  }

  public double getRev_tipufv()
  {
    return rev_tipufv;
  }

  public void setRev_tipufv(double newRev_tipufv)
  {
    rev_tipufv = newRev_tipufv;
  }

  public double getRev_valbol()
  {
    return rev_valbol;
  }

  public void setRev_valbol(double newRev_valbol)
  {
    rev_valbol = newRev_valbol;
  }

  public double getRev_valdol()
  {
    return rev_valdol;
  }

  public void setRev_valdol(double newRev_valdol)
  {
    rev_valdol = newRev_valdol;
  }

  public double getRev_valufv()
  {
    return rev_valufv;
  }

  public void setRev_valufv(double newRev_valufv)
  {
    rev_valufv = newRev_valufv;
  }

  public double getRev_depacubol()
  {
    return rev_depacubol;
  }

  public void setRev_depacubol(double newRev_depacubol)
  {
    rev_depacubol = newRev_depacubol;
  }

  public double getRev_depacudol()
  {
    return rev_depacudol;
  }

  public void setRev_depacudol(double newRev_depacudol)
  {
    rev_depacudol = newRev_depacudol;
  }

  public double getRev_depacuufv()
  {
    return rev_depacuufv;
  }

  public void setRev_depacuufv(double newRev_depacuufv)
  {
    rev_depacuufv = newRev_depacuufv;
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

  public String getRev_desestado()
  {
    return rev_desestado;
  }

  public void setRev_desestado(String newRev_desestado)
  {
    rev_desestado = newRev_desestado;
  }

  public String getRev_regdescripcion()
  {
    return rev_regdescripcion;
  }

  public void setRev_regdescripcion(String newRev_regdescripcion)
  {
    rev_regdescripcion = newRev_regdescripcion;
  }

  public String getRev_rubdescripcion()
  {
    return rev_rubdescripcion;
  }

  public void setRev_rubdescripcion(String newRev_rubdescripcion)
  {
    rev_rubdescripcion = newRev_rubdescripcion;
  }
  
  public String getRev_grpdescripcion()
  {
    return rev_grpdescripcion;
  }

  public void setRev_grpdescripcion(String newRev_grpdescripcion)
  {
    rev_grpdescripcion = newRev_grpdescripcion;
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

  public int getRev_numrevaluo()
  {
    return rev_numrevaluo;
  }

  public void setRev_numrevaluo(int newRev_numrevaluo)
  {
    rev_numrevaluo = newRev_numrevaluo;
  }

  public String getRev_codbarra()
  {
    return rev_codbarra;
  }

  public void setRev_codbarra(String newRev_codbarra)
  {
    rev_codbarra = newRev_codbarra;
  }

  public String getAct_descripcion()
  {
    return act_descripcion;
  }

  public void setAct_descripcion(String newAct_descripcion)
  {
    act_descripcion = newAct_descripcion;
  }

  public String getAct_codgrp()
  {
    return act_codgrp;
  }

  public void setAct_codgrp(String newAct_codgrp)
  {
    act_codgrp = newAct_codgrp;
  }

  public int getRub_vidaut()
  {
    return rub_vidaut;
  }

  public void setRub_vidaut(int newRub_vidaut)
  {
    rub_vidaut = newRub_vidaut;
  }

  public String getFecha_rev()
  {
    return fecha_rev;
  }

  public void setFecha_rev(String newFecha_rev)
  {
    fecha_rev = newFecha_rev;
  }
}