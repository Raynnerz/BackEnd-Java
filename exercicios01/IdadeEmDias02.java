import javax.swing.JOptionPane;
public class IdadeEmDias02 {
    public static void main(String[]args){
        int anos, dias, meses, anosPossuidos, mesesPossuidos, resultado;
        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos voce tem"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses alem dos anos voce possui"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias desconsiderando anos e meses voce possui"));
        anosPossuidos = anos*365;
        mesesPossuidos = meses*30;
        resultado = anosPossuidos + dias + mesesPossuidos;
        String resIdade = String.format("Voce possui %d dias ao somar seus anos, meses e dias", resultado);
        JOptionPane.showMessageDialog(null, resIdade);
    }
}
