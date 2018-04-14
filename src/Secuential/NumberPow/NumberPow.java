package Secuential.NumberPow;


import javax.swing.*;

public class NumberPow {

    public double c_x1(double a, double b, double c) {
        double x1, bn, mac, div, raiz1, raiz2, raizf, x1p;
        bn = b * -1;
        mac = Math.pow(b, 2);
        raiz1 = ((-4 * a) * c);
        raiz2 = raiz1 + mac;
        raizf = Math.sqrt(raiz2);
        x1p = bn + raizf;
        div = 2 * a;

        x1 = x1p / div;
        return x1;
    }

    public double c_x2(double a, double b, double c) {
        double x2, bn, mac, div, raiz1, raiz2, raizf, x1p;
        bn = b * -1;
        mac = Math.pow(b, 2);
        raiz1 = ((-4 * a) * c);
        raiz2 = raiz1 + mac;
        raizf = Math.sqrt(raiz2);
        x1p = bn - raizf;
        div = 2 * a;
        x2 = x1p / div;
        return x2;
    }

    public static void main(String args[]) {
        double a, b, c, x1, x2;
        a = Double.valueOf(JOptionPane.showInputDialog("Ingresa el numero a "));
        b = Double.valueOf(JOptionPane.showInputDialog("Ingresa el numeo b "));
        c = Double.valueOf(JOptionPane.showInputDialog("Ingresa el numero c "));
        NumberPow obj = new NumberPow();
        x1 = obj.c_x1(a, b, c);
        x2 = obj.c_x2(a, b, c);
        JOptionPane.showMessageDialog(null, " x1 es: " + x1);
        JOptionPane.showMessageDialog(null, " x2 es: " + x2);
    }

}
