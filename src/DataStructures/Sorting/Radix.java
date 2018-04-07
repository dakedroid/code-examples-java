
package MetodosDeOrdenamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author LINUX
 */
public class Radix {
    
    public void radix(int [] arreglo){
        int x,i,j;
        for (x = Integer.SIZE-1; x >= 0; x--){
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (i = 0; i < arreglo.length; i++){
                boolean mover = arreglo[i] << x >= 0;
                if (x == 0 ? !mover:mover){ //Operador unario
                    auxiliar[j]=arreglo[i];
                    j++;
                }else{
                    arreglo[i-j] = arreglo[i];
                }
            }
            for (i = j; i < auxiliar.length; i++){
                auxiliar[i] = arreglo[i-j];
            }
            arreglo = auxiliar;
        }
        mostrarArreglo(arreglo);
    }

    public  void RadixSort(int [] vec){
        // Inicializacion de las variables a ocupar
        int i,m,exp,n;
        m = vec[0];
        exp = 1;
        n = vec.length;
        int [] b = new int[10];
        
        //Ciclo 1
        /*  Busca el mayor elemento en el arreglo.  */
        for (i = 1; i < n; i++){
            if (vec[i] > m){
                m = vec[i];
            }
        }
        String v = "", s= "";
        // Ciclo 2.0
        /* Dividira el Numero mas grande para conseguir sus unidades En U,D,C,M, */
        while(m / exp > 0){
            int [] bucket = new int[10];
            // Ciclo 2.1
            for (i = 0; i < n; i++){
                bucket[(vec[i]/exp)%10]++; // Inicializa bucket solo en las posiciones donde metera datos 
                // vec[0] = (9 / 1) % 10  = 9
               
                //La exprecion (a[i]/exp)%10 nos dara el dato menos significativo hasta llegar con el mas significativo
            }
            // Ciclo 2.2
            for (i = 1; i < 10; i ++){
                bucket[i] = bucket[i] + bucket[i-1]; //Mete dentro de la cubeta bucket = {1, 2, 3 ,4 ,5 ,'6' ,7, 9, 10}
                    

            }
            // Ciclo 2.3
            for (i = n -1 ; i >= 0; i--){
                // 6 , vec[6] = 3
                b[--bucket[(vec[i]/exp)%10]] = vec[i]; // b = {10, 1, 2, 3, 4, '6' , 7 , 9 } 
            }
            // Ciclo 2.4
            for (i = 0; i < n; i++)
                vec[i] = b[i];
            //intercambia los datos ordenados al vector original
            exp = exp * 10;
                        
        }
       
        //Imprimir el vector ordenado
        mostrarArreglo(vec);
    }
    public static void mostrarArreglo(int[] arreglo) {
        String k = " | ";
        for (int i = 0; i < arreglo.length; i++ ){
            k += arreglo[i] + " | ";
        }
        System.out.println(k);
    }
}
