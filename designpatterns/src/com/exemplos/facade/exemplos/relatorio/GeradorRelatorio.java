package com.exemplos.facade.exemplos.relatorio;

/*
    Objetivo: utilize o patter facade para refatorar a classe
 */
public class GeradorRelatorio {
    public static void main(String[] args) {

    }
}

class Relatorio {
    public void gerarHeader() {
        System.out.println("Gerando o header");
    }

    public void gerarFooter() {
        System.out.println("Gerando o footer");
    }

    public void gerarDetail() {
        System.out.println("Gerando o detail");
    }
}
