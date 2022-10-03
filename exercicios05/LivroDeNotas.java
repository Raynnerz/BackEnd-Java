//alta coesão

public class LivroDeNotas{
    //variável de instância
    //instância é sinônimo de objeto
    //modificador de acesso: private
    private String nomeDisciplina;

    //método modificador
    //setter
    public void setNomeDisciplina(String nomeDisciplina){
        //operador de auto referência: this
        if (nomeDisciplina.length() >= 10)
            this.nomeDisciplina = nomeDisciplina;
    }

    //método de acesso
    //getter
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }


    //método
    public void exibirMensagem(){
        System.out.println ("Bem vindo ao livro de notas da disciplina " + nomeDisciplina);    
    } 
}