package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {
  // Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
  // valores em dois vetores, em posições relacionadas. No final, mostre uma
  // listagem contendo apenas os dados das pessoas menores de idade.
  public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<Integer> idades = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    for (int i = 0; i < 9; i++) {
      System.out.print("Digite o nome: ");
      nomes.add(s.nextLine());
      System.out.print("Digite a idade: ");
      idades.add(Integer.parseInt(s.nextLine()));
    }

    System.out.println("Menores de idade:");
    for (int i = 0; i < idades.size(); i++) 
    if (idades.get(i) < 18) System.out.println(String.format("Nome: %s - Idade: %d", nomes.get(i), idades.get(i)));

    s.close();
  }
}
