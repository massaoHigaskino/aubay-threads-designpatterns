package com.exemplos.builder.exemplos.contacorrente;

import java.math.BigDecimal;

/*
    Objetivo: Aplique o pattern Builder e melhore a construção do objeto
 */

public class Conta {

    private String numeroConta;
    private String agencia;
    private BigDecimal saldo;
    private Pessoa cliente;
    private TipoConta tipoConta;
    private ChequeEspecial chequeEspecial;
    private AtivoInativo situacao;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public ChequeEspecial getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(ChequeEspecial chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public AtivoInativo getSituacao() {
        return situacao;
    }

    public void setSituacao(AtivoInativo situacao) {
        this.situacao = situacao;
    }

    public static class Builder {
        private String numeroConta;
        private String agencia;
        private BigDecimal saldo;
        private Pessoa cliente;
        private TipoConta tipoConta;
        private ChequeEspecial chequeEspecial;
        private AtivoInativo situacao;
        
        public Builder comNumeroConta(String numeroConta) {
            this.numeroConta = numeroConta;
            return this;
        }
        
        public Builder comAgencia(String agencia) {
            this.agencia = agencia;
            return this;
        }

        public Builder comSaldo(BigDecimal saldo) {
            this.saldo = saldo;
            return this;
        }

        public Builder comCliente(Pessoa cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder comTipoConta(TipoConta tipoConta) {
            this.tipoConta = tipoConta;
            return this;
        }

        public Builder comChequeEspecial(ChequeEspecial chequeEspecial) {
            this.chequeEspecial = chequeEspecial;
            return this;
        }

        public Builder comSituacao(AtivoInativo situacao) {
            this.situacao = situacao;
            return this;
        }

        public Conta build() {
            Conta conta = new Conta();
            conta.setNumeroConta(numeroConta);
            conta.setAgencia(agencia);
            conta.setSaldo(saldo);
            conta.setCliente(cliente);
            conta.setTipoConta(tipoConta);
            conta.setChequeEspecial(chequeEspecial);
            conta.setSituacao(situacao);
            return conta;
        }
    }

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

