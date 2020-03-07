package com.exemplos.nullobject.exemplos.comoptional;

/*
    Objetivo: Reescreva este código para NullObject pattern usando a API Java 8
 */
public class ComOptional {
    public static void main(String[] args) {
        String nome = NomesPopulares.getNome("x");
        System.out.println(nome.toUpperCase());
    }
}

class NomesPopulares {
    public static String getNome(String letra) {
        if(letra.equals("a")) {
            return "Astolfo";
        } else if(letra.equals("b")) {
            return "Benedito";
        } else if(letra.equals("c")) {
            return "Carlos";
        } else {
            return null;
        }
    }
}
