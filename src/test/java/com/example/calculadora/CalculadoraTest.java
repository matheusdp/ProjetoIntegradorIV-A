package com.example.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void testSoma() {
        assertEquals(5.0, calc.somar(2, 3));
    }

    @Test
    void testSubtracao() {
        assertEquals(1.0, calc.subtrair(4, 3));
    }

    @Test
    void testMultiplicacao() {
        assertEquals(12.0, calc.multiplicar(3, 4));
    }

    @Test
    void testDivisao() {
        assertEquals(2.0, calc.dividir(10, 5));
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }

    @Test
    void testPotencia() {
        assertEquals(8.0, calc.potencia(2, 3));
    }

    @Test
    void testRaizQuadrada() {
        assertEquals(5.0, calc.raizQuadrada(25));
    }

    @Test
    void testRaizQuadradaDeNegativo() {
        assertThrows(ArithmeticException.class, () -> calc.raizQuadrada(-9));
    }
}
