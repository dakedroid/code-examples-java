package Conditionals.Salary;

import javax.swing.*;

public class Salary {

    public void sarcal(char eleccion) {
        double pm, dindep, salm, cf, porcent, descueadep;

        if (eleccion == 'a') {
            salm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario mensual"));
            cf = Double.parseDouble(JOptionPane.showInputDialog("La cuota fija mensual a depositar es:"));
            pm = salm - cf;
            JOptionPane.showMessageDialog(null, "La cuota fija a depositar es " + cf);
            JOptionPane.showMessageDialog(null, "su pago mensual es: " + pm);
        } else if (eleccion == 'b') {
            salm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario mensual"));
            porcent = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje "));
            descueadep = salm * porcent;
            pm = salm - descueadep;
            JOptionPane.showMessageDialog(null, "Mensualmente usted depositara al SAR: " + descueadep);
            JOptionPane.showMessageDialog(null, "Su pago mensual sera de: " + pm);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }

    public static void main(String arg[]) {
        Salary obj = new Salary();
        char eleccion;
        String s = JOptionPane.showInputDialog("Ingrese su preferencia: \nPulse 'a' si quiere una cuota fija. \nPulse 'b' si quiere que sea enbase a un porcentaje del sueldo ");
        eleccion = s.charAt(0);
        obj.sarcal(eleccion);
    }
}
