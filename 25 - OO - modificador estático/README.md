# Modificador Estático

[text](../maratona-java/src/me/kevensouza/maratonajava/core/staticmodifiers/)

Antes dos modificadores estáticos, é necessário saber que o famoso `this` usado pra referenciar atributos, métodos e o que é que seja é somente colocado em execução `quando a classe é instanciada`. Ou seja...

No exemplo abaixo, o método `imprime()` printará o valor dos atributos **de uma determinada instância da classe `Pessoa`**... Se não existir uma instância, o método imprime não poderá ser executado. OK?

```java
public class Pessoa {
  private String nome;
  private short idade;

  public void Pessoa(String nome, short idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void imprime() {
    System.out.println(this.nome);
    System.out.println(this.idade);
  }
}
```

```java
  public class main {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa("Keven", 18);

      p1.imprime();
    }
  }
```

## atributos estáticos

Dito isso... atributos, métodos e blocos de inicialização `Estáticos` não estão diretamente relacionados à instância de uma classe; mas sim, a própria classe.


```java
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // atributo estático
    private static double velocidadeLimite = 250;
    //...
```

Já que o atributo é estático, não é necessário instanciar a classe para ver ser valor...

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Carro.getVelocidadeLimite());  // 250

        Carro.setVelocidadeLimite(300);

        System.out.println(Carro.getVelocidadeLimite()); // 300
        //...
```

E a mesma coisa com os métodos estáticos, já que o exemplo acima usa getters e setters... Porém, ao invés de usar `this` se usa o próprio nome da classe.

```java
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
```

Quanto aos blocos de inicialização estáticos, são executados uma única vez independe de quantas instâncias da classe tenha.

O(s) bloco de inicialização estático de uma classe é executado antes mesmo da alocação da classe na memória do computador, antes de qualquer outro bloco de inicialização não estático...

Exemplo de bloco de inicalização estática:

```java
public class Anime {
    private String nome;
    private static short[] episodios;

    static {
        Anime.episodios = new short[10];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = (short) (i + 1);
        }
    }

    public static void getEpisodios() {
        for (short ep : Anime.episodios) {
            System.out.println(ep);
        }
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Anime.getEpisodios();
    }
}
```

Saída:
```java
1
2
3
4
5
6
7
8
9
10
```