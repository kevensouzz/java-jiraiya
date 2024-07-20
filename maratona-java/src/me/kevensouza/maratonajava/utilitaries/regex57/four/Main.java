package me.kevensouza.maratonajava.utilitaries.regex57.four;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9])+@([a-z])+(\\.([a-z])+)+";
        String text = "luffy@gmail.com, jotataroqtecomeunopalio2007@mail.com.br, zorodograuoo7@hotmail.com, sakura@gaymail";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("texto:  " + text);
        System.out.println("índice: " + "0123456789");
        System.out.println("regex:  " + regex);
        System.out.print("posições encontradas: ");

        while (matcher.find()) {
            System.out.print("[" + matcher.start() + "]{" + matcher.group() + "} ");
        }
    }
}
