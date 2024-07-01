# classes abstratas

[Classes Abstratas](../maratona-java/src/me/kevensouza/maratonajava/core/classesabstratas)

O motivo pelo qual as classes abstratas são implementadas no Java são mais puxado para o lado do Desenho do código.
<br>
Tem como papel, servir de `template` para outras classes, tanto é que ela não pode ser instanciada, e deve ser `Extendida/herdada`

```java
public abstract class Funcionario {
    // se uma classe é abstrata ela não pode ser constante (final)

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
```

A Classe Funcionário é um template para Gerente e Segurança

```java
public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
```

```java
public class Seguranca extends Funcionario {
    public Seguranca(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Seguranca{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Seguranca seguranca = new Seguranca("Zoro", 2000);
        System.out.println(seguranca);

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
    }
}
```

## métodos abstratos

Pegando o embalo das classes, os métodos abstratos são úteis em casos de métodos que são `necessariamente` sobrescritos em subclasses. 
<br>
Como assim?

vamos implementar às classes do exemplo acima um bônus no salário, porém não queremos adicionar o mesmo bônus para todos os funcionários, mas sim bônus diferente para cada cargo. Pra isso usaremos um método abstrato.

```java
// método abstrato da classe Funcionário
public abstract void calculaBonus();
```

```java
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        // chamando o método no construtor do Funcionário, dessa forma o calculo do bônus será feito assim que um objeto de tipo Segurança ou Gerente for instanciado.
        calculaBonus();
    }
```

*Métodos abstratos só devem ser declarados em classes abstratas.*

métodos abstratos não tem corpo e quando declarado um método abstrato, todas as subclasses devem sobrescrevê-la.

```java
public class Gerente extends Funcionario {
    @Override
    public void calculaBonus() {
        this.salario += salario * 0.2;
    }
}
```

```java
public class Seguranca extends Funcionario {
    @Override
    public void calculaBonus() {
        this.salario += salario * 0.1;
    }
}
```
dessa forma, Gerêntes terão 20% de bônus somados ao salário e Seguranças terão 10%.