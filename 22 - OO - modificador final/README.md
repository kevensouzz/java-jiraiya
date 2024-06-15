# Modifiador final

[final modifiers](../maratona-java/src/me/kevensouza/maratonajava/core/finalmodifiers/)

De forma simplificada, pode se considerar que o modificador `final` é usado para fazer de um atributo uma `constante`. Porque ao ser implementado.

`Constantes` costumam ter a nomeclatura toda em `CAIXA_ALTA`.

Um atributo constante deve ter seu valor atribuido assim que declarado.
<br>
Exemplos:

```java
// 1
    public final double VELOCIDADE_LIMITE = 300;

// 2
      public final double VELOCIDADE_LIMITE;
      {
        VELOCIDADE_LIMITE = 300
      }

// 3
      public final double VELOCIDADE_LIMITE;

      public Carro(double VELOCIDADE_LIMITE) {
          this.VELOCIDADE_LIMITE = VELOCIDADE_LIMITE;
      }
```

Mas caso o a `constante` também seja `estática`, não poderá ser declarada por construtores e nem em blocos de inicialização normais.

## Constante de tipo de referência

Nos exemplos acima usamos constantes de tipo primitivo.

Como seria uma constante de tipo de referência?

```java
public class Carro {
    private String nome;
    public final Comprador COMPRADOR;
    //...

public class Comprador {
    private String nome;
    //...

// podemos mudar os valores do objeto COMPRADOR, mas não podemos substituir o objeto em si.
Carro carro = new Carro("gtr", new Comprador("KevLev"));
carro.COMPRADOR.setNome("Kev");
```

## Classes e métodos `final`

O comportamente das classe e métodos ao usar o modificador final afeta em relação a herança...

Uma `Classe` com modificador final, não pode extender nenhuma outra classe.
<br>
enquanto os `Métodos` não podem ser sobrescritos.

Desta forma, os métodos de uma classe não costumam ser *finais* quando sua própria classe já for, pois só é possivel sobrescrever métodos de classes que estão sendo extendidas...