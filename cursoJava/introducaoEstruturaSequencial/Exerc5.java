package cursoJava.introducaoEstruturaSequencial;

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod1, qte1, cod2, qte2;
        double total, preco1,preco2;

        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();

    }
}
