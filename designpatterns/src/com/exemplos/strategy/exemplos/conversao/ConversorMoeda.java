package com.exemplos.strategy.exemplos.conversao;

import java.math.BigDecimal;

/*
    Objetivo: A conversão precisa de refatoração para um Strategy.
 */

public class ConversorMoeda {

    public static void main(String[] args) {
        Moeda euro = Moeda.EURO;

        if (Moeda.EURO.equals(euro)) {
            System.out.println("Convertido ficou " + new ConversorMoeda().converterParaEuro(BigDecimal.TEN));
        } else if (Moeda.DOLAR.equals(euro)) {
            System.out.println("Convertido ficou " + new ConversorMoeda().converterParaDolar(BigDecimal.TEN));
        } else if (Moeda.LIBRA.equals(euro)) {
            System.out.println("Convertido ficou " + new ConversorMoeda().converterParaLibra(BigDecimal.TEN));
        } else if (Moeda.REAL.equals(euro)) {
            System.out.println("Convertido ficou " + new ConversorMoeda().converterParaReal(BigDecimal.TEN));
        }
    }

    public BigDecimal converterParaEuro(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(0.2));
    }

    public BigDecimal converterParaReal(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(0.1));
    }

    public BigDecimal converterParaLibra(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(0.3));
    }

    public BigDecimal converterParaDolar(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(0.4));
    }
}

enum Moeda {
    EURO, REAL, LIBRA, DOLAR
}
