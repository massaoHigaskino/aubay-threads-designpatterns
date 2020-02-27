package threads.pool;

import java.util.concurrent.ExecutionException;

/*
    Uma somadora, agora, pense no futuro, obtenha a resposta assincronamente
*/

public class ExemploFuturo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Somadora somadora = new Somadora();
        
        Thread t1 = new Thread(somadora);
        t1.start();
        t1.join();
        System.out.println(somadora.getTotal());
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