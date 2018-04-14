
import javax.swing.*;

public class salario {

    public float salari() {
        float sal;
        sal = Float.valueOf(JOptionPane.showInputDialog("Ingresa el salario actual: $"));
        return sal;
    }

    public double salac(float sal) {
        double salact;
        salact = sal * 1.25;
        return salact;
    }

    public static void main(String args[]) {

        salario obj = new salario();
        float sal;
        double salact;
        sal = obj.salari();
        salact = obj.salac(sal);
        JOptionPane.showMessageDialog(null, "El el nuevo sueldo es: $" + salact);
    }
}
