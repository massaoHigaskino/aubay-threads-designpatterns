package com.exemplos.strategy.exemplos.comissaofuncionario;

import java.math.BigDecimal;

/*
    Objetivo: O cálculo de comissões não está legal. Use o pattern Strategy.
 */

public class CalcularComissaoFuncionario {
    public static void main(String[] args) {

        Empregado empregado = new Empregado("João", new Gerente());
        Compra compra = new Compra(empregado, BigDecimal.TEN);
        System.out.println("O valor da sua comissão é de: " + compra.calcularComissao());
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
        return empregado.getCargo().calcularComissao(totalCompra);
    }
}

class Juridico implements Cargo {

    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.4));
    }
}

class Gerente implements Cargo {

    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.3));
    }
}

class Desenvolvedor implements Cargo {

    @Override
    public BigDecimal calcularComissao(BigDecimal totalCompra) {
        return totalCompra.multiply(BigDecimal.valueOf(0.9));
    }
}


class Empregado {
    private String nome;
    private Cargo cargo;

    public Empregado(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}