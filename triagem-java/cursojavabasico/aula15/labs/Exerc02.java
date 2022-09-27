package aula15.labs;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor:");
        int valor = scan.nextInt();

        if(valor >= 0){
            System.out.println("O número informado é positivo");
        }else{
            System.out.println("O número informado é negativo");
        }

    }
}
