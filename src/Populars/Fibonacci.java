package Populars;

import javax.swing.*;

public class Fibonacci {

    public static void fibu(int n) {
        int x = 1;
        int anterior = 0;
        int temp;
        String cad = anterior + ",";
        while (true) {

            //System.out.println(x);
            cad += x + ",";
            temp = x;
            x = x + anterior;
            anterior = temp;

            if (x > n) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, cad);
    }

    public static void main(String arg[]) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n"));
        fibu(n);
    }
}
