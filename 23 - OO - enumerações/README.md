# Enumerações

[ENUMS](../maratona-java/src/me/kevensouza/maratonajava/core/enums/)

Enumerações são usadas para tipar um determinado atributo com uma margem pré-definida de valores. Exemplo:
<br>
```java
public class Exemplo {
   private DiaDaSemana dia;

    Exemplo(DiaDaSemana dia) {
        this.dia = dia;
    }

   public enum DiaDaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;
   } 
}
```

Dessa forma, o atributo dia só podera ter atribuição dos valores setados no enum. E para atribuir esse valor à uma instância, basta {NomeDoEnum.VALOR_DESEJADO}, dessa forma:

```java
public class Main {
    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo(DiaDaSemana.DOMINGO);
    }
}
```