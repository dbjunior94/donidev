package aula10;

public class Variaveis {

    public static void main(String[] args) {

        //convenção Java
        int idade = 20;
        String nome = "Doni";
        String nomeDoMeuCachorro = "Luna" ;

        // Aceita, mas não utlizado
        int _idade;
        int $idade;

        // não é convenção Java
        String ano2014 = "2014";
        String nome_do_meu_cachorro;

        idade = 25;

        // má prática
        int a = 10;
        String b = "Loiane";


        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

    }
}
