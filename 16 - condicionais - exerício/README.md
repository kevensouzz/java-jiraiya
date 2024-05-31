# Condicionais - Exercício

[CondicionaisExercise06.java](../maratona-java/src/me/kevensouza/maratonajava/intro/CondicionaisExercise06.java)

O desafio propôs que o programa exibisse  o `imposto por taxa` baseado no `salário anual` na Holanda.

Se o salário estiver entre `0 e 34.712 Euros` o imposto é de `9.70% do salário por faixa`...
<br />
Se Estiver entre `34.713 e 68.500 Euros` o imposto custa `37.35%`...
<br />
Se o salário for `maior que 68.500 Euros` o imposto custará fucking `49.50% do salário` kkkk.

não foi necessário pegar o valor do salário por input no terminal, então só setei o valor numa variável...

resolução:
```java
public class CondicionaisExercise06 {
    public static void main(String[] args) {
        float taxableincome = 60.000F;
        float taxPerBracket;

        if (taxableincome < 34.713F) {
            taxPerBracket = 9.70F;
        } else if (taxableincome > 34.712F && taxableincome < 68.508F) {
            taxPerBracket = 37.35F;
        } else {
            taxPerBracket = 49.50F;
        }

        System.out.printf("Taxable Income: %.2f\nTax Per Bracket: %.2f%", taxableincome, taxPerBracket);
    }
}
```