package me.kevensouza.maratonajava.utilitaries.resourceBundle56;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("me.kevensouza.maratonajava.utilitaries.resourceBundle56.label", new Locale("pt", "BR"));
        System.out.printf(bundle.getString("hello") + ", " + bundle.getString("wassup") + "\n" + bundle.getString("hi") + ", " + bundle.getString("is.running") + "!");
    }
}
