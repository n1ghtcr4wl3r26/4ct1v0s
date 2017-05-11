package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ReportesForm extends ActionForm 
{
  int operacion;
  int opcion;
  int flag;
  String condicion1;
  String condicion2;
  String condicion3;
  String condicion4;
  String condicion5;
  String condicion6;
  String condicion7;
  String cod_reg;
  String cod_fin;
  String des_codreg;
  String des_codfin;
  String des_codfun;
  String tiporep;
  String condicion10;
  String condicion11;
  String condirep;

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

  public int getFlag()
  {
    return flag;
  }

  public void setFlag(int newFlag)
  {
    flag = newFlag;
  }

  public String getCondicion1()
  {
    return condicion1;
  }

  public void setCondicion1(String newCondicion1)
  {
    condicion1 = newCondicion1;
  }

  public String getCondicion2()
  {
    return condicion2;
  }

  public void setCondicion2(String newCondicion2)
  {
    condicion2 = newCondicion2;
  }

  public String getCondicion3()
  {
    return condicion3;
  }

  public void setCondicion3(String newCondicion3)
  {
    condicion3 = newCondicion3;
  }

  public String getCondicion4()
  {
    return condicion4;
  }

  public void setCondicion4(String newCondicion4)
  {
    condicion4 = newCondicion4;
  }

  public String getCondicion5()
  {
    return condicion5;
  }

  public void setCondicion5(String newCondicion5)
  {
    condicion5 = newCondicion5;
  }

  public String getCondicion6()
  {
    return condicion6;
  }

  public void setCondicion6(String newCondicion6)
  {
    condicion6 = newCondicion6;
  }

  public String getCondicion7()
  {
    return condicion7;
  }

  public void setCondicion7(String newCondicion7)
  {
    condicion7 = newCondicion7;
  }

  public String getCod_reg()
  {
    return cod_reg;
  }

  public void setCod_reg(String newCod_reg)
  {
    cod_reg = newCod_reg;
  }

  public String getCod_fin()
  {
    return cod_fin;
  }

  public void setCod_fin(String newCod_fin)
  {
    cod_fin = newCod_fin;
  }

  public String getDes_codreg()
  {
    return des_codreg;
  }

  public void setDes_codreg(String newDes_codreg)
  {
    des_codreg = newDes_codreg;
  }

  public String getDes_codfin()
  {
    return des_codfin;
  }

  public void setDes_codfin(String newDes_codfin)
  {
    des_codfin = newDes_codfin;
  }

  public String getDes_codfun()
  {
    return des_codfun;
  }

  public void setDes_codfun(String newDes_codfun)
  {
    des_codfun = newDes_codfun;
  }
  
  public String getTiporep()
  {
    return tiporep;
  }

  public void setTiporep(String newTiporep)
  {
    tiporep = newTiporep;
  }

  public String getCondicion10()
  {
    return condicion10;
  }

  public void setCondicion10(String newCondicion10)
  {
    condicion10 = newCondicion10;
  }

  public String getCondicion11()
  {
    return condicion11;
  }

  public void setCondicion11(String newCondicion11)
  {
    condicion11 = newCondicion11;
  }
  public String getCondirep()
  {
    return condirep;
  }

  public void setCondirep(String newCondirep)
  {
    condirep = newCondirep;
  }
}
