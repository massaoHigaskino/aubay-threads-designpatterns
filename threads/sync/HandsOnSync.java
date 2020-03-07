package threads.sync;

/*
    synchronized, volatile, atomicity, collections, immutable
*/

public class HandsOnSync {
    public static void main(String[] args) {
    }
}

class Teste implements Runnable {

    private Tarefa tarefa;

    @Override
    public void run() {
        synchronized(tarefa) { // por bloco de código

        }

    }
}

class Tarefa {
    public synchronized void execute() { // por método
        System.out.println("Execute");
    }
}