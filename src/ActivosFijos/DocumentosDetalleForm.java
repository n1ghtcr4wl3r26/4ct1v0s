package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class DocumentosDetalleForm extends ActionForm 
{
  String codreg;
  String tipdoc;
  int numero;
  String fecha;
  String codofiorigen;
  String codfunorigen;
  String codubiorigen;
  String codfin;
  String codfinorigen;
  String codpryorigen;
  String codofidestino;
  String codfundestino;
  String codubidestino;
  String codfindestino;
  String codprydestino;
  String observacion;
  String inconfirma;
  String descripcion_tipdoc;
  String nombre_codfunorigen;
  String nombre_codfundestino;
  String nombre_codofiorigen;
  String nombre_codofidestino;
  String nombre_carorigen;
  String nombre_cardestino;
  String glosa;

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

  public String getcodreg()
  {
    return codreg;
  }

  public void setcodreg(String newcodreg)
  {
    codreg = newcodreg;
  }

  public String gettipdoc()
  {
    return tipdoc;
  }

  public void settipdoc(String newtipdoc)
  {
    tipdoc = newtipdoc;
  }

  public int getnumero()
  {
    return numero;
  }

  public void setnumero(int newnumero)
  {
    numero = newnumero;
  }

  public String getfecha()
  {
    return fecha;
  }

  public void setfecha(String newfecha)
  {
    fecha = newfecha;
  }

  public String getcodofiorigen()
  {
    return codofiorigen;
  }

  public void setcodofiorigen(String newcodofiorigen)
  {
    codofiorigen = newcodofiorigen;
  }

  public String getcodfunorigen()
  {
    return codfunorigen;
  }

  public void setcodfunorigen(String newcodfunorigen)
  {
    codfunorigen = newcodfunorigen;
  }

  public String getcodubiorigen()
  {
    return codubiorigen;
  }

  public void setcodubiorigen(String newcodubiorigen)
  {
    codubiorigen = newcodubiorigen;
  }

  public String getcodfinorigen()
  {
    return codfinorigen;
  }

  public void setcodfinorigen(String newcodfinorigen)
  {
    codfinorigen = newcodfinorigen;
  }

  public String getcodfin()
  {
    return codfin;
  }

  public void setcodfin(String newcodfin)
  {
    codfin = newcodfin;
  }

  public String getcodpryorigen()
  {
    return codpryorigen;
  }

  public void setcodpryorigen(String newcodpryorigen)
  {
    codpryorigen = newcodpryorigen;
  }

  public String getcodofidestino()
  {
    return codofidestino;
  }

  public void setcodofidestino(String newcodofidestino)
  {
    codofidestino = newcodofidestino;
  }

  public String getcodfundestino()
  {
    return codfundestino;
  }

  public void setcodfundestino(String newcodfundestino)
  {
    codfundestino = newcodfundestino;
  }

  public String getcodubidestino()
  {
    return codubidestino;
  }

  public void setcodubidestino(String newcodubidestino)
  {
    codubidestino = newcodubidestino;
  }

  public String getcodfindestino()
  {
    return codfindestino;
  }

  public void setcodfindestino(String newcodfindestino)
  {
    codfindestino = newcodfindestino;
  }

  public String getcodprydestino()
  {
    return codprydestino;
  }

  public void setcodprydestino(String newcodprydestino)
  {
    codprydestino = newcodprydestino;
  }

  public String getobservacion()
  {
    return observacion;
  }

  public void setobservacion(String newobservacion)
  {
    observacion = newobservacion;
  }

  public String getinconfirma()
  {
    return inconfirma;
  }

  public void setinconfirma(String newinconfirma)
  {
    inconfirma = newinconfirma;
  }

  public String getDescripcion_tipdoc()
  {
    return descripcion_tipdoc;
  }

  public void setDescripcion_tipdoc(String newDescripcion_tipdoc)
  {
    descripcion_tipdoc = newDescripcion_tipdoc;
  }

  public String getNombre_codfunorigen()
  {
    return nombre_codfunorigen;
  }

  public void setNombre_codfunorigen(String newNombre_codfunorigen)
  {
    nombre_codfunorigen = newNombre_codfunorigen;
  }

  public String getNombre_codfundestino()
  {
    return nombre_codfundestino;
  }

  public void setNombre_codfundestino(String newNombre_codfundestino)
  {
    nombre_codfundestino = newNombre_codfundestino;
  }

  public String getNombre_codofiorigen()
  {
    return nombre_codofiorigen;
  }

  public void setNombre_codofiorigen(String newNombre_codofiorigen)
  {
    nombre_codofiorigen = newNombre_codofiorigen;
  }

  public String getNombre_codofidestino()
  {
    return nombre_codofidestino;
  }

  public void setNombre_codofidestino(String newNombre_codofidestino)
  {
    nombre_codofidestino = newNombre_codofidestino;
  }

  public String getNombre_carorigen()
  {
    return nombre_carorigen;
  }

  public void setNombre_carorigen(String newNombre_carorigen)
  {
    nombre_carorigen = newNombre_carorigen;
  }

  public String getNombre_cardestino()
  {
    return nombre_cardestino;
  }

  public void setNombre_cardestino(String newNombre_cardestino)
  {
    nombre_cardestino = newNombre_cardestino;
  }

  public String getGlosa()
  {
    return glosa;
  }

  public void setGlosa(String newGlosa)
  {
    glosa = newGlosa;
  }

}