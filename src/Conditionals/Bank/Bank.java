package Conditionals.Bank;

/*un hombre desea saber cuanto dinero se genera  por consepto de interes sobre la cantidad que se tieneen inversion en el banco si el banco paga 2% al mes.
*El decidira reinvertir  los intereces siempre y cuando estos excedadn a los $700, en caso contrario no lo reinvertira y desea saber la cantidad de
*dinero que tendra finalmente en su cuenta*/

import javax.swing.*;

public class Bank {

    public double leedinero() {
        double dinero;
        dinero = Double.valueOf(JOptionPane.showInputDialog("Da la cantidad invertida en el banco: "));
        return dinero;
    }

    public double calbanco(double dinero) {
        double interes, inverfin;
        interes = dinero * 0.02;
        if (interes > 700) {
            inverfin = dinero + interes;
        } else {
            inverfin = dinero;
        }
        return inverfin;
    }

    public static void main(String arg[]) {
        Bank obj = new Bank();
        double dinero, inverfin;
        dinero = obj.leedinero();
        inverfin = obj.calbanco(dinero);
        JOptionPane.showMessageDialog(null, "la invercion final es: $ " + inverfin);
    }
}
