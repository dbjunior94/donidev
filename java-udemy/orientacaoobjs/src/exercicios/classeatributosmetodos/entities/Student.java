package exercicios.classeatributosmetodos.entities;

public class Student {
  public String name;
  public double grade1;
  public double grade2;
  public double grade3;

  public double gradeFinal(){
    return grade1 + grade2 + grade3;
  }

  public double missingPoints(){
    if(gradeFinal() < 60){
      return 60.0 - gradeFinal();
    } else {
      return 0.0;
    }
  }
}
