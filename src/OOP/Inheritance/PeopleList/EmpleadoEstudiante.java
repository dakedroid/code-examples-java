package OOP.Inheritance.PeopleList;

/**
 *
 * @author Dake10
 */
public class EmpleadoEstudiante extends Persona {

    private String mayorEdad;

    public EmpleadoEstudiante(String nombre, String apellidos, String curp, String fechaNacimiento, int numeroControl, double promedioG, String escuela, int nss, int dni, String nombreEmpresa, String mayorEdad) {
        super(nombre, apellidos, curp, fechaNacimiento);
        this.mayorEdad = mayorEdad;
    }

    public String toString() {
        return mayorEdad + " | ";
    }
}
