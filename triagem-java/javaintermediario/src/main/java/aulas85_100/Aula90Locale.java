package aulas85_100;

import java.util.Locale;

public class Aula90Locale {

  public static void main(String[] args) {
     //dd/MM/yyyy / 02/01/2000
    //MM/dd/yyyy / 01-fev/2000

    //1.000,02
    //1,000.02

    Locale locale = Locale.getDefault();

    System.out.println(locale);
  }
}
