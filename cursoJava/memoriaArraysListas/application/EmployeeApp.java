package cursoJava.memoriaArraysListas.application;

import cursoJava.memoriaArraysListas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee>  list = new ArrayList<>();

        // PART 1 - READING DATA:

        System.out.print("How many employees will be registered?");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println();
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));

        }



    }

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
        return emp != null;
    }

}
