# polimorfismo

[Polimorfismo](../maratona-java/src/me/kevensouza/maratonajava/core/polimorfismo)

Quando vamos instanciar novos objetos, do tipo Computador e Celular, por exemplo, fazemos algo parecido com isso:

```java
Computador pc = new Computador("Nitro 5", 4000);
Celular cell = new Celular("Iphone 13", 3200)
```

Mas vamos imaginar que as classes acima estejam sendo extendidas pela classe abstrata `Produto` abaixo:

```java
    public abstract class Produto {
        protected String nome;
        protected double valor;

        public Produto(String nome, double valor) {
            this.nome = nome;
            this.valor = valor;
        }
        
        public String getNome() {
            return nome;
        }

        public double getValor() {
            return valor;
        }
    }
```

----------

O polimorfismo começa a partir do momento que instanciamos um novo *Computador* ou *Celular* com o tipo Produto, dessa forma:

```java
    Produto cell  = new Celular("Iphone 13", 3200)
```

Até agora o polimorfisomo não nos está ajudando em nada, mas vamos implementar o seguinte:
<br>
Impostos, taxas diferentes para cada produto.

Podemos começar criando uma interface `Imposto`, e à implementamos a classe abstrata `Produto`, assim:

```java
public interface imposto {
    double getImposto();
}
```

```java
    public abstract class Produto implements Imposto {
        // ...
    }
```

Agora, Precisamos sobrescrever o método `getImposto()`, o fato de Produto ser uma classe abstrata, nos dá a liberdade de sobrescrevê-la somente nas subclasses, dessa forma:

```java
private static final double IMPOSTO = 0.25;

@Override
public double getImposto() {
    return this.valor * IMPOSTO;
}
```

Agora vamos adaptar o exemplo ao modelo MVC criando um Service para calcular o imposto e exibir os dados do produto, pra isso criamos uma class Imposto dentro do pacote Service. Agora nos deparamos com um dos casos de uso de que faz o polimorfismo ser tão importante na Orientação a Objetos...

A principio, teriamos que criar um método para cada tipo de objeto, mas o polimorfismo permite passar uma classe mais genérica como argumento do método, veja:

```java
public class Imposto {
    public static void calcula(Produto produto) {
        double imposto = produto.getImposto();
        System.out.println("produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
    }
}

```

Dessa forma, independente do produto, vão ser exibidos os seus dados.