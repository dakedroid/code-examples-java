
import javax.swing.*;

public class Pharmacy {

    //Metodo que calcupa el descuento
    public double calpre(double prepro) {
        double caldes;
        caldes = prepro * 0.10;
        return caldes;
    }

    //metodo que calcula el total a pagar
    public double totpa(double prepro, double caldes) {
        double totdes;
        totdes = prepro - caldes;
        return totdes;
    }

    //proceso principal
    public static void main(String arg[]) {
        double prepro, caldes, tot, totdes;
        prepro = Double.valueOf(JOptionPane.showInputDialog("Ingresa el precio del producto:"));
        Pharmacy obj = new Pharmacy();
        caldes = obj.calpre(prepro);
        totdes = obj.totpa(prepro, caldes);
        JOptionPane.showMessageDialog(null, "El total a pagar es: " + totdes);
    }
}
