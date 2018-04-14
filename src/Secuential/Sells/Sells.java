
import javax.swing.*;

public class Sells {

    //este metodo calcula el pago por el numero de ventas
    public double cal_pnv(double nventas) {
        double ppnv;
        ppnv = nventas * 200;
        return nventas;

    }

    //este metodo calcula el pago por el valor de las compras
    public double cal_ppvc(double vtventas) {
        double ppvc;
        ppvc = vtventas * 0.8;
        return vtventas;

    }

    //este metodo calcula el pago por el valor de las compras
    public double cal_ts(double vtventas, double ppvc, double ppnv) {
        double ts;
        ts = ppvc + ppnv + 5000;
        return ts;

    }

    //Proceso principal
    public static void main(String args[]) {
        double ts, nventas, vtventas, ppvc, ppnv;
        nventas = Double.valueOf(JOptionPane.showInputDialog("Ingresa el numero de ventas: "));
        vtventas = Double.valueOf(JOptionPane.showInputDialog("Ingresa el valor total de las ventas: "));
        Sells obj = new Sells();
        ppnv = obj.cal_pnv(nventas);
        ppvc = obj.cal_ppvc(vtventas);
        ts = obj.cal_ts(vtventas, ppvc, ppnv);
        JOptionPane.showMessageDialog(null, "El salario total del empleado es de: " + ts + " DM");
    }
}
