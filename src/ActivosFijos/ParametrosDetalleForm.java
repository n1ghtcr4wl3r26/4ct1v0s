package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ParametrosDetalleForm extends ActionForm 
{
  String codinstitucion;
  String codrubaccesorios;
  String codrubmejoras;
  String codrubrebajas;
  String codrub1;
  String codrub2;
  String codrub3;
  String codrub4;  
  String codrub5;  
  String codrub6;  
  String tipdocentrega;
  String tipdocdevolucion;
  String tipdoctransferencia;
  String tipdoctraregionales;
  String tipdocbaja;
  String gestion;

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

  public String getcodinstitucion()
  {
    return codinstitucion;
  }

  public void setcodinstitucion(String newcodinstitucion)
  {
    codinstitucion = newcodinstitucion;
  }

  public String getcodrubaccesorios()
  {
    return codrubaccesorios;
  }

  public void setcodrubaccesorios(String newcodrubaccesorios)
  {
    codrubaccesorios = newcodrubaccesorios;
  }

  public String getcodrubmejoras()
  {
    return codrubmejoras;
  }

  public void setcodrubmejoras(String newcodrubmejoras)
  {
    codrubmejoras = newcodrubmejoras;
  }

  public String getcodrubrebajas()
  {
    return codrubrebajas;
  }

  public void setcodrubrebajas(String newcodrubrebajas)
  {
    codrubrebajas = newcodrubrebajas;
  }

  public String getcodrub1()
  {
    return codrub1;
  }

  public void setcodrub1(String newcodrub1)
  {
    codrub1 = newcodrub1;
  }

  public String getcodrub2()
  {
    return codrub2;
  }

  public void setcodrub2(String newcodrub2)
  {
    codrub2 = newcodrub2;
  }

  public String getcodrub3()
  {
    return codrub3;
  }

  public void setcodrub3(String newcodrub3)
  {
    codrub3 = newcodrub3;
  }

  public String getcodrub4()
  {
    return codrub4;
  }

  public void setcodrub4(String newcodrub4)
  {
    codrub4 = newcodrub4;
  }

  public String getcodrub5()
  {
    return codrub5;
  }

  public void setcodrub5(String newcodrub5)
  {
    codrub5 = newcodrub5;
  }

  public String getcodrub6()
  {
    return codrub6;
  }

  public void setcodrub6(String newcodrub6)
  {
    codrub6 = newcodrub6;
  }

  public String getTipdocentrega()
  {
    return tipdocentrega;
  }

  public void setTipdocentrega(String newTipdocentrega)
  {
    tipdocentrega = newTipdocentrega;
  }

  public String getTipdocdevolucion()
  {
    return tipdocdevolucion;
  }

  public void setTipdocdevolucion(String newTipdocdevolucion)
  {
    tipdocdevolucion = newTipdocdevolucion;
  }

  public String getTipdoctransferencia()
  {
    return tipdoctransferencia;
  }

  public void setTipdoctransferencia(String newTipdoctransferencia)
  {
    tipdoctransferencia = newTipdoctransferencia;
  }

  public String getTipdoctraregionales()
  {
    return tipdoctraregionales;
  }

  public void setTipdoctraregionales(String newTipdoctraregionales)
  {
    tipdoctraregionales = newTipdoctraregionales;
  }

  public String getTipdocbaja()
  {
    return tipdocbaja;
  }

  public void setTipdocbaja(String newtipdocbaja)
  {
    tipdocbaja = newtipdocbaja;
  }

  public String getGestion()
  {
    return gestion;
  }

  public void setGestion(String newGestion)
  {
    gestion = newGestion;
  }
}