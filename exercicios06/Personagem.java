public class Personagem { 
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void estado (){
        System.out.println(nome);
        System.out.println(energia);
        System.out.println(fome);
        System.out.println(sono);
    }

    void cacar (){
        if (energia >= 2){
            System.out.println(nome + " cacando");
            energia -= 2; }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
        fome = Math.min (fome + 1, 10);
        sono = Math.min (sono + 1, 10);
    }
    void comer (){ 
        if (fome >= 1){
            System.out.println(nome + " comendo."); energia = Math.min (energia + 1, 10); fome -= 1;
        } 
        else{
            System.out.println(nome + " sem fome."); }
        }
    void dormir (){ 
        if (sono >= 1){
            System.out.println(nome + " dormindo."); sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        } 
        else{
            System.out.println(nome + " sem sono."); }
    }
    
    void coletar (){
        if (energia >= 1){
            System.out.println(nome + " coletando");
            energia -= 1; }
        else{
            System.out.println(nome + " sem energia para coletar");
        }
        sono = Math.min (sono + 1, 10);
    }
}