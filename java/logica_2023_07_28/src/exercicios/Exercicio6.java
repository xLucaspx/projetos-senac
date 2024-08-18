package exercicios;

public class Exercicio6 {
  // Crie um programa que preencha automaticamente (usando lógica,
  // não apenas atribuindo diretamente) um vetor numérico com 10
  // posições, conforme: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
  public static void main(String[] args) {
    int[] numeros = new int[10];

    for (int i = 0, x = 5; i < numeros.length; i++, x += 5) numeros[i] = x;

    System.out.println("Lista de números:");
    for (int i : numeros) System.out.print(i + " ");
  }
}
