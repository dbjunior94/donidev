package cursoJava.introducaoPOO.application;

import cursoJava.introducaoPOO.entities.Student;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n" , student.notaFinal());

        if(student.notaFinal() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
