package me.kevensouza.maratonajava.core.classes.employees21.domain;

import java.math.BigDecimal;

public class Employee {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalarial;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    public void setSalarios(double... salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalarial() {
        double somaDosSalarios = 0;

        for (double salario : this.salarios) {
            somaDosSalarios += salario;
        }
        this.mediaSalarial = somaDosSalarios / this.salarios.length;

        BigDecimal mediaSalarialBd = new BigDecimal(this.mediaSalarial);
        mediaSalarialBd = mediaSalarialBd.setScale(2, BigDecimal.ROUND_HALF_UP);

        return mediaSalarialBd.doubleValue();
    }
}
