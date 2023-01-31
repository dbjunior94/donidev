package exercicios.para;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int p1 = 2;
    int p2 = 3;
    int p3 = 5;
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      double media = (a * p1 + b * p2 + c * p3) / (p1 + p2 + p3);
      System.out.printf("%.1f%n",media);
    }
    sc.close();
  }
}
