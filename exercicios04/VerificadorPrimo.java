import javax.swing.JOptionPane;
import java.util.ArrayList;
public class VerificadorPrimo {
    public static void main(String[] args) {
        int primo = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja verificar se e primo"));
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        boolean primoVerif = true;
        for (int i = 2; i <= primo; i++) {
            if (((primo % i) == 0) && (i != primo)) {
                primoVerif = false;
                divisor.add(i);
            }
        }
        if (primoVerif) {
            System.out.println(" é Primo");
        }
        else {
            System.out.println("Não é Primo e seus divisores são: ");
            for (Integer i : divisor) {
                System.out.println( i + ", ");
            }
        }
    }
}