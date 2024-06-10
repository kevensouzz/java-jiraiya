package me.kevensouza.maratonajava.core.staticmodifiers.carro25.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public void imprime() {
        System.out.println("----------");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidadeLimite: " + Carro.velocidadeLimite);
        System.out.println("velocidadeMaxima: " + this.velocidadeMaxima);
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return nome;
    }

    public void setMarca(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
