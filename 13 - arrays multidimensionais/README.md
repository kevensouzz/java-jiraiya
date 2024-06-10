# Arrays Multidimensionais

[ArraysMultidimensionais13.java](../maratona-java/src/me/kevensouza/maratonajava/intro/ArraysMultidimensionais13.java)
<br />
[ArraysMultidimensionais14.java](../maratona-java/src/me/kevensouza/maratonajava/intro/ArraysMultidimensionais14.java)

De forma simples, arrays multidimensionais `são arrayas compostos por outros arrays`.

Não muito diferente dos arrays "normais", são declarados dessa forma:

```java
  int[][] MultiArrayDeInteiros = new int[3][];
```

Ao serem declarados devem ao menos ter explicitamente setado o tamanho do array base; Caso não seja setado o tamnho dos outros array `(segundo par de colchete no caso acima)` eles não seram declarados e retornará erro ao tentar imprimí-los.

Segue um exemplo de código que declara um array com 3 dimensões, mas cada uma dessas 3 dimensões tem uma quantidade aleatória de valores aleatórios:

```java
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = new int[(int) (Math.random() * 10)];

            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] arrayIntBase : arrayInt) {
            for (int inteiro : arrayIntBase) {
                System.out.println(inteiro);
            }
        }
    }
```