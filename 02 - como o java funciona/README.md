# Como o Java fuciona

### "Escreve uma vez e roda onde quiser"

O java é um pouco conhecido por essa frase. Mas, por que?...

No mundo da computação existe diversos sistemas operacionais (software que se comunica diretamente com periféricos e hardwares do computador). Esses são os mais populares atualmente

- Windows
- MacOS
- Distros do Linux(Kernel)

O que faz o java ser conhecido por essa frase é a sua Máquina Virtual, a JVM (Java Virtual Machine) que é responsavel por fazer os programas em java **NÃO** rodar diretamente no sistema operacional, desta forma não precisando de um códiga para cada OS (Sistema Operacional).

![wrong example](images/wrong%20example.png)

### (OBS) Isso não quer dizer que tenha uma JVM universal, para todos os OS...

Cada sistema operacional tem sua devida JVM para ser instalada para desenvolvimento...

A JVM pode ser facilmente instalada pelo navegador, uma abordagem muito comúm entre os desenvolvedores é o JDK (Java Development Kit) que é composto pela JDK e outras ferramentas que auxiliam no desenvolvimento.

Tornando a seguinte forma de funcionamento do java

1. código fonte java é compilado para bytecode pelo JAVAC (Java Compiler).
2. Os bytecode são interpretado nativamente pela JVM.
3. Aplicação é executada em qualquer outro OS pelo JRE (Java Runtime Environment) que também compõe o JDK.

Desta forma tornando o `java`, **não irônicamente**, uma linguagem compilada e interpretada ao mesmo tempo.

![correct example](images/correct%20example.png)