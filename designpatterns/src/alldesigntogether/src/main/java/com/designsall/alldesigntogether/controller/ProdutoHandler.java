package com.designsall.alldesigntogether.controller;

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
public class ProdutoHandler {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/produto/descricao")
    public List<Produto> getProduto(@RequestBody ProdutoDTO produtoDto) {
        List<Produto> produtos = produtoRepository.findByDescricaoContains(produtoDto.getDescricao());
        return produtos;
    }

    @GetMapping("/produtos")
    public List<Produto> produtos(@RequestBody ProdutoDTO produtoDto) {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }
}
