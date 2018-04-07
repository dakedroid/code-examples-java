package OOP.Interfaces.FiguresArea;

import javax.swing.JOptionPane;

/**
 *
 * @author Dake10
 */
public class Triangulo extends FiguraGeometrica implements Figura {

    public Triangulo(double h, double co, double ca) {
        super(h, co, ca);
    }

    public String Nombre() {
        cad += "Nombre: Triangulo\n";
        return "Triangulo";
    }

    public double calcularArea() {
        cad += "Area: " + (co * ca) / 2 + "\n";
        return (co * ca) / 2;
    }

    public double calcularPerimetro() {
        cad += "Perimetro: " + (co + ca + h) + "\nDibujo\n";
        return (co + ca + h);
    }

    public void dibujarTxt() {
        for (int fila = 1; fila <= ca; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("*  ");
                cad += "*  ";
            }
            System.out.println();
            cad += "\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
}
