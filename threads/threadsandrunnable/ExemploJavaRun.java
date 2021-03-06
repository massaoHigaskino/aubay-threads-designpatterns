package threads.threadsandrunnable;

/*
    Objetivo: Identifique a inconsitência e apresente uma possível solução
*/
public class ExemploJavaRun {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Executing the thread");
        };

        Thread t1 = new Thread(task);
        
        t1.start();

    }

}