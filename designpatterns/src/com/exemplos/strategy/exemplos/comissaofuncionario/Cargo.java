package com.exemplos.strategy.exemplos.comissaofuncionario;

import java.math.BigDecimal;

public interface Cargo {
    BigDecimal calcularComissao(BigDecimal totalCompra);
}
