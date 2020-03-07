package threads.join;

/*
    Objetivo: 
*/

public class ExemploWaitNotify {
    public static void main(String[] args) throws InterruptedException {

        Somador somador = new Somador();
        somador.start();
        somador.join();
        synchronized (somador) {
            System.out.println("Aguardando o b completar...");

            System.out.println("Total é igual a: " + somador.total);
        }

    }
}

class Somador extends Thread {

    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 500; i++) {
                total += i;
            }
        }
    }
}