package com.designsall.alldesigntogether.dto;

import java.util.function.Supplier;

public enum DTOType {

    ESTABELECIMENTO(EstabelecimentoDTO::new),
    INFORMACOES(InformacoesDTO::new),
    LOGIN(LoginDTO::new),
    PRODUTO(ProdutoDTO::new),
    TOKEN(TokenDto::new);

    private Supplier<TokenDto> tokenDtoSupplier;

    public TokenDto getInstance() {
        return tokenDtoSupplier.get();
    }

    DTOType(Supplier<TokenDto> tokenDtoSupplier) {
        this.tokenDtoSupplier = tokenDtoSupplier;
    }
}
