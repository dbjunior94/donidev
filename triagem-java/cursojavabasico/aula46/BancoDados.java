package aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{
  void abriConexao();

  void fecharConexao();
}
