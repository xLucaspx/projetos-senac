package exercicios;

public class Exercicio9 {
  // Desenvolva um algoritmo que leia dois valores pelo teclado e
  // passe esses valores para um procedimento Somador() que vai
  // calcular e mostrar a soma entre eles.
  public static void main(String... args) {
    System.out.println(soma(2, 3, 5, 10, 15));
    System.out.println(soma(new double[] {2, 3, 5, 10, 15}));
  }

  public static double soma(double... valores) {
    double soma = 0.0;

    for (double valor : valores) soma += valor;

    return soma;
  }
}
