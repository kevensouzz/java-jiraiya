package me.kevensouza.maratonajava.utilitaries.serialization62.one;

import me.kevensouza.maratonajava.utilitaries.serialization62.one.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/aluno.ser");
        Aluno aluno = new Aluno(1, "kev", "keven123");
        serialize(path, aluno);
        deserialize(path);
    }

    private static void serialize(Path path, Object obj) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserialize(Path path) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Object obj = objectInputStream.readObject();
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
