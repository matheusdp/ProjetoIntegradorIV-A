# ProjetoIntegradorIV-A

Este projeto implementa uma **calculadora básica em Java** com operações matemáticas comuns, utilizando Maven como ferramenta de build.

## Funcionalidades

- Operações matemáticas suportadas:
    - Soma
    - Subtração
    - Multiplicação
    - Divisão (com tratamento de divisão por zero)
    - Potência
    - Raiz quadrada (com validação para números negativos)

- Geração de valores aleatórios para testes no serviço.

- Testes automatizados com JUnit:
    - Testes unitários para cada método da classe `Calculadora`.
    - Teste funcional simples para o serviço `CalculadoraService`.

## Estrutura do Projeto

```
src/
 ├─ main/
 │   └─ java/
 │       └─ com/exemplo/calculadora/
 │           ├─ Calculadora.java
 │           ├─ CalculadoraService.java
 │           └─ Main.java
 └─ test/
     └─ java/
         └─ com/exemplo/calculadora/
             ├─ CalculadoraTest.java
             └─ CalculadoraServiceTest.java
pom.xml
```

## Como executar

1. Compile o projeto:

```bash
mvn compile
```

2. Execute a aplicação principal:

```bash
mvn exec:java -Dexec.mainClass="com.example.calculadora.Main"
```

3. Execute os testes automatizados:

```bash
mvn test
```

## Requisitos

- Java JDK 17 (ou superior)
- Maven 3.6+

*Projeto desenvolvido como exercício de aprendizado em Java, Maven e testes automatizados.*
