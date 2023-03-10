package labs.vetores.app;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int n, qtdPares;

    System.out.print("Quantos numeros voce vai digitar? ");
    n = sc.nextInt();
    int[] numerosPares = new int[n];

    for(int i = 0; i < n; i++){
      System.out.print("Digite um numero: ");
      numerosPares[i] = sc.nextInt();
    }
    qtdPares = 0;
    System.out.println("\nNUMEROS PARES:");
    for(int i = 0; i< n; i++){
      if(numerosPares[i] % 2 == 0){
        System.out.printf("%d ", numerosPares[i]);
        qtdPares++;
      }
    }
    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdPares);

    sc.close();
  }
}
