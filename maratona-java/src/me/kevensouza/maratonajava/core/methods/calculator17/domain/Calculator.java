package me.kevensouza.maratonajava.core.methods.calculator17.domain;

public class Calculator {

    public double somaArray(double[] valores) {
        double soma = 0;

        for (double valor : valores) {
            soma += valor;
        }

        return soma;
    }

    public double somaVarArgs(double... valores) {
        double soma = 0;

        for (double valor : valores) {
            soma += valor;
        }

        return soma;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        return a / b;
    }
}
