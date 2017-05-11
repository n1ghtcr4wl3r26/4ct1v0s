package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class MejorasRebajasDetalleForm extends ActionForm 
{
  String codrub;
  String codreg;
  int codigo;
  String inmejreb;
  String fecha;
  double tipcam;
  double tipufv;
  String descripcion;
  String desadicional;
  String proveedor;
  String docreferencia;
  String fecreferencia;
  double valbol;
  double valdol;
  double valufv;
  int numfactura;
  String numcomprobante;
  int corel;
  String marca;
  String modelo;
  String serie;
  String ordencompra;
  String rfecha;
  int vidaut;
  String estadoactivo;
  String desestado;
  String numdocumento;
  String desactivo;
  
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

  public String getinmejreb()
  {
    return inmejreb;
  }

  public void setinmejreb(String newinmejreb)
  {
    inmejreb = newinmejreb;
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

  public String getdescripcion()
  {
    return descripcion;
  }

  public void setdescripcion(String newdescripcion)
  {
    descripcion = newdescripcion;
  }

  public String getdesadicional()
  {
    return desadicional;
  }

  public void setdesadicional(String newdesadicional)
  {
    desadicional = newdesadicional;
  }

  public String getproveedor()
  {
    return proveedor;
  }

  public void setproveedor(String newproveedor)
  {
    proveedor = newproveedor;
  }

  public String getdocreferencia()
  {
    return docreferencia;
  }

  public void setdocreferencia(String newdocreferencia)
  {
    docreferencia = newdocreferencia;
  }

  public String getfecreferencia()
  {
    return fecreferencia;
  }

  public void setfecreferencia(String newfecreferencia)
  {
    fecreferencia = newfecreferencia;
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

  public int getnumfactura()
  {
    return numfactura;
  }

  public void setnumfactura(int newnumfactura)
  {
    numfactura = newnumfactura;
  }

  public String getnumcomprobante()
  {
    return numcomprobante;
  }

  public void setnumcomprobante(String newnumcomprobante)
  {
    numcomprobante = newnumcomprobante;
  }

  public int getcorel()
  {
    return corel;
  }

  public void setcorel(int newCorel)
  {
    corel = newCorel;
  }

  public String getmarca()
  {
    return marca;
  }

  public void setmarca(String newMarca)
  {
    marca = newMarca;
  }

  public String getmodelo()
  {
    return modelo;
  }

  public void setmodelo(String newModelo)
  {
    modelo = newModelo;
  }

  public String getserie()
  {
    return serie;
  }

  public void setserie(String newSerie)
  {
    serie = newSerie;
  }

  public String getordencompra()
  {
    return ordencompra;
  }

  public void setordencompra(String newOrdencompra)
  {
    ordencompra = newOrdencompra;
  }

  public String getRfecha()
  {
    return rfecha;
  }

  public void setRfecha(String newRfecha)
  {
    rfecha = newRfecha;
  }

  public int getVidaut()
  {
    return vidaut;
  }

  public void setVidaut(int newVidaut)
  {
    vidaut = newVidaut;
  }

  public String getEstadoactivo()
  {
    return estadoactivo;
  }

  public void setEstadoactivo(String newEstadoactivo)
  {
    estadoactivo = newEstadoactivo;
  }

  public String getDesestado()
  {
    return desestado;
  }

  public void setDesestado(String newDesestado)
  {
    desestado = newDesestado;
  }

  public String getNumdocumento()
  {
    return numdocumento;
  }

  public void setNumdocumento(String newNumdocumento)
  {
    numdocumento = newNumdocumento;
  }

  public String getDesactivo()
  {
    return desactivo;
  }

  public void setDesactivo(String newDesactivo)
  {
    desactivo = newDesactivo;
  }
}