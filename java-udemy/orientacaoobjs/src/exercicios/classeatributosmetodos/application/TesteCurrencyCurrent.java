package exercicios.classeatributosmetodos.application;

import static exercicios.classeatributosmetodos.util.CurrencyConverter.*;

import exercicios.classeatributosmetodos.util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class TesteCurrencyCurrent {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("What is the dollar price? ");
    double dolarPrice = sc.nextDouble();
    System.out.print("How many dollars will be bought? ");
    double amount = sc.nextDouble();
    double result = dolarToReal(amount, dolarPrice);
    System.out.printf("Amount to be paid in reais = %.2f%n", result);
    sc.close();
  }
}
