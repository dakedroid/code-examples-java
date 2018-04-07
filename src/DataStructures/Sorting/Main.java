/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures.Sorting;

import javax.swing.JOptionPane;

/**
 *
 * @author LINUX
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String k = "", s = "", n = "", v = "", l = "";
        //int vec[] = {10,1,2,3,6,7,9};
        int vec[] = {9,2,10,1,7,6,3};
        int b[] = {10,1,2,3,6,7,9};
        int[] bucket = new int[10];
        int exp = 10;
        int a = vec.length;
        // Ciclo 2.1
        for (int i = 0; i < vec.length; i++) {
            bucket[(vec[i] / exp) % 10]++;
           // s+= (vec[i] / exp) % 10+"\n" ;
        }
        
        // Ciclo 2.2
        for (int i = 1; i < 10; i++) {
            bucket[i] = bucket[i] + bucket[i - 1];
            //s+= (bucket[i] = bucket[i] + bucket[i - 1]) + "\n";
        }
        
        // Ciclo 2.3
        int pos = 0;
        int resu ;
        for (int i = a - 1; i >= 0; i--) {
            b[--bucket[(vec[i] / exp) % 10]]  =  vec[i];
           // s+= (b[--bucket[(vec[i] / exp) % 10]]  =  vec[i])+"\n";
            //s+= (--bucket[(vec[i] / exp) % 10])+ "\n";
        
        }
        JOptionPane.showMessageDialog(null, s);
        for (int i = 0; i < a; i++){
              // v+= ( vec[i] = b[i])+ "\n";
              v+= b[i]+"\n";
        
        }
        JOptionPane.showMessageDialog(null, v);
            exp = exp * 10;
        //JOptionPane.showMessageDialog(null, "i\n"+k);
        //JOptionPane.showMessageDialog(null, "vec[i]/exp)%10\n" + s);
        //JOptionPane.showMessageDialog(null, "--bucket[(vec[i] / exp) % 10]\n"+n);
        //JOptionPane.showMessageDialog(null, "b[pos] = vec[i]\n"+ v);

        /*
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
         int vec1 [] = {5,6,3,44,22,1};
         System.out.println("Arreglo sin ordenar: ");
         ordenar.mostrarArreglo(vec1);
         System.out.println("Arreglo ordenado con radix");
         ordenar.RadixSort(vec1);
                */
    }
}
