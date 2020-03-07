package com.exemplos.singleton.exemplos.propriedades;

import java.io.*;
import java.util.Properties;
/*
    Objetivo: Primeiro, troque o diretorio do arquivo.
    Segundo, use o pattern Singleton, perceba que o arquivo é carrega todas as vezes.
 */
public class Propriedades {

    public static void main(String[] args) throws IOException {
        ArquivoDePropriedades arquivo = new ArquivoDePropriedades();
        System.out.println(arquivo);
    }

}

class ArquivoDePropriedades {
    private String base;
    private String protocolo;
    private String username;
    private String passwd;

    public ArquivoDePropriedades() throws IOException {
        InputStream file = new FileInputStream(new File("/home/file.properties"));
        Properties props = new Properties();
        props.load(file);
        this.base = props.getProperty("base");
        this.protocolo = props.getProperty("protocolo");
        this.username = props.getProperty("username");
        this.passwd = props.getProperty("passwd");
    }

    public String getBase() {
        return base;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    @Override
    public String toString() {
        return "ArquivoDePropriedades{" +
                "base='" + base + '\'' +
                ", protocolo='" + protocolo + '\'' +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}