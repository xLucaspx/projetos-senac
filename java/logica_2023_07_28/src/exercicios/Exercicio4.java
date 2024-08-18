package exercicios;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio4 {
  // Desenvolva um programa que faça o sorteio de 20 números entre 0
  // e 10 e mostre na tela:
  // a) Quais foram os números sorteados
  // b) Quantos números estão acima de 5
  // c) Quantos números são divisíveis por 3
  public static void main(String... args) {
    Random r = new Random();
    ArrayList<Integer> randomNumbers = new ArrayList<>();
    int above5 = 0;
    int divisibleBy3 = 0;

    for (int i = 0; i < 20; i++) {
      int n = r.nextInt(11);
      randomNumbers.add(n);

      if (n > 5) above5++;
      if (n % 3 == 0) divisibleBy3++;
    }

    System.out.println("Números sorteados: " + randomNumbers);
    System.out.println("Total de números maiores que 5: " + above5);
    System.out.println("Total de números divisíveis por 3: " + divisibleBy3);
  }
}
