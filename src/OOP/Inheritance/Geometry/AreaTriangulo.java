package OOP.Inheritance.Geometry;

import javax.swing.*;

public class AreaTriangulo extends claseBase {

    static int altura, base;

    public AreaTriangulo(int BASE, int ALTURA) {
        super(BASE, ALTURA);
        altura = ALTURA;
        base = BASE;

    }

    public static double areaTriangulo() {
        double area = (base * altura) / 2;
        return area;
    }

}
