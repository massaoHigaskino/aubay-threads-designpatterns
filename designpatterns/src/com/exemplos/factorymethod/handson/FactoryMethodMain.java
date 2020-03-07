package com.exemplos.factorymethod.handson;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Mensagem mensagemSMS = new MensagemSMS();
        mensagemSMS.enviar("Vai SMS");
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