package com.exemplos.strategy.exemplos.ordenacao;

import java.util.ArrayList;
import java.util.Collection;

/*
    Objetivo: A ordenação precisa de refatoração para um Strategy.
 */
public class Ordenador {
    public static void main(String[] args) {
        new Ordenador().ordenar(new ArrayList(), "QuickSort");
    }

    public void ordenar(Collection colecao, String tipoOrdenacao) {
        if (tipoOrdenacao.equals("ShellSort")) {
            System.out.println("Executando ShellSort");
        } else if (tipoOrdenacao.equals("BubbleSort")) {
            System.out.println("Executando BubbleSort");
        } else if (tipoOrdenacao.equals("QuickSort")) {
            System.out.println("Executando QuickSort");
        }
    }
}
