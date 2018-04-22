package Conditionals.Apples;

import javax.swing.*;

public class Apples {

    public void pulsa(double kc, double pm) {
        double tp, des;
        if (kc >= 0 && kc <= 2) {
            tp = kc * pm;
            JOptionPane.showMessageDialog(null, "Usted tiene que pagar: " + tp);
        } else if (kc >= 2.01 && kc <= 5) {
            des = (kc * pm) * 0.10;
            tp = (kc * pm) - des;
            JOptionPane.showMessageDialog(null, "Usted tiene que pagar: " + tp);
        } else if (kc >= 5.01 && kc <= 10) {
            des = (kc * pm) * 0.15;
            tp = (kc * pm) - des;
            JOptionPane.showMessageDialog(null, "Usted tiene que pagar: " + tp);
        } else if (kc >= 10.01) {
            des = (kc * pm) * 0.20;
            tp = (kc * pm) - des;
            JOptionPane.showMessageDialog(null, "Usted tiene que pagar: " + tp);

        }
    }

    public static void main(String arg[]) {
        Apples obj = new Apples();
        double kc, pm;
        kc = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el el peso de las manzanas"));
        pm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de las manzanas"));
        obj.pulsa(kc, pm);
    }
}
