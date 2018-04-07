package OOP.Inheritance.Geometry;

import javax.swing.*;

public class AreaCuadrado extends claseBase {

    static int l1, l2;

    public AreaCuadrado(int BASE, int ALTURA) {
        super(BASE, ALTURA);

        l1 = BASE;
        l2 = ALTURA;
        //JOptionPane.showMessageDialog(null, BASE+""+ALTURA);
    }

    public static int areaCuadrado() {
        int area = l1 * l2;
        return area;
    }

}
