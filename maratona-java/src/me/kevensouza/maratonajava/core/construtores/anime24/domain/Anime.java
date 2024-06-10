package me.kevensouza.maratonajava.core.construtores.anime24.domain;

public class Anime {
    private String nome;
    private short[] episodios;

    {
        this.episodios = new short[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = (short) (i + 1);
            System.out.println(episodios[i]);
        }
    }

    public Anime() {
    }

    public Anime(String nome) {
        this.nome = nome;
    }
}
