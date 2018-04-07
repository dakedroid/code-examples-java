/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Inheritance.Figures;

public class Circulo extends objGeometrico {

    Object getCentro;

    public Circulo(double x, double y, double r) {
        super(x, y); //Llamaa constructor de la base
        radio = r;

    }

    public double area() {

        return PI * radio * radio;
    }
    private double radio;
    private final double PI = Math.PI;

}
