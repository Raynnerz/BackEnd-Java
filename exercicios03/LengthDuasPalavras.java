import javax.swing.JOptionPane;

public class LengthDuasPalavras {
    public static void main(String[]args){
        String duasPalavras = JOptionPane.showInputDialog("Digite duas palavras");
        String[] palavrasSeparadas = duasPalavras.split(" ");
        JOptionPane.showMessageDialog(null, String.format
        ("O comprimento da primeira palavra e %s, e o da segunda palavra e %s", palavrasSeparadas[0].length(), palavrasSeparadas[1].length()));
    }
}
