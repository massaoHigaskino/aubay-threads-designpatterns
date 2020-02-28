package threads.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
    Objetivo: A implementação não está segura, deixe-a atômica
*/

public class ExemploSomaProblematica {

    private static boolean init;

    public static void iniciar() {
        if (!init) {
            System.out.println("Inicializando");
            init = true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int c = 10;
        ExecutorService es = Executors.newFixedThreadPool(c);
        for (int i = 0; i < c; i++) {
            es.execute(ExemploSomaProblematica::iniciar);
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.MINUTES);
    }