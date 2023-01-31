package exercicios;

import java.util.Scanner;

public class Exercicio01 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um valor inteiro:");
    int num = scan.nextInt();
    if(num < 0){
      System.out.println("NEGATIVO");
    }else {
      System.out.println("NAO NEGATIVO");
    }
    scan.close();
  }
}
