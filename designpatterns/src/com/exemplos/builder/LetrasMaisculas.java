package com.exemplos.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Use o Pattern Builder(Stream) para facilitar a criação dos objetos a serem transformados
 */
public class LetrasMaisculas {

    public static void main(String[] args) {
        List<String> letras = new ArrayList<>();
        Stream.Builder<String> streamBuilder = Stream.builder();
        letras = streamBuilder
                .add("a")
                .add("b")
                .add("c")
                .add("d")
                .add("e").build().collect(Collectors.toList());
        System.out.println(letras.stream().map(String::toUpperCase).collect(Collectors.toList()));

    }

}
