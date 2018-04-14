package Secuential.Sandwiches;


import javax.swing.*;

public class Sandwiches {

    // ##### Metodo que calcula cuanto pagara por los bocadillos de jamon #####
    public Double c_j(int a) {
        Double pba;
        pba = a * 2.50;
        return pba;
    }

    //##### Metodo que calcula cuanto pagara por los bocadillos de queso ######
    public Double c_q(int b) {
        Double pbb;
        pbb = b * 2.00;
        return pbb;
    }

    //##### Metodo que calcula cuanto pagara por las papas fritas ######
    public Double c_pf(int c) {
        Double pbc;
        pbc = c * 1.00;
        return pbc;
    }

    //##### Metodo que calcula cuato pagara por los refrecos ######
    public Double c_rf(int d) {
        Double pbd;
        pbd = d * 1.75;
        return pbd;
    }

    //##### Metodo que calcula cuanto pagara por las chelas ######
    public Double c_che(int e) {
        Double pbe;
        pbe = e * 1.25;
        return pbe;
    }

    //##### PROGRAMA PRINCIPAL DONDE SE INVOCAN LOS METODOS ######
    public static void main(String[] args) {
        int a, b, c, d, e;
        Double pba, pbb, pbc, pbd, pbe, totpag;
        a = Integer.parseInt(JOptionPane.showInputDialog("Porfavor, ingrese cuantos bocadillos de jamon fueron consumidos"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Porfavor, ingrese cuantos bocadillos de queso"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Porfavor, ingrese cuantas papas fritas fueron consumidas"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Porfavor, ingrese cuantos refrescos fueron consumidos"));
        e = Integer.parseInt(JOptionPane.showInputDialog("Porfavor, ingrese cuantas chelas fueron consumidas"));
        Sandwiches obj = new Sandwiches();
        pba = obj.c_j(a);
        pbb = obj.c_q(b);
        pbc = obj.c_pf(c);
        pbd = obj.c_rf(d);
        pbe = obj.c_che(e);
        totpag = pba + pbb + pbc + pbd + pbe;
        JOptionPane.showMessageDialog(null, "El total a pagar es: " + totpag);
        JOptionPane.showMessageDialog(null, "No coma mucho porfavor, es malo para la salud :3");
    }
}
