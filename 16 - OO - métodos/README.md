# Métodos

[Methods](../maratona-java/src/me/kevensouza/maratonajava/core/methods/)

Métodos são as funções/comportamentos de uma determinada classe.
<br />
Exemplo:

```java
public class Employee {
  public class Employee {
    public String nome;
    public short idade;

    public void print() {
        System.out.println("nome: %s", this.nome);
        System.out.println("idade: %d", this.idade);
    }
  }
}
```

O método presente no código acima é o print(), responsável por printar o nome e a idade do funcionário.

## Parâmetros

Paramêtros são valores passados para exercer a função, para parametrizar um método basta colocar a tipagem que o parâmetro espera e um nome. Exemplo:

```java
public void somarDoisNumerosInteiros(int num1, int num2) {
    System.out.println(num1 + num2);
}
```

Chamando esse método:

```java
somarDoisNumerosInteiros(20, 10);
```

Métodos não se limitam a receber parâmetros de tipos primitivos, também podem receber parâmetros de tipo de referência, como Classes.

...Falando em referência, métodos de uma determinada classe pode usar referência de valores da própria classe, usando o `this`. Exemplo:

```java
    public void print() {
        String data = "name: " + this.name + "\nage: " + this.age + " years\ngrade: " + this.grade + "\nserie: " + this.serie + "ª\nclass: " + this.serieClass + "\ngender: " + this.gender;
        System.out.println(data);
    }
```

### VarArgs

è um recurso usado pra passar uma array como parâmetro de uma função.

Deve ser o último parâmetro da função, pois não tem previsão de qual será o último valor do array.

#### Sem VarArgs

```java
  public double somaVariosNumeros(double[] numeros){
    double soma = 0;

    for (double numero : numeros) {
      soma += numero;
    }

    return soma;
  } 
```

```java
  somaVariosNumeros(new double[]{20, 15, 17.5});
```

#### Com VarArgs

```java
  public double somaVariosNumeros(double... numeros){
    double soma = 0;

    for (double numero : numeros) {
      soma += numero;
    }

    return soma;
  } 
```

```java
  somaVariosNumeros(20, 15, 17.5);
```

## Retorno

Para declarar um método é necessario declarar o que a função vai retornar antes de seu nome.

Não confunda retorno com saída.

### Exemplo de Saída
```java
// void == vazio -> não retorna nada
public void somarDoisNumerosInteiros(int num1, int num2) {
    System.out.println(num1 + num2);
}
```

### Exemplo de Retorno
```java
// int == o método retorna um valor de tipo int
public int somarDoisNumerosInteiros(int num1, int num2) {
    return num1 + num2;
}
```

## Exercício

[employees19/](../maratona-java/src/me/kevensouza/maratonajava/core/methods/employees19/)

Criar uma classe `Funcionário` com os seguintes atributos e métodos

- nome
- idade
- salários

- método pra imprimir todos os atributos (incluido a média de todos os salários)
- método pra pra printar a média dos salários

```java
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.nome = "Keven";
        employee.idade = 18;
        employee.salarios = new double[]{2200, 3400, 4800};

        employee.print();
    }
}
```

```java
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
```