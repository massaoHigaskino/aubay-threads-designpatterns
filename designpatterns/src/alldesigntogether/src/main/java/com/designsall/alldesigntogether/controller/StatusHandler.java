package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.dto.InformacoesDTO;
import com.designsall.alldesigntogether.dto.ProdutoDTO;
import com.designsall.alldesigntogether.entity.Produto;
import com.designsall.alldesigntogether.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatusHandler {


    @GetMapping("/status")
    public InformacoesDTO status() {
        return new InformacoesSistema().status();
    }
}
