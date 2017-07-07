package model;

public class Aluno {
    
    private String nome;
    private int matricula;
    private String senha;
    private String serie;
    private String turma;
    private String turno;

    public Aluno(){}
    
    @SuppressWarnings("empty-statement")
    public Aluno(String nome, int matricula, String senha, String serie, String turma, String turno) {;
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
        this.serie = serie;
        this.turma = turma;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }   
}