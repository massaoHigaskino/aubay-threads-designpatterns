package com.exemplos.singleton.exemplos.opcional;

/*
    Objetivo: obtenha duas instâncias da classe conexão
 */
public class ExemploOpcionalReflexao {

    public static void main(String[] args) {

    }

}


class Conexao {

    private static Conexao conexao;

    private Conexao() {
    }

    public static Conexao getInstance() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }

}
