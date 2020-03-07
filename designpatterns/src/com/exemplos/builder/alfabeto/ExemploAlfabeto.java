package com.exemplos.builder.alfabeto;

/*
    Objetivo: Reescreva este exemplo com o pattern Builder e que seja Thread-Safe
 */

public class ExemploAlfabeto {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("a")
                .append("b")
                .append("c")
                .append("d")
                .append("e")
                .append("f")
                .append("g");

        System.out.println(sb.toString());
    }
}
