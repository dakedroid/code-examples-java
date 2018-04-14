
import javax.swing.*;

public class AutoMovil {

    //metodo que calcula la comision por las ventas
    public static double calcomi(double nav) {
        double comi;
        comi = nav * 150.00;
        return comi;
    }

    //metodo que calcula el pago porlas ventas
    public double calppv(double comi, double vtv) {
        double ppv;
        ppv = vtv * 0.5;
        return ppv;
    }

    //metodo que calcula el salario total
    public double calst(double comi, double ppv) {
        double st;
        st = comi + ppv + 250.00;
        return st;
    }

    //proceso principal
    public static void main(String arg[]) {
        double vtv, nav, comi, ppv, st;
        int codv;
        codv = Integer.valueOf(JOptionPane.showInputDialog("Ingresa el codigo del vendedor "));
        nav = Double.valueOf(JOptionPane.showInputDialog("Ingresa el numero de autos vendidos "));
        vtv = Double.valueOf(JOptionPane.showInputDialog("Ingresa el valor total de las ventas"));
        AutoMovil obj = new AutoMovil();
        comi = obj.calcomi(nav);
        ppv = obj.calppv(comi, vtv);
        st = obj.calst(comi, ppv);
        JOptionPane.showMessageDialog(null, "EL pago total del vendedor " + codv + " es de: " + st);
    }
}
