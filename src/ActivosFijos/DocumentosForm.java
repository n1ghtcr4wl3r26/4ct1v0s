package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class DocumentosForm extends ActionForm 
{
  String doc_codreg;
  String doc_tipdoc;
  int doc_numero;
  int doc_devolucion;
  String doc_fecha;
  String doc_codofiorigen;
  String doc_codfunorigen;
  String doc_codubiorigen;
  String doc_codfinorigen;
  String doc_codfin;
  String doc_codpryorigen;
  String doc_codofidestino;
  String doc_codfundestino;
  String doc_codubidestino;
  String doc_codfindestino;
  String doc_codprydestino;
  String doc_observacion;
  String doc_inconfirma;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  int ddo_item;
  String ddo_codrubactual;
  String ddo_codregactual;
  int ddo_codigo;
  String doc_funorinombre;
  String doc_fundesnombre;
  String doc_feccierre;
  String doc_codregdestino;
  String doc_regdescripcion;
  String doc_findescripcion;
  String ddo_codmot;
  String ddo_codofiactual;
  String ddo_codubiactual;
  String mes;
  String anio;
  String doc_ofiorinombre;
  String doc_ofidesnombre;
  String doc_carorinombre;
  String doc_cardesnombre;
  String cte_tipdocentrega;
  String cte_tipdocdevolucion;
  String cte_tipdoctransferencia;
  String cte_tipdocbaja;
  String doc_glosa;
  String usuario;
  int inicio;
  int fin;
  String confirmados;
  String gestionant;
  String desactivo;
  String desbaja;
  String desofi;

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

  public String getDoc_codreg()
  {
    return doc_codreg;
  }

  public void setDoc_codreg(String newDoc_codreg)
  {
    doc_codreg = newDoc_codreg;
  }

  public String getDoc_tipdoc()
  {
    return doc_tipdoc;
  }

  public void setDoc_tipdoc(String newDoc_tipdoc)
  {
    doc_tipdoc = newDoc_tipdoc;
  }

  public int getDoc_numero()
  {
    return doc_numero;
  }

  public void setDoc_numero(int newDoc_numero)
  {
    doc_numero = newDoc_numero;
  }

  public int getDoc_devolucion()
  {
    return doc_devolucion;
  }

  public void setDoc_devolucion(int newDoc_devolucion)
  {
    doc_devolucion = newDoc_devolucion;
  }

  public String getDoc_fecha()
  {
    return doc_fecha;
  }

  public void setDoc_fecha(String newDoc_fecha)
  {
    doc_fecha = newDoc_fecha;
  }

  public String getDoc_codofiorigen()
  {
    return doc_codofiorigen;
  }

  public void setDoc_codofiorigen(String newDoc_codofiorigen)
  {
    doc_codofiorigen = newDoc_codofiorigen;
  }

  public String getDoc_codfunorigen()
  {
    return doc_codfunorigen;
  }

  public void setDoc_codfunorigen(String newDoc_codfunorigen)
  {
    doc_codfunorigen = newDoc_codfunorigen;
  }

  public String getDoc_codubiorigen()
  {
    return doc_codubiorigen;
  }

  public void setDoc_codubiorigen(String newDoc_codubiorigen)
  {
    doc_codubiorigen = newDoc_codubiorigen;
  }

  public String getDoc_codfinorigen()
  {
    return doc_codfinorigen;
  }

  public void setDoc_codfinorigen(String newDoc_codfinorigen)
  {
    doc_codfinorigen = newDoc_codfinorigen;
  }

  public String getDoc_codfin()
  {
    return doc_codfin;
  }

  public void setDoc_codfin(String newDoc_codfin)
  {
    doc_codfin = newDoc_codfin;
  }

  public String getDoc_codpryorigen()
  {
    return doc_codpryorigen;
  }

  public void setDoc_codpryorigen(String newDoc_codpryorigen)
  {
    doc_codpryorigen = newDoc_codpryorigen;
  }

  public String getDoc_codofidestino()
  {
    return doc_codofidestino;
  }

  public void setDoc_codofidestino(String newDoc_codofidestino)
  {
    doc_codofidestino = newDoc_codofidestino;
  }

  public String getDoc_codfundestino()
  {
    return doc_codfundestino;
  }

  public void setDoc_codfundestino(String newDoc_codfundestino)
  {
    doc_codfundestino = newDoc_codfundestino;
  }

  public String getDoc_codubidestino()
  {
    return doc_codubidestino;
  }

  public void setDoc_codubidestino(String newDoc_codubidestino)
  {
    doc_codubidestino = newDoc_codubidestino;
  }

  public String getDoc_codfindestino()
  {
    return doc_codfindestino;
  }

  public void setDoc_codfindestino(String newDoc_codfindestino)
  {
    doc_codfindestino = newDoc_codfindestino;
  }

  public String getDoc_codprydestino()
  {
    return doc_codprydestino;
  }

  public void setDoc_codprydestino(String newDoc_codprydestino)
  {
    doc_codprydestino = newDoc_codprydestino;
  }

  public String getDoc_observacion()
  {
    return doc_observacion;
  }

  public void setDoc_observacion(String newDoc_observacion)
  {
    doc_observacion = newDoc_observacion;
  }

  public String getDoc_inconfirma()
  {
    return doc_inconfirma;
  }

  public void setDoc_inconfirma(String newDoc_inconfirma)
  {
    doc_inconfirma = newDoc_inconfirma;
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

  public int getDdo_item()
  {
    return ddo_item;
  }

  public void setDdo_item(int newDdo_item)
  {
    ddo_item = newDdo_item;
  }

  public String getDdo_codrubactual()
  {
    return ddo_codrubactual;
  }

  public void setDdo_codrubactual(String newDdo_codrubactual)
  {
    ddo_codrubactual = newDdo_codrubactual;
  }

  public String getDdo_codregactual()
  {
    return ddo_codregactual;
  }

  public void setDdo_codregactual(String newDdo_codregactual)
  {
    ddo_codregactual = newDdo_codregactual;
  }

  public int getDdo_codigo()
  {
    return ddo_codigo;
  }

  public void setDdo_codigo(int newDdo_codigo)
  {
    ddo_codigo = newDdo_codigo;
  }

  public String getDoc_funorinombre()
  {
    return doc_funorinombre;
  }

  public void setDoc_funorinombre(String newDoc_funorinombre)
  {
    doc_funorinombre = newDoc_funorinombre;
  }

  public String getDoc_fundesnombre()
  {
    return doc_fundesnombre;
  }

  public void setDoc_fundesnombre(String newDoc_fundesnombre)
  {
    doc_fundesnombre = newDoc_fundesnombre;
  }

  public String getDoc_feccierre()
  {
    return doc_feccierre;
  }

  public void setDoc_feccierre(String newDoc_feccierre)
  {
    doc_feccierre = newDoc_feccierre;
  }

  public String getDoc_codregdestino()
  {
    return doc_codregdestino;
  }

  public void setDoc_codregdestino(String newDoc_codregdestino)
  {
    doc_codregdestino = newDoc_codregdestino;
  }

  public String getDoc_regdescripcion()
  {
    return doc_regdescripcion;
  }

  public void setDoc_regdescripcion(String newDoc_regdescripcion)
  {
    doc_regdescripcion = newDoc_regdescripcion;
  }

  public String getDoc_findescripcion()
  {
    return doc_findescripcion;
  }

  public void setDoc_findescripcion(String newDoc_findescripcion)
  {
    doc_findescripcion = newDoc_findescripcion;
  }

  public String getDdo_codmot()
  {
    return ddo_codmot;
  }

  public void setDdo_codmot(String newDdo_codmot)
  {
    ddo_codmot = newDdo_codmot;
  }

  public String getDdo_codofiactual()
  {
    return ddo_codofiactual;
  }

  public void setDdo_codofiactual(String newDdo_codofiactual)
  {
    ddo_codofiactual = newDdo_codofiactual;
  }

  public String getDdo_codubiactual()
  {
    return ddo_codubiactual;
  }

  public void setDdo_codubiactual(String newDdo_codubiactual)
  {
    ddo_codubiactual = newDdo_codubiactual;
  }  
  
  public String getMes()
  {
    return mes;
  }

  public void setMes(String newMes)
  {
    mes = newMes;
  }

  public String getAnio()
  {
    return anio;
  }

  public void setAnio(String newAnio)
  {
    anio = newAnio;
  }

  public String getDoc_ofiorinombre()
  {
    return doc_ofiorinombre;
  }

  public void setDoc_ofiorinombre(String newDoc_ofiorinombre)
  {
    doc_ofiorinombre = newDoc_ofiorinombre;
  }

  public String getDoc_ofidesnombre()
  {
    return doc_ofidesnombre;
  }

  public void setDoc_ofidesnombre(String newDoc_ofidesnombre)
  {
    doc_ofidesnombre = newDoc_ofidesnombre;
  }

  public String getDoc_carorinombre()
  {
    return doc_carorinombre;
  }

  public void setDoc_carorinombre(String newDoc_carorinombre)
  {
    doc_carorinombre = newDoc_carorinombre;
  }

  public String getDoc_cardesnombre()
  {
    return doc_cardesnombre;
  }

  public void setDoc_cardesnombre(String newDoc_cardesnombre)
  {
    doc_cardesnombre = newDoc_cardesnombre;
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

  public String getCte_tipdocbaja()
  {
    return cte_tipdocbaja;
  }

  public void setCte_tipdocbaja(String newCte_tipdocbaja)
  {
    cte_tipdocbaja = newCte_tipdocbaja;
  }

  public String getDoc_glosa()
  {
    return doc_glosa;
  }

  public void setDoc_glosa(String newDoc_glosa)
  {
    doc_glosa = newDoc_glosa;
  }

  public String getUsuario()
  {
    return usuario;
  }

  public void setUsuario(String newUsuario)
  {
    usuario = newUsuario;
  }

  public int getInicio()
  {
    return inicio;
  }

  public void setInicio(int newInicio)
  {
    inicio = newInicio;
  }

  public int getFin()
  {
    return fin;
  }

  public void setFin(int newFin)
  {
    fin = newFin;
  }

  public String getConfirmados()
  {
    return confirmados;
  }

  public void setConfirmados(String newConfirmados)
  {
    confirmados = newConfirmados;
  }

  public String getGestionant()
  {
    return gestionant;
  }

  public void setGestionant(String newGestionant)
  {
    gestionant = newGestionant;
  }  
  public String getDesactivo()
  {
    return desactivo;
  }

  public void setDesactivo(String newDesactivo)
  {
    desactivo = newDesactivo;
  }
  public String getDesbaja()
  {
    return desbaja;
  }

  public void setDesbaja(String newDesbaja)
  {
    desbaja = newDesbaja;
  } 
  public String getDesofi()
  {
    return desofi;
  }

  public void setDesofi(String newDesofi)
  {
    desofi = newDesofi;
  }   
}