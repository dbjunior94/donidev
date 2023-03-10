package labs.vetores.app;

import java.util.Scanner;

public class MaisVelho {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, maisvelho , posicaomaior;

    System.out.print("Quantas pessoas você vai digitar? ");
    n = sc.nextInt();
    String [] names = new String[n];
    int [] idades = new int[n];

    for(int i = 0; i < n; i++){
      System.out.printf("Dados da %da pessoa:\n", i + 1);
      System.out.print("Nome: ");
      names[i] = sc.next();
      System.out.print("Idade: ");
      idades[i] = sc.nextInt();
    }
    maisvelho = idades[0];
    posicaomaior = 0;
    for(int i = 0; i < n; i++){
      if(idades[i] > maisvelho) {
        maisvelho = idades[i];
        posicaomaior = i;
      }
    }
    System.out.printf("PESSOA MAIS VELHA: %s", names[posicaomaior]);
    sc.close();
  }

}
