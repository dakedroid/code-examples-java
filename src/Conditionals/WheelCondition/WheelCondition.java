package Conditionals.WheelCondition;


import javax.swing.*;

public class WheelCondition {

    public int lec() {
        int llanc;
        llanc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de llantas compradas "));
        return llanc;
    }

    public void comprawhells(int llanc) {
        float tp;
        if (llanc < 5 && llanc > 0) {
            tp = llanc * 300;
            JOptionPane.showMessageDialog(null, "Usted compro " + llanc + " llanta(s) \nEl pago por llanta es de: 300 \nEl pago total es de: " + tp);
        } else if (llanc >= 5 && llanc <= 10) {
            tp = llanc * 250;
            JOptionPane.showMessageDialog(null, "Usted compro " + llanc + " llanta(s) \nEl pago por llanta es de 250 \nEl pago total es de: " + tp);
        } else if (llanc > 10) {
            tp = llanc * 200;
            JOptionPane.showMessageDialog(null, "Usted compro " + llanc + " llanta(s) \nEl pago por llanta es de 200 \nEl pago total es de: " + tp);
        }
    }

    public static void main(String arg[]) {
        WheelCondition obj = new WheelCondition();
        int llanc;
        float tp;
        llanc = obj.lec();
        obj.comprawhells(llanc);
        JOptionPane.showMessageDialog(null, "             OOOOOOO      OOOOOOO \n             OOOOOOO      OOOOOOO\n  OOOOOOOOOOOOOOOOOOOOOOOO \n"
                + "  OOOOOOO # Ejecucion # OOOOOOOO \n             OOO # Finalizada # OOOO\n             OOOOOOOOOOOOOOOOO \n                    OOOOOOOOOOOO \n"
                + "                    OOOOOOOOOOOO    \n                               OOO \n                               OOO");
    }
}
