package com.exemplos.strategy.handson.possivelsolucao;

public class StrategyPossivelSolucaoMain {
    public static void main(String[] args) {
        Pagamento cartao = new Cartao();
        PagamentoConta pc = new PagamentoConta(cartao, 5.75);
        System.out.println("O valor da sua taxa é: "+pc.pagar());
    }
}

class PagamentoConta {

    private Pagamento pagamento;
    private double valor;

    public PagamentoConta(Pagamento pagamento, double valor) {
        this.pagamento = pagamento;
        this.valor = valor;
    }

    public double pagar() {
        return pagamento.pagarComTaxa(valor);
    }
}

interface Pagamento {
    double pagarComTaxa(double valorCompra);
}

class Cartao implements Pagamento {
    public double pagarComTaxa(double valorCompra) {
        return 8.0 * valorCompra;
    }
}

class PayPal implements Pagamento {
    public double pagarComTaxa(double valorCompra) {
        return 2.0 * valorCompra;
    }
}

class CartaoDeCredito implements Pagamento {
    public double pagarComTaxa(double valorCompra) {
        return 5.0 * valorCompra;
    }
}