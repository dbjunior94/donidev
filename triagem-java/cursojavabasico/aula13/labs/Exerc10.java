package aula13.labs;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius: ");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("A temperatura " + c + " C é igual a " + f + " F");
    }
}
