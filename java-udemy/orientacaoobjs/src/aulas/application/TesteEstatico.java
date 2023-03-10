package aulas.application;

import static aulas.util.Calculator.*;
import java.util.Locale;
import java.util.Scanner;

public class TesteEstatico {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter radius: ");
    double radius = sc.nextDouble();

    double c = circumference(radius);

    double v = volume(radius);

    System.out.printf("Circumference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", PI);
  }

}
