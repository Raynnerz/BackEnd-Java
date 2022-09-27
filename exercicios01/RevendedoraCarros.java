import javax.swing.JOptionPane;

public class RevendedoraCarros {
    public static void main(String[] args){
        double salario, comissaoPorCarro, salarioFinal, valorVendas;
        int qntCarro;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salario fixo do funcionario em R$?"));
        comissaoPorCarro = Double.parseDouble(JOptionPane.showInputDialog("Qual a comissao por carro em R$?"));
        qntCarro = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros ele vendeu?"));
        valorVendas = Integer.parseInt(JOptionPane.showInputDialog("Qual Valor total de suas vendas em R$?"));

        salarioFinal = salario + comissaoPorCarro*qntCarro + valorVendas*0.05;

        String salarioFinalS = String.format("O salario final do funcionario em R$%.2f ", salarioFinal);
        JOptionPane.showMessageDialog(null, salarioFinalS);
    }
}
