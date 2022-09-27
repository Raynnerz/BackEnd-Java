import javax.swing.JOptionPane;

public class ComissaoVendedores {
    public static void main(String[] args){
        double comissao, precoPeca, pgtoComissao;
        int qntdPeca;
        precoPeca = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco da peca em R$"));
        qntdPeca = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas pecas foram vendidas"));
        comissao = 0.05;
        pgtoComissao = precoPeca*qntdPeca*comissao;
        String resComissao = String.format("A comissao do vendedor sera de 5 porcento R$%.2f",pgtoComissao);
        JOptionPane.showMessageDialog(null, resComissao);
    }
}
