package com.exemplos.strategy.exemplos.handler;


/*
    Objetivo: Aplicar o pattern Strategy para as classes abaixo.
    A classe HandlerFactory, recebe o nome de uma classe e busca o respectivo handler para ela.
    Infelizmente, não é possível generalizar os Documents.
 */

public class HandlerFactory {

    public Object getHandler(String nameDocument) {
        switch (nameDocument) {
            case "LoginRequest1Document":
                return new HandlerLogin();
            case "LogoutRequest1Document":
                return new HandlerLogout();
            case "CreateUserRequest1Document":
                return new HandlerCreateUser();
            case "RemoveUserRequest1Document":
                return new HandlerRemoveUser();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        HandlerLogin hl = (HandlerLogin) new HandlerFactory().getHandler("LoginRequest1Document");
        System.out.println(hl.executar());
    }

}

final class LoginRequest1Document {
    private String login;
}

final class LogoutRequest1Document {
    private String token;
}

final class CreateUserRequest1Document {
    private String username;
}

final class RemoveUserRequest1Document {
    private String idUser;
}

class HandlerLogin {
    public String executar() {
        return "HandlerLogin";
    }
}

class HandlerLogout {
    public String executar() {
        return "HandlerLogout";
    }
}

class HandlerCreateUser {
    public String executar() {
        return "HandlerCreateUser";
    }
}

class HandlerRemoveUser {
    public String executar() {
        return "HandlerRemoveUser";
    }
}