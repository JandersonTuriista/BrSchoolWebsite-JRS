package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import model.Aluno;

public class DAOAluno {

    public int salvarDAO(Aluno pAluno) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "INSERT INTO alunos (nome, matricula, senha, serie, turma, turno) VALUES ("
                    + "'" + pAluno.getNome() + "',"
                    + "'" + pAluno.getMatricula() + "',"
                    + "'" + pAluno.getSenha() + "',"
                    + "'" + pAluno.getSerie() + "',"
                    + "'" + pAluno.getTurma() + "',"
                    + "'" + pAluno.getTurno() + "'"
                    + ");";

            return conexao.insertSQL(sql);

        } catch (Exception e) {
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }

    public Aluno getAlunoDAO(int pMatriculaAluno) {
        Aluno aluno = new Aluno();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "SELECT nome, matricula, senha, serie, turma, turno "
                    + "FROM alunos WHERE matricula = '" + pMatriculaAluno + "'"
                    + ";";
            
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                aluno.setNome(conexao.getResultSet().getString("nome"));
                aluno.setMatricula(conexao.getResultSet().getInt("matricula"));
                aluno.setSenha(conexao.getResultSet().getString("senha"));
                aluno.setSerie(conexao.getResultSet().getString("serie"));
                aluno.setTurma(conexao.getResultSet().getString("turma"));
                aluno.setTurno(conexao.getResultSet().getString("turno"));
            }

        } catch (SQLException e) {
        } finally {
            conexao.fecharConexao();
        }

        return aluno;

    }
    
    public boolean excluirDAO(int pMatriculaAluno){
        
        ConexaoMySql conexao = new ConexaoMySql();
        
        try{
            
            conexao.conectar();
            
            String sql = 
                    "DELETE FROM alunos WHERE matricula = '" + pMatriculaAluno + "';";
            
            conexao.executarUpdateDeleteSQL(sql);
            
            return true;
            
        }catch(Exception e){
            return false;
        }finally{
            conexao.fecharConexao();
        }
        
    }
    
    public boolean updateDAO(Aluno pAluno){
        ConexaoMySql conexao = new ConexaoMySql();
        
        try{
            
            conexao.conectar();
            
            String sql = 
                    "UPDATE alunos SET "
                    + " nome = '" + pAluno.getNome() + "',"
                    + " matricula = '" + pAluno.getMatricula() + "',"
                    + " senha = '" + pAluno.getSenha() + "',"
                    + " serie = '" + pAluno.getSerie() + "',"
                    + " turma = '" + pAluno.getTurma() + "',"
                    + " turno = '" + pAluno.getTurno() + "';";
            
            conexao.executarUpdateDeleteSQL(sql);
            
            return true;
            
        }catch(Exception e){
            return false;
        }finally{
            conexao.fecharConexao();
        }
        
    }

}