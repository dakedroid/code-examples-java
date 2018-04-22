package Conditionals.Worker;


import javax.swing.*;

public class Worker {

    public double lectura() {
        double ht;
        ht = Float.valueOf(JOptionPane.showInputDialog("Ingresa las horas trabajandas en la semana: "));
        return ht;
    }

    public static void main(String args[]) {
        Worker obj = new Worker();
        double ht;
        ht = obj.lectura();
        if (ht <= 40) {
            double sm;
            sm = ht * 16.00;
            JOptionPane.showMessageDialog(null, "El salario semanal es: " + sm);
        } else {
            double hex, pnor, sm;
            hex = ht - 40;
            pnor = ht * 16.00;
            sm = (hex * 20.00) + pnor;
            JOptionPane.showMessageDialog(null, "El salario semanal es: " + sm);
        }
    }
}
