package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int code = sc.nextInt();
    int qtd = sc.nextInt();
    double total;
    if(code == 1){
      total = qtd * 4.00;
    }else if(code == 2){
      total = qtd * 4.50;
    }else if(code == 3){
      total = qtd * 5.00;
    }else if(code == 4){
      total = qtd * 2.00;
    } else {
      total = qtd * 1.50;
    }

    System.out.printf("Total: R$ %.2f%n", total);

    sc.close();
  }
}
