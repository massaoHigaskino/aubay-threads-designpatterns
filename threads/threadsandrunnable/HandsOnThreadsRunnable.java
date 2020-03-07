package threads.threadsandrunnable;


/*
    start, run, sleep
*/

public class HandsOnThreadsRunnable {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.start();

        Tarefa2 tarefa2 = new Tarefa2();
        Thread t1 = new Thread(tarefa2);
        t1.start();

    }
}

class Tarefa2 implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            
        }
    }
}

class Tarefa extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Executando");
        }
    }

}