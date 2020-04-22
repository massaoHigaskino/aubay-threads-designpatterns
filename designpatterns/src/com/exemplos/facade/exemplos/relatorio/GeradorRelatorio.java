package com.exemplos.facade.exemplos.relatorio;

/*
    Objetivo: utilize o pattern facade para refatorar a classe
 */
public class GeradorRelatorio {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio();
    }
}

class Relatorio {
    private void gerarHeader() {
        System.out.println("Gerando o header");
    }

    private void gerarFooter() {
        System.out.println("Gerando o footer");
    }

    private void gerarDetail() {
        System.out.println("Gerando o detail");
    }

    private void gerarPaginacao() {
        System.out.println("Gerando a paginacao");
    }

    public void gerarRelatorio() {
        gerarHeader();
        gerarFooter();
        gerarDetail();
        gerarPaginacao();
    }
}
