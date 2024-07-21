package me.kevensouza.maratonajava.utilitaries.inputoutput58.fileReaderTwo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/me/kevensouza/maratonajava/utilitaries/inputoutput58/fileReaderTwo/teste.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Escrevendo uma mensagem no arquivo!!!");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int i;

        try (FileReader fr = new FileReader(file)) {
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
