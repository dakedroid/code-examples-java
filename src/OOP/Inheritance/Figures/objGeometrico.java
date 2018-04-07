/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Inheritance.Figures;

import javax.swing.*;

/**
 *
 * @author Dake10
 */
public class objGeometrico {

    static double px, py;
    static String printCentro;

    public objGeometrico(double x, double y) {
        px = x;
        py = y;
    }

    public objGeometrico() {
        px = py = 0;
    }

    public void imprimirCentro() {
        //System.out.pintln("(" +px+"+py+"+")");

        JOptionPane.showMessageDialog(null, "(" + px + "+" + py + ")");
    }

    public static String getCentro() {
        printCentro = "(" + px + "+" + py + ")";
        return printCentro;
    }
}
