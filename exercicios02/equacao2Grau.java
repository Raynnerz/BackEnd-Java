import javax.swing.JOptionPane;

public class equacao2Grau {
    public static void main(String[] args){
        double a, b, c, x1, x2;
        JOptionPane.showMessageDialog(null, "Informe os coeficientes da equacao desejada:");
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));

        double delta = b*b -4*a*c;
        double raizDelta = Math.sqrt(delta);
        System.out.println(raizDelta);

        x1 = (-b + raizDelta) / (2*a);
        x2 = (-b - raizDelta) / (2*a);

        if (delta > 0){
            String raizes = String.format("Os valores das raizes sao x1: %.2f; x2: %.2f", x1, x2);
            JOptionPane.showMessageDialog(null, raizes);
        }
        else if (x1 >= 0){
                String raiz = String.format("uma unica raiz %.2f", x1);
                JOptionPane.showMessageDialog(null, raiz);
            }
            else if (x1 < 0){
                String raiz = String.format("uma unica raiz %.2f", x1);
                JOptionPane.showMessageDialog(null, raiz);
            }
            else if (x2 >= 0) {
                String raiz = String.format("uma unica raiz %.2f", x2);
                JOptionPane.showMessageDialog(null, raiz);
            }
            else if (x2 < 0){
                String raiz = String.format("uma unica raiz %.2f", x2);
                JOptionPane.showMessageDialog(null, raiz);
            }
        else {
            JOptionPane.showMessageDialog(null,"nao existem raizes reais");
        }
    }
} 
 
