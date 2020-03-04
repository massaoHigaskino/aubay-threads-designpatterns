package com.exemplos.strategy.exemplos.imposto;

import java.math.BigDecimal;

/*
    Objetivo: Aplique o pattern Strategy para calcular os impostos
 */
public class Impostometro {

    public BigDecimal calcular(String nomeImposto, BigDecimal valor) {
        if (nomeImposto.equals("IVA")) {
            return valor.multiply(BigDecimal.valueOf(0.23));
        }
        if (nomeImposto.equals("IPI")) {
            return valor.multiply(BigDecimal.valueOf(0.12));
        }
        if (nomeImposto.equals("TAXA_MODERADORA")) {
            return valor.multiply(BigDecimal.valueOf(0.3));
        }
        if (nomeImposto.equals("INQQ")) {
            return valor.multiply(BigDecimal.valueOf(0.22));
        }
        if (nomeImposto.equals("IQQ")) {
            return valor.multiply(BigDecimal.valueOf(0.90));
        }
        return valor;
    }

    public static void main(String[] args) {
        BigDecimal valor = new Impostometro().calcular("IQQ", BigDecimal.valueOf(100.0));
        System.out.println(valor);

    }
}