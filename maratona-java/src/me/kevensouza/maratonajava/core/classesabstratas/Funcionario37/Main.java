package me.kevensouza.maratonajava.core.classesabstratas.Funcionario37;

import me.kevensouza.maratonajava.core.classesabstratas.Funcionario37.domain.Gerente;
import me.kevensouza.maratonajava.core.classesabstratas.Funcionario37.domain.Seguranca;

public class Main {
    public static void main(String[] args) {
        Seguranca seguranca = new Seguranca("Zoro", 2000);
        System.out.println(seguranca);

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
    }
}
