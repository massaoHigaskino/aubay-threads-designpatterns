package com.exemplos.decorator.exemplos.pizzaria;

import java.math.BigDecimal;

/*
    Utilize o pattern decorator para elaborar um pedido de pizza
 */
public class PizzariaAMelhor {
    public static void main(String[] args) {
        Pedido pedido = new Pizza2(new Pizza(BigDecimal.TEN, "Pizza normal"));
        System.out.println(pedido.getNome() + " => " + pedido.getPreco());
    }
}

interface Pedido {
    BigDecimal getPreco();

    String getNome();
}

class Pizza extends PizzaDecorator {
    private BigDecimal preco = BigDecimal.ZERO;
    private String nome = Pizza.class.getName();

    public Pizza(Pedido pedido) {
        super(pedido);
    }

    public Pizza(BigDecimal preco, String nome) {
        super(null);
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

class Pizza2 extends PizzaDecorator {
    private BigDecimal preco = BigDecimal.ZERO;
    private String nome = Pizza2.class.getName();

    public Pizza2(Pedido pedido) {
        super(pedido);
    }

    public Pizza2(BigDecimal preco, String nome) {
        super(null);
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

class PizzaDecorator implements Pedido {

    private Pedido pedido;

    public PizzaDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public BigDecimal getPreco() {
        return pedido.getPreco();
    }

    @Override
    public String getNome() {
        return pedido.getNome();
    }
}
