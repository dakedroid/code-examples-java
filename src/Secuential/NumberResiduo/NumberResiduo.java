package Secuential.NumberResiduo;


import javax.swing.*;

public class NumberResiduo {

    // ##### METODO QUE LEE EL NUMERO ENTERO DE 3 DIJITOS #####
    public int lectura() {
        int numx;
        numx = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero"));
        return numx;

    }

    //##### METODO QUE ME DA EL VALOR DEL NUMERO A######
    public int descon_A(int numx) {
        int A;
        A = numx / 100;
        return A;

    }

    //##### METODO QUE ME DA EL VALOR DEL NUMERO B ######
    public int descon_B(int numx, int A1) {
        int B;
        B = A1 / 10;
        return B;

    }

    //##### METODO QUE ME DA EL VALOR DEL NUMERO C ######
    public int descon_C(int numx, int A1) {
        int C;
        C = A1 % 10;
        return C;

    }

    //##### METODO QUE ME DA EL VALOR DEL RESIDUO ######
    public int descon_A1(int numx) {
        int A1;
        A1 = numx % 100;
        return A1;

    }

    //##### PROGRAMA PRINCIPAL DONDE SE INVOCAN LOS METODOS ######
    public static void main(String[] args) {
        int numx, A, B, C, A1;
        NumberResiduo obj = new NumberResiduo();
        numx = obj.lectura();
        A1 = obj.descon_A1(numx);
        A = obj.descon_A(numx);
        B = obj.descon_B(numx, A1);
        C = obj.descon_C(numx, A1);
        JOptionPane.showMessageDialog(null, "#### EL NUMERO A: " + A + " ####");
        JOptionPane.showMessageDialog(null, "#### EL NUMERO B: " + B + " ####");
        JOptionPane.showMessageDialog(null, "#### EL NUMERO C: " + C + " ####");
        JOptionPane.showMessageDialog(null, "#### ! EL PROGRAMA SE HA EJECUTADO CON EXITO ! ;) ####");

    }

}
