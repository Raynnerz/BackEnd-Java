public class Calculadora{
    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo
    //isso é a definição de um método
    public int somar (int a, int b){
        return a + b;
    }
    //Dois métodos iguais não podem coexistir
    /*public int somar (int x, int y) {
        return x * y;
    }*/
    //A forma de diferenciação pode ser feita também pela forma de saída 
    /*public float somar (int a, int b) {
        return a + b;
    }*/

    public float somar (float a, float b){
        return a + b;
    }

    public int somar (String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public int somar (int a, int b, int c){
        return a + b + c;
    }

    public int somar (int a, String b){
        return a + Integer.parseInt(b);
    }

    public int somar (String a, int b){
        return Integer.parseInt(a) + b;
    }

    public int multiplicar (int a, int b){
        return 0;
    }
}