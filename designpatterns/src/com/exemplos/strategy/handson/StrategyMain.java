package com.exemplos.strategy.handson;

/**
 * Porta de entrada dos padrões
 *
 */
public class StrategyMain {

    public static void main(String[] args) {
        Pagamento pagamento = new Cartao();
        PagamentoConta pagamentoConta = new PagamentoConta(pagamento);
        System.out.println("Sua taxa de pagamento é: "+pagamentoConta.pagarComTaxa());
    }
}

class PagamentoConta {

    private Pagamento pagamento;

    public PagamentoConta(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double pagarComTaxa() {
        if (pagamento instanceof PayPal) {
            return 2.0 * 5;
        } else if (pagamento instanceof Cartao) {
            return 8.0 * 5;
        } else if (pagamento instanceof CartaoDeCredito) {
            return 5.0 * 5;
        }
        return 5.0;
    }
}

class Pagamento {

}

class Cartao extends Pagamento {

}

class PayPal extends Pagamento {

}

class CartaoDeCredito extends Pagamento {

}