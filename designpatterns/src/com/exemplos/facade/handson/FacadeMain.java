package com.exemplos.facade.handson;

public class FacadeMain {
    public static void main(String[] args) {

    }
}

class Controlador {

    public void verificarEnergia() {
        System.out.println("Verificando energia");
    }

    public void verificarStatusTemperatura() {
        System.out.println("Verificando o status da temperatura");
    }

    public void verificarStatusSom() {
        System.out.println("Verificar status do som");
    }

    public void verificarSituacaoDispositivos() {
        System.out.println("Verificar situação dispositivos");
    }

}
