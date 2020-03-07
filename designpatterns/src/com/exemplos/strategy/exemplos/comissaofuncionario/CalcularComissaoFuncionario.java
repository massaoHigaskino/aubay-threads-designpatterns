package com.exemplos.strategy.exemplos.comissaofuncionario;

import java.math.BigDecimal;

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

    private Empregado empregado;
    private BigDecimal totalCompra;

    public Compra(Empregado empregado, BigDecimal totalCompra) {
        this.empregado = empregado;
        this.totalCompra = totalCompra;
    }

    public BigDecimal calcularComissao() {
        if(empregado.getCargo().equals("Gerente")) {
            return totalCompra.multiply(BigDecimal.valueOf(0.3));
        } else if(empregado.getCargo().equals("Desenvolvedor")) {
            return totalCompra.multiply(BigDecimal.valueOf(0.9));
        } else if(empregado.getCargo().equals("Jurídico")) {
            return totalCompra.multiply(BigDecimal.valueOf(0.4));
        } else if(empregado.getCargo().equals("ScrumMaster")) {
            return totalCompra.multiply(BigDecimal.valueOf(0.1));
        } else if(empregado.getCargo().equals("Tester")) {
            return totalCompra.multiply(BigDecimal.valueOf(0.7));
        }
        return totalCompra.multiply(BigDecimal.valueOf(0.0));
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