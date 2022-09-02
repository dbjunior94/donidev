package cursoJava.constrThisSobreEncapsulamento.application;

import cursoJava.constrThisSobreEncapsulamento.entities.ProductConstr;

import java.util.Scanner;

public class ProductConstrApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        ProductConstr productConstr = new ProductConstr(name, price);

        productConstr.setName("Computer");
        System.out.println("Updated name: " + productConstr.getName());
        productConstr.setPrice(1200.00);
        System.out.println("Updated price: " + productConstr.getPrice());

        System.out.println();
        System.out.println("Product data: " + productConstr);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        productConstr.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + productConstr);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        productConstr.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + productConstr);
        sc.close();
    }
}
