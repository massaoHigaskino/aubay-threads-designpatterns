package com.exemplos.factorymethod.handson.possivelsolucao;

public class PossivelSolucaoFactoryMethod {
    public static void main(String[] args) {
        Mensagem mensagem = MensagemFactory.getInstance("sms");
        mensagem.enviar("Vai SMS");
    }
}

class MensagemFactory {
    public static Mensagem getInstance(String factory) {
        if(factory.equals("sms")) {
            return new MensagemSMS();
        } else if(factory.equals("email")) {
            return new MensagemEmail();
        } else {
            return null;
        }
    }
}

interface Mensagem {

    void enviar(String conteudo);

}

class MensagemSMS implements Mensagem {

    @Override
    public void enviar(String conteudo) {
        System.out.println("Enviando Mensagem SMS : " + conteudo);
    }
}

class MensagemEmail implements Mensagem {

    @Override
    public void enviar(String conteudo) {
        System.out.println("Enviando Mensagem Email : " + conteudo);
    }
}