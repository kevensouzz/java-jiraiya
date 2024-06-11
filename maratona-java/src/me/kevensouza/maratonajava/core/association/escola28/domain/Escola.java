package me.kevensouza.maratonajava.core.association.escola28.domain;

public class Escola {
    private String nome;
    private Professor[] professores;
    private Aluno[] alunos;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Aluno[] alunos, Professor[] professores) {
        this(nome);
        this.alunos = alunos;
        this.professores = professores;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return this.professores;
    }

    public void setProfessores(Professor... professores) {
        this.professores = professores;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(Aluno... alunos) {
        this.alunos = alunos;
    }
}
