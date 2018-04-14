package OOP.Constructors.FractionsOperations;

import javax.swing.JOptionPane;

public class Fractions {

    private int num1, num2;
   
    public Fractions() {
        num1 = 0;
        num2 = 1;
    }

    public Fractions(int x, int y) {
        num1 = x;
        num2 = y;
    }

    public int leerNum() {
        num1 = Integer.parseInt((JOptionPane.showInputDialog("Ingresa el dividendo")));
        return num1;
    }

    public int leerDiv() {
        num2 = Integer.parseInt((JOptionPane.showInputDialog("Ingresa el divisor")));
        return num2;
    }

    public static Fractions sumar(Fractions a, Fractions b) {
        Fractions c = new Fractions();
        c.num1 = a.num1 * b.num2 + b.num1 * a.num2;
        c.num2 = a.num2 * b.num2;
        return c;
    }

    public static Fractions restar(Fractions a, Fractions b) {
        Fractions c = new Fractions();
        c.num1 = a.num1 * b.num2 - b.num1 * a.num2;
        c.num2 = a.num2 * b.num2;
        return c;
    }

    public static Fractions multiplicar(Fractions a, Fractions b) {
        return new Fractions(a.num1 * b.num1, a.num2 * b.num2);
    }

    public static Fractions inversa(Fractions a) {
        return new Fractions(a.num2, a.num1);
    }

    public static Fractions dividir(Fractions a, Fractions b) {
        return multiplicar(a, inversa(b));
    }

    public static void main(String[] arg) {
        menu();
    }

    public static void menu() {
        int i = 1;
        while (i != 2) {
            try {
                //Ingresando el tipo de operacion a realizar
                int op = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido! \n¿Que operacion con fraccion quiere calcular? \n1)Suma \n2)Resta \n3)Multipliacion \n4)Divicion \n5)Salir"));
                if (op >= 1 && op <= 4) {
                    Fractions x = new Fractions();//Declarando numerador = 0 y divisor=1 
                    //Pidiendo los valores de las dos fracciones
                    int x1 = x.leerNum();
                    int y1 = x.leerDiv();
                    int x2 = x.leerNum();
                    int y2 = x.leerDiv();
                    //Asignando los valores de las fracciones a y b 
                    Fractions a = new Fractions(x1, y1);
                    Fractions b = new Fractions(x2, y2);
                    //Inicio del menu 
                    switch (op) {
                        case 1: {
                            //Invocando el metodo sumar, pasandole como parametro las fracciones a y b creadas anteriormente
                            try {
                                Fractions.sumar(a, b);
                                //Comprobando si no tienen denominador cero
                                System.out.println(x1 / y1);
                                System.out.println(x2 / y2);
                                JOptionPane.showMessageDialog(null, a.num1 + "/" + a.num2 + " + " + b.num1 + "/" + b.num2 + " = " + Fractions.sumar(a, b).num1 + "/" + Fractions.sumar(a, b).num2);
                            } catch (ArithmeticException exception) {
                                System.out.println("Se intento crear una Fraccion con denominador cero");
                                System.out.println("Se trato de sumar con una fraccion con denominador cero");
                            }
                            break;
                        }
                        case 2: {
                            try {
                                Fractions.restar(a, b);
                                //Comprobando si no tienen denominador cero
                                System.out.println(x1 / y1);
                                System.out.println(x2 / y2);
                                JOptionPane.showMessageDialog(null, a.num1 + "/" + a.num2 + " - " + b.num1 + "/" + b.num2 + " = " + Fractions.restar(a, b).num1 + "/" + Fractions.restar(a, b).num2);
                            } catch (ArithmeticException exception) {
                                System.out.println("Se intento crear una Fraccion con denominador cero");
                                System.out.println("Se trato de restar con una fraccion con denominador cero");
                            }
                            break;
                        }
                        case 3: {
                            try {
                                Fractions.multiplicar(a, b);
                                //Comprobando si no tienen denominador cero
                                System.out.println(x1 / y1);
                                System.out.println(x2 / y2);
                                JOptionPane.showMessageDialog(null, a.num1 + "/" + a.num2 + " * " + b.num1 + "/" + b.num2 + " = " + Fractions.multiplicar(a, b).num1 + "/" + Fractions.multiplicar(a, b).num2);
                            } catch (ArithmeticException exception) {
                                System.out.println("Se intento crear una Fraccion con denominador cero");
                                System.out.println("Se trato de multiplicar con una fraccion con denominador cero");
                            }
                            break;
                        }
                        case 4: {
                            try {
                                Fractions.dividir(a, b);
                                //Comprobando si no tienen denominador cero
                                System.out.println(x1 / y1);
                                System.out.println(x2 / y2);
                                JOptionPane.showMessageDialog(null, a.num1 + "/" + a.num2 + " / " + b.num1 + "/" + b.num2 + " = " + Fractions.dividir(a, b).num1 + "/" + Fractions.dividir(a, b).num2);
                            } catch (ArithmeticException exception) {
                                System.out.println("Se intento crear una Fraccion con denominador cero");
                                System.out.println("Se trato de dividir con una fraccion con denominador cero");
                            }
                            break;
                        }
                        default: {
                            JOptionPane.showMessageDialog(null, "La opcion " + op + " es incorrecta, ingrese otra");
                            break;
                        }
                    }
                    i = Integer.parseInt(JOptionPane.showInputDialog("¿Desea realizar otra operacion? \n1)Si \n2)No"));
                    if (i == 2) {
                        System.exit(0);
                    }
                }
                if (op == 5) {
                    break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Se ingreso un tipo de dato no compatible");
            }
        }
    }
}
