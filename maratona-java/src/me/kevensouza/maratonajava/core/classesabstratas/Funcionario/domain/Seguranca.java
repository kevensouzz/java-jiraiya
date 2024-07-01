package me.kevensouza.maratonajava.core.classesabstratas.Funcionario.domain;

public class Seguranca extends Funcionario {

    public Seguranca(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Seguranca{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaBonus() {
        this.salario += salario * 0.1;
    }
}
