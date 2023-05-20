package todoParte.agregacion;

public class Estudiante {
  private String nombre;
  private Direccion direccion;


  public Estudiante(String nombre, Direccion direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Direccion getDireccion() {
    return direccion;
  }

  public void setDireccion(Direccion direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return "Estudiante{" +
            "nombre='" + nombre + '\'' +
            ", direccion=" + direccion +
            '}';
  }
}
