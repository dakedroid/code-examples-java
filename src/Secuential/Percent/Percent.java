import javax.swing.*;

public class Percent {

    // este metodo calcula el porcentaje su primer examen
    public  double cal_pe1(double c1){
        double pe1;
        pe1=c1*0.30;
        return pe1;
    }
    // este metodo calcula el porcentaje su primer examen
    public  double cal_pe2(double c2){
        double pe2;
        pe2=c2*0.30;
        return pe2;
    }
    // este metodo calcula el porcentaje su primer examen
    public  double cal_pe3(double c3){
        double pe3;
        pe3=c3*0.40;
        return pe3;
    }
    //Proceso principal
    public static void main(String[] args) {
        double c1,c2,c3,pe1,pe2,pe3,pct;
        c1 = Double.valueOf(JOptionPane.showInputDialog("ingrese la calificacion del primer examen"));
        c2 = Double.valueOf(JOptionPane.showInputDialog("ingrese la calificacion del segundo examen"));
        c3 = Double.valueOf(JOptionPane.showInputDialog("ingrese la calificacion del tercer examen"));
        Percent obj=new Percent();
        pe1=obj.cal_pe1(c1);
        pe2=obj.cal_pe2(c2);
        pe3=obj.cal_pe3(c3);
        pct=pe1+pe2+pe3;
        JOptionPane.showMessageDialog(null, "El porcentaje total enbase a a las calificaciones de los exmanes parciales es: " + pct);
    }
}





