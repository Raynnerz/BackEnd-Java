
public class Impressora {
    public void exibir (float f){
        System.out.println(f);;
    }

    public void exibir (float a, float b){
        System.out.print(a);
        System.out.print(b);
    }

    public void exibir (float a, String b){
        System.out.print(a);
        System.out.printf(b);
    }

    public void exibir (String a, float b){
        System.out.printf(a);
        System.out.println(b);
    }

    public void exibir (String a, String b, String c){
        System.out.printf(a);
        System.out.printf(b);
        System.out.printf(c);
    }

    public void exibir (int a, int b, String c){
        System.out.println(a);
        System.out.println(b);
        System.out.printf(c);
    }
}
