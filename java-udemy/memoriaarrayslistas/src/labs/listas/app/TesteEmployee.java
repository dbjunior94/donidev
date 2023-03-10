package labs.listas.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import labs.listas.entities.Employee;

public class TesteEmployee {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    // PARTE 1 - LENDO OS DADOS
    int n;
    List<Employee> employee = new ArrayList<>();

    System.out.print("How many employees will be registered? ");
    n = sc.nextInt();

    for(int i = 1; i <= n; i++){
      System.out.println();
      System.out.println("Emplyoee #" + i + ":");
      System.out.print("Id: ");
      int id = sc.nextInt();
      while(hasId(employee, id)){
        System.out.print("Id already taken. Try again: ");
        id = sc.nextInt();
      }
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Salary: ");
      double salary = sc.nextDouble();
      employee.add(new Employee(id, name, salary));
    }

    // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
    System.out.println();
    System.out.print("Enter the employee id that will have salary increase : ");
    int id = sc.nextInt();
    Employee emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    if(emp == null){
      System.out.println("This id does not exist!");
    } else{
      System.out.print("Enter the percentage: ");
      double percentage = sc.nextDouble();
      emp.increaseSalary(percentage);
    }

    System.out.println();
    System.out.println("List of employees: ");
    for(Employee obj : employee){
      System.out.println(obj);
    }

    sc.close();
  }

  public static boolean hasId(List<Employee> employees, Integer id){
    Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    return emp != null;
  }
}
