import javax.swing.JOptionPane;

public class SubString{
    public static void main(String[]args){
        int a, b;
        String s = JOptionPane.showInputDialog("Digite uma string qualquer");
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero onde comeca a substring"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero para determinar o final da substring"));

        if(a > s.length()||b > s.length()|| a > b){
            JOptionPane.showMessageDialog(null, "ERRO: os valores de a e b devem estar dentro do comprimento da string");
        }
        else {
            String subString = String.format(" a sub string fica %s", s.substring(a,b+1));
            JOptionPane.showMessageDialog(null, subString);
        }
    }
}

