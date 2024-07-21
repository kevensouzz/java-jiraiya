package me.kevensouza.maratonajava.utilitaries.inputoutput58.fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/me/kevensouza/maratonajava/utilitaries/inputoutput58/fileReader/teste.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 3");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fr = new FileReader(file)) {
            char[] in = new char[56];
            fr.read(in);
            for (char c : in) {
                System.out.print(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
