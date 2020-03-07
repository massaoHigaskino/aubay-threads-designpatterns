package com.exemplos.strategy.exemplos.compressao;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

/*
    Objetivo: Utilize o pattern Strategy para remover essa quantidade de if's
 */
public class CompressaoArquivos {

    public static final Map<Formatos, ICompressionFormat> COMPRESSION_FORMAT_MAP;

    static {
        COMPRESSION_FORMAT_MAP = new EnumMap<>(Formatos.class);
        COMPRESSION_FORMAT_MAP.put(Formatos.ZIP, new CompressionFormatZIPImpl());
        COMPRESSION_FORMAT_MAP.put(Formatos.RAR, new CompressionFormatRARImpl());
        COMPRESSION_FORMAT_MAP.put(Formatos.SEVENZIP, new CompressionFormatSEVENZIPImpl());
        COMPRESSION_FORMAT_MAP.put(Formatos.ISO, new CompressionFormatISOImpl());
        COMPRESSION_FORMAT_MAP.put(Formatos.BZ2, new CompressionFormatBZ2Impl());
        COMPRESSION_FORMAT_MAP.put(Formatos.GZ, new CompressionFormatGZImpl());
        COMPRESSION_FORMAT_MAP.put(Formatos.GZIP, new CompressionFormatGZIPImpl());
        COMPRESSION_FORMAT_MAP.put(Formatos.TAR, new CompressionFormatTARImpl());
        COMPRESSION_FORMAT_MAP.put(Formatos.TARGZ, new CompressionFormatTARGZImpl());
        COMPRESSION_FORMAT_MAP.put(Formatos.BASE64, new CompressionFormatBASE64Impl());
    }

    public static void main(String[] args) {
        CompressaoArquivos ca = new CompressaoArquivos();
        System.out.println(ca.comprimir(Formatos.BASE64).get());
    }

    public Optional<String> comprimir(Formatos formato) {
        return COMPRESSION_FORMAT_MAP.get(formato).comprimir();
    }

}

enum Formatos {
    ZIP, RAR, SEVENZIP, ISO, BZ2, GZ, GZIP, TAR, TARGZ, BASE64;
}

interface ICompressionFormat {
    Optional<String> comprimir();
}

class CompressionFormatZIPImpl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir ZIP");
    }
}

class CompressionFormatRARImpl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir RAR");
    }
}

class CompressionFormatSEVENZIPImpl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir SEVENZIP");
    }
}

class CompressionFormatISOImpl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir ISO");
    }
}

class CompressionFormatBZ2Impl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir BZ2");
    }
}

class CompressionFormatGZImpl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir GZ");
    }
}

class CompressionFormatGZIPImpl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir GZIP");
    }
}

class CompressionFormatTARImpl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir TAR");
    }
}

class CompressionFormatTARGZImpl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir TARGZ");
    }
}

class CompressionFormatBASE64Impl implements ICompressionFormat {

    @Override
    public Optional<String> comprimir() {
        return Optional.of("Comprimir BASE64");
    }
}
