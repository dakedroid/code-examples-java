package OOP.Interfaces.FiguresPerimeter;

import javax.swing.*;

public class Main {

    public static void main(String arg[]) {

        int x = 1;
        while (x == 1) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea calcular" + "\n1)Triangulo" + "\n2)Triangulo" + "\n3)Rombo"));
            switch (op) {
                case 1: {
                    Triangulo t = new Triangulo();
                    double l = Double.valueOf(JOptionPane.showInputDialog("Ingrese el lado "));
                    t.setDatos(l);
                    JOptionPane.showMessageDialog(null, "El area del Triangulo\n" + t.CalPeri());
                    break;
                }

                case 2: {
                    Cuadrado c = new Cuadrado();
                    double l = Double.valueOf(JOptionPane.showInputDialog("Ingrese el lado "));
                    c.setDatos(l);
                    JOptionPane.showMessageDialog(null, "Triangulo\n" + c.CalPeri());
                    break;
                }

                case 3: {
                    Rombo r = new Rombo();
                    double l = Double.valueOf(JOptionPane.showInputDialog("Ingrese el lado "));
                    r.setDatos(l);
                    JOptionPane.showMessageDialog(null, "Triangulo\n" + r.CalPeri());
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "ERROR, INGRESE UNA OPCION CORRECTA");
                    break;
            }
            x = Integer.parseInt(JOptionPane.showInputDialog("Desea realizar otra operacion\n1)Si \n2)No"));
            if (x == 2) {
                System.exit(0);
            }

        }
    }
}
