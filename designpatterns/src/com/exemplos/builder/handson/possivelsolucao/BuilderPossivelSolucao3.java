package com.exemplos.builder.handson.possivelsolucao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class BuilderPossivelSolucao3 {
    public static void main(String[] args) {
        Transacao3 transacao3 = Builder.build(Transacao3.class)
                .with(t -> t.setDataTransacao(LocalDateTime.now()))
                .with(t -> t.setValor(BigDecimal.TEN))
                .with(t -> t.setEstabelecimento("Vendinha da Tia"))
                .get();
    }

}

class Transacao3 {
    private String metodoPagamento;
    private String numeroCartao;
    private String localCompra;
    private String estabelecimento;
    private LocalDateTime dataTransacao;
    private BigDecimal valor;

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getLocalCompra() {
        return localCompra;
    }

    public void setLocalCompra(String localCompra) {
        this.localCompra = localCompra;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public LocalDateTime getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDateTime dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}

class Builder<T> {
    private T instance;
    private boolean ifCond = true; // default

    public Builder(Class<T> clazz) {
        try {
            instance = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Builder<T> with(Consumer<T> setter) {
        if (ifCond)
            setter.accept(instance);
        return this;
    }

    public T get() {
        return instance;
    }

    public static <T> Builder<T> build(Class<T> clazz) {
        return new Builder<>(clazz);
    }

    public Builder<T> If(BooleanSupplier condition) {
        this.ifCond = condition.getAsBoolean();
        return this;
    }

    public Builder<T> endIf() {
        this.ifCond = true;
        return this;
    }
}
