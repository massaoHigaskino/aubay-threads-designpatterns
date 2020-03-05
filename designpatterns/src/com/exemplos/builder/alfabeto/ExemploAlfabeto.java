package com.exemplos.builder.alfabeto;

/*
    Objetivo: Reescreva este exemplo com o pattern Builder e que seja Thread-Safe
 */

public class ExemploAlfabeto {
    public static void main(String[] args) {
        String alf = "a";
        alf += "b";
        alf += "c";
        alf += "d";
        alf += "e";
        alf += "f";
        alf += "g";

        System.out.println(alf);
    }
}
