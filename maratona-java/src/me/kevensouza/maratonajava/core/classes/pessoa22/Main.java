package me.kevensouza.maratonajava.core.classes.pessoa22;

import me.kevensouza.maratonajava.core.classes.pessoa22.domain.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.init("keven");
        System.out.println(pessoa.getNome());
        System.out.println("###################################");
        pessoa.init("Junior", (short) 24);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println("###################################");
        pessoa.init("Branco", (short) 59, 'M');
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getSexo());
        System.out.println("###################################");
        pessoa.init("Zeza", (short) 61, 'F', 1.56f);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getSexo());
        System.out.println(pessoa.getAltura());
    }
}
