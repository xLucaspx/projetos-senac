package exercicios;

import java.util.ArrayList;

public class Exercicio3 {
  // Crie um programa que leia 6 números inteiros e no final mostre
  // quantos deles são pares e quantos são ímpares.
  public static void main(String... args) {
    try {
      if (args.length != 6)
        throw new IllegalArgumentException("O programa deve receber 6 números inteiros");

      ArrayList<Integer> pares = new ArrayList<>();
      ArrayList<Integer> impares = new ArrayList<>();

      for (int i = 0; i < args.length; i++) {
        int num = Integer.parseInt(args[i]);

        if (num % 2 == 0) {
          pares.add(num);
          continue;
        }
        impares.add(num);
      }

      System.out.println("Números pares: " + pares);
      System.out.println("Números ímpares: " + impares);
    } catch (Exception e) {
      System.out.println("Erro ao rodar o programa: você deve passar 6 números inteiros como parâmetro!"
          + "\nMensagem do erro: " + e.getMessage());
    }
  }
}
