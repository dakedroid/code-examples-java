/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Constructors.CalculateRadius;

import javax.swing.JOptionPane;

class Circle {

    static int radio;
    static double PI;

    Circle(int r) {
        PI = Math.PI;
        radio = r;
    }

    static int leeradio() {
        int r = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));
        return r;
    }

    static double calArea() {
        double resultado;
        resultado = PI * Math.pow(radio, 2);
        return resultado;
    }

    static void imprimir(double resultado) {
        JOptionPane.showMessageDialog(null, "El radio es " + resultado);
    }

    public static void main(String arg[]) {
        int r = leeradio();
        Circle r1 = new Circle(r);
        double resultado = calArea();
        imprimir(resultado);

    }

}
