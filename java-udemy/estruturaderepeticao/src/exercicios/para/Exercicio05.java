package exercicios.para;

import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int valor = sc.nextInt();
    int fat = 1;
    for (int i = 1; i <= valor; i++){
      fat = fat * i;
    }
    System.out.println(fat);
    sc.close();
  }
}
