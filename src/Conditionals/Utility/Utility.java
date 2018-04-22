package Conditionals.Utility;


import javax.swing.*;

public class Utility {

    public void pmyengan(double anti, double sal) {
        double utilidad, convera;
        if (anti < 12) {
            utilidad = sal * 0.5;
            JOptionPane.showMessageDialog(null, "la utilidad es:" + utilidad);
        } else if (anti >= 12 && anti < 24) {
            convera = anti / 12;
            utilidad = convera * 0.10;
            JOptionPane.showMessageDialog(null, "la utilidad es:" + utilidad);

        } else if (anti >= 24 && anti < 36) {
            convera = anti / 12;
            utilidad = convera * 0.15;
            JOptionPane.showMessageDialog(null, "la utilidad es:" + utilidad);
        } else if (anti >= 36 && anti < 48) {
            convera = anti / 12;
            utilidad = convera * 0.20;
            JOptionPane.showMessageDialog(null, "la utilidad es:" + utilidad);
        } else if (anti >= 60) {
            convera = anti / 12;
            utilidad = convera * 0.30;
            JOptionPane.showMessageDialog(null, "la utilidad es:" + utilidad);
        }
    }

    public static void main(String arg[]) {
        double sal, anti;
        sal = Double.parseDouble(JOptionPane.showInputDialog(" El salario"));
        anti = Double.parseDouble(JOptionPane.showInputDialog(" El ingreso de la antiguedad en meses "));
        Utility obj = new Utility();
        obj.pmyengan(sal, anti);
        JOptionPane.showMessageDialog(null, "             OOOOOOO      OOOOOOO \n             OOOOOOO      OOOOOOO\n  OOOOOOOOOOOOOOOOOOOOOOOO \n"
                + "  OOOOOOO # Ejecucion # OOOOOOOO \n             OOO # Finalizada # OOOO\n             OOOOOOOOOOOOOOOOO \n                    OOOOOOOOOOOO \n"
                + "                    OOOOOOOOOOOO    \n                               OOO \n                               OOO");
    }

}
