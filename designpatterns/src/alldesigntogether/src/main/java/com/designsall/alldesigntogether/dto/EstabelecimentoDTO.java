package com.designsall.alldesigntogether.dto;

import lombok.Getter;
import lombok.Setter;

public class EstabelecimentoDTO extends  TokenDto {

    @Getter
    @Setter
    private String descricao;

    @Getter
    @Setter
    private String responsavel;

}
