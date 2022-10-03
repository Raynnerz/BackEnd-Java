import static javax.swing.JOptionPane.showInputDialog;
import javax.swing.JOptionPane;
public class TesteLivroDeNotas {
    public static void main(String[] args) {

        String nomeDaDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina");
        //variável de referência
        LivroDeNotas livroDeNotas;

        //um objeto sendo construído
        livroDeNotas = new LivroDeNotas();
        //livroDeNotas.nomeDaDisciplina = nomeDaDisciplina;
        livroDeNotas.setNomeDisciplina(nomeDaDisciplina);

        //System.out.println(livroDeNotas.nomeDisciplina);
        System.out.println(livroDeNotas.getNomeDisciplina());

        livroDeNotas.exibirMensagem();


        LivroDeNotas livro2 = new LivroDeNotas();
        //syntax sugar
        //livro2.nomeDaDisciplina = "Modelagem";
        livro2.setNomeDisciplina("Modelagem");


        nomeDaDisciplina = showInputDialog("Outra disciplina");

        livroDeNotas = new LivroDeNotas();
        
        //você não quer fazer isso
        System.gc();

        

        // while(true){
        //     new LivroDeNotas();
        // }



    }
}
