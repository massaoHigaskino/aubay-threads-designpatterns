package com.exemplos.strategy.exemplos.compressao;

import java.util.Optional;

/*
    Objetivo: Utilize o pattern Strategy para remover essa quantidade de if's
 */
public class CompressaoArquivos {

    public static void main(String[] args) {
        CompressaoArquivos ca = new CompressaoArquivos();
        Compressao rar = new Rar();
        System.out.println(ca.comprimir(rar).get());

    }

    public Optional<String> comprimir(Compressao formato) {
        return formato.comprimir();
    }

}

class Zip implements Compressao {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir ZIP");
    }
}

class Rar implements Compressao {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir RAR");
    }
}

class Gzip implements Compressao {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir GZIP");
    }
}

interface Compressao {
    Optional<String> comprimir();
}

enum Formatos {
    ZIP, RAR, SEVENZIP, ISO, BZ2, GZ, GZIP, TAR, TARGZ, BASE64;
}
