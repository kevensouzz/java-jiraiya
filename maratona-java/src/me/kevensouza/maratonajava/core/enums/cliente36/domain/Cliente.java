package me.kevensouza.maratonajava.core.enums.cliente36.domain;

public class Cliente {
    private String nome;
    private TipoCliente tipo;

//    public static final String PESSOA_FISICA =  "PESSOA_FISICA";
//    public static final String PESSOA_JURIDICA =  "PESSOA_JURIDICA";

    public Cliente(String nome, TipoCliente tipo) {
//        if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
//            return;
//        }
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
