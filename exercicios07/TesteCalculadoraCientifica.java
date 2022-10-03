
public class TesteCalculadoraCientifica {
    public static void main(String[] args){
    CalculadoraCientifica robson = new CalculadoraCientifica();

    int res1 = robson.raiz(4);
    
    double res2 = robson.raiz(9.4f);

    int resString = robson.raiz("4");

    double resChar = robson.potencia(2, 3);

    double resString2 = robson.potencia("3", "2");
    
    double resIntDouble = robson.potencia(10, 2.4f);

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(resString);
    System.out.println(resChar);
    System.out.println(resString2);
    System.out.println(resIntDouble);

    }
}
