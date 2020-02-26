package threads.deadlock;

/*
    
*/

public class ExampleDesenharPintar {

    public static Object desenho = new Object();
    public static Object pintura = new Object();

    public static void main(String[] args) {
        Desenhar desenhar = new Desenhar(desenho, pintura);
        Pintar pintar = new Pintar(desenho, pintura);

        desenhar.start();
        pintar.start();


    }


}

class Desenhar extends Thread {

    private Object desenho;
    private Object pintura;

    public Desenhar(Object desenho, Object pintura) {
        this.desenho = desenho;
        this.pintura = pintura;
    }

    @Override
    public void run() {
        synchronized (desenho) {
            System.out.println("Thread 1: Vou desenhar...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 1: Esperando para pintar...");

            synchronized (pintura) {
                System.out.println("Thread 1: Vou pintar...");
            }
        }
    }
}

class Pintar extends Thread {

    private Object desenho;
    private Object pintura;

    public Pintar(Object desenho, Object pintura) {
        this.desenho = desenho;
        this.pintura = pintura;
    }

    @Override
    public void run() {
        synchronized (pintura) {
            System.out.println("Thread 1: Vou pintar...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 1: Esperando para desenhar...");

            synchronized (desenho) {
                System.out.println("Thread 1: Vou desenhar...");
            }
        }
    }
}