package me.kevensouza.maratonajava.core.association.escola28.domain;

public class Professor {
    private String nome;
    private Escola[] escolas;
    private String[] disciplinas;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String... disciplinas) {
        this(nome);
        this.disciplinas = disciplinas;
    }

    public Professor(String nome, String[] disciplinas, Escola[] escolas) {
        this(nome, disciplinas);
        this.escolas = escolas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola[] getEscolas() {
        return this.escolas;
    }

    public void setEscolas(Escola... escolas) {
        this.escolas = escolas;
    }

    public String[] getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(String... disciplinas) {
        this.disciplinas = disciplinas;
    }
}
