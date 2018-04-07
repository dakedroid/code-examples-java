package OOP.Inheritance.Geometry;

import javax.swing.*;

public class Figuras {

    public static void main(String arg[]) {
        int x = 1;
        int op = Integer.parseInt(JOptionPane.showInputDialog("¿ Que area desea calcular ? \n1)Cuadrado \n2)Triangulo \n3)Rectangulo"));
        while (x == 1) {
            switch (op) {
                case 1: {
                    int b = claseBase.leerBase();
                    int a = claseBase.leerAltura();
                    if (a == b) {
                        AreaCuadrado ac = new AreaCuadrado(b, a);
                        double areaC = ac.areaCuadrado();
                        ac.imprimirArea(areaC);
                    } else {
                        JOptionPane.showMessageDialog(null, "Base y altura deben de ser iguales");
                    }
                    break;
                }
                case 2: {
                    int b = claseBase.leerBase();
                    int a = claseBase.leerAltura();
                    AreaTriangulo at = new AreaTriangulo(b, a);
                    double areaT = at.areaTriangulo();
                    at.imprimirArea(areaT);
                    break;
                }
                case 3: {
                    int b = claseBase.leerBase();
                    int a = claseBase.leerAltura();
                    AreaRectangulo ar = new AreaRectangulo(b, a);
                    double areaR = ar.areaRectangulo();
                    ar.imprimirArea(areaR);
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta");
            }
            x = Integer.parseInt(JOptionPane.showInputDialog("¿Desea realizar otra operacion? \n1)Si \n0)No"));
            if (x == 0) {
                break;
            }
            op = Integer.parseInt(JOptionPane.showInputDialog("¿ Que area desea calcular ? \n1)Cuadrado \n2)Triangulo \n3)Rectangulo"));
        }
    }
}
