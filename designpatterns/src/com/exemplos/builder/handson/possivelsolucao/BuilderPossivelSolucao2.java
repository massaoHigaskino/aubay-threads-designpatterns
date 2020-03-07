package com.exemplos.builder.handson.possivelsolucao;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BuilderPossivelSolucao2 {

    public static void main(String[] args) {
//        Transacao2 transacao2 = Transacao2.builder()
//                .dataTransacao(LocalDateTime.now())
//                .estabelecimento("Vendinha da Tia")
//                .localCompra("Saldanha")
//                .build();
    }

}

@Builder
class Transacao2 {

    private String metodoPagamento;
    private String numeroCartao;
    private String localCompra;
    private String estabelecimento;
    private LocalDateTime dataTransacao;
    private BigDecimal valor;


}
