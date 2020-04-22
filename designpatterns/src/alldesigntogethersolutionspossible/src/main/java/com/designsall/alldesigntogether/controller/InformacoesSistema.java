package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.dto.InformacoesDTO;

public class InformacoesSistema {

    private static InformacoesSistema informacoesSistema;

    private InformacoesSistema(){}

    public static InformacoesSistema getInstance() {
        if(informacoesSistema == null) {
            informacoesSistema = new InformacoesSistema();
        }
        return informacoesSistema;
    }

    public InformacoesDTO status() {

        InformacoesDTO dto = new InformacoesDTO();
        dto.setFileEncoding(System.getProperty("file.encoding"));
        dto.setJavaHome(System.getProperty("java.home"));
        dto.setJavaRuntimeName(System.getProperty("java.runtime.name"));
        dto.setJavaVendor(System.getProperty("java.vendor"));
        dto.setJavaVersion(System.getProperty("java.version"));
        dto.setOsArch(System.getProperty("os.arch"));
        dto.setOsName(System.getProperty("os.name"));
        dto.setOsVersion(System.getProperty("os.version"));

        return dto;
    }

}
