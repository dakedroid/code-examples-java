package Conditionals.Bail;


import javax.swing.*;

public class Bail {

    public double lec() {
        double monto;
        monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto por el que se efectúa la fianza"));
        return monto;
    }

    public void fi(double monto) {
        double cuota;

        if (monto <= 50000) {
            cuota = monto * 0.30;
            JOptionPane.showMessageDialog(null, "El monto fue de: " + monto);
            JOptionPane.showMessageDialog(null, "La cuota a pagar es: " + cuota);
        } else {
            cuota = monto * 0.20;
            JOptionPane.showMessageDialog(null, "El monto fue de: " + monto);
            JOptionPane.showMessageDialog(null, "La cuota a pagar es :" + cuota);
        }
    }

    public static void main(String arg[]) {
        double cuota, monto;
        Bail obj = new Bail();
        monto = obj.lec();
        obj.fi(monto);

        JOptionPane.showMessageDialog(null, "             OOOOOOO      OOOOOOO \n             OOOOOOO      OOOOOOO\n  OOOOOOOOOOOOOOOOOOOOOOOO \n"
                + "  OOOOOOO # Ejecucion # OOOOOOOO \n             OOO # Finalizada # OOOO\n             OOOOOOOOOOOOOOOOO \n                    OOOOOOOOOOOO \n"
                + "                    OOOOOOOOOOOO    \n                               OOO \n                               OOO");
    }

}
