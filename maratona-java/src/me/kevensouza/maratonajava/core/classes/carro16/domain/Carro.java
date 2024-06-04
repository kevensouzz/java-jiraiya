package me.kevensouza.maratonajava.core.classes.carro16.domain;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    public void print(Carro obj) {
        System.out.printf("nome: %s\nmodelo: %s\nano: %s\n\n", obj.nome, obj.modelo, obj.ano);
    }
}
