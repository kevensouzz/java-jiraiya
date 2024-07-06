package me.kevensouza.maratonajava.exceptions.TryWithResources43;

import me.kevensouza.maratonajava.exceptions.TryWithResources43.model.FirstReader;
import me.kevensouza.maratonajava.exceptions.TryWithResources43.model.SecondReader;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        correctReadFile();
    }

    public static void correctReadFile() {
        try (
                FirstReader fReader = new FirstReader();
                SecondReader sReader = new SecondReader();
        ) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void wrongReadFile() {
//        Reader reader = null;
//
//        try {
//            reader = new BufferedReader(new FileReader("file.txt"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                if (reader != null) reader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
