import static java.lang.Math.*;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);
    double A, B, C,
        triangulo, circulo
        , trapezio, quadrado,
        retangulo;

    A = scan.nextDouble();
    B = scan.nextDouble();
    C = scan.nextDouble();

    triangulo = (A * C)/2;
    circulo = 3.14159 * pow(C,2);
    trapezio = (A + B) / 2 * C;
    quadrado = B * B;
    retangulo = A * B;

    System.out.printf("TRIANGULO: %.3f%n", triangulo);
    System.out.printf("CIRCULO: %.3f%n", circulo);
    System.out.printf("TRAPEZIO: %.3f%n", trapezio);
    System.out.printf("QUADRADO: %.3f%n", quadrado);
    System.out.printf("RENTAGULO: %.3f%n", retangulo);
  }
}
