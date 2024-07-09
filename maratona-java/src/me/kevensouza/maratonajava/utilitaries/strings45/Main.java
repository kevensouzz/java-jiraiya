package me.kevensouza.maratonajava.utilitaries.strings45;

public class Main {
    public static void main(String[] args) {
        // aloca o valor "Keven" na String Constant Pool e aponta a variável {nome1} para o endereço da memória que "Keven" está alocado.
        String nome1 = "Keven";
        // aponta a variável {nome2} para o endereço onde "Keven" já está alocado na String Pool
        String nome2 = "Keven";

        // faz referência para o mesmo endereço na memória? Sim
        System.out.println(nome1 == nome2);

        // aloca os valores " Runner" e "Keven Runner" na String Pool, a variável {nome1} passa a fazer referência à esse local na memória
        nome1 = nome1.concat(" Runner");
        System.out.println("novo valor para nome1: " + nome1);

        // dessa forma é alocado um novo valor "Keven" no Heap, porém fora da String Constant Pool, pois isso não é uma string literal, mas sim um objeto.
        String nome3 = new String("Keven");

        // faz referência para o mesmo endereço na memória? Não pois nome3 está fora da String Constant Pool
        System.out.println(nome2 == nome3);

        // o valor de nome2 é igual ao de nome3, ignorando o local na memória? Sim
        System.out.println(nome2.equals(nome3));
    }
}
