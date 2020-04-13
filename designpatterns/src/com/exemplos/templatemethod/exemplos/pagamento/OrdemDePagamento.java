package com.exemplos.templatemethod.exemplos.pagamento;

/*
    Objetivo: Refatore o código para que use o Template Method e o método fique na ordem correta
 */
public class OrdemDePagamento {

    public static void main(String[] args) {
        ((Pagamento) new PagamentoCartao()).doPagamento();
    }

}

abstract class Pagamento {
    public void doPagamento() {
        realizarPagamento();
        gerarNotaFiscal();
        receberPedido();
        realizarEnvio();
    }

    public abstract void receberPedido();

    public abstract void realizarPagamento();

    public abstract void realizarEnvio();

    public abstract void gerarNotaFiscal();
}

class PagamentoCartao extends Pagamento {
@Override
    public void receberPedido() {
        System.out.println("Receber o pedido");
    }
    @Override
    public void realizarPagamento() {
        System.out.println("Realizar o Pagamento");
    }
    @Override
    public void realizarEnvio() {
        System.out.println("Realizar Envio de Produto");
    }
    @Override
    public void gerarNotaFiscal() {
        System.out.println("Gerando nota fiscal");
    }
}