package com.example.calculadora;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double raizQuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("Não é possível calcular a raiz de número negativo.");
        }
        return Math.sqrt(a);
    }
}
