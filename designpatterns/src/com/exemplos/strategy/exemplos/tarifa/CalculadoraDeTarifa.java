package com.exemplos.strategy.exemplos.tarifa;

import java.util.concurrent.ThreadLocalRandom;



/*
    Objetivo: Refatore essa calculadora de tarifa para o pattern strategy
 */
public class CalculadoraDeTarifa {

    public static void main(String[] args) {
        CalculadoraDeTarifa tarifa = new CalculadoraDeTarifa();
        tarifa.calcularMelhorTarifa(new TransporteKapten());
    }

    public void calcularMelhorTarifa(Transporte transporte) {
        double valorTransporte = transporte.getValorTransporte();
        System.out.println("O transporte é " + transporte.getEscolhido() + " com o valor de "+valorTransporte);
    }
}

abstract class Transporte {
    private EmpresaTransporte escolhido;

    public EmpresaTransporte getEscolhido() {
        return escolhido;
    }

    public void setEscolhido(EmpresaTransporte escolhido) {
        this.escolhido = escolhido;
    }
    
    public String getNome() {
        return escolhido.toString();
    }
    
    abstract double getValorTransporte();
}

class TransporteDefault extends Transporte {
    public TransporteDefault() {
        setEscolhido(null);
    }

    @Override
    double getValorTransporte() {
        return Double.MAX_VALUE;
    }
}

class TransporteBolt extends Transporte {
    public TransporteBolt() {
        setEscolhido(EmpresaTransporte.BOLT);
    }

    @Override
    double getValorTransporte() {
        return ThreadLocalRandom.current().nextDouble(0, 1 + 1);
    }
}
class TransporteCabify extends Transporte {
    public TransporteCabify() {
        setEscolhido(EmpresaTransporte.CABIFY);
    }

    @Override
    double getValorTransporte() {
        return ThreadLocalRandom.current().nextDouble(0, 1 + 1);
    }
}
class TransporteKapten extends Transporte {
    public TransporteKapten() {
        setEscolhido(EmpresaTransporte.KAPTEN);
    }

    @Override
    double getValorTransporte() {
        return ThreadLocalRandom.current().nextDouble(0, 1 + 1);
    }
}
class TransporteUber extends Transporte {
    public TransporteUber() {
        setEscolhido(EmpresaTransporte.UBER);
    }

    @Override
    double getValorTransporte() {
        return ThreadLocalRandom.current().nextDouble(0, 1 + 1);
    }
}

enum EmpresaTransporte {
    UBER("Uber"),
    BOLT("Bolt"),
    KAPTEN("Kapten"),
    CABIFY("Cabify");

    private String nomeEmpresa;

    EmpresaTransporte(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String toString() {
        return nomeEmpresa;
    }
}