import javax.swing.JOptionPane;
public class AnoBissextoFinder {
    public static void main(String[]args){
        int anoBissexto;
        anoBissexto = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja investigar"));
        if (anoBissexto % 4 == 0 && anoBissexto % 100 != 0 || anoBissexto % 400 == 0){
            System.out.println("O ano e bissexto");
        }
        else{
            System.out.println("O ano nao e bissexto");
        }
    }
}
