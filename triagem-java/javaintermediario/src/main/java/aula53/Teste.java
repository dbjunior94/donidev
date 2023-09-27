package aula53;

import static aula53.DiaSemanaConstantes.*;
import static aula53.DiaSemanaConstantes.SEGUNDA;
import static java.lang.System.*;

public class Teste {

  public static void main(String[] args) {
    usandoConstantes();

    out.println();

    usandoEnum();
  }

  private static void usandoConstantes(){

    int segunda = SEGUNDA;
    int terca = TERCA;
    int quarta = QUARTA;
    int quinta = QUINTA;
    int sexta = SEXTA;
    int sabado = SABADO;
    int domingo = DOMINGO;

    out.println("Teste utilizando constantes no Java");
    imprimeDiaSemana(segunda);
    imprimeDiaSemana(terca);
    imprimeDiaSemana(quarta);
    imprimeDiaSemana(quinta);
    imprimeDiaSemana(sexta);
    imprimeDiaSemana(sabado);
    imprimeDiaSemana(domingo);
  }

  private static void usandoEnum(){

  DiaSemana segunda = DiaSemana.SEGUNDA;
  DiaSemana terca = DiaSemana.TERCA;
  DiaSemana quarta = DiaSemana.QUARTA;
  DiaSemana quinta = DiaSemana.QUINTA;
  DiaSemana sexta = DiaSemana.SEXTA;
  DiaSemana sabado = DiaSemana.SABADO;
  DiaSemana domingo = DiaSemana.DOMINGO;

    out.println("Teste utilizando enum no Java");
    imprimeDiaSemana(segunda);
    imprimeDiaSemana(terca);
    imprimeDiaSemana(quarta);
    imprimeDiaSemana(quinta);
    imprimeDiaSemana(sexta);
    imprimeDiaSemana(sabado);
    imprimeDiaSemana(domingo);
  }

  private static void imprimeDiaSemana(int dia){
    switch (dia){
      case 1:
        out.println("Segunda-feira");
        break;
      case 2:
        out.println("Terça-feira");
        break;
      case 3:
        out.println("Quarta-feira");
        break;
      case 4:
        out.println("Quinta-feira");
        break;
      case 5:
        out.println("Sexta-feira");
        break;
      case 6:
        out.println("Sábado");
        break;
      case 7:
        out.println("Domingo");
        break;

    }


  }

  private static void imprimeDiaSemana(DiaSemana dia) {
    switch (dia) {
      case SEGUNDA:
        out.println("Segunda-feira");
        break;
      case TERCA:
        out.println("Terça-feira");
        break;
      case QUARTA:
        out.println("Quarta-feira");
        break;
      case QUINTA:
        out.println("Quinta-feira");
        break;
      case SEXTA:
        out.println("Sexta-feira");
        break;
      case SABADO:
        out.println("Sábado");
        break;
      case DOMINGO:
        out.println("Domingo");
        break;
    }


  }
}
