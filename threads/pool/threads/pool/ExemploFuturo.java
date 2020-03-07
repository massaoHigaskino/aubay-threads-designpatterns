package threads.pool;

import java.util.concurrent.*;

/*
    Reescreva o código que assincronamente, obtenha-se o retorno
*/

public class ExemploFuturo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Somadora somadora = new Somadora();
        Somadora2 somadora2 = new Somadora2();

        ExecutorService es = Executors.newFixedThreadPool(5);
        es.submit(somadora);
        es.submit(somadora2);
        Future resultado = es.submit(somadora2);


        es.shutdown();

        System.out.println(resultado.get());
        System.out.println(somadora.getTotal());
    }
}

class Somadora2 implements Callable {

    @Override
    public Integer call() throws Exception {
        int total = 0;
        for (int i = 0; i < 10000; i++) {
            total += i;
        }
        return total;
    }
}

class Somadora implements Runnable {

    private int total = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            total += i;
        }
    }

    public int getTotal() {
        return total;
    }

}