package threads.sync;

/*
    Objetivo: A implementação não está segura. Reescreva para que fique thread-safe
*/

public class ExemploSync1 {

    public static void main(String[] args) throws InterruptedException {
        Listinha lista = new Listinha();

        for(int i = 0; i<10; i++) {
            new Thread(new AddElements(lista, i)).start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }    

    }

}

class AddElements implements Runnable {

    private Listinha lista;
    private int threadNumber;

    public AddElements(Listinha lista, int numeroDoThread) {
        this.lista = lista;
        this.threadNumber = numeroDoThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lista.add("Thread " + threadNumber + " - " + i);
        }
    }
}

class Listinha {
    
    private String[] elements = new String[1000];
    private int index = 0;

    public synchronized void add(String elemento) {
        this.elements[index] = elemento;
        this.index++;
    }

    public int size() {
        return this.index;
    }

    public String get(int posicao) {
        return this.elements[posicao];
    }
}