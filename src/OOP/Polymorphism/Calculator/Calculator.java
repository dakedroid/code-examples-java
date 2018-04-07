package OOP.Polymorphism.Calculator;

import javax.swing.*;

public class Calculator {
    
    /***
     * Using Polimorfism it detects if it have to execute an addition
     * @param a it is a integer
     * @param b it is an integer
     * @return the addition fo two numbers
     */

    public int operacion(int a, int b) {

        int r;
        r = a + b;
        return r;
    }
    
    /***
     * Using Polimorfism it detects if it have to execute a multiplication 
     * @param a
     * @param b
     * @return the multiplication of two parameters
     */

    public float operacion(float a, float b) {
        float r;
        r = a * b;
        return r;
    }
    
    /***
     * Using Polimorfism it detects if it have to execute a division
     * @param a a float 
     * @param b an integer
     * @return 
     */

    public float operacion(float a, int b) {
        float r = 0;
        if (b != 0) {
            r = a / b;
        } else {
            JOptionPane.showMessageDialog(null, "B no puede 0");
        }
        return r;
    }

    
    
    public static void main(String arg[]) {
        
        Calculator obj = new Calculator();

        
        int cp;
        cp = Integer.parseInt(JOptionPane.showInputDialog("Calculadora basica \n1)suma \n2)Multipliacion \n3)Divicion  "));
        switch (cp) {
            case 1: {

                int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese b"));

                JOptionPane.showMessageDialog(null, "El resultado de la suma es " + obj.operacion(a, b));
                break;
            }
            case 2: {
                float a = Float.valueOf(JOptionPane.showInputDialog("ingrese a en flotante"));
                float b = Float.valueOf(JOptionPane.showInputDialog("ingrese b en flotante"));

                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es " + obj.operacion(a, b));
                return;
            }
            case 3: {
                float a = Float.valueOf(JOptionPane.showInputDialog("ingrese a en flotante"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese b en entero"));

                JOptionPane.showMessageDialog(null, "El resultado de la divicion" + obj.operacion(a, b));
                break;
            }

            default:
                JOptionPane.showMessageDialog(null, "ERROR");

        }

    }

}
