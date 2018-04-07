package OOP.Interfaces.Calculator;

/**
 *
 * @author Dake10
 */
public abstract class Operaciones {

    static double x;
    static double y;

    void setDatos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double opera();
}
