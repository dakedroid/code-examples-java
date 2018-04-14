package Secuential.Students;

import javax.swing.*;
public class Students {
    // #### Metodos que calculan el procentaje de cada kind of alums

    // Metodo que calcula el porcentaje de los alumnos suspensos
    public  int cal_nsus(int nsus, int tot){
        int pnsus;
        pnsus=(nsus*100)/tot;

        return pnsus;
    }
    // Meto que calcula el porcentaje de  los alumnos aprobados
    public  int cal_napro(int napro, int tot){
        int pnapro;
        pnapro=(napro*100)/tot;
        return pnapro;
    }
    // Meto que calcula el porcentaje de  los alumnos notables
    public  int cal_nota(int nnota, int tot){
        int pnnota;
        pnnota=(nnota*100)/tot;
        return pnnota;
    }
    // Meto que calcula el porcentaje de  los alumnos notables
     public  int cal_nsobre(int nsobre, int tot){
        int psobre;
        psobre=(nsobre*100)/tot;
        return nsobre;
     }
    // ## Meto que calcula el porcentaje de  los alumnos aprobados en la asignatura
    public  int cal_am(int nsus, int napro, int nnota, int nsobre, int tot){
    int pa_a;
    pa_a= (napro+nnota+nsobre)*100/tot;
    return pa_a;
    }
    //Programa principal
    public static void main(String[] args) {
        int nsus,napro,nnota,nosobre,tot,pnsus,pnapro,pnnota,psobre,pa_a;
        nsus=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuemero de alumnos suspensos"));
        napro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuemero de alumnos aprobados"));
        nnota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuemero de alumnos notables"));
        nosobre=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuemero de alumnos sobresalientes"));
        tot=nsus+napro+nnota+nosobre;
        Students obj=new Students();
        pnsus=obj.cal_nsus(nsus, tot);
        pnapro=obj.cal_napro(napro, tot);
        pnnota=obj.cal_nota(nnota,tot);
        psobre=obj.cal_nsobre(nosobre, tot);
        pa_a=obj.cal_am(nsus,napro,nnota,nosobre, tot);
        JOptionPane.showMessageDialog(null, "EL porcentaje de los alumnos suspensos es: " + pnsus + " %");
        JOptionPane.showMessageDialog(null, "EL porcentaje de los alumnos aprobados es: " + pnapro + " %");
        JOptionPane.showMessageDialog(null, "EL porcentaje de los alumnos notables es: " + pnnota + " %");
        JOptionPane.showMessageDialog(null, "EL porcentaje de los alumnos sobresalientes es: " + psobre + " %");
        JOptionPane.showMessageDialog(null, "EL porcentaje total de alumnos que aprobaron la asignatura es de " + pa_a + " %");
        JOptionPane.showMessageDialog(null, "Programa ejecutado con exito, porfavor dar clic en 'OK' para continuar");
    }
}





