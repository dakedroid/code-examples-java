/*horas extras*/

import javax.swing.*;
public class ExtraHours{
    public void calhorasextra(int ht, double ph){
        double pted,ptet,phd,pht,het,he,hed;
	    he=ht-40;
	    if (he <= 8){
            phd=ph*ph;
		    pted=phd*he;
            JOptionPane.showMessageDialog(null,"Las horas extras que se pagaran doble son:"+he+"\nel pago por las horas dobles es: "+pted);
        }
        else if (he > 8 ){
            het=he-8;
	        hed=8;
 	        phd=ph*ph;
	        pted=hed*phd;
	        pht=ph*ph*ph;
            ptet=pht*het;
            JOptionPane.showMessageDialog(null,"Las horas extras que se pagaran tripe son:"+het+"\nlas horas que se pagaran doble son:"+hed+"\nel pago por las horas  triples es:"+ptet+"\nEl pago por las horas dobles es :"+pted);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al introduccir los datos, intentelo de nuevo.");
        }
    }
    public static void main (String arg[]){
        ExtraHours obj=new ExtraHours();
        double  ph;
	    int ht;
        ht=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas."));
	    ph=Double.valueOf(JOptionPane.showInputDialog("Ingrese el pago por hora. "));
        obj.calhorasextra(ht,ph);
        JOptionPane.showMessageDialog(null, "             OOOOOOO      OOOOOOO \n             OOOOOOO      OOOOOOO\n  OOOOOOOOOOOOOOOOOOOOOOOO \n" +
                "  OOOOOOO # Ejecucion # OOOOOOOO \n             OOO # Finalizada # OOOO\n             OOOOOOOOOOOOOOOOO \n                    OOOOOOOOOOOO \n"+
                "                    OOOOOOOOOOOO    \n                               OOO \n                               OOO");
    }
}

