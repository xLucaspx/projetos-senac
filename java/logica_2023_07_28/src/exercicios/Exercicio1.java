package exercicios;

public class Exercicio1 {
  // Uma empresa precisa reajustar o salário dos seus funcionários,
  // dando um aumento de acordo com alguns fatores. Faça um programa
  // que leia o salário atual, o gênero do funcionário e há quantos
  // anos esse funcionário trabalha na empresa.
  // No final, mostre o seu novo salário, baseado na tabela a seguir:
  // - Mulheres
  // - menos de 15 anos de empresa: +5%
  // - de 15 até 20 anos de empresa: +12%
  // - mais de 20 anos de empresa: +23%
  // - Homens
  // - menos de 20 anos de empresa: +3%
  // - de 20 até 30 anos de empresa: +13%
  // - mais de 30 anos de empresa: +25%

  public static void main(String... args) {
    Funcionario f1 = new Funcionario("João", Genero.MASCULINO, 2000.0f, 3);
    Funcionario f2 = new Funcionario("Carlos", Genero.MASCULINO, 2000.0f, 25);
    Funcionario f3 = new Funcionario("Luís", Genero.MASCULINO, 2000.0f, 31);
    Funcionario f5 = new Funcionario("Varlete", Genero.FEMININO, 2000.0f, 10);
    Funcionario f6 = new Funcionario("Carmem", Genero.FEMININO, 2000.0f, 20);
    Funcionario f7 = new Funcionario("Raquel", Genero.FEMININO, 2000.0f, 30);

    System.out.println(f1 + String.format("\nReajustado: R$ %.2f\n", reajustaSalario(f1)));
    System.out.println(f2 + String.format("\nReajustado: R$ %.2f\n", reajustaSalario(f2)));
    System.out.println(f3 + String.format("\nReajustado: R$ %.2f\n", reajustaSalario(f3)));
    System.out.println(f5 + String.format("\nReajustado: R$ %.2f\n", reajustaSalario(f5)));
    System.out.println(f6 + String.format("\nReajustado: R$ %.2f\n", reajustaSalario(f6)));
    System.out.println(f7 + String.format("\nReajustado: R$ %.2f\n", reajustaSalario(f7)));

  }

  public static float reajustaSalario(Funcionario funcionario) {
    int anosEmpresa = funcionario.getAnosDeEmpresa();
    float salario = funcionario.getSalario();

    switch (funcionario.getGenero()) {
      case MASCULINO -> {
        if (anosEmpresa < 20)
          return salario * 1.03f;
        else if (anosEmpresa <= 30)
          return salario * 1.13f;
        else
          return salario * 1.25f;
      }
      case FEMININO -> {
        if (anosEmpresa < 15)
          return salario * 1.05f;
        else if (anosEmpresa <= 20)
          return salario * 1.12f;
        else
          return salario * 1.23f;
      }
      default -> throw new IllegalArgumentException(
          "Houve um erro ao calcular o salário do seguinte funcionário: " + funcionario.getNome());
    }
  }
}

class Funcionario {
  private String nome;
  private Genero genero;
  private float salario;
  private int anosDeEmpresa;

  public Funcionario(String nome, Genero genero, float salario, int anosDeEmpresa) {
    this.nome = nome;
    this.genero = genero;
    this.salario = salario;
    this.anosDeEmpresa = anosDeEmpresa;
  }

  public String getNome() {
    return nome;
  }

  public float getSalario() {
    return salario;
  }

  public int getAnosDeEmpresa() {
    return anosDeEmpresa;
  }

  public Genero getGenero() {
    return genero;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return String.format("Nome: %s\nGênero: %s\nAnos de empresa: %d\nSalário R$ %.2f", nome, genero, anosDeEmpresa,
        salario);
  }
}

enum Genero {
  MASCULINO("Masculino"), FEMININO("Feminino");

  private String genero;

  private Genero(String genero) {
    this.genero = genero;
  }

  @Override
  public String toString() {
    return genero;
  }
}
