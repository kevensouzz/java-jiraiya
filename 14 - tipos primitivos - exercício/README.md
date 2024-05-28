# Exercício

[TiposPrimitivosExercise04.java](../maratona-java/src/me/kevensouza/maratonajava/intro/TiposPrimitivosExercise04.java)

Exibir a seguinte mensagem substituindo <> por variáveis:

`
  Eu <nome>, morando no endereço <endereco>,
  confirmo que recebi o salário de <salario>, na data <dataDeRecebimento>.
`

Resolução:
```java
public class TiposPrimitivosExercise04 {
  public static void main(String[] args) {
    String nome = "Keven";
    String endereco = "Surubim - PE";
    Float salario = 2000.00f;
    String dataDeRecebimento = "28/06/2024";

    System.out.printf("Eu %s, morando no endereço %s,\nconfirmo que recebi o salário de %.2f, na data %s.",
    nome, endereco, salario, dataDeRecebimento);
  }
}
```