import javax.swing.JOptionPane;
public class QuatroNumeros {
    public static void main(String[] args){
        double a, b, c, d, resultadoA, resultadoB, resultadoC, resultadoD, resultadoFinal;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        b =Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        c =Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        d =Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        resultadoA = a*a;
        resultadoB = b*b;
        resultadoC = c*c;
        resultadoD = d*d;
        resultadoFinal = + resultadoA + resultadoB + resultadoC + resultadoD;
        JOptionPane.showMessageDialog(null, "O resultado e " + resultadoFinal); 
    }
}
