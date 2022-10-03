public class CemNaturaisBackwards {
    public static void main(String[]args){
        int naturais = 100;

        /*Exemplo de exibição dos primeiros 100 naturais em ordem
         reversa utilizando:
         * For -- While --- Do/While
         */

        // for(naturais = 100;naturais >= 0;naturais --){
        //     System.out.println(naturais);
        // }

        // while(naturais >= 0){
        //     System.out.println(naturais);
        //     naturais -= 1;
        // }

        do{
            System.out.println(naturais);
            naturais = naturais - 1;
        }while(naturais >= 0);
    }
}
