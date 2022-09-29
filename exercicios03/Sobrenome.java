import javax.swing.JOptionPane;
public class Sobrenome{
    public static void main(String[]args){
        String nomeComSobrenome = JOptionPane.showInputDialog("Qual o seu nome e sobrenome?");
        String[] nomeSeparado = nomeComSobrenome.split(" ");
        JOptionPane.showMessageDialog(null, String.format
        ("Ola, %s. Seu sobrenome e %s", nomeSeparado[0], nomeSeparado[1]));         
    }
}