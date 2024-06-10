# Condicionais - Exercícios

[CondicionaisExercise06.java](../maratona-java/src/me/kevensouza/maratonajava/intro/CondicionaisExercise06.java)

O desafio propôs que o programa exibisse o imposto que o usuário terá de pagar baseado no `salário anual` e no `imposto por faixa salarial` na Holanda em 2020.

Se o salário estiver entre `€0 e €34.712` o imposto é de `9.70% do salário`...
<br />
Se Estiver entre `€34.713 e €68.500` o imposto custa `37.35% do salário`...
<br />
Se o salário for `maior que €68.500` o imposto custará fucking `49.50% do salário` kkkk.

Como não foi necessário pegar o valor do salário por input no terminal, então só setei o valor numa variável...

resolução:
```java
public class CondicionaisExercise06 {
    public static void main(String[] args) {
        float taxableincome = 70.000F;
        float taxPerBracket;
        float taxValue;

        if (taxableincome < 34.713F) {
            taxPerBracket = 9.70F;
        } else if (taxableincome < 68.508F) {
            taxPerBracket = 37.35F;
        } else {
            taxPerBracket = 49.50F;
        }

        taxValue = (taxPerBracket / 100) * taxableincome;

        System.out.printf("Taxable Income: €%.3f\nTax Per Bracket: %.2f%%\nTax Value: €%.3f", taxableincome, taxPerBracket, taxValue);
    }
}
```

----------

[condicionaisExercise07.java](../maratona-java/src/me/kevensouza/maratonajava/intro/condicionaisExercise07.java)

O desafio propõe que o programa imprima se o dia é `Útil` ou "`Inútil`" baseado no valor da variável `day`, sendo `1` `Domingo` e `7` `Sábado`.

resolução:
```java
public class condicionaisExercise07 {
    public static void main(String[] args) {
        byte day = 4;

        switch (day) {
            default:
                System.out.println("esse dia não existe");
                break;

            case 1:
            case 7:
                System.out.println("Dia Inútil");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
        }
    }
}
```