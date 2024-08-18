package exercicios;

public class Exercicio2 {
  // Crie um programa que calcule e mostre na tela o resultado da
  // soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
  public static void main(String... args) {
    int soma = 0;

    for (int i = 6; i <= 100; i += 2) soma += i;

    System.out.println("A soma dos números pares entre 6 e 100 é " + soma);
  }
}
