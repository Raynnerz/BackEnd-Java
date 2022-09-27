import javax.swing.JOptionPane;

public class PrecoCarroNovo {
    public static void main(String[]args){
        
        double precoFabrica, precoFinal;
        precoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Qual o preco de fabrica em R$?"));
        
        precoFinal = precoFabrica + precoFabrica*0.28 + precoFabrica*0.45;
        
        String precoFinalS = String.format("O preco final ficou: R$%.2f", precoFinal);
        JOptionPane.showMessageDialog(null, precoFinalS);
    }
}
