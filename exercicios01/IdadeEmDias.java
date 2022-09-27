import javax.swing.JOptionPane;
public class IdadeEmDias {
    public static void main(String[]args){
        int anos, dias;
        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos"));
        dias = anos*365;
        String QtdeDias = String.format("Voce tem %d dias de idade", dias);
        JOptionPane.showMessageDialog(null, QtdeDias);
    }
}
