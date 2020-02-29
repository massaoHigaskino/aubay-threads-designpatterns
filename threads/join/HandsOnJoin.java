package threads.join;

/*
*/

public class HandsOnJoin {
    public static void main(String[] args) {
        Thread[] tJoins = new Thread[5];

        for(int i = 0; i < tJoins.length; i++) {
            tJoins[i] = new Thread(new Join("j"+i));
        }

        for(int i = 0; i < tJoins.length; i++) {
            tJoins[i].start();

            tJoins[i].join(); //Garante que as threds sempre sejam executados na mesma ordem
        }

    }
}

class Join implements Runnable {

    private String name;

    public Join(String name) {
        this.name = name;
    }

    @Override
    public void run() {
System.out.println("Executando: " + name);
    }
}