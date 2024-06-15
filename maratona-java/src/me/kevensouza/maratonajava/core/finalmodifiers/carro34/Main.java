package me.kevensouza.maratonajava.core.finalmodifiers.carro34;

import me.kevensouza.maratonajava.core.finalmodifiers.carro34.domain.Carro;
import me.kevensouza.maratonajava.core.finalmodifiers.carro34.domain.Comprador;
import me.kevensouza.maratonajava.core.finalmodifiers.carro34.domain.Ferrari;

public class Main {
    public static void main(String[] args) {
//        Comprador comprador = new Comprador("Keven");

//        Carro carro = new Carro("gtr", comprador);

        Carro carro = new Carro("gtr", new Comprador("KevLev"));

        carro.COMPRADOR.setNome("Kev");

//        System.out.println(carro.COMPRADOR);

        Comprador donoDaFerrari = new Comprador("Mr. Keven");

        Ferrari ferrariDoKev = new Ferrari("Kev's Ferrari", donoDaFerrari);

        ferrariDoKev.imprime();
    }
}
