package com.designsall.alldesigntogether.controller.template;

import com.designsall.alldesigntogether.dto.EstabelecimentoDTO;
import com.designsall.alldesigntogether.entity.Estabelecimento;
import com.designsall.alldesigntogether.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetEstabelecimentoHandler extends BaseHandler<EstabelecimentoDTO, Estabelecimento> {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @Override
    public Estabelecimento executeBusiness(EstabelecimentoDTO dto) {
        return estabelecimentoRepository.findByResponsavel(dto.getResponsavel());
    }
}
