package com.exemplos.facade.exemplos.pagamento;

/*
    Objetivo: Utilize o pattern facade para refatorar a classe
 */
public class Pagamento {
    public static void main(String[] args) {
        RealizarPagamento rp = new RealizarPagamento();
        rp.realizar();
    }
}

class RealizarPagamento {

    private void verificarEstque() {
        System.out.println("Verificando estoque");
    }

    private void verificarCartao() {
        System.out.println("Verificando cartão");
    }

    private void verificarEntrega() {
        System.out.println("Verificando entrega");
    }

    private void verificarPagamento() {
        System.out.println("Verificando pagamento");
    }

    private void verificarGeracaoNotaFiscal() {
        System.out.println("Verificando nota fiscal");
    }

    public void realizar() {
        verificarEstque();
        verificarCartao();
        verificarPagamento();
        verificarGeracaoNotaFiscal();
        verificarEntrega();
    }
}
