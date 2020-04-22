package com.exemplos.facade.handson;

public class FacadeMain {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();

//        controlador.verificarEnergia();
//        controlador.verificarSituacaoDispositivos();
//        ...
//        Conhecimento excessivo do funcionamento interno da classe
//        Pode ser refatorado para chamar apenas um método...

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

    // O Facade da classe! Todos os métodos e a ordem correta das chamadas são definidas por um único método...
    // Entretanto, pode ser necessário quebrar as classes caso este método fique muito sobrecarregado.
    public void controlar() { // Fachada
        verificarEnergia();
        verificarStatusTemperatura();
        verificarStatusSom();
        verificarSituacaoDispositivos();
    }

}
