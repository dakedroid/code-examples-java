package DataStructures.GraphicTree;

import java.util.ArrayList;
import javax.swing.JPanel;

public class SimuladorArbolBinario {

    Arbol miArbol = new Arbol();

    String s = "";

    public SimuladorArbolBinario() {
    }

    public boolean insertar(Integer dato) {
        return (this.miArbol.agregar(dato));
    }

    public String borrar(Integer dato) {
        Integer x = this.miArbol.borrar(dato);
        if (x == null) {
            return ("No existe el dato en el arbol");
        }
        return ("Borrado el dato: " + x.toString());
    }

    public String darHojas() {
        ArrayList it = this.miArbol.getHojas();
        return (recorrido(it, "Hojas del Arbol"));
    }

    public String darPadre(Integer hijo) {
        if (this.miArbol.getRaiz().getDato() == (hijo)) {
            return ("La raiz no tiene padre");
        }
        Integer padre = this.miArbol.padre(hijo);
        if (padre == null) {
            return ("No existe el Dato: " + hijo.toString());
        }
        return ("El padre de: " + hijo + "\n es : " + padre.toString());
    }

    public String esta(Integer dato) {
        boolean siEsta = this.miArbol.buscar(dato);
        String r = "El dato:" + dato.toString() + "\n";
        r += siEsta ? "Si se encuentra en el arbol" : "No se encuentra en el arbol";
        return (r);
    }

    public String recorrido(ArrayList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "\n";
            i++;
        }
        return (r);
    }

    public String postOrden() {
        miArbol.s = "";
        String s = "";
        Arbol temp = this.miArbol;
        s = temp.postOrden(temp.getRaiz());
        return (s);
    }

    public String inOrden() {
        miArbol.s = "";
        String s = "";
        Arbol temp = this.miArbol;
        s = temp.inOrden(temp.getRaiz());
        return (s);
    }

    public String preOrden() {
        miArbol.s = "";
        String s = "";
        Arbol temp = this.miArbol;
        s = temp.preOrden(temp.getRaiz());
        return (s);
    }

    public String CantidadNodos() {
        return this.miArbol.cantidadNodos();
    }

    public String CantidadHojas() {
        return this.miArbol.cantidadNodosHoja();
    }

    public String alturaArbol() {
        return this.miArbol.retornarAltura();
    }

    public String menorValor() {
        return this.miArbol.menorValor();
    }

    public String mayorValor() {
        return this.miArbol.mayorValor();
    }

    public String ramaMayor() {
        ArrayList it = this.miArbol.ObtenerRamamayor();
        return (recorrido(it, "Rama(s) con mas valores"));
    }

    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }

}
