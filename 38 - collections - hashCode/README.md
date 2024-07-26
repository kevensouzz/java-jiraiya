# HashCode

Entendendo que o método equals() é usado pra comparar objetos de forma lógica e literal, vamos saber o motivo pelo qual o método `HashCode()` costuma ser implementado junto com o equals()...

O "problema" do método equals() começa quando temos, por exemplo, um array enorme, onde queremos achar um determinado objeto... pra isso o array é percorrido até achar o objeto procurado levando em consideração o argumento passado, por exemplo:

```java
public class Main {
    // se no array Car[] tivesse 7000000 mil carros e o Lancer estivesse em último kkkkkk daria um trabalhinho para percorrer todo o array até chegar nele, né? kkkkkk

    public static void main(String[] args) {
        Car car1 = new Car("Gol");
        Car car2 = new Car("Uno");
        Car car3 = new Car("Celta");
        Car car4 = new Car("Astra");
        Car car5 = new Car("Lancer");

        Car[] Cars = {car1, car2, car3, car4, car5};

        for (Car car: Cars) {
            if (car.getName().equals("Lancer")) {
                System.out.println("Lancer encontrado!");
            }
        }
    }
}
```

## HashCode

O HashCode ajuda a mitigar esse problema criando um código baseado nas informações do objeto (no nosso caso o nome do carro) e excluindo a necessidade de percorrer um array enorme para encontrar um único objeto

Existe um risco bastante improvável de que dois objetos com valores diferentes podem ter o mesmo index (hashCode), quando isso acontece o java usa o equals() pra retornar o valor buscado nos objetos com o mesmo index, uma vez que pouquíssimos objetos sobraram desse "filtro" do hashcode... Esse é um dos motivo que fazem o `hashCode()` ser implementado junto ao `equals()`.

![alt](./img/hashcode%20equals.png)

### Implementação/sobrescrita

```java
    @Override
    public int hashCode() {
        // nesse caso só foi passado naome como argumento pois é o único atributo da classe
        return Objects.hashCode(name);
    }
```

Assim como o método equals(), o hashCode() também tem algumas regrinhas...

- se x.hashCode() != y.hashCode(), x.equals(y) deve ser false;
- se x.equals(y) == true, x.hashCode() == y.hashCode() deve ser true;
- mas se x.hashCode() == y.hashCode(), não necessariamente x.equals(y) == true; (isso justifica a imagem acima, no tópico **Equals**)
