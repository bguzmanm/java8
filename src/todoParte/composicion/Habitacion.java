package todoParte.composicion;

public class Habitacion {
  private String tipo;

  public Habitacion() {
    this.tipo = "Dormitorio";
  }

  public String obtenerDescripcion(){
    return "Tipo: " + tipo;
  }

}
