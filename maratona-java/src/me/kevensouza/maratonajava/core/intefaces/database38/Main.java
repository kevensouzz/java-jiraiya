package me.kevensouza.maratonajava.core.intefaces.database38;

import me.kevensouza.maratonajava.core.intefaces.database38.domain.DatabaseLoader;
import me.kevensouza.maratonajava.core.intefaces.database38.domain.FileLoader;

public class Main {
    public static void main(String[] args) {
        DatabaseLoader db = new DatabaseLoader();
        FileLoader file = new FileLoader();

        db.load();
        db.remove();

        System.out.println();

        file.load();
        file.remove();
    }
}
