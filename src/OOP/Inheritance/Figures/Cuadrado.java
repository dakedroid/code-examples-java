/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Inheritance.Figures;

/**
 *
 * @author Dake10
 */
public class Cuadrado extends objGeometrico {

    Object getCentro;

    public Cuadrado(double xc, double yc, double t1, double t2) {
        super(xc, yc);
        x1 = t1;
        y1 = t2;
    }

    public double area() {
        double a, b;
        a = px - x1;
        b = py - y1;
        return 2 * (a * a + b * b);
    }
    private double x1, y1;

}
