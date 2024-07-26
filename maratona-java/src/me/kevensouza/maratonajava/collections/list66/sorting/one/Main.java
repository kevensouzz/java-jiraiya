package me.kevensouza.maratonajava.collections.list66.sorting.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Naruto");
        mangas.add("One Piece");
        mangas.add("Bleach");
        mangas.add("Dragon Ball");
        mangas.add("Death Note");
        mangas.add("Nanatsu no Taizai");

        Collections.sort(mangas);

        System.out.println(mangas);

        List<Double> grana = new ArrayList<>(6);
        grana.add(100.0);
        grana.add(50.0);
        grana.add(200.0);
        grana.add(150.0);
        grana.add(250.0);
        grana.add(300.0);

        Collections.sort(grana);

        System.out.println(grana);

    }
}
