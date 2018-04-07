package OOP.Interfaces.FiguresArea;

import javax.swing.JOptionPane;

/**
 *
 * @author Dake10
 */
public class Cuadrado extends FiguraGeometrica implements Figura {

    public Cuadrado(double lado) {
        super(lado);
    }

    public String Nombre() {
        cad += "Nombre: Cuadrado\n";
        return "Cuadrado";
    }

    public double calcularArea() {
        cad += "Area: " + (altura * altura) + "\n";
        return (altura * altura);
    }

    public double calcularPerimetro() {
        cad += "Perimetro: " + (4 * altura) + "\nDibujo\n";
        return (4 * altura);
    }

    public void dibujarTxt() {
        for (int fila = 1; fila <= altura; fila++) {
            for (int col = 1; col <= altura; col++) {
                System.out.print("*  ");
                cad += "*  ";
            }
            System.out.println();
            cad += "\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
}
