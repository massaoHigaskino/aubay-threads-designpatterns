package com.exemplos.templatemethod.exemplos.requisicao;

/*
    Objetivo: Refatore o código para implementar o Pattern Template Method
 */
public class BaseHandler {
    public static void main(String[] args) {
        ((AbstractHandler) new LoginHandler()).executeBusiness();
        ((AbstractHandler) new LogoutHandler()).executeBusiness();
    }
}

abstract class AbstractHandler implements Negocio {
    @Override
    public void executeBusiness() {
        validarNegocio();
        validarAcesso();
        validarRequisicao();
    }

    public abstract void validarRequisicao();

    public abstract void validarAcesso();

    public abstract void validarNegocio();
}

interface Negocio {
    void executeBusiness();
}

class LoginHandler extends AbstractHandler {
    @Override
    public void validarRequisicao() {
        System.out.println("Validar Requisição");
    }
@Override
    public void validarAcesso() {
        System.out.println("Validar Acesso");
    }
    @Override
    public void validarNegocio() {
        System.out.println("Validar login");
    }
}

class LogoutHandler extends AbstractHandler {
    @Override
    public void validarRequisicao() {
        System.out.println("Validar Requisição");
    }
    @Override
    public void validarAcesso() {
        System.out.println("Validar Acesso");
    }
    @Override
    public void validarNegocio() {
        System.out.println("Validar logout");
    }
}