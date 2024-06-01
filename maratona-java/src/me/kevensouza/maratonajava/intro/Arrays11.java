package me.kevensouza.maratonajava.intro;

public class Arrays11 {
    public static void main(String[] args) {
        int[] idades = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        /**
         * define a primeira poição do array como 100
         */
        idades[0] = 100;

        for (int idade : idades) {
            System.out.println(idade);
        }

        /**
         * declara um array de 2 posições
         */
        int[] age = new int[2];

        /**
         * retorna o endereço onde o array `age` está guardado na memória
         */
        System.out.println(age);
    }
}
