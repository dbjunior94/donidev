package exercicios;

import java.util.Scanner;

public class Exercicio02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um valor inteiro:");
    int num = sc.nextInt();

    if(num % 2 == 0){
      System.out.println("PAR");
    } else{
      System.out.println("IMPAR");
    }
    sc.close();
  }
}
