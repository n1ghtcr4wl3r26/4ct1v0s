package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ParametrosForm extends ActionForm 
{
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  String cte_codinstitucion;
  String cte_codrubaccesorios;
  String cte_codrubmejoras;
  String cte_codrubrebajas;
  String cte_codrub1;
  String cte_codrub2;
  String cte_codrub3;
  String cte_codrub4;  
  String cte_codrub5;  
  String cte_codrub6;  
  String cte_tipdocentrega;
  String cte_tipdocdevolucion;
  String cte_tipdoctransferencia;
  String cte_tipdocbaja;
  String cte_gestion;
  String cte_tipdoctraregionales;

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

  public String getCte_codinstitucion()
  {
    return cte_codinstitucion;
  }

  public void setCte_codinstitucion(String newCte_codinstitucion)
  {
    cte_codinstitucion = newCte_codinstitucion;
  }

  public String getCte_codrubaccesorios()
  {
    return cte_codrubaccesorios;
  }

  public void setCte_codrubaccesorios(String newCte_codrubaccesorios)
  {
    cte_codrubaccesorios = newCte_codrubaccesorios;
  }

  public String getCte_codrubmejoras()
  {
    return cte_codrubmejoras;
  }

  public void setCte_codrubmejoras(String newCte_codrubmejoras)
  {
    cte_codrubmejoras = newCte_codrubmejoras;
  }

  public String getCte_codrubrebajas()
  {
    return cte_codrubrebajas;
  }

  public void setCte_codrubrebajas(String newCte_codrubrebajas)
  {
    cte_codrubrebajas = newCte_codrubrebajas;
  }

  public String getCte_codrub1()
  {
    return cte_codrub1;
  }

  public void setCte_codrub1(String newCte_codrub1)
  {
    cte_codrub1 = newCte_codrub1;
  }

  public String getCte_codrub2()
  {
    return cte_codrub2;
  }

  public void setCte_codrub2(String newCte_codrub2)
  {
    cte_codrub2 = newCte_codrub2;
  }

  public String getCte_codrub3()
  {
    return cte_codrub3;
  }

  public void setCte_codrub3(String newCte_codrub3)
  {
    cte_codrub3 = newCte_codrub3;
  }

  public String getCte_codrub4()
  {
    return cte_codrub4;
  }

  public void setCte_codrub4(String newCte_codrub4)
  {
    cte_codrub4 = newCte_codrub4;
  }

  public String getCte_codrub5()
  {
    return cte_codrub5;
  }

  public void setCte_codrub5(String newCte_codrub5)
  {
    cte_codrub5 = newCte_codrub5;
  }

  public String getCte_codrub6()
  {
    return cte_codrub6;
  }

  public void setCte_codrub6(String newCte_codrub6)
  {
    cte_codrub6 = newCte_codrub6;
  }

  public String getCte_tipdocentrega()
  {
    return cte_tipdocentrega;
  }

  public void setCte_tipdocentrega(String newCte_tipdocentrega)
  {
    cte_tipdocentrega = newCte_tipdocentrega;
  }

  public String getCte_tipdocdevolucion()
  {
    return cte_tipdocdevolucion;
  }

  public void setCte_tipdocdevolucion(String newCte_tipdocdevolucion)
  {
    cte_tipdocdevolucion = newCte_tipdocdevolucion;
  }

  public String getCte_tipdoctransferencia()
  {
    return cte_tipdoctransferencia;
  }

  public void setCte_tipdoctransferencia(String newCte_tipdoctransferencia)
  {
    cte_tipdoctransferencia = newCte_tipdoctransferencia;
  }

  public String getCte_tipdoctraregionales()
  {
    return cte_tipdoctraregionales;
  }

  public void setCte_tipdoctraregionales(String newCte_tipdoctraregionales)
  {
    cte_tipdoctraregionales = newCte_tipdoctraregionales;
  }

  public String getCte_tipdocbaja()
  {
    return cte_tipdocbaja;
  }

  public void setCte_tipdocbaja(String newCte_tipdocbaja)
  {
    cte_tipdocbaja = newCte_tipdocbaja;
  }

  public String getCte_gestion()
  {
    return cte_gestion;
  }

  public void setCte_gestion(String newCte_gestion)
  {
    cte_gestion = newCte_gestion;
  }
}