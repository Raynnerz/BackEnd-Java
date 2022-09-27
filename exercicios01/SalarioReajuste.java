import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class SalarioReajuste {
    public static void main(String[] args){
        double salario, reajuste, salarioAjustado, novoReajuste;
        salario = parseDouble(showInputDialog("Informe o salario atual em R$"));
        reajuste = parseDouble(showInputDialog("Informe o reajuste em percentual almejado"));
        
        novoReajuste = reajuste/100;
        salarioAjustado = salario + salario*novoReajuste;

        String s = String.format("O salario reajustado ficou: R$%.2f", salarioAjustado);
        showMessageDialog(null, s);
    }
}
