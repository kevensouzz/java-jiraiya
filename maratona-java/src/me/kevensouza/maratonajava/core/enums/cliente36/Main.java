package me.kevensouza.maratonajava.core.enums.cliente36;

import me.kevensouza.maratonajava.core.enums.cliente36.domain.Cliente;
import me.kevensouza.maratonajava.core.enums.cliente36.domain.enumerations.TipoCliente;
import me.kevensouza.maratonajava.core.enums.cliente36.domain.enumerations.TipoPagamento;

public class Main {
    public static void main(String[] args) {
        Cliente kev_fis = new Cliente("kevs XD", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente kev_jur = new Cliente("Keven Souza", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(kev_fis);
        System.out.println(kev_jur);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    }
}
