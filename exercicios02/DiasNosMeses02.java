import javax.swing.JOptionPane;
public class DiasNosMeses02 {
    public static void main(String[]args){
        int meses;
        meses = Integer.parseInt(JOptionPane.showInputDialog("Informe um mes do ano usando valores de 1 a 12"));
        
        switch (meses){
            case 1:
            case 3:                
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                JOptionPane.showMessageDialog(null,"O mes escolhido possui 31 dias");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"O mes escolhido possui 28, ou 29 dias caso o ano seja bissexto");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                JOptionPane.showMessageDialog(null,"O mes escolhido possui 30 dias");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Incoerente ao requerido anteriormente");
        }
    }
}
