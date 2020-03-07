package com.exemplos.strategy.exemplos.comissaofuncionario;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
    Objetivo: O cálculo de comissões não está legal. Use o pattern Strategy.
 */

public class CalcularComissaoFuncionario {
    public static void main(String[] args) {

        Empregado empregado = new Empregado();
        empregado.setCargo("Gerente");
        empregado.setNome("Dell da Microsoft");
        Compra compra = new Compra(empregado, BigDecimal.TEN);
        System.out.println("O valor da sua comissão é de: " +compra.calcularComissao());
    }
}

class Compra {
    
    private static final Map<String, CalculoComissao> EMPREGADO_MAP;
    
    static {
        EMPREGADO_MAP = new HashMap<>(5);
        EMPREGADO_MAP.put("Gerente", new Gerente());
        EMPREGADO_MAP.put("Desenvolvedor", new Desenvolvedor());
        EMPREGADO_MAP.put("Jurídico", new Juridico());
        EMPREGADO_MAP.put("ScrumMaster", new ScrumMaster());
        EMPREGADO_MAP.put("Tester", new Tester());
    }

    private Empregado empregado;
    private BigDecimal totalCompra;

    public Compra(Empregado empregado, BigDecimal totalCompra) {
        this.empregado = empregado;
        this.totalCompra = totalCompra;
    }

    public BigDecimal calcularComissao() {
        return EMPREGADO_MAP.getOrDefault(empregado.getCargo(), new EmpregadoDefault()).calcularComissao(totalCompra);
    }
}

class Empregado {
    private String nome;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

interface CalculoComissao {
    BigDecimal calcularComissao(BigDecimal totalCompra);
}

class EmpregadoDefault implements CalculoComissao {
    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.0));
    }
}
class Gerente implements CalculoComissao {
    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.3));
    }
}
class Desenvolvedor implements CalculoComissao {
    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.9));
    }
}
class Juridico implements CalculoComissao {
    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.4));
    }
}
class ScrumMaster implements CalculoComissao {
    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.1));
    }
}
class Tester implements CalculoComissao {
    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.7));
    }
}