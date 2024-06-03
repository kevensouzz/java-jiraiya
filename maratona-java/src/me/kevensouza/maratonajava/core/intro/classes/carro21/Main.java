package me.kevensouza.maratonajava.core.intro.classes.carro21;

import me.kevensouza.maratonajava.core.intro.classes.carro21.domain.Carro;

public class Main {
    public static void main(String[] args) {
        Carro lancer = new Carro();
        Carro civic = new Carro();

        lancer.nome = "Lancer";
        lancer.modelo = "GT";
        lancer.ano = 2014;

        civic.nome = "Civic";
        civic.modelo = "SI";
        civic.ano = 2018;

        lancer.print(lancer);
        civic.print(civic);
    }
}
