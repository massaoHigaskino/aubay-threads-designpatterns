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

        tarefa2.setPre(thread1);
        tarefa3.setPre(thread2);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Tarefa implements Runnable {

    private Thread pre;

    @Override
    public void run() {

        if (pre != null) {
            try {
                pre.join();
            } catch (InterruptedException ex) {
                System.out.println("Ocorreu um erro na pre.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " Iniciada");
        System.out.println(Thread.currentThread().getName() + " Finalizada");
    }

    public void setPre(Thread pre) {
        this.pre = pre;
    }

}