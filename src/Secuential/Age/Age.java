
import javax.swing.*;

public class Age {

    public int c_eda(int anos, int meses) {
        int eda;
        eda = anos * 12 + meses;

        return eda;
    }

    public static void main(String args[]) {
        int anos, meses, edadf;

        anos = Integer.valueOf(JOptionPane.showInputDialog("Ingresa los años :"));
        meses = Integer.valueOf(JOptionPane.showInputDialog("Ingresa los meses:"));

        Age obj = new Age();
        edadf = obj.c_eda(anos, meses);
        JOptionPane.showMessageDialog(null, "La edad en meses es " + edadf);

    }

}
