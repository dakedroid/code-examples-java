package Secuential.SalaryWorker;


import javax.swing.*;

public class SalaryWorker {

    //metodo para la equivalencia
    public static double conver() {
        double conv;
        conv = 0.5 * 0.5;
        return conv;
    }

    //metodo para calcular la cantidad de arena
    public double cal_canta(double conv, double largo, double alto) {
        double cantare;
        cantare = largo * alto * conv;
        return cantare;
    }

    //PROCESO PRINCIPAL
    public static void main(String arg[]) {
        double largo, alto, conv, cantare;
        largo = Double.valueOf(JOptionPane.showInputDialog("Ingresa el largo en 'metros' "));
        alto = Double.valueOf(JOptionPane.showInputDialog("Ingresa el alto en 'metros' "));
        SalaryWorker obj = new SalaryWorker();
        conv = obj.conver();
        cantare = obj.cal_canta(conv, largo, alto);
        JOptionPane.showMessageDialog(null, " la cantidad de arena necesaria para revocarla es de " + cantare + " metros cubicos");
    }
}
