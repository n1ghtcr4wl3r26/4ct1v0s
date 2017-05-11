package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ReporteDepreciacionesDetalleForm extends ActionForm 
{
  String codrub;
  String codreg;
  int codigo;
  int numrevaluo;
  int numdepreciacion;
  String fecha;
  double tipcam;
  double tipufv;
  double factorbol;
  double factordol;
  double factorufv;
  double actuvalbol;
  double actuvaldol;
  double actuvalufv;
  double actufacbol;
  double actufacdol;
  double actufacufv;
  
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

  public int getnumrevaluo()
  {
    return numrevaluo;
  }

  public void setnumrevaluo(int newnumrevaluo)
  {
    numrevaluo = newnumrevaluo;
  }

  public int getnumdepreciacion()
  {
    return numdepreciacion;
  }

  public void setnumdepreciacion(int newnumdepreciacion)
  {
    numdepreciacion = newnumdepreciacion;
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

  public double getfactorbol()
  {
    return factorbol;
  }

  public void setfactorbol(double newfactorbol)
  {
    factorbol = newfactorbol;
  }

  public double getfactordol()
  {
    return factordol;
  }

  public void setfactordol(double newfactordol)
  {
    factordol = newfactordol;
  }

  public double getfactorufv()
  {
    return factorufv;
  }

  public void setfactorufv(double newfactorufv)
  {
    factorufv = newfactorufv;
  }

  public double getactuvalbol()
  {
    return actuvalbol;
  }

  public void setactuvalbol(double newactuvalbol)
  {
    actuvalbol = newactuvalbol;
  }

  public double getactuvaldol()
  {
    return actuvaldol;
  }

  public void setactuvaldol(double newactuvaldol)
  {
    actuvaldol = newactuvaldol;
  }

  public double getactuvalufv()
  {
    return actuvalufv;
  }

  public void setactuvalufv(double newactuvalufv)
  {
    actuvalufv = newactuvalufv;
  }

  public double getactufacbol()
  {
    return actufacbol;
  }

  public void setactufacbol(double newactufacbol)
  {
    actufacbol = newactufacbol;
  }

  public double getactufacdol()
  {
    return actufacdol;
  }

  public void setactufacdol(double newactufacdol)
  {
    actufacdol = newactufacdol;
  }

  public double getactufacufv()
  {
    return actufacufv;
  }

  public void setactufacufv(double newactufacufv)
  {
    actufacufv = newactufacufv;
  }
}
