package excecoes.labs.app;

import excecoes.labs.entities.Account;
import excecoes.labs.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.next();
        String holder = sc.next();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, initialBalance, withdrawLimit);
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            acc.withdraw(amount);
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
