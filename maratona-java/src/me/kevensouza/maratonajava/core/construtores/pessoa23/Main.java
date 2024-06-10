package me.kevensouza.maratonajava.core.construtores.pessoa23;

import me.kevensouza.maratonajava.core.construtores.pessoa23.domain.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Keven", "144.129.284.17", (short) 18, 'M', 1.76f, 63.5f, 5000);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getPeso());
        System.out.println(pessoa.getSalario());
    }
}
