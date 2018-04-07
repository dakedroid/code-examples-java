package OOP.Inheritance.PeopleList;

/**
 *
 * @author Dake10
 */
public class Trabajador extends Persona {

    private int nss;
    private int dni;
    private String nombreEmpresa;

    public Trabajador(String nombre, String apellidos, String curp, String fechaNacimiento, int nss, int dni, String nombreEmpresa) {
        super(nombre, apellidos, curp, fechaNacimiento);
        this.nss = nss;
        this.dni = dni;
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return this.nss + " | " + this.dni + " | " + this.nombreEmpresa + " | ";
    }
}
