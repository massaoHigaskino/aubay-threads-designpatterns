package com.designsall.alldesigntogether.repository;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

public class FilePatternsUtils {

    public static String getFile() throws IOException {
        InputStream resource = new ClassPathResource("static/test.txt").getInputStream();
        return null;
    }

}
