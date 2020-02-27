package threads.join;

/*
*/

public class ExemploWaitNotify {
    public static void main(String[] args) {

        Somador somador = new Somador();
        somador.start();

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