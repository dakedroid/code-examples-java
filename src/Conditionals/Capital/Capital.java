package Conditionals.Capital;


import javax.swing.*;

public class Capital {

    public void calsaldo(double capital) {
        double prestamo, saldo, ppedc, ppm, cdims;
        if (capital >= 0 && capital < 10000) {
            prestamo = 10000 - capital;
            saldo = capital + prestamo;
            ppedc = saldo - 5000;
            ppm = ppedc - 2000;
            cdims = ppm / 2;
            JOptionPane.showMessageDialog(null, "Su capital de " + capital + " es negativo a si que necesitara un prestamo \nEl prestamo sera por: " + prestamo + "\nEl presupuesto para equipo de computo sera: " + ppedc
                    + "\nEl presupuesto para mobilario sera de: " + ppm + "\nEl presupuesto para la compra de insumos es: " + cdims + "\nEl presupuesto para otorgar incentivos al personal sera: " + cdims);
        } else if (capital >= 10000 && capital < 20000) {
            prestamo = 20000 - capital;
            saldo = capital + prestamo;
            ppedc = saldo - 5000;
            ppm = ppedc - 2000;
            cdims = ppm / 2;
            JOptionPane.showMessageDialog(null, "Su capital de  " + capital + " es positivo pero necesitara un pequeño prestamo. \nEl prestamo sera por: " + prestamo + "\nEl presupuesto para equipo de computo sera: " + ppedc
                    + "\nEl presupuesto para mobilario sera de: " + ppm + "\nEl presupuesto para la compra de insumos es: " + cdims + "\nEl presupuesto para otorgar incentivos al personal sera: " + cdims);
        } else if (capital >= 20000) {
            saldo = capital;
            ppedc = saldo - 5000;
            ppm = ppedc - 2000;
            cdims = ppm / 2;
            JOptionPane.showMessageDialog(null, "Su saldo es positivo no necesita ningun prestamo." + "\nEl presupuesto para equipo de computo sera: " + ppedc
                    + "\nEl presupuesto para mobilario sera de: " + ppm + "\nEl presupuesto para la compra de insumos es: " + cdims + "\nEl presupuesto para otorgar incentivos al personal sera: " + cdims);
        }
    }

    public static void main(String arg[]) {
        Capital obj = new Capital();
        double capital;
        capital = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital"));
        obj.calsaldo(capital);
    }
}
