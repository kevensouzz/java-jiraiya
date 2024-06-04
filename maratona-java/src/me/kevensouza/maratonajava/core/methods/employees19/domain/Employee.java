package me.kevensouza.maratonajava.core.methods.employees19.domain;

public class Employee {
    public String nome;
    public short idade;
    public double[] salarios;

    public void print() {
        System.out.printf("nome: %s", this.nome);
        System.out.printf("\nidade: %d", this.idade);

        if (salarios == null) {
            return;
        }

        if (this.salarios != null)
            for (double salario : this.salarios) {
                System.out.printf("\nsalário: %.2f", salario);
            }

        mediaDeSalario();
    }

    private void mediaDeSalario() {
        if (this.salarios == null) {
            return;
        }

        double total = 0;

        for (double salario : this.salarios) {
            total += salario;
        }

        double media = total / this.salarios.length;

        System.out.printf("\nmédia salarial: %.2f", media);
    }
}
