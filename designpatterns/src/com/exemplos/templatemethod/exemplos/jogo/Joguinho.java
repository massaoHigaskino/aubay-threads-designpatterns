package com.exemplos.templatemethod.exemplos.jogo;

/*
    Objetivo: Refatore o código abaixo para que a solução utilize Template Method
 */
public class Joguinho {
    public static void main(String[] args) {
        ((Game)new Futebol()).play();
        ((Game)new Basquete()).play();
    }

}

abstract class Game {

    public void play() {
        comecarJogo();
        punirJogador();
        terminarOJogo();
    }

    public abstract void comecarJogo();

    public abstract void terminarOJogo();

    public abstract void punirJogador();
}



class Futebol extends Game {

    @Override
    public void comecarJogo(){
        System.out.println("Começar o jogo de Futebol");
    }
    @Override
    public void terminarOJogo() {
        System.out.println("Terminar o Jogo de Futebol");
    }
    @Override
    public void punirJogador() {
        System.out.println("Punir Jogador no Futebol");
    }

}

class Basquete extends Game {
    @Override
    public void comecarJogo(){
        System.out.println("Começar o jogo de Basquete");
    }
    @Override
    public void terminarOJogo() {
        System.out.println("Terminar o Jogo de Basquete");
    }
    @Override
    public void punirJogador() {
        System.out.println("Punir Jogador no Basquete");
    }

}
