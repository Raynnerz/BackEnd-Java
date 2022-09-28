import javax.swing.JOptionPane;
public class DiasDaSemana {
    public static void main(String [] args){
        int dias;
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 ate 7, com intuito de referenciar um dia semanal"));
        switch(dias) {
            case 1:
                JOptionPane.showMessageDialog(null,"Domingo foi o dia escolhido");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Segunda-Feira foi o dia escolhido");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Terca-Feira foi o dia escolhido"); 
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Quarta-Feira foi o dia escolhido"); 
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Quinta-Feira foi o dia escolhido");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Sexta-Feira foi o dia escolhido");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Sabado foi o dia escolhido");
                break;
        }
    }
}
