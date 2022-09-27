import javax.swing.JOptionPane;
public class CotacaoDolar{
    public static void main(String[] args){
        double cotacao = 4.85;
        double precoEmReal;
        double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco em dolar U$"));
        precoEmReal = dolar*cotacao;
        String resReal = String.format("O preco em real e R$%.2f", precoEmReal);
        JOptionPane.showMessageDialog(null, resReal);
    }
}