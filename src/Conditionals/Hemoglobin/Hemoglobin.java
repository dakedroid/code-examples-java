package Conditionals.Hemoglobin;


import javax.swing.*;

public class Hemoglobin {

    public void pulsa(double edad, double sexo, double hemo) {
        double resul;
        if (edad >= 0 && edad <= 1) {
            if (hemo >= 13 && hemo <= 26) {
                JOptionPane.showMessageDialog(null, "El resultado es negativo");
            } else if (hemo > 26) {

                JOptionPane.showMessageDialog(null, "La persona tiene un indice de hemoglobina muy elevado.");
            } else {
                JOptionPane.showMessageDialog(null, "El resultado es positivo");
            }
        } else if (edad > 1 && edad <= 6) {
            if (hemo >= 10 && hemo <= 18) {
                JOptionPane.showMessageDialog(null, "El resultado es negativo");
            } else if (hemo > 18) {

                JOptionPane.showMessageDialog(null, "La persona tiene un indice de hemoglobina muy elevado.");
            } else {
                JOptionPane.showMessageDialog(null, "El resultado es positivo");
            }

        } else if (edad > 6 && edad <= 12) {
            if (hemo >= 11 && hemo <= 15) {
                JOptionPane.showMessageDialog(null, "El resultado es negativo");
            } else if (hemo > 15) {

                JOptionPane.showMessageDialog(null, "La persona tiene un indice de hemoglobina muy elevado.");
            } else {
                JOptionPane.showMessageDialog(null, "El resultado es positivo");
            }
        } else if (edad > 24 && edad <= 60) {
            if (hemo >= 11.5 && hemo <= 15) {
                JOptionPane.showMessageDialog(null, "El resultado es negativo");
            } else if (hemo > 15) {

                JOptionPane.showMessageDialog(null, "La persona tiene un indice de hemoglobina muy elevado.");
            } else {
                JOptionPane.showMessageDialog(null, "El resultado es positivo");
            }

        } else if (edad > 60 && edad <= 120) {
            if (hemo >= 12.6 && hemo <= 15.5) {
                JOptionPane.showMessageDialog(null, "El resultado es negativo");
            } else if (hemo > 15.5) {

                JOptionPane.showMessageDialog(null, "La persona tiene un indice de hemoglobina muy elevado.");
            } else {
                JOptionPane.showMessageDialog(null, "El resultado es positivo");
            }

        } else if (edad > 120 && edad <= 180) {
            if (hemo >= 13 && hemo <= 15.5) {
                JOptionPane.showMessageDialog(null, "El resultado es negativo");
            } else if (hemo > 15.5) {

                JOptionPane.showMessageDialog(null, "La persona tiene un indice de hemoglobina muy elevado.");
            } else {
                JOptionPane.showMessageDialog(null, "El resultado es positivo");
            }

        } else if (sexo == 'm' && edad > 180) {
            if (hemo >= 12 && hemo <= 16) {
                JOptionPane.showMessageDialog(null, "El resultado es negativo");
            } else if (hemo > 16) {

                JOptionPane.showMessageDialog(null, "La persona tiene un indice de hemoglobina muy elevado.");
            } else {
                JOptionPane.showMessageDialog(null, "El resultado es positivo");
            }

        } else if (sexo == 'h' && edad > 180) {
            if (hemo >= 14 && hemo <= 18) {
                JOptionPane.showMessageDialog(null, "El resultado es negativo");
            } else if (hemo > 18) {

                JOptionPane.showMessageDialog(null, "La persona tiene un indice de hemoglobina muy elevado.");
            } else {
                JOptionPane.showMessageDialog(null, "El resultado es positivo");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos.");
        }
    }

    public static void main(String arg[]) {
        Hemoglobin obj = new Hemoglobin();
        double edad, hemo;
        char sexo;
        String s = JOptionPane.showInputDialog("Ingrese el el sexo \n(m) mujer \n(h) hombre");
        sexo = s.charAt(0);
        edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la edad en meses."));
        hemo = Double.parseDouble(JOptionPane.showInputDialog("El nivel de hemoglobina es de: "));
        obj.pulsa(edad, sexo, hemo);
    }
}
