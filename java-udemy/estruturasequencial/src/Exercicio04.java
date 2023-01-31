import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int horas = scan.nextInt();
    double valor = scan.nextDouble();
    double salary = valor * horas;
    System.out.println("NUMBER = " + num);
    System.out.printf("SALARY = U$ %.2f%n", salary);

  }
}
