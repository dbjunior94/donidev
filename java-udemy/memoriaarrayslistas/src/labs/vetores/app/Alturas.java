package labs.vetores.app;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

   int n, mmenores;
   double alturatotal,mediaAltura, porcetangemMenores;

    System.out.print("Quantas pessoas serao digitadas? ");
    n = sc.nextInt();

   String[] names = new String[n];
   int[] idades = new int[n];
   double[] alturas = new double[n];


   for(int i = 0; i < n; i++){
     System.out.printf("Dados da %da pessoa:\n", i + 1);
     System.out.print("Nome: ");
     names[i] = sc.next();
     System.out.print("Idade: ");
     idades[i] = sc.nextInt();
     System.out.print("Altura: ");
     alturas[i] = sc.nextDouble();
   }
   mmenores = 0;
   alturatotal = 0;

   for(int i = 0; i < n; i++){
     if(idades[i] < 16){
       mmenores++;
     }
     alturatotal += alturas[i];
   }
   mediaAltura = alturatotal/n;
   porcetangemMenores = ((double)mmenores/n) * 100.0;

    System.out.println();
    System.out.printf("Altura média: %.2f\n", mediaAltura);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcetangemMenores);

   for(int i = 0; i < n; i++){
     if(idades[i] < 16){
       System.out.printf("%s\n", names[i]);
     }
   }

  }
}
