package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.dto.InformacoesDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusHandler {

    @GetMapping("/status")
    public InformacoesDTO status() {
        return new InformacoesSistema().status();
    }
}
