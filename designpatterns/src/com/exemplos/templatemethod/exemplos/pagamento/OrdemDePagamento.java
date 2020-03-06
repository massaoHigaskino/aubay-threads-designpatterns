package com.exemplos.templatemethod.exemplos.pagamento;

/*
    Objetivo: Refatore o código para que use o Template Method e o método fique na ordem correta
 */
public class OrdemDePagamento {

    public static void main(String[] args) {
        OrdemDePagamento odp = new OrdemDePagamento();
        odp.realizarPagamento();
        odp.gerarNotaFiscal();
        odp.receberPedido();
    }

    public void receberPedido() {
        System.out.println("Receber o pedido");
    }

    public void realizarPagamento() {
        System.out.println("Realizar o Pagamento");
    }

    public void realizarEnvio() {
        System.out.println("Realizar Envio de Produto");
    }

    public void gerarNotaFiscal() {
        System.out.println("Gerando nota fiscal");
    }

}
