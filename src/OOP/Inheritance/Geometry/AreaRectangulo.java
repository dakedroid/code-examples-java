package OOP.Inheritance.Geometry;

import javax.swing.*;

public class AreaRectangulo extends claseBase {

    static int a, b;

    public AreaRectangulo(int BASE, int ALTURA) {
        super(BASE, ALTURA);
        a = BASE;
        b = ALTURA;

    }

    public static int areaRectangulo() {
        int area = a * b;
        return area;
    }
}
