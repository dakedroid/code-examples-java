/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Populars;

import javax.swing.*;

public class MultiplicationTable {

    public static int leer() {
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        return x;
    }

    public static void caltabla(int x) {
        String cad = "";
        for (int i = 1; i <= 10; i++) {
            int res = x * i;
            cad += x + " * " + i + " = " + res + "\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }

    public static void main(String arg[]) {

        int x = leer();
        caltabla(x);
    }
}
//metodos constructores para el lunes.
