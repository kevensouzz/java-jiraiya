package me.kevensouza.maratonajava.utilitaries.inputoutput58.createFile;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/me/kevensouza/maratonajava/utilitaries/inputoutput58/createFile/file.txt");
        try {
            boolean wasCreated = file.createNewFile();
            System.out.println(wasCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
