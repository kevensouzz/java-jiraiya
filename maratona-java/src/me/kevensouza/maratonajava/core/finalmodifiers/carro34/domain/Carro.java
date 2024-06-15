package me.kevensouza.maratonajava.core.finalmodifiers.carro34.domain;

//public final class Carro {
public class Carro {
    private String nome;
    public final Comprador COMPRADOR;
    public static final double VELOCIDADE_LIMITE = 300;

//    public final void imprime() {
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.COMPRADOR.getNome());
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }

    public Carro(Comprador COMPRADOR) {
        this.COMPRADOR = COMPRADOR;
    }

    public Carro(String nome, Comprador comprador) {
        this.nome = nome;
        this.COMPRADOR = comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
