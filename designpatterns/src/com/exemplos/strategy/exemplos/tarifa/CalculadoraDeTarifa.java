package com.exemplos.strategy.exemplos.tarifa;

import java.util.concurrent.ThreadLocalRandom;



/*
    Objetivo: Refatore essa calculadora de tarifa para o pattern strategy
 */
public class CalculadoraDeTarifa {

    public static void main(String[] args) {
        Transporte transporte = new Transporte();
        transporte.setEscolhido(new Transporte().KAPTEN);
        CalculadoraDeTarifa tarifa = new CalculadoraDeTarifa();
        tarifa.calcularMelhorTarifa(transporte);
    }

    public void calcularMelhorTarifa(Transporte transporte) {
        double valorTransporte = 0.0;
        if (new Transporte().BOLT.equals(transporte.getEscolhido())) {
            valorTransporte = ThreadLocalRandom.current().nextDouble(0, 1 + 1);
        } else if (new Transporte().CABIFY.equals(transporte.getEscolhido())) {
            valorTransporte = ThreadLocalRandom.current().nextDouble(0, 1 + 1);
        } else if (new Transporte().KAPTEN.equals(transporte.getEscolhido())) {
            valorTransporte = ThreadLocalRandom.current().nextDouble(0, 1 + 1);
        } else if (new Transporte().UBER.equals(transporte.getEscolhido())) {
            valorTransporte = ThreadLocalRandom.current().nextDouble(0, 1 + 1);
        }
        System.out.println("O transporte é " + transporte.getEscolhido() + " com o valor de "+valorTransporte);
    }


}

class Transporte {
    public final String UBER = "Uber";
    public final String BOLT = "Bolt";
    public final String KAPTEN = "Kapten";
    public final String CABIFY = "Cabify";

    private String escolhido;

    public String getEscolhido() {
        return escolhido;
    }

    public void setEscolhido(String escolhido) {
        this.escolhido = escolhido;
    }
}
