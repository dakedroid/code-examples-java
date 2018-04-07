/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Inheritance.Worker;

/**
 *
 * @author Dake10
 */
import javax.swing.*;

public class Consultoria {

    public static void main(String arg[]) {
        Trabajador trabajador;
        Empleado empleado;
        Consultor consultor;

        trabajador = new Trabajador("Juan ", "456");
        empleado = new Empleado("Jose ", "123", 24000.0);
        consultor = new Consultor("Juan ", "456", 10, 50.0);

        //Salida estandar 
        JOptionPane.showMessageDialog(null, trabajador);
        JOptionPane.showMessageDialog(null, empleado);
        JOptionPane.showMessageDialog(null, consultor);
        //COMPARACION DE OBJETOS CON EQUALS
        JOptionPane.showMessageDialog(null, trabajador.equals(empleado));
        JOptionPane.showMessageDialog(null, trabajador.equals(consultor));
    }
}
