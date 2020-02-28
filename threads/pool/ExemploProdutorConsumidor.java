package threads.pool;

import java.util.LinkedList;
import java.util.List;

/*
    Objetiivo: Reescreva para que o código fique thread-safe
*/

public class ExemploProdutorConsumidor {
    public static void main(String[] args) {
        List<Integer> queue = new LinkedList<>();

        new Thread(new Produtor(queue)).start();
        new Thread(new Consumidor(queue)).start();
    }
}

class Produtor implements Runnable {

    private final List<Integer> queue;

    @Override
    public void run() {

        try {
            process();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    private void process() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            System.out.println("[Produtor] Put : " + i);
            queue.add(i);
            System.out.println("[Produtor] Queue remainingCapacity : " + queue.size());
            Thread.sleep(100);
        }

    }

    public Produtor(List<Integer> queue) {
        this.queue = queue;
    }
}

class Consumidor implements Runnable {

    private final List<Integer> queue;

    @Override
    public void run() {

        try {
            while (true) {
                Integer take = queue.get(0);
                process(take);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    private void process(Integer take) throws InterruptedException {
        System.out.println("[Consumer] Take : " + take);
        Thread.sleep(500);
    }

    public Consumidor(List<Integer> queue) {
        this.queue = queue;
    }
}