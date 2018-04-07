package OOP.Inheritance.PeopleList;

import javax.swing.JOptionPane;

/**
 *
 * @author Dake10
 */
public class Persona implements Comparable {

    private String nombre;
    private String apellidos;
    private String curp;
    private String fechaNacimiento;

    public Persona(String nombre, String apellidos, String curp, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int compareTo(Object o) {
        Persona persona = (Persona) o;
        if (this.apellidos.compareToIgnoreCase(persona.apellidos) == 0) {
            if (this.nombre.compareToIgnoreCase(persona.nombre) == 0) {
                return this.curp.compareTo(persona.curp);
            } else {
                return this.nombre.compareToIgnoreCase(persona.nombre);
            }
        } else {
            return this.apellidos.compareToIgnoreCase(persona.apellidos);
        }
    }

    @Override
    public String toString() {
        return this.apellidos + " " + this.nombre + " | " + this.curp + " | " + this.fechaNacimiento + " | ";
    }
}
