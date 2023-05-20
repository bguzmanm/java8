package asociacion;

import java.util.ArrayList;

public class Propietario {

  private String nombre;
  private String apellido;
  private String direccion;

  private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

  public Propietario() {
  }

  public Propietario(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public ArrayList<Vehiculo> getVehiculos() {
    return vehiculos;
  }

  public void addVehiculo(Vehiculo vehiculo){
    vehiculos.add(vehiculo);
  }
  public void removeVehiculo(Vehiculo vehiculo){
    vehiculos.remove(vehiculo);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return "Propietario{" +
            "nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", direccion='" + direccion + '\'' +
            '}';
  }
}
