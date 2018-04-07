package OOP.Interfaces.Calculator;

import javax.swing.*;

/**
 *
 * @author Dake10
 */
public class Main {

    public static void main(String arg[]) {
        int i = 1;
        while (i == 1) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea calcular" + "\n1)Suma" + "\n2)Resta" + "\n3)Multipliacion" + "\n4)Divicion"));
            switch (op) {
                case 1: {
                    Suma s = new Suma();
                    double x = Double.valueOf(JOptionPane.showInputDialog("Ingrese x"));
                    double y = Double.valueOf(JOptionPane.showInputDialog("Ingrese y"));
                    s.setDatos(x, y);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es:\n" + s.opera());
                    break;
                }

                case 2: {
                    Resta r = new Resta();
                    double x = Double.valueOf(JOptionPane.showInputDialog("Ingrese x"));
                    double y = Double.valueOf(JOptionPane.showInputDialog("Ingrese y"));
                    r.setDatos(x, y);
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es:\n" + r.opera());
                    break;
                }

                case 3: {
                    Multiplicacion m = new Multiplicacion();
                    double x = Double.valueOf(JOptionPane.showInputDialog("Ingrese x"));
                    double y = Double.valueOf(JOptionPane.showInputDialog("Ingrese y"));
                    m.setDatos(x, y);
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es:\n" + m.opera());
                    break;
                }
                case 4: {
                    Divicion d = new Divicion();
                    double x = Double.valueOf(JOptionPane.showInputDialog("Ingrese x"));
                    double y = Double.valueOf(JOptionPane.showInputDialog("Ingrese y"));
                    d.setDatos(x, y);
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es:\n" + d.opera());
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "ERRO, INGRESE UNA OPCION CORRECTA");
                    break;
            }
            i = Integer.parseInt(JOptionPane.showInputDialog("Desea realizar otra operacion\n1)Si \n2)No"));
            if (i == 2) {
                System.exit(0);
            }

        }

    }

}
