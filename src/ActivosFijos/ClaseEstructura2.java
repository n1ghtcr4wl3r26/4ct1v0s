package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ClaseEstructura2 extends ActionForm 
{
  String act_codrub;
  String act_codreg;
  String act_codigo;
  String act_codgrp;
  String act_codofi;
  String act_codfun;
  String act_codfin;
  String act_codpry;
  String act_descripcion;
  String act_estado;
  String act_hora;
  String act_fun;
  String act_control;
  String act_usuario;

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

  public String getAct_codigo()
  {
    return act_codigo;
  }

  public void setAct_codigo(String newAct_codigo)
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

  public String getAct_descripcion()
  {
    return act_descripcion;
  }

  public void setAct_descripcion(String newAct_descripcion)
  {
    act_descripcion = newAct_descripcion;
  }

  public String getAct_estado()
  {
    return act_estado;
  }

  public void setAct_estado(String newAct_estado)
  {
    act_estado = newAct_estado;
  }

  public String getAct_hora()
  {
    return act_hora;
  }

  public void setAct_hora(String newAct_hora)
  {
    act_hora = newAct_hora;
  }

  public String getAct_fun()
  {
    return act_fun;
  }

  public void setAct_fun(String newAct_fun)
  {
    act_fun = newAct_fun;
  }

  public String getAct_control()
  {
    return act_control;
  }

  public void setAct_control(String newAct_control)
  {
    act_control = newAct_control;
  }

  public String getAct_usuario()
  {
    return act_usuario;
  }

  public void setAct_usuario(String newAct_usuario)
  {
    act_usuario = newAct_usuario;
  }
}