import javax.swing.JOptionPane;

public class SistemaEleitores {
    public static void main(String[]args){
        int numEleitores;
        double votosEmBrancoPercentual, votosNulosPercentual, votosValidosPercentual,
         votosEmBranco, votosNulos, votosValidos; 

        numEleitores = Integer.parseInt(JOptionPane.showInputDialog("Quantos eleitores existem"));
        votosEmBranco = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos votos em branco"));
        votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos votos nulos"));
        votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos votos validos"));

        votosEmBrancoPercentual = votosEmBranco/numEleitores*100;
        votosNulosPercentual = votosNulos/numEleitores*100;
        votosValidosPercentual = votosValidos/numEleitores*100;

        String porcentagens = String.format("Porcentagem de votos em branco: %.2f,\n Porcentagem de votos nulos: %.2f,\n Porcentagem de votos validos: %.2f", votosEmBrancoPercentual, votosNulosPercentual,  votosValidosPercentual);

        JOptionPane.showMessageDialog(null, porcentagens);

        
    }
}
