package com.exemplos.decorator.exemplos.pizzaria;

import java.math.BigDecimal;

/*
    Utilize o pattern decorator para elaborar um pedido de pizza
 */
public class PizzariaAMelhor {
    public static void main(String[] args) {
    }
}

interface Pedido {
    BigDecimal getPreco();

    String getNome();
}

class Pizza implements Pedido {
    private BigDecimal preco;
    private String nome;

    public Pizza(BigDecimal preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public BigDecimal getPreco() {
        return this.preco;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
