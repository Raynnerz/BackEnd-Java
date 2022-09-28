import javax.swing.JOptionPane;
public class DiasNosMeses {
    public static void main(String [] args){
        int meses;
        meses = Integer.parseInt(JOptionPane.showInputDialog("Informe um mes do ano usando valores de 1 a 12"));
        
        switch (meses){
            case 1:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Fevereiro, portanto pode ter 28 ou 29 dias, conforme a ocorrencia do ano bissexto");
                break;    
            case 3:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Marco");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Junho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Julho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Setembro");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Outubro");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Novembro");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"O mes escolhido e Dezembro");
                break;
        }

        if (meses == 4 || meses == 6 || meses == 9 || meses == 11){
            JOptionPane.showMessageDialog(null, "O mes possui 30 dias");
        }
        else if(meses == 1 || meses == 3 || meses == 5 || meses == 7 || meses == 8 || meses == 10 || meses == 12){
            JOptionPane.showMessageDialog(null, "O mes possui 31 dias");
        } 
    }
}
