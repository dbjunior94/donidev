package labs.vetores.app;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantas pessoas serao digitadas? ");
    int n, nHomens, nMulheres;
    n =sc.nextInt();
    double mediaAlturaMulher, menorAltura, maiorAltura, alturafemtotal;

    double[] alturas = new double[n];
    char[] generos = new char[n];

    for(int i = 0; i < n; i++){
      System.out.printf("Altura da %da pessoa: ", i + 1);
      alturas[i] = sc.nextDouble();
      System.out.printf("Genero da %da pessoa: ", i + 1);
      generos[i] = sc.next().charAt(0);
    }
    menorAltura = alturas[0];
    maiorAltura = alturas[0];
    for(int i = 0; i < n; i++) {
      if (alturas[i] < menorAltura) {
        menorAltura = alturas[i];
      }
      if (alturas[i] > maiorAltura) {
        maiorAltura = alturas[i];
      }}
      alturafemtotal = 0;
      nMulheres = 0;
      nHomens = 0;
      for (int i = 0; i < n; i++){
        if(generos[i] == 'F'){
          alturafemtotal += alturas[i];
          nMulheres++;
        }else{
          nHomens++;
        }
      }
      mediaAlturaMulher = alturafemtotal/nMulheres;
      System.out.printf("Menor altura: %.2f\n", menorAltura);
      System.out.printf("Maior altura: %.2f\n", maiorAltura);
      System.out.printf("Media das alturas das mulheres: %.2f\n", mediaAlturaMulher);
      System.out.printf("Menor altura: %d\n", nHomens);

        sc.close();
    }
  }

