package me.kevensouza.maratonajava.core.finalmodifiers.carro34.domain;

public class Ferrari extends Carro {
    public final String CRIADOR = "Enzo Ferrari";

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.CRIADOR);
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "CRIADOR='" + CRIADOR + '\'' +
                ", COMPRADOR=" + COMPRADOR +
                '}';
    }

    public Ferrari(Comprador COMPRADOR) {
        super(COMPRADOR);
    }

    public Ferrari(String nome, Comprador comprador) {
        super(nome, comprador);
    }


}
