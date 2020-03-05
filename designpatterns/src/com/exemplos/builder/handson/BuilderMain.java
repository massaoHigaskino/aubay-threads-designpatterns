package com.exemplos.builder.handson;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BuilderMain {
    public static void main(String[] args) {
        Transacao transacao = new Transacao("CARTAO", "12345", "Saldanha", "Vendinha da Tia", LocalDateTime.now(), BigDecimal.TEN);
    }
}

class Transacao {

    private String metodoPagamento;
    private String numeroCartao;
    private String localCompra;
    private String estabelecimento;
    private LocalDateTime dataTransacao;
    private BigDecimal valor;

    public Transacao(String metodoPagamento, String numeroCartao, String localCompra, String estabelecimento, LocalDateTime dataTransacao, BigDecimal valor) {
        this.metodoPagamento = metodoPagamento;
        this.numeroCartao = numeroCartao;
        this.localCompra = localCompra;
        this.estabelecimento = estabelecimento;
        this.dataTransacao = dataTransacao;
        this.valor = valor;
    }

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
