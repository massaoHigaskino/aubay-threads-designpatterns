package com.exemplos.facade.exemplos.refund;

/*
    Objetivo: utilize o pattern facade para refatorar a classe
 */
public class RefundFacade {

    public static void main(String[] args) {
        Refund refund = new Refund();
        refund.doRefund();
    }

}

class Refund {

    public void doRefund() {
        InicioDevolucao inicioDevolucao = new InicioDevolucao();
        inicioDevolucao.registrarInicioRefund();

        Log log = new Log();
        log.registrarLog();

        Credenciais credenciais = new Credenciais();
        if(credenciais.validarCredenciais()) {
            Utilizador utilizador = new Utilizador();
            utilizador.obtendoUtilizador();

            TerminalDevolucao terminalDevolucao = new TerminalDevolucao();
            terminalDevolucao.obtendoTerminalDevolucao();

            Transacao transacao = new Transacao();
            transacao.obtendoTransacao();

            Devolucao devolucao = new Devolucao();
            devolucao.realizarDevolucao();
        }

        FimDevolucao fimDevolucao = new FimDevolucao();
        fimDevolucao.registrarFimRefund();

        log.registrarLog();
    }

}

class Devolucao {
    public Object realizarDevolucao() {
        System.out.println("realizando devolucao");
        return new Object();
    }
}

class FimDevolucao {
    public void registrarFimRefund() {
        System.out.println("registrando fim refund");
    }

}

class InicioDevolucao {
    public void registrarInicioRefund() {
        System.out.println("registrando inicio refund");
    }
}

class TerminalDevolucao {
    public Object obtendoTerminalDevolucao() {
        System.out.println("obtendo terminal devolução");
        return new Object();
    }
}

class Transacao {
    public Object obtendoTransacao() {
        System.out.println("obtendo transacao");
        return new Object();
    }
}

class Utilizador {
    public Object obtendoUtilizador() {
        System.out.println("obtendo utilizador");
        return new Object();
    }
}

class Log {
    public void registrarLog() {
        System.out.println("registrando log");
    }
}

class Credenciais {
    public boolean validarCredenciais() {
        System.out.println("validando credenciais");
        return true;
    }
}