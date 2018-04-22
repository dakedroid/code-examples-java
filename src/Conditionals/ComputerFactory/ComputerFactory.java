package Conditionals.ComputerFactory;

import javax.swing.*;

public class ComputerFactory {

    public int lec() {
        int numc;
        numc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de computadoras compradas."));
        return numc;
    }

    public void calcompu(int numc) {
        double ptp, des, ptc;
        if (numc < 5) {
            ptp = numc * 11000;
            des = ptp * 0.10;
            ptc = ptp - des;
            JOptionPane.showMessageDialog(null, "Usted compro " + numc + " computadoras" + "\nel descuento es de:" + des + "\nEl pago total por la compra es: " + ptc);
        } else if (numc >= 5 && numc < 10) {
            ptp = numc * 11000;
            des = ptp * 0.20;
            ptc = ptp - des;
            JOptionPane.showMessageDialog(null, "Usted compro " + numc + " computadoras" + "\nel descuento es de:" + des + "\nEl pago total por la compra es: " + ptc);
        } else if (numc > 10) {
            ptp = numc * 11000;
            des = ptp * 0.40;
            ptc = ptp - des;
            JOptionPane.showMessageDialog(null, "Usted compro " + numc + " computadoras" + "\nel descuento es de:" + des + "\nEl pago total por la compra es: " + ptc);
        }
    }

    public static void main(String arg[]) {
        ComputerFactory obj = new ComputerFactory();
        int numc;
        numc = obj.lec();
        obj.calcompu(numc);
        JOptionPane.showMessageDialog(null, "             OOOOOOO      OOOOOOO \n             OOOOOOO      OOOOOOO\n  OOOOOOOOOOOOOOOOOOOOOOOO \n"
                + "  OOOOOOO # Ejecucion # OOOOOOOO \n             OOO # Finalizada # OOOO\n             OOOOOOOOOOOOOOOOO \n                    OOOOOOOOOOOO \n"
                + "                    OOOOOOOOOOOO    \n                               OOO \n                               OOO");
    }
}
