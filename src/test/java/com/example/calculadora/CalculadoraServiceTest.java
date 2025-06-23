package com.example.calculadora;

import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {

    @Test
    void testExecucaoCompleta() {
        CalculadoraService service = new CalculadoraService();
        service.executarOperacoes();
    }
}
