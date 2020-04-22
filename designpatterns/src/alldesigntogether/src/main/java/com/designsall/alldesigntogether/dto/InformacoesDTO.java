package com.designsall.alldesigntogether.dto;

import lombok.Builder;

@Builder
public class InformacoesDTO {

    private String fileEncoding;

    private String javaHome;

    private String javaRuntimeName;

    private String javaVendor;

    private String javaVersion;

    private String osArch;

    private String osName;

    private String osVersion;

    public String getFileEncoding() {
        return fileEncoding;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getJavaRuntimeName() {
        return javaRuntimeName;
    }

    public String getJavaVendor() {
        return javaVendor;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public String getOsArch() {
        return osArch;
    }

    public String getOsName() {
        return osName;
    }

    public String getOsVersion() {
        return osVersion;
    }
}
