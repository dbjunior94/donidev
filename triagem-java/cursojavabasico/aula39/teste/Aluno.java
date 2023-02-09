package aula39.teste;

import aula39.Pessoa;

public class Aluno extends Pessoa {

  private String curso;
  private double[] notas;

  public void verificarAcesso(){
    //this.nomeVisibilidade = "supr";
    //super.nomeVisibilidade = "super";

    this.setNomeVisibilidade("Sses");
  }

  public Aluno() {
    super();
  }

  public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular,
      String curso, double[] notas) {
    super(nome, endereco, telefone, cpf, telefoneCelular);
    this.curso = curso;
    this.notas = notas;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public double[] getNotas() {
    return notas;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  public double calcularMedia(){
    return 0;
  }

  public boolean verificarAprovado(){
    return true;
  }

  public void metodoQualquer(){
    super.setCpf("345345345354");
    this.setCpf("345345");
  }
}
