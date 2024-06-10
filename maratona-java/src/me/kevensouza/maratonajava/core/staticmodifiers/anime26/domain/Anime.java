package me.kevensouza.maratonajava.core.staticmodifiers.anime26.domain;

public class Anime {
    private String nome;
    private static short[] episodios;

    static {
        Anime.episodios = new short[10];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = (short) (i + 1);
        }
    }

    public static void getEpisodios() {
        for (short ep : Anime.episodios) {
            System.out.println(ep);
        }
    }
}
