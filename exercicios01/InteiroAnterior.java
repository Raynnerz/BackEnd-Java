import javax.swing.JOptionPane;

public class InteiroAnterior {
    public static void main(String[]args){
        int numInt;
        numInt = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
        JOptionPane.showMessageDialog(null, numInt - 1);
    }
}
