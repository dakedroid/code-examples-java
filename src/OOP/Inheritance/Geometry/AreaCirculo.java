package OOP.Inheritance.Geometry;

import javax.swing.*;

public class AreaCirculo {

    static double r;

    public AreaCirculo(double R) {

        r = R;
    }

    public static double areaCirculo() {
        double area = r * r * Math.PI;
        return area;
    }
}
