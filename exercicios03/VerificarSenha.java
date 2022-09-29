import javax.swing.JOptionPane;

public class VerificarSenha {
    public static void main(String[]args) {
        String requisitos = String.format("Sua senha deve conter 4 digitos:\nIniciar pela letra a ou A ignorando a caixa:\nConter pelo menos um numero impar:");
        JOptionPane.showMessageDialog(null, requisitos);
        String senha = JOptionPane.showInputDialog("Digite sua senha");
        String letraA = "a";
        String primeiraLetraSenha = Character.toString(senha.charAt(0));

        if (senha.length() == 4){
            if (primeiraLetraSenha.equalsIgnoreCase(letraA)){
                if (senha.contains("1") || senha.contains("3") || senha.contains("5") || senha.contains("7") || senha.contains("9")){
                    JOptionPane.showMessageDialog(null, "A senha respeita todas as demandas");
                }
                else {
                    JOptionPane.showMessageDialog(null, "ERRO: A senha deve conter ao menos um numero impar");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "ERRO: A senha deve comecar com 'a' ou 'A'");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"ERRO: Sua senha deve ter alcance de 4 digitos");
        }
    }
}
        