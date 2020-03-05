package com.exemplos.builder.calendario;

import java.util.Calendar;

/*
    Objetivo: Utilize o Pattern Builder e construa um Calendar
 */
public class ExemploCalendario {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setWeekDate(2020, 03, Calendar.MONDAY);
    }

}
