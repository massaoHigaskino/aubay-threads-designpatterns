package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.controller.template.GetProdutoHandler;
import com.designsall.alldesigntogether.controller.template.ListProdutoHandler;
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
    private GetProdutoHandler getProdutoHandler;
    @Autowired
    private ListProdutoHandler listListProdutoHandler;

    @PostMapping("/produto/descricao")
    public List<Produto> getProduto(@RequestBody ProdutoDTO produtoDto) {
        return getProdutoHandler.runHandler(produtoDto);
    }

    @GetMapping("/produtos")
    public List<Produto> produtos(@RequestBody ProdutoDTO produtoDto) {
        return listListProdutoHandler.runHandler(produtoDto);
    }
}
