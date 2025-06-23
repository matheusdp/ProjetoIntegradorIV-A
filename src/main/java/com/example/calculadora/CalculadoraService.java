package com.example.calculadora;

public class CalculadoraService {

    private final Calculadora calculadora = new Calculadora();

    public void executarOperacoes() {
        double a = 10;
        double b = 2;

        System.out.println("Valor A: " + a + "\nValor B: " + b);

        System.out.println("Soma: " + calculadora.somar(a, b));
        System.out.println("Subtração: " + calculadora.subtrair(a, b));
        System.out.println("Multiplicação: " + calculadora.multiplicar(a, b));
        System.out.println("Divisão: " + calculadora.dividir(a, b));
        System.out.println("Potência: " + calculadora.potencia(a, b));
        System.out.println("Raiz quadrada de A: " + calculadora.raizQuadrada(a));
    }
}
