package com.exemplos.templatemethod.exemplos.requisicao;

/*
    Objetivo: Refatore o código para implementar o Pattern Template Method
 */
public class BaseHandler {
    public static void main(String[] args) {
        Negocio lh = new LoginHandler();
        lh.executeBusiness();
    }
}

interface Negocio {
    void executeBusiness();
}

class LoginHandler implements Negocio {

    @Override
    public void executeBusiness() {
        validarLogin();
        validarAcesso();
        validarRequisicao();
    }

    private void validarRequisicao() {
        System.out.println("Validar Requisição");
    }

    private void validarAcesso() {
        System.out.println("Validar Acesso");
    }

    private void validarLogin() {
        System.out.println("Validar login");
    }
}

class LogoutHandler implements Negocio {
    @Override
    public void executeBusiness() {
        validarLogin();
        validarAcesso();
        validarRequisicao();
    }

    private void validarRequisicao() {
        System.out.println("Validar Requisição");
    }

    private void validarAcesso() {
        System.out.println("Validar Acesso");
    }

    private void validarLogin() {
        System.out.println("Validar login");
    }
}