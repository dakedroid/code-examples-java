package OOP.Constructors.Functions;

import javax.swing.*;

public class Functions {

    public static double A, B, C;

    public Functions(double a, double b, double c) {
        A = a;
        B = b;
        C = a;
    }

    public static double punto1() {
        double potb = Math.pow(B, 2);
        double valor1 = -1 * (4 * A * C);
        double raiz = Math.sqrt(potb - valor1);
        double X1 = ((-1 * B) + raiz) / (2 * A);
        return X1;

    }

    public static double punto2() {
        double potb = Math.pow(B, 2);
        double valor1 = -1 * (4 * A * C);
        double raiz = Math.sqrt(potb - valor1);
        double X2 = ((-1 * B) - raiz) / (2 * A);
        return X2;
    }

    public static void imprime(double X1, double X2) {
        JOptionPane.showMessageDialog(null, "El resultado de X1 es igual a: " + X1 + "\nEl resultado de X2 es igual a: " + X2);
    }

    public static void main(String args[]) {
        double a, b, c;
        a = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor de a"));
        b = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor de b"));
        c = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor de c"));
        Functions obj = new Functions(a, b, c);
        double X1 = punto1();
        double X2 = punto2();
        obj.imprime(X1, X2);
    }

}
