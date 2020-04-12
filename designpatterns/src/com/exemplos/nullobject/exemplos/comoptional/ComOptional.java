package com.exemplos.nullobject.exemplos.comoptional;

import java.util.Optional;

/*
    Objetivo: Reescreva este código para NullObject pattern usando a API Java 8
 */
public class ComOptional {
    public static void main(String[] args) {
        Optional<String> nome = NomesPopulares.getNome("a");

        System.out.println(nome.orElse("").toUpperCase());
    }
}

class NomesPopulares {
    public static Optional<String> getNome(String letra) {
        if(letra.equals("a")) {
            return Optional.of("Astolfo");
        } else if(letra.equals("b")) {
            return Optional.of("Benedito");
        } else if(letra.equals("c")) {
            return Optional.of("Carlos");
        } else {
            return Optional.empty();
        }
    }
}
