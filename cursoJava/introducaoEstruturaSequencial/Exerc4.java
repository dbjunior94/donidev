package cursoJava.introducaoEstruturaSequencial;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero,  horas;
        double salario, valorSalario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorSalario = sc.nextDouble();

        salario = horas * valorSalario;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
