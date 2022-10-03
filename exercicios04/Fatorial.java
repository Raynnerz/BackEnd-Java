import javax.swing.JOptionPane;
public class Fatorial {
    public static void main(String[]args){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero cujo fatorial deve ser calculado"));
        double fatorial = num;
        while(num > 1){
            fatorial = fatorial * (num - 1); num --;
        }
        String fatorialVal = String.format("O valor do fatorial e igual a: %.2f", fatorial);
        JOptionPane.showMessageDialog(null, fatorialVal);
    }
}

