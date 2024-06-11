package me.kevensouza.maratonajava.core.association.jogador27.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores = new Jogador[11];

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador... jogadores) {
        this(nome);
        this.jogadores = jogadores;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador... jogadores) {
        this.jogadores = jogadores;
    }
}
