package com.exemplos.facade.exemplos.pagamento;

/*
    Objetivo: Utilize o pattern facade para refatorar a classe
 */
public class Pagamento {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.realizarCompra();
    }
}

class Compra {

    public void realizarCompra() {
        Estoque estoque = new Estoque();
        estoque.verificarEstque();

        Financeiro financeiro = new Financeiro();
        financeiro.verificarCartao();
        financeiro.verificarPagamento();
        financeiro.verificarGeracaoNotaFiscal();

        Entrega entrega = new Entrega();
        entrega.verificarEntrega();
    }
}

class Financeiro {

    public void verificarCartao() {
        System.out.println("Verificando cartão");
    }

    public void verificarPagamento() {
        System.out.println("Verificando pagamento");
    }

    public void verificarGeracaoNotaFiscal() {
        System.out.println("Verificando nota fiscal");
    }
}

class Entrega {

    public void verificarEntrega() {
        System.out.println("Verificando entrega");
    }
}

class Estoque {

    public void verificarEstque() {
        System.out.println("Verificando estoque");
    }
}