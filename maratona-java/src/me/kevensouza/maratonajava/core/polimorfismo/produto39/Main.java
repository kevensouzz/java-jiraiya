package me.kevensouza.maratonajava.core.polimorfismo.produto39;

import me.kevensouza.maratonajava.core.polimorfismo.produto39.model.Celular;
import me.kevensouza.maratonajava.core.polimorfismo.produto39.model.Computador;
import me.kevensouza.maratonajava.core.polimorfismo.produto39.service.Imposto;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador("Nitro 5", 4000);
        Celular cell = new Celular("Iphone 14", 4000);

        System.out.println(pc);
        Imposto.calcula(pc);

        System.out.println();

        System.out.println(cell);
        Imposto.calcula(cell);
    }
}
