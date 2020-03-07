package com.exemplos.strategy.exemplos.imposto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
    Objetivo: Aplique o pattern Strategy para calcular os impostos
 */
public class Impostometro {
    
    public static final Map<String, ICalculoImposto> IMPOSTO_MAP;
    public static final ICalculoImposto DEFAULT_IMPL = new CalucloImpostoDummyImpl();
    
    static {
        IMPOSTO_MAP = new HashMap<>(4);
        IMPOSTO_MAP.put("IVA", new CalculoImpostoIVAImpl());
        IMPOSTO_MAP.put("IPI", new CalculoImpostoIPIImpl());
        IMPOSTO_MAP.put("TAXA_MODERADORA", new CalculoImpostoTAXA_MODERADORAImpl());
        IMPOSTO_MAP.put("INQQ", new CalculoImpostoINQQImpl());
        IMPOSTO_MAP.put("IQQ", new CalculoImpostoIQQImpl());
    }

    public BigDecimal calcular(String nomeImposto, BigDecimal valor) {
        return IMPOSTO_MAP.getOrDefault(nomeImposto, DEFAULT_IMPL).calcular(valor);
    }

    public static void main(String[] args) {
        BigDecimal valor = new Impostometro().calcular("IQQ", BigDecimal.valueOf(100.0));
        System.out.println(valor);

    }
}

interface ICalculoImposto {
    BigDecimal calcular(BigDecimal valor);
}

class CalucloImpostoDummyImpl implements ICalculoImposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor;
    }
}

class CalculoImpostoIVAImpl implements ICalculoImposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.23));
    }
}
class CalculoImpostoIPIImpl implements ICalculoImposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.12));
    }
}
class CalculoImpostoTAXA_MODERADORAImpl implements ICalculoImposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.3));
    }
}
class CalculoImpostoINQQImpl implements ICalculoImposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.22));
    }
}
class CalculoImpostoIQQImpl implements ICalculoImposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.90));
    }
}