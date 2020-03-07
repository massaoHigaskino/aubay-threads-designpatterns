package com.exemplos.singleton.handson.possivelsolucao;

public class PossivelSolucaoNaoThreadSafeSingleton {
    public static void main(String[] args) {
        Conexao conexao = Conexao.getInstance();
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
