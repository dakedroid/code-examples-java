package Conditionals.HeartRhythm;

import javax.swing.*;

public class HeartRhythm {

    public void pulsa(char sexo) {
        float pulsa;
        int edad;
        if (sexo == 'm') {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad "));
            pulsa = (210 - edad) / 10;
            JOptionPane.showMessageDialog(null, "Usted tiene sexo Masculino su numero de pulsacion es: " + pulsa);
        } else if (sexo == 'f') {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad "));
            pulsa = (220 - edad) / 10;
            JOptionPane.showMessageDialog(null, "Usted tiene sexo Femenino su numero de pulsacion es: " + pulsa);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL DECLARAR EL SEXO");
        }
    }

    public static void main(String arg[]) {
        HeartRhythm obj = new HeartRhythm();
        char sexo;
        String s = JOptionPane.showInputDialog("Ingrese su sexo: \nPulse 'm' si es Masculino. \nPulse 'f' si es Femenino. ");
        sexo = s.charAt(0);
        obj.pulsa(sexo);
    }
}
