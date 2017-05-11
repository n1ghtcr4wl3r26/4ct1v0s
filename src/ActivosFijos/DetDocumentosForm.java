package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class DetDocumentosForm extends ActionForm 
{
  String ddo_codreg;
  String ddo_tipdoc;
  int ddo_numero;
  int ddo_item;
  String ddo_codrubactual;
  String ddo_codregactual;
  String ddo_codigo;

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

  public String getDdo_codreg()
  {
    return ddo_codreg;
  }

  public void setDdo_codreg(String newCodreg)
  {
    ddo_codreg = newCodreg;
  }

  public String getDdo_tipdoc()
  {
    return ddo_tipdoc;
  }

  public void setDdo_tipdoc(String newTipdoc)
  {
    ddo_tipdoc = newTipdoc;
  }

  public int getDdo_numero()
  {
    return ddo_numero;
  }

  public void setDdo_numero(int newNumero)
  {
    ddo_numero = newNumero;
  }

  public int getDdo_item()
  {
    return ddo_item;
  }

  public void setDdo_item(int newItem)
  {
    ddo_item = newItem;
  }

  public String getDdo_codregactual()
  {
    return ddo_codregactual;
  }

  public void setDdo_codregactual(String newDdo_codregactual)
  {
    ddo_codregactual = newDdo_codregactual;
  }

  public String getDdo_codigo()
  {
    return ddo_codigo;
  }

  public void setDdo_codigo(String newCodigo)
  {
    ddo_codigo = newCodigo;
  }
  public String getDdo_codrubactual()
  {
    return ddo_codrubactual;
  }

  public void setDdo_codrubactual(String newDdo_codrubactual)
  {
    ddo_codrubactual = newDdo_codrubactual;
  }

}