package me.kevensouza.maratonajava.utilitaries.inputoutput58.bufferedWriterAndReader;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/me/kevensouza/maratonajava/utilitaries/inputoutput58/bufferedWriterAndReader/teste.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Escrevendo uma mensagem no arquivo!!!" + System.lineSeparator() + "Usando o System.lineSeparator ao invés do /n.");
            bufferedWriter.newLine();
            bufferedWriter.write("e o método newLine() do BufferedWriter também kkkkkkkk");
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
