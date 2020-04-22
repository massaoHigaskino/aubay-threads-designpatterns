package com.exemplos.builder.calendario;

import java.util.Calendar;

/*
    Objetivo: Utilize o Pattern Builder e construa um Calendar
 */
public class ExemploCalendario {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setWeekDate(2020, 03, Calendar.MONDAY);
        calendar = new Calendar.Builder()
                .set(Calendar.YEAR, 2020)
                .set(Calendar.WEEK_OF_YEAR, 3)
                .set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
                .build();
    }

}
