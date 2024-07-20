package me.kevensouza.maratonajava.utilitaries.regex57.um;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "ababababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("texto:  " + text);
        System.out.println("índice: " + "0123456789");
        System.out.println("regex:  " + regex);
        System.out.print("posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
