package com.exemplos.strategy.exemplos.autenticacao;

/*
    Objetivo: Hoje, temos somente autenticação com usuário/senha. Agora, com o padrão Strategy, realize a autenticação com vários modelos
 */

public class AutenticarUsuario {

    public static void main(String[] args) {
        AutenticarUsuario autenticar = new AutenticarUsuario();

        String autenticacao = "digest";

        if (autenticacao.equals("basic")) {
            // autenticação basic
        } else if (autenticacao.equals("basic")) {
            // autenticação basic
        } else if (autenticacao.equals("ldap")) {
            // autenticação ldap
        } else if (autenticacao.equals("oauth")) {
            // autenticação oauth
        } else if (autenticacao.equals("kerberos")) {
            // autenticação kerberos
        }

        autenticar.autenticar("meuemail@gmail.com", "12334");

    }

    public void autenticar(String username, String password) {
        System.out.println("Autenticação realizada");
    }

}
