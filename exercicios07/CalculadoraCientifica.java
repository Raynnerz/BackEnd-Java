
public class CalculadoraCientifica {
    
    public int raiz (int a) {
        return (int) Math.sqrt(a);
    }
    public double raiz (double a) {
        return Math.sqrt(a);
    }
    public int raiz (String a) {
        return (int) Math.sqrt(Double.parseDouble(a));
    }
    public double potencia (char a, char b) {
        return Math.pow(a, b);
    }
    public double potencia (String s1, String s2) {
        return Math.pow(Double.valueOf(s1), Double.valueOf(s2));
    }
    public double potencia (int a, double b) {
        return (int) Math.pow(a, b);
    }
}