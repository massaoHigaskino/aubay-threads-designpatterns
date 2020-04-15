package com.exemplos.facade.handson;

public class FacadeMain {
    public static void main(String[] args) {

        Controlador controlador = new Controlador();
        controlador.controlar();

    }
}

class Controlador {

    private void verificarEnergia() {
        System.out.println("Verificando energia");
    }

    private void verificarStatusTemperatura() {
        System.out.println("Verificando o status da temperatura");
    }

    private void verificarStatusSom() {
        System.out.println("Verificar status do som");
    }

    private void verificarSituacaoDispositivos() {
        System.out.println("Verificar situação dispositivos");
    }

    public void controlar() {
      verificarEnergia();
      verificarSituacaoDispositivos();
      verificarStatusSom();
      verificarSituacaoDispositivos();
    }

}
