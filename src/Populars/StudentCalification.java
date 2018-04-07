
package Populars;


import javax.swing.*;

public class StudentCalification{
    
    public static void main (String arg []){ 
        double totalcal =0;
        int i = 1 ;
        while(i <= 5){
            double cal = Double.valueOf(JOptionPane.showInputDialog("Ingrese la calificacion del parcial:" + i));
            totalcal = cal + totalcal;
            i++;
        }
        totalcal= totalcal/5;
        double exam = Double.valueOf(JOptionPane.showInputDialog("Ingrese la calificacion del examen unico: "));
        double trabajo = Double.valueOf(JOptionPane.showInputDialog("Ingrese la calificacion del trabajo final: "));
        double prom = (totalcal*0.55)+(exam * 0.30)+(trabajo*0.15) ;
        JOptionPane.showMessageDialog(null, "El promedio de alumno es: "+ prom);
    }
    
}
