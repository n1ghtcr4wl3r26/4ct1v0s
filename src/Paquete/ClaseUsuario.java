package Paquete;

public class ClaseUsuario 
{
  private String usuario;
  private String nit;
  private String aduana;
  private String aux;
  private String sistema;
  private String perfil;
  private ClaseOpcion[] lopcion;

  public ClaseUsuario()
  {
  }

  public String getUsuario()
  {
    return usuario;
  }

  public void setUsuario(String newUsuario)
  {
    usuario = newUsuario;
  }

  public String getNit()
  {
    return nit;
  }

  public void setNit(String newNit)
  {
    nit = newNit;
  }

  public String getAduana()
  {
    return aduana;
  }

  public void setAduana(String newAduana)
  {
    aduana = newAduana;
  }

  public String getAux()
  {
    return aux;
  }

  public void setAux(String newAux)
  {
    aux = newAux;
  }

  public String getSistema()
  {
    return sistema;
  }

  public void setSistema(String newSistema)
  {
    sistema = newSistema;
  }

  public String getPerfil()
  {
    return perfil;
  }

  public void setPerfil(String newPerfil)
  {
    perfil = newPerfil;
  }

  public ClaseOpcion[] getLopcion()
  {
    return lopcion;
  }

   public ClaseOpcion getLopcion( int index )
  {
    return lopcion[ index ];
  }

  public void setLopcion( ClaseOpcion[] newLopcion )
  {
    lopcion = newLopcion;
  }

  public void setLopcion( ClaseOpcion newLopcion, int i )
  {
    lopcion[i] = newLopcion;
  }

  public void setLopcion( int i )
  {
    lopcion = new ClaseOpcion[ i ];
  }
}