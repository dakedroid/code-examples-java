package Conditionals.SuperMarket;


import javax.swing.*;

public class SuperMarket {

    public void cal(int num, float com) {
        double descu;
        if (num >= 74) {
            descu = com * 0.2;
            JOptionPane.showMessageDialog(null, "El descuento de su compra es del 20% es decir $" + descu);
        } else {
            descu = com * 0.15;
            JOptionPane.showMessageDialog(null, "El descuento de su compra es del 15% es decir $" + descu);
        }
    }

    public static void main(String arg[]) {
        SuperMarket obj = new SuperMarket();
        float com;
        int num;
        com = Float.valueOf(JOptionPane.showInputDialog("INGRESA EL TOTAL DE SU COMPRA:"));
        num = Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL NUMERO OBTENIDO:"));
        obj.cal(num, com);
    }
}
