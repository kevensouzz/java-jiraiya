package me.kevensouza.maratonajava.core.methods.pessoa20;

import me.kevensouza.maratonajava.core.methods.pessoa20.domain.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Keven");
        pessoa.setIdade(18);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
