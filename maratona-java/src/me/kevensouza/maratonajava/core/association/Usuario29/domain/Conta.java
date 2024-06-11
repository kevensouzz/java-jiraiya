package me.kevensouza.maratonajava.core.association.Usuario29.domain;

public class Conta {
    private String nome;
    private String senha;
    private char acesso;
    private Usuario[] usuarios;

    public Conta(String nome, String senha, char acesso) {
        this.nome = nome;
        this.senha = senha;
        this.acesso = acesso;
    }

    public Conta(String nome, String senha, char acesso, Usuario... usuarios) {
        this(nome, senha, acesso);
        this.usuarios = usuarios;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getAcesso() {
        return this.acesso;
    }

    public void setAcesso(char acesso) {
        this.acesso = acesso;
    }

    public Usuario[] getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Usuario... usuarios) {
        this.usuarios = usuarios;
    }
}
