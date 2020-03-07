package threads.join;

/*
    Objetivo: Criar 3 threads, onde a mesma receba qual thread ela deve aguardar terminar
*/

public class OrganizadorThread {
    public static void main(String[] args) {

        Tarefa tarefa1 = new Tarefa();
        Tarefa tarefa2 = new Tarefa();
        Tarefa tarefa3 = new Tarefa();

        final ThreadTarefa thread1 = new ThreadTarefa(tarefa1, "Tarefa - 1");
        final ThreadTarefa thread2 = new ThreadTarefa(tarefa2, "Tarefa - 2");
        final ThreadTarefa thread3 = new ThreadTarefa(tarefa3, "Tarefa - 3");

        thread1.setBlockingThread(null);
        thread2.setBlockingThread(thread1);
        thread3.setBlockingThread(thread2);

        thread3.start();
        thread2.start();
        thread1.start();

    }
}

class ThreadTarefa extends Thread {
    private Thread blockingThread;

    public ThreadTarefa(Runnable r, Thread blockingThread) {
        super(r);
        this.blockingThread = blockingThread;
    }

    public ThreadTarefa(Runnable r, String s) {
        super(r, s);
    }

    public ThreadTarefa(Runnable r) {
        super(r);
    }

    public void setBlockingThread(Thread blockingThread) {
        this.blockingThread = blockingThread;
    }

    @Override
    public void run() {
        if (blockingThread != null)
            try {
                blockingThread.join();
            } catch (InterruptedException e) {

            }
        super.run();
    }
}

class Tarefa implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Iniciada");

        System.out.println(Thread.currentThread().getName() + " Finalizada");
    }

}