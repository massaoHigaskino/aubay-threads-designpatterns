package com.exemplos.facade.exemplos.refund;

/*
    Objetivo: utilize o pattern facade para refatorar a classe
 */
public class RefundFacade {

    public static void main(String[] args) {

    }

}

class Refund {

    public void registrarLog() {
        System.out.println("registrando log");
    }

    public boolean validarCredenciais() {
        System.out.println("validando credenciais");
        return true;
    }

    public Object obtendoUtilizador() {
        System.out.println("obtendo utilizador");
        return new Object();
    }

    public Object obtendoTransacao() {
        System.out.println("obtendo transacao");
        return new Object();
    }

    public Object obtendoTerminalDevolucao() {
        System.out.println("obtendo terminal devolução");
        return new Object();
    }

    public void registrarInicioRefund() {
        System.out.println("registrando inicio refund");
    }

    public void registrarFimRefund() {
        System.out.println("registrando fim refund");
    }

    public Object realizarDevolucao() {
        System.out.println("realizando devolucao");
        return new Object();
    }

}