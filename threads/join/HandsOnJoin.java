package threads.join;

/*
*/

public class HandsOnJoin {
    public static void main(String[] args) throws InterruptedException {
        Join j1 = new Join("j1");
        Join j2 = new Join("j2");
        Join j3 = new Join("j3");

        Thread t1 = new Thread(j1);
        Thread t2 = new Thread(j2);
        Thread t3 = new Thread(j3);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        
    }
}

class Join implements Runnable {
    
    private String name;

    public Join(String name) {
        this.name = name;
    }   
    
    public void run() {
        System.out.println("Executando:  "+name);
    }
}
