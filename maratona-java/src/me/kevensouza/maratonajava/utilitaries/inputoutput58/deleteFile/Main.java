package me.kevensouza.maratonajava.utilitaries.inputoutput58.deleteFile;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/me/kevensouza/maratonajava/utilitaries/inputoutput58/createFile/file.txt");

        if ( !file.exists() ) {
            throw new IllegalArgumentException("The file " + file + " does not exist.");
        }

        boolean wasDeleted = file.delete();
        System.out.println(wasDeleted);
    }
}
