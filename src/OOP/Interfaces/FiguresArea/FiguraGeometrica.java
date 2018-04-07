package OOP.Interfaces.FiguresArea;

/**
 *
 * @author Dake10
 */
public class FiguraGeometrica {

    public String cad = "";
    public double altura, base;
    public double h, co, ca;

    public FiguraGeometrica(double lado) {
        this.altura = lado;
    }

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public FiguraGeometrica(double h, double co, double ca) {
        this.h = h;
        this.co = co;
        this.ca = ca;
    }
}
