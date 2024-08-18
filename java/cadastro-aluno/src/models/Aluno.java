package models;

public class Aluno {

  private String nome;
  private String cpf;
  private String escolaridade;
  private String matricula;

  public Aluno(String nome, String cpf, String escolaridade, String matricula) {
    setNome(nome);
    setCpf(cpf);
    setEscolaridade(escolaridade);
    setMatricula(matricula);
  }

  public String getNome() {
    return nome;
  }

  private void setNome(String nome) {
    if (nome == null || nome.trim().isEmpty())
      throw new IllegalArgumentException("O nome não pode ser vazio ou nulo!");
    
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  private void setCpf(String cpf) {
    if (cpf == null || cpf.trim().isEmpty())
      throw new IllegalArgumentException("O CPF não pode ser vazio ou nulo!");
    
    this.cpf = cpf;
  }
  
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    if (matricula == null || matricula.trim().isEmpty())
      throw new IllegalArgumentException("A matrícula não pode ser vazia ou nula!");
    
    this.matricula = matricula;
  }

  public String getEscolaridade() {
    return escolaridade;
  }

  public void setEscolaridade(String escolaridade) {
    if (escolaridade == null || escolaridade.trim().isEmpty())
      throw new IllegalArgumentException("A escolaridade não pode ser vazia ou nula!");
    
    this.escolaridade = escolaridade;
  }

  @Override
  public String toString() {
    return String.format("Nome: %s\nCPF: %s\nMatrícula: %s\nEscolaridade: %s", nome, cpf, matricula, escolaridade);
  }
}
