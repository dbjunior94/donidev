import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    /* Exercício 01 */
    /*
    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.println("Products:");
    System.out.printf("%s , which price is $ %.2f%n", product1, price1);
    System.out.printf("%s , which price is $ %.2f%n", product2, price2);
    System.out.println();
    System.out.printf("%d years old, code %d and gender : %c%n", age, code, gender);
    System.out.println();
    System.out.printf("Measure with eight decimal places: %.8f%n", measure);
    System.out.printf("Rouded (three decimal places): %.3f%n", measure);
    Locale.setDefault(Locale.US);
    System.out.printf("US decimal point: %.3f%n", measure); */

    /* int x, y;
    x = 5;

    y = 2 * x;

    System.out.println(x);
    System.out.println(y); */

    /*int a,b;
    double resultado;

    a = 5;
    b = 2;

    resultado = (double) a / b;

    System.out.println(resultado);*/

    /*double a;
    int b;

    a = 5.0;
    b = (int) a;

    System.out.println(b); */

    Scanner sc = new Scanner(System.in);
    int x;
    String s1, s2, s3;

    x = sc.nextInt();
    sc.nextLine();
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    sc.close();
  }
}
