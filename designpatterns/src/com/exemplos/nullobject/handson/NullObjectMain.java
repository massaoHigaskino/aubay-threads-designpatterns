package com.exemplos.nullobject.handson;

public class NullObjectMain {
    public static void main(String[] args) {
        Conexao http = FactoryConexao.getConexao("smtp");
        http.conectar("porta 15");
    }
}

interface Conexao {
    void conectar(String parametros);
}

class Http implements Conexao {

    @Override
    public void conectar(String parametros) {
        System.out.println("Conectando via http com os params" + parametros);
    }


}

class Ftp implements Conexao {
    @Override
    public void conectar(String parametros) {
        System.out.println("Conectando via ftp com os params" + parametros);
    }
}



class FactoryConexao {
    public static Conexao getConexao(String tipo) {
        if (tipo.equals("http")) {
            return new Http();
        } else if (tipo.equals("ftp")) {
            return new Ftp();
        } else {
            return new NullObject();
        }
    }
}

class NullObject implements Conexao {

    @Override
    public void conectar(String parametros) {
        System.out.println("NullObject");
    }
}
