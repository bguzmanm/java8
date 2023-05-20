package asociacion;

public class Vehiculo {
  private String marca;
  private String modelo;
  private int ano;
  private String color;

  private Propietario propietario;

  public Vehiculo() {
  }

  public Vehiculo(String marca, String modelo, int ano, String color) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.color = color;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Propietario getPropietario() {
    return propietario;
  }

  public void setPropietario(Propietario propietario) {
    this.propietario = propietario;
  }

  @Override
  public String toString() {
    return "Vehiculo{" +
            "marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", ano=" + ano +
            ", color='" + color + '\'' +
            '}';
  }
}
