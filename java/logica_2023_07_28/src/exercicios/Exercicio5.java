package exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio5 {
  // Faça um aplicativo que leia o nome e preço de 8 produtos. No final,
  // mostre na tela qual foi o maior e qual foi o menor preço digitados.
  public static void main(String... args) {
    List<Produto> produtos = Arrays.asList(new Produto[] {
      new Produto("Água da Pedra sem gás", 2.5f),
      new Produto("Água da Pedra com gás", 2.75f),
      new Produto("Heineken long neck", 10f),
      new Produto("Stella Artois long neck", 10f),
      new Produto("Hora Sinuca", 32f),
      new Produto("Hora Sinuca promo", 16f),
      new Produto("Pastel assado de frango", 8.5f),
      new Produto("Coca-cola zero lata", 8.0f),
    });

    Produto pMenorPreco = produtos.get(0);
    Produto pMaiorPreco = produtos.get(0);

    for (Produto p : produtos) {
      if (p.getPreco() < pMenorPreco.getPreco()) pMenorPreco = p;
      if (p.getPreco() > pMaiorPreco.getPreco()) pMaiorPreco = p;
    }

    System.out.println("Produto de menor preço:\n" + pMenorPreco);
    System.out.println("\nProduto de maior preço:\n" + pMaiorPreco);
  }
}

class Produto {
  private String nome;
  private float preco;

  public Produto(String nome, float preco) {
    this.nome = nome;
    setPreco(preco);
  }

  public void setPreco(float preco) {
    if (preco <= 0.0f) throw new IllegalArgumentException("O preço deve ser maior do que R$ 0.00");

    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public float getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return String.format("%s - R$ %.2f", nome, preco);
  }
}
