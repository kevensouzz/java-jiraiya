package me.kevensouza.maratonajava.utilitaries.simpleFileVisitor61.two;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("file: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post: " + dir.getFileName());
        return FileVisitResult.CONTINUE;

    }
}

public class Main {
    public static void main(String[] args) {
        Path root = Paths.get("pasta");

        try {
            Files.walkFileTree(root, new ListAllFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
