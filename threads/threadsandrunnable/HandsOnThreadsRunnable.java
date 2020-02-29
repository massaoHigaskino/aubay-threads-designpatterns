package threads.threadsandrunnable;


/*
    start, run, sleep
*/

public class HandsOnThreadsRunnable {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa(); // Cria thread e coloca em estado NEW
        Tarefa2 tarefa2 = new Tarefa2();
        Thread t2 = new Thread(tarefa2); // A implementação do Runnable precisa ser passada para uma Thread

        tarefa.start(); // Executa a thread
        t2.start();
    }
}

class Tarefa2 implements Runnable {
    /**
     * Sempre dar override neste método
     */
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Executando Runnable: " + i);
        }
    }
}

class Tarefa extends Thread {

    /**
     * Sempre dar override neste método
     */
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Executando Thread: " + i);
        }
    }
}