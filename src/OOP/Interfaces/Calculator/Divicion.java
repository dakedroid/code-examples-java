package OOP.Interfaces.Calculator;

import javax.swing.*;

/**
 *
 * @author Dake10
 */
public class Divicion extends Operaciones {

    public double opera() {
        double aux = 0;
        if (y == 0) {
            JOptionPane.showMessageDialog(null, "ERROR, EL DIVIDENDO NO PUEDE SER 0");
        } else {
            aux = x / y;
        }
        return aux;
    }
}
