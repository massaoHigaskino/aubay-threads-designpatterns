package threads.threadsandrunnable;

/*
    Objetivo: há algo errado no reino da babilônia
*/
public class ExampleJavaRun {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Executing the thread");
        };

        Thread t1 = new Thread(task);
        
        t1.run();

    }

}