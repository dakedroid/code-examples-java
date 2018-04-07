package Populars;

import javax.swing.*;

/**
 *
 * @author Dake10
 */
public class Factorial {

    public static void calfactorial(int n) {
        int fact = 1;
        String cadena = "";
        if (n == 0) {
            fact = 1;
        } else {

            while (n != 0) {
                fact *= n;
                cadena += n + "*";
                n--;

            }
        }
        JOptionPane.showMessageDialog(null, "Factorial" + "\n" + cadena + "=" + fact);

    }

    public static void main(String arg[]) {
        int fact, n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Numero 'n'"));
        calfactorial(n);
        //JOptionPane.showMessageDialog(null,"El factorial de "+ n + "! es: "+ fact);
    }
}
