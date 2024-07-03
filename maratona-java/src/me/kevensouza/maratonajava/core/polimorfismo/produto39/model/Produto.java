package me.kevensouza.maratonajava.core.polimorfismo.produto39.model;

import me.kevensouza.maratonajava.core.polimorfismo.produto39.model.interfaces.Imposto;

public abstract class Produto implements Imposto {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
