package threads.threadsandrunnable;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/*
    Objetivo: Crie uma thread e pare ela
*/
public class ExemploJavaStop {

    public static void main(String[] args) throws IOException {
        KillThread kill = new KillThread(1000);

        System.out.println("Está rodando: " + kill.isRunning());
        System.out.println("Está Morta: " + kill.isStopped());
        System.out.println("Está rodando: " + kill.isRunning());
        System.out.println("Está Morta: " + kill.isStopped());
    }

}

class KillThread implements Runnable {

    private Thread worker;
    private int interval = 100;
    private AtomicBoolean running = new AtomicBoolean(false);
    private AtomicBoolean stopped = new AtomicBoolean(true);

    public KillThread(int sleepInterval) {
        interval = sleepInterval;
    }

    public void start() {
        worker = new Thread(this);
        worker.start();
    }

    boolean isRunning() {
        return running.get();
    }

    boolean isStopped() {
        return stopped.get();
    }

    public void stop() {
        stopped = true;
        running = false;
    }

    public void run() {
        running.set(true);
        stopped.set(false);
        while (running.get()) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted, Failed to complete operation");
            }
            // faz algo
        }
        stopped.set(true);
    }
}