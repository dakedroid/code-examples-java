package OOP.Interfaces.FiguresArea;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dake10
 */
public class Main {

    public static void Menu() {
        double x, y, z;
        int i = 1;
        String n = "Nombre: ", a = "Area: ", p = "Perimetro: ";
        while (i == 1) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea calcular" + "\n1)Cuadrado \n2)Triangulo \n3)Rectangulo"));
            switch (op) {
                case 1: {
                    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
                    Cuadrado c = new Cuadrado(x);
                    System.out.println(n + c.Nombre());
                    System.out.println(a + c.calcularArea());
                    System.out.println(p + c.calcularPerimetro());
                    c.dibujarTxt();
                    break;
                }
                case 2: {
                    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la hipotenusa"));
                    y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del cateto opuesto"));
                    z = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del cateto adyacente"));
                    Triangulo t = new Triangulo(x, y, z);
                    System.out.println(n + t.Nombre());
                    System.out.println(a + t.calcularArea());
                    System.out.println(p + t.calcularPerimetro());
                    t.dibujarTxt();
                    break;

                }
                case 3: {
                    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base"));
                    y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura"));
                    Rectangulo r = new Rectangulo(x, y);
                    System.out.println(n + r.Nombre());
                    System.out.println(a + r.calcularArea());
                    System.out.println(p + r.calcularPerimetro());
                    r.dibujarTxt();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                    break;
                }
            }
            i = Integer.parseInt(JOptionPane.showInputDialog("Desea realizar otra operacion\n1)Si \n2)No"));
            if (i != 1) {
                System.exit(0);
            }
        }

    }

    public static void main(String arg[]) {
        Menu();
    }
}
