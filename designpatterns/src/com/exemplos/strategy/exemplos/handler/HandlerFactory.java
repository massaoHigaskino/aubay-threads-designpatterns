package com.exemplos.strategy.exemplos.handler;


/*
    Objetivo: Aplicar o pattern Strategy para as classes abaixo.
    A classe HandlerFactory, recebe o nome de uma classe e busca o respectivo handler para ela.
    Infelizmente, não é possível generalizar os Documents.
 */

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class HandlerFactory {
    
    public static final Map<String, Class<? extends AbstractHandler>> HANDLER_MAPPER;
    
    static {
        HANDLER_MAPPER = new HashMap<>(4);
        HANDLER_MAPPER.put("LoginRequest1Document", HandlerLogin.class);
        HANDLER_MAPPER.put("LogoutRequest1Document", HandlerLogout.class);
        HANDLER_MAPPER.put("CreateUserRequest1Document", HandlerCreateUser.class);
        HANDLER_MAPPER.put("RemoveUserRequest1Document", HandlerRemoveUser.class);
    }

    public Object getHandler(String nameDocument) {
        try {
            return HANDLER_MAPPER.getOrDefault(nameDocument, HandlerDummy.class).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
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

abstract class AbstractHandler {
    abstract String executar();
}

class HandlerDummy extends AbstractHandler {
    @Override
    String executar() {
        return null;
    }
}

class HandlerLogin extends AbstractHandler {
    @Override
    public String executar() {
        return "HandlerLogin";
    }
}

class HandlerLogout extends AbstractHandler {
    @Override
    public String executar() {
        return "HandlerLogout";
    }
}

class HandlerCreateUser extends AbstractHandler {
    @Override
    public String executar() {
        return "HandlerCreateUser";
    }
}

class HandlerRemoveUser extends AbstractHandler {
    @Override
    public String executar() {
        return "HandlerRemoveUser";
    }
}