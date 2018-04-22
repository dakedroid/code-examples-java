package Conditionals.Call;


import javax.swing.*;

public class Call {

    public int lec() {
        int timecall;
        timecall = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada en minutos"));
        return timecall;
    }

    public void llamada(int timecall) {
        double pcall, precall;
        int nminutes;
        if (timecall <= 5) {
            pcall = timecall * 0.90;
            JOptionPane.showMessageDialog(null, "La llamada duro " + timecall + " minutos");
            JOptionPane.showMessageDialog(null, "El pago por la llamada es de $" + pcall);
        } else {
            nminutes = timecall - 5;
            precall = nminutes * 0.20;
            pcall = timecall * 0.90 + precall;
            JOptionPane.showMessageDialog(null, "La llamada duro " + timecall + " minutos");
            JOptionPane.showMessageDialog(null, "El pago por la llamada es de $" + pcall);
        }
    }

    public static void main(String arg[]) {
        Call obj = new Call();
        int timecall;
        double pcall, precall;
        timecall = obj.lec();
        obj.llamada(timecall);

        JOptionPane.showMessageDialog(null, "             OOOOOOO      OOOOOOO \n             OOOOOOO      OOOOOOO\n  OOOOOOOOOOOOOOOOOOOOOOOO \n"
                + "  OOOOOOO # Ejecucion # OOOOOOOO \n             OOO # Finalizada # OOOO\n             OOOOOOOOOOOOOOOOO \n                    OOOOOOOOOOOO \n"
                + "                    OOOOOOOOOOOO    \n                               OOO \n                               OOO");
    }
}
