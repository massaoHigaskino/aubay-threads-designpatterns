package threads.learn;

public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
        this.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}