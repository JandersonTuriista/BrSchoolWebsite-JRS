package model;

public class Professor {
    //Variáveis do objeto Professor
    private String nome;
    private String senha;
    private int ano;
    private int ano2;
    private int ano3;
    private String disciplina;
    private String disciplina2;
    private String disciplina3;
    private String disciplina4;
    
    public Professor(){}
    
    //Método que recebe os dados de "TelaCadastro" e joga nas variáveis locais
    @SuppressWarnings("empty-statement")
    public Professor(String nome, String senha, int ano, int ano2, int ano3, 
            String disciplina, String disciplina2, String disciplina3, String disciplina4) {;
        this.nome = nome;
        this.senha = senha;
        this.ano = ano;
        this.ano2 = ano2;
        this.ano3 = ano3;
        this.disciplina = disciplina;
        this.disciplina2 = disciplina2;
        this.disciplina3 = disciplina3;
        this.disciplina4 = disciplina4;
    }

    //Getter's e Setter's das variáveis
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno2() {
        return ano2;
    }

    public void setAno2(int ano2) {
        this.ano2 = ano2;
    }

    public int getAno3() {
        return ano3;
    }

    public void setAno3(int ano3) {
        this.ano3 = ano3;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }
    
}    