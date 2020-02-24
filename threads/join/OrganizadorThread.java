package threads.join;


/*
    Objetivo: Criar 3 threads, onde a mesma receba qual thread ela deve aguardar terminar
*/

public class OrganizadorThread {
    public static void main(String[] args) {

        Tarefa tarefa1 = new Tarefa();
        Tarefa tarefa2 = new Tarefa();
        Tarefa tarefa3 = new Tarefa();

        final Thread thread1 = new Thread(tarefa1, "Thread - 1");
        final Thread thread2 = new Thread(tarefa2, "Thread - 2");
        final Thread thread3 = new Thread(tarefa3, "Thread - 3");

    }
}

class Tarefa implements Runnable {
    

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Iniciada");


        System.out.println(Thread.currentThread().getName() + " Finalizada");
    }


}