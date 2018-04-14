package Secuential.Kilometers;

import javax.swing.*;

public class Kilometers {

    //meto que le el numero de kilometros recorridos
    public static double lectura() {
        double numkm;
        numkm = Double.valueOf(JOptionPane.showInputDialog("Ingresa los kilometros recorridos:"));
        return numkm;
    }

    //metodo que calcula el pago por el voleto
    public double cal_pagov(double numkm) {
        double pagov;
        pagov = numkm * 1000;
        return pagov;

    }

    //proceso principal
    public static void main(String arg[]) {
        double pagov, numkm;
        Kilometers obj = new Kilometers();
        numkm = lectura();
        pagov = obj.cal_pagov(numkm);
        JOptionPane.showMessageDialog(null, "El total a pagar por el voleto es: " + pagov);
        JOptionPane.showMessageDialog(null, "Que tenga un buen viaje :) ");
    }
}
