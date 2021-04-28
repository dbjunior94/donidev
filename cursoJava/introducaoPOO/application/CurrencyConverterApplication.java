package cursoJava.introducaoPOO.application;

import cursoJava.introducaoPOO.entities.CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverterApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollars price?");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }
}
