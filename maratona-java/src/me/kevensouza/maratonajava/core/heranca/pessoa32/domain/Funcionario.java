package me.kevensouza.maratonajava.core.heranca.pessoa32.domain;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, Endereco endereco, float salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioDePagamento() {
        System.out.println("Eu, " + this.nome + ", confirmo que recebi meu salário, no valor de R$" + this.salario + "!");
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
