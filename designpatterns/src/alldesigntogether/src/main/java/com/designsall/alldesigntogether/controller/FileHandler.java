package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.repository.FilePatternsUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FileHandler {

    @GetMapping("/file")
    public String getFile() throws IOException {
        return FilePatternsUtils.getFile();
    }
}
