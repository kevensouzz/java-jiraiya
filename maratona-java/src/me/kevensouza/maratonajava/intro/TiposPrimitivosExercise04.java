package me.kevensouza.maratonajava.intro;

public class TiposPrimitivosExercise04 {
    public static void main(String[] args) {
        String nome = "Keven";
        String endereco = "Surubim - PE";
        Float salario = 2000.00f;
        String dataDeRecebimento = "28/06/2024";

        System.out.printf("Eu %s, morando no endereço %s,\nconfirmo que recebi o salário de %.2f, na data %s.",
                nome, endereco, salario, dataDeRecebimento);
    }
}
