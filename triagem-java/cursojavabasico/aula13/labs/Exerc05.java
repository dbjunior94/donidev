package aula13.labs;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double metros = scan.nextDouble();

        double cm = metros * 100;

        System.out.println("O valor de metros para centímetros é: " + cm);
    }
}
