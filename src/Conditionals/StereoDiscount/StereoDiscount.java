package Conditionals.StereoDiscount;

import javax.swing.*;

public class StereoDiscount {

    public void pulsa(char marca, double pdele) {
        double des, dess, tp;
        if (pdele >= 2000 && marca == 's') {
            des = pdele * 0.10;
            dess = pdele * 0.5;
            tp = (pdele - des) - dess;
            JOptionPane.showMessageDialog(null, "Usted tiene que pagar: " + tp);
        } else if (pdele >= 2000 && marca == 'a') {
            des = pdele * 0.10;
            tp = pdele - des;
            JOptionPane.showMessageDialog(null, "Usted tiene que pagar: " + tp);
        } else if (pdele >= 2000 && marca == 'c') {
            des = pdele * 0.10;
            tp = pdele - des;
            JOptionPane.showMessageDialog(null, "Usted tiene que pagar: " + tp);
        } else {
            JOptionPane.showMessageDialog(null, "¡VALOR INVALIDO!");
        }
    }

    public static void main(String arg[]) {
        StereoDiscount obj = new StereoDiscount();
        double pdele;
        pdele = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del estereo"));
        char marca;
        String s = JOptionPane.showInputDialog("Ingrese la marca del estereo\n(s)Sony - aplica descuento del 5% \n (a)Apple\n"
                + " (c)Acer");
        marca = s.charAt(0);
        obj.pulsa(marca, pdele);
    }
}
