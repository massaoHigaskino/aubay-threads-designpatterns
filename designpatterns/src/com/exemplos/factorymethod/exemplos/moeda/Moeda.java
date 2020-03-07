package com.exemplos.factorymethod.exemplos.moeda;

import java.math.BigDecimal;

/*
    Aplique o pattern Factory Method para a conversão
 */
public class Moeda {
    public static void main(String[] args) {
        Conversao conversao = new Dolar();
        System.out.println(conversao.converter(BigDecimal.TEN));
    }
}

interface Conversao {
    String converter(BigDecimal valor);
}

class Dolar implements  Conversao {

    @Override
    public String converter(BigDecimal valor) {
        return "$ "+valor;
    }
}

class Real implements Conversao {

    @Override
    public String converter(BigDecimal valor) {
        return "R$ "+valor;
    }
}