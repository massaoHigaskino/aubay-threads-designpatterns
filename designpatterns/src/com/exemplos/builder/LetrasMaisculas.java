package com.exemplos.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    Use o Pattern Builder(Stream) para facilitar a criação dos objetos a serem transformados
 */
public class LetrasMaisculas {

    public static void main(String[] args) {
        List<String> letras = new ArrayList<>();
        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");
        letras.add("e");
        System.out.println(letras.stream().map(String::toUpperCase).collect(Collectors.toList()));

    }

}
