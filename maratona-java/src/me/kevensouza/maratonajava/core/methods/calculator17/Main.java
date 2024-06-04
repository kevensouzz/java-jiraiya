package me.kevensouza.maratonajava.core.methods.calculator17;

import me.kevensouza.maratonajava.core.methods.calculator17.domain.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        double[] valores = {20.0, 11.2, 22.0};

        double somaArray = calculator.somaArray(new double[]{20.0, 11.2, 22.0});
        double somaVarArgs = calculator.somaVarArgs(20.0, 11.2, 22.0);
        double subtracao = calculator.subtracao(20, 10);
        double multiplicacao = calculator.multiplicacao(20, 10);
        double divisao = calculator.divisao(20, 10);

        System.out.println(somaArray);
        System.out.println(somaVarArgs);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
    }
}
