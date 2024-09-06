package me.kevensouza.maratonajava.BJDBC.B.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
public class Anime {
    private Long id;
    private String name;
    private Short episodes;
    private Set<Producer> producers;

    public Anime(String name, Short episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    public Anime(String name, Short episodes, Set<Producer> producers) {
        this.name = name;
        this.episodes = episodes;
        this.producers = producers;
    }

    public Anime(Long id, String name, Short episodes) {
        this.id = id;
        this.name = name;
        this.episodes = episodes;
    }

    public Anime(Long id, String name, Short episodes, Set<Producer> producers) {
        this.id = id;
        this.name = name;
        this.episodes = episodes;
        this.producers = producers;
    }
}
