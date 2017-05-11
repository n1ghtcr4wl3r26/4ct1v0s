package ActivosFijos;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class ActivosDetalleForm extends ActionForm 
{
  String codrub;
  String codreg;
  int codigo;
  String codgrp;
  String codpar;
  String codofi;
  String codfun;
  String codubi;
  String codfin;
  String codpry;
  String codmot;
  String feccompra;
  double tipcam;
  double tipufv;
  String umanejo;
  String descripcion;
  String desadicional;
  String proveedor;
  String marca;
  String modelo;
  String serie1;
  String serie2;
  String docreferencia;
  String fecreferencia;
  String placa;
  String valcobol;
  String valcodol;
  String valcoufv;
  String fecbaja;
  String ordencompra;
  String numfactura;
  String numcomprobante;
  String codanterior;
  String indetiqueta;
  String fecha;
  int vidaut;
  String estadoactivo;
  String descripcionestado;
  String desestado;
  String indepreciacion;
  String numdocumento;
  String accesorios;
  String docrefotro;
  String aniofabricacion;
  String color;
  String procedencia;
  String gobmunicipal;
  int corel;
  int numrevaluo;
  String ceros;
  String descodgrp;

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

  public String getcodgrp()
  {
    return codgrp;
  }

  public void setcodgrp(String newcodgrp)
  {
    codgrp = newcodgrp;
  }

  public String getcodpar()
  {
    return codpar;
  }

  public void setcodpar(String newcodpar)
  {
    codpar = newcodpar;
  }

  public String getcodofi()
  {
    return codofi;
  }

  public void setcodofi(String newcodofi)
  {
    codofi = newcodofi;
  }

  public String getcodfun()
  {
    return codfun;
  }

  public void setcodfun(String newcodfun)
  {
    codfun = newcodfun;
  }

  public String getcodubi()
  {
    return codubi;
  }

  public void setcodubi(String newcodubi)
  {
    codubi = newcodubi;
  }

  public String getcodfin()
  {
    return codfin;
  }

  public void setcodfin(String newcodfin)
  {
    codfin = newcodfin;
  }

  public String getcodpry()
  {
    return codpry;
  }

  public void setcodpry(String newcodpry)
  {
    codpry = newcodpry;
  }

  public String getcodmot()
  {
    return codmot;
  }

  public void setcodmot(String newcodmot)
  {
    codmot = newcodmot;
  }

  public String getfeccompra()
  {
    return feccompra;
  }

  public void setfeccompra(String newfeccompra)
  {
    feccompra = newfeccompra;
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

  public String getumanejo()
  {
    return umanejo;
  }

  public void setumanejo(String newumanejo)
  {
    umanejo = newumanejo;
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

  public String getmarca()
  {
    return marca;
  }

  public void setmarca(String newmarca)
  {
    marca = newmarca;
  }

  public String getmodelo()
  {
    return modelo;
  }

  public void setmodelo(String newmodelo)
  {
    modelo = newmodelo;
  }

  public String getserie1()
  {
    return serie1;
  }

  public void setserie1(String newserie1)
  {
    serie1 = newserie1;
  }

  public String getserie2()
  {
    return serie2;
  }

  public void setserie2(String newserie2)
  {
    serie2 = newserie2;
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

  public String getplaca()
  {
    return placa;
  }

  public void setplaca(String newplaca)
  {
    placa = newplaca;
  }

  public String getvalcobol()
  {
    return valcobol;
  }

  public void setvalcobol(String newvalcobol)
  {
    valcobol = newvalcobol;
  }

  public String getvalcodol()
  {
    return valcodol;
  }

  public void setvalcodol(String newvalcodol)
  {
    valcodol = newvalcodol;
  }

  public String getvalcoufv()
  {
    return valcoufv;
  }

  public void setvalcoufv(String newvalcoufv)
  {
    valcoufv = newvalcoufv;
  }

  public String getfecbaja()
  {
    return fecbaja;
  }

  public void setfecbaja(String newfecbaja)
  {
    fecbaja = newfecbaja;
  }

  public String getordencompra()
  {
    return ordencompra;
  }

  public void setordencompra(String newordencompra)
  {
    ordencompra = newordencompra;
  }

  public String getnumfactura()
  {
    return numfactura;
  }

  public void setnumfactura(String newnumfactura)
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

  public String getcodanterior()
  {
    return codanterior;
  }

  public void setcodanterior(String newcodanterior)
  {
    codanterior = newcodanterior;
  }

  public String getindetiqueta()
  {
    return indetiqueta;
  }

  public void setindetiqueta(String newindetiqueta)
  {
    indetiqueta = newindetiqueta;
  }

  public String getfecha()
  {
    return fecha;
  }

  public void setfecha(String newFecha)
  {
    fecha = newFecha;
  }

  public int getvidaut()
  {
    return vidaut;
  }

  public void setvidaut(int newVidaut)
  {
    vidaut = newVidaut;
  }

  public String getestadoactivo()
  {
    return estadoactivo;
  }

  public void setestadoactivo(String newEstadoactivo)
  {
    estadoactivo = newEstadoactivo;
  }

  public String getdesestado()
  {
    return desestado;
  }

  public void setdesestado(String newDesestado)
  {
    desestado = newDesestado;
  }

  public String getindepreciacion()
  {
    return indepreciacion;
  }

  public void setindepreciacion(String newIndepreciacion)
  {
    indepreciacion = newIndepreciacion;
  }

  public String getnumdocumento()
  {
    return numdocumento;
  }

  public void setnumdocumento(String newNumdocumento)
  {
    numdocumento = newNumdocumento;
  }

  public String getaccesorios()
  {
    return accesorios;
  }

  public void setaccesorios(String newaccesorios)
  {
    accesorios = newaccesorios;
  }

  public String getdocrefotro()
  {
    return docrefotro;
  }

  public void setdocrefotro(String newdocrefotro)
  {
    docrefotro = newdocrefotro;
  }

  public String getaniofabricacion()
  {
    return aniofabricacion;
  }

  public void setaniofabricacion(String newaniofabricacion)
  {
    aniofabricacion = newaniofabricacion;
  }

  public String getcolor()
  {
    return color;
  }

  public void setcolor(String newcolor)
  {
    color = newcolor;
  }

  public String getprocedencia()
  {
    return procedencia;
  }

  public void setprocedencia(String newprocedencia)
  {
    procedencia = newprocedencia;
  }

  public String getgobmunicipal()
  {
    return gobmunicipal;
  }

  public void setgobmunicipal(String newgobmunicipal)
  {
    gobmunicipal = newgobmunicipal;
  }

  public int getCorel()
  {
    return corel;
  }

  public void setCorel(int newCorel)
  {
    corel = newCorel;
  }

  public int getNumrevaluo()
  {
    return numrevaluo;
  }

  public void setNumrevaluo(int newNumrevaluo)
  {
    numrevaluo = newNumrevaluo;
  }

  public String getCeros()
  {
    return ceros;
  }

  public void setCeros(String newCeros)
  {
    ceros = newCeros;
  }

  public String getDescodgrp()
  {
    return descodgrp;
  }

  public void setDescodgrp(String newDescodgrp)
  {
    descodgrp = newDescodgrp;
  }

  public String getDescripcionestado()
  {
    return descripcionestado;
  }

  public void setDescripcionestado(String newDescripcionestado)
  {
    descripcionestado = newDescripcionestado;
  }

}