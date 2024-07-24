package me.kevensouza.maratonajava.utilitaries.pathMatcher62.one;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path p1 = Paths.get("pasta/subpasta/file.bkp");
        Path p2 = Paths.get("pasta/subpasta/file.txt");
        Path p3 = Paths.get("pasta/subpasta/file.java");

        matcher(p1, "*.bkp");
        matcher(p1, "**.bkp");

        matcher(p2, "**.{bkp,java}");
        matcher(p2, "**.txt");

        matcher(p3, "**.{bkp,txt}");
        matcher(p3, "**.{bkp,txt,java}");
    }

    public static void matcher(Path path, String glob) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:" + glob);
        System.out.println(path + " | (" + glob + "): " + pathMatcher.matches(path));
    }
}
