package me.kevensouza.maratonajava.core.classesabstratas.Funcionario;

import me.kevensouza.maratonajava.core.classesabstratas.Funcionario.domain.Gerente;
import me.kevensouza.maratonajava.core.classesabstratas.Funcionario.domain.Seguranca;

public class Main {
    public static void main(String[] args) {
        Seguranca seguranca = new Seguranca("Zoro", 2000);
        System.out.println(seguranca);

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
    }
}
