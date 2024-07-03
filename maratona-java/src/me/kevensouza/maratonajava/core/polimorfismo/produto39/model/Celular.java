package me.kevensouza.maratonajava.core.polimorfismo.produto39.model;

public class Celular extends Produto {
    private static final double IMPOSTO = 0.2;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public double getImposto() {
        return this.valor * IMPOSTO;
    }
}
