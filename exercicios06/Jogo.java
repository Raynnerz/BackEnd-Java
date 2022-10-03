public class Jogo {
    public static void main(String[] args) throws InterruptedException {
    Personagem cacador = new Personagem();
    Personagem soneca = new Personagem ();
    Personagem coletor = new Personagem();

    soneca.nome = "Soneca";
    cacador.nome = "John";
    coletor.nome = "Sarah";

    while (true){
        cacador.cacar();
        soneca.dormir();
        cacador.comer();
        soneca.dormir();
        cacador.dormir();
        soneca.dormir();
        cacador.cacar();
        soneca.comer();
        cacador.cacar();
        soneca.cacar();
        coletor.coletar();
        coletor.comer();
        coletor.dormir();
        coletor.coletar();
        coletor.estado();
        cacador.estado();
        soneca.estado();
        System.out.println("====================");
        Thread.sleep(3000);
        } 
    } 
}