import javax.swing.JOptionPane;
public class MaiorEntreTresVal {
    public static void main(String []args){
        double primeiroVal, segundoVal, terceiroVal;
        primeiroVal = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor escolhido"));
        segundoVal = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor escolhido"));
        terceiroVal = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor escolhido"));
        
        if (primeiroVal > segundoVal && primeiroVal > terceiroVal){
            System.out.println("o primeiro valor e o maior entre os tres valores escolhidos");
        }
        else if(segundoVal > terceiroVal){
            System.out.println("o segundo valor e o maior entre os tres valores escolhidos");
        }
        else {
            System.out.println("o terceiro valor e o maior entre os tres valores escolhidos");
        }
    }
}
