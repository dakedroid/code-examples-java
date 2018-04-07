/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Inheritance.Figures;

import javax.swing.*;

public class Figuras {

    public static void main(String arg[]) {
        int x = 1;
        int op = Integer.parseInt(JOptionPane.showInputDialog("¿ Que area desea calcular ? \n1)Cuadrado \n2)Circulo"));
        while (x == 1) {
            switch (op) {
                case 1: {
                    double xc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese xc"));
                    double yc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese yc"));
                    double t1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese t1"));
                    double t2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese t2"));

                    Cuadrado cd = new Cuadrado(xc, yc, t1, t2);
                    double areaC = cd.area();
                    JOptionPane.showMessageDialog(null, "El area del cuadrado es " + areaC);
                    break;
                }
                case 2: {
                    double xx = Integer.parseInt(JOptionPane.showInputDialog("Ingrese x"));
                    double y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese y"));
                    double r = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));
                    Circulo cr = new Circulo(xx, y, r);
                    double areaCir = cr.area();

                    JOptionPane.showMessageDialog(null, "El area del cuadrado es " + areaCir);

                }
                x = Integer.parseInt(JOptionPane.showInputDialog("¿Desea realizar otra operacion? \n1)Si \n0)No"));
                op = Integer.parseInt(JOptionPane.showInputDialog("¿ Que area desea calcular ? \n1)Cuadrado \n2)Circulo"));

                // objGeometrico og = new objGeometrico();
                //cr.imprimirCentro();
                //cd.imprimirCentro();
                /*JOptionPane.showMessageDialog(null,"Centro del circulo: ");
    cr.imprimirCentro();
    JOptionPane.showMessageDialog(null,"Centro del cuadrado: ");
    cd.imprimirCentro();
    JOptionPane.showMessageDialog(null, "Area del Circulo: "+cr.area());
    JOptionPane.showMessageDialog(null, "Area del cuadrado: "+cd.area());
                 */
                //JOptionPane.showMessageDialog(null,cd.getCentro);
                //JOptionPane.showMessageDialog(null,"Centro del circulo: "+cr.getCentro()+"\nCentro del cuadrado: "+cd.getCentro()+"\nArea del Circulo : "+cr.area()+"\nArea del cuadrado: "+cd.area() );
            }
        }
    }
}
