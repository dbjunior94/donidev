package exercicios.classeatributosmetodos.entities;

import static java.lang.Math.pow;

public class Rectangle {
  public double width;
  public double height;

  public double area(){
    return width * height;
  }

  public double perimeter(){
    return 2 * (width + height);
  }

  public double diagonal(){
    return Math.sqrt(pow(width, 2) + pow(height,2));
  }
}
