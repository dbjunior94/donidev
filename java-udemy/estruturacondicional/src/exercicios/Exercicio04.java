package exercicios;

import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horaInicial, horaFinal;

    horaInicial = sc.nextInt();
    horaFinal = sc.nextInt();
    int intervalo;

    if (horaInicial < horaFinal){
      intervalo = horaFinal - horaInicial;
    } else {
      intervalo = 24 - horaInicial + horaFinal;
    }
    System.out.printf("O JOGO DUROU %d HORA(S)", intervalo);
    sc.close();
  }
}
