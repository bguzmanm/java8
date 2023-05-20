package todoParte.composicion;

public class Casa {
  private Habitacion habitacion;

  public Casa() {
    this.habitacion = new Habitacion();
  }

  public String obtenerDescripcion(){
    return "Etssa casa tiene una habitacion " + habitacion.obtenerDescripcion();
  }
}
