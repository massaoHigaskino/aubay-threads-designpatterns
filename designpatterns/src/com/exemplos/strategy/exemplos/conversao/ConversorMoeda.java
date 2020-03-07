package com.exemplos.strategy.exemplos.conversao;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.Map;

/*
    Objetivo: A conversão precisa de refatoração para um Strategy.
 */

public class ConversorMoeda {

    public static final Map<Moeda, ConversorMoedaI> CONVERSOR_MOEDA_MAP;

    static {
        CONVERSOR_MOEDA_MAP = new EnumMap<>(Moeda.class);
        CONVERSOR_MOEDA_MAP.put(Moeda.EURO, new ConversorParaEuroImpl());
        CONVERSOR_MOEDA_MAP.put(Moeda.REAL, new ConversorParaRealImpl());
        CONVERSOR_MOEDA_MAP.put(Moeda.LIBRA, new ConversorParaLibraImpl());
        CONVERSOR_MOEDA_MAP.put(Moeda.DOLAR, new ConversorParaDolarImpl());

    }

    public static void main(String[] args) {
        Moeda euro = Moeda.EURO;

        System.out.println("Convertido ficou " + CONVERSOR_MOEDA_MAP.get(euro).converter(BigDecimal.TEN));
    }
}

enum Moeda {
    EURO, REAL, LIBRA, DOLAR
}

interface ConversorMoedaI {
    BigDecimal converter(BigDecimal valor);
}


class ConversorParaEuroImpl implements ConversorMoedaI {
    @Override
    public BigDecimal converter(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(0.2));
    }
}

class ConversorParaRealImpl implements ConversorMoedaI {
    @Override
    public BigDecimal converter(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(0.1));
    }
}

class ConversorParaLibraImpl implements ConversorMoedaI {
    @Override
    public BigDecimal converter(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(0.3));
    }
}

class ConversorParaDolarImpl implements ConversorMoedaI {
    @Override
    public BigDecimal converter(BigDecimal valor) {
        return valor.divide(BigDecimal.valueOf(0.4));
    }
}