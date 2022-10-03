
public class TesteImpressora {
    public static void main(String[] args){
        Impressora dell = new Impressora();

        dell.exibir(2.5f);

        dell.exibir(3.4f, 5.6f);

        dell.exibir(7.4f, "Strong");

        dell.exibir("Strange", 6.6f);

        dell.exibir("Stranger","Strangest", "much Stranger");

        dell.exibir(1,2,"Tres");

    }
}
