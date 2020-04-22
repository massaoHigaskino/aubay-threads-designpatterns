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
public class EstabelecimentoHandler extends BaseHandler {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @PostMapping("/estabelecimento/responsavel")
    public Estabelecimento getEstabelecimento(@RequestBody EstabelecimentoDTO estabelecimentoDTO) {
        if(!validarToken(estabelecimentoDTO.getToken())) {
            throw  new IllegalArgumentException("Quero meu token");
        }
        Estabelecimento estabelecimentos = estabelecimentoRepository.findByResponsavel(estabelecimentoDTO.getResponsavel());
        return estabelecimentos;
    }

    @GetMapping("/estabelecimentos")
    public List<Estabelecimento> getEstabelecimentos(@RequestBody EstabelecimentoDTO estabelecimentoDTO) {
        if(!validarToken(estabelecimentoDTO.getToken())) {
            throw  new IllegalArgumentException("Quero meu token");
        }
        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
        return estabelecimentos;
    }
}
