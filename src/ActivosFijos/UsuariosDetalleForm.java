package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class UsuariosDetalleForm extends ActionForm 
{
  String codigo;
  String carnet;
  String codfun;
  String desfuncionario;

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

  public String getCodigo()
  {
    return codigo;
  }

  public void setCodigo(String newCodigo)
  {
    codigo = newCodigo;
  }

  public String getCarnet()
  {
    return carnet;
  }

  public void setCarnet(String newCarnet)
  {
    carnet = newCarnet;
  }

  public String getCodfun()
  {
    return codfun;
  }

  public void setCodfun(String newCodfun)
  {
    codfun = newCodfun;
  }

  public String getDesfuncionario()
  {
    return desfuncionario;
  }

  public void setDesfuncionario(String newDesfuncionario)
  {
    desfuncionario = newDesfuncionario;
  }

}