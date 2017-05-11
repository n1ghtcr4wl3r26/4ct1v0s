package ActivosFijos;

public class ClaseOpcion
{
  private String nombre;
  private String descripcion;
  private String nivel;

  public ClaseOpcion()
  {
  }

  public ClaseOpcion ( String sOpcion, String sDesc, String sNivel )
  {
    this.nombre = sOpcion;
    this.descripcion = sDesc;
    this.nivel = sNivel;
  }

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion(String newDescripcion)
  {
    descripcion = newDescripcion;
  }

  public String getNivel()
  {
    return nivel;
  }

  public void setNivel(String newNivel)
  {
    nivel = newNivel;
  }
}