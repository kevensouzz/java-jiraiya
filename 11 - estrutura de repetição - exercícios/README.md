### Loops - Exercícios

----------

[RepeticaoExercise08.java](../maratona-java/src/me/kevensouza/maratonajava/intro/RepeticaoExercise08.java)

Printar todos os números `pares` de `0 a 1000000`.

```java
public class RepeticaoExercise08 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```

----------

[BreakExercise09.java](../maratona-java/src/me/kevensouza/maratonajava/intro/BreakExercise09.java)

Usar o recurso `break` do `laço for` para exibir o valor a quantidade máxima de parcelas levando em consideração que o valor da parcela tem que ser `maior ou igual a 1000`.

```java
public class BreakExercise09 {
    public static void main(String[] args) {
        double value = 50000f;

        for (int installment = 1; value >= installment; installment++) {
            double installmentValue = value / installment;
            if (installmentValue < 1000) {
                break;
            }
            System.out.printf("Parcela: %d, R$: %.3f\n", installment, installmentValue);
        }
    }
}
```

----------

[ContinueExercise10.java](../maratona-java/src/me/kevensouza/maratonajava/intro/ContinueExercise10.java)

Usar o recurso `continue` do laço for para fazer a mesma coisa do exercício anterior, porém inversamente ordenada.

Um detalhe, dessa forma ainda são processadas 50 mil vezes o loop exibindo valores mais baixos, mesmo que não exibidos.

No código do exercício anterior o loop só é processado a quantidade de vezes necessárias para exibir os valores requiridos, pois o `break;` expulsa o ponteiro de dentro do `for` quando não for mais necessário.

```java
public class ContinueExercise10 {
    public static void main(String[] args) {
        double valor = 50000;

        for (int parcela = (int) valor; parcela >= 1; parcela--) {
            double valorDaParcela = valor / parcela;

            if (valorDaParcela < 5000) {
                continue;
            }

            System.out.printf("Parcela: %d, Valor: %.2f\n", parcela, valorDaParcela);
        }
    }
}
```