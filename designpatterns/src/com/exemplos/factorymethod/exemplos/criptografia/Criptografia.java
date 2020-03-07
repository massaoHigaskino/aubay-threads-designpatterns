package com.exemplos.factorymethod.exemplos.criptografia;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/*
    Objetivo: Aplique o pattern Factory Method e refatore este código
 */
public class Criptografia {
    public static void main(String[] args) {
        Algoritmo algoritmo = new AES();
        System.out.println(algoritmo.encriptar("Pipoco do trovão"));
    }
}

interface Algoritmo {
    String encriptar(String cadeiaCaracters);
}

class AES implements Algoritmo {

    @Override
    public String encriptar(String cadeiaCaracters) {
        String cifrado = null;
        try {
            cifrado = Base64.getEncoder().encodeToString(cadeiaCaracters.getBytes("UTF-8"));
            System.out.println("AES sendo usado " + cifrado);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return cifrado;
    }
}

class SHA1 implements Algoritmo {

    @Override
    public String encriptar(String cadeiaCaracters) {
        String cifrado = null;
        try {
            cifrado = Base64.getEncoder().encodeToString(cadeiaCaracters.getBytes("UTF-8"));
            System.out.println("SHA1 sendo usado " + cifrado);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return cifrado;
    }
}