package com.exemplos.factorymethod.exemplos.calendario;

import java.util.Calendar;
/*
    Objetivo: Explore o FactoryMethod na API de Calendar
 */
public class CalendarioExemplo {
    public static void main(String[] args) {
        System.out.println(Calendario.getInstance());
    }
}

class Calendario {
    public static Calendar getInstance() {
        return Calendar.getInstance();
    }
}
