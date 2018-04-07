package OOP.Interfaces.FiguresPerimeter;

abstract class Perimetro {

    static double l;

    void setDatos(double l) {
        this.l = l;

    }

    abstract double CalPeri();
}
