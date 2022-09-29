import java.util.Scanner;

public class CompararDuasStrings{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        String s1, s2;
        System.out.println("Digite a primeira string");
        s1 = leitor.nextLine();
        System.out.println("Digite a segunda string");
        s2 = leitor.nextLine();

        int resultado = s1.compareTo(s2);
        if (resultado < 0)
            System.out.printf("%s vem antes de %s\n", s1, s2);
        else if (resultado == 0)
            System.out.printf ("%s e %s sao iguais\n", s1, s2);
        else
            System.out.printf ("%s vem antes de %s", s2, s1);

        leitor.close();
    }
}