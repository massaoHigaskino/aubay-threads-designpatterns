package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.dto.EstabelecimentoDTO;
import com.designsall.alldesigntogether.dto.ProdutoDTO;
import com.designsall.alldesigntogether.entity.Estabelecimento;
import com.designsall.alldesigntogether.entity.Produto;
import com.designsall.alldesigntogether.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstabelecimentoHandler {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @PostMapping("/estabelecimento/responsavel")
    public Estabelecimento getEstabelecimento(@RequestBody EstabelecimentoDTO estabelecimentoDTO) {
        Estabelecimento estabelecimentos = estabelecimentoRepository.findByResponsavel(estabelecimentoDTO.getResponsavel());
        return estabelecimentos;
    }

    @GetMapping("/estabelecimentos")
    public List<Estabelecimento> getEstabelecimentos(@RequestBody EstabelecimentoDTO estabelecimentoDTO) {
        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
        return estabelecimentos;
    }
}
