package com.designsall.alldesigntogether.controller.template;

import com.designsall.alldesigntogether.dto.EstabelecimentoDTO;
import com.designsall.alldesigntogether.entity.Estabelecimento;
import com.designsall.alldesigntogether.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetEstabelecimentoHandler<InClazz extends EstabelecimentoDTO, OutClazz extends Estabelecimento> extends BaseHandler<InClazz, OutClazz> {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @Override
    public OutClazz executeBusiness(InClazz dto) {
        return (OutClazz) estabelecimentoRepository.findByResponsavel(dto.getResponsavel());
    }
}
