package me.kevensouza.maratonajava.core.polimorfismo.produto39.service;

import me.kevensouza.maratonajava.core.polimorfismo.produto39.model.Produto;

public class Imposto {
    public static void calcula(Produto produto) {
        double imposto = produto.getImposto();
        System.out.println("produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
    }
}
