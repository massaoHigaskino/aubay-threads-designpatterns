package com.designsall.alldesigntogether.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class InformacoesDTO {

    @Getter
    @Setter
    private String fileEncoding;

    @Getter
    @Setter
    private String javaHome;

    @Getter
    @Setter
    private String javaRuntimeName;

    @Getter
    @Setter
    private String javaVendor;

    @Getter
    @Setter
    private String javaVersion;

    @Getter
    @Setter
    private String osArch;

    @Getter
    @Setter
    private String osName;

    @Getter
    @Setter
    private String osVersion;

}
