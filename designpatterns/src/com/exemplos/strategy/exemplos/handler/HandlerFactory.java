package com.exemplos.strategy.exemplos.handler;


/*
    Objetivo: Aplicar o pattern Strategy para as classes abaixo.
    A classe HandlerFactory, recebe o nome de uma classe e busca o respectivo handler para ela.
    Infelizmente, não é possível generalizar os Documents.
 */

import java.lang.reflect.InvocationTargetException;

public class HandlerFactory {

    public Object getHandler(String nameDocument) {
        try {
            return EnumHandler.getHandler(nameDocument);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        HandlerLogin hl = (HandlerLogin) new HandlerFactory().getHandler("LoginRequest1Document");
        System.out.println(hl.executar());
    }

}

enum EnumHandler {
    LOGINHANDLER("LoginRequest1Document", HandlerLogin.class);


    private String document;
    private Class<? extends BaseHandler> handler;

    EnumHandler(String document, Class<? extends BaseHandler> handler) {
        this.document = document;
        this.handler = handler;
    }

    public static BaseHandler getHandler(String document) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        for (EnumHandler enumHandler : EnumHandler.values()) {
            if (enumHandler.document.equals(document)) {
                return enumHandler.handler.getDeclaredConstructor().newInstance();
            }
        }
        return null;
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

class BaseHandler {

}

class HandlerLogin extends BaseHandler {
    public String executar() {
        return "HandlerLogin";
    }
}

class HandlerLogout extends BaseHandler {
    public String executar() {
        return "HandlerLogout";
    }
}

class HandlerCreateUser extends BaseHandler {
    public String executar() {
        return "HandlerCreateUser";
    }
}

class HandlerRemoveUser extends BaseHandler {
    public String executar() {
        return "HandlerRemoveUser";
    }
}