package me.kevensouza.maratonajava.intro;

public class BreakExercise09 {
    public static void main(String[] args) {
        double value = 50000f;

        for (int installment = 1; value >= installment; installment++) {
            double installmentValue = value / installment;
            if (installmentValue < 1000) {
                break;
            }
            System.out.printf("Parcela: %d, R$: %.3f\n", installment, installmentValue);
        }
    }
}
