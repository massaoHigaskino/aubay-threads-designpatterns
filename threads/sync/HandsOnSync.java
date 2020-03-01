package threads.sync;


/*
    synchronized, volatile, atomicity, collections, immutable
*/

public class HandsOnSync {
    public static void main(String[] args) {
    }
}

class Teste implements Runnable {

    private static Tarefa tarefa;

    public void run() {
        
    }

}

class Tarefa {
    public synchronized void execute() {
        System.out.println("Tarefa executada");
    }
}