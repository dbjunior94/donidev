package aula15.labs;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("o num1 é maior: " +num1);
        }else{
            System.out.println("o num2 é maior: " + num2);
        }
    }
}
