package me.kevensouza.maratonajava.intro;

public class ContinueExercise10 {
    public static void main(String[] args) {
        double valor = 50000;

        for (int parcela = (int) valor; parcela >= 1; parcela--) {
            double valorDaParcela = valor / parcela;

            if (valorDaParcela < 5000) {
                continue;
            }

            System.out.printf("Parcela: %d, Valor: %.2f\n", parcela, valorDaParcela);
        }
    }
}
