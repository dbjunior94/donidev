package aula13.labs;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o primeiro número:");
        int num2 = scan.nextInt();

        int soma  = num1 + num2;

        System.out.println("a soma dos dois números é: " + soma);

    }
}
