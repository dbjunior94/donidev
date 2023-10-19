package aula63;

public class ExemploPrintf {

  public static void main(String[] args) {
    System.out.printf("%s", "Olá, Mundo!");
    System.out.println();
    System.out.printf("%S", "Olá, Mundo!");
    System.out.println();

    System.out.printf("%c", 'c');
    System.out.println();
    System.out.printf("%C", 'c');

    System.out.printf("%n");

    int valor = 123456789;
    System.out.printf("%d", valor);

    System.out.println();

    double pontoFlutuante = 3.1456789;
    System.out.printf("%f", pontoFlutuante);

    System.out.println();
  }
}
