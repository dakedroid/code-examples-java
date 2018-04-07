/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Inheritance.Worker;

/**
 *
 * @author Dake10
 */
class Consultor extends Trabajador {

    private int horas;
    private double tarifa;

    //CONSTRUCTOR
    public Consultor(String nombre, String NSS, int horas, double tarifa) {
        super(nombre, NSS);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    //paga por horas 
    public double calcularPaga() {
        return horas * tarifa;
    }

    //TOSTRING 
    public String toString() {
        return " Consultor " + super.toString();
    }

}
