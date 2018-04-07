package OOP.Inheritance.PeopleList;

import java.util.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Dake10
 */
public class main {

    static String cadO = "";

    public static void pintaLista(List lista) {
        for (int i = 0; i < lista.size(); i++) {
            //System.out.println(lista.get(i));
            cadO += lista.get(i) + "\n";
        }
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenidos");
        String cad = "";
        int x = 1;
        while (x != 2) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de lista desea generar? \n1)General \n2)Estudiantes \n3)Empleados \n4)Estudiantes-Empleados"));

            switch (op) {
                case 1: {
                    cad = "";
                    int i = 0;
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos registros desea almacenar"));
                    String vec[] = new String[num];
                    List lista = new ArrayList();
                    while (i < num) {
                        String nombre = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nNombres"));
                        String apellidos = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nApellidos"));
                        String curp = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nCURP "));
                        String fechaNacimiento = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nFecha de Nacimiento DD/MM/AAAA"));
                        Persona p = new Persona(nombre, apellidos, curp, fechaNacimiento);
                        String v = String.valueOf(p.toString());
                        vec[i] = v;
                        lista.add(vec[i]);
                        cad += vec[i] + "\n";
                        i++;
                    }
                    //METODO QUE ORDENA LA LISTA 
                    Collections.sort(lista);
                    // METODO QUE GENERA LA LISTA 
                    pintaLista(lista);
                    JOptionPane.showMessageDialog(null, "| APELLIDO NOMBRE | CURP | FECHA DE NACIMIENTO\n\n" + "LISTA DE PERSONAS GENERAL SIN ORDENAR \n\n" + cad + "\nLISTA DE PERSONA GENERAL ORDENADA ALFABETICAMENTE\n\n" + cadO);
                    break;
                }
                case 2: {
                    cad = "";
                    int i = 0;
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cuantos Registros Deseea Almacenar"));
                    String vec[] = new String[num];
                    List lista = new ArrayList();
                    while (i < num) {
                        String nombre = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nNombres"));
                        String apellidos = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nApellidos"));
                        String curp = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nCURP "));
                        String fechaNacimiento = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nFecha de Nacimiento DD/MM/AAAA"));
                        int numeroControl = Integer.parseInt(JOptionPane.showInputDialog("Registro: " + i + "\nNumero de Control\n"));
                        double promedioG = Integer.parseInt(JOptionPane.showInputDialog("Registro: " + i + "\nPromedio General\n"));
                        String escuela = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nEscuela\n"));
                        Persona p = new Persona(nombre, apellidos, curp, fechaNacimiento);
                        Estudiante est = new Estudiante(nombre, apellidos, curp, fechaNacimiento, numeroControl, promedioG, escuela);
                        String v = String.valueOf(p.toString() + " " + est.toString());
                        vec[i] = v;
                        lista.add(vec[i]);
                        cad += vec[i] + "\n";
                        i++;
                    }
                    //METODO QUE ORDENA LA LISTA 
                    Collections.sort(lista);
                    // METODO QUE GENERA LA LISTA 
                    pintaLista(lista);
                    JOptionPane.showMessageDialog(null, "| APELLIDO NOMBRE | CURP | FECHA DE NACIMIENTO | NUMERO DE CONTROL | PROMEDIO GENERAL | ESCUELA|\n\n" + "LISTA DE PERSONAS ESTUDIANTES SIN ORDENAR \n\n" + cad + "\nLISTA DE PERSONA ESTUDIANTES ORDENADA ALFABETICAMENTE\n\n" + cadO);
                    break;
                }
                case 3: {
                    cad = "";
                    int i = 0;
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos registros desea almacenar"));
                    String vec[] = new String[num];
                    List lista = new ArrayList();
                    while (i < num) {
                        String nombre = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nNombres"));
                        String apellidos = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nApellidos"));
                        String curp = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nCURP "));
                        String fechaNacimiento = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nFecha de Nacimiento DD/MM/AAAA"));
                        int nss = Integer.parseInt(JOptionPane.showInputDialog("Registro: " + i + "\nNSS"));
                        int dni = Integer.parseInt(JOptionPane.showInputDialog("Registro: " + i + "\nDNI"));
                        String nombreEmpresa = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nNombre De la Empresa"));
                        Trabajador t = new Trabajador(nombre, apellidos, curp, fechaNacimiento, nss, dni, nombreEmpresa);
                        Persona p = new Persona(nombre, apellidos, curp, fechaNacimiento);
                        String v = String.valueOf(p.toString() + " " + t.toString());
                        vec[i] = v;
                        lista.add(vec[i]);
                        cad += vec[i] + "\n";
                        i++;
                    }
                    //METODO QUE ORDENA LA LISTA 
                    Collections.sort(lista);
                    // METODO QUE GENERA LA LISTA 
                    pintaLista(lista);
                    JOptionPane.showMessageDialog(null, "| APELLIDO NOMBRE | CURP | FECHA DE NACIMIENTO | NSS | DNI | NOMBRE DE EMPRESA|\n\n" + "LISTA DE PERSONAS TRABAJADOR SIN ORDENAR \n\n" + cad + "\nLISTA DE PERSONA TRABAJADOR ORDENADA ALFABETICAMENTE\n\n" + cadO);
                    break;
                }
                case 4: {
                    cad = "";
                    int i = 0;
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cuantos Registros Deseea Almacenar"));
                    String vec[] = new String[num];
                    List lista = new ArrayList();
                    while (i < num) {
                        String nombre = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nNombres"));
                        String apellidos = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nApellidos"));
                        String curp = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nCURP "));
                        String fechaNacimiento = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nFecha de Nacimiento DD/MM/AAAA"));
                        int numeroControl = Integer.parseInt(JOptionPane.showInputDialog("Registro: " + i + "\nNumero de Control\n"));
                        double promedioG = Integer.parseInt(JOptionPane.showInputDialog("Registro: " + i + "\nPromedio General\n"));
                        String escuela = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nEscuela\n"));
                        int nss = Integer.parseInt(JOptionPane.showInputDialog("Registro: " + i + "\nNSS"));
                        int dni = Integer.parseInt(JOptionPane.showInputDialog("Registro: " + i + "\nDNI"));
                        String nombreEmpresa = String.valueOf(JOptionPane.showInputDialog("Registro: " + i + "\nNombre De la Empresa"));
                        String mayorEdad = String.valueOf(JOptionPane.showInputDialog("Registro" + i + "\n¿Es mayor de Edad? \n1)Si \n2)No"));
                        Persona p = new Persona(nombre, apellidos, curp, fechaNacimiento);
                        Estudiante est = new Estudiante(nombre, apellidos, curp, fechaNacimiento, numeroControl, promedioG, escuela);
                        Trabajador tb = new Trabajador(nombre, apellidos, curp, fechaNacimiento, nss, dni, nombreEmpresa);
                        EmpleadoEstudiante ee = new EmpleadoEstudiante(nombre, apellidos, curp, fechaNacimiento, numeroControl, promedioG, escuela, nss, dni, nombreEmpresa, mayorEdad);
                        String v = String.valueOf(p.toString() + " " + tb.toString() + "" + est.toString() + " " + ee.toString());
                        vec[i] = v;
                        lista.add(vec[i]);
                        cad += vec[i] + "\n";
                        i++;
                    }
                    //METODO QUE ORDENA LA LISTA 
                    Collections.sort(lista);
                    // METODO QUE GENERA LA LISTA 
                    pintaLista(lista);
                    JOptionPane.showMessageDialog(null, "| APELLIDO NOMBRE | CURP | FECHA DE NACIMIENTO | NUMERO DE CONTROL | PROMEDIO GENERAL | ESCUELA | NSS | DNI | NOMBRE DE LA EMPRESA | ES MAYOR DE EDAD | \n\n" + "LISTA DE PERSONAS ESTUDIANTES-EMPLEADOS SIN ORDENAR \n\n" + cad + "\nLISTA DE PERSONA ESTUDIANTES-EMPLEADOS ORDENADA ALFABETICAMENTE\n\n" + cadO);
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta");
                    break;
            }
            x = Integer.parseInt(JOptionPane.showInputDialog("¿Desea Realizar otra operacion? \n1)Si \n2)No"));
        }
    }
}
