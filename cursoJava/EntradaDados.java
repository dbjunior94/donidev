package cursoJava;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Exemplo 1

       // String x;
       // x = sc.next();

        //Exemplo 2
       // int x;
        // x = sc.nextInt();

        //Exemplo 3
        //double x;
        //x = sc.nextDouble();
        //System.out.printf("Você digitou: %.2f%n " , x);

        //Exemplo 4
       //char x;
       //x = sc.next().charAt(0);
        //System.out.println("Você digitou: " + x);
        // Exemplo 5
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



        sc.close();
    }
}
