package com.exemplos.builder.handson.possivelsolucao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BuilderPossivelSolucao1 {

    public static void main(String[] args) {
        Transacao transacao = new Transacao
                .Builder(BigDecimal.TEN, LocalDateTime.now())
                .comEstabelecimento("Vendinha da Tia")
                .comLocalDeCompra("Saldanha")
                .build();
    }

}

class Transacao {

    private String metodoPagamento;
    private String numeroCartao;
    private String localCompra;
    private String estabelecimento;
    private LocalDateTime dataTransacao;
    private BigDecimal valor;

    public static class Builder {
        private String metodoPagamento;
        private String numeroCartao;
        private String localCompra;
        private String estabelecimento;
        private LocalDateTime dataTransacao;
        private BigDecimal valor;

        public Builder(BigDecimal valor, LocalDateTime dataTransacao) {
            this.valor = valor;
            this.dataTransacao = dataTransacao;
        }

        public Builder comMetodoPagamento(String metodoPagamento) {
            this.metodoPagamento = metodoPagamento;
            return this;
        }

        public Builder comNumeroCartao(String numeroCartao) {
            this.numeroCartao = numeroCartao;
            return this;
        }

        public Builder comLocalDeCompra(String localCompra) {
            this.localCompra = localCompra;
            return this;
        }

        public Builder comEstabelecimento(String estabelecimento) {
            this.estabelecimento = estabelecimento;
            return this;
        }

        public Transacao build() {
            Transacao transacao = new Transacao();
            transacao.metodoPagamento = this.metodoPagamento;
            transacao.dataTransacao = this.dataTransacao;
            transacao.numeroCartao = this.numeroCartao;
            transacao.estabelecimento = this.estabelecimento;
            transacao.localCompra = this.localCompra;
            transacao.valor = this.valor;
            return transacao;
        }

    }

    private Transacao() {
    }

}