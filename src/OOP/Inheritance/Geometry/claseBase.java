package OOP.Inheritance.Geometry;

import javax.swing.*;

public class claseBase {

    static int base, altura;

    static double area;

    public claseBase(int BASE, int ALTURA) {
        base = BASE;
        altura = ALTURA;
    }

    public static int leerBase() {
        int BASE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
        return BASE;
    }

    public static int leerAltura() {
        int ALTURA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
        return ALTURA;
    }

    public void imprimirArea(double area) {

        JOptionPane.showMessageDialog(null, "El area es: " + area);
    }

}
