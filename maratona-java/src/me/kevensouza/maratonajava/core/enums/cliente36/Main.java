package me.kevensouza.maratonajava.core.enums.cliente36;

import me.kevensouza.maratonajava.core.enums.cliente36.domain.Cliente;
import me.kevensouza.maratonajava.core.enums.cliente36.domain.TipoCliente;

public class Main {
    public static void main(String[] args) {
        Cliente kev_fis = new Cliente("kevs XD", TipoCliente.PESSOA_FISICA);
        Cliente kev_jur = new Cliente("Keven Souza", TipoCliente.PESSOA_JURIDICA);

        System.out.println(kev_fis);
        System.out.println(kev_jur);
    }
}
