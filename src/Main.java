import asociacion.Propietario;
import asociacion.Vehiculo;
import todoParte.agregacion.Direccion;
import todoParte.agregacion.Estudiante;
import todoParte.composicion.Casa;

public class Main {
  public static void main(String[] args) {
    //explicacionAsociacion();
    //explicacionAgregacion();
    explicacionComposicion();
  }

  public static void explicacionComposicion(){
    Casa casa = new Casa();

    System.out.println(casa.obtenerDescripcion());

  }

  public static void explicacionAgregacion(){

    Direccion direccion = new Direccion("Calle 1", "Rancagua");
    Estudiante estudiante = new Estudiante("Juanito", direccion);

    direccion.setCalle("Calle 2");
    direccion.setCiudad("Talca");

    System.out.println(estudiante.toString());

    /*estudiante = null;
    System.out.println(direccion);*/

    /*direccion = null;*/
    estudiante.setDireccion(null);
    System.out.println(estudiante);
  }



  public static void explicacionAsociacion(){
    Propietario propietario = new Propietario("Nombre Propietario 1", "Apellido Propietario 2");
    System.out.println(propietario);

    Vehiculo vehiculo = new Vehiculo("Chevrolet", "Spark", 2020, "Negro");
    System.out.println(vehiculo);

    propietario.addVehiculo(vehiculo);
    System.out.println("Propietario nombre: " + propietario.getNombre() +
            "\n tiene " + propietario.getVehiculos().size() + " vehiculos: " +
            propietario.getVehiculos());

    vehiculo.setPropietario(propietario);
    System.out.println("El vehiculo " + vehiculo.getMarca() + " modelo " + vehiculo.getModelo() + " pertenece a " + vehiculo.getPropietario().getNombre());
  }

}