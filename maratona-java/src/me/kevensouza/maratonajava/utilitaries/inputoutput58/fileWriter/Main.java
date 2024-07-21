package me.kevensouza.maratonajava.utilitaries.inputoutput58.fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/me/kevensouza/maratonajava/utilitaries/inputoutput58/fileWriter/file.txt");
        try (FileWriter fw = new FileWriter(file);) {
            fw.write("Hello, World!\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
