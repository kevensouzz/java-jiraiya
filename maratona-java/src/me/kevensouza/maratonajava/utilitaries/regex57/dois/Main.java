package me.kevensouza.maratonajava.utilitaries.regex57.dois;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // todos os dígitos
        // String regex = "\\d";

        // tudo o que não for dígito
        // String regex = "\\d";

        // todos os espaços em branco (\s é um atalho para [ \t\n\x0B\f\r])
        // String regex = "\\s";

        // tudo o que não for espaço em branco
        // String regex = "\\S";

        // todos os caracteres alfanuméricos
        // String regex = "\\w";

        // tudo o que não for caractere alfanumérico
        // String regex = "\\W";

        // range de caracteres
        // String regex = "[abcABC]";
        // String regex = "[a-cA-C]";

        // String text = "cafeBABY";

        // hexadecimal regex com quantificador
        String regex = "0[xX][0-9a-fA-F]{6}";

        String text = "hexadecimal slabc0X00ea  ffipamdmç 34235 0xff00ee";

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
