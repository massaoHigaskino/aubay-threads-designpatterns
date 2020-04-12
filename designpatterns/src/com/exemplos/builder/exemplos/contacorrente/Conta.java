package com.exemplos.builder.exemplos.contacorrente;

import lombok.Builder;

import java.math.BigDecimal;

/*
    Objetivo: Aplique o pattern Builder e melhore a construção do objeto
 */

@Builder
public class Conta {

    private String numeroConta;
    private String agencia;
    private BigDecimal saldo;
    private Pessoa cliente;
    private TipoConta tipoConta;
    private ChequeEspecial chequeEspecial;
    private AtivoInativo situacao;

}

enum TipoConta {
    POUPANCA, CORRENTE
}

enum AtivoInativo {
    ATIVO, INATIVO
}

class ChequeEspecial {
    private BigDecimal chequeEspecial;
}

class Pessoa {
    private String nif;
}

class Empresa extends Pessoa {
    private String nomeEmpresa;

}

class PessoaSingular extends Pessoa{
    private String nome;
}

