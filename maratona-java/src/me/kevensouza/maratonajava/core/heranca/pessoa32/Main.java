package me.kevensouza.maratonajava.core.heranca.pessoa32;

import me.kevensouza.maratonajava.core.heranca.pessoa32.domain.Endereco;
import me.kevensouza.maratonajava.core.heranca.pessoa32.domain.Funcionario;

public class Main {
    public static void main(String[] args) {
        Endereco enderecoDoKev = new Endereco();

        enderecoDoKev.setRua("Manoel Tinin de Lira");
        enderecoDoKev.setCep("55750-000");

        Funcionario kev = new Funcionario();
//        Funcionario kev = new Funcionario("Keven", "400.289.227-02", enderecoDoKev, 700000);

        kev.setNome("Keven");
        kev.setSalario(999999);
        kev.setEndereco(enderecoDoKev);
        kev.setCpf("400.289.227-02");

        kev.imprime();
        System.out.println();
        kev.relatorioDePagamento();
    }
}
