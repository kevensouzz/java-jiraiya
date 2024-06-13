package me.kevensouza.maratonajava.core.association.seminario31.domain;

public class Aluno {
    private String nome;
    private short idade;
    private Seminario seminario;

    public Aluno(String nome, short idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, short idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
