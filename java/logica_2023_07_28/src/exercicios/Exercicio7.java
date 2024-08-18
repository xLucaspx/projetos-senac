package exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio7 {
  // Faça um programa que leia 7 nomes de pessoas e guarde-os em um
  // vetor. No final, mostre uma listagem com todos os nomes
  // informados, na ordem inversa daquela em que eles foram
  // informados.

  public static void main(String[] args) {
    List<String> nomes = Arrays.asList(new String[] {
        "Lucas", "Glauber", "Felipe", "Juca", "Eduardo",
        "Lívia", "Júlia", "Izadora", "Maria", "Marina"
    });

    System.out.println("Ordem inversa:");
    for (int i = nomes.size() - 1; i >= 0; i--) System.out.println(nomes.get(i));
  }
}
