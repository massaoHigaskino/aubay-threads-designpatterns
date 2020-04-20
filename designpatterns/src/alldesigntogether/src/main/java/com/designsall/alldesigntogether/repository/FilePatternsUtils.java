package com.designsall.alldesigntogether.repository;

import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.nio.CharBuffer;

public class FilePatternsUtils {

    public static String getFile() throws IOException {
        StringBuilder read = new StringBuilder(10);
        try (InputStream resource = new ClassPathResource("static/test.txt").getInputStream()) {
            try (InputStreamReader inputStreamReader = new InputStreamReader(resource)) {
                try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        read.append(line).append('\n');
                    }
                }
            }
        }
        return read.toString();
    }

}
