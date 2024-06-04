# Classes - Exercício

[Carro16](../maratona-java/src/me/kevensouza/maratonajava/core/classes/carro16/)

Criar uma classe `Carro` com os atributos `nome, modelo e ano`, criar dois objetos da classe e imprimir os valores.

```java
public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    public void print(Carro obj) {
        System.out.printf("nome: %s\nmodelo: %s\nano: %s\n\n", obj.nome, obj.modelo, obj.ano);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Carro lancer = new Carro();
        Carro civic = new Carro();

        lancer.nome = "Lancer";
        lancer.modelo = "GT";
        lancer.ano = 2014;

        civic.nome = "Civic";
        civic.modelo = "SI";
        civic.ano = 2018;

        lancer.print(lancer);
        civic.print(civic);
    }
}
```

```console
nome: Lancer
modelo: GT
ano: 2014

nome: Civic
modelo: SI
ano: 2018
```