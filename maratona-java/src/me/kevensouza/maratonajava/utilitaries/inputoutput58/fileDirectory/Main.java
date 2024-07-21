package me.kevensouza.maratonajava.utilitaries.inputoutput58.fileDirectory;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File directory = new File("src/me/kevensouza/maratonajava/utilitaries/inputoutput58/fileDirectory/testeeeee");
        boolean wasCreated = directory.mkdir();

        if (wasCreated || directory.exists()) {
            File file = new File(directory + "/teste.txt");
            
            try (FileWriter fileWriter = new FileWriter(file)) {
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Escrevendo uma mensagem no arquivo de teste");
                bufferedWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                int i;
                while ((i = bufferedReader.read()) != -1) {
                    System.out.print((char) i);
                }
                System.out.println("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String oldFileName = file.getName();

            File renameFile = new File(directory + "/renamed-file.txt");

            file.renameTo(renameFile);

            String newFileName = renameFile.getName();

            System.out.println("Old file name: " + oldFileName);
            System.out.println("New file name: " + newFileName);
        }
    }
}
