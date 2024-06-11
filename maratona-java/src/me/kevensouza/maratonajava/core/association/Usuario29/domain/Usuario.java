package me.kevensouza.maratonajava.core.association.Usuario29.domain;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Conta[] contas;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, String email, String senha, Conta... contas) {
        this(nome, email, senha);
        this.contas = contas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Conta[] getContas() {
        return this.contas;
    }

    public void setContas(Conta... contas) {
        this.contas = contas;
    }
}
