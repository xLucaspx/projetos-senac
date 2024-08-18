package models;

public class Usuario {

  private String nome;
  private String email;
  private String telefone;
  private String endereco;
  private String sexo;
  private String interesse;
  private String idiomas;
  private String instituicao;
  private String curso;
  private String andamento;
  private String empresa;
  private String area;
  private String cargo;
  private String periodo;
  private String situacao;

  public Usuario(String nome, String email, String telefone, String endereco, String sexo,
          String interesse, String idiomas, String instituicao, String curso, String andamento,
          String empresa, String area, String cargo, String periodo, String situacao) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.endereco = endereco;
    this.sexo = sexo;
    this.interesse = interesse;
    this.idiomas = idiomas;
    this.instituicao = instituicao;
    this.curso = curso;
    this.andamento = andamento;
    this.empresa = empresa;
    this.area = area;
    this.cargo = cargo;
    this.periodo = periodo;
    this.situacao = situacao;
  }

  @Override
  public String toString() {
    return String.format("Informações pessoais:\nNome: %s\nSexo: %s\nE-mail: %s\nTelefone: %s\nEndereço: %s\n"
            + "\nInformações acadêmicas:\nÁrea de interesse: %s\nIdiomas: %s\nInstituição de ensino: %s\nCurso: %s\nAndamento: %s\n"
            + "\nInformações profissionais:\nÁrea de atuação: %s\nCargo: %s\nEmpresa: %s\nPeríodo: %s\nSituação: %s\n",
            nome, sexo, email, telefone, endereco, interesse, idiomas, instituicao, curso, andamento, area, cargo, empresa, periodo, situacao);
  }

}
