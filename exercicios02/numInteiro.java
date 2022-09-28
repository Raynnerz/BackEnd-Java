import javax.swing.JOptionPane;

public class numInteiro{
    public static void main(String[] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero escolhido"));
        if (numero > 0){
            JOptionPane.showMessageDialog(null, "Positivo");
        }
        else if (numero < 0){
            JOptionPane.showMessageDialog(null, "Negativo");
        }
        else {
            JOptionPane.showMessageDialog(null, "Neutro");
        }
    }
}
