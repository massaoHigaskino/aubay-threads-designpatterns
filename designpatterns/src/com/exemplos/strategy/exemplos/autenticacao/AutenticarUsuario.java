package com.exemplos.strategy.exemplos.autenticacao;

/*
    Objetivo: Hoje, temos somente autenticação com usuário/senha. Agora, com o padrão Strategy, realize a autenticação com vários modelos
 */

public class AutenticarUsuario {

    public static void main(String[] args) {
        AutenticarUsuario autenticar = new AutenticarUsuario();
        AutenticaUsuario basic = new Basic("meuemail@gmail.com", "12334");
        autenticar.autenticar(basic);

    }

    public void autenticar(AutenticaUsuario autenticacao) {
        autenticacao.autentica();
        System.out.println("Autenticação realizada");
    }

}

interface AutenticaUsuario {
    void autentica();
}

class Basic implements AutenticaUsuario {

    private String username;
    private String password;

    public Basic(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void autentica() {
        System.out.println("Autenticando com Basic");
    }
}

class Kerberos implements AutenticaUsuario {

    private String username;
    private String password;

    public Kerberos(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void autentica() {
        System.out.println("Autenticando Usuario com Kerberos");
    }
}

class LDAP implements AutenticaUsuario {

    private String username;
    private String password;

    public LDAP(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void autentica() {
        System.out.println("Autenticando Usuário com LDAP");
    }
}