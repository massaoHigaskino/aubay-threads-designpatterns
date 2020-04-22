package com.exemplos.decorator.exemplos.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    Objetivo: Realize a leitura de um arquivo utilizando a BufferedInputStream e use o padrão Decorator
 */
public class Arquivo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("FileName"));
        bis.read(new byte[0]);
    }
}
