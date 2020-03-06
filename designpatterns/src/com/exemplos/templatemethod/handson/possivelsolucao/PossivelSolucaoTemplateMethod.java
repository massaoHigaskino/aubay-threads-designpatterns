package com.exemplos.templatemethod.handson.possivelsolucao;

public class PossivelSolucaoTemplateMethod {
    public static void main(String[] args) {
        SocialNetwork sn = new Facebook();
        sn.enviarPost("Faça o posto");
    }
}


abstract class SocialNetwork {
    private String username;
    private String password;

    public void enviarPost(String conteudo) {
        if (login(username, password)) {
            System.out.println("Postando Mensagem...");
            post(conteudo);
        }
        logout(username, password);
    }

    abstract void logout(String username, String password);

    abstract void post(String conteudo);

    abstract boolean login(String username, String password);

}

class Facebook extends SocialNetwork {

    @Override
    void logout(String username, String password) {
        System.out.println("Vou fazer o logout com a API do Facebook");
    }

    @Override
    void post(String conteudo) {
        System.out.println("Vou fazer o post com a API do Facebook");
    }

    @Override
    boolean login(String username, String password) {
        System.out.println("Vou fazer o login como Facebook");
        return true;
    }
}

class Twitter extends SocialNetwork {

    @Override
    void logout(String username, String password) {
        System.out.println("Vou fazer o logout com a API do Twitter");
    }

    @Override
    void post(String conteudo) {
        System.out.println("Vou fazer o post com a API do Twitter");
    }

    @Override
    boolean login(String username, String password) {
        System.out.println("Vou fazer o login como Twitter");
        return true;
    }
}