/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Inheritance.Worker;

/**
 * @author Dake10
 */
public class Empleado extends Trabajador {

    private double sueldo;
    private double impuestos;
    private final int PAGAS = 14;

    //constructor
    public Empleado(String nombre, String NSS, double sueldo) {
        super(nombre, NSS);
        this.sueldo = sueldo;
        this.impuestos = 0.3 * sueldo;
    }

    //nomina 
    public double calcularPaga() {
        return (sueldo - impuestos) / PAGAS;
    }

    //TOSTRING
    public String toString() {
        return " Empleado " + super.toString();
    }

}
