package com.designsall.alldesigntogether.controller;

import com.designsall.alldesigntogether.controller.template.GetEstabelecimentoHandler;
import com.designsall.alldesigntogether.controller.template.ListEstabelecimentoHandler;
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
    private GetEstabelecimentoHandler<EstabelecimentoDTO, Estabelecimento> getEstabelecimentoHandler;
    @Autowired
    private ListEstabelecimentoHandler<EstabelecimentoDTO, List<Estabelecimento>> listListEstabelecimentoHandler;

    @PostMapping("/estabelecimento/responsavel")
    public Estabelecimento getEstabelecimento(@RequestBody EstabelecimentoDTO estabelecimentoDTO) {
        return getEstabelecimentoHandler.runHandler(estabelecimentoDTO);
    }

    @GetMapping("/estabelecimentos")
    public List<Estabelecimento> getEstabelecimentos(@RequestBody EstabelecimentoDTO estabelecimentoDTO) {
        return listListEstabelecimentoHandler.runHandler(estabelecimentoDTO);
    }
}
