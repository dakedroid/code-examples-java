package OOP.Constructors.Cartesian;

import static java.lang.Math.sqrt;
import javax.swing.*;

public class cartesiano {

    public static int x, x1, y, y1;

    public cartesiano(int VALORDEX, int VALORDEX1, int VALORDEY, int VALORDEY1) {

        x = VALORDEX;
        x1 = VALORDEX1;
        y = VALORDEY;
        y1 = VALORDEY1;

    }

    public static void carte() {

        double p1 = (x + x1) / 2;
        double p2 = (y + y1) / 2;

        //JOptionPane.showMessageDialog(null,"El punto p1: " + p1);
        //JOptionPane.showMessageDialog(null,"El punto p2 " + p2);
    }

    public static double dis() {
        double D = Math.sqrt((x - x1) * (x - x1) + (y - y1));
        return D;
    }

    public static void imprim(double D) {

        JOptionPane.showMessageDialog(null, "El diametro es: " + D + "otro " + x);
    }

    public static void main(String[] args) {
        int VALORDEX = Integer.parseInt(JOptionPane.showInputDialog("ingrese x "));
        int VALORDEX1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese x1 "));
        int VALORDEY = Integer.parseInt(JOptionPane.showInputDialog("ingrese y "));
        int VALORDEY1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese y1 "));
        cartesiano cc = new cartesiano(VALORDEX, VALORDEX1, VALORDEY, VALORDEY1);
        double D;
        D = dis();
        cc.carte();
        imprim(D);       // cc.carte(cartesiano.xx,cartesiano.xx1,cartesiano.yy,cartesiano.yy1);
    }
}
