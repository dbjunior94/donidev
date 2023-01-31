import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);
    int cod1, pec1, cod2, pec2;
    double valor1, valor2, total;
    cod1 = scan.nextInt();
    pec1  = scan.nextInt();
    valor1 = scan.nextDouble();
    cod2 = scan.nextInt();
    pec2 = scan.nextInt();
    valor2 = scan.nextDouble();
    total = pec1 * valor1 + pec2 * valor2;

    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

  }
}
