package com.exemplos.facade.exemplos.pagamento;

/*
    Objetivo: Utilize o pattern facade para refatorar a classe
 */
public class Pagamento {
    public static void main(String[] args) {

    }
}

class RealizarPagamento {

    public void verificarEstque() {
        System.out.println("Verificando estoque");
    }

    public void verificarCartao() {
        System.out.println("Verificando cartão");
    }

    public void verificarEntrega() {
        System.out.println("Verificando entrega");
    }

    public void verificarPagamento() {
        System.out.println("Verificando pagamento");
    }

    public void verificarGeracaoNotaFiscal() {
        System.out.println("Verificando nota fiscal");
    }
}
