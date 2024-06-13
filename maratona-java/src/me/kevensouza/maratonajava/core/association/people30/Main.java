package me.kevensouza.maratonajava.core.association.people30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = scan.nextLine();

        System.out.printf("Sua idade: ");
        short idade = scan.nextShort();

        System.out.println();
        if (idade >= 18) {
            System.out.printf("Olá Keven, sua idade permite tirar uma CNH!");
        } else {
            System.out.print("Olá Keven, sua idade não permite tirar uma CNH!");
        }
    }
}
