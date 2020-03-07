package com.exemplos.strategy.exemplos.compressao;

import java.util.Optional;

/*
    Objetivo: Utilize o pattern Strategy para remover essa quantidade de if's
 */
public class CompressaoArquivos {

    public static void main(String[] args) {
        CompressaoArquivos ca = new CompressaoArquivos();
        System.out.println(ca.comprimir(Formatos.BASE64).get());

    }

    public Optional<String> comprimir(Formatos formato) {
        if (formato.equals(Formatos.ZIP)) {
            return Optional.of("Comprimir ZIP");
        }
        if (formato.equals(Formatos.RAR)) {
            return Optional.of("Comprimir RAR");
        }
        if (formato.equals(Formatos.SEVENZIP)) {
            return Optional.of("Comprimir SEVENZIP");
        }
        if (formato.equals(Formatos.ISO)) {
            return Optional.of("Comprimir ISO");
        }
        if (formato.equals(Formatos.BZ2)) {
            return Optional.of("Comprimir BZ2");
        }
        if (formato.equals(Formatos.GZ)) {
            return Optional.of("Comprimir GZ");
        }
        if (formato.equals(Formatos.GZIP)) {
            return Optional.of("Comprimir GZIP");
        }
        if (formato.equals(Formatos.TARGZ)) {
            return Optional.of("Comprimir ZIP");
        }
        if (formato.equals(Formatos.TAR)) {
            return Optional.of("Comprimir ZIP");
        }
        if (formato.equals(Formatos.BASE64)) {
            return Optional.of("Comprimir ZIP");
        }
        return Optional.empty();
    }

}

enum Formatos {
    ZIP, RAR, SEVENZIP, ISO, BZ2, GZ, GZIP, TAR, TARGZ, BASE64;
}
