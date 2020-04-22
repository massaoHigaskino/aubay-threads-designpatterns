package com.designsall.alldesigntogether.controller.template;

import com.designsall.alldesigntogether.dto.ProdutoDTO;
import com.designsall.alldesigntogether.entity.Produto;
import com.designsall.alldesigntogether.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetProdutoHandler extends BaseHandler<ProdutoDTO, List<Produto>> {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> executeBusiness(ProdutoDTO dto) {
        return produtoRepository.findByDescricaoContains(dto.getDescricao());
    }
}
