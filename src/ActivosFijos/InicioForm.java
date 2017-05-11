package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class InicioForm extends ActionForm 
{
  private String txt_usu;
  private String txt_pas;
  private ArrayList opciones;
  private String nombreUsuario;
  private String regional;
  private String cod_reg;
  private String financiador;
  private String cod_fin;
  private String txt_npas;
  private String txt_cpas;
  private String aux1;
  private String aux2;

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

  public String getTxt_usu()
  {
    return txt_usu;
  }

  public void setTxt_usu(String newTxt_usu)
  {
    txt_usu = newTxt_usu;
  }

  public String getTxt_pas()
  {
    return txt_pas;
  }

  public void setTxt_pas(String newTxt_pas)
  {
    txt_pas = newTxt_pas;
  }

  public ArrayList getOpciones()
  {
    return opciones;
  }

  public void setOpciones(ArrayList newOpciones)
  {
    opciones = newOpciones;
  }

  public String getNombreUsuario()
  {
    return nombreUsuario;
  }

  public void setNombreUsuario(String newNombreUsuario)
  {
    nombreUsuario = newNombreUsuario;
  }

  public String getRegional()
  {
    return regional;
  }

  public void setRegional(String newRegional)
  {
    regional = newRegional;
  }

  public String getCod_reg()
  {
    return cod_reg;
  }

  public void setCod_reg(String newCod_reg)
  {
    cod_reg = newCod_reg;
  }

  public String getFinanciador()
  {
    return financiador;
  }

  public void setFinanciador(String newFinanciador)
  {
    financiador = newFinanciador;
  }

  public String getCod_fin()
  {
    return cod_fin;
  }

  public void setCod_fin(String newCod_fin)
  {
    cod_fin = newCod_fin;
  }

  public String getTxt_npas()
  {
    return txt_npas;
  }

  public void setTxt_npas(String newTxt_npas)
  {
    txt_npas = newTxt_npas;
  }

  public String getTxt_cpas()
  {
    return txt_cpas;
  }

  public void setTxt_cpas(String newTxt_cpas)
  {
    txt_cpas = newTxt_cpas;
  }

  public String getAux1()
  {
    return aux1;
  }

  public void setAux1(String newAux1)
  {
    aux1 = newAux1;
  }

  public String getAux2()
  {
    return aux2;
  }

  public void setAux2(String newAux2)
  {
    aux2 = newAux2;
  }
}