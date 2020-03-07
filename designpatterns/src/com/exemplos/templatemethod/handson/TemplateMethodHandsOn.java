package com.exemplos.templatemethod.handson;

public class TemplateMethodHandsOn {
}

class SocialNetwork {
    private String username;
    private String password;

    public void enviarPost(String conteudo) {
        if (login(username, password)) {
            System.out.println("Postando Mensagem...");
            post(conteudo);
        }
        logout(username, password);
    }

    private void logout(String username, String password) {
        System.out.println("Fagenr Logoff");
    }

    private void post(String conteudo) {
        System.out.println("Post feito: " + conteudo);
    }

    private boolean login(String username, String password) {
        System.out.println("Fazendo login com username: " + username + " e password: " + password);
        return true;
    }

}