package me.kevensouza.maratonajava.core.staticmodifiers.carro25;

import me.kevensouza.maratonajava.core.staticmodifiers.carro25.domain.Carro;

public class Main {
    public static void main(String[] args) {
//        Carro c1 = new Carro("bmw", 280);
//        Carro c2 = new Carro("mercedes", 275);
//        Carro c3 = new Carro("audi", 290);

        System.out.println(Carro.getVelocidadeLimite());

        Carro.setVelocidadeLimite(300);

        System.out.println(Carro.getVelocidadeLimite());

//        Carro c4 = new Carro("uno", 400);

//        c1.imprime();
//        c2.imprime();
//        c3.imprime();
//        c4.imprime();
    }
}
