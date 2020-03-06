package com.exemplos.singleton.handson.possivelsolucao;

public class PossivelSolucaoThreadSafeSingleton {

    Conexao2 conexao = Conexao2.getInstance("Teste");

}

class Conexao2 {

    private static volatile Conexao2 conexao;

    public String value;

    private Conexao2(String value) {
        this.value = value;
    }

    public static Conexao2 getInstance(String value) {
        Conexao2 result = conexao;
        if (result != null) {
            return result;
        }
        synchronized (Conexao2.class) {
            if (conexao == null) {
                conexao = new Conexao2(value);
            }
            return conexao;
        }
    }

}

