package com.designsall.alldesigntogether.controller.template;

import com.designsall.alldesigntogether.dto.EstabelecimentoDTO;
import com.designsall.alldesigntogether.entity.Estabelecimento;
import com.designsall.alldesigntogether.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListEstabelecimentoHandler extends BaseHandler<EstabelecimentoDTO, List<Estabelecimento>> {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @Override
    public List<Estabelecimento> executeBusiness(EstabelecimentoDTO dto) {
        return estabelecimentoRepository.findAll();
    }
}
