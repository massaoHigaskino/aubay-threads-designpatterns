package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.dto.InformacoesDTO;

public class InformacoesSistema {

    private static final InformacoesDTO dto;

    static {
        dto = InformacoesDTO.builder()
                .fileEncoding(System.getProperty("file.encoding"))
                .javaHome(System.getProperty("java.home"))
                .javaRuntimeName(System.getProperty("java.runtime.name"))
                .javaVendor(System.getProperty("java.vendor"))
                .javaVersion(System.getProperty("java.version"))
                .osArch(System.getProperty("os.arch"))
                .osName(System.getProperty("os.name"))
                .osVersion(System.getProperty("os.version"))
                .build();
    }

    public static InformacoesDTO status() {
        return dto;
    }

}
