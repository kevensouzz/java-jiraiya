package me.kevensouza.maratonajava.core.classes.pessoa22.domain;

public class Pessoa {
    private String nome;
    private short idade;
    private char sexo;
    private float altura;
    private float peso;

    public void init(String nome) {
        this.nome = nome;
    }

    public void init(String nome, short idade) {
        this.init(nome);
        this.idade = idade;
    }

    public void init(String nome, short idade, char sexo) {
        this.init(nome, idade);
        this.sexo = sexo;
    }

    public void init(String nome, short idade, char sexo, float altura) {
        this.init(nome, idade, sexo);
        this.altura = altura;
    }

    public void init(String nome, short idade, char sexo, float altura, float peso) {
        this.init(nome, idade, sexo, altura);
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public short getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }
}
