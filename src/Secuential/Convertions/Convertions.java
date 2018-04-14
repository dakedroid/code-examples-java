package Secuential.Convertions;

import javax.swing.*;

public class Convertions {

    // este metodo calcula la equivalencia de las pulgadas
    public double convercion(double unidadinpulgadas) {
        double cant_am;
        cant_am = unidadinpulgadas * 25.5;
        return cant_am;
    }

    //PROCESO PRINCIPAL
    public static void main(String[] args) {
        double cant_am, unidadinpulgadas;
        unidadinpulgadas = Double.valueOf(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de agua en pulgadas para realizar la conversion al sistema metrico"));
        Convertions obj = new Convertions();

        cant_am = obj.convercion(unidadinpulgadas);
        JOptionPane.showMessageDialog(null, "El valor de la unidad en pulgadas al sistema metrico es de:" + cant_am);
        JOptionPane.showMessageDialog(null, ":3");
    }
}
