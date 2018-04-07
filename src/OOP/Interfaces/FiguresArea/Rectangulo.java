package OOP.Interfaces.FiguresArea;

import javax.swing.JOptionPane;

/**
 *
 * @author Dake10
 */
public class Rectangulo extends FiguraGeometrica implements Figura {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public String Nombre() {
        cad += "Nombre: Triangulo\n";
        return "Rectangulo";
    }

    public double calcularArea() {
        cad += "Area: " + (base * altura) + "\n";
        return (base * altura);
    }

    public double calcularPerimetro() {
        cad += "Perimetro: " + (2 * base + 2 * altura) + "\nDibujo\n";
        return (2 * base + 2 * altura);
    }

    public void dibujarTxt() {
        for (int fila = 1; fila <= altura; fila++) {
            for (int col = 1; col <= base; col++) {
                System.out.print("*  ");
                cad += "*  ";
            }
            System.out.println();
            cad += "\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
}
