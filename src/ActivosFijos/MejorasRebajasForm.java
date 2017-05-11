package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class MejorasRebajasForm extends ActionForm 
{
  String mre_codrub;
  String mre_codreg;
  int mre_codigo;
  String mre_inmejreb;
  String mre_fecha;
  double mre_tipcam;
  double mre_tipufv;
  String mre_descripcion;
  String mre_desadicional;
  String mre_proveedor;
  String mre_docreferencia;
  String mre_fecreferencia;
  double mre_valbol;
  double mre_valdol;
  double mre_valufv;
  int mre_numfactura;
  String mre_numcomprobante;
  private String boton;
  private int fila;
  private int operacion;
  private int opcion;
  int mre_corel;
  String mre_marca;
  String mre_modelo;
  String mre_serie;
  String mre_ordencompra;
  String mre_regdescripcion;
  String mre_rubdescripcion;
  String mre_codbarra;
  String rev_fecha;
  int rev_vidaut;
  String rev_estadoactivo;
  String rev_desestado;
  String rev_numdocumento;
  String mes;
  String anio;
  String act_descripcion;
  
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

  public String getMre_codrub()
  {
    return mre_codrub;
  }

  public void setMre_codrub(String newMre_codrub)
  {
    mre_codrub = newMre_codrub;
  }

  public String getMre_codreg()
  {
    return mre_codreg;
  }

  public void setMre_codreg(String newMre_codreg)
  {
    mre_codreg = newMre_codreg;
  }

  public int getMre_codigo()
  {
    return mre_codigo;
  }

  public void setMre_codigo(int newMre_codigo)
  {
    mre_codigo = newMre_codigo;
  }

  public String getMre_inmejreb()
  {
    return mre_inmejreb;
  }

  public void setMre_inmejreb(String newMre_inmejreb)
  {
    mre_inmejreb = newMre_inmejreb;
  }

  public String getMre_fecha()
  {
    return mre_fecha;
  }

  public void setMre_fecha(String newMre_fecha)
  {
    mre_fecha = newMre_fecha;
  }

  public double getMre_tipcam()
  {
    return mre_tipcam;
  }

  public void setMre_tipcam(double newMre_tipcam)
  {
    mre_tipcam = newMre_tipcam;
  }

  public double getMre_tipufv()
  {
    return mre_tipufv;
  }

  public void setMre_tipufv(double newMre_tipufv)
  {
    mre_tipufv = newMre_tipufv;
  }

  public String getMre_descripcion()
  {
    return mre_descripcion;
  }

  public void setMre_descripcion(String newMre_descripcion)
  {
    mre_descripcion = newMre_descripcion;
  }

  public String getMre_desadicional()
  {
    return mre_desadicional;
  }

  public void setMre_desadicional(String newMre_desadicional)
  {
    mre_desadicional = newMre_desadicional;
  }

  public String getMre_proveedor()
  {
    return mre_proveedor;
  }

  public void setMre_proveedor(String newMre_proveedor)
  {
    mre_proveedor = newMre_proveedor;
  }

  public String getMre_docreferencia()
  {
    return mre_docreferencia;
  }

  public void setMre_docreferencia(String newMre_docreferencia)
  {
    mre_docreferencia = newMre_docreferencia;
  }

  public String getMre_fecreferencia()
  {
    return mre_fecreferencia;
  }

  public void setMre_fecreferencia(String newMre_fecreferencia)
  {
    mre_fecreferencia = newMre_fecreferencia;
  }

  public double getMre_valbol()
  {
    return mre_valbol;
  }

  public void setMre_valbol(double newMre_valbol)
  {
    mre_valbol = newMre_valbol;
  }

  public double getMre_valdol()
  {
    return mre_valdol;
  }

  public void setMre_valdol(double newMre_valdol)
  {
    mre_valdol = newMre_valdol;
  }

  public double getMre_valufv()
  {
    return mre_valufv;
  }

  public void setMre_valufv(double newMre_valufv)
  {
    mre_valufv = newMre_valufv;
  }

  public int getMre_numfactura()
  {
    return mre_numfactura;
  }

  public void setMre_numfactura(int newMre_numfactura)
  {
    mre_numfactura = newMre_numfactura;
  }

  public String getMre_numcomprobante()
  {
    return mre_numcomprobante;
  }

  public void setMre_numcomprobante(String newMre_numcomprobante)
  {
    mre_numcomprobante = newMre_numcomprobante;
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

  public int getMre_corel()
  {
    return mre_corel;
  }

  public void setMre_corel(int newCorel)
  {
    mre_corel = newCorel;
  }

  public String getMre_marca()
  {
    return mre_marca;
  }

  public void setMre_marca(String newMarca)
  {
    mre_marca = newMarca;
  }

  public String getMre_modelo()
  {
    return mre_modelo;
  }

  public void setMre_modelo(String newModelo)
  {
    mre_modelo = newModelo;
  }

  public String getMre_serie()
  {
    return mre_serie;
  }

  public void setMre_serie(String newSerie)
  {
    mre_serie = newSerie;
  }

  public String getMre_ordencompra()
  {
    return mre_ordencompra;
  }

  public void setMre_ordencompra(String newOrdencompra)
  {
    mre_ordencompra = newOrdencompra;
  }

  public String getMre_regdescripcion()
  {
    return mre_regdescripcion;
  }

  public void setMre_regdescripcion(String newMre_regdescripcion)
  {
    mre_regdescripcion = newMre_regdescripcion;
  }

  public String getMre_rubdescripcion()
  {
    return mre_rubdescripcion;
  }

  public void setMre_rubdescripcion(String newMre_rubdescripcion)
  {
    mre_rubdescripcion = newMre_rubdescripcion;
  }

  public String getMre_codbarra()
  {
    return mre_codbarra;
  }

  public void setMre_codbarra(String newMre_codbarra)
  {
    mre_codbarra = newMre_codbarra;
  }

  public String getRev_fecha()
  {
    return rev_fecha;
  }

  public void setRev_fecha(String newRev_fecha)
  {
    rev_fecha = newRev_fecha;
  }

  public int getRev_vidaut()
  {
    return rev_vidaut;
  }

  public void setRev_vidaut(int newRev_vidaut)
  {
    rev_vidaut = newRev_vidaut;
  }

  public String getRev_estadoactivo()
  {
    return rev_estadoactivo;
  }

  public void setRev_estadoactivo(String newRev_estadoactivo)
  {
    rev_estadoactivo = newRev_estadoactivo;
  }

  public String getRev_desestado()
  {
    return rev_desestado;
  }

  public void setRev_desestado(String newRev_desestado)
  {
    rev_desestado = newRev_desestado;
  }

  public String getRev_numdocumento()
  {
    return rev_numdocumento;
  }

  public void setRev_numdocumento(String newRev_numdocumento)
  {
    rev_numdocumento = newRev_numdocumento;
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

  public String getAct_descripcion()
  {
    return act_descripcion;
  }

  public void setAct_descripcion(String newAct_descripcion)
  {
    act_descripcion = newAct_descripcion;
  }
}