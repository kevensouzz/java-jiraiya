package me.kevensouza.maratonajava.core.association.jogador27;

import me.kevensouza.maratonajava.core.association.jogador27.domain.Jogador;
import me.kevensouza.maratonajava.core.association.jogador27.domain.Time;

public class Main {
    public static void main(String[] args) {
        Time corinthians = new Time("Corinthians");

        Jogador cr7 = new Jogador("Cristiano Ronaldo", corinthians);
        Jogador messi = new Jogador("Messi", corinthians);
        Jogador ney = new Jogador("Neymar", corinthians);
        Jogador kroos = new Jogador("Toni Kroos", corinthians);
        Jogador modric = new Jogador("Luka Modric", corinthians);
        Jogador casemiro = new Jogador("Casemiro", corinthians);
        Jogador marcelo = new Jogador("Marcelo", corinthians);
        Jogador carvajal = new Jogador("Carvajal", corinthians);
        Jogador thiagoSilva = new Jogador("Thiago Silva", corinthians);
        Jogador sergioRamos = new Jogador("Sergio Ramos", corinthians);
        Jogador neuer = new Jogador("Neuer", corinthians);

        corinthians.setJogadores(cr7, messi, ney, kroos, modric, casemiro, marcelo, carvajal, thiagoSilva, sergioRamos, neuer);

        System.out.println("jogadores do Corinthians:");
        System.out.println("#########################");
        for (Jogador jogador: corinthians.getJogadores()) {
            System.out.println(jogador.getNome());
        }
    }
}
