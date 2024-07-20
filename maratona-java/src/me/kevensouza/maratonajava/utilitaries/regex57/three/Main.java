package me.kevensouza.maratonajava.utilitaries.regex57.three;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // hexadecimal regex com quantificador
        String regex = "0[xX]([a-fA-F0-9]{3}|[a-fA-F0-9]{6})";

        String text = "hexadecimal slabc0X00ea ffipamdmç0xff0 34235 0xff00ee ";

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
