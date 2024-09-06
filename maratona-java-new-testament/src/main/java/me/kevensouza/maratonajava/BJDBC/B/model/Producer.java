package me.kevensouza.maratonajava.BJDBC.B.model;

import lombok.Data;

import java.util.Set;

@Data
public class Producer {
    private Long id;
    private String name;
    private Short age;
    private Set<Anime> animes;

    public Producer(String name, Short age) {
        this.name = name;
        this.age = age;
    }

    public Producer(String name, Short age, Set<Anime> animes) {
        this.name = name;
        this.age = age;
        this.animes = animes;
    }

    public Producer(Long id, String name, Short age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Producer(Long id, String name, Short age, Set<Anime> animes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.animes = animes;
    }
}
