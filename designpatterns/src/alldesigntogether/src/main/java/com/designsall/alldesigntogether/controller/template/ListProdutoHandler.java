package com.designsall.alldesigntogether.controller.template;

import com.designsall.alldesigntogether.dto.ProdutoDTO;
import com.designsall.alldesigntogether.entity.Produto;
import com.designsall.alldesigntogether.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListProdutoHandler<InClazz extends ProdutoDTO, OutClazz extends List<Produto>> extends BaseHandler<InClazz, OutClazz> {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public OutClazz executeBusiness(InClazz dto) {
        return (OutClazz) produtoRepository.findAll();
    }
}
