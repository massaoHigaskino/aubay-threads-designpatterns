package com.designsall.alldesigntogether.repository;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FilePatternsUtils {

    public static String getFile() throws IOException {
        InputStream resource = new ClassPathResource("static/test.txt").getInputStream();
        StringBuilder arquivo = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arquivo.append(line).append("\n");
            }
        }
        return arquivo.toString();
    }

}
