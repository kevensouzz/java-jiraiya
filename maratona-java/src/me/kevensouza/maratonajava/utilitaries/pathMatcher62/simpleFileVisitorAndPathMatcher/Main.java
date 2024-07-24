package me.kevensouza.maratonajava.utilitaries.pathMatcher62.simpleFileVisitorAndPathMatcher;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FileVisitor extends SimpleFileVisitor<Path> {
    private final PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/**.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class Main {
    public static void main(String[] args) {
        Path root = Paths.get(".");

        try {
            Files.walkFileTree(root, new FileVisitor());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
