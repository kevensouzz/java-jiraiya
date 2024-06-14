package me.kevensouza.maratonajava.core.heranca.anime33.domain;

import java.util.Objects;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
