package aula42;

public class Aluno {

  private String curso;
  private double[] notas;

  public Aluno() {
    super();
  }

  public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular,
      String curso, double[] notas) {
    //super(nome, endereco, telefone, cpf, telefoneCelular);
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
    //super.setCpf("345345345354");
    //this.setCpf("345345");
  }

  public String obterEtiquetaEndereco(){
    String s = "Endereço do Aluno: ";
    //s += super.getEndereco();

    return s;
  }

  //@Override
  public void imprimirEtiquetaEndereco() {
    System.out.println(this.obterEtiquetaEndereco());
  }
}
