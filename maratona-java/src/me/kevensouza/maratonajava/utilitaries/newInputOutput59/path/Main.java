package me.kevensouza.maratonajava.utilitaries.newInputOutput59.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path p1 = Paths.get("src/me/kevensouza/maratonajava/utilitaries/newInputOutput59/path", "pasta", "teste.txt");

        if (Files.notExists(p1)) {
            try {
                if (Files.notExists(p1.getParent())) {
                    Files.createDirectories(p1.getParent());
                }
                Files.createFile(p1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (Files.exists(p1)) {
            try {
                Files.write(p1, "Escrevendo uma mensagem no arquivo".getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
