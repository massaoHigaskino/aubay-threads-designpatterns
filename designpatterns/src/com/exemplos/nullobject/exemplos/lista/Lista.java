package com.exemplos.nullobject.exemplos.lista;

import java.util.*;

/*
    Objetivo: reescreva este código usando o pattern NullObject
 */
public class Lista {
    public static void main(String[] args) {
        List fabrica = FabricaLista.getList("pipoca");
        System.out.println(fabrica.size());
    }
}

class FabricaLista {
    public static List<?> getList(String tipo) {
        if(tipo.equals("arraylist")) {
            return new ArrayList<>();
        } else if(tipo.equals("linked")) {
            return new LinkedList<>();
        } else if(tipo.equals("stack")) {
            return new Stack<>();
        } else {
            return null;
        }
    }
 }