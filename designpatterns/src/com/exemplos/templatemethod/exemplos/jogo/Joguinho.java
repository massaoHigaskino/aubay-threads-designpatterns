package com.exemplos.templatemethod.exemplos.jogo;

/*
    Objetivo: Refatore o código abaixo para que a solução utilize Template Method
 */
public class Joguinho {
    public static void main(String[] args) {

    }
}

class Futebol {

    public void comecarJogo(){
        System.out.println("Começar o jogo de Futebol");
    }

    public void terminarOJogo() {
        System.out.println("Terminar o Jogo de Futebol");
    }

    public void punirJogador() {
        System.out.println("Punir Jogador no Futebol");
    }

}

class Basquete {

    public void comecarJogo(){
        System.out.println("Começar o jogo de Basquete");
    }

    public void terminarOJogo() {
        System.out.println("Terminar o Jogo de Basquete");
    }

    public void punirJogador() {
        System.out.println("Punir Jogador no Basquete");
    }

}
