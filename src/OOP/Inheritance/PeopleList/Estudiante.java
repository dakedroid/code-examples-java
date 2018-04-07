package OOP.Inheritance.PeopleList;

/**
 *
 * @author Dake10
 */
public class Estudiante extends Persona {

    private int numeroControl;
    private double promedioG;
    private String escuela;

    public Estudiante(String nombre, String apellidos, String curp, String fechaNacimiento, int numeroControl, double promedioG, String escuela) {
        super(nombre, apellidos, curp, fechaNacimiento);
        this.numeroControl = numeroControl;
        this.promedioG = promedioG;
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.numeroControl + " | " + this.promedioG + " | " + this.escuela + " | ";
    }
}
