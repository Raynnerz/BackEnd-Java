import javax.swing.JOptionPane;
public class BaseRetangulo {
    public static void main(String[]args){
        int base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo"));
        String unidadeMedida = JOptionPane.showInputDialog("Digite a unidade de medida(km, hm, dam, m, dm, cm, mm)");
        area = base*altura;
        switch(unidadeMedida){
            case "mm":
                JOptionPane.showMessageDialog(null, area + " mm quadrados");
                break;
            case "cm":
                JOptionPane.showMessageDialog(null, area + " cm quadrados");
                break;
            case "dm":
                JOptionPane.showMessageDialog(null, area + " dm quadrados");
                break;
            case "m":
                JOptionPane.showMessageDialog(null, area + " m quadrados");
                break;
            case "dam":
                JOptionPane.showMessageDialog(null, area + " dam quadrados");
                break;
            case "hm":
                JOptionPane.showMessageDialog(null, area + " hm quadrados");
                break;
            case "km":
                JOptionPane.showMessageDialog(null, area + " km quadrados");
                break;
        }
    }
}
