package Paquete;

public class ClaseOpcion 
{
  private String codopc;
  private String desc;
  private String codant;
  private String accion;

  public ClaseOpcion()
  {
  }

  public ClaseOpcion( String sOpc,  String sDsc, String sAnt, String sAcc )
  {
    this.codopc = sOpc;
    this.desc = sDsc;
    this.codant = sAnt;
    this.accion = sAcc;
  }

  public String getCodopc()
  {
    return codopc;
  }

  public void setCodopc(String newCodopc)
  {
    codopc = newCodopc;
  }

  public String getDesc()
  {
    return desc;
  }

  public void setDesc(String newDesc)
  {
    desc = newDesc;
  }

  public String getCodant()
  {
    return codant;
  }

  public void setCodant(String newCodant)
  {
    codant = newCodant;
  }

  public String getAccion()
  {
    return accion;
  }

  public void setAccion(String newAccion)
  {
    accion = newAccion;
  }
}