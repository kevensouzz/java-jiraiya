package me.kevensouza.maratonajava.core.polimorfismo.produto39.model;

public class Computador extends Produto {
    private static final double IMPOSTO = 0.125;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public double getImposto() {
        return this.valor * IMPOSTO;
    }
}
