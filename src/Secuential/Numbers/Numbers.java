package Secuential.Numbers;


import javax.swing.*;

public class Numbers {

    public int con_3(int A, int B, int C) {
        int numx;
        numx = (A * 100) + (B * 10) + C;

        return numx;

    }

    public static void main(String[] args) {

        int A, B, C, numx;

        A = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero C"));
        Numbers obj = new Numbers();

        numx = obj.con_3(A, B, C);
        JOptionPane.showMessageDialog(null, "EL NUMERO ES: " + numx);

    }

}
