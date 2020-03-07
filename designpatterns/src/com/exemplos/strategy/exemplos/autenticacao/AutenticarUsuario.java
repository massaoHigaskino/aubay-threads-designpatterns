package com.exemplos.strategy.exemplos.autenticacao;

/*
    Objetivo: Hoje, temos somente autenticação com usuário/senha. Agora, com o padrão Strategy, realize a autenticação com vários modelos
 */

import java.util.HashMap;
import java.util.Map;

public class AutenticarUsuario {
    
    public static final Map<String, AuthProtocol> AUTH_PROTOCOL_MAP;
    
    static {
        AUTH_PROTOCOL_MAP = new HashMap<>(5);
        AUTH_PROTOCOL_MAP.put("digest", new DigestAuthProtocol());
        AUTH_PROTOCOL_MAP.put("basic", new BasicAuthProtocol());
        AUTH_PROTOCOL_MAP.put("ldap", new LdapAuthProtocol());
        AUTH_PROTOCOL_MAP.put("oauth", new OauthAuthProtocol());
        AUTH_PROTOCOL_MAP.put("kerberos", new KerberosAuthProtocol());
    }

    public static void main(String[] args) {
        String autenticacao = "digest";

        AUTH_PROTOCOL_MAP.getOrDefault(autenticacao, new DigestAuthProtocol()).autenticar("meuemail@gmail.com", "12334");
    }
}

interface AuthProtocol {
    void autenticar(String username, String password);
}

class DigestAuthProtocol implements AuthProtocol {
    @Override
    public void autenticar(String username, String password) {
        System.out.println("Autenticação digest realizada para utilizador " + username);
    }
}
class BasicAuthProtocol implements AuthProtocol {
    @Override
    public void autenticar(String username, String password) {
        System.out.println("Autenticação basic realizada para utilizador " + username);
    }
}
class LdapAuthProtocol implements AuthProtocol {
    @Override
    public void autenticar(String username, String password) {
        System.out.println("Autenticação ldap realizada para utilizador " + username);
    }
}
class OauthAuthProtocol implements AuthProtocol {
    @Override
    public void autenticar(String username, String password) {
        System.out.println("Autenticação oauth realizada para utilizador " + username);
    }
}
class KerberosAuthProtocol implements AuthProtocol {
    @Override
    public void autenticar(String username, String password) {
        System.out.println("Autenticação kerberos realizada para utilizador " + username);
    }
}