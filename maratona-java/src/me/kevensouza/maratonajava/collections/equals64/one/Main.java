package me.kevensouza.maratonajava.collections.equals64.one;

public class Main {
    public static void main(String[] args) {
        String nome1 = "Keven";
        String nome2 = "Keven";
        // vai dar true pq o valor "Keven" já existe na "piscina de strings"
        System.out.println(nome1 == nome2);

        String nome3 = new String("Keven");
        // vai dar false pq nome3 é um objeto de String e não um valor literal
        System.out.println(nome1 == nome3);

        // vai dar true pq o equals compara o valor e não a referência
        System.out.println(nome1.equals(nome3));
    }
}
