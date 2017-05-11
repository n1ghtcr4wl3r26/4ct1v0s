package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class RevaluosDetalleForm extends ActionForm 
{
  String codrub;
  String codreg;
  int codigo;
  int correlmre;
  String fecha;
  double tipcam;
  double tipufv;
  double valbol;
  double valdol;
  double valufv;
  double depacubol;
  double depacudol;
  double depacuufv;
  int vidaut;
  String estadoactivo;
  String desestado;  
  String indepreciacion;
  String numdocumento;
  int numrevaluo;
  String desactivo;
  String codgrp;
  String ceros;
  
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

  public String getcodrub()
  {
    return codrub;
  }

  public void setcodrub(String newcodrub)
  {
    codrub = newcodrub;
  }

  public String getcodreg()
  {
    return codreg;
  }

  public void setcodreg(String newcodreg)
  {
    codreg = newcodreg;
  }

  public int getcodigo()
  {
    return codigo;
  }

  public void setcodigo(int newcodigo)
  {
    codigo = newcodigo;
  }

  public int getcorrelmre()
  {
    return correlmre;
  }

  public void setcorrelmre(int newcorrelmre)
  {
    correlmre = newcorrelmre;
  }

  public String getfecha()
  {
    return fecha;
  }

  public void setfecha(String newfecha)
  {
    fecha = newfecha;
  }

  public double gettipcam()
  {
    return tipcam;
  }

  public void settipcam(double newtipcam)
  {
    tipcam = newtipcam;
  }

  public double gettipufv()
  {
    return tipufv;
  }

  public void settipufv(double newtipufv)
  {
    tipufv = newtipufv;
  }

  public double getvalbol()
  {
    return valbol;
  }

  public void setvalbol(double newvalbol)
  {
    valbol = newvalbol;
  }

  public double getvaldol()
  {
    return valdol;
  }

  public void setvaldol(double newvaldol)
  {
    valdol = newvaldol;
  }

  public double getvalufv()
  {
    return valufv;
  }

  public void setvalufv(double newvalufv)
  {
    valufv = newvalufv;
  }

  public double getdepacubol()
  {
    return depacubol;
  }

  public void setdepacubol(double newdepacubol)
  {
    depacubol = newdepacubol;
  }

  public double getdepacudol()
  {
    return depacudol;
  }

  public void setdepacudol(double newdepacudol)
  {
    depacudol = newdepacudol;
  }

  public double getdepacuufv()
  {
    return depacuufv;
  }

  public void setdepacuufv(double newdepacuufv)
  {
    depacuufv = newdepacuufv;
  }

  public int getvidaut()
  {
    return vidaut;
  }

  public void setvidaut(int newvidaut)
  {
    vidaut = newvidaut;
  }

  public String getestadoactivo()
  {
    return estadoactivo;
  }

  public void setestadoactivo(String newestadoactivo)
  {
    estadoactivo = newestadoactivo;
  }

  public String getindepreciacion()
  {
    return indepreciacion;
  }

  public void setindepreciacion(String newindepreciacion)
  {
    indepreciacion = newindepreciacion;
  }

  public String getnumdocumento()
  {
    return numdocumento;
  }

  public void setnumdocumento(String newnumdocumento)
  {
    numdocumento = newnumdocumento;
  }

  public String getdesestado()
  {
    return desestado;
  }

  public void setdesestado(String newDesestado)
  {
    desestado = newDesestado;
  }

  public int getNumrevaluo()
  {
    return numrevaluo;
  }

  public void setNumrevaluo(int newNumrevaluo)
  {
    numrevaluo = newNumrevaluo;
  }

  public String getDesactivo()
  {
    return desactivo;
  }

  public void setDesactivo(String newDesactivo)
  {
    desactivo = newDesactivo;
  }

  public String getcodgrp()
  {
    return codgrp;
  }

  public void setcodgrp(String newcodgrp)
  {
    codgrp = newcodgrp;
  }

  public String getCeros()
  {
    return ceros;
  }

  public void setCeros(String newCeros)
  {
    ceros = newCeros;
  }
}