public class primeiros100Naturais {
    public static void main(String[]args){
        int naturais = 0;

        /*Exemplo de exibição dos primeiros 100 naturais utilizando:
         * For -- While --- Do/While
         */

        // for(naturais = 0;naturais <= 100;naturais ++){
        //     System.out.println(naturais);
        // }

        // while(naturais <= 100){
        //     System.out.println(naturais);
        //     naturais += 1;
        // }
        
        do{
            System.out.println(naturais);
            naturais = naturais + 1;
        }while(naturais <= 100);
    }
}
