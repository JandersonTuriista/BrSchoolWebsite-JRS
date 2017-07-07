package DAO;

import conexoes.ConexaoMySql;
import java.sql.SQLException;
import model.Professor;

public class DAOProfessor {
    //Método que salva os registros no Banco de Dados
    public int salvarDAO(Professor pProfessor) {
        //Conexão com o Banco de Dados
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();
            //Variável que joga o comando no CMD do Banco de Dados
            String sql
                    = "INSERT INTO professores (nome, senha, ano, ano2, ano3, "
                    + "disciplina, disciplina2, disciplina3, disciplina4) VALUES ("
                    + "'" + pProfessor.getNome() + "',"
                    + "'" + pProfessor.getSenha() + "',"
                    + "'" + pProfessor.getAno() + "',"
                    + "'" + pProfessor.getAno2() + "',"
                    + "'" + pProfessor.getAno3() + "',"
                    + "'" + pProfessor.getDisciplina() + "',"
                    + "'" + pProfessor.getDisciplina2() + "',"
                    + "'" + pProfessor.getDisciplina3() + "',"
                    + "'" + pProfessor.getDisciplina4() + "'"
                    + ");";

            return conexao.insertSQL(sql);
        //Fecha a conexão com o Banco de Dados depois de cadastrado    
        } catch (Exception e) {
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }
    //Metódo de exibir os registros
    public Professor getProfessorDAO(String pNomeProfessor) {
        Professor professor = new Professor();
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            //Faz a conexão com o Banco de Dados
            conexao.conectar();
            //Variável que joga o comando no CMD do Banco, usando a Primary Key "nome"
            String sql
                    = "SELECT nome, senha, ano, ano2, ano3, disciplina, disciplina2, disciplina3, disciplina4 "
                    + "FROM professores WHERE nome = '" + pNomeProfessor + "'"
                    + ";";
            
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                professor.setNome(conexao.getResultSet().getString("nome"));
                professor.setSenha(conexao.getResultSet().getString("senha"));
                professor.setAno(conexao.getResultSet().getInt("ano"));
                professor.setAno2(conexao.getResultSet().getInt("ano2"));
                professor.setAno3(conexao.getResultSet().getInt("ano3"));
                professor.setDisciplina(conexao.getResultSet().getString("disciplina"));
                professor.setDisciplina2(conexao.getResultSet().getString("disciplina2"));
                professor.setDisciplina3(conexao.getResultSet().getString("disciplina3"));
                professor.setDisciplina4(conexao.getResultSet().getString("disciplina4"));
            }
        //Fecha a conexão com o Banco de Dados após exibir os registros
        } catch (SQLException e) {
        } finally {
            conexao.fecharConexao();
        }

        return professor;

    }
    //Método para excluir os Registros do Banco de Dados 
    public boolean excluirDAO(String pNomeProfessor){
        //Faz a conexão com o Banco de Dados
        ConexaoMySql conexao = new ConexaoMySql();
        
        try{
            
            conexao.conectar();
            //Variável que joga o comando no CMD do Banco de Dados
            String sql = 
                    "DELETE FROM professores WHERE nome = '" + pNomeProfessor + "';";
            
            conexao.executarUpdateDeleteSQL(sql);
            
            return true;
        //Fecha a conexão com o Banco de Dados após excluir os registros    
        }catch(Exception e){
            return false;
        }finally{
            conexao.fecharConexao();
        }
        
    }
    //Método para atualizar os registros no Banco de Dados
    public boolean updateDAO(Professor pProfessor){
        //Faz a conexão com o Banco de Dados
        ConexaoMySql conexao = new ConexaoMySql();
        
        try{
            
            conexao.conectar();
            //Variável que joga o comando no CMD do Banco de Dados
            String sql = 
                    "UPDATE professores SET"
                    + " nome = '" + pProfessor.getNome() + "',"
                    + " senha = '" + pProfessor.getSenha() + "',"
                    + " disciplina = '" + pProfessor.getDisciplina() + "',"                    
                    + " ano = '" + pProfessor.getAno() + "'," 
                    + " ano2 = '" + pProfessor.getAno2() + "',"
                    + " ano3 = '" + pProfessor.getAno3() + "',"
                    + " disciplina2 = '" + pProfessor.getDisciplina2() + "',"
                    + " disciplina3 = '" + pProfessor.getDisciplina3() + "',"
                    + " disciplina4 = '" + pProfessor.getDisciplina4() + 
                    "';";
            
            conexao.executarUpdateDeleteSQL(sql);
            
            return true;
        //Fecha a conexão com o Banco de Dados após atualizar os registros    
        }catch(Exception e){
            return false;
        }finally{
            conexao.fecharConexao();
        }
    }
}