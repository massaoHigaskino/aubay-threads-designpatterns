package com.exemplos.strategy.exemplos.ordenacao;

import java.util.*;

/*
    Objetivo: A ordenação precisa de refatoração para um Strategy.
 */
public class Ordenador {

    public static final Map<String, Comparator<?>> COMPARATOR_MAP;
    public static final Comparator<?> DEFAULT_COMPARATOR = new DefaultComparator();

    static {
        COMPARATOR_MAP = new HashMap<>(3);
        COMPARATOR_MAP.put("ShellSort", new ShellSortComparator());
        COMPARATOR_MAP.put("BubbleSort", new BubbleSortComparator());
        COMPARATOR_MAP.put("QuickSort", new QuickSortComparator());
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 4, 2};
        List<Integer> list = Arrays.asList(arr);

        new Ordenador().ordenar(list, "QuickSort");
    }

    public void ordenar(Collection colecao, String tipoOrdenacao) {
        new ArrayList<>(colecao).sort(COMPARATOR_MAP.getOrDefault(tipoOrdenacao, DEFAULT_COMPARATOR));
    }
}

class DefaultComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        System.out.println("Executando Default");
        return 0;
    }
}

class ShellSortComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        System.out.println("Executando ShellSort");
        return 0;
    }
}
class BubbleSortComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        System.out.println("Executando BubbleSort");
        return 0;
    }
}
class QuickSortComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        System.out.println("Executando QuickSort");
        return 0;
    }
}