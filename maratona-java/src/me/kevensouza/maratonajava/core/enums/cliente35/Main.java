package me.kevensouza.maratonajava.core.enums.cliente35;

import me.kevensouza.maratonajava.core.enums.cliente35.domain.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente kev_fis = new Cliente("kevs XD", "PESSOA_fisica");
        Cliente kev_jur = new Cliente("Keven Souza", "PESSOA_juridica");

        System.out.println(kev_fis);
        System.out.println(kev_jur);
    }
}
