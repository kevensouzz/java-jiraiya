package me.kevensouza.maratonajava.core.association.escola28.domain;

public class Aluno {
    private String nome;
    private Escola escola;
    private byte serie;
    private char turma;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, byte serie, char turma, Escola escola) {
        this(nome);
        this.escola = escola;
        this.serie = serie;
        this.turma = turma;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public byte getSerie() {
        return this.serie;
    }

    public void setSerie(byte serie) {
        this.serie = serie;
    }

    public char getTurma() {
        return this.turma;
    }

    public void setTurma(char turma) {
        this.turma = turma;
    }
}
