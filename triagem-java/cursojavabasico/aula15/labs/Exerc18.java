package aula15.labs;

import java.util.Scanner;

public class Exerc18 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if(num % 2 == 0){
      System.out.println("par");
    }else{
      System.out.println("ímpar");
    }
  }
}
