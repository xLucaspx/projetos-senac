package models;

public class Produto {

  String codigo;
  String nome;
  float preco;

  public Produto(String codigo, String nome, float preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public float getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return String.format("%s -- %s -- R$ %.2f", codigo, nome, preco);
  }
}
