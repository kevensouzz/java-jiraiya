package me.kevensouza.maratonajava.exceptions.exception42;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        createFile();
    }

    private static void createFile() {
        File file = new File("pasta/file.txt");

        try {
            boolean isCreatedFile = file.createNewFile();
            System.out.println("is created file: " + isCreatedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}