package GraphicInterfaces.TemperatureConverter;



import javax.swing.*;

/**
 *
 * @author dakedroid
 */

public class Functions {
    
    public void caf(double c) {
        double f;
        f = (c * 1.8) + 32;
        JOptionPane.showMessageDialog(null, "Conversion terminada \n " + c + " Grados Celsius es igual a " + f + " Grados Fahrenheit", "Resultado de convercion", JOptionPane.INFORMATION_MESSAGE);
       // return ("Conversion terminada \n " + c + " Grados Celsius es igual a " + f + " Grados Fahrenheit");
    }

    public static void fac(double f) {
        double c;
        c = (f - 32) / 1.8;
        JOptionPane.showMessageDialog(null, "Conversion terminada \n " + f + " Grados Fahrenheit es igual a " + c + " Grados Celsius", "Resultado de convercion", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void kac(double k) {
        double c;
        c = k - 273.15;
        JOptionPane.showMessageDialog(null, "Conversion terminada \n " + k + " Grados Kelvin es igual a " + c + " Grados Celsius", "Resultado de convercion", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void cak(double c) {
        double k;
        k = c + 273.15;
        JOptionPane.showMessageDialog(null, "Conversion terminada \n " + c + " Grados Celsius es igual a " + k + " Grados Kelvin", "Resultado de convercion", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void fak(double f) {
        double k;
        k = ((5 / 9) * (f - 32)) + 273.15;
        JOptionPane.showMessageDialog(null, "Conversion terminada \n " + f + " Grados Fahrenheit es igual a " + k + " Grados Kelvin", "Resultado de convercion", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void kaf(double k) {
        double f;
        f = (1.8 * (k - 273.15)) + 32;
        JOptionPane.showMessageDialog(null, "Conversion terminada \n " + k + " Grados Kelvin es igual a " + f + " Grados Fahrenheit", "Resultado de convercion", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String arg[]) {
    }

    public void menu(int i) {
      
        char rp = 0;
       
            // op = Integer.parseInt(JOptionPane.showInputDialog(null, "E L I J A   U N A   O P C I 0 N   A   R E A L I Z A R:\n \n=> 1) Convertir de Celsius a Fahrenheit\n=> 2) Convertir de Fahrenheit a Celsius\n=> 3) Convertir de Kelvin a Celsius \n=> 4) Convertir de Celsius a Kelvin \n=> 5) Convertir de Fahrenheit a Kelvin \n=> 6) Convertir de Kelvin a Fahrenheit \n=> 7) Salir", "Ingrese la opcion deseada!", JOptionPane.WARNING_MESSAGE));
            switch (i) {
                case 1: {
                    double c = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese los grados Celsius", "Datos de grados Celsius", JOptionPane.WARNING_MESSAGE));
                    caf(c);
                    break;
                }
                case 2: {
                    double f = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese los grados Fahrenheit", "Datos de grados Fahrenheit", JOptionPane.WARNING_MESSAGE));
                    fac(f);
                    break;
                }
                case 3: {
                    double k = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese los grados Kelvin", "Datos de grados Kelvin", JOptionPane.WARNING_MESSAGE));
                    kac(k);
                    break;
                }
                case 4: {
                    double c = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese los grados Celsius", "Datos de grados Celsius", JOptionPane.WARNING_MESSAGE));
                    cak(c);
                    break;
                }
                case 5: {
                    double f = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese los grados Fahrenheit", "Datos de grados Fahrenheit", JOptionPane.WARNING_MESSAGE));
                    fak(f);
                    break;
                }
                case 6: {
                    double k = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese los grados Kelvin", "Datos de grados Kelvin", JOptionPane.WARNING_MESSAGE));
                    kaf(k);
                    break;
                }
                case 7: {
                    System.exit(0);
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Error al ingresar dato", "Error!", JOptionPane.ERROR_MESSAGE);
            }
    }
}
