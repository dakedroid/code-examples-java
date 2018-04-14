package Secuential.Discount;

import javax.swing.*;

public class Discount {

    //metodo que lee el costo de el medicamento
    public static double lectura() {
        double costom;
        costom = Double.valueOf(JOptionPane.showInputDialog("Ingresa el costo del medicamento:"));
        return costom;
    }

    //metodo que calcula el descuento del medicamento
    public double cal_des(double costom) {
        double des;
        des = costom * 0.35;
        return des;

    }

    //metodo que calcula el monto a pagar
    public double cal_monto(double des, double costom) {
        double monto;
        monto = costom - des;
        return monto;
    }

    public static void main(String arg[]) {
        double costom, des, monto;
        Discount obj = new Discount();
        costom = lectura();
        des = obj.cal_des(costom);
        monto = obj.cal_monto(des, costom);
        JOptionPane.showMessageDialog(null, "El descuentirijiyo es de : " + des);
        JOptionPane.showMessageDialog(null, "El montorijiyo a pagar es:" + monto);
    }
}
