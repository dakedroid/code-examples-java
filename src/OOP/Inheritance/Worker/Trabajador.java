package OOP.Inheritance.Worker;

import java.util.Date;

public class Trabajador {

    private String nombre, puesto, direccion, telefono;
    private Date fecha_nacimiento, fecha_contrato;
    private String NSS;

    public Trabajador(String nombre, String NSS) {
        this.nombre = nombre;
        this.NSS = NSS;

    }

    //get y set
    //Comparacion de objetos
    public boolean equals(Trabajador t) {
        return this.NSS.equals(t.NSS);

    }

    public String toString() {
        return nombre + " (NSS " + NSS + ") ";
    }

}
